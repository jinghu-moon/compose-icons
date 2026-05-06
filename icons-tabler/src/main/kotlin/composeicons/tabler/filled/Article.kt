package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Article: ImageVector
    get() {
        if (_article != null) return _article!!
        _article = tablerFilledIcon(
            name = "Article",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 3c1.589-0 2.902 1.238 2.995 2.824L22 6v12c0 1.589-1.238 2.902-2.824 2.995L19 21h-14C3.411 21 2.098 19.762 2.005 18.176L2 18v-12C2 4.411 3.238 3.098 4.824 3.005L5 3h14ZM17 15h-10l-.117 .007c-.503 .06-.882 .486-.882 .993 0 .507 .379 .933 .882 .993L7 17h10l.117-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L17 15ZM17 11h-10l-.117 .007c-.503 .06-.882 .486-.882 .993 0 .507 .379 .933 .882 .993L7 13h10l.117-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L17 11ZM17 7h-10l-.117 .007C6.38 7.067 6.001 7.493 6.001 8c0 .507 .379 .933 .882 .993L7 9h10l.117-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L17 7Z"),
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
        return _article!!
    }

private var _article: ImageVector? = null
