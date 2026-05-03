package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Carambola: ImageVector
    get() {
        if (_carambola != null) return _carambola!!
        _carambola = tablerOutlineIcon(
            name = "Carambola",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.286 21.090 Q 15.596 21.091 11.998 18.475 Q 8.402 21.092 6.710 21.091 Q 3.984 21.091 6.215 14.291 Q -3.174 7.516 8.350 7.516 L 8.426 7.516 Q 10.211 2.000 12.000 2.000 Q 13.785 2.000 15.574 7.516 L 15.650 7.516 Q 27.175 7.516 17.783 14.290 Q 20.013 21.092 17.286 21.090"),
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
        return _carambola!!
    }

private var _carambola: ImageVector? = null
