package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Pacman: ImageVector
    get() {
        if (_pacman != null) return _pacman!!
        _pacman = tablerOutlineIcon(
            name = "Pacman",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.636f, 5.636f),
                    PathNode.CurveTo(8.447046f, 3.824641f, 10.944105f, 2.87077f, 13.50156f, 3.01337f),
                    PathNode.CurveTo(16.059015f, 3.155971f, 18.434551f, 4.381532f, 20.033f, 6.383f),
                    PathNode.LineTo(14.414f, 12.0f),
                    PathNode.LineTo(20.033f, 17.617f),
                    PathNode.CurveTo(17.95063f, 20.219933f, 14.600126f, 21.45873f, 11.325315f, 20.836536f),
                    PathNode.CurveTo(8.050502f, 20.21434f, 5.387791f, 17.833067f, 4.405147f, 14.647798f),
                    PathNode.CurveTo(3.422502f, 11.46253f, 4.28088f, 7.995011f, 6.636f, 5.636f)
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
                    PathNode.MoveTo(11.5f, 7.5f),
                    PathNode.CurveTo(11.5f, 8.052285f, 11.947715f, 8.5f, 12.5f, 8.5f),
                    PathNode.CurveTo(13.052285f, 8.5f, 13.5f, 8.052285f, 13.5f, 7.5f),
                    PathNode.CurveTo(13.5f, 6.947716f, 13.052285f, 6.5f, 12.5f, 6.5f),
                    PathNode.CurveTo(11.947715f, 6.5f, 11.5f, 6.947716f, 11.5f, 7.5f)
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
        return _pacman!!
    }

private var _pacman: ImageVector? = null
