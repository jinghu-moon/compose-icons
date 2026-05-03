package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HistoryOff: ImageVector
    get() {
        if (_historyOff != null) return _historyOff!!
        _historyOff = tablerOutlineIcon(
            name = "HistoryOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.050 11.000 C 3.255 8.962 4.152 7.055 5.590 5.597M 7.904 3.900 C 11.380 2.120 15.608 2.785 18.369 5.547 C 21.131 8.308 21.797 12.536 20.017 16.012M 18.322 18.324 C 16.141 20.474 13.016 21.367 10.029 20.694 C 7.041 20.022 4.600 17.877 3.550 15.000M 3.050 20.000 L 3.050 15.000 L 8.050 15.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _historyOff!!
    }

private var _historyOff: ImageVector? = null
