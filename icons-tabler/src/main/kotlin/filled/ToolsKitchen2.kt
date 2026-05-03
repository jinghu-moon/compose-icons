package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ToolsKitchen2: ImageVector
    get() {
        if (_toolsKitchen2 != null) return _toolsKitchen2!!
        _toolsKitchen2 = tablerFilledIcon(
            name = "ToolsKitchen2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.940 2.002 L 19.040 2.001 L 19.136 2.009 L 19.231 2.027 L 19.325 2.054 L 19.417 2.091 L 19.503 2.136 L 19.583 2.188 L 19.659 2.248 L 19.735 2.322 L 19.795 2.394 L 19.825 2.434 L 19.876 2.518 L 19.919 2.606 L 19.953 2.697 L 19.978 2.791 L 19.998 2.941 L 20.000 21.000 C 20.000 21.552 19.552 22.000 19.000 22.000 L 18.000 22.000 C 17.448 22.000 17.000 21.552 17.000 21.000 L 17.000 18.000 C 17.000 17.448 17.448 17.000 18.000 17.000 L 18.000 16.000 L 14.000 16.000 C 13.450 16.000 13.003 15.556 13.000 15.006 C 12.967 9.683 13.970 6.524 18.005 2.572 L 18.322 2.265 L 18.394 2.205 L 18.434 2.175 L 18.518 2.124 L 18.606 2.081 L 18.697 2.047 L 18.791 2.022 ZM 11.000 3.000 C 11.552 3.000 12.000 3.448 12.000 4.000 L 12.000 7.000 C 12.000 8.824 10.766 10.418 9.000 10.874 L 9.000 21.000 C 9.000 21.552 8.552 22.000 8.000 22.000 C 7.448 22.000 7.000 21.552 7.000 21.000 L 7.000 10.874 C 5.234 10.418 4.000 8.824 4.000 7.000 L 4.000 4.000 C 4.000 3.448 4.448 3.000 5.000 3.000 C 5.552 3.000 6.000 3.448 6.000 4.000 L 6.000 7.000 C 6.000 7.715 6.381 8.375 7.000 8.732 L 7.000 4.000 C 7.000 3.448 7.448 3.000 8.000 3.000 C 8.552 3.000 9.000 3.448 9.000 4.000 L 9.001 8.732 C 9.619 8.374 10.000 7.714 10.000 7.000 L 10.000 4.000 C 10.000 3.448 10.448 3.000 11.000 3.000"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _toolsKitchen2!!
    }

private var _toolsKitchen2: ImageVector? = null
