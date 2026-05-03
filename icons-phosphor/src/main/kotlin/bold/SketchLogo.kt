package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SketchLogo: ImageVector
    get() {
        if (_sketchLogo != null) return _sketchLogo!!
        _sketchLogo = phosphorBoldIcon(
            name = "SketchLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 249.000 96.100 L 193.000 32.100 C 190.729 29.503 187.450 28.009 184.000 28.000 L 72.000 28.000 C 68.550 28.009 65.271 29.503 63.000 32.100 L 7.000 96.100 C 2.945 100.735 3.057 107.688 7.260 112.190 L 119.260 232.190 C 121.529 234.620 124.705 235.999 128.030 235.999 C 131.355 235.999 134.531 234.620 136.800 232.190 L 248.800 112.190 C 252.985 107.673 253.072 100.720 249.000 96.100 ZM 213.550 92.000 L 182.000 92.000 L 152.000 52.000 L 178.550 52.000 ZM 71.880 116.000 L 93.070 169.000 L 43.610 116.000 ZM 158.280 116.000 L 128.000 191.690 L 97.720 116.000 ZM 104.000 92.000 L 128.000 60.000 L 152.000 92.000 ZM 184.120 116.000 L 212.390 116.000 L 162.930 169.000 ZM 77.450 52.000 L 104.000 52.000 L 74.000 92.000 L 42.450 92.000 Z"),
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
        return _sketchLogo!!
    }

private var _sketchLogo: ImageVector? = null
