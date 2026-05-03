package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CircleHalf: ImageVector
    get() {
        if (_circleHalf != null) return _circleHalf!!
        _circleHalf = phosphorThinIcon(
            name = "CircleHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 132.000 36.090 C 140.155 36.437 148.226 37.874 156.000 40.360 L 156.000 215.640 C 148.226 218.126 140.155 219.563 132.000 219.910 ZM 164.000 43.340 C 172.724 47.075 180.820 52.135 188.000 58.340 L 188.000 197.690 C 180.820 203.895 172.724 208.955 164.000 212.690 ZM 36.000 128.000 C 36.058 78.769 74.818 38.287 124.000 36.090 L 124.000 219.910 C 74.818 217.713 36.058 177.231 36.000 128.000 ZM 196.000 189.900 L 196.000 66.100 C 227.998 101.164 227.998 154.836 196.000 189.900 Z"),
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
        return _circleHalf!!
    }

private var _circleHalf: ImageVector? = null
