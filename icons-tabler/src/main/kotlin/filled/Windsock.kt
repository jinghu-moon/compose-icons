package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Windsock: ImageVector
    get() {
        if (_windsock != null) return _windsock!!
        _windsock = tablerFilledIcon(
            name = "Windsock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.000 2.000 C 6.552 2.000 7.000 2.448 7.000 3.000 L 7.000 4.079 L 18.083 5.003 C 18.601 5.046 19.000 5.480 19.000 6.000 L 19.000 10.000 C 19.000 10.520 18.601 10.954 18.083 10.997 L 7.000 11.920 L 7.000 20.000 L 8.000 20.000 C 8.552 20.000 9.000 20.448 9.000 21.000 C 9.000 21.552 8.552 22.000 8.000 22.000 L 4.000 22.000 C 3.448 22.000 3.000 21.552 3.000 21.000 C 3.000 20.448 3.448 20.000 4.000 20.000 L 5.000 20.000 L 5.000 3.000 C 5.000 2.448 5.448 2.000 6.000 2.000M 7.000 6.086 L 7.000 9.913 L 10.000 9.663 L 10.000 6.336 ZM 14.000 6.670 L 14.000 9.329 L 17.000 9.079 L 17.000 6.920 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _windsock!!
    }

private var _windsock: ImageVector? = null
