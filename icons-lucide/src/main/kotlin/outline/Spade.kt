package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Spade: ImageVector
    get() {
        if (_spade != null) return _spade!!
        _spade = lucideOutlineIcon(
            name = "Spade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 18.000 L 12.000 22.000"),
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
                pathData = parseSvgPathData("M 2.000 14.499 C 2.000 16.777 3.405 18.819 5.532 19.634 C 7.659 20.449 10.069 19.868 11.591 18.174 C 11.822 17.960 12.179 17.960 12.409 18.175 C 13.931 19.869 16.341 20.450 18.468 19.635 C 20.595 18.820 22.000 16.778 22.000 14.500 C 22.000 12.210 20.500 10.500 19.000 9.000 L 13.508 3.688 C 13.131 3.255 12.587 3.005 12.013 3.001 C 11.439 2.997 10.891 3.240 10.508 3.668 L 5.000 8.999 C 3.500 10.499 2.000 12.199 2.000 14.499"),
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
        return _spade!!
    }

private var _spade: ImageVector? = null
