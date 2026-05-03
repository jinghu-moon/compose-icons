package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ScribbleLoop: ImageVector
    get() {
        if (_scribbleLoop != null) return _scribbleLoop!!
        _scribbleLoop = phosphorThinIcon(
            name = "ScribbleLoop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(251.0f, 157.32f),
                    PathNode.CurveTo(249.68f, 155.86f, 226.53f, 130.69f, 189.21f, 116.89f),
                    PathNode.CurveTo(187.95f, 98.33f, 181.43f, 81.44f, 170.55f, 68.76f),
                    PathNode.CurveTo(156.62f, 52.56f, 136.38f, 44.0f, 112.0f, 44.0f),
                    PathNode.CurveTo(62.51f, 44.0f, 30.1f, 88.58f, 28.74f, 90.48f),
                    PathNode.CurveTo(27.455938f, 92.27769f, 27.872313f, 94.77593f, 29.67f, 96.06f),
                    PathNode.CurveTo(31.467688f, 97.34406f, 33.96594f, 96.92769f, 35.25f, 95.13f),
                    PathNode.CurveTo(35.56f, 94.7f, 66.68f, 52.0f, 112.0f, 52.0f),
                    PathNode.CurveTo(134.0f, 52.0f, 152.11f, 59.6f, 164.45f, 74.0f),
                    PathNode.CurveTo(173.56f, 84.61f, 179.26f, 98.62f, 180.91f, 114.13f),
                    PathNode.CurveTo(167.85152f, 110.09968f, 154.26625f, 108.033745f, 140.6f, 108.0f),
                    PathNode.CurveTo(115.5f, 108.0f, 94.51f, 114.48f, 79.91f, 126.75f),
                    PathNode.CurveTo(67.26f, 137.39f, 60.0f, 152.15f, 60.0f, 167.25f),
                    PathNode.CurveTo(59.87905f, 178.93604f, 64.450325f, 190.18233f, 72.69f, 198.47f),
                    PathNode.CurveTo(81.59f, 207.32f, 94.0f, 212.0f, 108.6f, 212.0f),
                    PathNode.CurveTo(160.23f, 212.0f, 188.47f, 167.92f, 189.38f, 125.68f),
                    PathNode.CurveTo(223.45f, 139.26f, 244.74f, 162.35f, 245.03f, 162.68f),
                    PathNode.CurveTo(246.51012f, 164.32028f, 249.03972f, 164.45012f, 250.68f, 162.97f),
                    PathNode.CurveTo(252.32028f, 161.48988f, 252.45012f, 158.96028f, 250.97f, 157.32f),
                    PathNode.Close,
                    PathNode.MoveTo(162.6f, 178.79f),
                    PathNode.CurveTo(153.23f, 190.29f, 136.26f, 204.0f, 108.6f, 204.0f),
                    PathNode.CurveTo(80.71f, 204.0f, 68.0f, 185.0f, 68.0f, 167.25f),
                    PathNode.CurveTo(68.0f, 142.57f, 90.72f, 116.0f, 140.6f, 116.0f),
                    PathNode.CurveTo(154.47525f, 116.0517f, 168.25163f, 118.33763f, 181.4f, 122.77f),
                    PathNode.LineTo(181.4f, 123.58f),
                    PathNode.CurveTo(181.4f, 144.0f, 174.54f, 164.1f, 162.57f, 178.79f),
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
        return _scribbleLoop!!
    }

private var _scribbleLoop: ImageVector? = null
