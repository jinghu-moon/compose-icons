package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CrownCross: ImageVector
    get() {
        if (_crownCross != null) return _crownCross!!
        _crownCross = phosphorThinIcon(
            name = "CrownCross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 180.000 60.000 C 164.850 60.000 150.850 65.060 140.570 74.250 C 137.279 77.185 134.397 80.548 132.000 84.250 L 132.000 36.000 L 152.000 36.000 C 154.209 36.000 156.000 34.209 156.000 32.000 C 156.000 29.791 154.209 28.000 152.000 28.000 L 132.000 28.000 L 132.000 8.000 C 132.000 5.791 130.209 4.000 128.000 4.000 C 125.791 4.000 124.000 5.791 124.000 8.000 L 124.000 28.000 L 104.000 28.000 C 101.791 28.000 100.000 29.791 100.000 32.000 C 100.000 34.209 101.791 36.000 104.000 36.000 L 124.000 36.000 L 124.000 84.260 C 121.603 80.558 118.721 77.195 115.430 74.260 C 105.150 65.060 91.150 60.000 76.000 60.000 C 45.086 60.033 20.033 85.086 20.000 116.000 C 20.000 144.360 33.790 162.380 45.370 172.510 C 52.121 178.410 59.758 183.212 68.000 186.740 L 68.000 208.000 C 68.000 214.627 73.373 220.000 80.000 220.000 L 176.000 220.000 C 182.627 220.000 188.000 214.627 188.000 208.000 L 188.000 186.740 C 196.242 183.212 203.879 178.410 210.630 172.510 C 222.210 162.380 236.000 144.360 236.000 116.000 C 235.967 85.086 210.914 60.033 180.000 60.000 ZM 205.590 166.290 C 198.862 172.253 191.124 176.967 182.740 180.210 C 181.106 180.752 180.003 182.279 180.000 184.000 L 180.000 208.000 C 180.000 210.209 178.209 212.000 176.000 212.000 L 80.000 212.000 C 77.791 212.000 76.000 210.209 76.000 208.000 L 76.000 184.000 C 75.999 182.281 74.900 180.756 73.270 180.210 C 64.881 176.971 57.139 172.256 50.410 166.290 C 35.540 153.170 28.000 136.250 28.000 116.000 C 28.028 89.502 49.502 68.028 76.000 68.000 C 103.810 68.000 124.000 86.500 124.000 112.000 L 124.000 176.000 C 124.000 178.209 125.791 180.000 128.000 180.000 C 130.209 180.000 132.000 178.209 132.000 176.000 L 132.000 112.000 C 132.000 86.500 152.190 68.000 180.000 68.000 C 206.498 68.028 227.972 89.502 228.000 116.000 C 228.000 136.250 220.460 153.170 205.590 166.290 Z"),
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
        return _crownCross!!
    }

private var _crownCross: ImageVector? = null
