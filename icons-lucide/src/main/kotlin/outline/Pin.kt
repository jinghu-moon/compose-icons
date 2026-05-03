package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Pin: ImageVector
    get() {
        if (_pin != null) return _pin!!
        _pin = lucideOutlineIcon(
            name = "Pin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 17.000 L 12.000 22.000"),
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
                pathData = parseSvgPathData("M 9.000 10.760 C 9.000 11.519 8.570 12.212 7.890 12.550 L 6.110 13.450 C 5.430 13.788 5.000 14.481 5.000 15.240 L 5.000 16.000 C 5.000 16.552 5.448 17.000 6.000 17.000 L 18.000 17.000 C 18.552 17.000 19.000 16.552 19.000 16.000 L 19.000 15.240 C 19.000 14.481 18.570 13.788 17.890 13.450 L 16.110 12.550 C 15.430 12.212 15.000 11.519 15.000 10.760 L 15.000 7.000 C 15.000 6.448 15.448 6.000 16.000 6.000 C 17.105 6.000 18.000 5.105 18.000 4.000 C 18.000 2.895 17.105 2.000 16.000 2.000 L 8.000 2.000 C 6.895 2.000 6.000 2.895 6.000 4.000 C 6.000 5.105 6.895 6.000 8.000 6.000 C 8.552 6.000 9.000 6.448 9.000 7.000 Z"),
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
        return _pin!!
    }

private var _pin: ImageVector? = null
