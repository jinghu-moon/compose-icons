package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleNumber0: ImageVector
    get() {
        if (_circleNumber0 != null) return _circleNumber0!!
        _circleNumber0 = tablerFilledIcon(
            name = "CircleNumber0",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM12 7C10.411 7 9.098 8.238 9.005 9.824L9 10v4l.005 .176c.092 1.587 1.405 2.827 2.995 2.827 1.59 0 2.903-1.24 2.995-2.827L15 14v-4l-.005-.176C14.902 8.238 13.589 7 12 7ZM12 9c.507 0 .934 .38 .993 .883L13 10v4l-.007 .117c-.06 .503-.486 .882-.993 .882-.507 0-.933-.379-.993-.882L11 14v-4l.007-.117C11.066 9.38 11.493 9 12 9Z"),
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
        return _circleNumber0!!
    }

private var _circleNumber0: ImageVector? = null
