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
                pathData = parseSvgPathData("M208 146h-74v-52.48c19.571-3.129 33.45-20.775 31.881-40.533C164.311 33.23 147.82 17.997 128 17.997c-19.82 0-36.311 15.233-37.881 34.991C88.55 72.745 102.429 90.391 122 93.52v52.48h-74c-7.732 0-14 6.268-14 14v48c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-48c0-7.732-6.268-14-14-14ZM102 56c0-14.359 11.641-26 26-26 14.359 0 26 11.641 26 26 0 14.359-11.641 26-26 26C113.641 82 102 70.359 102 56ZM210 208c0 1.105-.895 2-2 2h-160c-1.105 0-2-.895-2-2v-48c0-1.105 .895-2 2-2h160c1.105 0 2 .895 2 2ZM168 114h32c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-32c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6Z"),
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
