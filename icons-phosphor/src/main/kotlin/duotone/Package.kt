package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Package: ImageVector
    get() {
        if (_package != null) return _package!!
        _package = phosphorDuotoneIcon(
            name = "Package",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 128.000 129.090 L 128.000 232.000 C 126.656 231.994 125.336 231.651 124.160 231.000 L 36.160 182.820 C 33.601 181.420 32.007 178.737 32.000 175.820 L 32.000 80.180 C 32.003 79.060 32.242 77.952 32.700 76.930 Z"),
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
        pathData = parseSvgPathData("M 223.680 66.150 L 135.680 18.000 C 130.901 15.359 125.099 15.359 120.320 18.000 L 32.320 66.170 C 27.201 68.971 24.013 74.335 24.000 80.170 L 24.000 175.810 C 24.013 181.645 27.201 187.009 32.320 189.810 L 120.320 237.980 C 125.099 240.621 130.901 240.621 135.680 237.980 L 223.680 189.810 C 228.799 187.009 231.987 181.645 232.000 175.810 L 232.000 80.180 C 231.998 74.335 228.808 68.956 223.680 66.150 ZM 128.000 32.000 L 208.340 76.000 L 178.570 92.300 L 98.220 48.300 ZM 128.000 120.000 L 47.660 76.000 L 81.560 57.440 L 161.900 101.440 ZM 40.000 90.000 L 120.000 133.780 L 120.000 219.570 L 40.000 175.820 ZM 216.000 175.780 L 216.000 175.780 L 136.000 219.570 L 136.000 133.820 L 168.000 116.310 L 168.000 152.000 C 168.000 156.418 171.582 160.000 176.000 160.000 C 180.418 160.000 184.000 156.418 184.000 152.000 L 184.000 107.550 L 216.000 90.000 L 216.000 175.770 Z"),
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
        return _package!!
    }

private var _package: ImageVector? = null
