package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TextToSpeechFill: ImageVector
    get() {
        if (_textToSpeechFill != null) return _textToSpeechFill!!
        _textToSpeechFill = remixIcon(
            name = "TextToSpeechFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.414 5.586c-.781 .781-.781 2.047 0 2.828l5.852 5.853c.666 .666 1.722 .792 2.422 .162 .106-.096 .209-.196 .312-.296v2.867c0 2.209-1.791 4-4 4h-12C3.791 21 2 19.209 2 17v-10C2 4.791 3.791 3 6 3h10L13.414 5.586ZM6 11h3v6h2v-6h3v-2h-8v2ZM20.657 1.343C22.105 2.79 23 4.791 23 7c0 2.209-.895 4.21-2.343 5.657L19.242 11.242C20.328 10.156 21 8.657 21 7 21 5.343 20.328 3.844 19.242 2.758L20.657 1.343ZM17.828 4.172C18.552 4.896 19 5.895 19 7c0 1.105-.448 2.104-1.172 2.828L16.414 8.414C16.776 8.052 17 7.552 17 7c0-.552-.224-1.052-.586-1.414L17.828 4.172Z"),
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
        return _textToSpeechFill!!
    }

private var _textToSpeechFill: ImageVector? = null
