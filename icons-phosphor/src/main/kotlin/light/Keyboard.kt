package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Keyboard: ImageVector
    get() {
        if (_keyboard != null) return _keyboard!!
        _keyboard = phosphorLightIcon(
            name = "Keyboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 50.000 L 32.000 50.000 C 24.268 50.000 18.000 56.268 18.000 64.000 L 18.000 192.000 C 18.000 199.732 24.268 206.000 32.000 206.000 L 224.000 206.000 C 231.732 206.000 238.000 199.732 238.000 192.000 L 238.000 64.000 C 238.000 56.268 231.732 50.000 224.000 50.000 ZM 226.000 192.000 C 226.000 193.105 225.105 194.000 224.000 194.000 L 32.000 194.000 C 30.895 194.000 30.000 193.105 30.000 192.000 L 30.000 64.000 C 30.000 62.895 30.895 62.000 32.000 62.000 L 224.000 62.000 C 225.105 62.000 226.000 62.895 226.000 64.000 ZM 206.000 128.000 C 206.000 131.314 203.314 134.000 200.000 134.000 L 56.000 134.000 C 52.686 134.000 50.000 131.314 50.000 128.000 C 50.000 124.686 52.686 122.000 56.000 122.000 L 200.000 122.000 C 203.314 122.000 206.000 124.686 206.000 128.000 ZM 206.000 96.000 C 206.000 99.314 203.314 102.000 200.000 102.000 L 56.000 102.000 C 52.686 102.000 50.000 99.314 50.000 96.000 C 50.000 92.686 52.686 90.000 56.000 90.000 L 200.000 90.000 C 203.314 90.000 206.000 92.686 206.000 96.000 ZM 70.000 160.000 C 70.000 163.314 67.314 166.000 64.000 166.000 L 56.000 166.000 C 52.686 166.000 50.000 163.314 50.000 160.000 C 50.000 156.686 52.686 154.000 56.000 154.000 L 64.000 154.000 C 67.314 154.000 70.000 156.686 70.000 160.000 ZM 166.000 160.000 C 166.000 163.314 163.314 166.000 160.000 166.000 L 96.000 166.000 C 92.686 166.000 90.000 163.314 90.000 160.000 C 90.000 156.686 92.686 154.000 96.000 154.000 L 160.000 154.000 C 163.314 154.000 166.000 156.686 166.000 160.000 ZM 206.000 160.000 C 206.000 163.314 203.314 166.000 200.000 166.000 L 192.000 166.000 C 188.686 166.000 186.000 163.314 186.000 160.000 C 186.000 156.686 188.686 154.000 192.000 154.000 L 200.000 154.000 C 203.314 154.000 206.000 156.686 206.000 160.000 Z"),
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
        return _keyboard!!
    }

private var _keyboard: ImageVector? = null
