package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Panda: ImageVector
    get() {
        if (_panda != null) return _panda!!
        _panda = lucideOutlineIcon(
            name = "Panda",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.25f, 17.25f),
                    PathNode.LineTo(12.75f, 17.25f),
                    PathNode.LineTo(12.0f, 18.0f),
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
                    PathNode.MoveTo(15.0f, 12.0f),
                    PathNode.LineTo(17.0f, 14.0f)
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
                    PathNode.MoveTo(18.0f, 6.5f),
                    PathNode.CurveTo(18.0f, 6.223858f, 17.776142f, 6.0f, 17.5f, 6.0f)
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
                    PathNode.MoveTo(20.69f, 9.67f),
                    PathNode.CurveTo(21.918404f, 8.439702f, 22.32821f, 6.611848f, 21.742657f, 4.974858f),
                    PathNode.CurveTo(21.157103f, 3.337869f, 19.68095f, 2.184625f, 17.95092f, 2.012564f),
                    PathNode.CurveTo(16.22089f, 1.840504f, 14.54651f, 2.68041f, 13.65f, 4.17f),
                    PathNode.CurveTo(12.560953f, 3.950471f, 11.439047f, 3.950471f, 10.35f, 4.17f),
                    PathNode.CurveTo(9.45349f, 2.68041f, 7.77911f, 1.840504f, 6.04908f, 2.012564f),
                    PathNode.CurveTo(4.31905f, 2.184625f, 2.842898f, 3.337869f, 2.257344f, 4.974858f),
                    PathNode.CurveTo(1.67179f, 6.611848f, 2.081597f, 8.439702f, 3.31f, 9.67f),
                    PathNode.CurveTo(2.49f, 11.2f, 2.0f, 12.88f, 2.0f, 14.5f),
                    PathNode.CurveTo(2.0f, 19.47f, 6.48f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(17.52f, 22.0f, 22.0f, 19.47f, 22.0f, 14.5f),
                    PathNode.CurveTo(22.0f, 12.88f, 21.52f, 11.2f, 20.7f, 9.67f)
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
                    PathNode.MoveTo(6.0f, 6.5f),
                    PathNode.CurveTo(5.99865f, 6.366983f, 6.050895f, 6.23902f, 6.144957f, 6.144957f),
                    PathNode.CurveTo(6.23902f, 6.050895f, 6.366983f, 5.99865f, 6.5f, 6.0f)
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
                    PathNode.MoveTo(9.0f, 12.0f),
                    PathNode.LineTo(7.0f, 14.0f)
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
        return _panda!!
    }

private var _panda: ImageVector? = null
