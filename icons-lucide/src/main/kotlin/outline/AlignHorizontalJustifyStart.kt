package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AlignHorizontalJustifyStart: ImageVector
    get() {
        if (_alignHorizontalJustifyStart != null) return _alignHorizontalJustifyStart!!
        _alignHorizontalJustifyStart = lucideOutlineIcon(
            name = "AlignHorizontalJustifyStart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.000 5.000 L 10.000 5.000 C 11.105 5.000 12.000 5.895 12.000 7.000 L 12.000 17.000 C 12.000 18.105 11.105 19.000 10.000 19.000 L 8.000 19.000 C 6.895 19.000 6.000 18.105 6.000 17.000 L 6.000 7.000 C 6.000 5.895 6.895 5.000 8.000 5.000 Z"),
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
                pathData = parseSvgPathData("M 2.000 2.000 L 2.000 22.000"),
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
        return _alignHorizontalJustifyStart!!
    }

private var _alignHorizontalJustifyStart: ImageVector? = null
