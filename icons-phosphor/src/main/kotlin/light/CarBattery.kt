package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CarBattery: ImageVector
    get() {
        if (_carBattery != null) return _carBattery!!
        _carBattery = phosphorLightIcon(
            name = "CarBattery",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 190.000 136.000 C 190.000 139.314 187.314 142.000 184.000 142.000 L 174.000 142.000 L 174.000 152.000 C 174.000 155.314 171.314 158.000 168.000 158.000 C 164.686 158.000 162.000 155.314 162.000 152.000 L 162.000 142.000 L 152.000 142.000 C 148.686 142.000 146.000 139.314 146.000 136.000 C 146.000 132.686 148.686 130.000 152.000 130.000 L 162.000 130.000 L 162.000 120.000 C 162.000 116.686 164.686 114.000 168.000 114.000 C 171.314 114.000 174.000 116.686 174.000 120.000 L 174.000 130.000 L 184.000 130.000 C 187.314 130.000 190.000 132.686 190.000 136.000 ZM 104.000 130.000 L 72.000 130.000 C 68.686 130.000 66.000 132.686 66.000 136.000 C 66.000 139.314 68.686 142.000 72.000 142.000 L 104.000 142.000 C 107.314 142.000 110.000 139.314 110.000 136.000 C 110.000 132.686 107.314 130.000 104.000 130.000 ZM 238.000 88.000 L 238.000 184.000 C 238.000 191.732 231.732 198.000 224.000 198.000 L 32.000 198.000 C 24.268 198.000 18.000 191.732 18.000 184.000 L 18.000 88.000 C 18.000 80.268 24.268 74.000 32.000 74.000 L 50.000 74.000 L 50.000 56.000 C 50.000 48.268 56.268 42.000 64.000 42.000 L 96.000 42.000 C 103.732 42.000 110.000 48.268 110.000 56.000 L 110.000 74.000 L 146.000 74.000 L 146.000 56.000 C 146.000 48.268 152.268 42.000 160.000 42.000 L 192.000 42.000 C 199.732 42.000 206.000 48.268 206.000 56.000 L 206.000 74.000 L 224.000 74.000 C 231.732 74.000 238.000 80.268 238.000 88.000 ZM 158.000 74.000 L 194.000 74.000 L 194.000 56.000 C 194.000 54.895 193.105 54.000 192.000 54.000 L 160.000 54.000 C 158.895 54.000 158.000 54.895 158.000 56.000 ZM 62.000 74.000 L 98.000 74.000 L 98.000 56.000 C 98.000 54.895 97.105 54.000 96.000 54.000 L 64.000 54.000 C 62.895 54.000 62.000 54.895 62.000 56.000 ZM 226.000 88.000 C 226.000 86.895 225.105 86.000 224.000 86.000 L 32.000 86.000 C 30.895 86.000 30.000 86.895 30.000 88.000 L 30.000 184.000 C 30.000 185.105 30.895 186.000 32.000 186.000 L 224.000 186.000 C 225.105 186.000 226.000 185.105 226.000 184.000 Z"),
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
        return _carBattery!!
    }

private var _carBattery: ImageVector? = null
