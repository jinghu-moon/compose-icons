package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Package: ImageVector
    get() {
        if (_package != null) return _package!!
        _package = phosphorFillIcon(
            name = "Package",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 223.680 66.150 L 135.680 18.000 C 130.901 15.359 125.099 15.359 120.320 18.000 L 32.320 66.170 C 27.201 68.971 24.013 74.335 24.000 80.170 L 24.000 175.810 C 24.013 181.645 27.201 187.009 32.320 189.810 L 120.320 237.980 C 125.099 240.621 130.901 240.621 135.680 237.980 L 223.680 189.810 C 228.799 187.009 231.987 181.645 232.000 175.810 L 232.000 80.180 C 231.998 74.335 228.808 68.956 223.680 66.150 ZM 128.000 32.000 L 208.350 76.000 L 178.570 92.290 L 98.220 48.290 ZM 128.000 120.000 L 47.650 76.000 L 81.560 57.430 L 161.910 101.430 ZM 216.000 175.850 L 216.000 175.850 L 136.000 219.640 L 136.000 133.830 L 168.000 116.320 L 168.000 152.000 C 168.000 156.418 171.582 160.000 176.000 160.000 C 180.418 160.000 184.000 156.418 184.000 152.000 L 184.000 107.560 L 216.000 90.050 L 216.000 175.810 Z"),
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
