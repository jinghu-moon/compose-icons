package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleNumber2: ImageVector
    get() {
        if (_circleNumber2 != null) return _circleNumber2!!
        _circleNumber2 = tablerFilledIcon(
            name = "CircleNumber2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM13 7h-3l-.117 .007C9.38 7.067 9.001 7.493 9.001 8c0 .507 .379 .933 .882 .993L10 9h3v2h-2l-.15 .005c-.984 .074-1.767 .854-1.844 1.838L9 13v2l.005 .15c.074 .984 .854 1.767 1.838 1.844L11 17h3l.117-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L14 15h-3v-2h2l.15-.005c.984-.074 1.767-.854 1.844-1.838L15 11v-2l-.005-.15C14.921 7.866 14.141 7.083 13.157 7.006L13 7Z"),
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
        return _circleNumber2!!
    }

private var _circleNumber2: ImageVector? = null
