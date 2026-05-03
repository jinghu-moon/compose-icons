package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CheckSquareOffset: ImageVector
    get() {
        if (_checkSquareOffset != null) return _checkSquareOffset!!
        _checkSquareOffset = phosphorBoldIcon(
            name = "CheckSquareOffset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 48.0f),
                    PathNode.LineTo(228.0f, 208.0f),
                    PathNode.CurveTo(228.0f, 219.0457f, 219.0457f, 228.0f, 208.0f, 228.0f),
                    PathNode.LineTo(140.0f, 228.0f),
                    PathNode.CurveTo(133.37259f, 228.0f, 128.0f, 222.62741f, 128.0f, 216.0f),
                    PathNode.CurveTo(128.0f, 209.37259f, 133.37259f, 204.0f, 140.0f, 204.0f),
                    PathNode.LineTo(204.0f, 204.0f),
                    PathNode.LineTo(204.0f, 52.0f),
                    PathNode.LineTo(52.0f, 52.0f),
                    PathNode.LineTo(52.0f, 140.0f),
                    PathNode.CurveTo(52.0f, 146.62741f, 46.62742f, 152.0f, 40.0f, 152.0f),
                    PathNode.CurveTo(33.37258f, 152.0f, 28.0f, 146.62741f, 28.0f, 140.0f),
                    PathNode.LineTo(28.0f, 48.0f),
                    PathNode.CurveTo(28.0f, 36.954304f, 36.954304f, 28.0f, 48.0f, 28.0f),
                    PathNode.LineTo(208.0f, 28.0f),
                    PathNode.CurveTo(219.0457f, 28.0f, 228.0f, 36.954304f, 228.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.49f, 151.51f),
                    PathNode.CurveTo(126.23838f, 149.25055f, 123.17982f, 147.98053f, 119.99f, 147.98053f),
                    PathNode.CurveTo(116.80018f, 147.98053f, 113.74162f, 149.25055f, 111.49f, 151.51f),
                    PathNode.LineTo(64.0f, 199.0f),
                    PathNode.LineTo(48.49f, 183.51f),
                    PathNode.CurveTo(43.79558f, 178.81558f, 36.18442f, 178.81558f, 31.49f, 183.51f),
                    PathNode.CurveTo(26.79558f, 188.20442f, 26.79558f, 195.81558f, 31.49f, 200.51f),
                    PathNode.LineTo(55.49f, 224.51f),
                    PathNode.CurveTo(57.741623f, 226.76945f, 60.800182f, 228.03946f, 63.99f, 228.03946f),
                    PathNode.CurveTo(67.17982f, 228.03946f, 70.23838f, 226.76945f, 72.49f, 224.51f),
                    PathNode.LineTo(128.49f, 168.51f),
                    PathNode.CurveTo(130.74945f, 166.25838f, 132.01947f, 163.19981f, 132.01947f, 160.01f),
                    PathNode.CurveTo(132.01947f, 156.82018f, 130.74945f, 153.76163f, 128.49f, 151.51f),
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
        return _checkSquareOffset!!
    }

private var _checkSquareOffset: ImageVector? = null
