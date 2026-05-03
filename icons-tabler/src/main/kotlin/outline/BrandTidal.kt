package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTidal: ImageVector
    get() {
        if (_brandTidal != null) return _brandTidal!!
        _brandTidal = tablerOutlineIcon(
            name = "BrandTidal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.333 6.000 L 8.667 9.250 L 12.000 6.000 L 15.333 9.250 L 18.667 6.000 L 22.000 9.250 L 18.667 12.500 L 15.333 9.250 L 12.000 12.500 L 15.333 15.750 L 12.000 19.000 L 8.667 15.750 L 12.000 12.500 L 8.667 9.250 L 5.333 12.500 L 2.000 9.250 L 5.333 6.000"),
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
        return _brandTidal!!
    }

private var _brandTidal: ImageVector? = null
