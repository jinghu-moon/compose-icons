package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Headlights: ImageVector
    get() {
        if (_headlights != null) return _headlights!!
        _headlights = phosphorLightIcon(
            name = "Headlights",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 162.000 80.000 C 162.000 76.686 164.686 74.000 168.000 74.000 L 240.000 74.000 C 243.314 74.000 246.000 76.686 246.000 80.000 C 246.000 83.314 243.314 86.000 240.000 86.000 L 168.000 86.000 C 164.686 86.000 162.000 83.314 162.000 80.000 ZM 240.000 170.000 L 168.000 170.000 C 164.686 170.000 162.000 172.686 162.000 176.000 C 162.000 179.314 164.686 182.000 168.000 182.000 L 240.000 182.000 C 243.314 182.000 246.000 179.314 246.000 176.000 C 246.000 172.686 243.314 170.000 240.000 170.000 ZM 240.000 106.000 L 168.000 106.000 C 164.686 106.000 162.000 108.686 162.000 112.000 C 162.000 115.314 164.686 118.000 168.000 118.000 L 240.000 118.000 C 243.314 118.000 246.000 115.314 246.000 112.000 C 246.000 108.686 243.314 106.000 240.000 106.000 ZM 240.000 138.000 L 168.000 138.000 C 164.686 138.000 162.000 140.686 162.000 144.000 C 162.000 147.314 164.686 150.000 168.000 150.000 L 240.000 150.000 C 243.314 150.000 246.000 147.314 246.000 144.000 C 246.000 140.686 243.314 138.000 240.000 138.000 ZM 142.000 64.000 L 142.000 192.000 C 142.000 199.732 135.732 206.000 128.000 206.000 L 88.000 206.000 C 67.210 206.001 47.281 197.702 32.636 182.946 C 17.991 168.190 9.843 148.199 10.000 127.410 C 10.320 84.730 45.710 50.000 88.900 50.000 L 128.000 50.000 C 135.732 50.000 142.000 56.268 142.000 64.000 ZM 130.000 64.000 C 130.000 62.895 129.105 62.000 128.000 62.000 L 88.900 62.000 C 52.280 62.000 22.270 91.380 22.000 127.500 C 21.867 145.091 28.761 162.007 41.153 174.493 C 53.545 186.978 70.409 194.001 88.000 194.000 L 128.000 194.000 C 129.105 194.000 130.000 193.105 130.000 192.000 Z"),
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
        return _headlights!!
    }

private var _headlights: ImageVector? = null
