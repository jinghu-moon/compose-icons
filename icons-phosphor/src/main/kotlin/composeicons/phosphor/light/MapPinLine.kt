package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MapPinLine: ImageVector
    get() {
        if (_mapPinLine != null) return _mapPinLine!!
        _mapPinLine = phosphorLightIcon(
            name = "MapPinLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 226h-54.78c9.743-8.35 18.87-17.394 27.31-27.06C199.66 167.74 214 134.94 214 104 214 56.504 175.496 18 128 18 80.504 18 42 56.504 42 104c0 30.91 14.34 63.74 41.47 94.94 8.44 9.666 17.567 18.71 27.31 27.06h-54.78c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h144c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM54 104C54 63.131 87.131 30 128 30c40.869 0 74 33.131 74 74 0 59.62-59 108.93-74 120.51C113 212.93 54 163.62 54 104ZM166 104C166 83.013 148.987 66 128 66 107.013 66 90 83.013 90 104c0 20.987 17.013 38 38 38 20.987 0 38-17.013 38-38ZM102 104c0-14.359 11.641-26 26-26 14.359 0 26 11.641 26 26 0 14.359-11.641 26-26 26-14.359 0-26-11.641-26-26Z"),
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
        return _mapPinLine!!
    }

private var _mapPinLine: ImageVector? = null
