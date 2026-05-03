package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.OctagonPlus: ImageVector
    get() {
        if (_octagonPlus != null) return _octagonPlus!!
        _octagonPlus = tablerFilledIcon(
            name = "OctagonPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.196 1.246 L 18.771 3.636 C 19.487 3.943 20.058 4.514 20.366 5.230 L 22.754 10.803 C 23.082 11.567 23.082 12.433 22.754 13.196 L 20.364 18.771 C 20.057 19.487 19.486 20.058 18.770 20.366 L 13.197 22.754 C 12.433 23.082 11.568 23.082 10.804 22.754 L 5.230 20.365 C 4.513 20.058 3.942 19.487 3.635 18.770 L 1.247 13.196 C 0.920 12.432 0.920 11.568 1.247 10.804 L 3.637 5.229 C 3.944 4.513 4.514 3.942 5.230 3.634 L 10.804 1.246 C 11.568 0.919 12.432 0.919 13.196 1.246M 12.000 8.000 C 11.448 8.000 11.000 8.448 11.000 9.000 L 11.000 11.000 L 9.000 11.000 C 8.448 11.000 8.000 11.448 8.000 12.000 C 8.000 12.552 8.448 13.000 9.000 13.000 L 11.000 13.000 L 11.000 15.000 C 11.000 15.552 11.448 16.000 12.000 16.000 C 12.552 16.000 13.000 15.552 13.000 15.000 L 13.000 13.000 L 15.000 13.000 C 15.552 13.000 16.000 12.552 16.000 12.000 C 16.000 11.448 15.552 11.000 15.000 11.000 L 13.000 11.000 L 13.000 9.000 C 13.000 8.448 12.552 8.000 12.000 8.000"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _octagonPlus!!
    }

private var _octagonPlus: ImageVector? = null
