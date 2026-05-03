package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Flashlight: ImageVector
    get() {
        if (_flashlight != null) return _flashlight!!
        _flashlight = phosphorLightIcon(
            name = "Flashlight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 184.000 18.000 L 72.000 18.000 C 64.268 18.000 58.000 24.268 58.000 32.000 L 58.000 77.330 C 58.000 80.359 58.982 83.307 60.800 85.730 L 81.600 113.460 C 81.862 113.809 82.002 114.234 82.000 114.670 L 82.000 224.000 C 82.000 231.732 88.268 238.000 96.000 238.000 L 160.000 238.000 C 167.732 238.000 174.000 231.732 174.000 224.000 L 174.000 114.670 C 174.000 114.237 174.140 113.816 174.400 113.470 L 195.200 85.730 C 197.018 83.307 198.000 80.359 198.000 77.330 L 198.000 32.000 C 198.000 24.268 191.732 18.000 184.000 18.000 ZM 72.000 30.000 L 184.000 30.000 C 185.105 30.000 186.000 30.895 186.000 32.000 L 186.000 58.000 L 70.000 58.000 L 70.000 32.000 C 70.000 30.895 70.895 30.000 72.000 30.000 ZM 185.600 78.530 L 164.800 106.270 C 162.982 108.693 162.000 111.641 162.000 114.670 L 162.000 224.000 C 162.000 225.105 161.105 226.000 160.000 226.000 L 96.000 226.000 C 94.895 226.000 94.000 225.105 94.000 224.000 L 94.000 114.670 C 94.000 111.641 93.018 108.693 91.200 106.270 L 70.400 78.540 C 70.138 78.191 69.998 77.766 70.000 77.330 L 70.000 70.000 L 186.000 70.000 L 186.000 77.330 C 186.000 77.763 185.860 78.184 185.600 78.530 ZM 134.000 120.000 L 134.000 152.000 C 134.000 155.314 131.314 158.000 128.000 158.000 C 124.686 158.000 122.000 155.314 122.000 152.000 L 122.000 120.000 C 122.000 116.686 124.686 114.000 128.000 114.000 C 131.314 114.000 134.000 116.686 134.000 120.000 Z"),
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
        return _flashlight!!
    }

private var _flashlight: ImageVector? = null
