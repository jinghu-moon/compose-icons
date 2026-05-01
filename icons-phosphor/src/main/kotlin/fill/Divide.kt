package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Divide: ImageVector
    get() {
        if (_divide != null) return _divide!!
        _divide = phosphorFillIcon(
            name = "Divide",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 64.0f),
                    PathNode.CurveTo(136.83656f, 64.0f, 144.0f, 71.163445f, 144.0f, 80.0f),
                    PathNode.CurveTo(144.0f, 88.836555f, 136.83656f, 96.0f, 128.0f, 96.0f),
                    PathNode.CurveTo(119.163445f, 96.0f, 112.0f, 88.836555f, 112.0f, 80.0f),
                    PathNode.CurveTo(112.0f, 71.163445f, 119.163445f, 64.0f, 128.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 192.0f),
                    PathNode.CurveTo(119.163445f, 192.0f, 112.0f, 184.83656f, 112.0f, 176.0f),
                    PathNode.CurveTo(112.0f, 167.16344f, 119.163445f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(136.83656f, 160.0f, 144.0f, 167.16344f, 144.0f, 176.0f),
                    PathNode.CurveTo(144.0f, 184.83656f, 136.83656f, 192.0f, 128.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 136.0f),
                    PathNode.LineTo(72.0f, 136.0f),
                    PathNode.CurveTo(67.58172f, 136.0f, 64.0f, 132.41827f, 64.0f, 128.0f),
                    PathNode.CurveTo(64.0f, 123.58172f, 67.58172f, 120.0f, 72.0f, 120.0f),
                    PathNode.LineTo(184.0f, 120.0f),
                    PathNode.CurveTo(188.41827f, 120.0f, 192.0f, 123.58172f, 192.0f, 128.0f),
                    PathNode.CurveTo(192.0f, 132.41827f, 188.41827f, 136.0f, 184.0f, 136.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _divide!!
    }

private var _divide: ImageVector? = null
