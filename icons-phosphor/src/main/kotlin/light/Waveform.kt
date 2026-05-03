package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Waveform: ImageVector
    get() {
        if (_waveform != null) return _waveform!!
        _waveform = phosphorLightIcon(
            name = "Waveform",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 54.000 96.000 L 54.000 160.000 C 54.000 163.314 51.314 166.000 48.000 166.000 C 44.686 166.000 42.000 163.314 42.000 160.000 L 42.000 96.000 C 42.000 92.686 44.686 90.000 48.000 90.000 C 51.314 90.000 54.000 92.686 54.000 96.000 ZM 88.000 26.000 C 84.686 26.000 82.000 28.686 82.000 32.000 L 82.000 224.000 C 82.000 227.314 84.686 230.000 88.000 230.000 C 91.314 230.000 94.000 227.314 94.000 224.000 L 94.000 32.000 C 94.000 28.686 91.314 26.000 88.000 26.000 ZM 128.000 58.000 C 124.686 58.000 122.000 60.686 122.000 64.000 L 122.000 192.000 C 122.000 195.314 124.686 198.000 128.000 198.000 C 131.314 198.000 134.000 195.314 134.000 192.000 L 134.000 64.000 C 134.000 60.686 131.314 58.000 128.000 58.000 ZM 168.000 90.000 C 164.686 90.000 162.000 92.686 162.000 96.000 L 162.000 160.000 C 162.000 163.314 164.686 166.000 168.000 166.000 C 171.314 166.000 174.000 163.314 174.000 160.000 L 174.000 96.000 C 174.000 92.686 171.314 90.000 168.000 90.000 ZM 208.000 74.000 C 204.686 74.000 202.000 76.686 202.000 80.000 L 202.000 176.000 C 202.000 179.314 204.686 182.000 208.000 182.000 C 211.314 182.000 214.000 179.314 214.000 176.000 L 214.000 80.000 C 214.000 76.686 211.314 74.000 208.000 74.000 Z"),
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
        return _waveform!!
    }

private var _waveform: ImageVector? = null
