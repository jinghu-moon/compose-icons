package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Heart: ImageVector
    get() {
        if (_heart != null) return _heart!!
        _heart = tablerFilledIcon(
            name = "Heart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.979 3.074c1.793-.305 3.627 .219 4.988 1.425l.037 .033 .034-.03C13.335 3.364 15.06 2.839 16.771 3.062l.246 .036c2.172 .375 3.964 1.911 4.666 4.001 .702 2.09 .202 4.396-1.302 6.007l-.18 .185-.048 .041-7.45 7.379c-.356 .352-.916 .387-1.313 .082l-.094-.082L3.803 13.289C2.184 11.714 1.587 9.364 2.258 7.207 2.928 5.051 4.753 3.453 6.979 3.074Z"),
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
        return _heart!!
    }

private var _heart: ImageVector? = null
