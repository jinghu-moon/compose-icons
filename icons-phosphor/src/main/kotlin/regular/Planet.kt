package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Planet: ImageVector
    get() {
        if (_planet != null) return _planet!!
        _planet = phosphorRegularIcon(
            name = "Planet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(245.11f, 60.68f),
                    PathNode.CurveTo(237.46f, 47.49f, 217.27f, 44.52f, 186.61f, 52.02f),
                    PathNode.CurveTo(157.6512f, 29.628185f, 118.473366f, 25.668894f, 85.62004f, 41.814003f),
                    PathNode.CurveTo(52.766716f, 57.959118f, 31.96547f, 91.39393f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.001255f, 132.11565f, 32.261772f, 136.2271f, 32.78f, 140.31f),
                    PathNode.CurveTo(5.09f, 169.0f, 5.49f, 186.0f, 10.9f, 195.32f),
                    PathNode.CurveTo(16.0f, 204.16f, 26.64f, 208.0f, 40.64f, 208.0f),
                    PathNode.CurveTo(50.360214f, 207.7989f, 60.023132f, 206.45638f, 69.43f, 204.0f),
                    PathNode.CurveTo(98.39183f, 226.36977f, 137.55771f, 230.31334f, 170.39774f, 214.16634f),
                    PathNode.CurveTo(203.23778f, 198.01932f, 224.03035f, 164.59499f, 224.0f, 128.0f),
                    PathNode.CurveTo(224.00198f, 123.90451f, 223.7448f, 119.813f, 223.23f, 115.75f),
                    PathNode.CurveTo(235.73f, 102.75f, 244.05f, 90.4f, 246.88f, 79.83f),
                    PathNode.CurveTo(248.83f, 72.51f, 248.24f, 66.07f, 245.11f, 60.68f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 48.0f),
                    PathNode.CurveTo(165.31264f, 48.038334f, 197.65811f, 73.83178f, 206.0f, 110.2f),
                    PathNode.CurveTo(188.94f, 126.26f, 165.85f, 142.73f, 143.93f, 155.33f),
                    PathNode.CurveTo(116.38f, 171.14f, 92.48f, 181.0f, 73.42f, 186.4f),
                    PathNode.CurveTo(49.396572f, 163.99417f, 41.525894f, 129.17249f, 53.57759f, 98.61267f),
                    PathNode.CurveTo(65.62929f, 68.05284f, 95.14965f, 47.97685f, 128.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(24.74f, 187.29f),
                    PathNode.CurveTo(23.28f, 184.78f, 24.09f, 180.05f, 26.96f, 174.29f),
                    PathNode.CurveTo(29.798082f, 168.89326f, 33.25104f, 163.84302f, 37.25f, 159.24f),
                    PathNode.CurveTo(41.214f, 170.72498f, 47.32212f, 181.3531f, 55.25f, 190.56f),
                    PathNode.CurveTo(38.0f, 193.46f, 27.24f, 191.61f, 24.74f, 187.29f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 208.0f),
                    PathNode.CurveTo(114.51128f, 208.01366f, 101.24115f, 204.5929f, 89.44f, 198.06f),
                    PathNode.CurveTo(111.100914f, 190.3992f, 132.00119f, 180.73747f, 151.87f, 169.2f),
                    PathNode.CurveTo(173.45f, 156.81f, 192.55f, 143.38f, 207.94f, 130.12f),
                    PathNode.CurveTo(206.75493f, 173.43346f, 171.32964f, 207.94586f, 128.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(231.42f, 75.69f),
                    PathNode.CurveTo(229.72f, 82.0f, 225.23f, 89.22f, 218.79f, 96.82f),
                    PathNode.CurveTo(214.83633f, 85.32127f, 208.72734f, 74.68144f, 200.79f, 65.47f),
                    PathNode.CurveTo(215.0f, 63.12f, 228.16f, 63.3f, 231.29f, 68.71f),
                    PathNode.CurveTo(232.19f, 70.28f, 232.24f, 72.63f, 231.42f, 75.69f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _planet!!
    }

private var _planet: ImageVector? = null
