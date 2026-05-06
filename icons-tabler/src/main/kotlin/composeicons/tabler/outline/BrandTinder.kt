package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTinder: ImageVector
    get() {
        if (_brandTinder != null) return _brandTinder!!
        _brandTinder = tablerOutlineIcon(
            name = "BrandTinder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.918 8.174c2.56 4.982 .501 11.656-5.38 12.626C5.836 22.487 .698 13.084 6.484 7.571 6.793 7.266 7.645 6.476 8 6.222c0 .528 .27 3.475 1 3.167 3 0 4-4.222 3.587-7.389 2.7 1.411 4.987 3.376 6.331 6.174"),
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
        return _brandTinder!!
    }

private var _brandTinder: ImageVector? = null
