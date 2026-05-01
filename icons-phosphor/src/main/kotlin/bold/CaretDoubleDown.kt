package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretDoubleDown: ImageVector
    get() {
        if (_caretDoubleDown != null) return _caretDoubleDown!!
        _caretDoubleDown = phosphorBoldIcon(
            name = "CaretDoubleDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.49f, 127.51f),
                    PathNode.CurveTo(218.74945f, 129.76163f, 220.01947f, 132.82018f, 220.01947f, 136.01f),
                    PathNode.CurveTo(220.01947f, 139.19981f, 218.74945f, 142.25838f, 216.49f, 144.51f),
                    PathNode.LineTo(136.49f, 224.51f),
                    PathNode.CurveTo(134.23837f, 226.76945f, 131.17982f, 228.03946f, 127.99f, 228.03946f),
                    PathNode.CurveTo(124.80018f, 228.03946f, 121.74162f, 226.76945f, 119.49f, 224.51f),
                    PathNode.LineTo(39.49f, 144.51f),
                    PathNode.CurveTo(34.79558f, 139.81558f, 34.79558f, 132.20442f, 39.49f, 127.51f),
                    PathNode.CurveTo(44.18442f, 122.81558f, 51.79558f, 122.81558f, 56.49f, 127.51f),
                    PathNode.LineTo(128.0f, 199.0f),
                    PathNode.LineTo(199.51f, 127.48f),
                    PathNode.CurveTo(201.7648f, 125.230644f, 204.82132f, 123.969925f, 208.00623f, 123.975555f),
                    PathNode.CurveTo(211.19113f, 123.98118f, 214.24316f, 125.25269f, 216.49f, 127.51f),
                    PathNode.Close,
                    PathNode.MoveTo(119.49f, 144.51f),
                    PathNode.CurveTo(121.74162f, 146.76945f, 124.80018f, 148.03946f, 127.99f, 148.03946f),
                    PathNode.CurveTo(131.17982f, 148.03946f, 134.23837f, 146.76945f, 136.49f, 144.51f),
                    PathNode.LineTo(216.49f, 64.51f),
                    PathNode.CurveTo(221.18442f, 59.81558f, 221.18442f, 52.20442f, 216.49f, 47.51f),
                    PathNode.CurveTo(211.79558f, 42.81558f, 204.18442f, 42.81558f, 199.49f, 47.51f),
                    PathNode.LineTo(128.0f, 119.0f),
                    PathNode.LineTo(56.49f, 47.51f),
                    PathNode.CurveTo(51.79558f, 42.81558f, 44.18442f, 42.81558f, 39.49f, 47.51f),
                    PathNode.CurveTo(34.79558f, 52.20442f, 34.79558f, 59.81558f, 39.49f, 64.51f),
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
        return _caretDoubleDown!!
    }

private var _caretDoubleDown: ImageVector? = null
