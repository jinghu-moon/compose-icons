package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandFoursquare: ImageVector
    get() {
        if (_brandFoursquare != null) return _brandFoursquare!!
        _brandFoursquare = tablerOutlineIcon(
            name = "BrandFoursquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.000 3.000 L 17.000 3.000 C 17.644 3.000 18.110 3.696 17.978 4.330 L 15.994 14.189 C 15.897 14.663 15.478 15.003 14.994 15.000 L 12.740 15.000 C 12.432 15.000 12.140 15.141 11.947 15.382 L 7.803 20.632 C 7.204 21.384 5.994 20.963 5.994 20.000 L 5.994 4.000 C 5.994 3.436 6.434 3.000 6.994 3.000 L 7.000 3.000"),
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
                pathData = parseSvgPathData("M 12.000 9.000 L 17.000 9.000"),
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
        return _brandFoursquare!!
    }

private var _brandFoursquare: ImageVector? = null
