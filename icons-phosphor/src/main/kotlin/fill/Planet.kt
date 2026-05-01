package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Planet: ImageVector
    get() {
        if (_planet != null) return _planet!!
        _planet = phosphorFillIcon(
            name = "Planet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(245.11f, 60.68f),
                    PathNode.CurveTo(237.46f, 47.49f, 217.26f, 44.52f, 186.61f, 52.02f),
                    PathNode.CurveTo(155.86778f, 28.340286f, 113.8929f, 25.496986f, 80.23812f, 44.814568f),
                    PathNode.CurveTo(46.583344f, 64.13215f, 27.867968f, 101.81119f, 32.81f, 140.3f),
                    PathNode.CurveTo(5.09f, 169.0f, 5.49f, 186.0f, 10.9f, 195.32f),
                    PathNode.CurveTo(16.0f, 204.16f, 26.64f, 208.0f, 40.64f, 208.0f),
                    PathNode.CurveTo(50.360214f, 207.7989f, 60.023132f, 206.45638f, 69.43f, 204.0f),
                    PathNode.CurveTo(100.16832f, 227.65968f, 142.12463f, 230.4963f, 175.76788f, 211.18939f),
                    PathNode.CurveTo(209.41112f, 191.88249f, 228.12973f, 154.22624f, 223.21f, 115.75f),
                    PathNode.CurveTo(235.72f, 102.75f, 244.04f, 90.4f, 246.87f, 79.83f),
                    PathNode.CurveTo(248.83f, 72.51f, 248.24f, 66.07f, 245.11f, 60.68f),
                    PathNode.Close,
                    PathNode.MoveTo(231.42f, 75.68f),
                    PathNode.CurveTo(225.31f, 98.46f, 182.77f, 132.99f, 143.9f, 155.32f),
                    PathNode.CurveTo(76.09f, 194.32f, 30.28f, 196.84f, 24.74f, 187.32f),
                    PathNode.CurveTo(23.28f, 184.81f, 24.09f, 180.08f, 26.96f, 174.32f),
                    PathNode.CurveTo(29.802607f, 168.92838f, 33.251617f, 163.879f, 37.24f, 159.27f),
                    PathNode.CurveTo(38.929447f, 164.1575f, 41.01296f, 168.89975f, 43.47f, 173.45f),
                    PathNode.CurveTo(44.236706f, 174.91579f, 45.826572f, 175.7584f, 47.47f, 175.57f),
                    PathNode.CurveTo(53.191265f, 174.86472f, 58.855427f, 173.75526f, 64.42f, 172.25f),
                    PathNode.CurveTo(85.65f, 166.7f, 111.05f, 155.77f, 135.94f, 141.47f),
                    PathNode.CurveTo(160.83f, 127.17f, 182.94f, 110.81f, 198.39f, 95.32f),
                    PathNode.CurveTo(202.45518f, 91.29869f, 206.23439f, 86.998215f, 209.7f, 82.45f),
                    PathNode.CurveTo(210.68488f, 81.123085f, 210.75243f, 79.32714f, 209.87f, 77.93f),
                    PathNode.CurveTo(207.17496f, 73.53986f, 204.13185f, 69.373146f, 200.77f, 65.47f),
                    PathNode.CurveTo(214.98f, 63.12f, 228.14f, 63.3f, 231.27f, 68.71f),
                    PathNode.CurveTo(232.19f, 70.28f, 232.24f, 72.63f, 231.42f, 75.69f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _planet!!
    }

private var _planet: ImageVector? = null
