package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HandPointing: ImageVector
    get() {
        if (_handPointing != null) return _handPointing!!
        _handPointing = phosphorLightIcon(
            name = "HandPointing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 196.000 90.000 C 190.796 89.995 185.711 91.560 181.410 94.490 C 179.604 86.174 173.843 79.269 165.986 76.001 C 158.129 72.733 149.170 73.517 142.000 78.100 L 142.000 44.000 C 142.000 29.641 130.359 18.000 116.000 18.000 C 101.641 18.000 90.000 29.641 90.000 44.000 L 90.000 131.000 L 82.470 118.900 C 75.271 106.474 59.361 102.236 46.935 109.435 C 34.509 116.634 30.271 132.544 37.470 144.970 L 42.140 153.220 C 76.140 213.220 90.210 237.990 136.000 237.990 C 183.474 237.935 221.945 199.464 222.000 151.990 L 222.000 116.000 C 222.000 101.641 210.359 90.000 196.000 90.000 ZM 210.000 152.000 C 209.950 192.849 176.849 225.950 136.000 226.000 C 97.200 226.000 86.000 206.170 52.580 147.310 L 47.890 139.000 L 47.890 139.000 C 44.025 132.309 46.312 123.751 53.000 119.880 C 55.125 118.644 57.541 117.995 60.000 118.000 C 65.011 117.991 69.645 120.660 72.150 125.000 L 72.250 125.170 L 90.930 155.170 C 92.354 157.421 95.091 158.463 97.652 157.730 C 100.212 156.997 101.983 154.663 102.000 152.000 L 102.000 44.000 C 102.000 36.268 108.268 30.000 116.000 30.000 C 123.732 30.000 130.000 36.268 130.000 44.000 L 130.000 112.000 C 130.000 115.314 132.686 118.000 136.000 118.000 C 139.314 118.000 142.000 115.314 142.000 112.000 L 142.000 100.000 C 142.000 92.268 148.268 86.000 156.000 86.000 C 163.732 86.000 170.000 92.268 170.000 100.000 L 170.000 120.000 C 170.000 123.314 172.686 126.000 176.000 126.000 C 179.314 126.000 182.000 123.314 182.000 120.000 L 182.000 116.000 C 182.000 108.268 188.268 102.000 196.000 102.000 C 203.732 102.000 210.000 108.268 210.000 116.000 Z"),
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
        return _handPointing!!
    }

private var _handPointing: ImageVector? = null
