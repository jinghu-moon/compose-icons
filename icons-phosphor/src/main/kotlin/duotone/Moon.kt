package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Moon: ImageVector
    get() {
        if (_moon != null) return _moon!!
        _moon = phosphorDuotoneIcon(
            name = "Moon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 227.890 147.890 C 214.568 191.691 172.171 219.990 126.611 215.491 C 81.051 210.993 45.007 174.949 40.509 129.389 C 36.010 83.829 64.309 41.431 108.110 28.110 C 97.863 62.016 107.099 98.809 132.145 123.855 C 157.191 148.901 193.984 158.137 227.890 147.890 Z"),
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
        pathData = parseSvgPathData("M 233.540 142.230 C 231.449 140.134 228.371 139.365 225.540 140.230 C 194.459 149.626 160.729 141.160 137.769 118.201 C 114.810 95.241 106.344 61.511 115.740 30.430 C 116.612 27.597 115.847 24.515 113.751 22.419 C 111.655 20.323 108.573 19.558 105.740 20.430 C 84.650 26.890 66.135 39.838 52.830 57.430 C 29.097 88.940 25.234 131.166 42.856 166.459 C 60.478 201.752 96.552 224.037 136.000 224.000 C 158.563 224.070 180.527 216.734 198.520 203.120 C 216.112 189.815 229.060 171.300 235.520 150.210 C 236.382 147.388 235.621 144.321 233.540 142.230 ZM 188.900 190.340 C 153.866 216.728 104.748 213.289 73.733 182.276 C 42.718 151.263 39.275 102.146 65.660 67.110 C 73.974 56.131 84.723 47.230 97.060 41.110 C 96.357 46.042 96.003 51.018 96.000 56.000 C 96.061 113.412 142.588 159.939 200.000 160.000 C 204.992 159.998 209.978 159.644 214.920 158.940 C 208.794 171.279 199.887 182.028 188.900 190.340 Z"),
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
        return _moon!!
    }

private var _moon: ImageVector? = null
