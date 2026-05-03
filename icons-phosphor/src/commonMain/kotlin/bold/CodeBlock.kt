package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CodeBlock: ImageVector
    get() {
        if (_codeBlock != null) return _codeBlock!!
        _codeBlock = phosphorBoldIcon(
            name = "CodeBlock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(51.51f, 104.49f),
                    PathNode.LineTo(19.51f, 72.49f),
                    PathNode.CurveTo(17.250546f, 70.23838f, 15.980537f, 67.17982f, 15.980537f, 63.99f),
                    PathNode.CurveTo(15.980537f, 60.800182f, 17.250546f, 57.741623f, 19.51f, 55.49f),
                    PathNode.LineTo(51.51f, 23.49f),
                    PathNode.CurveTo(56.20442f, 18.79558f, 63.81558f, 18.79558f, 68.51f, 23.49f),
                    PathNode.CurveTo(73.20442f, 28.18442f, 73.20442f, 35.79558f, 68.51f, 40.49f),
                    PathNode.LineTo(45.0f, 64.0f),
                    PathNode.LineTo(68.49f, 87.51f),
                    PathNode.CurveTo(73.18442f, 92.20442f, 73.18442f, 99.81558f, 68.49f, 104.51f),
                    PathNode.CurveTo(63.79558f, 109.20442f, 56.18442f, 109.20442f, 51.49f, 104.51f),
                    PathNode.Close,
                    PathNode.MoveTo(99.51f, 104.49f),
                    PathNode.CurveTo(101.76162f, 106.74945f, 104.82018f, 108.01946f, 108.01f, 108.01946f),
                    PathNode.CurveTo(111.19982f, 108.01946f, 114.25838f, 106.74945f, 116.51f, 104.49f),
                    PathNode.LineTo(148.51f, 72.49f),
                    PathNode.CurveTo(150.76945f, 70.23838f, 152.03946f, 67.17982f, 152.03946f, 63.99f),
                    PathNode.CurveTo(152.03946f, 60.800182f, 150.76945f, 57.741623f, 148.51f, 55.49f),
                    PathNode.LineTo(116.51f, 23.49f),
                    PathNode.CurveTo(111.81558f, 18.79558f, 104.20442f, 18.79558f, 99.51f, 23.49f),
                    PathNode.CurveTo(94.81558f, 28.18442f, 94.81558f, 35.79558f, 99.51f, 40.49f),
                    PathNode.LineTo(123.0f, 64.0f),
                    PathNode.LineTo(99.51f, 87.51f),
                    PathNode.CurveTo(97.256676f, 89.76082f, 95.99056f, 92.81509f, 95.99056f, 96.0f),
                    PathNode.CurveTo(95.99056f, 99.18491f, 97.256676f, 102.23918f, 99.51f, 104.49f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 36.0f),
                    PathNode.LineTo(180.0f, 36.0f),
                    PathNode.CurveTo(173.37259f, 36.0f, 168.0f, 41.37258f, 168.0f, 48.0f),
                    PathNode.CurveTo(168.0f, 54.62742f, 173.37259f, 60.0f, 180.0f, 60.0f),
                    PathNode.LineTo(196.0f, 60.0f),
                    PathNode.LineTo(196.0f, 196.0f),
                    PathNode.LineTo(60.0f, 196.0f),
                    PathNode.LineTo(60.0f, 140.0f),
                    PathNode.CurveTo(60.0f, 133.37259f, 54.62742f, 128.0f, 48.0f, 128.0f),
                    PathNode.CurveTo(41.37258f, 128.0f, 36.0f, 133.37259f, 36.0f, 140.0f),
                    PathNode.LineTo(36.0f, 200.0f),
                    PathNode.CurveTo(36.0f, 211.0457f, 44.954304f, 220.0f, 56.0f, 220.0f),
                    PathNode.LineTo(200.0f, 220.0f),
                    PathNode.CurveTo(211.0457f, 220.0f, 220.0f, 211.0457f, 220.0f, 200.0f),
                    PathNode.LineTo(220.0f, 56.0f),
                    PathNode.CurveTo(220.0f, 44.954304f, 211.0457f, 36.0f, 200.0f, 36.0f),
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
        return _codeBlock!!
    }

private var _codeBlock: ImageVector? = null
