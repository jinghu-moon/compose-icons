package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.EggCracked: ImageVector
    get() {
        if (_eggCracked != null) return _eggCracked!!
        _eggCracked = tablerFilledIcon(
            name = "EggCracked",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.236 2.066 9.542 7.713l-.029 .123c-.063 .377 .095 .756 .406 .978l2.764 1.974-1.551 2.716c-.187 .311-.192 .699-.011 1.014 .18 .315 .517 .507 .88 .503 .363-.004 .695-.205 .867-.524l2-3.5 .052-.105c.183-.431 .043-.932-.339-1.205L11.663 7.601 13.286 2.191C16.927 3.265 20 8.688 20 14.083c0 4.59-3.273 7.71-8 7.917C7.25 22 4 18.79 4 14.083 4 8.429 7.372 2.739 11.236 2.066"),
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
        return _eggCracked!!
    }

private var _eggCracked: ImageVector? = null
