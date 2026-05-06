package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SpeakAiLine: ImageVector
    get() {
        if (_speakAiLine != null) return _speakAiLine!!
        _speakAiLine = remixIcon(
            name = "SpeakAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.713 7.128l-.247 .566c-.18 .414-.753 .414-.934 0l-.247-.566C18.847 6.119 18.056 5.316 17.068 4.877l-.76-.338c-.411-.183-.411-.78 0-.963l.717-.319C18.038 2.807 18.844 1.974 19.276 .931l.253-.611c.176-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.717 .319c.411 .183 .411 .78 0 .963l-.76 .338c-.988 .439-1.779 1.242-2.219 2.251ZM9 2c4.068 0 7.426 3.036 7.934 6.965l2.25 3.539c.148 .233 .118 .581-.225 .728L17 14.071v2.929c0 1.105-.895 2-2 2h-1.999L13 22h-9l0-3.694C4 17.125 3.564 16.009 2.756 15.001 1.657 13.631 1 11.892 1 10 1 5.582 4.582 2 9 2ZM9 4C5.686 4 3 6.686 3 10c0 1.385 .468 2.693 1.316 3.75 1.094 1.364 1.685 2.917 1.684 4.556L6 20h5.001l.001-3h3.998v-4.248l1.55-.664L15.007 9.663l-.057-.441C14.566 6.251 12.024 4 9 4ZM19.489 16.993l1.664 1.109C22.32 16.356 23 14.258 23 12c0-.683-.062-1.352-.181-2l-1.943 .5c.082 .488 .124 .989 .124 1.5 0 1.847-.556 3.564-1.511 4.993Z"),
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
        return _speakAiLine!!
    }

private var _speakAiLine: ImageVector? = null
