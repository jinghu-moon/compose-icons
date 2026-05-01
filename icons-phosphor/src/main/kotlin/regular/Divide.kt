package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Divide: ImageVector
    get() {
        if (_divide != null) return _divide!!
        _divide = phosphorRegularIcon(
            name = "Divide",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 132.41827f, 220.41827f, 136.0f, 216.0f, 136.0f),
                    PathNode.LineTo(40.0f, 136.0f),
                    PathNode.CurveTo(35.581722f, 136.0f, 32.0f, 132.41827f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 123.58172f, 35.581722f, 120.0f, 40.0f, 120.0f),
                    PathNode.LineTo(216.0f, 120.0f),
                    PathNode.CurveTo(220.41827f, 120.0f, 224.0f, 123.58172f, 224.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 80.0f),
                    PathNode.CurveTo(136.83656f, 80.0f, 144.0f, 72.836555f, 144.0f, 64.0f),
                    PathNode.CurveTo(144.0f, 55.163445f, 136.83656f, 48.0f, 128.0f, 48.0f),
                    PathNode.CurveTo(119.163445f, 48.0f, 112.0f, 55.163445f, 112.0f, 64.0f),
                    PathNode.CurveTo(112.0f, 72.836555f, 119.163445f, 80.0f, 128.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 176.0f),
                    PathNode.CurveTo(119.163445f, 176.0f, 112.0f, 183.16344f, 112.0f, 192.0f),
                    PathNode.CurveTo(112.0f, 200.83656f, 119.163445f, 208.0f, 128.0f, 208.0f),
                    PathNode.CurveTo(136.83656f, 208.0f, 144.0f, 200.83656f, 144.0f, 192.0f),
                    PathNode.CurveTo(144.0f, 183.16344f, 136.83656f, 176.0f, 128.0f, 176.0f),
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
        return _divide!!
    }

private var _divide: ImageVector? = null
