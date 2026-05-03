package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TextHOne: ImageVector
    get() {
        if (_textHOne != null) return _textHOne!!
        _textHOne = phosphorRegularIcon(
            name = "TextHOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 152.000 56.000 L 152.000 176.000 C 152.000 180.418 148.418 184.000 144.000 184.000 C 139.582 184.000 136.000 180.418 136.000 176.000 L 136.000 124.000 L 48.000 124.000 L 48.000 176.000 C 48.000 180.418 44.418 184.000 40.000 184.000 C 35.582 184.000 32.000 180.418 32.000 176.000 L 32.000 56.000 C 32.000 51.582 35.582 48.000 40.000 48.000 C 44.418 48.000 48.000 51.582 48.000 56.000 L 48.000 108.000 L 136.000 108.000 L 136.000 56.000 C 136.000 51.582 139.582 48.000 144.000 48.000 C 148.418 48.000 152.000 51.582 152.000 56.000 ZM 227.770 105.000 C 225.171 103.607 222.016 103.757 219.560 105.390 L 195.560 121.390 C 191.882 123.842 190.888 128.812 193.340 132.490 C 195.792 136.168 200.762 137.162 204.440 134.710 L 216.000 127.000 L 216.000 208.000 C 216.000 212.418 219.582 216.000 224.000 216.000 C 228.418 216.000 232.000 212.418 232.000 208.000 L 232.000 112.000 C 231.979 109.068 230.356 106.382 227.770 105.000 Z"),
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
        return _textHOne!!
    }

private var _textHOne: ImageVector? = null
