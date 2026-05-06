package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileCode2: ImageVector
    get() {
        if (_fileCode2 != null) return _fileCode2!!
        _fileCode2 = tablerFilledIcon(
            name = "FileCode2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2l.117 .007c.459 .054 .822 .417 .876 .876L13 3v4l.005 .15c.074 .984 .854 1.767 1.838 1.844L15 9h4l.117 .007c.459 .054 .822 .417 .876 .876L20 10v9c0 1.589-1.238 2.902-2.824 2.995L17 22h-10C5.411 22 4.098 20.762 4.005 19.176L4 19v-14C4 3.411 5.238 2.098 6.824 2.005L7 2ZM10 11h-1c-.552 0-1 .448-1 1v5c0 .552 .448 1 1 1h1c.552 0 1-.448 1-1l-.007-.117c-.054-.459-.417-.822-.876-.876L10 16v-3c.552 0 1-.448 1-1 0-.552-.448-1-1-1M15 11h-1c-.552 0-1 .448-1 1 0 .552 .448 1 1 1v3c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h1c.552 0 1-.448 1-1v-5c0-.552-.448-1-1-1M14.999 2.999 19 7h-4Z"),
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
        return _fileCode2!!
    }

private var _fileCode2: ImageVector? = null
