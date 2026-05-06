package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleLetterV: ImageVector
    get() {
        if (_circleLetterV != null) return _circleLetterV!!
        _circleLetterV = tablerFilledIcon(
            name = "CircleLetterV",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2M14.243 7.03c-.536-.134-1.079 .191-1.213 .727L12 11.875 10.97 7.757c-.085-.349-.35-.625-.695-.725-.345-.099-.717-.006-.974 .244-.257 .25-.361 .619-.271 .967l2 8c.252 1.01 1.688 1.01 1.94 0l2-8c.134-.536-.191-1.079-.727-1.213"),
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
        return _circleLetterV!!
    }

private var _circleLetterV: ImageVector? = null
