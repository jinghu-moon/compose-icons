package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareF6: ImageVector
    get() {
        if (_squareF6 != null) return _squareF6!!
        _squareF6 = tablerFilledIcon(
            name = "SquareF6",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.333 2c1.96 0 3.56 1.537 3.662 3.472L22 5.667v12.666c0 1.96-1.537 3.56-3.472 3.662L18.333 22h-12.666C3.717 22 2.109 20.475 2.005 18.528L2 18.333v-12.666C2 3.707 3.537 2.107 5.472 2.005L5.667 2h12.666ZM15.25 8h-1.25l-.15 .005c-.984 .074-1.767 .854-1.844 1.838L12 10v4l.005 .15c.074 .984 .854 1.767 1.838 1.844L14 16h1l.15-.005c.984-.074 1.767-.854 1.844-1.838L17 14v-1l-.005-.15c-.074-.984-.854-1.767-1.838-1.844L15 11h-1v-1h1.032l.026 .087c.163 .459 .633 .733 1.113 .65 .48-.083 .83-.5 .829-.987C17 8.839 16.302 8.081 15.394 8.006L15.25 8ZM10 8h-2l-.117 .007c-.459 .054-.822 .417-.876 .876L7 9v6l.007 .117c.054 .459 .417 .822 .876 .876L8 16l.117-.007c.459-.054 .822-.417 .876-.876L9 15v-2h1l.117-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L10 11h-1v-1h1l.117-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L10 8ZM15 13v1h-1v-1h1Z"),
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
        return _squareF6!!
    }

private var _squareF6: ImageVector? = null
