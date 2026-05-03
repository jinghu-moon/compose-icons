package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PlayPause: ImageVector
    get() {
        if (_playPause != null) return _playPause!!
        _playPause = phosphorBoldIcon(
            name = "PlayPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(188.0f, 64.0f),
                    PathNode.LineTo(188.0f, 192.0f),
                    PathNode.CurveTo(188.0f, 198.62741f, 182.62741f, 204.0f, 176.0f, 204.0f),
                    PathNode.CurveTo(169.37259f, 204.0f, 164.0f, 198.62741f, 164.0f, 192.0f),
                    PathNode.LineTo(164.0f, 64.0f),
                    PathNode.CurveTo(164.0f, 57.37258f, 169.37259f, 52.0f, 176.0f, 52.0f),
                    PathNode.CurveTo(182.62741f, 52.0f, 188.0f, 57.37258f, 188.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 52.0f),
                    PathNode.CurveTo(217.37259f, 52.0f, 212.0f, 57.37258f, 212.0f, 64.0f),
                    PathNode.LineTo(212.0f, 192.0f),
                    PathNode.CurveTo(212.0f, 198.62741f, 217.37259f, 204.0f, 224.0f, 204.0f),
                    PathNode.CurveTo(230.62741f, 204.0f, 236.0f, 198.62741f, 236.0f, 192.0f),
                    PathNode.LineTo(236.0f, 64.0f),
                    PathNode.CurveTo(236.0f, 57.37258f, 230.62741f, 52.0f, 224.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 128.0f),
                    PathNode.CurveTo(148.01453f, 134.77988f, 144.54341f, 141.09132f, 138.81f, 144.71f),
                    PathNode.LineTo(50.63f, 200.87f),
                    PathNode.CurveTo(44.509655f, 204.78061f, 36.745438f, 205.0482f, 30.370375f, 201.56825f),
                    PathNode.CurveTo(23.995314f, 198.08829f, 20.021013f, 191.413f, 20.0f, 184.15f),
                    PathNode.LineTo(20.0f, 71.85f),
                    PathNode.CurveTo(20.021013f, 64.587006f, 23.995314f, 57.91171f, 30.370375f, 54.431755f),
                    PathNode.CurveTo(36.745438f, 50.951797f, 44.509655f, 51.21939f, 50.63f, 55.13f),
                    PathNode.LineTo(138.81f, 111.29f),
                    PathNode.CurveTo(144.54341f, 114.90868f, 148.01453f, 121.22012f, 148.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.38f, 128.0f),
                    PathNode.LineTo(44.0f, 79.37f),
                    PathNode.LineTo(44.0f, 176.63f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _playPause!!
    }

private var _playPause: ImageVector? = null
