package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NotePencil: ImageVector
    get() {
        if (_notePencil != null) return _notePencil!!
        _notePencil = phosphorBoldIcon(
            name = "NotePencil",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.49f, 55.51f),
                    PathNode.LineTo(200.49f, 23.51f),
                    PathNode.CurveTo(198.23837f, 21.250546f, 195.17982f, 19.980537f, 191.99f, 19.980537f),
                    PathNode.CurveTo(188.80019f, 19.980537f, 185.74162f, 21.250546f, 183.49f, 23.51f),
                    PathNode.LineTo(87.49f, 119.51f),
                    PathNode.CurveTo(85.24747f, 121.76563f, 83.99219f, 124.81931f, 84.0f, 128.0f),
                    PathNode.LineTo(84.0f, 160.0f),
                    PathNode.CurveTo(84.0f, 166.62741f, 89.37258f, 172.0f, 96.0f, 172.0f),
                    PathNode.LineTo(128.0f, 172.0f),
                    PathNode.CurveTo(131.18355f, 172.0025f, 134.23764f, 170.73987f, 136.49f, 168.49f),
                    PathNode.LineTo(232.49f, 72.49f),
                    PathNode.CurveTo(234.74333f, 70.23918f, 236.00945f, 67.18491f, 236.00945f, 64.0f),
                    PathNode.CurveTo(236.00945f, 60.81509f, 234.74333f, 57.76082f, 232.49f, 55.51f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 49.0f),
                    PathNode.LineTo(207.0f, 64.0f),
                    PathNode.LineTo(196.0f, 75.0f),
                    PathNode.LineTo(181.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(123.0f, 148.0f),
                    PathNode.LineTo(108.0f, 148.0f),
                    PathNode.LineTo(108.0f, 133.0f),
                    PathNode.LineTo(164.0f, 77.0f),
                    PathNode.LineTo(179.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 140.57f),
                    PathNode.LineTo(228.0f, 208.0f),
                    PathNode.CurveTo(228.0f, 219.0457f, 219.0457f, 228.0f, 208.0f, 228.0f),
                    PathNode.LineTo(48.0f, 228.0f),
                    PathNode.CurveTo(36.954304f, 228.0f, 28.0f, 219.0457f, 28.0f, 208.0f),
                    PathNode.LineTo(28.0f, 48.0f),
                    PathNode.CurveTo(28.0f, 36.954304f, 36.954304f, 28.0f, 48.0f, 28.0f),
                    PathNode.LineTo(115.43f, 28.0f),
                    PathNode.CurveTo(122.05742f, 28.0f, 127.43f, 33.37258f, 127.43f, 40.0f),
                    PathNode.CurveTo(127.43f, 46.62742f, 122.05742f, 52.0f, 115.43f, 52.0f),
                    PathNode.LineTo(52.0f, 52.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(204.0f, 204.0f),
                    PathNode.LineTo(204.0f, 140.57f),
                    PathNode.CurveTo(204.0f, 133.94258f, 209.37259f, 128.57f, 216.0f, 128.57f),
                    PathNode.CurveTo(222.62741f, 128.57f, 228.0f, 133.94258f, 228.0f, 140.57f),
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
        return _notePencil!!
    }

private var _notePencil: ImageVector? = null
