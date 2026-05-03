package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FirebaseFill: ImageVector
    get() {
        if (_firebaseFill != null) return _firebaseFill!!
        _firebaseFill = remixIcon(
            name = "FirebaseFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.757 1.501 L 4.000 18.500 L 4.000 18.500 L 9.473 4.816 L 7.695 1.353 C 7.474 0.924 6.834 1.025 6.757 1.501 ZM 11.564 4.318 L 4.000 18.500 L 4.000 18.500 L 13.840 6.949 L 12.441 4.327 C 12.255 3.977 11.756 3.974 11.564 4.318 ZM 10.940 22.837 L 4.000 18.500 L 17.310 5.665 C 17.604 5.395 18.083 5.563 18.142 5.961 L 20.000 18.500 L 13.060 22.837 C 12.411 23.243 11.589 23.243 10.940 22.837 Z"),
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
        return _firebaseFill!!
    }

private var _firebaseFill: ImageVector? = null
