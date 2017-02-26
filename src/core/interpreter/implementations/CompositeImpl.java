package core.interpreter.implementations;

import java.io.PrintStream;

import core.interpreter.interfaces.Composite;
import core.interpreter.interfaces.Factor;

public class CompositeImpl implements Composite {

	private Factor f1;
	private Type t;
	private Factor f2;

	public CompositeImpl(Factor f1, Type t, Factor f2) {
		this.f1 = f1;
		this.t = t;
		this.f2 = f2;
	}

	@Override
	public Boolean evaluate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void print(int indent, PrintStream printer) {
		printer.print("(");
		this.f1.print(indent, printer);

		String comp = "";

		switch (this.t) {
		case NOT_EQUAL:
			comp = " != ";
			break;
		case EQUAL:
			comp = " == ";
			break;
		case GREATER:
			comp = " > ";
			break;
		case LESS:
			comp = " < ";
			break;
		case GREATER_OR_EQUAL:
			comp = " >= ";
			break;
		case LESS_OR_EQUAL:
			comp = " <= ";
			break;
		default:
			throw new RuntimeException("invalid type");
		}

		printer.print(comp);

		this.f2.print(indent, printer);
		printer.print(")");
	}

}
