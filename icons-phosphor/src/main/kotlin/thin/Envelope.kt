package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Envelope: ImageVector
    get() {
        if (_envelope != null) return _envelope!!
        _envelope = phosphorThinIcon(
            name = "Envelope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 52.000 L 32.000 52.000 C 29.791 52.000 28.000 53.791 28.000 56.000 L 28.000 192.000 C 28.000 198.627 33.373 204.000 40.000 204.000 L 216.000 204.000 C 222.627 204.000 228.000 198.627 228.000 192.000 L 228.000 56.000 C 228.000 53.791 226.209 52.000 224.000 52.000 ZM 128.000 138.570 L 42.280 60.000 L 213.720 60.000 ZM 104.630 128.000 L 36.000 190.910 L 36.000 65.090 ZM 110.550 133.430 L 125.300 147.000 C 126.828 148.398 129.172 148.398 130.700 147.000 L 145.450 133.480 L 213.720 196.000 L 42.280 196.000 ZM 151.370 128.000 L 220.000 65.090 L 220.000 190.910 Z"),
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
        return _envelope!!
    }

private var _envelope: ImageVector? = null
