package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TreePine: ImageVector
    get() {
        if (_treePine != null) return _treePine!!
        _treePine = lucideOutlineIcon(
            name = "TreePine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 14.000 L 20.000 17.300 C 20.280 17.586 20.363 18.011 20.211 18.381 C 20.058 18.751 19.700 18.994 19.300 19.000 L 4.700 19.000 C 4.300 18.994 3.942 18.751 3.789 18.381 C 3.637 18.011 3.720 17.586 4.000 17.300 L 7.000 14.000 L 6.700 14.000 C 6.300 13.994 5.942 13.751 5.789 13.381 C 5.637 13.011 5.720 12.586 6.000 12.300 L 9.000 9.000 L 8.800 9.000 C 8.382 9.038 7.984 8.810 7.805 8.430 C 7.626 8.050 7.704 7.598 8.000 7.300 L 12.000 3.000 L 16.000 7.300 C 16.296 7.598 16.374 8.050 16.195 8.430 C 16.016 8.810 15.618 9.038 15.200 9.000 L 15.000 9.000 L 18.000 12.300 C 18.280 12.586 18.363 13.011 18.211 13.381 C 18.058 13.751 17.700 13.994 17.300 14.000 L 17.000 14.000 Z"),
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
                pathData = parseSvgPathData("M 12.000 22.000 L 12.000 19.000"),
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
        return _treePine!!
    }

private var _treePine: ImageVector? = null
