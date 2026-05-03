package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Sailboat: ImageVector
    get() {
        if (_sailboat != null) return _sailboat!!
        _sailboat = lucideOutlineIcon(
            name = "Sailboat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 2.0f),
                    PathNode.LineTo(10.0f, 17.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 22.0f),
                    PathNode.CurveTo(4.790861f, 22.0f, 3.0f, 20.209139f, 3.0f, 18.0f),
                    PathNode.CurveTo(3.0f, 17.447716f, 3.447715f, 17.0f, 4.0f, 17.0f),
                    PathNode.LineTo(20.0f, 17.0f),
                    PathNode.CurveTo(20.552284f, 17.0f, 21.0f, 17.447716f, 21.0f, 18.0f),
                    PathNode.CurveTo(21.0f, 20.209139f, 19.209139f, 22.0f, 17.0f, 22.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.159f, 2.46f),
                    PathNode.CurveTo(9.318936f, 2.211055f, 9.58091f, 2.045722f, 9.874451f, 2.008474f),
                    PathNode.CurveTo(10.167992f, 1.971227f, 10.462955f, 2.06589f, 10.68f, 2.267f),
                    PathNode.LineTo(20.657f, 11.247f),
                    PathNode.CurveTo(20.970655f, 11.521091f, 21.081558f, 11.960902f, 20.935375f, 12.350948f),
                    PathNode.CurveTo(20.789192f, 12.740994f, 20.41654f, 12.999576f, 20.0f, 13.0f),
                    PathNode.LineTo(4.0f, 13.0f),
                    PathNode.CurveTo(3.628487f, 13.000105f, 3.287538f, 12.794243f, 3.114628f, 12.465421f),
                    PathNode.CurveTo(2.941718f, 12.136599f, 2.965352f, 11.739022f, 3.176f, 11.433f),
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
        return _sailboat!!
    }

private var _sailboat: ImageVector? = null
