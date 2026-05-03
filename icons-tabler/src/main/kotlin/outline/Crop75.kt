package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Crop75: ImageVector
    get() {
        if (_crop75 != null) return _crop75!!
        _crop75 = tablerOutlineIcon(
            name = "Crop75",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 8.000 C 4.000 6.895 4.895 6.000 6.000 6.000 L 18.000 6.000 C 19.105 6.000 20.000 6.895 20.000 8.000 L 20.000 16.000 C 20.000 17.105 19.105 18.000 18.000 18.000 L 6.000 18.000 C 4.895 18.000 4.000 17.105 4.000 16.000 L 4.000 8.000"),
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
        return _crop75!!
    }

private var _crop75: ImageVector? = null
