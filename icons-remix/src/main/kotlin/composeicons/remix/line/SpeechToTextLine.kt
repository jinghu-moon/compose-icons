package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SpeechToTextLine: ImageVector
    get() {
        if (_speechToTextLine != null) return _speechToTextLine!!
        _speechToTextLine = remixIcon(
            name = "SpeechToTextLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 3c2.209 0 4 1.791 4 4v10c0 2.209-1.791 4-4 4h-12C3.791 21 2 19.209 2 17v-3.5h2v3.5c0 1.105 .895 2 2 2h12c1.105 0 2-.895 2-2v-10C20 5.895 19.105 5 18 5h-8v-2h8ZM18 11h-3v6h-2v-6h-3v-2h8v2ZM5.657 1.343C7.105 2.79 8 4.791 8 7c0 2.209-.895 4.21-2.343 5.657L4.242 11.242C5.328 10.156 6 8.657 6 7 6 5.343 5.328 3.844 4.242 2.758L5.657 1.343ZM2.828 4.172C3.552 4.896 4 5.895 4 7 4 8.105 3.552 9.104 2.828 9.828L1.414 8.414C1.776 8.052 2 7.552 2 7 2 6.448 1.776 5.948 1.414 5.586L2.828 4.172Z"),
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
        return _speechToTextLine!!
    }

private var _speechToTextLine: ImageVector? = null
