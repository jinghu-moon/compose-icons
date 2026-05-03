package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TextHThree: ImageVector
    get() {
        if (_textHThree != null) return _textHThree!!
        _textHThree = phosphorRegularIcon(
            name = "TextHThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 152.000 56.000 L 152.000 176.000 C 152.000 180.418 148.418 184.000 144.000 184.000 C 139.582 184.000 136.000 180.418 136.000 176.000 L 136.000 124.000 L 48.000 124.000 L 48.000 176.000 C 48.000 180.418 44.418 184.000 40.000 184.000 C 35.582 184.000 32.000 180.418 32.000 176.000 L 32.000 56.000 C 32.000 51.582 35.582 48.000 40.000 48.000 C 44.418 48.000 48.000 51.582 48.000 56.000 L 48.000 108.000 L 136.000 108.000 L 136.000 56.000 C 136.000 51.582 139.582 48.000 144.000 48.000 C 148.418 48.000 152.000 51.582 152.000 56.000 ZM 225.520 146.630 L 246.520 116.630 C 248.251 114.190 248.477 110.989 247.105 108.330 C 245.732 105.672 242.992 104.002 240.000 104.000 L 192.000 104.000 C 187.582 104.000 184.000 107.582 184.000 112.000 C 184.000 116.418 187.582 120.000 192.000 120.000 L 224.630 120.000 L 205.450 147.410 C 203.738 149.853 203.528 153.046 204.905 155.692 C 206.282 158.339 209.017 159.999 212.000 160.000 C 221.076 160.003 229.012 166.118 231.330 174.893 C 233.647 183.668 229.766 192.903 221.875 197.388 C 213.984 201.873 204.063 200.482 197.710 194.000 C 195.740 191.831 192.741 190.912 189.894 191.606 C 187.047 192.300 184.807 194.495 184.055 197.327 C 183.304 200.159 184.161 203.176 186.290 205.190 C 196.527 215.635 212.065 218.848 225.605 213.321 C 239.145 207.794 247.996 194.625 248.000 180.000 C 247.983 165.342 239.098 152.153 225.520 146.630 Z"),
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
        return _textHThree!!
    }

private var _textHThree: ImageVector? = null
