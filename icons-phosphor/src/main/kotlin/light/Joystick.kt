package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Joystick: ImageVector
    get() {
        if (_joystick != null) return _joystick!!
        _joystick = phosphorLightIcon(
            name = "Joystick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 146.000 L 134.000 146.000 L 134.000 93.520 C 153.571 90.391 167.450 72.745 165.881 52.987 C 164.311 33.230 147.820 17.997 128.000 17.997 C 108.180 17.997 91.689 33.230 90.119 52.987 C 88.550 72.745 102.429 90.391 122.000 93.520 L 122.000 146.000 L 48.000 146.000 C 40.268 146.000 34.000 152.268 34.000 160.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 160.000 C 222.000 152.268 215.732 146.000 208.000 146.000 ZM 102.000 56.000 C 102.000 41.641 113.641 30.000 128.000 30.000 C 142.359 30.000 154.000 41.641 154.000 56.000 C 154.000 70.359 142.359 82.000 128.000 82.000 C 113.641 82.000 102.000 70.359 102.000 56.000 ZM 210.000 208.000 C 210.000 209.105 209.105 210.000 208.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 160.000 C 46.000 158.895 46.895 158.000 48.000 158.000 L 208.000 158.000 C 209.105 158.000 210.000 158.895 210.000 160.000 ZM 168.000 114.000 L 200.000 114.000 C 203.314 114.000 206.000 116.686 206.000 120.000 C 206.000 123.314 203.314 126.000 200.000 126.000 L 168.000 126.000 C 164.686 126.000 162.000 123.314 162.000 120.000 C 162.000 116.686 164.686 114.000 168.000 114.000 Z"),
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
        return _joystick!!
    }

private var _joystick: ImageVector? = null
