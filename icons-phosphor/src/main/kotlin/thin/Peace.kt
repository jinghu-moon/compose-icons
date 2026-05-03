package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Peace: ImageVector
    get() {
        if (_peace != null) return _peace!!
        _peace = phosphorThinIcon(
            name = "Peace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 220.000 128.000 C 220.021 145.520 215.009 162.677 205.560 177.430 L 132.000 125.920 L 132.000 36.090 C 181.182 38.287 219.942 78.769 220.000 128.000 ZM 124.000 36.090 L 124.000 125.920 L 50.440 177.430 C 32.783 149.712 31.253 114.681 46.425 85.528 C 61.597 56.376 91.168 37.531 124.000 36.090 ZM 55.000 184.000 L 124.000 135.710 L 124.000 219.940 C 96.815 218.761 71.548 205.600 55.000 184.000 ZM 132.000 219.940 L 132.000 135.680 L 201.000 184.000 C 184.446 205.589 159.180 218.738 132.000 219.910 Z"),
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
        return _peace!!
    }

private var _peace: ImageVector? = null
