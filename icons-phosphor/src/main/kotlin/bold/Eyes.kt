package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Eyes: ImageVector
    get() {
        if (_eyes != null) return _eyes!!
        _eyes = phosphorBoldIcon(
            name = "Eyes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.48f, 60.0f),
                    PathNode.CurveTo(209.21f, 39.37f, 193.42f, 28.0f, 176.0f, 28.0f),
                    PathNode.CurveTo(158.58f, 28.0f, 142.79f, 39.37f, 131.52f, 60.0f),
                    PathNode.CurveTo(130.28f, 62.28f, 129.1f, 64.65f, 128.0f, 67.11f),
                    PathNode.CurveTo(126.9f, 64.65f, 125.72f, 62.28f, 124.48f, 60.0f),
                    PathNode.CurveTo(113.21f, 39.37f, 97.42f, 28.0f, 80.0f, 28.0f),
                    PathNode.CurveTo(62.58f, 28.0f, 46.79f, 39.37f, 35.52f, 60.0f),
                    PathNode.CurveTo(25.51f, 78.38f, 20.0f, 102.52f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 153.48f, 25.51f, 177.62f, 35.52f, 196.0f),
                    PathNode.CurveTo(46.79f, 216.62f, 62.58f, 228.0f, 80.0f, 228.0f),
                    PathNode.CurveTo(97.42f, 228.0f, 113.21f, 216.62f, 124.48f, 196.0f),
                    PathNode.CurveTo(125.72f, 193.72f, 126.9f, 191.35f, 128.0f, 188.89f),
                    PathNode.CurveTo(129.1f, 191.35f, 130.28f, 193.72f, 131.52f, 196.0f),
                    PathNode.CurveTo(142.79f, 216.65f, 158.58f, 228.0f, 176.0f, 228.0f),
                    PathNode.CurveTo(193.42f, 228.0f, 209.21f, 216.62f, 220.48f, 196.0f),
                    PathNode.CurveTo(230.48f, 177.65f, 236.0f, 153.51f, 236.0f, 128.0f),
                    PathNode.CurveTo(236.0f, 102.49f, 230.49f, 78.38f, 220.48f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 116.0f),
                    PathNode.CurveTo(158.62741f, 116.0f, 164.0f, 121.37258f, 164.0f, 128.0f),
                    PathNode.CurveTo(164.0f, 134.62741f, 158.62741f, 140.0f, 152.0f, 140.0f),
                    PathNode.CurveTo(145.37259f, 140.0f, 140.0f, 134.62741f, 140.0f, 128.0f),
                    PathNode.CurveTo(140.0f, 121.37258f, 145.37259f, 116.0f, 152.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 116.0f),
                    PathNode.CurveTo(62.62742f, 116.0f, 68.0f, 121.37258f, 68.0f, 128.0f),
                    PathNode.CurveTo(68.0f, 134.62741f, 62.62742f, 140.0f, 56.0f, 140.0f),
                    PathNode.CurveTo(49.37258f, 140.0f, 44.0f, 134.62741f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 121.37258f, 49.37258f, 116.0f, 56.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 204.0f),
                    PathNode.CurveTo(67.92f, 204.0f, 54.87f, 188.28f, 48.3f, 163.16f),
                    PathNode.CurveTo(50.82841f, 163.71962f, 53.4104f, 164.00128f, 56.0f, 164.0f),
                    PathNode.CurveTo(75.88225f, 164.0f, 92.0f, 147.88223f, 92.0f, 128.0f),
                    PathNode.CurveTo(92.0f, 108.11775f, 75.88225f, 92.0f, 56.0f, 92.0f),
                    PathNode.CurveTo(53.4104f, 91.99872f, 50.82841f, 92.28038f, 48.3f, 92.84f),
                    PathNode.CurveTo(54.87f, 67.72f, 67.92f, 52.0f, 80.0f, 52.0f),
                    PathNode.CurveTo(97.0f, 52.0f, 116.0f, 83.21f, 116.0f, 128.0f),
                    PathNode.CurveTo(116.0f, 172.79f, 97.0f, 204.0f, 80.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 204.0f),
                    PathNode.CurveTo(163.92f, 204.0f, 150.87f, 188.28f, 144.3f, 163.16f),
                    PathNode.CurveTo(146.82841f, 163.71962f, 149.4104f, 164.00128f, 152.0f, 164.0f),
                    PathNode.CurveTo(171.88223f, 164.0f, 188.0f, 147.88223f, 188.0f, 128.0f),
                    PathNode.CurveTo(188.0f, 108.11775f, 171.88223f, 92.0f, 152.0f, 92.0f),
                    PathNode.CurveTo(149.4104f, 91.99872f, 146.82841f, 92.28038f, 144.3f, 92.84f),
                    PathNode.CurveTo(150.87f, 67.72f, 163.92f, 52.0f, 176.0f, 52.0f),
                    PathNode.CurveTo(193.0f, 52.0f, 212.0f, 83.21f, 212.0f, 128.0f),
                    PathNode.CurveTo(212.0f, 172.79f, 193.0f, 204.0f, 176.0f, 204.0f),
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
        return _eyes!!
    }

private var _eyes: ImageVector? = null
