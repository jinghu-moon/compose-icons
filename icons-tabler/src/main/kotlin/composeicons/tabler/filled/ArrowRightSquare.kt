package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowRightSquare: ImageVector
    get() {
        if (_arrowRightSquare != null) return _arrowRightSquare!!
        _arrowRightSquare = tablerFilledIcon(
            name = "ArrowRightSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.707 8.293l3 3q.054 .053 .097 .112l.071 .11 .054 .114 .035 .105 .03 .148L22 12l-.003 .075-.017 .126-.03 .111-.044 .111-.052 .098-.074 .104-.073 .082-3 3c-.392 .379-1.016 .374-1.402-.012-.386-.386-.391-1.009-.012-1.402L18.585 13h-10.585v1c0 .552-.448 1-1 1h-4C2.448 15 2 14.552 2 14v-4C2 9.448 2.448 9 3 9h4c.552 0 1 .448 1 1v1h10.585L17.293 9.707c-.356-.356-.392-.922-.083-1.32l.083-.094c.391-.39 1.024-.39 1.414 0"),
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
        return _arrowRightSquare!!
    }

private var _arrowRightSquare: ImageVector? = null
