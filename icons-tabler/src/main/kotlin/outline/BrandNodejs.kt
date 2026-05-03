package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandNodejs: ImageVector
    get() {
        if (_brandNodejs != null) return _brandNodejs!!
        _brandNodejs = tablerOutlineIcon(
            name = "BrandNodejs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 9.000 L 9.000 17.044 C 9.000 17.758 8.619 18.417 8.002 18.775 C 7.384 19.132 6.623 19.133 6.004 18.778 L 4.436 17.878 C 3.544 17.333 3.000 16.363 3.000 15.317 L 3.000 8.682 C 3.000 7.637 3.544 6.667 4.436 6.122 L 10.436 2.455 C 11.396 1.868 12.604 1.868 13.564 2.455 L 19.564 6.122 C 20.456 6.667 21.000 7.637 21.000 8.683 L 21.000 15.317 C 21.000 16.362 20.456 17.332 19.564 17.877 L 13.564 21.544 C 12.604 22.131 11.396 22.131 10.436 21.544"),
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
        pathData = parseSvgPathData("M 17.000 9.000 L 13.500 9.000 C 12.672 9.000 12.000 9.672 12.000 10.500 C 12.000 11.328 12.672 12.000 13.500 12.000 L 15.500 12.000 C 16.328 12.000 17.000 12.672 17.000 13.500 C 17.000 14.328 16.328 15.000 15.500 15.000 L 12.000 15.000"),
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
        return _brandNodejs!!
    }

private var _brandNodejs: ImageVector? = null
