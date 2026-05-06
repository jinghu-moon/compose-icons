package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Eject: ImageVector
    get() {
        if (_eject != null) return _eject!!
        _eject = phosphorBoldIcon(
            name = "Eject",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 152h-160c-11.046 0-20 8.954-20 20v20c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-20c0-11.046-8.954-20-20-20ZM204 188h-152v-12h152ZM48.27 136h159.46c8.118-.008 15.448-4.858 18.629-12.327 3.181-7.468 1.6-16.114-4.019-21.973L148.58 24.78C143.203 19.171 135.77 16 128 16c-7.77 0-15.203 3.171-20.58 8.78L33.66 101.7c-5.619 5.859-7.2 14.505-4.019 21.973 3.181 7.468 10.511 12.319 18.629 12.327ZM124.75 41.39c.847-.889 2.022-1.392 3.25-1.392 1.228 0 2.403 .503 3.25 1.392L199 112h-142Z"),
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
        return _eject!!
    }

private var _eject: ImageVector? = null
