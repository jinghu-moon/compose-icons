package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Trees: ImageVector
    get() {
        if (_trees != null) return _trees!!
        _trees = lucideOutlineIcon(
            name = "Trees",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 10.000 L 10.000 10.200 C 11.353 10.720 12.141 12.134 11.871 13.559 C 11.600 14.984 10.350 16.011 8.900 16.000 L 5.000 16.000 C 3.568 15.964 2.362 14.922 2.118 13.511 C 1.875 12.099 2.663 10.713 4.000 10.200 L 4.000 10.000 C 4.000 8.343 5.343 7.000 7.000 7.000 C 8.657 7.000 10.000 8.343 10.000 10.000 Z"),
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
                pathData = parseSvgPathData("M 7.000 16.000 L 7.000 22.000"),
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
                pathData = parseSvgPathData("M 13.000 19.000 L 13.000 22.000"),
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
                pathData = parseSvgPathData("M 12.000 19.000 L 20.300 19.000 C 20.700 18.994 21.058 18.751 21.211 18.381 C 21.363 18.011 21.280 17.586 21.000 17.300 L 18.000 14.000 L 18.300 14.000 C 18.700 13.994 19.058 13.751 19.211 13.381 C 19.363 13.011 19.280 12.586 19.000 12.300 L 16.000 9.000 L 16.200 9.000 C 16.618 9.038 17.016 8.810 17.195 8.430 C 17.374 8.050 17.296 7.598 17.000 7.300 L 13.000 3.000 L 11.600 4.500"),
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
        return _trees!!
    }

private var _trees: ImageVector? = null
