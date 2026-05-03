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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 10.000 C 10.000 10.000 9.000 11.000 9.000 13.000 C 9.000 14.500 10.494 16.535 12.000 18.500 C 13.000 19.500 13.500 20.000 14.500 20.500 C 15.500 21.000 17.000 21.500 19.000 20.000 C 21.000 18.500 20.500 16.500 19.500 14.000 C 18.500 11.500 17.167 8.500 14.500 4.500 C 13.666 3.500 13.000 3.000 11.997 3.000 C 10.997 3.000 10.374 3.450 9.500 4.500 C 6.833 8.500 5.500 11.500 4.500 14.000 C 3.500 16.500 3.000 18.500 5.000 20.000 C 7.000 21.500 8.500 21.000 9.500 20.500 C 10.500 20.000 11.000 19.500 12.000 18.500 C 13.506 16.535 15.000 14.500 15.000 13.000 C 15.000 11.000 14.000 10.000 12.000 10.000"),
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
        return _brandAirbnb!!
    }

private var _brandAirbnb: ImageVector? = null
