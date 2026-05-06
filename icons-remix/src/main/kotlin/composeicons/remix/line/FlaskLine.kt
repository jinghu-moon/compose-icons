package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FlaskLine: ImageVector
    get() {
        if (_flaskLine != null) return _flaskLine!!
        _flaskLine = remixIcon(
            name = "FlaskLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.999 2v2h-1v3.243c0 1.158 .251 2.301 .736 3.352l4.281 9.276c.347 .752 .019 1.643-.733 1.99-.197 .091-.411 .138-.629 .138h-13.311C4.515 22 3.844 21.328 3.844 20.5c0-.217 .047-.431 .138-.629L8.263 10.595C8.748 9.544 8.999 8.401 8.999 7.243v-3.243h-1v-2h8ZM13.387 10.001h-2.776c-.104 .363-.229 .721-.374 1.071l-.158 .361L6.124 20h11.749L13.92 11.434c-.214-.464-.392-.943-.533-1.432ZM10.999 7.243c0 .253-.01 .506-.029 .758h2.058c-.009-.121-.016-.242-.021-.364l-.008-.394v-3.243h-2v3.243Z"),
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
        return _flaskLine!!
    }

private var _flaskLine: ImageVector? = null
