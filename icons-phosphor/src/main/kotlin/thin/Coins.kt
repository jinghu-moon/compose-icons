package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Coins: ImageVector
    get() {
        if (_coins != null) return _coins!!
        _coins = phosphorThinIcon(
            name = "Coins",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.0f, 93.11f),
                    PathNode.LineTo(180.0f, 84.0f),
                    PathNode.CurveTo(180.0f, 61.57f, 143.1f, 44.0f, 96.0f, 44.0f),
                    PathNode.CurveTo(48.9f, 44.0f, 12.0f, 61.57f, 12.0f, 84.0f),
                    PathNode.LineTo(12.0f, 124.0f),
                    PathNode.CurveTo(12.0f, 143.14f, 38.86f, 158.72f, 76.0f, 162.89f),
                    PathNode.LineTo(76.0f, 172.0f),
                    PathNode.CurveTo(76.0f, 194.43f, 112.9f, 212.0f, 160.0f, 212.0f),
                    PathNode.CurveTo(207.1f, 212.0f, 244.0f, 194.43f, 244.0f, 172.0f),
                    PathNode.LineTo(244.0f, 132.0f),
                    PathNode.CurveTo(244.0f, 113.12f, 217.87f, 97.37f, 180.0f, 93.11f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 132.0f),
                    PathNode.CurveTo(236.0f, 147.45f, 205.46f, 164.0f, 160.0f, 164.0f),
                    PathNode.CurveTo(150.61725f, 164.01411f, 141.25026f, 163.2313f, 132.0f, 161.66f),
                    PathNode.LineTo(132.0f, 160.27f),
                    PathNode.CurveTo(160.61f, 153.96f, 180.0f, 140.27f, 180.0f, 124.0f),
                    PathNode.LineTo(180.0f, 101.17f),
                    PathNode.CurveTo(212.22f, 105.0f, 236.0f, 117.93f, 236.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.19f, 155.59f),
                    PathNode.QuadTo(102.3f, 156.0f, 96.0f, 156.0f),
                    PathNode.CurveTo(90.53f, 156.0f, 85.28f, 155.75f, 80.27f, 155.31f),
                    PathNode.LineTo(80.0f, 155.31f),
                    PathNode.LineTo(80.0f, 155.31f),
                    PathNode.CurveTo(75.84f, 154.93f, 71.84f, 154.41f, 68.0f, 153.75f),
                    PathNode.LineTo(68.0f, 121.8f),
                    PathNode.CurveTo(77.25925f, 123.28288f, 86.62277f, 124.01859f, 96.0f, 124.0f),
                    PathNode.CurveTo(105.37723f, 124.01859f, 114.74075f, 123.28288f, 124.0f, 121.8f),
                    PathNode.LineTo(124.0f, 153.72f),
                    PathNode.CurveTo(118.86107f, 154.59727f, 113.68115f, 155.21472f, 108.48f, 155.57f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 101.32f),
                    PathNode.LineTo(172.0f, 124.0f),
                    PathNode.CurveTo(172.0f, 134.88f, 156.84f, 146.3f, 132.0f, 152.11f),
                    PathNode.LineTo(132.0f, 120.27f),
                    PathNode.CurveTo(149.63f, 116.38f, 163.75f, 109.69f, 172.0f, 101.32f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 52.0f),
                    PathNode.CurveTo(141.46f, 52.0f, 172.0f, 68.55f, 172.0f, 84.0f),
                    PathNode.CurveTo(172.0f, 99.45f, 141.46f, 116.0f, 96.0f, 116.0f),
                    PathNode.CurveTo(50.54f, 116.0f, 20.0f, 99.45f, 20.0f, 84.0f),
                    PathNode.CurveTo(20.0f, 68.55f, 50.54f, 52.0f, 96.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(20.0f, 124.0f),
                    PathNode.LineTo(20.0f, 101.32f),
                    PathNode.CurveTo(28.25f, 109.69f, 42.37f, 116.38f, 60.0f, 120.32f),
                    PathNode.LineTo(60.0f, 152.16f),
                    PathNode.CurveTo(35.16f, 146.3f, 20.0f, 134.88f, 20.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 172.0f),
                    PathNode.LineTo(84.0f, 163.6f),
                    PathNode.CurveTo(87.91f, 163.86f, 91.92f, 164.0f, 96.0f, 164.0f),
                    PathNode.CurveTo(100.08f, 164.0f, 104.06f, 163.86f, 108.0f, 163.61f),
                    PathNode.CurveTo(113.223465f, 165.51039f, 118.56887f, 167.05722f, 124.0f, 168.24f),
                    PathNode.LineTo(124.0f, 200.11f),
                    PathNode.CurveTo(99.16f, 194.3f, 84.0f, 182.88f, 84.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 201.72f),
                    PathNode.LineTo(132.0f, 169.77f),
                    PathNode.CurveTo(141.25824f, 171.2646f, 150.6219f, 172.01036f, 160.0f, 172.0f),
                    PathNode.CurveTo(169.37723f, 172.01859f, 178.74075f, 171.28288f, 188.0f, 169.8f),
                    PathNode.LineTo(188.0f, 201.72f),
                    PathNode.CurveTo(169.4571f, 204.76f, 150.5429f, 204.76f, 132.0f, 201.72f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 172.0f),
                    PathNode.CurveTo(236.0f, 182.88f, 220.84f, 194.3f, 196.0f, 200.11f),
                    PathNode.LineTo(196.0f, 168.27f),
                    PathNode.CurveTo(213.63f, 164.38f, 227.75f, 157.69f, 236.0f, 149.27f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _coins!!
    }

private var _coins: ImageVector? = null
