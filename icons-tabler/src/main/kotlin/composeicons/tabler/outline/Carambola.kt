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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.286 21.09q-1.69 .001-5.288-2.615Q8.402 21.092 6.71 21.091q-2.726 0-.495-6.8Q-3.174 7.516 8.35 7.516h.076Q10.211 2 12 2q1.785 0 3.574 5.516h.076q11.525 0 2.133 6.774 2.23 6.802-.497 6.8"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _carambola!!
    }

private var _carambola: ImageVector? = null
