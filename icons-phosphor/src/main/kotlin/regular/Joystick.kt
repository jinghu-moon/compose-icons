package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Joystick: ImageVector
    get() {
        if (_joystick != null) return _joystick!!
        _joystick = phosphorRegularIcon(
            name = "Joystick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 144.000 L 136.000 144.000 L 136.000 95.190 C 156.120 91.083 169.861 72.408 167.797 51.978 C 165.734 31.547 148.535 15.998 128.000 15.998 C 107.465 15.998 90.266 31.547 88.203 51.978 C 86.139 72.408 99.880 91.083 120.000 95.190 L 120.000 144.000 L 48.000 144.000 C 39.163 144.000 32.000 151.163 32.000 160.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 160.000 C 224.000 151.163 216.837 144.000 208.000 144.000 ZM 104.000 56.000 C 104.000 42.745 114.745 32.000 128.000 32.000 C 141.255 32.000 152.000 42.745 152.000 56.000 C 152.000 69.255 141.255 80.000 128.000 80.000 C 114.745 80.000 104.000 69.255 104.000 56.000 ZM 208.000 208.000 L 48.000 208.000 L 48.000 160.000 L 208.000 160.000 L 208.000 208.000 ZM 168.000 112.000 L 200.000 112.000 C 204.418 112.000 208.000 115.582 208.000 120.000 C 208.000 124.418 204.418 128.000 200.000 128.000 L 168.000 128.000 C 163.582 128.000 160.000 124.418 160.000 120.000 C 160.000 115.582 163.582 112.000 168.000 112.000 Z"),
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
        return _joystick!!
    }

private var _joystick: ImageVector? = null
