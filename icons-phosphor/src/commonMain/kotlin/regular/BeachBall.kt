package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BeachBall: ImageVector
    get() {
        if (_beachBall != null) return _beachBall!!
        _beachBall = phosphorRegularIcon(
            name = "BeachBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(209.7f, 95.3f),
                    PathNode.CurveTo(196.3721f, 91.191605f, 182.6506f, 88.4902f, 168.76f, 87.24f),
                    PathNode.CurveTo(167.5098f, 73.349396f, 164.8084f, 59.627903f, 160.7f, 46.3f),
                    PathNode.CurveTo(183.01021f, 55.3008f, 200.6992f, 72.9898f, 209.7f, 95.3f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 128.0f),
                    PathNode.CurveTo(216.00385f, 137.20847f, 214.55954f, 146.36026f, 211.72f, 155.12f),
                    PathNode.CurveTo(204.46631f, 137.15381f, 194.64397f, 120.335236f, 182.56f, 105.19f),
                    PathNode.CurveTo(193.57455f, 107.11412f, 204.38972f, 110.04302f, 214.87f, 113.94f),
                    PathNode.CurveTo(215.62167f, 118.58895f, 215.99956f, 123.29067f, 216.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(142.06f, 41.13f),
                    PathNode.CurveTo(145.95699f, 51.610275f, 148.88588f, 62.42545f, 150.81f, 73.44f),
                    PathNode.CurveTo(135.66476f, 61.356033f, 118.8462f, 51.533695f, 100.88f, 44.28f),
                    PathNode.CurveTo(114.1628f, 39.980038f, 128.27773f, 38.90034f, 142.06f, 41.13f),
                    PathNode.Close,
                    PathNode.MoveTo(80.44f, 54.0f),
                    PathNode.CurveTo(102.74347f, 60.89337f, 123.530334f, 71.97065f, 141.69f, 86.64f),
                    PathNode.CurveTo(105.58284f, 88.25072f, 70.58508f, 99.60563f, 40.41f, 119.5f),
                    PathNode.CurveTo(43.041313f, 92.69615f, 57.78722f, 68.567825f, 80.44f, 54.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.67f, 138.86f),
                    PathNode.CurveTo(73.249115f, 114.60189f, 112.93679f, 101.80043f, 153.55f, 102.45f),
                    PathNode.CurveTo(154.19957f, 143.0632f, 141.39812f, 182.75089f, 117.14f, 215.33f),
                    PathNode.CurveTo(77.17655f, 210.29678f, 45.703224f, 178.82344f, 40.67f, 138.86f),
                    PathNode.Close,
                    PathNode.MoveTo(136.5f, 215.59f),
                    PathNode.CurveTo(156.3979f, 185.41594f, 167.7563f, 150.41812f, 169.37f, 114.31f),
                    PathNode.CurveTo(184.0358f, 132.47047f, 195.10965f, 153.25728f, 202.0f, 175.56f),
                    PathNode.CurveTo(187.43217f, 198.21278f, 163.30386f, 212.9587f, 136.5f, 215.59f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _beachBall!!
    }

private var _beachBall: ImageVector? = null
