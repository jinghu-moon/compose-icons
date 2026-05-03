package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Ruler: ImageVector
    get() {
        if (_ruler != null) return _ruler!!
        _ruler = phosphorBoldIcon(
            name = "Ruler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 238.150 70.540 L 185.460 17.860 C 181.709 14.108 176.621 11.999 171.315 11.999 C 166.009 11.999 160.921 14.108 157.170 17.860 L 17.850 157.170 C 14.098 160.921 11.989 166.009 11.989 171.315 C 11.989 176.621 14.098 181.709 17.850 185.460 L 70.540 238.140 C 74.291 241.892 79.379 244.001 84.685 244.001 C 89.991 244.001 95.079 241.892 98.830 238.140 L 238.150 98.830 C 241.902 95.079 244.011 89.991 244.011 84.685 C 244.011 79.379 241.902 74.291 238.150 70.540 ZM 84.680 218.340 L 37.680 171.340 L 64.000 145.000 L 87.520 168.520 C 92.214 173.214 99.826 173.214 104.520 168.520 C 109.214 163.826 109.214 156.214 104.520 151.520 L 81.000 128.000 L 96.000 113.000 L 119.510 136.520 C 124.204 141.214 131.816 141.214 136.510 136.520 C 141.204 131.826 141.204 124.214 136.510 119.520 L 113.000 96.000 L 128.000 81.000 L 151.520 104.520 C 156.214 109.214 163.826 109.214 168.520 104.520 C 173.214 99.826 173.214 92.214 168.520 87.520 L 145.000 64.000 L 171.350 37.660 L 218.350 84.660 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _ruler!!
    }

private var _ruler: ImageVector? = null
