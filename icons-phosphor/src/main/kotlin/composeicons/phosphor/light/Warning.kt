package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Warning: ImageVector
    get() {
        if (_warning != null) return _warning!!
        _warning = phosphorLightIcon(
            name = "Warning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.07 189.09 147.61 37.22h0C143.523 30.27 136.062 26.003 128 26.003c-8.062 0-15.523 4.267-19.61 11.217L20.93 189.09c-3.92 6.71-3.92 15.01 0 21.72 4.035 7.003 11.538 11.282 19.62 11.19h174.9c8.075 .085 15.568-4.193 19.6-11.19 3.926-6.706 3.933-15.007 .02-21.72ZM224.66 204.8c-1.903 3.272-5.425 5.261-9.21 5.2h-174.9c-3.785 .061-7.307-1.928-9.21-5.2-1.781-2.995-1.781-6.725 0-9.72L118.79 43.21c1.945-3.23 5.439-5.206 9.21-5.206 3.771 0 7.265 1.975 9.21 5.206l87.46 151.87c1.778 2.997 1.774 6.727-.01 9.72ZM122 144v-40c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v40c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6ZM138 180c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10Z"),
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
        return _warning!!
    }

private var _warning: ImageVector? = null
