package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextB: ImageVector
    get() {
        if (_textB != null) return _textB!!
        _textB = phosphorFillIcon(
            name = "TextB",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 168.000 156.000 C 168.000 167.046 159.046 176.000 148.000 176.000 L 96.000 176.000 L 96.000 136.000 L 148.000 136.000 C 159.046 136.000 168.000 144.954 168.000 156.000 ZM 224.000 48.000 L 224.000 208.000 C 224.000 216.837 216.837 224.000 208.000 224.000 L 48.000 224.000 C 39.163 224.000 32.000 216.837 32.000 208.000 L 32.000 48.000 C 32.000 39.163 39.163 32.000 48.000 32.000 L 208.000 32.000 C 216.837 32.000 224.000 39.163 224.000 48.000 ZM 184.000 156.000 C 183.990 143.148 177.130 131.276 166.000 124.850 C 175.939 114.432 178.714 99.095 173.057 85.855 C 167.400 72.615 154.398 64.019 140.000 64.000 L 88.000 64.000 C 83.582 64.000 80.000 67.582 80.000 72.000 L 80.000 184.000 C 80.000 188.418 83.582 192.000 88.000 192.000 L 148.000 192.000 C 167.882 192.000 184.000 175.882 184.000 156.000 ZM 160.000 100.000 C 160.000 88.954 151.046 80.000 140.000 80.000 L 96.000 80.000 L 96.000 120.000 L 140.000 120.000 C 151.046 120.000 160.000 111.046 160.000 100.000 Z"),
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
        return _textB!!
    }

private var _textB: ImageVector? = null
