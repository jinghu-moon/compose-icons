package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SpinnerBall: ImageVector
    get() {
        if (_spinnerBall != null) return _spinnerBall!!
        _spinnerBall = phosphorBoldIcon(
            name = "SpinnerBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(211.65f, 120.47f),
                    PathNode.CurveTo(188.51f, 136.0f, 170.71f, 133.74f, 151.92f, 126.0f),
                    PathNode.CurveTo(159.79f, 120.0f, 167.21f, 113.27f, 173.27f, 104.84f),
                    PathNode.CurveTo(181.0062f, 94.074425f, 185.74438f, 81.447334f, 187.0f, 68.25f),
                    PathNode.CurveTo(201.14899f, 82.18294f, 209.88557f, 100.69103f, 211.65f, 120.47f),
                    PathNode.Close,
                    PathNode.MoveTo(163.3f, 51.8f),
                    PathNode.CurveTo(165.2f, 79.61f, 154.3f, 93.89f, 138.21f, 106.28f),
                    PathNode.CurveTo(136.97f, 96.46f, 134.83f, 86.67f, 130.57f, 77.2f),
                    PathNode.CurveTo(125.09499f, 65.10918f, 116.509476f, 54.687836f, 105.69f, 47.0f),
                    PathNode.CurveTo(124.8542f, 41.70976f, 145.27551f, 43.41124f, 163.3f, 51.8f),
                    PathNode.Close,
                    PathNode.MoveTo(79.69f, 59.35f),
                    PathNode.CurveTo(104.69f, 71.6f, 111.62f, 88.15f, 114.29f, 108.29f),
                    PathNode.CurveTo(105.17f, 104.47f, 95.63f, 101.42f, 85.29f, 100.38f),
                    PathNode.CurveTo(72.081665f, 99.08094f, 58.765167f, 101.310135f, 46.7f, 106.84f),
                    PathNode.CurveTo(51.74584f, 87.61197f, 63.43208f, 70.78931f, 79.69f, 59.35f),
                    PathNode.Close,
                    PathNode.MoveTo(44.35f, 135.53f),
                    PathNode.CurveTo(67.49f, 120.0f, 85.29f, 122.26f, 104.08f, 130.0f),
                    PathNode.CurveTo(96.21f, 136.0f, 88.79f, 142.73f, 82.73f, 151.16f),
                    PathNode.CurveTo(74.9938f, 161.92557f, 70.25562f, 174.55266f, 69.0f, 187.75f),
                    PathNode.CurveTo(54.851013f, 173.81706f, 46.11443f, 155.30896f, 44.35f, 135.53f),
                    PathNode.Close,
                    PathNode.MoveTo(92.7f, 204.2f),
                    PathNode.CurveTo(90.8f, 176.39f, 101.7f, 162.11f, 117.79f, 149.72f),
                    PathNode.CurveTo(119.03f, 159.54f, 121.17f, 169.33f, 125.43f, 178.8f),
                    PathNode.CurveTo(130.905f, 190.89082f, 139.49054f, 201.31216f, 150.31f, 209.0f),
                    PathNode.CurveTo(131.1458f, 214.29024f, 110.72448f, 212.58876f, 92.7f, 204.2f),
                    PathNode.Close,
                    PathNode.MoveTo(176.31f, 196.65f),
                    PathNode.CurveTo(151.31f, 184.4f, 144.38f, 167.85f, 141.71f, 147.71f),
                    PathNode.CurveTo(150.83f, 151.53f, 160.37f, 154.58f, 170.71f, 155.62f),
                    PathNode.QuadTo(174.46f, 156.0f, 178.18f, 156.0f),
                    PathNode.CurveTo(188.92084f, 155.94139f, 199.52727f, 153.60675f, 209.3f, 149.15f),
                    PathNode.CurveTo(204.2571f, 168.38206f, 192.57047f, 185.20882f, 176.31f, 196.65f),
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
        return _spinnerBall!!
    }

private var _spinnerBall: ImageVector? = null
