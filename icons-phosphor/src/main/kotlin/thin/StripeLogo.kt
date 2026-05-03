package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.StripeLogo: ImageVector
    get() {
        if (_stripeLogo != null) return _stripeLogo!!
        _stripeLogo = phosphorThinIcon(
            name = "StripeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 164.000 152.000 C 164.000 167.440 147.850 180.000 128.000 180.000 C 108.150 180.000 92.000 167.440 92.000 152.000 C 92.000 149.791 93.791 148.000 96.000 148.000 C 98.209 148.000 100.000 149.791 100.000 152.000 C 100.000 163.000 112.560 172.000 128.000 172.000 C 143.440 172.000 156.000 163.000 156.000 152.000 C 156.000 139.420 144.210 135.080 126.220 129.890 C 111.000 125.510 93.780 120.540 93.780 104.000 C 93.780 88.000 108.490 76.000 128.000 76.000 C 142.200 76.000 154.300 82.460 159.550 92.850 C 160.274 94.132 160.235 95.708 159.448 96.953 C 158.662 98.198 157.256 98.910 155.787 98.807 C 154.318 98.704 153.025 97.802 152.420 96.460 C 148.530 88.780 139.170 84.000 128.000 84.000 C 113.000 84.000 101.780 92.600 101.780 104.000 C 101.780 113.810 111.850 117.430 128.440 122.210 C 145.030 126.990 164.000 132.460 164.000 152.000 ZM 220.000 48.000 L 220.000 208.000 C 220.000 214.627 214.627 220.000 208.000 220.000 L 48.000 220.000 C 41.373 220.000 36.000 214.627 36.000 208.000 L 36.000 48.000 C 36.000 41.373 41.373 36.000 48.000 36.000 L 208.000 36.000 C 214.627 36.000 220.000 41.373 220.000 48.000 ZM 212.000 48.000 C 212.000 45.791 210.209 44.000 208.000 44.000 L 48.000 44.000 C 45.791 44.000 44.000 45.791 44.000 48.000 L 44.000 208.000 C 44.000 210.209 45.791 212.000 48.000 212.000 L 208.000 212.000 C 210.209 212.000 212.000 210.209 212.000 208.000 Z"),
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
        return _stripeLogo!!
    }

private var _stripeLogo: ImageVector? = null
