package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleNumber6: ImageVector
    get() {
        if (_circleNumber6 != null) return _circleNumber6!!
        _circleNumber6 = tablerFilledIcon(
            name = "CircleNumber6",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM13 7h-2l-.15 .005C9.866 7.079 9.083 7.859 9.006 8.843L9 9v6l.005 .15c.074 .984 .854 1.767 1.838 1.844L11 17h2l.15-.005c.984-.074 1.767-.854 1.844-1.838L15 15v-2l-.005-.15c-.074-.984-.854-1.767-1.838-1.844L13 11h-2v-2h2l.007 .117c.062 .525 .523 .911 1.052 .88C14.587 9.966 14.999 9.529 15 9 15 7.953 14.194 7.083 13.15 7.005L13 7ZM13 13v2h-2v-2h2Z"),
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
        return _circleNumber6!!
    }

private var _circleNumber6: ImageVector? = null
