package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Tooth: ImageVector
    get() {
        if (_tooth != null) return _tooth!!
        _tooth = phosphorThinIcon(
            name = "Tooth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(169.49f, 67.71f),
                    PathNode.LineTo(138.77f, 80.0f),
                    PathNode.LineTo(169.49f, 92.28f),
                    PathNode.CurveTo(171.27966f, 92.98725f, 172.3121f, 94.86861f, 171.9474f, 96.75808f),
                    PathNode.CurveTo(171.58272f, 98.64755f, 169.92432f, 100.00957f, 168.0f, 100.0f),
                    PathNode.CurveTo(167.48915f, 100.001595f, 166.98296f, 99.90308f, 166.51f, 99.71f),
                    PathNode.LineTo(128.0f, 84.31f),
                    PathNode.LineTo(89.49f, 99.71f),
                    PathNode.CurveTo(89.01705f, 99.90308f, 88.51084f, 100.001595f, 88.0f, 100.0f),
                    PathNode.CurveTo(86.07567f, 100.00957f, 84.417274f, 98.64755f, 84.0526f, 96.75808f),
                    PathNode.CurveTo(83.68792f, 94.86861f, 84.72034f, 92.98725f, 86.51f, 92.28f),
                    PathNode.LineTo(117.23f, 80.0f),
                    PathNode.LineTo(86.51f, 67.71f),
                    PathNode.CurveTo(84.45826f, 66.88158f, 83.466576f, 64.54674f, 84.295f, 62.495f),
                    PathNode.CurveTo(85.12343f, 60.443264f, 87.45826f, 59.451572f, 89.51f, 60.28f),
                    PathNode.LineTo(128.0f, 75.69f),
                    PathNode.LineTo(166.51f, 60.28f),
                    PathNode.CurveTo(168.56174f, 59.451572f, 170.89658f, 60.443264f, 171.725f, 62.495f),
                    PathNode.CurveTo(172.55342f, 64.54674f, 171.56174f, 66.88158f, 169.51f, 67.71f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 79.71f),
                    PathNode.CurveTo(220.07f, 150.79f, 196.84f, 209.78f, 174.35f, 225.76f),
                    PathNode.CurveTo(170.85481f, 228.24821f, 166.28064f, 228.63162f, 162.42f, 226.76f),
                    PathNode.CurveTo(158.46494f, 224.93861f, 155.81906f, 221.10403f, 155.52f, 216.76f),
                    PathNode.CurveTo(154.35f, 200.93f, 149.33f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(106.67f, 164.0f, 101.65f, 200.94f, 100.48f, 216.82f),
                    PathNode.CurveTo(100.00131f, 223.10435f, 94.78244f, 227.97096f, 88.48f, 228.01f),
                    PathNode.CurveTo(86.02984f, 228.00545f, 83.64218f, 227.23636f, 81.65f, 225.81f),
                    PathNode.CurveTo(59.16f, 209.81f, 35.93f, 150.81f, 36.0f, 79.81f),
                    PathNode.CurveTo(36.104664f, 51.16542f, 59.35523f, 27.99981f, 88.0f, 28.0f),
                    PathNode.LineTo(168.0f, 28.0f),
                    PathNode.CurveTo(196.62146f, 27.99967f, 219.8624f, 51.128872f, 220.0f, 79.75f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 79.71f),
                    PathNode.CurveTo(211.84058f, 55.5228f, 192.18773f, 35.999474f, 168.0f, 36.0f),
                    PathNode.LineTo(88.0f, 36.0f),
                    PathNode.CurveTo(63.79289f, 35.99964f, 44.13204f, 55.55325f, 44.0f, 79.76f),
                    PathNode.CurveTo(43.93f, 147.34f, 65.9f, 204.76f, 86.29f, 219.27f),
                    PathNode.CurveTo(87.42432f, 220.09508f, 88.922905f, 220.22221f, 90.18f, 219.6f),
                    PathNode.CurveTo(91.51279f, 218.98708f, 92.40314f, 217.69377f, 92.5f, 216.23f),
                    PathNode.CurveTo(95.36f, 177.39f, 108.0f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(148.0f, 156.0f, 160.64f, 177.4f, 163.5f, 216.24f),
                    PathNode.CurveTo(163.59686f, 217.70377f, 164.48721f, 218.99707f, 165.82f, 219.61f),
                    PathNode.CurveTo(167.07709f, 220.23221f, 168.57568f, 220.10509f, 169.71f, 219.28f),
                    PathNode.CurveTo(190.1f, 204.8f, 212.07f, 147.34f, 212.0f, 79.76f),
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
        return _tooth!!
    }

private var _tooth: ImageVector? = null
