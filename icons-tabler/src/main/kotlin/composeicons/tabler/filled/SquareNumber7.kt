package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareNumber7: ImageVector
    get() {
        if (_squareNumber7 != null) return _squareNumber7!!
        _squareNumber7 = tablerFilledIcon(
            name = "SquareNumber7",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.333 2c1.96 0 3.56 1.537 3.662 3.472L22 5.667v12.666c0 1.96-1.537 3.56-3.472 3.662L18.333 22h-12.666C3.717 22 2.109 20.475 2.005 18.528L2 18.333v-12.666C2 3.707 3.537 2.107 5.472 2.005L5.667 2h12.666ZM14 7h-4l-.117 .007c-.459 .054-.822 .417-.876 .876L9 8l.007 .117c.054 .459 .417 .822 .876 .876L10 9h2.718l-1.688 6.757-.022 .115c-.065 .503 .257 .975 .749 1.098 .492 .123 .998-.142 1.178-.616l.035-.111 2-8 .021-.112c.035-.266-.038-.535-.203-.747-.165-.212-.408-.348-.675-.378L14 7Z"),
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
        return _squareNumber7!!
    }

private var _squareNumber7: ImageVector? = null
