package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandLine: ImageVector
    get() {
        if (_brandLine != null) return _brandLine!!
        _brandLine = tablerOutlineIcon(
            name = "BrandLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 10.663 C 21.000 6.439 16.959 3.000 12.000 3.000 C 7.041 3.000 3.000 6.439 3.000 10.663 C 3.000 14.446 6.201 17.621 10.527 18.223 C 11.580 18.462 11.459 18.867 11.223 20.356 C 11.184 20.594 11.039 21.288 12.000 20.868 C 12.960 20.448 17.180 17.667 19.073 15.388 C 20.377 13.884 21.000 12.359 21.000 10.673 L 21.000 10.663"),
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
        return _brandLine!!
    }

private var _brandLine: ImageVector? = null
