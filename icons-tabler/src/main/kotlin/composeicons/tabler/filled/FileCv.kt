package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileCv: ImageVector
    get() {
        if (_fileCv != null) return _fileCv!!
        _fileCv = tablerFilledIcon(
            name = "FileCv",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2l.117 .007c.459 .054 .822 .417 .876 .876L13 3v4l.005 .15c.074 .984 .854 1.767 1.838 1.844L15 9h4l.117 .007c.459 .054 .822 .417 .876 .876L20 10v9c0 1.589-1.238 2.902-2.824 2.995L17 22h-10C5.411 22 4.098 20.762 4.005 19.176L4 19v-14C4 3.411 5.238 2.098 6.824 2.005L7 2ZM9.5 10C8.119 10 7 11.119 7 12.5v3C7 16.881 8.119 18 9.5 18 10.881 18 12 16.881 12 15.5c0-.552-.448-1-1-1-.552 0-1 .448-1 1 0 .276-.224 .5-.5 .5C9.224 16 9 15.776 9 15.5v-3C9 12.224 9.224 12 9.5 12c.276 0 .5 .224 .5 .5 0 .552 .448 1 1 1 .552 0 1-.448 1-1C12 11.119 10.881 10 9.5 10M16.243 10.03c-.536-.134-1.079 .191-1.213 .727l-.53 2.119-.53-2.119c-.085-.349-.35-.625-.695-.725-.345-.099-.717-.006-.974 .244-.257 .25-.361 .619-.271 .967l1.5 6c.252 1.01 1.688 1.01 1.94 0l1.5-6c.134-.536-.191-1.079-.727-1.213M14.999 2.999 19 7h-4Z"),
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
        return _fileCv!!
    }

private var _fileCv: ImageVector? = null
