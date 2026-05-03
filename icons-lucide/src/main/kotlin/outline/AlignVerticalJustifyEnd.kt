package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AlignVerticalJustifyEnd: ImageVector
    get() {
        if (_alignVerticalJustifyEnd != null) return _alignVerticalJustifyEnd!!
        _alignVerticalJustifyEnd = lucideOutlineIcon(
            name = "AlignVerticalJustifyEnd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.000 12.000 L 17.000 12.000 C 18.105 12.000 19.000 12.895 19.000 14.000 L 19.000 16.000 C 19.000 17.105 18.105 18.000 17.000 18.000 L 7.000 18.000 C 5.895 18.000 5.000 17.105 5.000 16.000 L 5.000 14.000 C 5.000 12.895 5.895 12.000 7.000 12.000 Z"),
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
                pathData = parseSvgPathData("M 9.000 2.000 L 15.000 2.000 C 16.105 2.000 17.000 2.895 17.000 4.000 L 17.000 6.000 C 17.000 7.105 16.105 8.000 15.000 8.000 L 9.000 8.000 C 7.895 8.000 7.000 7.105 7.000 6.000 L 7.000 4.000 C 7.000 2.895 7.895 2.000 9.000 2.000 Z"),
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
                pathData = parseSvgPathData("M 2.000 22.000 L 22.000 22.000"),
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
        return _alignVerticalJustifyEnd!!
    }

private var _alignVerticalJustifyEnd: ImageVector? = null
