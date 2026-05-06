package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Mickey: ImageVector
    get() {
        if (_mickey != null) return _mickey!!
        _mickey = tablerFilledIcon(
            name = "Mickey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.501 2c2.313 .001 4.249 1.757 4.476 4.059 .227 2.302-1.329 4.401-3.598 4.854 1.238 2.957 .592 6.367-1.642 8.666-2.234 2.299-5.624 3.042-8.615 1.89C6.132 20.315 4.118 17.488 4.005 14.285L4 14l.005-.285c.034-.964 .243-1.913 .615-2.803C3.258 10.642 2.097 9.758 1.475 8.517 .852 7.276 .836 5.818 1.433 4.564 2.108 3.15 3.47 2.188 5.029 2.025l.225-.018L5.535 2l.244 .009c2.279 .141 4.091 1.967 4.215 4.247 1.316-.341 2.697-.341 4.013 0C14.137 3.869 16.11 2 18.5 2Z"),
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
        return _mickey!!
    }

private var _mickey: ImageVector? = null
