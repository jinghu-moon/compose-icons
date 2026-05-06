package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.TriangleSquareCircle: ImageVector
    get() {
        if (_triangleSquareCircle != null) return _triangleSquareCircle!!
        _triangleSquareCircle = tablerFilledIcon(
            name = "TriangleSquareCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.132 2.504l-4 7c-.177 .309-.175 .69 .003 .998 .179 .308 .508 .498 .865 .498h8c.356-0 .686-.19 .865-.498 .179-.308 .18-.688 .003-.998l-4-7C12.69 2.193 12.359 2.001 12 2.001c-.359 0-.69 .192-.868 .503Z")
            addPathData("M17 13c2.183 0 3.963 1.75 3.999 3.933 .036 2.183-1.684 3.992-3.866 4.064-2.182 .073-4.019-1.617-4.128-3.798L13 17l.005-.2C13.112 14.671 14.869 13 17 13Z")
            addPathData("M9 13h-4c-1.105 0-2 .895-2 2v4c0 1.105 .895 2 2 2h4c1.105 0 2-.895 2-2v-4c0-1.105-.895-2-2-2Z")
        }
        return _triangleSquareCircle!!
    }

private var _triangleSquareCircle: ImageVector? = null
