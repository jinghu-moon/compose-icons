package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Blocks: ImageVector
    get() {
        if (_blocks != null) return _blocks!!
        _blocks = lucideOutlineIcon(
            name = "Blocks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 22.000 L 10.000 7.000 C 10.000 6.448 9.552 6.000 9.000 6.000 L 4.000 6.000 C 2.895 6.000 2.000 6.895 2.000 8.000 L 2.000 20.000 C 2.000 21.105 2.895 22.000 4.000 22.000 L 16.000 22.000 C 17.105 22.000 18.000 21.105 18.000 20.000 L 18.000 15.000 C 18.000 14.448 17.552 14.000 17.000 14.000 L 2.000 14.000"),
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
                pathData = parseSvgPathData("M 15.000 2.000 L 21.000 2.000 C 21.552 2.000 22.000 2.448 22.000 3.000 L 22.000 9.000 C 22.000 9.552 21.552 10.000 21.000 10.000 L 15.000 10.000 C 14.448 10.000 14.000 9.552 14.000 9.000 L 14.000 3.000 C 14.000 2.448 14.448 2.000 15.000 2.000 Z"),
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
        return _blocks!!
    }

private var _blocks: ImageVector? = null
