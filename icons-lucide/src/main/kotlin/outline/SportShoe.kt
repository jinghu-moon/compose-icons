package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SportShoe: ImageVector
    get() {
        if (_sportShoe != null) return _sportShoe!!
        _sportShoe = lucideOutlineIcon(
            name = "SportShoe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 10.420 L 19.800 5.350"),
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
                pathData = parseSvgPathData("M 19.000 18.000 L 22.000 18.000"),
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
                pathData = parseSvgPathData("M 9.500 22.000 L 21.414 9.415 C 21.824 9.005 22.036 8.437 21.995 7.859 C 21.954 7.280 21.664 6.748 21.200 6.400 L 15.590 2.192 C 15.286 1.970 14.883 1.937 14.547 2.108 C 14.211 2.279 14.000 2.623 14.000 3.000 L 14.000 5.000 C 14.000 5.871 13.436 6.642 12.606 6.906 L 8.677 8.053 C 8.272 8.191 8.000 8.572 8.000 9.000 C 7.845 15.393 5.918 18.000 4.000 18.000 C 2.895 18.000 2.000 18.895 2.000 20.000 C 2.000 21.105 2.895 22.000 4.000 22.000 L 18.000 22.000"),
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
        return _sportShoe!!
    }

private var _sportShoe: ImageVector? = null
