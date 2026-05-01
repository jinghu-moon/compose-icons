package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextIndent: ImageVector
    get() {
        if (_textIndent != null) return _textIndent!!
        _textIndent = phosphorBoldIcon(
            name = "TextIndent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 128.0f),
                    PathNode.CurveTo(228.0f, 134.62741f, 222.62741f, 140.0f, 216.0f, 140.0f),
                    PathNode.LineTo(120.0f, 140.0f),
                    PathNode.CurveTo(113.37258f, 140.0f, 108.0f, 134.62741f, 108.0f, 128.0f),
                    PathNode.CurveTo(108.0f, 121.37258f, 113.37258f, 116.0f, 120.0f, 116.0f),
                    PathNode.LineTo(216.0f, 116.0f),
                    PathNode.CurveTo(222.62741f, 116.0f, 228.0f, 121.37258f, 228.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 76.0f),
                    PathNode.LineTo(216.0f, 76.0f),
                    PathNode.CurveTo(222.62741f, 76.0f, 228.0f, 70.62742f, 228.0f, 64.0f),
                    PathNode.CurveTo(228.0f, 57.37258f, 222.62741f, 52.0f, 216.0f, 52.0f),
                    PathNode.LineTo(120.0f, 52.0f),
                    PathNode.CurveTo(113.37258f, 52.0f, 108.0f, 57.37258f, 108.0f, 64.0f),
                    PathNode.CurveTo(108.0f, 70.62742f, 113.37258f, 76.0f, 120.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 180.0f),
                    PathNode.LineTo(40.0f, 180.0f),
                    PathNode.CurveTo(33.37258f, 180.0f, 28.0f, 185.37259f, 28.0f, 192.0f),
                    PathNode.CurveTo(28.0f, 198.62741f, 33.37258f, 204.0f, 40.0f, 204.0f),
                    PathNode.LineTo(216.0f, 204.0f),
                    PathNode.CurveTo(222.62741f, 204.0f, 228.0f, 198.62741f, 228.0f, 192.0f),
                    PathNode.CurveTo(228.0f, 185.37259f, 222.62741f, 180.0f, 216.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(31.51f, 144.49f),
                    PathNode.CurveTo(33.761623f, 146.74945f, 36.820183f, 148.01947f, 40.01f, 148.01947f),
                    PathNode.CurveTo(43.199818f, 148.01947f, 46.258377f, 146.74945f, 48.51f, 144.49f),
                    PathNode.LineTo(88.51f, 104.49f),
                    PathNode.CurveTo(90.769455f, 102.23838f, 92.03946f, 99.17982f, 92.03946f, 95.99f),
                    PathNode.CurveTo(92.03946f, 92.80018f, 90.769455f, 89.74162f, 88.51f, 87.49f),
                    PathNode.LineTo(48.51f, 47.49f),
                    PathNode.CurveTo(43.81558f, 42.79558f, 36.20442f, 42.79558f, 31.51f, 47.49f),
                    PathNode.CurveTo(26.81558f, 52.18442f, 26.81558f, 59.79558f, 31.51f, 64.49f),
                    PathNode.LineTo(63.0f, 96.0f),
                    PathNode.LineTo(31.51f, 127.51f),
                    PathNode.CurveTo(29.256676f, 129.76082f, 27.99056f, 132.8151f, 27.99056f, 136.0f),
                    PathNode.CurveTo(27.99056f, 139.1849f, 29.256676f, 142.23918f, 31.51f, 144.49f),
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
        return _textIndent!!
    }

private var _textIndent: ImageVector? = null
