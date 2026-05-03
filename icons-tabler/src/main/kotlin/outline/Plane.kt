package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Plane: ImageVector
    get() {
        if (_plane != null) return _plane!!
        _plane = tablerOutlineIcon(
            name = "Plane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.000 10.000 L 20.000 10.000 C 21.105 10.000 22.000 10.895 22.000 12.000 C 22.000 13.105 21.105 14.000 20.000 14.000 L 16.000 14.000 L 12.000 21.000 L 9.000 21.000 L 11.000 14.000 L 7.000 14.000 L 5.000 16.000 L 2.000 16.000 L 4.000 12.000 L 2.000 8.000 L 5.000 8.000 L 7.000 10.000 L 11.000 10.000 L 9.000 3.000 L 12.000 3.000 L 16.000 10.000"),
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
        return _plane!!
    }

private var _plane: ImageVector? = null
