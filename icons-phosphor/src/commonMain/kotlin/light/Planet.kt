package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Planet: ImageVector
    get() {
        if (_planet != null) return _planet!!
        _planet = phosphorLightIcon(
            name = "Planet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(243.39f, 61.68f),
                    PathNode.CurveTo(236.15f, 49.2f, 216.39f, 46.68f, 186.15f, 54.19f),
                    PathNode.CurveTo(157.88548f, 31.886461f, 119.35817f, 27.704136f, 86.966125f, 43.423115f),
                    PathNode.CurveTo(54.57409f, 59.14209f, 34.01917f, 91.99542f, 34.05f, 128.0f),
                    PathNode.CurveTo(34.050514f, 132.34888f, 34.351227f, 136.69254f, 34.95f, 141.0f),
                    PathNode.CurveTo(13.09f, 163.38f, 5.39f, 181.78f, 12.66f, 194.32f),
                    PathNode.CurveTo(17.16f, 202.08f, 26.66f, 206.01f, 40.52f, 206.01f),
                    PathNode.CurveTo(48.94314f, 205.86461f, 57.3256f, 204.80507f, 65.52f, 202.85f),
                    PathNode.CurveTo(66.97f, 202.53f, 68.44f, 202.17f, 69.93f, 201.85f),
                    PathNode.CurveTo(100.06972f, 225.60669f, 141.62863f, 228.64384f, 174.90198f, 209.52141f),
                    PathNode.CurveTo(208.17532f, 190.39897f, 226.47325f, 152.96165f, 221.12f, 114.96f),
                    PathNode.CurveTo(233.77f, 101.96f, 242.23f, 89.64f, 244.98f, 79.36f),
                    PathNode.CurveTo(246.76f, 72.53f, 246.24f, 66.59f, 243.39f, 61.68f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 46.0f),
                    PathNode.CurveTo(166.69054f, 46.05316f, 200.09573f, 73.105576f, 208.19f, 110.94f),
                    PathNode.CurveTo(192.19f, 126.24f, 170.05f, 142.61f, 144.89f, 157.06f),
                    PathNode.CurveTo(117.49f, 172.82f, 92.79f, 183.0f, 72.85f, 188.6f),
                    PathNode.CurveTo(47.84121f, 165.80257f, 39.40548f, 129.98381f, 51.611988f, 98.42175f),
                    PathNode.CurveTo(63.818493f, 66.859695f, 94.159775f, 46.0378f, 128.0f, 46.0f),
                    PathNode.Close,
                    PathNode.MoveTo(23.0f, 188.3f),
                    PathNode.CurveTo(19.48f, 182.23f, 25.31f, 169.74f, 38.0f, 155.3f),
                    PathNode.CurveTo(42.153625f, 168.94731f, 49.358932f, 181.47026f, 59.07f, 191.92f),
                    PathNode.CurveTo(39.42f, 195.74f, 26.39f, 194.08f, 23.0f, 188.3f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 210.0f),
                    PathNode.CurveTo(112.66585f, 210.01546f, 97.63911f, 205.69983f, 84.65f, 197.55f),
                    PathNode.CurveTo(105.33f, 190.84f, 128.21f, 180.49f, 150.87f, 167.47f),
                    PathNode.CurveTo(173.7f, 154.35f, 194.0f, 139.8f, 209.92f, 125.56f),
                    PathNode.CurveTo(209.92f, 126.37f, 209.98f, 127.18f, 209.98f, 128.0f),
                    PathNode.CurveTo(209.93591f, 173.26128f, 173.26126f, 209.94489f, 128.0f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(233.35f, 76.21f),
                    PathNode.CurveTo(231.47f, 83.21f, 226.07f, 91.7f, 217.99f, 100.82f),
                    PathNode.CurveTo(213.84125f, 87.14033f, 206.62462f, 74.58818f, 196.89f, 64.12f),
                    PathNode.CurveTo(212.71f, 61.07f, 228.89f, 60.63f, 233.01f, 67.7f),
                    PathNode.CurveTo(234.2f, 69.75f, 234.31f, 72.62f, 233.35f, 76.21f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _planet!!
    }

private var _planet: ImageVector? = null
