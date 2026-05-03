package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Broadcast: ImageVector
    get() {
        if (_broadcast != null) return _broadcast!!
        _broadcast = phosphorDuotoneIcon(
            name = "Broadcast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 160.000 128.000 C 160.000 145.673 145.673 160.000 128.000 160.000 C 110.327 160.000 96.000 145.673 96.000 128.000 C 96.000 110.327 110.327 96.000 128.000 96.000 C 145.673 96.000 160.000 110.327 160.000 128.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 128.000 88.000 C 105.909 88.000 88.000 105.909 88.000 128.000 C 88.000 150.091 105.909 168.000 128.000 168.000 C 150.091 168.000 168.000 150.091 168.000 128.000 C 168.000 105.909 150.091 88.000 128.000 88.000 ZM 128.000 152.000 C 114.745 152.000 104.000 141.255 104.000 128.000 C 104.000 114.745 114.745 104.000 128.000 104.000 C 141.255 104.000 152.000 114.745 152.000 128.000 C 152.000 141.255 141.255 152.000 128.000 152.000 ZM 201.710 159.140 C 198.273 167.266 193.515 174.767 187.630 181.340 C 184.665 184.548 179.674 184.785 176.419 181.871 C 173.164 178.957 172.848 173.971 175.710 170.670 C 197.460 146.385 197.460 109.625 175.710 85.340 C 173.750 83.219 173.085 80.205 173.971 77.456 C 174.857 74.707 177.156 72.649 179.986 72.072 C 182.816 71.494 185.738 72.487 187.630 74.670 C 208.249 97.742 213.730 130.628 201.710 159.140 ZM 69.000 103.090 C 59.365 125.898 63.750 152.218 80.260 170.670 C 83.122 173.971 82.806 178.957 79.551 181.871 C 76.296 184.785 71.305 184.548 68.340 181.340 C 41.144 150.984 41.144 105.026 68.340 74.670 C 71.286 71.370 76.350 71.084 79.650 74.030 C 82.950 76.976 83.236 82.040 80.290 85.340 C 75.570 90.591 71.755 96.589 69.000 103.090 ZM 248.000 128.000 C 248.049 159.417 235.731 189.592 213.710 212.000 C 211.727 214.120 208.750 215.000 205.933 214.298 C 203.116 213.596 200.900 211.423 200.144 208.620 C 199.387 205.817 200.209 202.824 202.290 200.800 C 241.956 160.387 241.956 95.653 202.290 55.240 C 199.186 52.086 199.226 47.014 202.380 43.910 C 205.534 40.806 210.606 40.846 213.710 44.000 C 235.731 66.408 248.049 96.583 248.000 128.000 ZM 53.710 200.780 C 56.808 203.934 56.764 209.002 53.610 212.100 C 50.456 215.198 45.388 215.154 42.290 212.000 C -3.517 165.367 -3.517 90.633 42.290 44.000 C 44.273 41.880 47.250 41.000 50.067 41.702 C 52.884 42.404 55.100 44.577 55.856 47.380 C 56.613 50.183 55.791 53.176 53.710 55.200 C 14.044 95.613 14.044 160.347 53.710 200.760 Z"),
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
        return _broadcast!!
    }

private var _broadcast: ImageVector? = null
