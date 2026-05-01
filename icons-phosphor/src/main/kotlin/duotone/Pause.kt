package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Pause: ImageVector
    get() {
        if (_pause != null) return _pause!!
        _pause = phosphorDuotoneIcon(
            name = "Pause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 48.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.CurveTo(208.0f, 212.41827f, 204.41827f, 216.0f, 200.0f, 216.0f),
                    PathNode.LineTo(160.0f, 216.0f),
                    PathNode.CurveTo(155.58173f, 216.0f, 152.0f, 212.41827f, 152.0f, 208.0f),
                    PathNode.LineTo(152.0f, 48.0f),
                    PathNode.CurveTo(152.0f, 43.581722f, 155.58173f, 40.0f, 160.0f, 40.0f),
                    PathNode.LineTo(200.0f, 40.0f),
                    PathNode.CurveTo(204.41827f, 40.0f, 208.0f, 43.581722f, 208.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 40.0f),
                    PathNode.LineTo(56.0f, 40.0f),
                    PathNode.CurveTo(51.581722f, 40.0f, 48.0f, 43.581722f, 48.0f, 48.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.CurveTo(48.0f, 212.41827f, 51.581722f, 216.0f, 56.0f, 216.0f),
                    PathNode.LineTo(96.0f, 216.0f),
                    PathNode.CurveTo(100.41828f, 216.0f, 104.0f, 212.41827f, 104.0f, 208.0f),
                    PathNode.LineTo(104.0f, 48.0f),
                    PathNode.CurveTo(104.0f, 43.581722f, 100.41828f, 40.0f, 96.0f, 40.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 32.0f),
                    PathNode.LineTo(160.0f, 32.0f),
                    PathNode.CurveTo(151.16344f, 32.0f, 144.0f, 39.163445f, 144.0f, 48.0f),
                    PathNode.LineTo(144.0f, 208.0f),
                    PathNode.CurveTo(144.0f, 216.83656f, 151.16344f, 224.0f, 160.0f, 224.0f),
                    PathNode.LineTo(200.0f, 224.0f),
                    PathNode.CurveTo(208.83656f, 224.0f, 216.0f, 216.83656f, 216.0f, 208.0f),
                    PathNode.LineTo(216.0f, 48.0f),
                    PathNode.CurveTo(216.0f, 39.163445f, 208.83656f, 32.0f, 200.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 208.0f),
                    PathNode.LineTo(160.0f, 208.0f),
                    PathNode.LineTo(160.0f, 48.0f),
                    PathNode.LineTo(200.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 32.0f),
                    PathNode.LineTo(56.0f, 32.0f),
                    PathNode.CurveTo(47.163445f, 32.0f, 40.0f, 39.163445f, 40.0f, 48.0f),
                    PathNode.LineTo(40.0f, 208.0f),
                    PathNode.CurveTo(40.0f, 216.83656f, 47.163445f, 224.0f, 56.0f, 224.0f),
                    PathNode.LineTo(96.0f, 224.0f),
                    PathNode.CurveTo(104.836555f, 224.0f, 112.0f, 216.83656f, 112.0f, 208.0f),
                    PathNode.LineTo(112.0f, 48.0f),
                    PathNode.CurveTo(112.0f, 39.163445f, 104.836555f, 32.0f, 96.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 208.0f),
                    PathNode.LineTo(56.0f, 208.0f),
                    PathNode.LineTo(56.0f, 48.0f),
                    PathNode.LineTo(96.0f, 48.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _pause!!
    }

private var _pause: ImageVector? = null
