package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Microphone: ImageVector
    get() {
        if (_microphone != null) return _microphone!!
        _microphone = phosphorLightIcon(
            name = "Microphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 174.000 C 153.391 173.967 173.967 153.391 174.000 128.000 L 174.000 64.000 C 174.000 38.595 153.405 18.000 128.000 18.000 C 102.595 18.000 82.000 38.595 82.000 64.000 L 82.000 128.000 C 82.033 153.391 102.609 173.967 128.000 174.000 ZM 94.000 64.000 C 94.000 45.222 109.222 30.000 128.000 30.000 C 146.778 30.000 162.000 45.222 162.000 64.000 L 162.000 128.000 C 162.000 146.778 146.778 162.000 128.000 162.000 C 109.222 162.000 94.000 146.778 94.000 128.000 ZM 134.000 205.750 L 134.000 240.000 C 134.000 243.314 131.314 246.000 128.000 246.000 C 124.686 246.000 122.000 243.314 122.000 240.000 L 122.000 205.750 C 81.397 202.574 50.053 168.727 50.000 128.000 C 50.000 124.686 52.686 122.000 56.000 122.000 C 59.314 122.000 62.000 124.686 62.000 128.000 C 62.000 164.451 91.549 194.000 128.000 194.000 C 164.451 194.000 194.000 164.451 194.000 128.000 C 194.000 124.686 196.686 122.000 200.000 122.000 C 203.314 122.000 206.000 124.686 206.000 128.000 C 205.947 168.727 174.603 202.574 134.000 205.750 Z"),
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
        return _microphone!!
    }

private var _microphone: ImageVector? = null
