package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareF7: ImageVector
    get() {
        if (_squareF7 != null) return _squareF7!!
        _squareF7 = tablerFilledIcon(
            name = "SquareF7",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.333 2c1.96 0 3.56 1.537 3.662 3.472L22 5.667v12.666c0 1.96-1.537 3.56-3.472 3.662L18.333 22h-12.666C3.717 22 2.109 20.475 2.005 18.528L2 18.333v-12.666C2 3.707 3.537 2.107 5.472 2.005L5.667 2h12.666ZM16 8h-3l-.117 .007C12.38 8.066 12 8.493 12 9l.007 .117c.059 .503 .486 .883 .993 .883h1.718l-1.188 4.757-.022 .115c-.068 .525 .286 1.012 .807 1.11 .52 .098 1.027-.226 1.155-.74l1.5-6 .021-.11c.038-.286-.049-.574-.239-.791C16.562 8.124 16.288 8 16 8ZM10 8h-2l-.117 .007C7.38 8.066 7 8.493 7 9v6l.007 .117c.059 .503 .486 .883 .993 .883l.117-.007C8.62 15.934 9 15.507 9 15v-2h1l.117-.007c.525-.062 .911-.523 .88-1.052C10.966 11.413 10.529 11.001 10 11h-1v-1h1l.117-.007c.525-.062 .911-.523 .88-1.052C10.966 8.413 10.529 8.001 10 8Z"),
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
        return _squareF7!!
    }

private var _squareF7: ImageVector? = null
