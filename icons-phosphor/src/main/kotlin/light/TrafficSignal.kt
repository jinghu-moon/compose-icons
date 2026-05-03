package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TrafficSignal: ImageVector
    get() {
        if (_trafficSignal != null) return _trafficSignal!!
        _trafficSignal = phosphorLightIcon(
            name = "TrafficSignal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 58.000 C 111.431 58.000 98.000 71.431 98.000 88.000 C 98.000 104.569 111.431 118.000 128.000 118.000 C 144.569 118.000 158.000 104.569 158.000 88.000 C 158.000 71.431 144.569 58.000 128.000 58.000 ZM 128.000 106.000 C 118.059 106.000 110.000 97.941 110.000 88.000 C 110.000 78.059 118.059 70.000 128.000 70.000 C 137.941 70.000 146.000 78.059 146.000 88.000 C 146.000 97.941 137.941 106.000 128.000 106.000 ZM 128.000 138.000 C 111.431 138.000 98.000 151.431 98.000 168.000 C 98.000 184.569 111.431 198.000 128.000 198.000 C 144.569 198.000 158.000 184.569 158.000 168.000 C 158.000 151.431 144.569 138.000 128.000 138.000 ZM 128.000 186.000 C 118.059 186.000 110.000 177.941 110.000 168.000 C 110.000 158.059 118.059 150.000 128.000 150.000 C 137.941 150.000 146.000 158.059 146.000 168.000 C 146.000 177.941 137.941 186.000 128.000 186.000 ZM 216.000 146.000 L 198.000 146.000 L 198.000 78.000 L 216.000 78.000 C 219.314 78.000 222.000 75.314 222.000 72.000 C 222.000 68.686 219.314 66.000 216.000 66.000 L 198.000 66.000 L 198.000 40.000 C 198.000 32.268 191.732 26.000 184.000 26.000 L 72.000 26.000 C 64.268 26.000 58.000 32.268 58.000 40.000 L 58.000 66.000 L 40.000 66.000 C 36.686 66.000 34.000 68.686 34.000 72.000 C 34.000 75.314 36.686 78.000 40.000 78.000 L 58.000 78.000 L 58.000 146.000 L 40.000 146.000 C 36.686 146.000 34.000 148.686 34.000 152.000 C 34.000 155.314 36.686 158.000 40.000 158.000 L 58.000 158.000 L 58.000 216.000 C 58.000 223.732 64.268 230.000 72.000 230.000 L 184.000 230.000 C 191.732 230.000 198.000 223.732 198.000 216.000 L 198.000 158.000 L 216.000 158.000 C 219.314 158.000 222.000 155.314 222.000 152.000 C 222.000 148.686 219.314 146.000 216.000 146.000 ZM 186.000 216.000 C 186.000 217.105 185.105 218.000 184.000 218.000 L 72.000 218.000 C 70.895 218.000 70.000 217.105 70.000 216.000 L 70.000 40.000 C 70.000 38.895 70.895 38.000 72.000 38.000 L 184.000 38.000 C 185.105 38.000 186.000 38.895 186.000 40.000 Z"),
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
        return _trafficSignal!!
    }

private var _trafficSignal: ImageVector? = null
