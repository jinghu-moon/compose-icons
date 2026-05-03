package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Pipette: ImageVector
    get() {
        if (_pipette != null) return _pipette!!
        _pipette = lucideOutlineIcon(
            name = "Pipette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 9.000 L 3.586 17.414 C 3.211 17.789 3.000 18.298 3.000 18.828 L 3.000 20.172 C 3.000 20.702 2.789 21.211 2.414 21.586 C 2.789 21.211 3.298 21.000 3.828 21.000 L 5.172 21.000 C 5.702 21.000 6.211 20.789 6.586 20.414 L 15.000 12.000"),
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
                pathData = parseSvgPathData("M 18.000 9.000 L 18.400 9.400 C 19.228 10.228 19.228 11.572 18.400 12.400 C 17.572 13.228 16.228 13.228 15.400 12.400 L 11.600 8.600 C 10.772 7.772 10.772 6.428 11.600 5.600 C 12.428 4.772 13.772 4.772 14.600 5.600 L 15.000 6.000 L 18.400 2.600 C 19.228 1.772 20.572 1.772 21.400 2.600 C 22.228 3.428 22.228 4.772 21.400 5.600 Z"),
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
                pathData = parseSvgPathData("M 2.000 22.000 L 2.414 21.586"),
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
        return _pipette!!
    }

private var _pipette: ImageVector? = null
