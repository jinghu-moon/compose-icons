package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleNumber1: ImageVector
    get() {
        if (_circleNumber1 != null) return _circleNumber1!!
        _circleNumber1 = tablerFilledIcon(
            name = "CircleNumber1",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM12.994 7.886C12.911 7.109 11.986 6.726 11.377 7.216l-.084 .077-2 2-.083 .094c-.28 .361-.28 .865 0 1.226l.083 .094 .094 .083c.361 .28 .865 .28 1.226 0l.094-.083L11 10.414v5.586l.007 .117c.06 .503 .486 .882 .993 .882 .507 0 .933-.379 .993-.882L13 16v-8l-.006-.114Z"),
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
        return _circleNumber1!!
    }

private var _circleNumber1: ImageVector? = null
