package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CursorClick: ImageVector
    get() {
        if (_cursorClick != null) return _cursorClick!!
        _cursorClick = phosphorBoldIcon(
            name = "CursorClick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.15f, 179.17f),
                    PathNode.LineTo(177.33f, 132.35f),
                    PathNode.LineTo(215.25f, 118.84f),
                    PathNode.CurveTo(215.51f, 118.75f, 215.76f, 118.65f, 216.01f, 118.54f),
                    PathNode.CurveTo(223.56958f, 115.2011f, 228.29709f, 107.55653f, 227.90729f, 99.30162f),
                    PathNode.CurveTo(227.51744f, 91.04671f, 222.09059f, 83.88165f, 214.25f, 81.27f),
                    PathNode.LineTo(54.16f, 29.0f),
                    PathNode.CurveTo(47.021923f, 26.706078f, 39.200405f, 28.59718f, 33.898792f, 33.898792f),
                    PathNode.CurveTo(28.59718f, 39.200405f, 26.706078f, 47.021923f, 29.0f, 54.16f),
                    PathNode.LineTo(81.27f, 214.24f),
                    PathNode.CurveTo(83.88165f, 222.08058f, 91.04671f, 227.50745f, 99.30162f, 227.89726f),
                    PathNode.CurveTo(107.55653f, 228.2871f, 115.2011f, 223.55959f, 118.54f, 216.0f),
                    PathNode.CurveTo(118.65f, 215.75f, 118.75f, 215.5f, 118.84f, 215.24f),
                    PathNode.LineTo(132.35f, 177.32f),
                    PathNode.LineTo(179.18f, 224.14f),
                    PathNode.CurveTo(186.98999f, 231.94763f, 199.65001f, 231.94763f, 207.46f, 224.14f),
                    PathNode.LineTo(224.15f, 207.46f),
                    PathNode.CurveTo(227.90248f, 203.70905f, 230.01073f, 198.62073f, 230.01073f, 193.315f),
                    PathNode.CurveTo(230.01073f, 188.00926f, 227.90248f, 182.92096f, 224.15f, 179.17f),
                    PathNode.Close,
                    PathNode.MoveTo(193.32f, 204.34f),
                    PathNode.LineTo(144.84f, 155.86f),
                    PathNode.CurveTo(141.09015f, 152.10901f, 136.00389f, 150.00113f, 130.7f, 150.0f),
                    PathNode.CurveTo(129.44858f, 150.00241f, 128.20003f, 150.11957f, 126.97f, 150.35f),
                    PathNode.CurveTo(120.46998f, 151.57669f, 114.996925f, 155.9379f, 112.35f, 162.0f),
                    PathNode.CurveTo(112.24f, 162.25f, 112.15f, 162.5f, 112.05f, 162.76f),
                    PathNode.LineTo(100.4f, 195.5f),
                    PathNode.LineTo(54.29f, 54.29f),
                    PathNode.LineTo(195.5f, 100.4f),
                    PathNode.LineTo(162.79f, 112.05f),
                    PathNode.CurveTo(162.54f, 112.14f, 162.28f, 112.24f, 162.03f, 112.35f),
                    PathNode.CurveTo(155.96341f, 114.99071f, 151.59543f, 120.460815f, 150.36256f, 126.96135f),
                    PathNode.CurveTo(149.1297f, 133.46188f, 151.19154f, 140.15144f, 155.87f, 144.83f),
                    PathNode.LineTo(155.87f, 144.83f),
                    PathNode.LineTo(204.35f, 193.31f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 16.0f),
                    PathNode.LineTo(84.0f, 12.0f),
                    PathNode.CurveTo(84.0f, 5.372583f, 89.37258f, 0f, 96.0f, 0f),
                    PathNode.CurveTo(102.62742f, 0f, 108.0f, 5.372583f, 108.0f, 12.0f),
                    PathNode.LineTo(108.0f, 16.0f),
                    PathNode.CurveTo(108.0f, 22.627417f, 102.62742f, 28.0f, 96.0f, 28.0f),
                    PathNode.CurveTo(89.37258f, 28.0f, 84.0f, 22.627417f, 84.0f, 16.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 108.0f),
                    PathNode.CurveTo(5.372583f, 108.0f, 0f, 102.62742f, 0f, 96.0f),
                    PathNode.CurveTo(0f, 89.37258f, 5.372583f, 84.0f, 12.0f, 84.0f),
                    PathNode.LineTo(16.0f, 84.0f),
                    PathNode.CurveTo(22.627417f, 84.0f, 28.0f, 89.37258f, 28.0f, 96.0f),
                    PathNode.CurveTo(28.0f, 102.62742f, 22.627417f, 108.0f, 16.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.62f, 24.21f),
                    PathNode.LineTo(124.62f, 12.21f),
                    PathNode.CurveTo(126.7659f, 5.994451f, 133.5143f, 2.663536f, 139.75323f, 4.740443f),
                    PathNode.CurveTo(145.99219f, 6.81735f, 149.39766f, 13.528431f, 147.39f, 19.79f),
                    PathNode.LineTo(143.39f, 31.79f),
                    PathNode.CurveTo(141.2441f, 38.00555f, 134.4957f, 41.336464f, 128.25676f, 39.259556f),
                    PathNode.CurveTo(122.017815f, 37.18265f, 118.61234f, 30.47157f, 120.62f, 24.21f),
                    PathNode.Close,
                    PathNode.MoveTo(39.39f, 128.21f),
                    PathNode.CurveTo(41.479893f, 134.49477f, 38.082855f, 141.28436f, 31.8f, 143.38f),
                    PathNode.LineTo(19.8f, 147.38f),
                    PathNode.CurveTo(15.700298f, 148.86433f, 11.11806f, 148.00813f, 7.83095f, 145.14359f),
                    PathNode.CurveTo(4.54384f, 142.27902f, 3.069148f, 137.85687f, 3.978976f, 133.59274f),
                    PathNode.CurveTo(4.888805f, 129.32858f, 8.039975f, 125.893456f, 12.21f, 124.62f),
                    PathNode.LineTo(24.21f, 120.62f),
                    PathNode.CurveTo(27.229485f, 119.613266f, 30.525232f, 119.847374f, 33.372097f, 121.270805f),
                    PathNode.CurveTo(36.21896f, 122.69424f, 38.383694f, 125.19038f, 39.39f, 128.21f),
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
        return _cursorClick!!
    }

private var _cursorClick: ImageVector? = null
