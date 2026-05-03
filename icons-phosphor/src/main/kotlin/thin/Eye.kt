package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Eye: ImageVector
    get() {
        if (_eye != null) return _eye!!
        _eye = phosphorThinIcon(
            name = "Eye",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 243.660 126.380 C 243.320 125.620 235.140 107.490 216.830 89.180 C 199.870 72.220 170.700 52.000 128.000 52.000 C 85.300 52.000 56.130 72.220 39.170 89.180 C 20.860 107.490 12.680 125.620 12.340 126.380 C 11.890 127.417 11.890 128.593 12.340 129.630 C 12.680 130.400 20.860 148.520 39.170 166.830 C 56.170 183.830 85.310 204.000 128.000 204.000 C 170.690 204.000 199.870 183.790 216.830 166.830 C 235.140 148.520 243.320 130.400 243.660 129.630 C 244.110 128.593 244.110 127.417 243.660 126.380 ZM 210.960 161.380 C 187.890 184.380 159.960 196.000 127.960 196.000 C 95.960 196.000 68.070 184.350 44.960 161.380 C 35.127 151.573 26.857 140.316 20.440 128.000 C 26.869 115.681 35.152 104.423 45.000 94.620 C 68.110 71.650 96.000 60.000 128.000 60.000 C 160.000 60.000 187.890 71.650 211.000 94.620 C 220.846 104.425 229.129 115.682 235.560 128.000 C 229.131 140.318 220.847 151.576 211.000 161.380 ZM 128.000 84.000 C 103.699 84.000 84.000 103.699 84.000 128.000 C 84.000 152.301 103.699 172.000 128.000 172.000 C 152.301 172.000 172.000 152.301 172.000 128.000 C 171.972 103.711 152.289 84.028 128.000 84.000 ZM 128.000 164.000 C 108.118 164.000 92.000 147.882 92.000 128.000 C 92.000 108.118 108.118 92.000 128.000 92.000 C 147.882 92.000 164.000 108.118 164.000 128.000 C 164.000 147.882 147.882 164.000 128.000 164.000 Z"),
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
        return _eye!!
    }

private var _eye: ImageVector? = null
