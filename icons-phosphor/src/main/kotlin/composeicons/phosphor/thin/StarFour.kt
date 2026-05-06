package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.StarFour: ImageVector
    get() {
        if (_starFour != null) return _starFour!!
        _starFour = phosphorThinIcon(
            name = "StarFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228.13 116.77 162.94 93.06 139.23 27.87C137.512 23.148 133.024 20.005 128 20.005c-5.024 0-9.512 3.143-11.23 7.865L93.06 93.06 27.87 116.77c-4.722 1.718-7.865 6.206-7.865 11.23 0 5.024 3.143 9.512 7.865 11.23l65.19 23.71 23.71 65.19c1.718 4.722 6.206 7.865 11.23 7.865 5.024 0 9.512-3.143 11.23-7.865l23.71-65.19 65.19-23.71c4.722-1.718 7.865-6.206 7.865-11.23 0-5.024-3.143-9.512-7.865-11.23ZM225.4 131.77l-67 24.34c-1.111 .404-1.986 1.279-2.39 2.39l-24.34 67c-.603 1.527-2.078 2.53-3.72 2.53-1.642 0-3.117-1.003-3.72-2.53l-24.34-67c-.404-1.111-1.279-1.986-2.39-2.39L30.6 131.72c-1.527-.603-2.53-2.078-2.53-3.72 0-1.642 1.003-3.117 2.53-3.72L97.55 99.94c1.111-.404 1.986-1.279 2.39-2.39L124.28 30.6c.603-1.527 2.078-2.53 3.72-2.53 1.642 0 3.117 1.003 3.72 2.53l24.34 66.95c.404 1.111 1.279 1.986 2.39 2.39l67 24.34c1.527 .603 2.53 2.078 2.53 3.72 0 1.642-1.003 3.117-2.53 3.72Z"),
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
        return _starFour!!
    }

private var _starFour: ImageVector? = null
