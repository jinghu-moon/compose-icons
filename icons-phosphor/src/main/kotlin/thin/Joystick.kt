package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Joystick: ImageVector
    get() {
        if (_joystick != null) return _joystick!!
        _joystick = phosphorThinIcon(
            name = "Joystick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 148.000 L 132.000 148.000 L 132.000 91.770 C 150.986 89.647 165.007 73.064 163.944 53.990 C 162.881 34.915 147.104 19.993 128.000 19.993 C 108.896 19.993 93.119 34.915 92.056 53.990 C 90.993 73.064 105.014 89.647 124.000 91.770 L 124.000 148.000 L 48.000 148.000 C 41.373 148.000 36.000 153.373 36.000 160.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 160.000 C 220.000 153.373 214.627 148.000 208.000 148.000 ZM 100.000 56.000 C 100.000 40.536 112.536 28.000 128.000 28.000 C 143.464 28.000 156.000 40.536 156.000 56.000 C 156.000 71.464 143.464 84.000 128.000 84.000 C 112.536 84.000 100.000 71.464 100.000 56.000 ZM 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 160.000 C 44.000 157.791 45.791 156.000 48.000 156.000 L 208.000 156.000 C 210.209 156.000 212.000 157.791 212.000 160.000 ZM 164.000 120.000 C 164.000 117.791 165.791 116.000 168.000 116.000 L 200.000 116.000 C 202.209 116.000 204.000 117.791 204.000 120.000 C 204.000 122.209 202.209 124.000 200.000 124.000 L 168.000 124.000 C 165.791 124.000 164.000 122.209 164.000 120.000 Z"),
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
