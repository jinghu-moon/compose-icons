package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.StepForward: ImageVector
    get() {
        if (_stepForward != null) return _stepForward!!
        _stepForward = lucideOutlineIcon(
            name = "StepForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.029 4.285 C 9.411 3.914 8.642 3.905 8.015 4.260 C 7.388 4.615 7.000 5.279 7.000 6.000 L 7.000 18.000 C 7.000 18.721 7.388 19.385 8.015 19.740 C 8.642 20.095 9.411 20.086 10.029 19.715 L 20.026 13.717 C 20.630 13.356 21.000 12.705 21.000 12.002 C 21.001 11.299 20.632 10.647 20.029 10.285 Z"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 3.000 4.000 L 3.000 20.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _stepForward!!
    }

private var _stepForward: ImageVector? = null
