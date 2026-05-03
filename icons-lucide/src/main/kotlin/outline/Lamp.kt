package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Lamp: ImageVector
    get() {
        if (_lamp != null) return _lamp!!
        _lamp = lucideOutlineIcon(
            name = "Lamp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 12.000 L 12.000 18.000"),
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
                pathData = parseSvgPathData("M 4.077 10.615 C 3.948 10.924 3.982 11.276 4.168 11.555 C 4.353 11.833 4.666 12.000 5.000 12.000 L 19.000 12.000 C 19.334 12.000 19.647 11.833 19.832 11.555 C 20.018 11.276 20.052 10.924 19.923 10.615 L 16.846 3.231 C 16.536 2.486 15.807 2.000 15.000 2.000 L 9.000 2.000 C 8.193 2.000 7.465 2.485 7.154 3.230 Z"),
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
                pathData = parseSvgPathData("M 8.000 20.000 C 8.000 18.895 8.895 18.000 10.000 18.000 L 14.000 18.000 C 15.105 18.000 16.000 18.895 16.000 20.000 L 16.000 21.000 C 16.000 21.552 15.552 22.000 15.000 22.000 L 9.000 22.000 C 8.448 22.000 8.000 21.552 8.000 21.000 Z"),
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
        return _lamp!!
    }

private var _lamp: ImageVector? = null
