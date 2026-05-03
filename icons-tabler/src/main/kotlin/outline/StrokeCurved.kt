package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.StrokeCurved: ImageVector
    get() {
        if (_strokeCurved != null) return _strokeCurved!!
        _strokeCurved = tablerOutlineIcon(
            name = "StrokeCurved",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 19.000 L 5.341 19.000 C 8.642 19.000 11.494 16.695 12.186 13.467 L 12.814 10.533 C 13.506 7.305 16.359 4.999 19.660 5.000 L 21.000 5.000"),
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
        return _strokeCurved!!
    }

private var _strokeCurved: ImageVector? = null
