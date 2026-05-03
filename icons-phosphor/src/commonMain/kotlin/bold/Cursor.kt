package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cursor: ImageVector
    get() {
        if (_cursor != null) return _cursor!!
        _cursor = phosphorBoldIcon(
            name = "Cursor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.15f, 179.17f),
                    PathNode.LineTo(177.32f, 132.35f),
                    PathNode.LineTo(215.25f, 118.84f),
                    PathNode.LineTo(216.01f, 118.54f),
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
                    PathNode.CurveTo(129.4453f, 150.00285f, 128.19345f, 150.12001f, 126.96f, 150.35f),
                    PathNode.CurveTo(120.46373f, 151.57971f, 114.99499f, 155.94049f, 112.35f, 162.0f),
                    PathNode.CurveTo(112.24f, 162.25f, 112.14f, 162.5f, 112.05f, 162.76f),
                    PathNode.LineTo(100.4f, 195.5f),
                    PathNode.LineTo(54.29f, 54.29f),
                    PathNode.LineTo(195.5f, 100.39f),
                    PathNode.LineTo(162.79f, 112.05f),
                    PathNode.CurveTo(162.53f, 112.14f, 162.28f, 112.24f, 162.03f, 112.35f),
                    PathNode.CurveTo(155.96187f, 114.98863f, 151.5916f, 120.4578f, 150.3567f, 126.95854f),
                    PathNode.CurveTo(149.1218f, 133.45927f, 151.18213f, 140.15002f, 155.86f, 144.83f),
                    PathNode.LineTo(155.86f, 144.83f),
                    PathNode.LineTo(204.35f, 193.31f),
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
        return _cursor!!
    }

private var _cursor: ImageVector? = null
