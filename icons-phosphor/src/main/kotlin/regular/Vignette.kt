package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Vignette: ImageVector
    get() {
        if (_vignette != null) return _vignette!!
        _vignette = phosphorRegularIcon(
            name = "Vignette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(224.83656f, 216.0f, 232.0f, 208.83656f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 200.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(178.05f, 87.66f),
                    PathNode.CurveTo(164.59f, 77.56f, 146.81f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(109.19f, 72.0f, 91.41f, 77.56f, 78.0f, 87.66f),
                    PathNode.CurveTo(63.79f, 98.27f, 56.0f, 112.6f, 56.0f, 128.0f),
                    PathNode.CurveTo(56.0f, 143.4f, 63.79f, 157.73f, 78.0f, 168.34f),
                    PathNode.CurveTo(91.41f, 178.44f, 109.19f, 184.0f, 128.0f, 184.0f),
                    PathNode.CurveTo(146.81f, 184.0f, 164.59f, 178.44f, 178.05f, 168.34f),
                    PathNode.CurveTo(192.21f, 157.73f, 200.0f, 143.4f, 200.0f, 128.0f),
                    PathNode.CurveTo(200.0f, 112.6f, 192.21f, 98.27f, 178.05f, 87.66f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 168.0f),
                    PathNode.CurveTo(97.12f, 168.0f, 72.0f, 150.06f, 72.0f, 128.0f),
                    PathNode.CurveTo(72.0f, 105.94f, 97.12f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(158.88f, 88.0f, 184.0f, 105.94f, 184.0f, 128.0f),
                    PathNode.CurveTo(184.0f, 150.06f, 158.88f, 168.0f, 128.0f, 168.0f),
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
        return _vignette!!
    }

private var _vignette: ImageVector? = null
