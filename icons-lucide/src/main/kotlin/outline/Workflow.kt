package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Workflow: ImageVector
    get() {
        if (_workflow != null) return _workflow!!
        _workflow = lucideOutlineIcon(
            name = "Workflow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 3.000 L 9.000 3.000 C 10.105 3.000 11.000 3.895 11.000 5.000 L 11.000 9.000 C 11.000 10.105 10.105 11.000 9.000 11.000 L 5.000 11.000 C 3.895 11.000 3.000 10.105 3.000 9.000 L 3.000 5.000 C 3.000 3.895 3.895 3.000 5.000 3.000 Z"),
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
                pathData = parseSvgPathData("M 7.000 11.000 L 7.000 15.000 C 7.000 16.105 7.895 17.000 9.000 17.000 L 13.000 17.000"),
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
                pathData = parseSvgPathData("M 15.000 13.000 L 19.000 13.000 C 20.105 13.000 21.000 13.895 21.000 15.000 L 21.000 19.000 C 21.000 20.105 20.105 21.000 19.000 21.000 L 15.000 21.000 C 13.895 21.000 13.000 20.105 13.000 19.000 L 13.000 15.000 C 13.000 13.895 13.895 13.000 15.000 13.000 Z"),
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
        return _workflow!!
    }

private var _workflow: ImageVector? = null
