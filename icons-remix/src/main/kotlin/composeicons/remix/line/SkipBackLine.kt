package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SkipBackLine: ImageVector
    get() {
        if (_skipBackLine != null) return _skipBackLine!!
        _skipBackLine = remixIcon(
            name = "SkipBackLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 4c.552 0 1 .448 1 1v6.333L18.223 4.518c.23-.153 .54-.091 .693 .139 .055 .082 .084 .179 .084 .277v14.131c0 .276-.224 .5-.5 .5-.099 0-.195-.029-.277-.084L8 12.667v6.333c0 .552-.448 1-1 1C6.448 20 6 19.552 6 19v-14C6 4.448 6.448 4 7 4ZM17 7.737 10.606 12 17 16.263v-8.526Z"),
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
        return _skipBackLine!!
    }

private var _skipBackLine: ImageVector? = null
