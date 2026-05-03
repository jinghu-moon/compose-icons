package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AlignHorizontalJustifyCenter: ImageVector
    get() {
        if (_alignHorizontalJustifyCenter != null) return _alignHorizontalJustifyCenter!!
        _alignHorizontalJustifyCenter = lucideOutlineIcon(
            name = "AlignHorizontalJustifyCenter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 5.000 L 6.000 5.000 C 7.105 5.000 8.000 5.895 8.000 7.000 L 8.000 17.000 C 8.000 18.105 7.105 19.000 6.000 19.000 L 4.000 19.000 C 2.895 19.000 2.000 18.105 2.000 17.000 L 2.000 7.000 C 2.000 5.895 2.895 5.000 4.000 5.000 Z"),
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
                pathData = parseSvgPathData("M 18.000 7.000 L 20.000 7.000 C 21.105 7.000 22.000 7.895 22.000 9.000 L 22.000 15.000 C 22.000 16.105 21.105 17.000 20.000 17.000 L 18.000 17.000 C 16.895 17.000 16.000 16.105 16.000 15.000 L 16.000 9.000 C 16.000 7.895 16.895 7.000 18.000 7.000 Z"),
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
                pathData = parseSvgPathData("M 12.000 2.000 L 12.000 22.000"),
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
        return _alignHorizontalJustifyCenter!!
    }

private var _alignHorizontalJustifyCenter: ImageVector? = null
