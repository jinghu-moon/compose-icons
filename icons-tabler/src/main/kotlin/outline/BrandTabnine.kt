package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTabnine: ImageVector
    get() {
        if (_brandTabnine != null) return _brandTabnine!!
        _brandTabnine = tablerOutlineIcon(
            name = "BrandTabnine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 12.000 L 8.000 18.750M 20.000 12.000 L 8.000 5.250M 20.000 12.000 L 20.000 7.473 L 12.000 3.000 L 8.000 5.250M 20.000 12.000 L 20.000 16.500 L 12.000 21.000 L 8.000 18.750M 8.000 5.250 L 4.000 7.472 L 4.000 16.500 L 8.000 18.750 L 20.000 12.000"),
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
        return _brandTabnine!!
    }

private var _brandTabnine: ImageVector? = null
