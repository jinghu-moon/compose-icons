package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowRightRhombus: ImageVector
    get() {
        if (_arrowRightRhombus != null) return _arrowRightRhombus!!
        _arrowRightRhombus = tablerFilledIcon(
            name = "ArrowRightRhombus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.707 8.293l3 3 .097 .112 .071 .11 .031 .062 .034 .081 .024 .076 .03 .148L22 12l-.004 .085-.016 .116-.03 .111-.044 .111-.052 .098-.074 .104-.073 .082-3 3c-.392 .379-1.016 .374-1.402-.012-.386-.386-.391-1.009-.012-1.402L18.585 13h-10.171L6.207 15.207c-.39 .39-1.023 .39-1.414 0L2.293 12.707c-.39-.391-.39-1.023 0-1.414L4.793 8.793c.39-.39 1.023-.39 1.414 0L8.415 11h10.17L17.293 9.707c-.356-.356-.392-.922-.083-1.32l.083-.094c.391-.39 1.024-.39 1.414 0"),
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
        return _arrowRightRhombus!!
    }

private var _arrowRightRhombus: ImageVector? = null
