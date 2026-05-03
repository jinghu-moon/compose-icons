package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAngular: ImageVector
    get() {
        if (_brandAngular != null) return _brandAngular!!
        _brandAngular = tablerOutlineIcon(
            name = "BrandAngular",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.428 17.245 L 11.504 20.716 C 11.811 20.892 12.189 20.892 12.496 20.716 L 18.572 17.245 C 18.842 17.091 19.025 16.819 19.067 16.511 L 20.390 6.807 C 20.454 6.337 20.179 5.887 19.732 5.729 L 12.332 3.117 C 12.117 3.041 11.882 3.041 11.667 3.117 L 4.268 5.730 C 3.821 5.888 3.546 6.338 3.610 6.808 L 4.933 16.512 C 4.975 16.820 5.158 17.092 5.428 17.246 L 5.428 17.245"),
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
                pathData = parseSvgPathData("M 9.000 15.000 L 12.000 7.000 L 15.000 15.000"),
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
                pathData = parseSvgPathData("M 10.000 13.000 L 14.000 13.000"),
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
        return _brandAngular!!
    }

private var _brandAngular: ImageVector? = null
