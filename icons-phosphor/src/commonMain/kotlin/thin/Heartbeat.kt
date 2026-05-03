package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Heartbeat: ImageVector
    get() {
        if (_heartbeat != null) return _heartbeat!!
        _heartbeat = phosphorThinIcon(
            name = "Heartbeat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(72.0f, 140.0f),
                    PathNode.LineTo(32.0f, 140.0f),
                    PathNode.CurveTo(29.790861f, 140.0f, 28.0f, 138.20914f, 28.0f, 136.0f),
                    PathNode.CurveTo(28.0f, 133.79086f, 29.790861f, 132.0f, 32.0f, 132.0f),
                    PathNode.LineTo(69.86f, 132.0f),
                    PathNode.LineTo(84.67f, 109.78f),
                    PathNode.CurveTo(85.4116f, 108.66565f, 86.66144f, 107.9961f, 88.0f, 107.9961f),
                    PathNode.CurveTo(89.33856f, 107.9961f, 90.5884f, 108.66565f, 91.33f, 109.78f),
                    PathNode.LineTo(120.0f, 152.78f),
                    PathNode.LineTo(132.67f, 133.78f),
                    PathNode.CurveTo(133.41249f, 132.66713f, 134.66217f, 131.99913f, 136.0f, 132.0f),
                    PathNode.LineTo(160.0f, 132.0f),
                    PathNode.CurveTo(162.20914f, 132.0f, 164.0f, 133.79086f, 164.0f, 136.0f),
                    PathNode.CurveTo(164.0f, 138.20914f, 162.20914f, 140.0f, 160.0f, 140.0f),
                    PathNode.LineTo(138.14f, 140.0f),
                    PathNode.LineTo(123.33f, 162.22f),
                    PathNode.CurveTo(122.5884f, 163.33435f, 121.33856f, 164.0039f, 120.0f, 164.0039f),
                    PathNode.CurveTo(118.66144f, 164.0039f, 117.4116f, 163.33435f, 116.67f, 162.22f),
                    PathNode.LineTo(88.0f, 119.21f),
                    PathNode.LineTo(75.33f, 138.21f),
                    PathNode.CurveTo(74.589806f, 139.32668f, 73.33972f, 139.99864f, 72.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(178.0f, 44.0f),
                    PathNode.CurveTo(156.56f, 44.0f, 138.08f, 54.19f, 128.0f, 71.07f),
                    PathNode.CurveTo(117.92f, 54.19f, 99.44f, 44.0f, 78.0f, 44.0f),
                    PathNode.CurveTo(45.983475f, 44.03857f, 20.03857f, 69.983475f, 20.0f, 102.0f),
                    PathNode.QuadTo(20.0f, 103.06f, 20.0f, 104.13f),
                    PathNode.CurveTo(20.071796f, 106.33914f, 21.92086f, 108.0718f, 24.13f, 108.0f),
                    PathNode.CurveTo(26.33914f, 107.9282f, 28.071796f, 106.07914f, 28.0f, 103.87f),
                    PathNode.CurveTo(28.0f, 103.25f, 28.0f, 102.63f, 28.0f, 102.0f),
                    PathNode.CurveTo(28.033062f, 74.39947f, 50.399467f, 52.03306f, 78.0f, 52.0f),
                    PathNode.CurveTo(99.11f, 52.0f, 116.85f, 63.31f, 124.3f, 81.51f),
                    PathNode.CurveTo(124.91636f, 83.01047f, 126.37787f, 83.990135f, 128.0f, 83.990135f),
                    PathNode.CurveTo(129.62213f, 83.990135f, 131.08365f, 83.01047f, 131.7f, 81.51f),
                    PathNode.CurveTo(139.15f, 63.31f, 156.89f, 52.0f, 178.0f, 52.0f),
                    PathNode.CurveTo(205.60052f, 52.03306f, 227.96693f, 74.39947f, 228.0f, 102.0f),
                    PathNode.CurveTo(228.0f, 160.0f, 142.0f, 211.46f, 128.0f, 219.42f),
                    PathNode.CurveTo(119.53f, 214.6f, 84.5f, 193.81f, 58.37f, 165.3f),
                    PathNode.CurveTo(56.866867f, 163.72745f, 54.382565f, 163.64445f, 52.777836f, 165.11319f),
                    PathNode.CurveTo(51.17311f, 166.58192f, 51.036358f, 169.06384f, 52.47f, 170.7f),
                    PathNode.CurveTo(83.19f, 204.22f, 124.37f, 226.59f, 126.1f, 227.52f),
                    PathNode.CurveTo(127.285805f, 228.16008f, 128.71419f, 228.16008f, 129.9f, 227.52f),
                    PathNode.CurveTo(148.60658f, 216.9993f, 166.25494f, 204.69902f, 182.6f, 190.79f),
                    PathNode.CurveTo(218.0f, 160.47f, 236.0f, 130.59f, 236.0f, 102.0f),
                    PathNode.CurveTo(235.96143f, 69.983475f, 210.01653f, 44.03857f, 178.0f, 44.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _heartbeat!!
    }

private var _heartbeat: ImageVector? = null
