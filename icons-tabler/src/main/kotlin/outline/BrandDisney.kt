package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDisney: ImageVector
    get() {
        if (_brandDisney != null) return _brandDisney!!
        _brandDisney = tablerOutlineIcon(
            name = "BrandDisney",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.220 5.838 C 1.913 5.688 2.000 5.260 2.000 5.044 C 2.000 4.828 2.424 4.000 6.340 4.000 C 11.034 4.000 21.000 7.645 21.000 14.042 C 21.000 20.439 12.290 18.973 10.565 18.562 C 8.841 18.150 5.000 16.306 5.000 14.388 C 5.000 12.993 8.080 12.000 11.715 12.000 C 15.349 12.000 17.000 13.041 17.000 14.000 C 17.000 14.500 16.926 15.229 16.000 15.500"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 10.020 8.000 C 9.964 12.333 9.964 16.667 10.020 21.000"),
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
        return _brandDisney!!
    }

private var _brandDisney: ImageVector? = null
