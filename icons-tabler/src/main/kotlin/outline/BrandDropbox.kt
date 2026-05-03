package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDropbox: ImageVector
    get() {
        if (_brandDropbox != null) return _brandDropbox!!
        _brandDropbox = tablerOutlineIcon(
            name = "BrandDropbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.500 10.625 L 3.000 7.812 L 7.500 5.000 L 12.000 7.813M 7.500 10.625 L 12.000 7.812M 7.500 10.625 L 3.000 13.448 L 7.500 16.250M 7.500 10.625 L 12.000 13.448M 12.000 7.812 L 16.500 10.603 L 21.000 7.791 L 16.500 5.000 L 12.000 7.813M 7.500 16.251 L 12.000 13.449M 7.500 16.251 L 7.500 17.374 L 12.000 20.001 L 16.500 17.374 L 16.500 16.251M 12.000 13.449 L 16.500 10.626 L 21.000 13.449 L 16.500 16.251M 12.000 13.449 L 16.500 16.251"),
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
        return _brandDropbox!!
    }

private var _brandDropbox: ImageVector? = null
