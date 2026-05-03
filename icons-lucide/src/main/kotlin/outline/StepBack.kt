package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.StepBack: ImageVector
    get() {
        if (_stepBack != null) return _stepBack!!
        _stepBack = lucideOutlineIcon(
            name = "StepBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.971 4.285 C 14.589 3.914 15.358 3.905 15.985 4.260 C 16.612 4.615 17.000 5.279 17.000 6.000 L 17.000 18.000 C 17.000 18.721 16.612 19.385 15.985 19.740 C 15.358 20.095 14.589 20.086 13.971 19.715 L 3.974 13.717 C 3.370 13.356 3.000 12.705 3.000 12.002 C 2.999 11.299 3.368 10.647 3.971 10.285 Z"),
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
                pathData = parseSvgPathData("M 21.000 20.000 L 21.000 4.000"),
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
        return _stepBack!!
    }

private var _stepBack: ImageVector? = null
