package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SwipeRight: ImageVector
    get() {
        if (_swipeRight != null) return _swipeRight!!
        _swipeRight = tablerFilledIcon(
            name = "SwipeRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 7c2.376-0 4.425 1.672 4.9 4h4.685L16.293 9.707c-.356-.356-.392-.922-.083-1.32l.083-.094c.391-.39 1.024-.39 1.414 0l3 3q.054 .053 .097 .112l.071 .11 .054 .114 .035 .105 .03 .148L21 12l-.003 .075-.017 .126-.03 .111-.044 .111-.052 .098-.074 .104-.073 .082-3 3c-.392 .379-1.016 .374-1.402-.012-.386-.386-.391-1.009-.012-1.402L17.584 13l-4.684 .001c-.52 2.509-2.852 4.22-5.401 3.962C4.949 16.705 3.007 14.562 3 12 3 9.239 5.239 7 8 7"),
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
        return _swipeRight!!
    }

private var _swipeRight: ImageVector? = null
