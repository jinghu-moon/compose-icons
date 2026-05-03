package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Stack: ImageVector
    get() {
        if (_stack != null) return _stack!!
        _stack = phosphorLightIcon(
            name = "Stack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 229.180 173.000 C 230.846 175.861 229.879 179.531 227.020 181.200 L 131.020 237.200 C 129.164 238.272 126.876 238.272 125.020 237.200 L 29.020 181.200 C 26.404 179.436 25.601 175.948 27.182 173.218 C 28.763 170.488 32.188 169.449 35.020 170.840 L 128.020 225.070 L 221.020 170.840 C 223.872 169.202 227.512 170.165 229.180 173.000 ZM 221.000 122.820 L 128.000 177.050 L 35.000 122.820 C 32.168 121.429 28.743 122.468 27.162 125.198 C 25.581 127.928 26.384 131.416 29.000 133.180 L 125.000 189.180 C 126.856 190.252 129.144 190.252 131.000 189.180 L 227.000 133.180 C 229.616 131.416 230.419 127.928 228.838 125.198 C 227.257 122.468 223.832 121.429 221.000 122.820 ZM 26.000 80.000 C 26.006 77.862 27.149 75.889 29.000 74.820 L 125.000 18.820 C 126.856 17.748 129.144 17.748 131.000 18.820 L 227.000 74.820 C 228.841 75.896 229.972 77.868 229.972 80.000 C 229.972 82.132 228.841 84.104 227.000 85.180 L 131.000 141.180 C 129.144 142.252 126.856 142.252 125.000 141.180 L 29.000 85.180 C 27.149 84.111 26.006 82.138 26.000 80.000 ZM 43.910 80.000 L 128.000 129.050 L 212.090 80.000 L 128.000 31.000 Z"),
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
        return _stack!!
    }

private var _stack: ImageVector? = null
