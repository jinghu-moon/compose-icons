package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Mountains: ImageVector
    get() {
        if (_mountains != null) return _mountains!!
        _mountains = phosphorDuotoneIcon(
            name = "Mountains",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 52c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20C152.954 72 144 63.046 144 52ZM193.44 107.92c-1.44-2.433-4.057-3.926-6.885-3.926-2.828 0-5.445 1.493-6.885 3.926l-33 55.75L125.67 128h-75.32L8 200h240Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M164 80c15.464 0 28-12.536 28-28C192 36.536 179.464 24 164 24c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28ZM164 40c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12ZM254.88 195.92 200.32 103.84C197.456 98.958 192.21 95.971 186.55 96h0c-5.657-.03-10.901 2.958-13.76 7.84L146.63 148 101.79 71.9C98.915 67.014 93.669 64.014 88 64.014c-5.669 0-10.915 3-13.79 7.886L1.11 195.94c-1.457 2.473-1.477 5.537-.053 8.028C2.481 206.46 5.13 207.999 8 208h240c2.874-.001 5.528-1.543 6.95-4.041 1.423-2.498 1.396-5.567-.07-8.039ZM88 80l23.57 40h-47.14ZM22 192 55 136h66l33 56ZM172.57 192 155.91 163.72 186.55 112 234 192Z"),
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
        return _mountains!!
    }

private var _mountains: ImageVector? = null
