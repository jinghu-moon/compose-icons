package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WaveSquare: ImageVector
    get() {
        if (_waveSquare != null) return _waveSquare!!
        _waveSquare = phosphorLightIcon(
            name = "WaveSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(238.0f, 128.0f),
                    PathNode.LineTo(238.0f, 184.0f),
                    PathNode.CurveTo(238.0f, 187.3137f, 235.3137f, 190.0f, 232.0f, 190.0f),
                    PathNode.LineTo(128.0f, 190.0f),
                    PathNode.CurveTo(124.686295f, 190.0f, 122.0f, 187.3137f, 122.0f, 184.0f),
                    PathNode.LineTo(122.0f, 78.0f),
                    PathNode.LineTo(30.0f, 78.0f),
                    PathNode.LineTo(30.0f, 128.0f),
                    PathNode.CurveTo(30.0f, 131.3137f, 27.31371f, 134.0f, 24.0f, 134.0f),
                    PathNode.CurveTo(20.68629f, 134.0f, 18.0f, 131.3137f, 18.0f, 128.0f),
                    PathNode.LineTo(18.0f, 72.0f),
                    PathNode.CurveTo(18.0f, 68.686295f, 20.68629f, 66.0f, 24.0f, 66.0f),
                    PathNode.LineTo(128.0f, 66.0f),
                    PathNode.CurveTo(131.3137f, 66.0f, 134.0f, 68.686295f, 134.0f, 72.0f),
                    PathNode.LineTo(134.0f, 178.0f),
                    PathNode.LineTo(226.0f, 178.0f),
                    PathNode.LineTo(226.0f, 128.0f),
                    PathNode.CurveTo(226.0f, 124.686295f, 228.6863f, 122.0f, 232.0f, 122.0f),
                    PathNode.CurveTo(235.3137f, 122.0f, 238.0f, 124.686295f, 238.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _waveSquare!!
    }

private var _waveSquare: ImageVector? = null
