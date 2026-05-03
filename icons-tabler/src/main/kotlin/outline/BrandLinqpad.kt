package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandLinqpad: ImageVector
    get() {
        if (_brandLinqpad != null) return _brandLinqpad!!
        _brandLinqpad = tablerOutlineIcon(
            name = "BrandLinqpad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.000 21.000 L 8.500 21.000 L 11.000 15.000 L 13.500 14.000 L 16.000 21.000 L 20.000 21.000 L 21.000 16.500 L 19.000 15.500 L 12.000 3.500 L 6.000 3.000 L 7.500 7.000 L 10.000 7.500 L 11.000 10.000 L 4.000 18.000 L 5.000 21.000"),
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
        return _brandLinqpad!!
    }

private var _brandLinqpad: ImageVector? = null
