package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ScribbleLoop: ImageVector
    get() {
        if (_scribbleLoop != null) return _scribbleLoop!!
        _scribbleLoop = phosphorLightIcon(
            name = "ScribbleLoop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(252.45f, 156.0f),
                    PathNode.CurveTo(251.13f, 154.54f, 228.18f, 129.58f, 191.08f, 115.5f),
                    PathNode.CurveTo(189.58f, 97.01f, 182.95f, 80.19f, 172.08f, 67.5f),
                    PathNode.CurveTo(157.74f, 50.8f, 137.0f, 42.0f, 112.0f, 42.0f),
                    PathNode.CurveTo(61.49f, 42.0f, 28.5f, 87.38f, 27.12f, 89.31f),
                    PathNode.CurveTo(25.187004f, 92.00515f, 25.80485f, 95.757f, 28.5f, 97.69f),
                    PathNode.CurveTo(31.19515f, 99.62299f, 34.947002f, 99.00515f, 36.88f, 96.31f),
                    PathNode.CurveTo(37.18f, 95.87f, 67.75f, 54.0f, 112.0f, 54.0f),
                    PathNode.CurveTo(133.37f, 54.0f, 151.0f, 61.35f, 162.93f, 75.27f),
                    PathNode.CurveTo(171.19f, 84.89f, 176.57f, 97.41f, 178.55f, 111.33f),
                    PathNode.CurveTo(166.19066f, 107.80511f, 153.40216f, 106.01135f, 140.55f, 106.0f),
                    PathNode.CurveTo(114.97f, 106.0f, 93.55f, 112.65f, 78.55f, 125.22f),
                    PathNode.CurveTo(65.45f, 136.22f, 57.93f, 151.56f, 57.93f, 167.22f),
                    PathNode.CurveTo(57.809765f, 179.43887f, 62.593258f, 191.19588f, 71.21f, 199.86f),
                    PathNode.CurveTo(80.56f, 209.12f, 93.47f, 214.0f, 108.6f, 214.0f),
                    PathNode.CurveTo(160.33f, 214.0f, 189.15f, 170.91f, 191.28f, 128.62f),
                    PathNode.CurveTo(223.33f, 142.11f, 243.28f, 163.71f, 243.55f, 164.02f),
                    PathNode.CurveTo(245.81725f, 166.19426f, 249.37772f, 166.25171f, 251.71394f, 164.15175f),
                    PathNode.CurveTo(254.05014f, 162.05177f, 254.37115f, 158.50534f, 252.45f, 156.02f),
                    PathNode.Close,
                    PathNode.MoveTo(161.0f, 177.53f),
                    PathNode.CurveTo(151.92f, 188.69f, 135.44f, 202.0f, 108.6f, 202.0f),
                    PathNode.CurveTo(90.0f, 202.0f, 70.0f, 191.12f, 70.0f, 167.25f),
                    PathNode.CurveTo(70.0f, 143.53f, 92.09f, 118.0f, 140.6f, 118.0f),
                    PathNode.CurveTo(153.77805f, 118.04356f, 166.86868f, 120.14211f, 179.4f, 124.22f),
                    PathNode.CurveTo(179.26f, 143.94f, 172.58f, 163.34f, 161.0f, 177.53f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _scribbleLoop!!
    }

private var _scribbleLoop: ImageVector? = null
