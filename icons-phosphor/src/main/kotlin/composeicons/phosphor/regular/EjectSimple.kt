package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.EjectSimple: ImageVector
    get() {
        if (_ejectSimple != null) return _ejectSimple!!
        _ejectSimple = phosphorRegularIcon(
            name = "EjectSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 200c0 4.418-3.582 8-8 8h-192c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h192c4.418 0 8 3.582 8 8ZM25.59 150.84c-2.705-5.595-1.925-12.251 2-17.07L109.26 32.94c4.578-5.655 11.464-8.941 18.74-8.941 7.276 0 14.162 3.286 18.74 8.941l81.65 100.83c3.901 4.819 4.688 11.449 2.025 17.047-2.664 5.598-8.305 9.17-14.505 9.183h-175.82c-6.2 .014-11.85-3.555-14.5-9.16ZM40 143.91c0 0 0 .09 .08 .11h175.83c0 0 .08-.09 .08-.13L134.3 43C132.762 41.097 130.447 39.991 128 39.991c-2.447 0-4.762 1.106-6.3 3.009L40 143.84c-.003 .023-.003 .047 0 .07Z"),
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
        return _ejectSimple!!
    }

private var _ejectSimple: ImageVector? = null
