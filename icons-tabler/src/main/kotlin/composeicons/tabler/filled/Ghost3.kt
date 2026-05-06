package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Ghost3: ImageVector
    get() {
        if (_ghost3 != null) return _ghost3!!
        _ghost3 = tablerFilledIcon(
            name = "Ghost3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 3c4.418 0 8 3.582 8 8v6.954l.009 .103c.064 1.085-.509 2.107-1.468 2.618l-.163 .08c-1.111 .502-2.42 .22-3.266-.74-.123-.158-.312-.25-.512-.25-.2 0-.389 .092-.512 .25-.502 .643-1.272 1.018-2.088 1.018-.816 0-1.586-.376-2.088-1.018-.123-.157-.312-.249-.512-.249-.2 0-.389 .092-.55 .296-.785 .889-2.048 1.182-3.144 .73C4.609 20.339 3.921 19.241 3.991 18.057l.01-.104 .007-.077L4 17.95v-6.95l.004-.25C4.136 6.528 7.529 3.136 11.751 3.004ZM10.01 9h-.01C9.448 9 9 9.448 9 10c0 .552 .448 1 1 1h.01c.552 0 1-.448 1-1 0-.552-.448-1-1-1M14.01 9h-.01c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h.01c.552 0 1-.448 1-1 0-.552-.448-1-1-1"),
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
        return _ghost3!!
    }

private var _ghost3: ImageVector? = null
