package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CloudArrowUp: ImageVector
    get() {
        if (_cloudArrowUp != null) return _cloudArrowUp!!
        _cloudArrowUp = phosphorLightIcon(
            name = "CloudArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(188.24f, 164.24f),
                    PathNode.CurveTo(185.89746f, 166.57962f, 182.10254f, 166.57962f, 179.76f, 164.24f),
                    PathNode.LineTo(158.0f, 142.49f),
                    PathNode.LineTo(158.0f, 208.0f),
                    PathNode.CurveTo(158.0f, 211.3137f, 155.3137f, 214.0f, 152.0f, 214.0f),
                    PathNode.CurveTo(148.6863f, 214.0f, 146.0f, 211.3137f, 146.0f, 208.0f),
                    PathNode.LineTo(146.0f, 142.49f),
                    PathNode.LineTo(124.24f, 164.24f),
                    PathNode.CurveTo(121.87592f, 166.44287f, 118.191925f, 166.37787f, 115.90703f, 164.09297f),
                    PathNode.CurveTo(113.62213f, 161.80807f, 113.55713f, 158.12408f, 115.76f, 155.76f),
                    PathNode.LineTo(147.76f, 123.76f),
                    PathNode.CurveTo(150.10254f, 121.42038f, 153.89746f, 121.42038f, 156.24f, 123.76f),
                    PathNode.LineTo(188.24f, 155.76f),
                    PathNode.CurveTo(190.57962f, 158.10254f, 190.57962f, 161.89746f, 188.24f, 164.24f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 42.0f),
                    PathNode.CurveTo(126.89673f, 42.0267f, 96.74014f, 61.02959f, 82.43f, 90.88f),
                    PathNode.CurveTo(59.3639f, 86.95178f, 36.05095f, 96.3437f, 22.149662f, 115.1647f),
                    PathNode.CurveTo(8.248373f, 133.9857f, 6.126796f, 159.02968f, 16.663895f, 179.92096f),
                    PathNode.CurveTo(27.200993f, 200.81224f, 48.6018f, 213.99203f, 72.0f, 214.0f),
                    PathNode.LineTo(112.0f, 214.0f),
                    PathNode.CurveTo(115.313705f, 214.0f, 118.0f, 211.3137f, 118.0f, 208.0f),
                    PathNode.CurveTo(118.0f, 204.6863f, 115.313705f, 202.0f, 112.0f, 202.0f),
                    PathNode.LineTo(72.0f, 202.0f),
                    PathNode.CurveTo(44.38576f, 202.0f, 22.0f, 179.61424f, 22.0f, 152.0f),
                    PathNode.CurveTo(22.0f, 124.385765f, 44.38576f, 102.0f, 72.0f, 102.0f),
                    PathNode.CurveTo(73.975334f, 102.00472f, 75.94869f, 102.12492f, 77.91f, 102.36f),
                    PathNode.CurveTo(75.311005f, 110.65825f, 73.992516f, 119.304276f, 74.0f, 128.0f),
                    PathNode.CurveTo(74.0f, 131.3137f, 76.686295f, 134.0f, 80.0f, 134.0f),
                    PathNode.CurveTo(83.313705f, 134.0f, 86.0f, 131.3137f, 86.0f, 128.0f),
                    PathNode.CurveTo(86.01392f, 91.04457f, 113.289894f, 59.764637f, 149.89946f, 54.72045f),
                    PathNode.CurveTo(186.50903f, 49.67627f, 221.22778f, 72.41437f, 231.23514f, 107.98904f),
                    PathNode.CurveTo(241.2425f, 143.5637f, 223.47021f, 181.06783f, 189.6f, 195.85f),
                    PathNode.CurveTo(186.56244f, 197.17548f, 185.17451f, 200.71243f, 186.5f, 203.75f),
                    PathNode.CurveTo(187.82549f, 206.78757f, 191.36243f, 208.17548f, 194.4f, 206.85f),
                    PathNode.CurveTo(231.76314f, 190.58186f, 252.57918f, 150.32423f, 244.25476f, 110.43238f),
                    PathNode.CurveTo(235.93034f, 70.54051f, 200.75114f, 41.96769f, 160.0f, 42.0f),
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
        return _cloudArrowUp!!
    }

private var _cloudArrowUp: ImageVector? = null
