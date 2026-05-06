package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquircleDashed: ImageVector
    get() {
        if (_squircleDashed != null) return _squircleDashed!!
        _squircleDashed = lucideOutlineIcon(
            name = "SquircleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.77 3.043c-1.179-.061-2.361-.061-3.54 0")
            addPathData("M13.771 20.956c-1.179 .064-2.361 .064-3.541 .001")
            addPathData("M20.18 17.74c-.51 1.15-1.29 1.93-2.439 2.44")
            addPathData("M20.18 6.259C19.67 5.111 18.889 4.33 17.74 3.821")
            addPathData("M20.957 10.23c.063 1.179 .063 2.361 0 3.54")
            addPathData("M3.043 10.23c-.061 1.18-.061 2.361 .001 3.541")
            addPathData("M6.26 20.179C5.11 19.671 4.33 18.889 3.82 17.741")
            addPathData("M6.26 3.82C5.111 4.33 4.33 5.111 3.82 6.26")
        }
        return _squircleDashed!!
    }

private var _squircleDashed: ImageVector? = null
