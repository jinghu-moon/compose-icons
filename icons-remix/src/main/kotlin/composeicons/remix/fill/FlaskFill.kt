package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FlaskFill: ImageVector
    get() {
        if (_flaskFill != null) return _flaskFill!!
        _flaskFill = remixIcon(
            name = "FlaskFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.999 2v2h-1v3.243c0 1.158 .251 2.301 .736 3.352l4.281 9.276c.347 .752 .019 1.643-.733 1.99-.197 .091-.411 .138-.629 .138h-13.311C4.515 22 3.844 21.328 3.844 20.5c0-.217 .047-.431 .138-.629L8.263 10.595C8.748 9.544 8.999 8.401 8.999 7.243v-3.243h-1v-2h8ZM12.999 4h-2v4h2v-4Z"),
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
        return _flaskFill!!
    }

private var _flaskFill: ImageVector? = null
