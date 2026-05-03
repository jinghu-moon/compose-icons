package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Play: ImageVector
    get() {
        if (_play != null) return _play!!
        _play = phosphorBoldIcon(
            name = "Play",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 234.490 111.070 L 90.410 22.940 C 84.259 19.190 76.566 19.038 70.271 22.542 C 63.976 26.047 60.053 32.666 60.000 39.870 L 60.000 216.130 C 60.053 223.334 63.976 229.953 70.271 233.458 C 76.566 236.962 84.259 236.810 90.410 233.060 L 234.490 144.930 C 240.398 141.333 244.004 134.917 244.004 128.000 C 244.004 121.083 240.398 114.667 234.490 111.070 ZM 84.000 208.850 L 84.000 47.150 L 216.160 128.000 Z"),
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
        return _play!!
    }

private var _play: ImageVector? = null
