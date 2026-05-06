package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowMergeAltRight: ImageVector
    get() {
        if (_arrowMergeAltRight != null) return _arrowMergeAltRight!!
        _arrowMergeAltRight = tablerOutlineIcon(
            name = "ArrowMergeAltRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 7 12 3 8 7")
            addPathData("M6 21v.01")
            addPathData("M6 18.01v.01")
            addPathData("M7 15.02v.01")
            addPathData("M10 13.03v.01")
            addPathData("M12 3v5.394c-0 2.253 1.126 4.356 3 5.606 1.874 1.25 3 3.353 3 5.606v1.394")
        }
        return _arrowMergeAltRight!!
    }

private var _arrowMergeAltRight: ImageVector? = null
