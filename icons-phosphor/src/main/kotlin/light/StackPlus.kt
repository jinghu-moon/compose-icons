package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.StackPlus: ImageVector
    get() {
        if (_stackPlus != null) return _stackPlus!!
        _stackPlus = phosphorLightIcon(
            name = "StackPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 238.000 200.000 C 238.000 203.314 235.314 206.000 232.000 206.000 L 214.000 206.000 L 214.000 224.000 C 214.000 227.314 211.314 230.000 208.000 230.000 C 204.686 230.000 202.000 227.314 202.000 224.000 L 202.000 206.000 L 184.000 206.000 C 180.686 206.000 178.000 203.314 178.000 200.000 C 178.000 196.686 180.686 194.000 184.000 194.000 L 202.000 194.000 L 202.000 176.000 C 202.000 172.686 204.686 170.000 208.000 170.000 C 211.314 170.000 214.000 172.686 214.000 176.000 L 214.000 194.000 L 232.000 194.000 C 235.314 194.000 238.000 196.686 238.000 200.000 ZM 221.000 122.820 L 128.000 177.050 L 35.000 122.820 C 32.168 121.429 28.743 122.468 27.162 125.198 C 25.581 127.928 26.384 131.416 29.000 133.180 L 125.000 189.180 C 126.856 190.252 129.144 190.252 131.000 189.180 L 227.000 133.180 C 229.616 131.416 230.419 127.928 228.838 125.198 C 227.257 122.468 223.832 121.429 221.000 122.820 ZM 26.000 80.000 C 26.006 77.862 27.149 75.889 29.000 74.820 L 125.000 18.820 C 126.856 17.748 129.144 17.748 131.000 18.820 L 227.000 74.820 C 228.841 75.896 229.972 77.868 229.972 80.000 C 229.972 82.132 228.841 84.104 227.000 85.180 L 131.000 141.180 C 129.144 142.252 126.856 142.252 125.000 141.180 L 29.000 85.180 C 27.149 84.111 26.006 82.138 26.000 80.000 ZM 43.910 80.000 L 128.000 129.050 L 212.090 80.000 L 128.000 31.000 ZM 141.000 217.480 L 128.000 225.050 L 35.000 170.820 C 32.168 169.429 28.743 170.468 27.162 173.198 C 25.581 175.928 26.384 179.416 29.000 181.180 L 125.000 237.180 C 126.856 238.252 129.144 238.252 131.000 237.180 L 147.000 227.850 C 149.659 226.103 150.492 222.584 148.899 219.831 C 147.306 217.077 143.840 216.045 141.000 217.480 Z"),
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
        return _stackPlus!!
    }

private var _stackPlus: ImageVector? = null
