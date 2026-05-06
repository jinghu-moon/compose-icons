package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.GuitarPick: ImageVector
    get() {
        if (_guitarPick != null) return _guitarPick!!
        _guitarPick = tablerFilledIcon(
            name = "GuitarPick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2C10.387 2 9.118 2.104 8.175 2.323l-.23 .057C4.926 3.088 3 4.883 3 8c0 3.367 1.939 8.274 4.22 11.125 .32 .4 .664 .786 1.03 1.158l.367 .36c1.889 1.799 4.857 1.804 6.752 .011 .505-.476 .976-.987 1.41-1.528C19.27 16.013 21 11.832 21 8 21 4.975 19.187 3.194 16.29 2.438l-.266-.066C15.088 2.122 13.743 2 12 2Z"),
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
        return _guitarPick!!
    }

private var _guitarPick: ImageVector? = null
