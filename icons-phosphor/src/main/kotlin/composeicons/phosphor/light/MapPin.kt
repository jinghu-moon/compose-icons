package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MapPin: ImageVector
    get() {
        if (_mapPin != null) return _mapPin!!
        _mapPin = phosphorLightIcon(
            name = "MapPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 66C107.013 66 90 83.013 90 104c0 20.987 17.013 38 38 38 20.987 0 38-17.013 38-38C166 83.013 148.987 66 128 66ZM128 130c-14.359 0-26-11.641-26-26 0-14.359 11.641-26 26-26 14.359 0 26 11.641 26 26 0 14.359-11.641 26-26 26ZM128 18C80.526 18.055 42.055 56.526 42 104c0 30.91 14.34 63.74 41.47 94.94 12.245 14.151 26.027 26.896 41.09 38 2.066 1.445 4.814 1.445 6.88 0 15.063-11.104 28.845-23.849 41.09-38C199.66 167.74 214 134.94 214 104 213.945 56.526 175.474 18.055 128 18ZM128 224.51C113 212.93 54 163.62 54 104 54 63.131 87.131 30 128 30c40.869 0 74 33.131 74 74 0 59.62-59 108.93-74 120.51Z"),
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
        return _mapPin!!
    }

private var _mapPin: ImageVector? = null
