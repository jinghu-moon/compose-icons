package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MetaLogo: ImageVector
    get() {
        if (_metaLogo != null) return _metaLogo!!
        _metaLogo = phosphorThinIcon(
            name = "MetaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 149.31f),
                    PathNode.CurveTo(236.0f, 164.69f, 233.0f, 177.76f, 227.4f, 187.09f),
                    PathNode.CurveTo(220.73f, 198.15f, 210.4f, 204.0f, 197.4f, 204.0f),
                    PathNode.CurveTo(171.85f, 204.0f, 152.57f, 168.0f, 132.15f, 129.89f),
                    PathNode.CurveTo(113.78f, 95.53f, 94.74f, 60.0f, 74.0f, 60.0f),
                    PathNode.CurveTo(62.9f, 60.0f, 51.3f, 70.53f, 42.16f, 88.89f),
                    PathNode.CurveTo(33.050285f, 107.74224f, 28.215212f, 128.37325f, 28.0f, 149.31f),
                    PathNode.CurveTo(28.0f, 163.24f, 30.58f, 174.87f, 35.45f, 182.96f),
                    PathNode.CurveTo(40.67f, 191.61f, 48.45f, 195.96f, 58.56f, 195.96f),
                    PathNode.CurveTo(75.71f, 195.96f, 91.63f, 171.64f, 106.29f, 145.36f),
                    PathNode.CurveTo(107.36696f, 143.427f, 109.80701f, 142.73305f, 111.74f, 143.81f),
                    PathNode.CurveTo(113.673f, 144.88695f, 114.36696f, 147.327f, 113.29f, 149.26f),
                    PathNode.CurveTo(98.52f, 175.76f, 80.9f, 204.0f, 58.56f, 204.0f),
                    PathNode.CurveTo(45.63f, 204.0f, 35.27f, 198.15f, 28.56f, 187.09f),
                    PathNode.CurveTo(23.0f, 177.76f, 20.0f, 164.69f, 20.0f, 149.31f),
                    PathNode.CurveTo(20.230658f, 127.13292f, 25.35244f, 105.27999f, 35.0f, 85.31f),
                    PathNode.CurveTo(45.69f, 63.83f, 59.54f, 52.0f, 74.0f, 52.0f),
                    PathNode.CurveTo(99.54f, 52.0f, 118.83f, 88.0f, 139.25f, 126.11f),
                    PathNode.CurveTo(157.66f, 160.47f, 176.69f, 196.0f, 197.45f, 196.0f),
                    PathNode.CurveTo(207.57f, 196.0f, 215.34f, 191.61f, 220.56f, 183.0f),
                    PathNode.CurveTo(225.43f, 174.91f, 228.01f, 163.28f, 228.01f, 149.35f),
                    PathNode.CurveTo(227.79478f, 128.41325f, 222.95972f, 107.782234f, 213.85f, 88.93f),
                    PathNode.CurveTo(204.7f, 70.53f, 193.1f, 60.0f, 182.0f, 60.0f),
                    PathNode.CurveTo(172.25f, 60.0f, 161.85f, 68.0f, 150.22f, 84.57f),
                    PathNode.CurveTo(148.92131f, 86.29376f, 146.4893f, 86.67644f, 144.724f, 85.43479f),
                    PathNode.CurveTo(142.9587f, 84.19314f, 142.49672f, 81.774956f, 143.68f, 79.97f),
                    PathNode.CurveTo(157.1f, 60.89f, 169.28f, 51.97f, 182.0f, 51.97f),
                    PathNode.CurveTo(196.45f, 51.97f, 210.3f, 63.8f, 221.0f, 85.29f),
                    PathNode.CurveTo(230.65042f, 105.26608f, 235.77228f, 127.12616f, 236.0f, 149.31f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _metaLogo!!
    }

private var _metaLogo: ImageVector? = null
