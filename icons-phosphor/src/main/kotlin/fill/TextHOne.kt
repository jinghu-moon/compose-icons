package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextHOne: ImageVector
    get() {
        if (_textHOne != null) return _textHOne!!
        _textHOne = phosphorFillIcon(
            name = "TextHOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 144.000 160.000 C 144.000 164.418 140.418 168.000 136.000 168.000 C 131.582 168.000 128.000 164.418 128.000 160.000 L 128.000 128.000 L 72.000 128.000 L 72.000 160.000 C 72.000 164.418 68.418 168.000 64.000 168.000 C 59.582 168.000 56.000 164.418 56.000 160.000 L 56.000 80.000 C 56.000 75.582 59.582 72.000 64.000 72.000 C 68.418 72.000 72.000 75.582 72.000 80.000 L 72.000 112.000 L 128.000 112.000 L 128.000 80.000 C 128.000 75.582 131.582 72.000 136.000 72.000 C 140.418 72.000 144.000 75.582 144.000 80.000 ZM 200.000 176.000 C 200.000 180.418 196.418 184.000 192.000 184.000 C 187.582 184.000 184.000 180.418 184.000 176.000 L 184.000 111.000 L 172.440 118.710 C 168.762 121.162 163.792 120.168 161.340 116.490 C 158.888 112.812 159.882 107.842 163.560 105.390 L 187.560 89.390 C 190.008 87.757 193.155 87.599 195.754 88.980 C 198.353 90.361 199.984 93.057 200.000 96.000 Z"),
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
        return _textHOne!!
    }

private var _textHOne: ImageVector? = null
