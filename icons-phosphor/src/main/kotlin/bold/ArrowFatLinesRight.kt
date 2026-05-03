package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowFatLinesRight: ImageVector
    get() {
        if (_arrowFatLinesRight != null) return _arrowFatLinesRight!!
        _arrowFatLinesRight = phosphorBoldIcon(
            name = "ArrowFatLinesRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.490 119.510 L 144.490 23.510 C 141.058 20.074 135.893 19.046 131.407 20.905 C 126.920 22.764 123.996 27.144 124.000 32.000 L 124.000 68.000 L 120.000 68.000 C 113.373 68.000 108.000 73.373 108.000 80.000 L 108.000 176.000 C 108.000 182.627 113.373 188.000 120.000 188.000 L 124.000 188.000 L 124.000 224.000 C 123.996 228.856 126.920 233.236 131.407 235.095 C 135.893 236.954 141.058 235.926 144.490 232.490 L 240.490 136.490 C 242.743 134.239 244.009 131.185 244.009 128.000 C 244.009 124.815 242.743 121.761 240.490 119.510 ZM 148.000 195.000 L 148.000 176.000 C 148.000 169.373 142.627 164.000 136.000 164.000 L 132.000 164.000 L 132.000 92.000 L 136.000 92.000 C 142.627 92.000 148.000 86.627 148.000 80.000 L 148.000 61.000 L 215.000 128.000 ZM 52.000 80.000 L 52.000 176.000 C 52.000 182.627 46.627 188.000 40.000 188.000 C 33.373 188.000 28.000 182.627 28.000 176.000 L 28.000 80.000 C 28.000 73.373 33.373 68.000 40.000 68.000 C 46.627 68.000 52.000 73.373 52.000 80.000 ZM 92.000 80.000 L 92.000 176.000 C 92.000 182.627 86.627 188.000 80.000 188.000 C 73.373 188.000 68.000 182.627 68.000 176.000 L 68.000 80.000 C 68.000 73.373 73.373 68.000 80.000 68.000 C 86.627 68.000 92.000 73.373 92.000 80.000 Z"),
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
        return _arrowFatLinesRight!!
    }

private var _arrowFatLinesRight: ImageVector? = null
