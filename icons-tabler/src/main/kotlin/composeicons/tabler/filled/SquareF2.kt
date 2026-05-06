package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareF2: ImageVector
    get() {
        if (_squareF2 != null) return _squareF2!!
        _squareF2 = tablerFilledIcon(
            name = "SquareF2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.333 2c1.96 0 3.56 1.537 3.662 3.472L22 5.667v12.666c0 1.96-1.537 3.56-3.472 3.662L18.333 22h-12.666C3.717 22 2.109 20.475 2.005 18.528L2 18.333v-12.666C2 3.707 3.537 2.107 5.472 2.005L5.667 2h12.666ZM15 8h-2l-.117 .007c-.503 .06-.882 .486-.882 .993 0 .507 .379 .933 .882 .993L13 10h2v1h-1l-.15 .005c-.984 .074-1.767 .854-1.844 1.838L12 13v1l.005 .15c.074 .984 .854 1.767 1.838 1.844L14 16h2l.117-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L16 14h-2v-1h1l.15-.005c.984-.074 1.767-.854 1.844-1.838L17 11v-1l-.005-.15C16.917 8.806 16.047 8 15 8ZM10 8h-2l-.117 .007c-.459 .054-.822 .417-.876 .876L7 9v6l.007 .117c.054 .459 .417 .822 .876 .876L8 16l.117-.007c.459-.054 .822-.417 .876-.876L9 15v-2h1l.117-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L10 11h-1v-1h1l.117-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L10 8Z"),
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
        return _squareF2!!
    }

private var _squareF2: ImageVector? = null
