package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowGuide: ImageVector
    get() {
        if (_arrowGuide != null) return _arrowGuide!!
        _arrowGuide = tablerFilledIcon(
            name = "ArrowGuide",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.707 3.293l3 3q.054 .053 .097 .112l.071 .11 .054 .114 .035 .105 .03 .148L22 7l-.003 .075-.017 .126-.03 .111-.044 .111-.052 .098-.067 .096-.08 .09-3 3c-.392 .379-1.016 .374-1.402-.012-.386-.386-.391-1.009-.012-1.402L18.585 8h-4.585c-.552 0-1 .448-1 1v8c0 1.657-1.343 3-3 3h-2.171c-.489 1.376-1.896 2.2-3.335 1.954C3.055 21.707 2.002 20.46 2 19l.005-.176c.082-1.427 1.159-2.598 2.575-2.799 1.415-.2 2.776 .626 3.25 1.975h2.17c.552 0 1-.448 1-1v-8C11 7.343 12.343 6 14 6h4.585L17.293 4.707c-.356-.356-.392-.922-.083-1.32l.083-.094c.391-.39 1.024-.39 1.414 0"),
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
        return _arrowGuide!!
    }

private var _arrowGuide: ImageVector? = null
