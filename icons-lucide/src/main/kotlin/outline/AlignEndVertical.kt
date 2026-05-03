package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AlignEndVertical: ImageVector
    get() {
        if (_alignEndVertical != null) return _alignEndVertical!!
        _alignEndVertical = lucideOutlineIcon(
            name = "AlignEndVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 4.000 L 16.000 4.000 C 17.105 4.000 18.000 4.895 18.000 6.000 L 18.000 8.000 C 18.000 9.105 17.105 10.000 16.000 10.000 L 4.000 10.000 C 2.895 10.000 2.000 9.105 2.000 8.000 L 2.000 6.000 C 2.000 4.895 2.895 4.000 4.000 4.000 Z"),
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
                pathData = parseSvgPathData("M 11.000 14.000 L 16.000 14.000 C 17.105 14.000 18.000 14.895 18.000 16.000 L 18.000 18.000 C 18.000 19.105 17.105 20.000 16.000 20.000 L 11.000 20.000 C 9.895 20.000 9.000 19.105 9.000 18.000 L 9.000 16.000 C 9.000 14.895 9.895 14.000 11.000 14.000 Z"),
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
                pathData = parseSvgPathData("M 22.000 22.000 L 22.000 2.000"),
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
        return _alignEndVertical!!
    }

private var _alignEndVertical: ImageVector? = null
