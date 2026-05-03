package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Nut: ImageVector
    get() {
        if (_nut != null) return _nut!!
        _nut = phosphorDuotoneIcon(
            name = "Nut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 219.840 73.160 L 131.840 25.000 C 129.447 23.691 126.553 23.691 124.160 25.000 L 36.160 73.180 C 33.601 74.580 32.007 77.263 32.000 80.180 L 32.000 175.820 C 32.007 178.737 33.601 181.420 36.160 182.820 L 124.160 231.000 C 126.553 232.309 129.447 232.309 131.840 231.000 L 219.840 182.820 C 222.399 181.420 223.993 178.737 224.000 175.820 L 224.000 80.180 C 224.001 77.256 222.406 74.564 219.840 73.160 ZM 128.000 168.000 C 105.909 168.000 88.000 150.091 88.000 128.000 C 88.000 105.909 105.909 88.000 128.000 88.000 C 150.091 88.000 168.000 105.909 168.000 128.000 C 168.000 150.091 150.091 168.000 128.000 168.000 Z"),
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
        pathData = parseSvgPathData("M 128.000 80.000 C 101.490 80.000 80.000 101.490 80.000 128.000 C 80.000 154.510 101.490 176.000 128.000 176.000 C 154.510 176.000 176.000 154.510 176.000 128.000 C 175.967 101.504 154.496 80.033 128.000 80.000 ZM 128.000 160.000 C 110.327 160.000 96.000 145.673 96.000 128.000 C 96.000 110.327 110.327 96.000 128.000 96.000 C 145.673 96.000 160.000 110.327 160.000 128.000 C 160.000 145.673 145.673 160.000 128.000 160.000 ZM 223.680 66.150 L 135.680 18.000 C 130.901 15.359 125.099 15.359 120.320 18.000 L 32.320 66.170 C 27.201 68.971 24.013 74.335 24.000 80.170 L 24.000 175.810 C 24.013 181.645 27.201 187.009 32.320 189.810 L 120.320 237.980 C 125.099 240.621 130.901 240.621 135.680 237.980 L 223.680 189.810 L 223.680 189.810 C 228.799 187.009 231.987 181.645 232.000 175.810 L 232.000 80.180 C 231.998 74.335 228.808 68.956 223.680 66.150 ZM 128.000 224.000 L 40.000 175.820 L 40.000 80.180 L 128.000 32.000 L 216.000 80.170 L 216.000 175.800 Z"),
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
        return _nut!!
    }

private var _nut: ImageVector? = null
