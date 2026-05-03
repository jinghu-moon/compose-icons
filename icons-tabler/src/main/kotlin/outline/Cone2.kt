package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Cone2: ImageVector
    get() {
        if (_cone2 != null) return _cone2!!
        _cone2 = tablerOutlineIcon(
            name = "Cone2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 5.002 L 21.000 5.502 L 12.870 20.492 C 12.692 20.805 12.360 20.999 12.000 20.999 C 11.640 20.999 11.308 20.805 11.130 20.492 L 3.000 5.503 L 3.000 5.003 C 3.000 3.344 7.030 2.000 12.000 2.000 C 16.970 2.000 21.000 3.344 21.000 5.002"),
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
        return _cone2!!
    }

private var _cone2: ImageVector? = null
