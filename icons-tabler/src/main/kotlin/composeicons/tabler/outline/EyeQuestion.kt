package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EyeQuestion: ImageVector
    get() {
        if (_eyeQuestion != null) return _eyeQuestion!!
        _eyeQuestion = tablerOutlineIcon(
            name = "EyeQuestion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M14.071 17.764c-.679 .159-1.374 .238-2.071 .236C8.4 18 5.4 16 3 12 5.4 8 8.4 6 12 6c3.346 0 6.173 1.727 8.482 5.182")
            addPathData("M19 22v.01")
            addPathData("M19 19c.923-.003 1.724-.636 1.941-1.532 .217-.897-.207-1.826-1.027-2.25-.819-.42-1.819-.219-2.414 .483")
        }
        return _eyeQuestion!!
    }

private var _eyeQuestion: ImageVector? = null
