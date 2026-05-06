package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BrainCircuit: ImageVector
    get() {
        if (_brainCircuit != null) return _brainCircuit!!
        _brainCircuit = lucideOutlineIcon(
            name = "BrainCircuit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 5C12.003 3.911 11.416 2.906 10.466 2.374 9.516 1.842 8.353 1.866 7.426 2.437 6.499 3.009 5.954 4.037 6.003 5.125 4.812 5.431 3.828 6.268 3.335 7.395c-.493 1.127-.441 2.417 .142 3.5-1.027 .834-1.575 2.123-1.464 3.441 .111 1.318 .867 2.497 2.02 3.147-.191 1.478 .455 2.939 1.677 3.792 1.222 .853 2.816 .957 4.138 .268C11.169 20.856 11.998 19.49 12 18Z")
            addPathData("M9 13c1.717-.604 2.901-2.183 3-4")
            addPathData("M6.003 5.125c.02 .484 .156 .955 .398 1.375")
            addPathData("M3.477 10.896c.183-.149 .379-.282 .585-.396")
            addPathData("M6 18c-.689 0-1.367-.177-1.967-.516")
            addPathData("M12 13h4")
            addPathData("M12 18h6c1.105 0 2 .895 2 2v1")
            addPathData("M12 8h8")
            addPathData("M16 8v-3c0-1.105 .895-2 2-2")
            addPathData("M16.5 13c0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5 .276 0 .5 .224 .5 .5Z")
            addPathData("M18.5 3c0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5 .276 0 .5 .224 .5 .5Z")
            addPathData("M20.5 21c0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5 .276 0 .5 .224 .5 .5Z")
            addPathData("M20.5 8c0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5 .276 0 .5 .224 .5 .5Z")
        }
        return _brainCircuit!!
    }

private var _brainCircuit: ImageVector? = null
