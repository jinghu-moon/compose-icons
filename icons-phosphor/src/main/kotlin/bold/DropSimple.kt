package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DropSimple: ImageVector
    get() {
        if (_dropSimple != null) return _dropSimple!!
        _dropSimple = phosphorBoldIcon(
            name = "DropSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 134.880 6.170 C 130.749 3.279 125.251 3.279 121.120 6.170 C 105.657 17.566 91.510 30.646 78.940 45.170 C 50.850 77.430 36.000 111.630 36.000 144.000 C 36.000 194.810 77.190 236.000 128.000 236.000 C 178.810 236.000 220.000 194.810 220.000 144.000 C 220.000 66.640 138.360 8.600 134.880 6.170 ZM 128.000 212.000 C 90.461 211.961 60.039 181.539 60.000 144.000 C 60.000 110.690 80.000 80.630 96.700 61.290 C 106.235 50.338 116.708 40.239 128.000 31.110 C 139.292 40.239 149.765 50.338 159.300 61.290 C 176.000 80.630 196.000 110.690 196.000 144.000 C 195.961 181.539 165.539 211.961 128.000 212.000 Z"),
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
        return _dropSimple!!
    }

private var _dropSimple: ImageVector? = null
