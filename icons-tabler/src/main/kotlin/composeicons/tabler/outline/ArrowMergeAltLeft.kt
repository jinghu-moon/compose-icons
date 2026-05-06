package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowMergeAltLeft: ImageVector
    get() {
        if (_arrowMergeAltLeft != null) return _arrowMergeAltLeft!!
        _arrowMergeAltLeft = tablerOutlineIcon(
            name = "ArrowMergeAltLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 7 12 3l4 4")
            addPathData("M18 21v.01")
            addPathData("M18 18.01v.01")
            addPathData("M17 15.02v.01")
            addPathData("M14 13.03v.01")
            addPathData("M12 3v5.394c0 2.253-1.126 4.356-3 5.606C7.126 15.25 6 17.353 6 19.606v1.394")
        }
        return _arrowMergeAltLeft!!
    }

private var _arrowMergeAltLeft: ImageVector? = null
