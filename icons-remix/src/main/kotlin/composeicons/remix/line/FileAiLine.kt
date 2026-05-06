package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileAiLine: ImageVector
    get() {
        if (_fileAiLine != null) return _fileAiLine!!
        _fileAiLine = remixIcon(
            name = "FileAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 4h-2v5c0 .552-.448 1-1 1h-5v10h14v-10h2v11.008c0 .548-.445 .992-.993 .992h-16.014C3.445 22 3 21.55 3 20.993v-12.993L9 2.003v-.003h4v2ZM5.829 8h3.171v-3.169L5.829 8ZM19.471 .329c-.176-.426-.765-.426-.941 0l-.253 .611c-.432 1.043-1.238 1.876-2.251 2.326l-.718 .319c-.41 .183-.41 .78 0 .963l.76 .338c.988 .439 1.78 1.242 2.22 2.251l.246 .565c.181 .414 .753 .414 .934 0l.247-.565c.44-1.008 1.231-1.812 2.219-2.251l.76-.338c.41-.183 .41-.78 0-.963l-.718-.319C20.962 2.816 20.156 1.983 19.724 .941L19.471 .329Z"),
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
        return _fileAiLine!!
    }

private var _fileAiLine: ImageVector? = null
