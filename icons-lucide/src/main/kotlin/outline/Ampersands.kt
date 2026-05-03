package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Ampersands: ImageVector
    get() {
        if (_ampersands != null) return _ampersands!!
        _ampersands = lucideOutlineIcon(
            name = "Ampersands",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 17.000 C 5.000 14.000 3.000 10.000 3.000 8.000 C 3.000 6.895 3.895 6.000 5.000 6.000 C 6.105 6.000 7.000 6.895 7.000 8.000 C 7.000 10.500 2.000 10.500 2.000 14.000 C 2.000 15.700 3.300 17.000 5.000 17.000 C 7.800 17.000 10.000 14.800 10.000 12.000"),
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
                pathData = parseSvgPathData("M 22.000 17.000 C 17.000 14.000 15.000 10.000 15.000 8.000 C 15.000 6.895 15.895 6.000 17.000 6.000 C 18.105 6.000 19.000 6.895 19.000 8.000 C 19.000 10.500 14.000 10.500 14.000 14.000 C 14.000 15.700 15.300 17.000 17.000 17.000 C 19.800 17.000 22.000 14.800 22.000 12.000"),
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
        return _ampersands!!
    }

private var _ampersands: ImageVector? = null
