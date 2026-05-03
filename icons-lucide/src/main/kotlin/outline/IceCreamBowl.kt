package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.IceCreamBowl: ImageVector
    get() {
        if (_iceCreamBowl != null) return _iceCreamBowl!!
        _iceCreamBowl = lucideOutlineIcon(
            name = "IceCreamBowl",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 17.000 C 17.000 17.000 20.000 14.310 20.000 11.000 L 4.000 11.000 C 4.000 14.310 7.000 17.000 12.000 17.000M 8.000 21.000 L 16.000 21.000M 12.000 18.000 L 12.000 21.000M 5.140 11.000 C 4.714 9.567 5.245 8.022 6.462 7.154 C 7.678 6.286 9.312 6.286 10.528 7.154 C 11.745 8.022 12.276 9.567 11.850 11.000"),
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
                pathData = parseSvgPathData("M 12.140 11.000 C 11.714 9.567 12.245 8.022 13.462 7.154 C 14.678 6.286 16.312 6.286 17.528 7.154 C 18.745 8.022 19.276 9.567 18.850 11.000"),
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
                pathData = parseSvgPathData("M 15.500 6.500 C 15.500 4.567 13.933 3.000 12.000 3.000 C 10.067 3.000 8.500 4.567 8.500 6.500"),
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
        return _iceCreamBowl!!
    }

private var _iceCreamBowl: ImageVector? = null
