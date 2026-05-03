package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowFatLinesDown: ImageVector
    get() {
        if (_arrowFatLinesDown != null) return _arrowFatLinesDown!!
        _arrowFatLinesDown = phosphorBoldIcon(
            name = "ArrowFatLinesDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 235.090 131.410 C 233.233 126.924 228.855 123.999 224.000 124.000 L 188.000 124.000 L 188.000 120.000 C 188.000 113.373 182.627 108.000 176.000 108.000 L 80.000 108.000 C 73.373 108.000 68.000 113.373 68.000 120.000 L 68.000 124.000 L 32.000 124.000 C 27.144 123.996 22.764 126.920 20.905 131.407 C 19.046 135.893 20.074 141.058 23.510 144.490 L 119.510 240.490 C 121.762 242.749 124.820 244.019 128.010 244.019 C 131.200 244.019 134.258 242.749 136.510 240.490 L 232.510 144.490 C 235.936 141.053 236.954 135.891 235.090 131.410 ZM 128.000 215.000 L 61.000 148.000 L 80.000 148.000 C 86.627 148.000 92.000 142.627 92.000 136.000 L 92.000 132.000 L 164.000 132.000 L 164.000 136.000 C 164.000 142.627 169.373 148.000 176.000 148.000 L 195.000 148.000 ZM 68.000 40.000 C 68.000 33.373 73.373 28.000 80.000 28.000 L 176.000 28.000 C 182.627 28.000 188.000 33.373 188.000 40.000 C 188.000 46.627 182.627 52.000 176.000 52.000 L 80.000 52.000 C 73.373 52.000 68.000 46.627 68.000 40.000 ZM 68.000 80.000 C 68.000 73.373 73.373 68.000 80.000 68.000 L 176.000 68.000 C 182.627 68.000 188.000 73.373 188.000 80.000 C 188.000 86.627 182.627 92.000 176.000 92.000 L 80.000 92.000 C 73.373 92.000 68.000 86.627 68.000 80.000 Z"),
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
        return _arrowFatLinesDown!!
    }

private var _arrowFatLinesDown: ImageVector? = null
