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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.333 6 8.667 9.25 12 6l3.333 3.25L18.667 6 22 9.25l-3.333 3.25L15.333 9.25 12 12.5l3.333 3.25L12 19 8.667 15.75 12 12.5 8.667 9.25 5.333 12.5 2 9.25 5.333 6"),
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
        return _brandTidal!!
    }

private var _brandTidal: ImageVector? = null
