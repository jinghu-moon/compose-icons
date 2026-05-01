package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BoxingGlove: ImageVector
    get() {
        if (_boxingGlove != null) return _boxingGlove!!
        _boxingGlove = phosphorBoldIcon(
            name = "BoxingGlove",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 12.0f),
                    PathNode.LineTo(120.0f, 12.0f),
                    PathNode.CurveTo(88.42978f, 12.03747f, 62.273895f, 36.502632f, 60.13f, 68.0f),
                    PathNode.LineTo(56.0f, 68.0f),
                    PathNode.CurveTo(36.11775f, 68.0f, 20.0f, 84.11775f, 20.0f, 104.0f),
                    PathNode.LineTo(20.0f, 133.19f),
                    PathNode.CurveTo(20.00816f, 137.73145f, 21.55176f, 142.1367f, 24.38f, 145.69f),
                    PathNode.CurveTo(24.673075f, 146.04181f, 24.98697f, 146.37575f, 25.32f, 146.69f),
                    PathNode.LineTo(60.0f, 181.0f),
                    PathNode.LineTo(60.0f, 216.0f),
                    PathNode.CurveTo(60.0f, 227.0457f, 68.95431f, 236.0f, 80.0f, 236.0f),
                    PathNode.LineTo(192.0f, 236.0f),
                    PathNode.CurveTo(203.0457f, 236.0f, 212.0f, 227.0457f, 212.0f, 216.0f),
                    PathNode.LineTo(212.0f, 177.68f),
                    PathNode.LineTo(227.23f, 124.38f),
                    PathNode.CurveTo(227.74031f, 122.59121f, 227.99945f, 120.74016f, 228.0f, 118.88f),
                    PathNode.LineTo(228.0f, 72.0f),
                    PathNode.CurveTo(227.96143f, 38.878906f, 201.1211f, 12.038574f, 168.0f, 12.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 118.32f),
                    PathNode.LineTo(188.46f, 172.7f),
                    PathNode.CurveTo(188.15746f, 173.77399f, 188.0027f, 174.88423f, 188.0f, 176.0f),
                    PathNode.LineTo(188.0f, 212.0f),
                    PathNode.LineTo(84.0f, 212.0f),
                    PathNode.LineTo(84.0f, 176.0f),
                    PathNode.CurveTo(83.99992f, 172.79538f, 82.71804f, 169.72392f, 80.44f, 167.47f),
                    PathNode.LineTo(44.0f, 131.45f),
                    PathNode.LineTo(44.0f, 104.0f),
                    PathNode.CurveTo(44.0f, 97.37258f, 49.37258f, 92.0f, 56.0f, 92.0f),
                    PathNode.LineTo(60.0f, 92.0f),
                    PathNode.LineTo(60.0f, 104.0f),
                    PathNode.CurveTo(60.0f, 110.62742f, 65.37258f, 116.0f, 72.0f, 116.0f),
                    PathNode.CurveTo(78.62742f, 116.0f, 84.0f, 110.62742f, 84.0f, 104.0f),
                    PathNode.LineTo(84.0f, 72.0f),
                    PathNode.CurveTo(84.0f, 52.11775f, 100.11775f, 36.0f, 120.0f, 36.0f),
                    PathNode.LineTo(168.0f, 36.0f),
                    PathNode.CurveTo(187.88223f, 36.0f, 204.0f, 52.11775f, 204.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(166.66f, 162.0f),
                    PathNode.LineTo(157.66f, 168.0f),
                    PathNode.LineTo(166.66f, 174.0f),
                    PathNode.CurveTo(172.18285f, 177.67822f, 173.67822f, 185.13715f, 170.0f, 190.66f),
                    PathNode.CurveTo(166.32178f, 196.18285f, 158.86285f, 197.67822f, 153.34f, 194.0f),
                    PathNode.LineTo(136.0f, 182.42f),
                    PathNode.LineTo(118.66f, 194.0f),
                    PathNode.CurveTo(113.13715f, 197.67822f, 105.678215f, 196.18285f, 102.0f, 190.66f),
                    PathNode.CurveTo(98.321785f, 185.13715f, 99.817154f, 177.67822f, 105.34f, 174.0f),
                    PathNode.LineTo(114.34f, 168.0f),
                    PathNode.LineTo(105.34f, 162.0f),
                    PathNode.CurveTo(99.817154f, 158.32178f, 98.321785f, 150.86285f, 102.0f, 145.34f),
                    PathNode.CurveTo(105.678215f, 139.81715f, 113.13715f, 138.32178f, 118.66f, 142.0f),
                    PathNode.LineTo(136.0f, 153.58f),
                    PathNode.LineTo(153.34f, 142.0f),
                    PathNode.CurveTo(158.86285f, 138.32178f, 166.32178f, 139.81715f, 170.0f, 145.34f),
                    PathNode.CurveTo(173.67822f, 150.86285f, 172.18285f, 158.32178f, 166.66f, 162.0f),
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
        return _boxingGlove!!
    }

private var _boxingGlove: ImageVector? = null
