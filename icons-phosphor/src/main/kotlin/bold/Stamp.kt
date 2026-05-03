package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Stamp: ImageVector
    get() {
        if (_stamp != null) return _stamp!!
        _stamp = phosphorBoldIcon(
            name = "Stamp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 224.000 C 228.000 230.627 222.627 236.000 216.000 236.000 L 40.000 236.000 C 33.373 236.000 28.000 230.627 28.000 224.000 C 28.000 217.373 33.373 212.000 40.000 212.000 L 216.000 212.000 C 222.627 212.000 228.000 217.373 228.000 224.000 ZM 228.000 144.000 L 228.000 176.000 C 228.000 187.046 219.046 196.000 208.000 196.000 L 48.000 196.000 C 36.954 196.000 28.000 187.046 28.000 176.000 L 28.000 144.000 C 28.000 132.954 36.954 124.000 48.000 124.000 L 96.000 124.000 L 83.550 54.330 C 81.676 43.839 84.547 33.057 91.389 24.886 C 98.232 16.716 108.343 11.997 119.000 12.000 L 137.000 12.000 C 147.655 12.000 157.764 16.720 164.604 24.890 C 171.444 33.060 174.314 43.841 172.440 54.330 L 160.000 124.000 L 208.000 124.000 C 219.046 124.000 228.000 132.954 228.000 144.000 ZM 107.170 50.110 L 120.370 124.000 L 135.630 124.000 L 148.830 50.110 C 149.455 46.611 148.496 43.014 146.213 40.290 C 143.929 37.566 140.555 35.995 137.000 36.000 L 119.000 36.000 C 115.447 35.998 112.076 37.570 109.794 40.294 C 107.513 43.018 106.555 46.612 107.180 50.110 ZM 204.000 148.000 L 52.000 148.000 L 52.000 172.000 L 204.000 172.000 Z"),
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
        return _stamp!!
    }

private var _stamp: ImageVector? = null
