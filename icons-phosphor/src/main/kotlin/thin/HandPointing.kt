package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HandPointing: ImageVector
    get() {
        if (_handPointing != null) return _handPointing!!
        _handPointing = phosphorThinIcon(
            name = "HandPointing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 196.000 92.000 C 190.060 91.993 184.330 94.200 179.930 98.190 C 179.234 89.083 173.429 81.160 164.955 77.752 C 156.482 74.344 146.808 76.041 140.000 82.130 L 140.000 44.000 C 140.000 30.745 129.255 20.000 116.000 20.000 C 102.745 20.000 92.000 30.745 92.000 44.000 L 92.000 138.000 L 80.750 119.940 C 74.106 108.466 59.419 104.551 47.945 111.195 C 36.471 117.839 32.556 132.526 39.200 144.000 L 43.880 152.250 C 61.210 182.800 72.660 203.000 85.660 216.330 C 99.280 230.300 113.860 236.000 136.000 236.000 C 182.371 235.950 219.950 198.371 220.000 152.000 L 220.000 116.000 C 220.000 102.745 209.255 92.000 196.000 92.000 ZM 212.000 152.000 C 211.950 193.953 177.953 227.950 136.000 228.000 C 96.000 228.000 84.650 207.920 50.840 148.290 L 46.150 140.000 L 46.150 140.000 C 41.864 132.361 44.517 122.695 52.103 118.315 C 59.689 113.935 69.387 116.469 73.860 124.000 C 73.887 124.038 73.910 124.078 73.930 124.120 L 92.610 154.120 C 93.556 155.631 95.389 156.333 97.103 155.842 C 98.817 155.350 99.999 153.783 100.000 152.000 L 100.000 44.000 C 100.000 35.163 107.163 28.000 116.000 28.000 C 124.837 28.000 132.000 35.163 132.000 44.000 L 132.000 112.000 C 132.000 114.209 133.791 116.000 136.000 116.000 C 138.209 116.000 140.000 114.209 140.000 112.000 L 140.000 100.000 C 140.000 91.163 147.163 84.000 156.000 84.000 C 164.837 84.000 172.000 91.163 172.000 100.000 L 172.000 120.000 C 172.000 122.209 173.791 124.000 176.000 124.000 C 178.209 124.000 180.000 122.209 180.000 120.000 L 180.000 116.000 C 180.000 107.163 187.163 100.000 196.000 100.000 C 204.837 100.000 212.000 107.163 212.000 116.000 Z"),
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
        return _handPointing!!
    }

private var _handPointing: ImageVector? = null
