package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Broadcast: ImageVector
    get() {
        if (_broadcast != null) return _broadcast!!
        _broadcast = phosphorFillIcon(
            name = "Broadcast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 168.000 128.000 C 168.000 150.091 150.091 168.000 128.000 168.000 C 105.909 168.000 88.000 150.091 88.000 128.000 C 88.000 105.909 105.909 88.000 128.000 88.000 C 150.091 88.000 168.000 105.909 168.000 128.000 ZM 208.000 128.000 C 208.024 108.319 200.769 89.324 187.630 74.670 C 185.738 72.487 182.816 71.494 179.986 72.072 C 177.156 72.649 174.857 74.707 173.971 77.456 C 173.085 80.205 173.750 83.219 175.710 85.340 C 197.438 109.634 197.438 146.376 175.710 170.670 C 172.848 173.971 173.164 178.957 176.419 181.871 C 179.674 184.785 184.665 184.548 187.630 181.340 C 200.767 166.681 208.022 147.684 208.000 128.000 ZM 80.290 85.340 C 82.250 83.219 82.915 80.205 82.029 77.456 C 81.143 74.707 78.844 72.649 76.014 72.072 C 73.184 71.494 70.262 72.487 68.370 74.670 C 41.179 105.028 41.179 150.982 68.370 181.340 C 71.335 184.548 76.326 184.785 79.581 181.871 C 82.836 178.957 83.152 173.971 80.290 170.670 C 58.540 146.385 58.540 109.625 80.290 85.340 ZM 238.570 81.340 C 232.715 67.435 224.280 54.765 213.710 44.000 C 211.727 41.880 208.750 41.000 205.933 41.702 C 203.116 42.404 200.900 44.577 200.144 47.380 C 199.387 50.183 200.209 53.176 202.290 55.200 C 241.956 95.613 241.956 160.347 202.290 200.760 C 199.186 203.914 199.226 208.986 202.380 212.090 C 205.534 215.194 210.606 215.154 213.710 212.000 C 247.574 177.418 257.375 125.889 238.570 81.290 ZM 32.170 168.480 C 15.824 129.840 24.321 85.162 53.710 55.220 C 56.808 52.066 56.764 46.998 53.610 43.900 C 50.456 40.802 45.388 40.846 42.290 44.000 C -3.517 90.633 -3.517 165.367 42.290 212.000 C 44.273 214.120 47.250 215.000 50.067 214.298 C 52.884 213.596 55.100 211.423 55.856 208.620 C 56.613 205.817 55.791 202.824 53.710 200.800 C 44.557 191.481 37.248 180.515 32.170 168.480 Z"),
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
        return _broadcast!!
    }

private var _broadcast: ImageVector? = null
