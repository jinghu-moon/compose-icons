package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ChatNewLine: ImageVector
    get() {
        if (_chatNewLine != null) return _chatNewLine!!
        _chatNewLine = remixIcon(
            name = "ChatNewLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 3v2h-10v13.385L5.763 17h14.237v-7h2v8c0 .552-.448 1-1 1h-14.545L2 22.5v-18.5C2 3.448 2.448 3 3 3h11ZM19 3v-3h2v3h3v2h-3v3h-2v-3h-3v-2h3Z"),
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
        return _chatNewLine!!
    }

private var _chatNewLine: ImageVector? = null
