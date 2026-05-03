package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTerraform: ImageVector
    get() {
        if (_brandTerraform != null) return _brandTerraform!!
        _brandTerraform = tablerOutlineIcon(
            name = "BrandTerraform",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.000 15.500 L 3.524 9.284 C 3.201 9.109 3.000 8.771 3.000 8.404 L 3.000 4.350 C 3.000 3.867 3.259 3.420 3.678 3.180 C 4.097 2.939 4.612 2.941 5.030 3.184 L 15.000 9.000 L 15.000 19.650 C 15.000 20.133 14.741 20.580 14.322 20.820 C 13.903 21.061 13.388 21.059 12.970 20.816 L 9.496 18.789 C 9.189 18.610 9.000 18.281 9.000 17.926 L 9.000 6.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 15.000 15.500 L 20.504 12.290 C 20.811 12.111 21.000 11.782 21.000 11.426 L 21.000 7.850 C 21.000 7.367 20.741 6.920 20.322 6.680 C 19.903 6.439 19.388 6.441 18.970 6.684 L 15.000 9.000"),
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
        return _brandTerraform!!
    }

private var _brandTerraform: ImageVector? = null
