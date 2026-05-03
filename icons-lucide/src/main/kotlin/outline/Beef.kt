package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Beef: ImageVector
    get() {
        if (_beef != null) return _beef!!
        _beef = lucideOutlineIcon(
            name = "Beef",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.400 13.700 C 18.652 12.008 19.557 9.058 18.643 6.394 C 17.729 3.730 15.203 1.958 12.387 2.005 C 9.570 2.052 7.105 3.907 6.280 6.600 C 5.180 9.730 5.500 10.500 3.100 12.680 C 2.120 13.483 1.751 14.816 2.177 16.009 C 2.603 17.202 3.733 17.999 5.000 18.000 C 9.000 18.000 13.400 16.200 16.400 13.700"),
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
                pathData = parseSvgPathData("M 18.500 6.000 L 20.690 10.500 C 21.550 13.143 20.628 16.039 18.400 17.700 C 15.400 20.200 11.000 22.000 7.000 22.000 C 5.865 21.998 4.827 21.356 4.320 20.340 L 2.400 16.500"),
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
                pathData = parseSvgPathData("M 15.000 8.500 C 15.000 9.881 13.881 11.000 12.500 11.000 C 11.119 11.000 10.000 9.881 10.000 8.500 C 10.000 7.119 11.119 6.000 12.500 6.000 C 13.881 6.000 15.000 7.119 15.000 8.500 Z"),
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
        return _beef!!
    }

private var _beef: ImageVector? = null
