package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleCaretDown: ImageVector
    get() {
        if (_circleCaretDown != null) return _circleCaretDown!!
        _circleCaretDown = tablerFilledIcon(
            name = "CircleCaretDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.203 2.426 6.057 7.52 4.397 12.081-1.66 4.56-6.354 7.271-11.134 6.428C5.484 21.006 2 16.853 2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34M15 10h-6c-.405-0-.769 .243-.924 .617-.155 .374-.07 .804 .216 1.09l3 3c.188 .188 .442 .293 .708 .293 .265 0 .52-.106 .707-.293l3-3c.39-.391 .39-1.023 0-1.414l-.094-.083C15.438 10.074 15.222 10 15 10"),
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
        return _circleCaretDown!!
    }

private var _circleCaretDown: ImageVector? = null
