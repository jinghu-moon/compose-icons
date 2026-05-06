package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.LinkBreak: ImageVector
    get() {
        if (_linkBreak != null) return _linkBreak!!
        _linkBreak = phosphorRegularIcon(
            name = "LinkBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M198.63 57.37C186.157 44.9 165.946 44.873 153.44 57.31L141.79 69.52c-3.093 2.891-7.903 2.871-10.972-.044-3.07-2.916-3.336-7.718-.608-10.956L141.93 46.23c.041-.046 .084-.089 .13-.13 18.788-18.485 48.967-18.362 67.605 .275 18.637 18.637 18.76 48.816 .275 67.605-.041 .046-.084 .089-.13 .13l-12.29 11.72c-3.237 2.728-8.04 2.462-10.956-.608-2.916-3.07-2.935-7.879-.044-10.972l12.21-11.65c12.453-12.522 12.408-32.764-.1-45.23ZM114.21 186.48l-11.65 12.21c-12.547 12.186-32.554 12.04-44.922-.328C45.27 185.994 45.124 165.987 57.31 153.44L69.52 141.79c2.891-3.093 2.871-7.903-.044-10.972-2.916-3.07-7.718-3.336-10.956-.608L46.19 141.93c-.046 .041-.089 .084-.13 .13-18.485 18.788-18.362 48.967 .275 67.605 18.637 18.637 48.816 18.76 67.605 .275 .046-.041 .089-.084 .13-.13l11.72-12.29c2.171-2.029 3.038-5.095 2.252-7.96-.786-2.866-3.096-5.06-5.998-5.698-2.902-.638-5.919 .386-7.834 2.658ZM216 152h-24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h24c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM40 104h24c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM160 184c-4.418 0-8 3.582-8 8v24c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-24c0-4.418-3.582-8-8-8ZM96 72c4.418 0 8-3.582 8-8v-24c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v24c0 4.418 3.582 8 8 8Z"),
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
        return _linkBreak!!
    }

private var _linkBreak: ImageVector? = null
