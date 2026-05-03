package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Pi: ImageVector
    get() {
        if (_pi != null) return _pi!!
        _pi = phosphorLightIcon(
            name = "Pi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 230.000 172.000 C 230.000 190.778 214.778 206.000 196.000 206.000 C 177.222 206.000 162.000 190.778 162.000 172.000 L 162.000 70.000 L 94.000 70.000 L 94.000 200.000 C 94.000 203.314 91.314 206.000 88.000 206.000 C 84.686 206.000 82.000 203.314 82.000 200.000 L 82.000 70.000 L 72.000 70.000 C 48.804 70.000 30.000 88.804 30.000 112.000 C 30.000 115.314 27.314 118.000 24.000 118.000 C 20.686 118.000 18.000 115.314 18.000 112.000 C 18.033 82.190 42.190 58.033 72.000 58.000 L 224.000 58.000 C 227.314 58.000 230.000 60.686 230.000 64.000 C 230.000 67.314 227.314 70.000 224.000 70.000 L 174.000 70.000 L 174.000 172.000 C 174.000 184.150 183.850 194.000 196.000 194.000 C 208.150 194.000 218.000 184.150 218.000 172.000 C 218.000 168.686 220.686 166.000 224.000 166.000 C 227.314 166.000 230.000 168.686 230.000 172.000 Z"),
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
        return _pi!!
    }

private var _pi: ImageVector? = null
