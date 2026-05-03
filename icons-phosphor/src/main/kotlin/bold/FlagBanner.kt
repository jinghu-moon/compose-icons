package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FlagBanner: ImageVector
    get() {
        if (_flagBanner != null) return _flagBanner!!
        _flagBanner = phosphorBoldIcon(
            name = "FlagBanner",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 242.150 49.590 C 239.950 46.108 236.118 43.998 232.000 44.000 L 40.000 44.000 C 35.145 44.000 30.769 46.925 28.913 51.411 C 27.056 55.897 28.085 61.059 31.520 64.490 L 71.000 104.000 L 31.520 143.510 C 28.085 146.941 27.056 152.103 28.913 156.589 C 30.769 161.075 35.145 164.000 40.000 164.000 L 167.280 164.000 L 141.170 218.840 C 139.201 222.726 139.493 227.375 141.933 230.985 C 144.373 234.594 148.578 236.597 152.918 236.218 C 157.258 235.840 161.052 233.138 162.830 229.160 L 242.830 61.160 C 244.604 57.442 244.348 53.074 242.150 49.590 ZM 178.710 140.000 L 69.000 140.000 L 96.520 112.480 C 98.779 110.228 100.049 107.170 100.049 103.980 C 100.049 100.790 98.779 97.732 96.520 95.480 L 69.000 68.000 L 213.000 68.000 Z"),
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
        return _flagBanner!!
    }

private var _flagBanner: ImageVector? = null
