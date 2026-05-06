package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HexagonalPyramidPlus: ImageVector
    get() {
        if (_hexagonalPyramidPlus != null) return _hexagonalPyramidPlus!!
        _hexagonalPyramidPlus = tablerOutlineIcon(
            name = "HexagonalPyramidPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.642 12.04 12.838 2.457C12.655 2.172 12.339 1.999 12 1.999c-.339 0-.655 .172-.838 .458L3.316 15.411c-.507 .787-.396 1.821 .267 2.483l2.527 2.523c.374 .373 .88 .583 1.408 .583h4.982")
            addPathData("M12 2 7 20.9")
            addPathData("M12 2l3.304 12.489")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
        }
        return _hexagonalPyramidPlus!!
    }

private var _hexagonalPyramidPlus: ImageVector? = null
