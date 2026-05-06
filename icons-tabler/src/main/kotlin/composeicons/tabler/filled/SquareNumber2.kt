package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareNumber2: ImageVector
    get() {
        if (_squareNumber2 != null) return _squareNumber2!!
        _squareNumber2 = tablerFilledIcon(
            name = "SquareNumber2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.333 2c1.96 0 3.56 1.537 3.662 3.472L22 5.667v12.666c0 1.96-1.537 3.56-3.472 3.662L18.333 22h-12.666C3.717 22 2.109 20.475 2.005 18.528L2 18.333v-12.666C2 3.707 3.537 2.107 5.472 2.005L5.667 2h12.666ZM13 7h-3l-.117 .007C9.38 7.067 9.001 7.493 9.001 8c0 .507 .379 .933 .882 .993L10 9h3v2h-2l-.15 .005c-.984 .074-1.767 .854-1.844 1.838L9 13v2l.005 .15c.074 .984 .854 1.767 1.838 1.844L11 17h3l.117-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L14 15h-3v-2h2l.15-.005c.984-.074 1.767-.854 1.844-1.838L15 11v-2l-.005-.15C14.921 7.866 14.141 7.083 13.157 7.006L13 7Z"),
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
        return _squareNumber2!!
    }

private var _squareNumber2: ImageVector? = null
