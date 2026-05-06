package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareF4: ImageVector
    get() {
        if (_squareF4 != null) return _squareF4!!
        _squareF4 = tablerFilledIcon(
            name = "SquareF4",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.333 2c1.96 0 3.56 1.537 3.662 3.472L22 5.667v12.666c0 1.96-1.537 3.56-3.472 3.662L18.333 22h-12.666C3.717 22 2.109 20.475 2.005 18.528L2 18.333v-12.666C2 3.707 3.537 2.107 5.472 2.005L5.667 2h12.666ZM16 8c-.507 0-.934 .38-.993 .883L15 9v2h-1v-2l-.007-.117C13.933 8.38 13.507 8.001 13 8.001c-.507 0-.933 .379-.993 .882L12 9v2l.005 .15c.074 .984 .854 1.767 1.838 1.844L14 13h1v2l.007 .117c.06 .503 .486 .882 .993 .882 .507 0 .933-.379 .993-.882L17 15v-6l-.007-.117C16.934 8.38 16.507 8 16 8ZM10 8h-2l-.117 .007c-.459 .054-.822 .417-.876 .876L7 9v6l.007 .117c.054 .459 .417 .822 .876 .876L8 16l.117-.007c.459-.054 .822-.417 .876-.876L9 15v-2h1l.117-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L10 11h-1v-1h1l.117-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L10 8Z"),
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
        return _squareF4!!
    }

private var _squareF4: ImageVector? = null
