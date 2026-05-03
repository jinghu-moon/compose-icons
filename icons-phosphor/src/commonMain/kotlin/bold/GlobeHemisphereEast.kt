package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GlobeHemisphereEast: ImageVector
    get() {
        if (_globeHemisphereEast != null) return _globeHemisphereEast!!
        _globeHemisphereEast = phosphorBoldIcon(
            name = "GlobeHemisphereEast",
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
                    PathNode.MoveTo(128.0f, 44.0f),
                    PathNode.CurveTo(143.54181f, 43.98765f, 158.77916f, 48.309513f, 172.0f, 56.48f),
                    PathNode.LineTo(172.0f, 72.48f),
                    PathNode.LineTo(151.79f, 96.0f),
                    PathNode.LineTo(123.32f, 99.85f),
                    PathNode.LineTo(104.62f, 87.6f),
                    PathNode.CurveTo(100.21417f, 84.52496f, 94.756386f, 83.35192f, 89.476166f, 84.34514f),
                    PathNode.CurveTo(84.195946f, 85.33835f, 79.53741f, 88.41428f, 76.55f, 92.88f),
                    PathNode.LineTo(55.61f, 124.18f),
                    PathNode.CurveTo(53.42408f, 127.433525f, 52.248188f, 131.26039f, 52.23f, 135.18f),
                    PathNode.LineTo(52.07f, 163.87f),
                    PathNode.CurveTo(39.783417f, 137.85266f, 41.668068f, 107.35692f, 57.06469f, 83.05041f),
                    PathNode.CurveTo(72.46131f, 58.743904f, 99.22741f, 44.008972f, 128.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.41f, 187.14f),
                    PathNode.CurveTo(73.17827f, 183.36723f, 75.97133f, 177.63023f, 76.0f, 171.55f),
                    PathNode.LineTo(76.2f, 136.55f),
                    PathNode.LineTo(94.27f, 109.55f),
                    PathNode.LineTo(110.89f, 120.43f),
                    PathNode.CurveTo(115.00362f, 123.31187f, 120.05406f, 124.53341f, 125.03f, 123.85f),
                    PathNode.LineTo(156.5f, 119.59f),
                    PathNode.CurveTo(161.3594f, 118.93239f, 165.80786f, 116.51242f, 169.0f, 112.79f),
                    PathNode.LineTo(191.16f, 87.0f),
                    PathNode.CurveTo(193.3424f, 84.4457f, 194.85152f, 81.38625f, 195.55f, 78.1f),
                    PathNode.CurveTo(210.30743f, 98.02896f, 215.478f, 123.47165f, 209.67f, 147.58f),
                    PathNode.LineTo(198.33f, 137.21f),
                    PathNode.CurveTo(192.58478f, 131.98302f, 184.34029f, 130.5382f, 177.16f, 133.5f),
                    PathNode.LineTo(146.71f, 146.16f),
                    PathNode.CurveTo(140.23466f, 148.87273f, 135.64398f, 154.76746f, 134.6f, 161.71f),
                    PathNode.LineTo(132.21f, 177.91f),
                    PathNode.CurveTo(130.72435f, 187.99442f, 137.06056f, 197.58273f, 146.92f, 200.17f),
                    PathNode.LineTo(162.92f, 204.35f),
                    PathNode.CurveTo(130.93407f, 219.01128f, 93.195465f, 212.12428f, 68.45f, 187.11f),
                    PathNode.Close,
                    PathNode.MoveTo(185.18f, 189.46f),
                    PathNode.LineTo(183.55f, 187.83f),
                    PathNode.CurveTo(181.03928f, 185.31625f, 177.9057f, 183.51479f, 174.47f, 182.61f),
                    PathNode.LineTo(156.47f, 177.89f),
                    PathNode.LineTo(158.0f, 167.48f),
                    PathNode.LineTo(184.0f, 156.67f),
                    PathNode.LineTo(200.0f, 171.26f),
                    PathNode.CurveTo(195.92708f, 177.98398f, 190.93936f, 184.10925f, 185.18f, 189.46f),
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
        return _globeHemisphereEast!!
    }

private var _globeHemisphereEast: ImageVector? = null
