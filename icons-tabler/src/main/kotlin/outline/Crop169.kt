package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Crop169: ImageVector
    get() {
        if (_crop169 != null) return _crop169!!
        _crop169 = tablerOutlineIcon(
            name = "Crop169",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 10.000 C 4.000 8.895 4.895 8.000 6.000 8.000 L 18.000 8.000 C 19.105 8.000 20.000 8.895 20.000 10.000 L 20.000 14.000 C 20.000 15.105 19.105 16.000 18.000 16.000 L 6.000 16.000 C 4.895 16.000 4.000 15.105 4.000 14.000 L 4.000 10.000"),
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
        return _crop169!!
    }

private var _crop169: ImageVector? = null
