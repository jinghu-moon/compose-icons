package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Parallelogram: ImageVector
    get() {
        if (_parallelogram != null) return _parallelogram!!
        _parallelogram = phosphorThinIcon(
            name = "Parallelogram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M242.07 49.48C239.859 46.064 236.069 44.001 232 44h-143.19c-4.744-.022-9.055 2.753-11 7.08l-64.8 144c-1.672 3.72-1.34 8.036 .881 11.457 2.222 3.421 6.029 5.479 10.109 5.463h143.19c4.726 .002 9.012-2.77 10.95-7.08l64.8-144c1.67-3.714 1.342-8.021-.87-11.44ZM235.64 57.64l-64.8 144c-.646 1.437-2.075 2.361-3.65 2.36h-143.19c-1.357 .001-2.622-.687-3.36-1.827-.737-1.14-.847-2.575-.29-3.813l64.8-144c.647-1.44 2.081-2.365 3.66-2.36h143.19c1.357-.001 2.622 .687 3.36 1.827 .737 1.14 .847 2.575 .29 3.813Z"),
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
        return _parallelogram!!
    }

private var _parallelogram: ImageVector? = null
