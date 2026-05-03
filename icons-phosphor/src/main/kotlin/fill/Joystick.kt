package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Joystick: ImageVector
    get() {
        if (_joystick != null) return _joystick!!
        _joystick = phosphorFillIcon(
            name = "Joystick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 160.000 L 224.000 208.000 C 224.000 216.837 216.837 224.000 208.000 224.000 L 48.000 224.000 C 39.163 224.000 32.000 216.837 32.000 208.000 L 32.000 160.000 C 32.000 151.163 39.163 144.000 48.000 144.000 L 120.000 144.000 L 120.000 95.190 C 99.880 91.083 86.139 72.408 88.203 51.978 C 90.266 31.547 107.465 15.998 128.000 15.998 C 148.535 15.998 165.734 31.547 167.797 51.978 C 169.861 72.408 156.120 91.083 136.000 95.190 L 136.000 144.000 L 208.000 144.000 C 216.837 144.000 224.000 151.163 224.000 160.000 ZM 160.000 120.000 C 160.000 124.418 163.582 128.000 168.000 128.000 L 200.000 128.000 C 204.418 128.000 208.000 124.418 208.000 120.000 C 208.000 115.582 204.418 112.000 200.000 112.000 L 168.000 112.000 C 163.582 112.000 160.000 115.582 160.000 120.000 Z"),
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
