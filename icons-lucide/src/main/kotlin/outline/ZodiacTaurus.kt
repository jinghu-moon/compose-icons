package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ZodiacTaurus: ImageVector
    get() {
        if (_zodiacTaurus != null) return _zodiacTaurus!!
        _zodiacTaurus = lucideOutlineIcon(
            name = "ZodiacTaurus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 15.000 C 18.000 18.314 15.314 21.000 12.000 21.000 C 8.686 21.000 6.000 18.314 6.000 15.000 C 6.000 11.686 8.686 9.000 12.000 9.000 C 15.314 9.000 18.000 11.686 18.000 15.000 Z"),
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
                pathData = parseSvgPathData("M 18.000 3.000 C 18.000 6.314 15.314 9.000 12.000 9.000 C 8.686 9.000 6.000 6.314 6.000 3.000"),
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
        return _zodiacTaurus!!
    }

private var _zodiacTaurus: ImageVector? = null
