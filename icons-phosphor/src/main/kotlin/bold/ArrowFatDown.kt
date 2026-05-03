package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowFatDown: ImageVector
    get() {
        if (_arrowFatDown != null) return _arrowFatDown!!
        _arrowFatDown = phosphorBoldIcon(
            name = "ArrowFatDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 235.090 131.410 C 233.233 126.924 228.855 123.999 224.000 124.000 L 188.000 124.000 L 188.000 48.000 C 188.000 36.954 179.046 28.000 168.000 28.000 L 88.000 28.000 C 76.954 28.000 68.000 36.954 68.000 48.000 L 68.000 124.000 L 32.000 124.000 C 27.145 124.000 22.769 126.925 20.913 131.411 C 19.056 135.897 20.085 141.059 23.520 144.490 L 119.520 240.490 C 121.772 242.749 124.830 244.019 128.020 244.019 C 131.210 244.019 134.268 242.749 136.520 240.490 L 232.520 144.490 C 235.942 141.051 236.956 135.889 235.090 131.410 ZM 128.000 215.000 L 61.000 148.000 L 80.000 148.000 C 86.627 148.000 92.000 142.627 92.000 136.000 L 92.000 52.000 L 164.000 52.000 L 164.000 136.000 C 164.000 142.627 169.373 148.000 176.000 148.000 L 195.000 148.000 Z"),
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
        return _arrowFatDown!!
    }

private var _arrowFatDown: ImageVector? = null
