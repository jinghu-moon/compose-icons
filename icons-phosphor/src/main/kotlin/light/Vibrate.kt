package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Vibrate: ImageVector
    get() {
        if (_vibrate != null) return _vibrate!!
        _vibrate = phosphorLightIcon(
            name = "Vibrate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 160.000 34.000 L 96.000 34.000 C 83.850 34.000 74.000 43.850 74.000 56.000 L 74.000 200.000 C 74.000 212.150 83.850 222.000 96.000 222.000 L 160.000 222.000 C 172.150 222.000 182.000 212.150 182.000 200.000 L 182.000 56.000 C 182.000 43.850 172.150 34.000 160.000 34.000 ZM 170.000 200.000 C 170.000 205.523 165.523 210.000 160.000 210.000 L 96.000 210.000 C 90.477 210.000 86.000 205.523 86.000 200.000 L 86.000 56.000 C 86.000 50.477 90.477 46.000 96.000 46.000 L 160.000 46.000 C 165.523 46.000 170.000 50.477 170.000 56.000 ZM 214.000 88.000 L 214.000 168.000 C 214.000 171.314 211.314 174.000 208.000 174.000 C 204.686 174.000 202.000 171.314 202.000 168.000 L 202.000 88.000 C 202.000 84.686 204.686 82.000 208.000 82.000 C 211.314 82.000 214.000 84.686 214.000 88.000 ZM 246.000 104.000 L 246.000 152.000 C 246.000 155.314 243.314 158.000 240.000 158.000 C 236.686 158.000 234.000 155.314 234.000 152.000 L 234.000 104.000 C 234.000 100.686 236.686 98.000 240.000 98.000 C 243.314 98.000 246.000 100.686 246.000 104.000 ZM 54.000 88.000 L 54.000 168.000 C 54.000 171.314 51.314 174.000 48.000 174.000 C 44.686 174.000 42.000 171.314 42.000 168.000 L 42.000 88.000 C 42.000 84.686 44.686 82.000 48.000 82.000 C 51.314 82.000 54.000 84.686 54.000 88.000 ZM 22.000 104.000 L 22.000 152.000 C 22.000 155.314 19.314 158.000 16.000 158.000 C 12.686 158.000 10.000 155.314 10.000 152.000 L 10.000 104.000 C 10.000 100.686 12.686 98.000 16.000 98.000 C 19.314 98.000 22.000 100.686 22.000 104.000 Z"),
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
        return _vibrate!!
    }

private var _vibrate: ImageVector? = null
