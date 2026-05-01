package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Play: ImageVector
    get() {
        if (_play != null) return _play!!
        _play = phosphorBoldIcon(
            name = "Play",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(234.49f, 111.07f),
                    PathNode.LineTo(90.41f, 22.94f),
                    PathNode.CurveTo(84.258575f, 19.189926f, 76.565636f, 19.038061f, 70.271f, 22.54244f),
                    PathNode.CurveTo(63.97636f, 26.046818f, 60.052917f, 32.665817f, 60.0f, 39.87f),
                    PathNode.LineTo(60.0f, 216.13f),
                    PathNode.CurveTo(60.052917f, 223.33418f, 63.97636f, 229.95319f, 70.271f, 233.45757f),
                    PathNode.CurveTo(76.565636f, 236.96194f, 84.258575f, 236.81007f, 90.41f, 233.06f),
                    PathNode.LineTo(234.49f, 144.93f),
                    PathNode.CurveTo(240.39833f, 141.33345f, 244.0043f, 134.9169f, 244.0043f, 128.0f),
                    PathNode.CurveTo(244.0043f, 121.0831f, 240.39833f, 114.66654f, 234.49f, 111.07f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 208.85f),
                    PathNode.LineTo(84.0f, 47.15f),
                    PathNode.LineTo(216.16f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _play!!
    }

private var _play: ImageVector? = null
