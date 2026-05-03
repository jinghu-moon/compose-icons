package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HeartCrack: ImageVector
    get() {
        if (_heartCrack != null) return _heartCrack!!
        _heartCrack = lucideOutlineIcon(
            name = "HeartCrack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.409 5.824 C 11.707 6.616 11.259 7.320 10.994 7.990 L 13.147 10.146 C 13.342 10.341 13.342 10.658 13.147 10.853 L 10.854 13.146 C 10.659 13.341 10.659 13.658 10.854 13.853 L 12.000 15.000"),
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
                pathData = parseSvgPathData("M 13.508 20.313 C 13.131 20.746 12.586 20.996 12.012 21.000 C 11.438 21.003 10.890 20.760 10.508 20.332 L 5.000 15.000 C 3.500 13.500 2.000 11.800 2.000 9.500 C 2.000 7.222 3.404 5.179 5.531 4.364 C 7.658 3.548 10.068 4.128 11.591 5.823 C 11.821 6.038 12.178 6.038 12.409 5.824 C 13.932 4.130 16.341 3.549 18.468 4.364 C 20.596 5.180 22.000 7.222 22.000 9.500 C 22.000 11.790 20.500 13.500 19.000 15.000 Z"),
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
        return _heartCrack!!
    }

private var _heartCrack: ImageVector? = null
