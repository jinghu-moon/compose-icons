package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Photo: ImageVector
    get() {
        if (_photo != null) return _photo!!
        _photo = tablerFilledIcon(
            name = "Photo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.813 11.612c.457-.38 .918-.38 1.386 .011l.108 .098 4.986 4.986 .094 .083c.398 .309 .964 .273 1.32-.083 .356-.356 .392-.922 .083-1.32l-.083-.094L15.415 14l.292-.293 .106-.095c.457-.38 .918-.38 1.386 .011l.108 .098 4.674 4.675c-.196 1.968-1.8 3.497-3.775 3.599L18 22h-12C3.945 22 2.224 20.442 2.02 18.397L8.707 11.707l.106-.095ZM18 2c2.131-0 3.888 1.671 3.995 3.8L22 6v9.585L18.707 12.293l-.15-.137c-1.256-1.095-2.85-1.097-4.096-.017l-.154 .14L14 12.585 11.707 10.293l-.15-.137C10.301 9.061 8.707 9.059 7.461 10.139l-.154 .14L2 15.585v-9.585C2 3.869 3.671 2.112 5.8 2.005L6 2h12ZM15.01 7l-.127 .007c-.503 .06-.882 .486-.882 .993 0 .507 .379 .933 .882 .993L15 9l.127-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L15.01 7Z"),
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
        return _photo!!
    }

private var _photo: ImageVector? = null
