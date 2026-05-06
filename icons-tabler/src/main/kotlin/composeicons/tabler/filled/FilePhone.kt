package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FilePhone: ImageVector
    get() {
        if (_filePhone != null) return _filePhone!!
        _filePhone = tablerFilledIcon(
            name = "FilePhone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2l.117 .007c.459 .054 .822 .417 .876 .876L13 3v4l.005 .15c.074 .984 .854 1.767 1.838 1.844L15 9h4l.117 .007c.459 .054 .822 .417 .876 .876L20 10v9c0 1.589-1.238 2.902-2.824 2.995L17 22h-10C5.411 22 4.098 20.762 4.005 19.176L4 19v-14C4 3.411 5.238 2.098 6.824 2.005L7 2ZM9.5 9.5C8.672 9.5 8 10.172 8 11v1c0 3.314 2.686 6 6 6h1c.828 0 1.5-.672 1.5-1.5C16.5 15.672 15.828 15 15 15h-1l-.144 .007c-.464 .045-.881 .302-1.128 .697l-.042 .074-.022-.007c-1.137-.404-2.031-1.298-2.435-2.435l-.008-.023 .075-.041c.438-.274 .704-.755 .704-1.272v-1C11 10.172 10.328 9.5 9.5 9.5M14.999 2.999 19 7h-4Z"),
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
        return _filePhone!!
    }

private var _filePhone: ImageVector? = null
