package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DropHalf: ImageVector
    get() {
        if (_dropHalf != null) return _dropHalf!!
        _dropHalf = phosphorBoldIcon(
            name = "DropHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 134.880 6.170 C 130.749 3.279 125.251 3.279 121.120 6.170 C 105.657 17.566 91.510 30.646 78.940 45.170 C 50.850 77.430 36.000 111.630 36.000 144.000 C 36.000 194.810 77.190 236.000 128.000 236.000 C 178.810 236.000 220.000 194.810 220.000 144.000 C 220.000 66.640 138.360 8.600 134.880 6.170 ZM 194.080 160.000 L 140.000 160.000 L 140.000 144.000 L 196.000 144.000 C 195.996 149.391 195.352 154.762 194.080 160.000 ZM 140.000 120.000 L 140.000 104.000 L 187.000 104.000 C 189.285 109.186 191.183 114.534 192.680 120.000 ZM 159.300 61.290 C 164.462 67.234 169.264 73.482 173.680 80.000 L 140.000 80.000 L 140.000 41.460 C 146.804 47.699 153.248 54.320 159.300 61.290 ZM 60.000 144.000 C 60.000 110.690 80.000 80.630 96.700 61.290 C 102.752 54.320 109.196 47.699 116.000 41.460 L 116.000 210.920 C 83.617 205.073 60.047 176.907 60.000 144.000 ZM 140.000 210.920 L 140.000 184.000 L 182.940 184.000 C 172.630 198.171 157.247 207.815 140.000 210.920 Z"),
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
        return _dropHalf!!
    }

private var _dropHalf: ImageVector? = null
