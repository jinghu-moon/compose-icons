package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SpinnerBall: ImageVector
    get() {
        if (_spinnerBall != null) return _spinnerBall!!
        _spinnerBall = phosphorThinIcon(
            name = "SpinnerBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(72.77152f, 28.0f, 28.0f, 72.77152f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 183.22847f, 72.77152f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(183.22847f, 228.0f, 228.0f, 183.22847f, 228.0f, 128.0f),
                    PathNode.CurveTo(227.93938f, 72.79665f, 183.20334f, 28.060623f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(219.92f, 124.44f),
                    PathNode.CurveTo(186.23f, 149.15f, 161.37f, 139.89f, 135.98f, 127.44f),
                    PathNode.CurveTo(159.52f, 111.58f, 181.83f, 93.49f, 179.32f, 51.63f),
                    PathNode.CurveTo(203.70374f, 68.02417f, 218.79001f, 95.07918f, 219.92f, 124.44f),
                    PathNode.Close,
                    PathNode.MoveTo(170.86f, 46.61f),
                    PathNode.CurveTo(175.4f, 88.13f, 155.0f, 105.0f, 131.55f, 120.83f),
                    PathNode.CurveTo(129.55f, 92.51f, 125.08f, 64.14f, 87.55f, 45.38f),
                    PathNode.CurveTo(113.91745f, 32.453278f, 144.87572f, 32.910404f, 170.85f, 46.61f),
                    PathNode.Close,
                    PathNode.MoveTo(79.0f, 50.18f),
                    PathNode.CurveTo(117.22f, 67.01f, 121.63f, 93.18f, 123.58f, 121.34f),
                    PathNode.CurveTo(98.08f, 108.88f, 71.25f, 98.59f, 36.24f, 121.72f),
                    PathNode.CurveTo(38.26605f, 92.41786f, 54.151318f, 65.84087f, 79.0f, 50.18f),
                    PathNode.Close,
                    PathNode.MoveTo(36.1f, 131.56f),
                    PathNode.CurveTo(69.79f, 106.85f, 94.65f, 116.11f, 120.04f, 128.51f),
                    PathNode.CurveTo(96.5f, 144.37f, 74.19f, 162.51f, 76.7f, 204.32f),
                    PathNode.CurveTo(52.32257f, 187.9405f, 37.230263f, 160.90663f, 36.08f, 131.56f),
                    PathNode.Close,
                    PathNode.MoveTo(85.16f, 209.39f),
                    PathNode.CurveTo(80.6f, 167.87f, 101.0f, 151.0f, 124.45f, 135.17f),
                    PathNode.CurveTo(126.45f, 163.49f, 130.92f, 191.86f, 168.45f, 210.62f),
                    PathNode.CurveTo(142.08255f, 223.54672f, 111.12428f, 223.0896f, 85.15f, 209.39f),
                    PathNode.Close,
                    PathNode.MoveTo(177.0f, 205.82f),
                    PathNode.CurveTo(138.78f, 188.99f, 134.37f, 162.82f, 132.42f, 134.66f),
                    PathNode.CurveTo(146.85f, 141.71f, 161.71f, 148.07f, 178.23f, 148.07f),
                    PathNode.CurveTo(190.9f, 148.07f, 204.56f, 144.33f, 219.76f, 134.29f),
                    PathNode.CurveTo(217.73244f, 163.58902f, 201.84715f, 190.16232f, 177.0f, 205.82f),
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
        return _spinnerBall!!
    }

private var _spinnerBall: ImageVector? = null
