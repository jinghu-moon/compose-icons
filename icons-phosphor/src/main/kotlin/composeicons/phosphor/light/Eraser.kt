package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Eraser: ImageVector
    get() {
        if (_eraser != null) return _eraser!!
        _eraser = phosphorLightIcon(
            name = "Eraser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M223.57 81.81 182.19 40.43c-4.126-4.128-9.723-6.447-15.56-6.447-5.837 0-11.434 2.319-15.56 6.447L32.43 159.07c-8.59 8.591-8.59 22.519 0 31.11l30.07 30.06c1.124 1.126 2.649 1.759 4.24 1.76h149.26c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-89.51l97.08-97.08c8.59-8.591 8.59-22.519 0-31.11ZM109.51 210h-40.29L40.92 181.7c-1.878-1.876-2.933-4.421-2.933-7.075 0-2.654 1.055-5.199 2.933-7.075L96 112.48 151.52 168ZM215.08 104.44 160 159.51 104.48 104 159.56 48.93c3.905-3.904 10.235-3.904 14.14 0l41.38 41.37c3.904 3.905 3.904 10.235 0 14.14Z"),
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
        return _eraser!!
    }

private var _eraser: ImageVector? = null
