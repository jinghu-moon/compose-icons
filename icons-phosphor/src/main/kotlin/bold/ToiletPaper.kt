package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ToiletPaper: ImageVector
    get() {
        if (_toiletPaper != null) return _toiletPaper!!
        _toiletPaper = phosphorBoldIcon(
            name = "ToiletPaper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(80.0f, 120.0f),
                    PathNode.CurveTo(80.0f, 128.83656f, 72.836555f, 136.0f, 64.0f, 136.0f),
                    PathNode.CurveTo(55.163445f, 136.0f, 48.0f, 128.83656f, 48.0f, 120.0f),
                    PathNode.CurveTo(48.0f, 111.163445f, 55.163445f, 104.0f, 64.0f, 104.0f),
                    PathNode.CurveTo(72.836555f, 104.0f, 80.0f, 111.163445f, 80.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(244.0f, 120.0f),
                    PathNode.LineTo(244.0f, 208.0f),
                    PathNode.CurveTo(244.0f, 219.0457f, 235.0457f, 228.0f, 224.0f, 228.0f),
                    PathNode.LineTo(112.0f, 228.0f),
                    PathNode.CurveTo(100.95431f, 228.0f, 92.0f, 219.0457f, 92.0f, 208.0f),
                    PathNode.LineTo(92.0f, 198.39f),
                    PathNode.CurveTo(84.0f, 207.07f, 74.46f, 212.0f, 64.0f, 212.0f),
                    PathNode.CurveTo(34.35f, 212.0f, 12.0f, 172.45f, 12.0f, 120.0f),
                    PathNode.CurveTo(12.0f, 67.55f, 34.35f, 28.0f, 64.0f, 28.0f),
                    PathNode.LineTo(192.0f, 28.0f),
                    PathNode.CurveTo(221.65f, 28.0f, 244.0f, 67.55f, 244.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 120.0f),
                    PathNode.CurveTo(92.0f, 100.74f, 88.19f, 82.08f, 81.55f, 68.8f),
                    PathNode.CurveTo(76.29f, 58.28f, 69.73f, 52.0f, 64.0f, 52.0f),
                    PathNode.CurveTo(58.27f, 52.0f, 51.71f, 58.28f, 46.45f, 68.8f),
                    PathNode.CurveTo(39.81f, 82.08f, 36.0f, 100.74f, 36.0f, 120.0f),
                    PathNode.CurveTo(36.0f, 139.26f, 39.81f, 157.92f, 46.45f, 171.2f),
                    PathNode.CurveTo(51.71f, 181.72f, 58.27f, 188.0f, 64.0f, 188.0f),
                    PathNode.CurveTo(69.73f, 188.0f, 76.29f, 181.72f, 81.55f, 171.2f),
                    PathNode.CurveTo(88.19f, 157.92f, 92.0f, 139.26f, 92.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 204.0f),
                    PathNode.LineTo(220.0f, 132.0f),
                    PathNode.LineTo(212.0f, 132.0f),
                    PathNode.CurveTo(205.37259f, 132.0f, 200.0f, 126.62742f, 200.0f, 120.0f),
                    PathNode.CurveTo(200.0f, 113.37258f, 205.37259f, 108.0f, 212.0f, 108.0f),
                    PathNode.LineTo(219.5f, 108.0f),
                    PathNode.CurveTo(218.27f, 93.15f, 214.8f, 79.29f, 209.55f, 68.8f),
                    PathNode.CurveTo(204.3f, 58.31f, 197.73f, 52.0f, 192.0f, 52.0f),
                    PathNode.LineTo(99.74f, 52.0f),
                    PathNode.CurveTo(108.35f, 66.11f, 114.09f, 85.56f, 115.6f, 108.0f),
                    PathNode.LineTo(124.0f, 108.0f),
                    PathNode.CurveTo(130.62741f, 108.0f, 136.0f, 113.37258f, 136.0f, 120.0f),
                    PathNode.CurveTo(136.0f, 126.62742f, 130.62741f, 132.0f, 124.0f, 132.0f),
                    PathNode.LineTo(116.0f, 132.0f),
                    PathNode.LineTo(116.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 108.0f),
                    PathNode.LineTo(164.0f, 108.0f),
                    PathNode.CurveTo(157.37259f, 108.0f, 152.0f, 113.37258f, 152.0f, 120.0f),
                    PathNode.CurveTo(152.0f, 126.62742f, 157.37259f, 132.0f, 164.0f, 132.0f),
                    PathNode.LineTo(172.0f, 132.0f),
                    PathNode.CurveTo(178.62741f, 132.0f, 184.0f, 126.62742f, 184.0f, 120.0f),
                    PathNode.CurveTo(184.0f, 113.37258f, 178.62741f, 108.0f, 172.0f, 108.0f),
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
        return _toiletPaper!!
    }

private var _toiletPaper: ImageVector? = null
