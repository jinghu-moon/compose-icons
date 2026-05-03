package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Brandy: ImageVector
    get() {
        if (_brandy != null) return _brandy!!
        _brandy = phosphorBoldIcon(
            name = "Brandy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.000 88.000 L 228.000 88.000 C 228.024 68.630 222.401 49.674 211.820 33.450 C 209.616 30.067 205.858 28.018 201.820 28.000 L 54.230 28.000 C 50.192 28.018 46.434 30.067 44.230 33.450 C 33.631 49.668 27.991 68.625 28.000 88.000 L 28.000 88.000 C 28.066 138.563 65.811 181.146 116.000 187.280 L 116.000 212.000 L 88.000 212.000 C 81.373 212.000 76.000 217.373 76.000 224.000 C 76.000 230.627 81.373 236.000 88.000 236.000 L 168.000 236.000 C 174.627 236.000 180.000 230.627 180.000 224.000 C 180.000 217.373 174.627 212.000 168.000 212.000 L 140.000 212.000 L 140.000 187.280 C 190.189 181.146 227.934 138.563 228.000 88.000 ZM 61.050 52.000 L 195.000 52.000 C 199.034 59.486 201.772 67.601 203.100 76.000 L 53.000 76.000 C 54.312 67.604 57.034 59.489 61.050 52.000 ZM 128.050 164.000 C 90.745 163.927 58.990 136.829 53.050 100.000 L 203.000 100.000 C 197.060 136.829 165.305 163.927 128.000 164.000 Z"),
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
        return _brandy!!
    }

private var _brandy: ImageVector? = null
