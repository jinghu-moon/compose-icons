package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Swap: ImageVector
    get() {
        if (_swap != null) return _swap!!
        _swap = phosphorBoldIcon(
            name = "Swap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 48.0f),
                    PathNode.LineTo(228.0f, 152.0f),
                    PathNode.CurveTo(228.0f, 163.0457f, 219.0457f, 172.0f, 208.0f, 172.0f),
                    PathNode.LineTo(112.92f, 172.0f),
                    PathNode.CurveTo(117.149925f, 176.85033f, 116.80051f, 184.1739f, 112.12801f, 188.59949f),
                    PathNode.CurveTo(107.45552f, 193.02509f, 100.12377f, 192.97679f, 95.51f, 188.49f),
                    PathNode.LineTo(75.51f, 168.49f),
                    PathNode.CurveTo(73.25055f, 166.23837f, 71.98054f, 163.17982f, 71.98054f, 159.99f),
                    PathNode.CurveTo(71.98054f, 156.80019f, 73.25055f, 153.74162f, 75.51f, 151.49f),
                    PathNode.LineTo(95.51f, 131.49f),
                    PathNode.CurveTo(100.104324f, 126.86563f, 107.55011f, 126.75474f, 112.28012f, 131.24023f),
                    PathNode.CurveTo(117.010124f, 135.72572f, 117.29423f, 143.16692f, 112.92f, 148.0f),
                    PathNode.LineTo(204.0f, 148.0f),
                    PathNode.LineTo(204.0f, 52.0f),
                    PathNode.LineTo(100.0f, 52.0f),
                    PathNode.CurveTo(100.0f, 58.62742f, 94.62742f, 64.0f, 88.0f, 64.0f),
                    PathNode.CurveTo(81.37258f, 64.0f, 76.0f, 58.62742f, 76.0f, 52.0f),
                    PathNode.LineTo(76.0f, 48.0f),
                    PathNode.CurveTo(76.0f, 36.954304f, 84.95431f, 28.0f, 96.0f, 28.0f),
                    PathNode.LineTo(208.0f, 28.0f),
                    PathNode.CurveTo(219.0457f, 28.0f, 228.0f, 36.954304f, 228.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 192.0f),
                    PathNode.CurveTo(161.37259f, 192.0f, 156.0f, 197.37259f, 156.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 108.0f),
                    PathNode.LineTo(143.08f, 108.0f),
                    PathNode.CurveTo(138.85007f, 112.850334f, 139.1995f, 120.173904f, 143.87198f, 124.599495f),
                    PathNode.CurveTo(148.54448f, 129.02509f, 155.87622f, 128.97678f, 160.49f, 124.49f),
                    PathNode.LineTo(180.49f, 104.49f),
                    PathNode.CurveTo(182.74945f, 102.23838f, 184.01947f, 99.17982f, 184.01947f, 95.99f),
                    PathNode.CurveTo(184.01947f, 92.80018f, 182.74945f, 89.74162f, 180.49f, 87.49f),
                    PathNode.LineTo(160.49f, 67.49f),
                    PathNode.CurveTo(155.89568f, 62.865635f, 148.44989f, 62.754738f, 143.71988f, 67.240234f),
                    PathNode.CurveTo(138.98987f, 71.72572f, 138.70576f, 79.16691f, 143.08f, 84.0f),
                    PathNode.LineTo(48.0f, 84.0f),
                    PathNode.CurveTo(36.954304f, 84.0f, 28.0f, 92.95431f, 28.0f, 104.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(160.0f, 228.0f),
                    PathNode.CurveTo(171.0457f, 228.0f, 180.0f, 219.0457f, 180.0f, 208.0f),
                    PathNode.LineTo(180.0f, 204.0f),
                    PathNode.CurveTo(180.0f, 197.37259f, 174.62741f, 192.0f, 168.0f, 192.0f),
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
        return _swap!!
    }

private var _swap: ImageVector? = null
