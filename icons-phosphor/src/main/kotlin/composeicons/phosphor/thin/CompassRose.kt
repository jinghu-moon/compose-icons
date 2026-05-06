package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CompassRose: ImageVector
    get() {
        if (_compassRose != null) return _compassRose!!
        _compassRose = phosphorThinIcon(
            name = "CompassRose",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M249 124.12l-29.68-7.42c-5.126-41.876-38.124-74.874-80-80L131.88 7C131.434 5.22 129.835 3.972 128 3.972c-1.835 0-3.434 1.248-3.88 3.028l-7.42 29.71c-41.876 5.126-74.874 38.124-80 80L7 124.12c-1.78 .446-3.028 2.045-3.028 3.88 0 1.835 1.248 3.434 3.028 3.88l29.68 7.42c5.126 41.876 38.124 74.874 80 80L124.12 249c.446 1.78 2.045 3.028 3.88 3.028 1.835 0 3.434-1.248 3.88-3.028l7.42-29.68c41.876-5.126 74.874-38.124 80-80L249 131.88c1.78-.446 3.028-2.045 3.028-3.88 0-1.835-1.248-3.434-3.028-3.88ZM210.95 114.61 155.3 100.7 141.39 45.08c35.76 5.729 63.801 33.77 69.53 69.53ZM128 24.49l19.57 78.28L128 122.34 108.43 102.77ZM114.61 45.08l-13.91 55.62L45.08 114.61C50.809 78.85 78.85 50.809 114.61 45.08ZM102.77 108.43 122.34 128l-19.57 19.57L24.49 128ZM45.08 141.43l55.62 13.87 13.91 55.62C78.85 205.191 50.809 177.15 45.08 141.39ZM128 231.51 108.43 153.23 128 133.66l19.57 19.57ZM141.39 210.92l13.91-55.62 55.62-13.91c-5.729 35.76-33.77 63.801-69.53 69.53ZM153.23 147.57 133.66 128l19.57-19.57L231.51 128Z"),
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
        return _compassRose!!
    }

private var _compassRose: ImageVector? = null
