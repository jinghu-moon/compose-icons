package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Chat: ImageVector
    get() {
        if (_chat != null) return _chat!!
        _chat = phosphorDuotoneIcon(
            name = "Chat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 64.0f),
                    PathNode.LineTo(224.0f, 192.0f),
                    PathNode.CurveTo(224.0f, 196.41827f, 220.41827f, 200.0f, 216.0f, 200.0f),
                    PathNode.LineTo(80.0f, 200.0f),
                    PathNode.LineTo(45.15f, 230.11f),
                    PathNode.CurveTo(42.7711f, 232.11124f, 39.448254f, 232.55315f, 36.62899f, 231.24321f),
                    PathNode.CurveTo(33.809734f, 229.93327f, 32.004616f, 227.10872f, 32.0f, 224.0f),
                    PathNode.LineTo(32.0f, 64.0f),
                    PathNode.CurveTo(32.0f, 59.581722f, 35.581722f, 56.0f, 40.0f, 56.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.CurveTo(220.41827f, 56.0f, 224.0f, 59.581722f, 224.0f, 64.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 48.0f),
                    PathNode.LineTo(40.0f, 48.0f),
                    PathNode.CurveTo(31.163445f, 48.0f, 24.0f, 55.163445f, 24.0f, 64.0f),
                    PathNode.LineTo(24.0f, 224.0f),
                    PathNode.CurveTo(23.962313f, 230.23218f, 27.582624f, 235.90726f, 33.25f, 238.5f),
                    PathNode.CurveTo(35.364292f, 239.4845f, 37.66774f, 239.99637f, 40.0f, 240.0f),
                    PathNode.CurveTo(43.75604f, 239.99104f, 47.38747f, 238.65184f, 50.25f, 236.22f),
                    PathNode.LineTo(50.34f, 236.15f),
                    PathNode.LineTo(83.0f, 208.0f),
                    PathNode.LineTo(216.0f, 208.0f),
                    PathNode.CurveTo(224.83656f, 208.0f, 232.0f, 200.83656f, 232.0f, 192.0f),
                    PathNode.LineTo(232.0f, 64.0f),
                    PathNode.CurveTo(232.0f, 55.163445f, 224.83656f, 48.0f, 216.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 224.0f),
                    PathNode.LineTo(40.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 192.0f),
                    PathNode.LineTo(80.0f, 192.0f),
                    PathNode.CurveTo(78.079094f, 192.00102f, 76.22269f, 192.69319f, 74.77f, 193.95f),
                    PathNode.LineTo(40.0f, 224.0f),
                    PathNode.LineTo(40.0f, 64.0f),
                    PathNode.LineTo(216.0f, 64.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _chat!!
    }

private var _chat: ImageVector? = null
