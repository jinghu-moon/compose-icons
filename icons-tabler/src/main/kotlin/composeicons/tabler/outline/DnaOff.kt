package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DnaOff: ImageVector
    get() {
        if (_dnaOff != null) return _dnaOff!!
        _dnaOff = tablerOutlineIcon(
            name = "DnaOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 12c.011-1.063-.412-2.085-1.172-2.828C14.076 8.424 13.06 8.003 12 8M9.172 9.172C8.132 10.176 7.715 11.664 8.081 13.062c.366 1.399 1.458 2.491 2.857 2.857 1.399 .366 2.886-.051 3.89-1.091")
            addPathData("M9.172 20.485c1.562-1.562 1.562-4.095 0-5.657-1.562-1.562-4.095-1.562-5.657 0")
            addPathData("M14.828 3.515c-1.562 1.562-1.562 4.095 0 5.657 1.562 1.562 4.095 1.562 5.657 0")
            addPathData("M3 3 21 21")
        }
        return _dnaOff!!
    }

private var _dnaOff: ImageVector? = null
