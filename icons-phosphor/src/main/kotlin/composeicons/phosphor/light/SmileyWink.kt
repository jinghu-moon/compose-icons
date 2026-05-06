package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SmileyWink: ImageVector
    get() {
        if (_smileyWink != null) return _smileyWink!!
        _smileyWink = phosphorLightIcon(
            name = "SmileyWink",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM128 218C78.294 218 38 177.706 38 128 38 78.294 78.294 38 128 38c49.706 0 90 40.294 90 90-.055 49.683-40.317 89.945-90 90ZM82 108c0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10ZM182 108c0 3.314-2.686 6-6 6h-24c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h24c3.314 0 6 2.686 6 6ZM173.19 155c-9.92 17.16-26.39 27-45.19 27-18.8 0-35.27-9.84-45.19-27-1.49-2.849-.47-6.367 2.314-7.976 2.784-1.609 6.341-.738 8.066 1.976 7.84 13.54 20.2 21 34.81 21 14.61 0 27-7.46 34.81-21 1.022-1.953 3.032-3.188 5.235-3.218 2.204-.03 4.246 1.151 5.32 3.075 1.074 1.925 1.007 4.283-.176 6.143Z"),
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
        return _smileyWink!!
    }

private var _smileyWink: ImageVector? = null
