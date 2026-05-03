package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Invoice: ImageVector
    get() {
        if (_invoice != null) return _invoice!!
        _invoice = phosphorLightIcon(
            name = "Invoice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 28.000 126.000 C 24.686 126.000 22.000 123.314 22.000 120.000 C 22.000 116.686 24.686 114.000 28.000 114.000 L 56.000 114.000 C 61.523 114.000 66.000 109.523 66.000 104.000 C 66.000 98.477 61.523 94.000 56.000 94.000 L 40.000 94.000 C 27.850 94.000 18.000 84.150 18.000 72.000 C 18.000 59.850 27.850 50.000 40.000 50.000 L 42.000 50.000 L 42.000 48.000 C 42.000 44.686 44.686 42.000 48.000 42.000 C 51.314 42.000 54.000 44.686 54.000 48.000 L 54.000 50.000 L 64.000 50.000 C 67.314 50.000 70.000 52.686 70.000 56.000 C 70.000 59.314 67.314 62.000 64.000 62.000 L 40.000 62.000 C 34.477 62.000 30.000 66.477 30.000 72.000 C 30.000 77.523 34.477 82.000 40.000 82.000 L 56.000 82.000 C 68.150 82.000 78.000 91.850 78.000 104.000 C 78.000 116.150 68.150 126.000 56.000 126.000 L 54.000 126.000 L 54.000 128.000 C 54.000 131.314 51.314 134.000 48.000 134.000 C 44.686 134.000 42.000 131.314 42.000 128.000 L 42.000 126.000 ZM 230.000 56.000 L 230.000 192.000 C 230.000 199.732 223.732 206.000 216.000 206.000 L 40.000 206.000 C 32.268 206.000 26.000 199.732 26.000 192.000 L 26.000 152.000 C 26.000 148.686 28.686 146.000 32.000 146.000 C 35.314 146.000 38.000 148.686 38.000 152.000 L 38.000 192.000 C 38.000 193.105 38.895 194.000 40.000 194.000 L 162.000 194.000 L 162.000 158.000 L 80.000 158.000 C 76.686 158.000 74.000 155.314 74.000 152.000 C 74.000 148.686 76.686 146.000 80.000 146.000 L 162.000 146.000 L 162.000 110.000 L 104.000 110.000 C 100.686 110.000 98.000 107.314 98.000 104.000 C 98.000 100.686 100.686 98.000 104.000 98.000 L 218.000 98.000 L 218.000 62.000 L 96.000 62.000 C 92.686 62.000 90.000 59.314 90.000 56.000 C 90.000 52.686 92.686 50.000 96.000 50.000 L 224.000 50.000 C 227.314 50.000 230.000 52.686 230.000 56.000 ZM 174.000 146.000 L 218.000 146.000 L 218.000 110.000 L 174.000 110.000 ZM 218.000 192.000 L 218.000 158.000 L 174.000 158.000 L 174.000 194.000 L 216.000 194.000 C 217.105 194.000 218.000 193.105 218.000 192.000 Z"),
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
        return _invoice!!
    }

private var _invoice: ImageVector? = null
