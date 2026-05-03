package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SailboatFill: ImageVector
    get() {
        if (_sailboatFill != null) return _sailboatFill!!
        _sailboatFill = remixIcon(
            name = "SailboatFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 18.000 L 21.000 18.000 C 21.276 18.000 21.500 18.224 21.500 18.500 C 21.500 18.608 21.465 18.713 21.400 18.800 L 19.300 21.600 C 19.111 21.852 18.815 22.000 18.500 22.000 L 5.500 22.000 C 5.185 22.000 4.889 21.852 4.700 21.600 L 2.600 18.800 C 2.434 18.579 2.479 18.266 2.700 18.100 C 2.787 18.035 2.892 18.000 3.000 18.000 ZM 15.000 2.425 L 15.000 15.000 C 15.000 15.552 14.552 16.000 14.000 16.000 L 4.040 16.000 C 3.764 16.000 3.540 15.776 3.540 15.500 C 3.540 15.386 3.579 15.276 3.650 15.188 L 14.110 2.113 C 14.282 1.897 14.597 1.862 14.812 2.035 C 14.931 2.130 15.000 2.273 15.000 2.425 Z"),
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
        return _sailboatFill!!
    }

private var _sailboatFill: ImageVector? = null
