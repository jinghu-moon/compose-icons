package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Sparkle: ImageVector
    get() {
        if (_sparkle != null) return _sparkle!!
        _sparkle = lucideOutlineIcon(
            name = "Sparkle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.017f, 2.814f),
                    PathNode.CurveTo(11.105402f, 2.340708f, 11.518523f, 1.997606f, 12.0f, 1.997606f),
                    PathNode.CurveTo(12.481477f, 1.997606f, 12.894598f, 2.340708f, 12.983f, 2.814f),
                    PathNode.LineTo(14.034f, 8.372f),
                    PathNode.CurveTo(14.186765f, 9.180687f, 14.819313f, 9.813235f, 15.628f, 9.966f),
                    PathNode.LineTo(21.186f, 11.017f),
                    PathNode.CurveTo(21.659292f, 11.105402f, 22.002394f, 11.518523f, 22.002394f, 12.0f),
                    PathNode.CurveTo(22.002394f, 12.481477f, 21.659292f, 12.894598f, 21.186f, 12.983f),
                    PathNode.LineTo(15.628f, 14.034f),
                    PathNode.CurveTo(14.819313f, 14.186765f, 14.186765f, 14.819313f, 14.034f, 15.628f),
                    PathNode.LineTo(12.983f, 21.186f),
                    PathNode.CurveTo(12.894598f, 21.659292f, 12.481477f, 22.002394f, 12.0f, 22.002394f),
                    PathNode.CurveTo(11.518523f, 22.002394f, 11.105402f, 21.659292f, 11.017f, 21.186f),
                    PathNode.LineTo(9.966f, 15.628f),
                    PathNode.CurveTo(9.813235f, 14.819313f, 9.180687f, 14.186765f, 8.372f, 14.034f),
                    PathNode.LineTo(2.814f, 12.983f),
                    PathNode.CurveTo(2.340708f, 12.894598f, 1.997606f, 12.481477f, 1.997606f, 12.0f),
                    PathNode.CurveTo(1.997606f, 11.518523f, 2.340708f, 11.105402f, 2.814f, 11.017f),
                    PathNode.LineTo(8.372f, 9.966f),
                    PathNode.CurveTo(9.180687f, 9.813235f, 9.813235f, 9.180687f, 9.966f, 8.372f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _sparkle!!
    }

private var _sparkle: ImageVector? = null
