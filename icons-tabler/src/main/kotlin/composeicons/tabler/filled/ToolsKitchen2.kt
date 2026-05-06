package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ToolsKitchen2: ImageVector
    get() {
        if (_toolsKitchen2 != null) return _toolsKitchen2!!
        _toolsKitchen2 = tablerFilledIcon(
            name = "ToolsKitchen2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.94 2.002l.1-.001 .096 .008 .095 .018 .094 .027 .092 .037 .086 .045 .08 .052 .076 .06 .076 .074 .06 .072 .03 .04 .051 .084 .043 .088 .034 .091 .025 .094 .02 .15L20 21c0 .552-.448 1-1 1h-1c-.552 0-1-.448-1-1v-3c0-.552 .448-1 1-1v-1h-4c-.55 0-.997-.444-1-.994C12.967 9.683 13.97 6.524 18.005 2.572l.317-.307 .072-.06 .04-.03 .084-.051 .088-.043 .091-.034 .094-.025ZM11 3c.552 0 1 .448 1 1v3c0 1.824-1.234 3.418-3 3.874v10.126c0 .552-.448 1-1 1C7.448 22 7 21.552 7 21v-10.126C5.234 10.418 4 8.824 4 7v-3C4 3.448 4.448 3 5 3c.552 0 1 .448 1 1v3c0 .715 .381 1.375 1 1.732v-4.732C7 3.448 7.448 3 8 3c.552 0 1 .448 1 1l.001 4.732C9.619 8.374 10 7.714 10 7v-3c0-.552 .448-1 1-1"),
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
        return _toolsKitchen2!!
    }

private var _toolsKitchen2: ImageVector? = null
