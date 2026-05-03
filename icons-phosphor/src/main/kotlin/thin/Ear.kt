package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Ear: ImageVector
    get() {
        if (_ear != null) return _ear!!
        _ear = phosphorThinIcon(
            name = "Ear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.000 104.000 C 212.000 106.209 210.209 108.000 208.000 108.000 C 205.791 108.000 204.000 106.209 204.000 104.000 C 204.000 62.026 169.974 28.000 128.000 28.000 C 86.026 28.000 52.000 62.026 52.000 104.000 C 52.000 132.400 61.550 141.610 70.790 150.520 C 79.250 158.670 88.000 167.110 88.000 188.000 C 88.000 210.091 105.909 228.000 128.000 228.000 C 139.370 228.000 148.830 223.240 156.920 213.450 C 158.346 211.817 160.814 211.617 162.484 213.000 C 164.154 214.383 164.418 216.844 163.080 218.550 C 153.520 230.130 141.710 236.000 128.000 236.000 C 101.502 235.972 80.028 214.498 80.000 188.000 C 80.000 170.510 73.160 163.910 65.240 156.280 C 55.280 146.680 44.000 135.790 44.000 104.000 C 44.000 57.608 81.608 20.000 128.000 20.000 C 174.392 20.000 212.000 57.608 212.000 104.000 ZM 175.860 164.540 C 173.949 163.438 171.506 164.091 170.400 166.000 C 167.688 170.712 162.147 173.011 156.895 171.605 C 151.644 170.198 147.994 165.437 148.000 160.000 C 148.000 149.330 153.440 142.080 159.200 134.400 C 165.490 126.000 172.000 117.330 172.000 104.000 C 172.000 79.699 152.301 60.000 128.000 60.000 C 103.699 60.000 84.000 79.699 84.000 104.000 C 84.000 106.209 85.791 108.000 88.000 108.000 C 90.209 108.000 92.000 106.209 92.000 104.000 C 92.000 84.118 108.118 68.000 128.000 68.000 C 147.882 68.000 164.000 84.118 164.000 104.000 C 164.000 114.670 158.560 121.920 152.800 129.600 C 146.510 138.000 140.000 146.670 140.000 160.000 C 140.000 169.052 146.080 176.975 154.824 179.318 C 163.567 181.660 172.794 177.839 177.320 170.000 C 178.422 168.089 177.769 165.646 175.860 164.540 Z"),
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
        return _ear!!
    }

private var _ear: ImageVector? = null
