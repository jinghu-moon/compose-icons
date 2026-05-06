package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MapTrifold: ImageVector
    get() {
        if (_mapTrifold != null) return _mapTrifold!!
        _mapTrifold = phosphorBoldIcon(
            name = "MapTrifold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M231.38 46.54c-2.912-2.271-6.707-3.075-10.29-2.18L161.4 59.28 101.4 29.28c-2.563-1.282-5.5-1.605-8.28-.91L29.12 44.37C23.77 45.693 20.009 50.489 20 56v144c.001 3.695 1.703 7.183 4.616 9.457 2.912 2.274 6.71 3.079 10.294 2.183L94.6 196.72l60 30c2.563 1.282 5.5 1.605 8.28 .91l64-16c5.35-1.323 9.111-6.119 9.12-11.63v-144c-.001-3.697-1.705-7.187-4.62-9.46ZM108 59.42l40 20v117.16l-40-20ZM44 65.42l40-10v119.21l-40 10ZM212 190.63l-40 10v-119.26l40-10Z"),
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
        return _mapTrifold!!
    }

private var _mapTrifold: ImageVector? = null
