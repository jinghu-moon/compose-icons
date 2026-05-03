package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Pants: ImageVector
    get() {
        if (_pants != null) return _pants!!
        _pants = phosphorDuotoneIcon(
            name = "Pants",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 202.050 104.000 C 201.370 104.000 200.690 104.000 200.000 104.000 C 177.909 104.000 160.000 86.091 160.000 64.000 L 96.000 64.000 C 96.000 86.091 78.091 104.000 56.000 104.000 C 55.310 104.000 54.630 104.000 54.000 104.000 L 62.060 39.000 C 62.564 34.999 65.967 31.999 70.000 32.000 L 186.000 32.000 C 190.033 31.999 193.436 34.999 193.940 39.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 223.880 214.000 L 201.880 38.000 C 200.872 29.998 194.065 23.997 186.000 24.000 L 70.000 24.000 C 61.935 23.997 55.128 29.998 54.120 38.000 L 32.120 214.000 C 31.546 218.557 32.958 223.141 35.996 226.585 C 39.035 230.029 43.407 232.002 48.000 232.000 L 88.690 232.000 C 96.010 232.001 102.397 227.035 104.200 219.940 L 128.000 127.940 L 151.790 219.880 C 153.570 227.002 159.969 231.999 167.310 232.000 L 208.000 232.000 C 212.593 232.002 216.965 230.029 220.004 226.585 C 223.042 223.141 224.454 218.557 223.880 214.000 ZM 192.900 95.200 C 181.234 92.522 172.023 83.581 169.000 72.000 L 190.000 72.000 ZM 186.000 40.000 L 188.000 56.000 L 68.000 56.000 L 70.000 40.000 ZM 66.000 72.000 L 87.000 72.000 C 83.977 83.581 74.766 92.522 63.100 95.200 ZM 88.690 216.000 L 48.000 216.000 L 61.000 111.730 C 82.411 109.457 99.701 93.225 103.320 72.000 L 120.000 72.000 L 120.000 95.000 ZM 167.290 215.940 L 136.000 95.000 L 136.000 72.000 L 152.680 72.000 C 156.299 93.225 173.589 109.457 195.000 111.730 L 208.000 216.000 Z"),
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
        return _pants!!
    }

private var _pants: ImageVector? = null
