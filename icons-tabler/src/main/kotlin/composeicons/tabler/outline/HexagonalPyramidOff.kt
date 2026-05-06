package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HexagonalPyramidOff: ImageVector
    get() {
        if (_hexagonalPyramidOff != null) return _hexagonalPyramidOff!!
        _hexagonalPyramidOff = tablerOutlineIcon(
            name = "HexagonalPyramidOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7.877 7.88 3.317 15.41c-.508 .787-.397 1.822 .266 2.484l2.527 2.523c.374 .373 .88 .583 1.408 .583h8.964c.528 0 1.034-.21 1.408-.583l1.264-1.263M20.946 16.949c.126-.527 .031-1.083-.262-1.538L12.838 2.457C12.655 2.172 12.339 1.999 12 1.999c-.339 0-.655 .172-.838 .458L9.39 5.383")
            addPathData("M12 2 10.746 6.742 9.905 9.919 7 20.9")
            addPathData("M12 2l2.153 8.14M15.597 15.597 17 20.9")
            addPathData("M3 3 21 21")
        }
        return _hexagonalPyramidOff!!
    }

private var _hexagonalPyramidOff: ImageVector? = null
