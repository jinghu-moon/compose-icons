package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ToyBrick: ImageVector
    get() {
        if (_toyBrick != null) return _toyBrick!!
        _toyBrick = lucideOutlineIcon(
            name = "ToyBrick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 8.000 L 20.000 8.000 C 20.552 8.000 21.000 8.448 21.000 9.000 L 21.000 19.000 C 21.000 19.552 20.552 20.000 20.000 20.000 L 4.000 20.000 C 3.448 20.000 3.000 19.552 3.000 19.000 L 3.000 9.000 C 3.000 8.448 3.448 8.000 4.000 8.000 Z"),
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
                pathData = parseSvgPathData("M 10.000 8.000 L 10.000 5.000 C 10.000 4.400 9.600 4.000 9.000 4.000 L 6.000 4.000 C 5.448 4.000 5.000 4.448 5.000 5.000 L 5.000 8.000"),
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
                pathData = parseSvgPathData("M 19.000 8.000 L 19.000 5.000 C 19.000 4.400 18.600 4.000 18.000 4.000 L 15.000 4.000 C 14.448 4.000 14.000 4.448 14.000 5.000 L 14.000 8.000"),
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
        return _toyBrick!!
    }

private var _toyBrick: ImageVector? = null
