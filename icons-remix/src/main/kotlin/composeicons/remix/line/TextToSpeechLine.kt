package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TextToSpeechLine: ImageVector
    get() {
        if (_textToSpeechLine != null) return _textToSpeechLine!!
        _textToSpeechLine = remixIcon(
            name = "TextToSpeechLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.5 5h-8.5C4.895 5 4 5.895 4 7v10c0 1.105 .895 2 2 2h12c1.105 0 2-.895 2-2v-2.5h2v2.5c0 2.209-1.791 4-4 4h-12C3.791 21 2 19.209 2 17v-10C2 4.791 3.791 3 6 3h8.5v2ZM14 11h-3v6h-2v-6h-3v-2h8v2ZM20.657 1.343C22.105 2.79 23 4.791 23 7c0 2.209-.895 4.21-2.343 5.657L19.242 11.242C20.328 10.156 21 8.657 21 7 21 5.343 20.328 3.844 19.242 2.758L20.657 1.343ZM17.828 4.172C18.552 4.896 19 5.895 19 7c0 1.105-.448 2.104-1.172 2.828L16.414 8.414C16.776 8.052 17 7.552 17 7c0-.552-.224-1.052-.586-1.414L17.828 4.172Z"),
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
        return _textToSpeechLine!!
    }

private var _textToSpeechLine: ImageVector? = null
