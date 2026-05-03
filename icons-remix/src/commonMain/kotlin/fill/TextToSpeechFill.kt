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
                pathData = parseSvgPathData("M 13.414 5.586 C 12.633 6.367 12.633 7.633 13.414 8.414 L 19.267 14.267 C 19.933 14.932 20.989 15.059 21.688 14.429 C 21.795 14.333 21.898 14.233 22.000 14.133 L 22.000 17.000 C 22.000 19.209 20.209 21.000 18.000 21.000 L 6.000 21.000 C 3.791 21.000 2.000 19.209 2.000 17.000 L 2.000 7.000 C 2.000 4.791 3.791 3.000 6.000 3.000 L 16.000 3.000 L 13.414 5.586 ZM 6.000 11.000 L 9.000 11.000 L 9.000 17.000 L 11.000 17.000 L 11.000 11.000 L 14.000 11.000 L 14.000 9.000 L 6.000 9.000 L 6.000 11.000 ZM 20.657 1.343 C 22.105 2.790 23.000 4.791 23.000 7.000 C 23.000 9.209 22.105 11.210 20.657 12.657 L 19.242 11.242 C 20.328 10.156 21.000 8.657 21.000 7.000 C 21.000 5.343 20.328 3.844 19.242 2.758 L 20.657 1.343 ZM 17.828 4.172 C 18.552 4.896 19.000 5.895 19.000 7.000 C 19.000 8.105 18.552 9.104 17.828 9.828 L 16.414 8.414 C 16.776 8.052 17.000 7.552 17.000 7.000 C 17.000 6.448 16.776 5.948 16.414 5.586 L 17.828 4.172 Z"),
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
