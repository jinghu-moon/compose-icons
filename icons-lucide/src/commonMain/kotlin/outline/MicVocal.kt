package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MicVocal: ImageVector
    get() {
        if (_micVocal != null) return _micVocal!!
        _micVocal = lucideOutlineIcon(
            name = "MicVocal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 7.601f),
                    PathNode.LineTo(5.006f, 15.791f),
                    PathNode.CurveTo(4.714576f, 16.189095f, 4.757038f, 16.74024f, 5.106f, 17.089f),
                    PathNode.LineTo(5.923f, 17.907f),
                    PathNode.CurveTo(6.277392f, 18.261007f, 6.83903f, 18.298191f, 7.237f, 17.994f),
                    PathNode.LineTo(15.09f, 12.0f)
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
                    PathNode.MoveTo(16.5f, 21.174f),
                    PathNode.CurveTo(15.5f, 20.5f, 14.372f, 20.0f, 13.0f, 20.0f),
                    PathNode.CurveTo(10.942f, 20.0f, 9.072f, 22.356f, 7.0f, 22.0f),
                    PathNode.CurveTo(4.928f, 21.644f, 4.225f, 18.631f, 5.5f, 17.5f)
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
                    PathNode.MoveTo(21.0f, 7.0f),
                    PathNode.CurveTo(21.0f, 9.761424f, 18.761423f, 12.0f, 16.0f, 12.0f),
                    PathNode.CurveTo(13.238576f, 12.0f, 11.0f, 9.761424f, 11.0f, 7.0f),
                    PathNode.CurveTo(11.0f, 4.238577f, 13.238576f, 2.0f, 16.0f, 2.0f),
                    PathNode.CurveTo(18.761423f, 2.0f, 21.0f, 4.238577f, 21.0f, 7.0f),
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
        return _micVocal!!
    }

private var _micVocal: ImageVector? = null
