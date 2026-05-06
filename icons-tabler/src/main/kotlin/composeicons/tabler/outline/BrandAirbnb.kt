package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAirbnb: ImageVector
    get() {
        if (_brandAirbnb != null) return _brandAirbnb!!
        _brandAirbnb = tablerOutlineIcon(
            name = "BrandAirbnb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 10c-2 0-3 1-3 3 0 1.5 1.494 3.535 3 5.5 1 1 1.5 1.5 2.5 2 1 .5 2.5 1 4.5-.5 2-1.5 1.5-3.5 .5-6-1-2.5-2.333-5.5-5-9.5C13.666 3.5 13 3 11.997 3c-1 0-1.623 .45-2.497 1.5-2.667 4-4 7-5 9.5C3.5 16.5 3 18.5 5 20c2 1.5 3.5 1 4.5 .5 1-.5 1.5-1 2.5-2 1.506-1.965 3-4 3-5.5 0-2-1-3-3-3"),
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
        return _brandAirbnb!!
    }

private var _brandAirbnb: ImageVector? = null
