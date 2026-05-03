package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DoorOpen: ImageVector
    get() {
        if (_doorOpen != null) return _doorOpen!!
        _doorOpen = phosphorLightIcon(
            name = "DoorOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 218.000 L 206.000 218.000 L 206.000 40.000 C 206.000 32.268 199.732 26.000 192.000 26.000 L 64.000 26.000 C 56.268 26.000 50.000 32.268 50.000 40.000 L 50.000 218.000 L 24.000 218.000 C 20.686 218.000 18.000 220.686 18.000 224.000 C 18.000 227.314 20.686 230.000 24.000 230.000 L 232.000 230.000 C 235.314 230.000 238.000 227.314 238.000 224.000 C 238.000 220.686 235.314 218.000 232.000 218.000 ZM 194.000 40.000 L 194.000 218.000 L 174.000 218.000 L 174.000 38.000 L 192.000 38.000 C 193.105 38.000 194.000 38.895 194.000 40.000 ZM 62.000 40.000 C 62.000 38.895 62.895 38.000 64.000 38.000 L 162.000 38.000 L 162.000 218.000 L 62.000 218.000 ZM 142.000 132.000 C 142.000 137.523 137.523 142.000 132.000 142.000 C 126.477 142.000 122.000 137.523 122.000 132.000 C 122.000 126.477 126.477 122.000 132.000 122.000 C 137.523 122.000 142.000 126.477 142.000 132.000 Z"),
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
        return _doorOpen!!
    }

private var _doorOpen: ImageVector? = null
