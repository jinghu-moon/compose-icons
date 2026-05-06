package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareNumber1: ImageVector
    get() {
        if (_squareNumber1 != null) return _squareNumber1!!
        _squareNumber1 = tablerFilledIcon(
            name = "SquareNumber1",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.333 2c1.96 0 3.56 1.537 3.662 3.472L22 5.667v12.666c0 1.96-1.537 3.56-3.472 3.662L18.333 22h-12.666C3.717 22 2.109 20.475 2.005 18.528L2 18.333v-12.666C2 3.707 3.537 2.107 5.472 2.005L5.667 2h12.666ZM12.994 7.886C12.911 7.109 11.986 6.726 11.377 7.216l-.084 .077-2 2-.083 .094c-.28 .361-.28 .865 0 1.226l.083 .094 .094 .083c.361 .28 .865 .28 1.226 0l.094-.083L11 10.414v5.586l.007 .117c.06 .503 .486 .882 .993 .882 .507 0 .933-.379 .993-.882L13 16v-8l-.006-.114Z"),
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
        return _squareNumber1!!
    }

private var _squareNumber1: ImageVector? = null
