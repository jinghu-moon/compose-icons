package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ZodiacOphiuchus: ImageVector
    get() {
        if (_zodiacOphiuchus != null) return _zodiacOphiuchus!!
        _zodiacOphiuchus = lucideOutlineIcon(
            name = "ZodiacOphiuchus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 10.000 C 4.149 8.726 5.784 7.999 7.500 7.999 C 9.216 7.999 10.851 8.726 12.000 10.000 C 13.149 11.274 14.784 12.001 16.500 12.001 C 18.216 12.001 19.851 11.274 21.000 10.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 6.000 3.000 L 6.000 15.000 C 6.000 18.314 8.686 21.000 12.000 21.000 C 15.314 21.000 18.000 18.314 18.000 15.000 L 18.000 3.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _zodiacOphiuchus!!
    }

private var _zodiacOphiuchus: ImageVector? = null
