package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Pentagon: ImageVector
    get() {
        if (_pentagon != null) return _pentagon!!
        _pentagon = tablerFilledIcon(
            name = "Pentagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.205 2.600 L 3.245 7.838 C 2.217 8.611 1.797 9.954 2.200 11.176 L 5.096 19.941 C 5.502 21.170 6.651 22.001 7.946 22.000 L 16.066 22.000 C 17.352 22.000 18.494 21.181 18.907 19.963 L 21.880 11.199 C 22.298 9.967 21.874 8.606 20.830 7.829 L 13.797 2.592 L 13.706 2.531 L 13.688 2.521 L 13.582 2.451 C 12.533 1.801 11.193 1.860 10.205 2.599 Z"),
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
        return _pentagon!!
    }

private var _pentagon: ImageVector? = null
