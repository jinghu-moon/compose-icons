package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DropHalfBottom: ImageVector
    get() {
        if (_dropHalfBottom != null) return _dropHalfBottom!!
        _dropHalfBottom = phosphorThinIcon(
            name = "DropHalfBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 171.000 50.370 C 158.861 36.349 145.200 23.722 130.270 12.720 C 128.894 11.759 127.066 11.759 125.690 12.720 C 110.774 23.724 97.127 36.351 85.000 50.370 C 58.170 81.210 44.000 113.580 44.000 144.000 C 44.000 190.392 81.608 228.000 128.000 228.000 C 174.392 228.000 212.000 190.392 212.000 144.000 C 212.000 113.580 197.830 81.210 171.000 50.370 ZM 189.910 188.000 L 66.090 188.000 C 60.904 180.735 57.044 172.610 54.690 164.000 L 201.310 164.000 C 198.956 172.610 195.096 180.735 189.910 188.000 ZM 53.000 156.000 C 52.347 152.033 52.013 148.020 52.000 144.000 C 52.005 139.987 52.269 135.979 52.790 132.000 L 203.210 132.000 C 203.731 135.979 203.995 139.987 204.000 144.000 C 203.987 148.020 203.653 152.033 203.000 156.000 ZM 90.900 55.770 C 102.073 42.968 114.501 31.320 128.000 21.000 C 141.500 31.333 153.929 42.994 165.100 55.810 C 179.470 72.360 196.100 96.420 201.870 124.040 L 54.130 124.040 C 59.930 96.380 76.530 72.320 90.900 55.770 ZM 128.000 220.000 C 107.023 220.007 86.982 211.317 72.650 196.000 L 183.350 196.000 C 169.018 211.317 148.977 220.007 128.000 220.000 Z"),
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
        return _dropHalfBottom!!
    }

private var _dropHalfBottom: ImageVector? = null
