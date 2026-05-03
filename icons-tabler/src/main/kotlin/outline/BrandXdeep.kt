package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandXdeep: ImageVector
    get() {
        if (_brandXdeep != null) return _brandXdeep!!
        _brandXdeep = tablerOutlineIcon(
            name = "BrandXdeep",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.401 8.398 L 16.000 6.000 L 21.000 6.000 L 17.000 12.000 L 21.000 18.000 L 16.000 18.000 L 8.000 6.000 L 3.000 6.000 L 7.000 12.000 L 3.000 18.000 L 8.000 18.000 L 9.596 15.607"),
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
        return _brandXdeep!!
    }

private var _brandXdeep: ImageVector? = null
