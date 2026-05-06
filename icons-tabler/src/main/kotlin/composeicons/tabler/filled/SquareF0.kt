package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareF0: ImageVector
    get() {
        if (_squareF0 != null) return _squareF0!!
        _squareF0 = tablerFilledIcon(
            name = "SquareF0",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.333 2c1.96 0 3.56 1.537 3.662 3.472L22 5.667v12.666c0 1.96-1.537 3.56-3.472 3.662L18.333 22h-12.666C3.717 22 2.109 20.475 2.005 18.528L2 18.333v-12.666C2 3.707 3.537 2.107 5.472 2.005L5.667 2h12.666ZM14.5 8c-1.317-0-2.409 1.022-2.495 2.336L12 10.5v3l.005 .164c.083 1.317 1.176 2.342 2.495 2.342 1.319 0 2.412-1.025 2.495-2.342L17 13.5v-3l-.005-.164C16.909 9.022 15.817 8 14.5 8ZM10 8h-2l-.117 .007c-.459 .054-.822 .417-.876 .876L7 9v6l.007 .117c.054 .459 .417 .822 .876 .876L8 16l.117-.007c.459-.054 .822-.417 .876-.876L9 15v-2h1l.117-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L10 11h-1v-1h1l.117-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L10 8ZM14.5 10c.241-0 .449 .172 .492 .41l.008 .09v3l-.008 .09c-.043 .238-.25 .411-.492 .411-.242 0-.449-.173-.492-.411L14 13.5v-3l.008-.09c.043-.238 .251-.41 .492-.41Z"),
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
        return _squareF0!!
    }

private var _squareF0: ImageVector? = null
