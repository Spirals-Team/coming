package fr.inria.coming.core.entities.output;

import fr.inria.coming.changeminer.entity.FinalResult;
import fr.inria.coming.core.entities.RevisionResult;
import fr.inria.coming.core.entities.interfaces.IOutput;

/**
 * Null output
 * 
 * @author Matias Martinez
 *
 */
public class NullOutput implements IOutput {

	@Override
	public void generateFinalOutput(FinalResult finalResult) {

	}

	@Override
	public void generateRevisionOutput(RevisionResult resultAllAnalyzed) {

	}

}
