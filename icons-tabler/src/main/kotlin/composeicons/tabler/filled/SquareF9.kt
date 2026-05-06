package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareF9: ImageVector
    get() {
        if (_squareF9 != null) return _squareF9!!
        _squareF9 = tablerFilledIcon(
            name = "SquareF9",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.333 2c1.96 0 3.56 1.537 3.662 3.472L22 5.667v12.666c0 1.96-1.537 3.56-3.472 3.662L18.333 22h-12.666C3.717 22 2.109 20.475 2.005 18.528L2 18.333v-12.666C2 3.707 3.537 2.107 5.472 2.005L5.667 2h12.666ZM15.25 8h-1.5l-.144 .006C12.698 8.081 12 8.839 12 9.75v1.5l.006 .144c.075 .908 .833 1.606 1.744 1.606h1.25v1h-1.033l-.025-.087c-.163-.459-.633-.733-1.113-.65-.48 .083-.83 .5-.829 .987 0 .966 .784 1.75 1.75 1.75h1.5l.144-.006c.908-.075 1.606-.833 1.606-1.744v-4.5l-.006-.144C16.919 8.698 16.161 8 15.25 8ZM10 8h-2l-.117 .007C7.38 8.066 7 8.493 7 9v6l.007 .117c.059 .503 .486 .883 .993 .883l.117-.007C8.62 15.934 9 15.507 9 15v-2h1l.117-.007c.525-.062 .911-.523 .88-1.052C10.966 11.413 10.529 11.001 10 11h-1v-1h1l.117-.007c.525-.062 .911-.523 .88-1.052C10.966 8.413 10.529 8.001 10 8ZM15 10v1h-1v-1h1Z"),
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
        return _squareF9!!
    }

private var _squareF9: ImageVector? = null
