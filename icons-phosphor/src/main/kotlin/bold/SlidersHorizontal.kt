package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SlidersHorizontal: ImageVector
    get() {
        if (_slidersHorizontal != null) return _slidersHorizontal!!
        _slidersHorizontal = phosphorBoldIcon(
            name = "SlidersHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 40.000 92.000 L 70.060 92.000 C 75.146 106.382 88.745 115.997 104.000 115.997 C 119.255 115.997 132.854 106.382 137.940 92.000 L 216.000 92.000 C 222.627 92.000 228.000 86.627 228.000 80.000 C 228.000 73.373 222.627 68.000 216.000 68.000 L 137.940 68.000 C 132.854 53.618 119.255 44.003 104.000 44.003 C 88.745 44.003 75.146 53.618 70.060 68.000 L 40.000 68.000 C 33.373 68.000 28.000 73.373 28.000 80.000 C 28.000 86.627 33.373 92.000 40.000 92.000 ZM 104.000 68.000 C 110.627 68.000 116.000 73.373 116.000 80.000 C 116.000 86.627 110.627 92.000 104.000 92.000 C 97.373 92.000 92.000 86.627 92.000 80.000 C 92.000 73.373 97.373 68.000 104.000 68.000 ZM 216.000 164.000 L 201.940 164.000 C 196.854 149.618 183.255 140.003 168.000 140.003 C 152.745 140.003 139.146 149.618 134.060 164.000 L 40.000 164.000 C 33.373 164.000 28.000 169.373 28.000 176.000 C 28.000 182.627 33.373 188.000 40.000 188.000 L 134.060 188.000 C 139.146 202.382 152.745 211.997 168.000 211.997 C 183.255 211.997 196.854 202.382 201.940 188.000 L 216.000 188.000 C 222.627 188.000 228.000 182.627 228.000 176.000 C 228.000 169.373 222.627 164.000 216.000 164.000 ZM 168.000 188.000 C 161.373 188.000 156.000 182.627 156.000 176.000 C 156.000 169.373 161.373 164.000 168.000 164.000 C 174.627 164.000 180.000 169.373 180.000 176.000 C 180.000 182.627 174.627 188.000 168.000 188.000 Z"),
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
        return _slidersHorizontal!!
    }

private var _slidersHorizontal: ImageVector? = null
