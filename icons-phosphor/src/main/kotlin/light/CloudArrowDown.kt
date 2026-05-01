package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CloudArrowDown: ImageVector
    get() {
        if (_cloudArrowDown != null) return _cloudArrowDown!!
        _cloudArrowDown = phosphorLightIcon(
            name = "CloudArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(246.0f, 128.0f),
                    PathNode.CurveTo(246.05315f, 146.61642f, 240.01237f, 164.73875f, 228.8f, 179.6f),
                    PathNode.CurveTo(226.81177f, 182.25096f, 223.05096f, 182.78822f, 220.4f, 180.8f),
                    PathNode.CurveTo(217.74904f, 178.81177f, 217.21178f, 175.05096f, 219.2f, 172.4f),
                    PathNode.CurveTo(238.51808f, 146.64255f, 238.96465f, 111.350044f, 220.30444f, 85.112076f),
                    PathNode.CurveTo(201.64424f, 58.874084f, 168.16016f, 47.712723f, 137.48921f, 57.506992f),
                    PathNode.CurveTo(106.81826f, 67.30126f, 86.0f, 95.803185f, 86.0f, 128.0f),
                    PathNode.CurveTo(86.0f, 131.3137f, 83.313705f, 134.0f, 80.0f, 134.0f),
                    PathNode.CurveTo(76.686295f, 134.0f, 74.0f, 131.3137f, 74.0f, 128.0f),
                    PathNode.CurveTo(73.992516f, 119.304276f, 75.311005f, 110.65825f, 77.91f, 102.36f),
                    PathNode.CurveTo(75.94869f, 102.12492f, 73.975334f, 102.00472f, 72.0f, 102.0f),
                    PathNode.CurveTo(44.38576f, 102.0f, 22.0f, 124.385765f, 22.0f, 152.0f),
                    PathNode.CurveTo(22.0f, 179.61424f, 44.38576f, 202.0f, 72.0f, 202.0f),
                    PathNode.LineTo(96.0f, 202.0f),
                    PathNode.CurveTo(99.313705f, 202.0f, 102.0f, 204.6863f, 102.0f, 208.0f),
                    PathNode.CurveTo(102.0f, 211.3137f, 99.313705f, 214.0f, 96.0f, 214.0f),
                    PathNode.LineTo(72.0f, 214.0f),
                    PathNode.CurveTo(48.6018f, 213.99203f, 27.200993f, 200.81224f, 16.663895f, 179.92096f),
                    PathNode.CurveTo(6.126796f, 159.02968f, 8.248373f, 133.9857f, 22.149662f, 115.1647f),
                    PathNode.CurveTo(36.05095f, 96.3437f, 59.3639f, 86.95178f, 82.43f, 90.88f),
                    PathNode.CurveTo(99.76985f, 54.657925f, 139.86984f, 35.2585f, 179.0326f, 44.145954f),
                    PathNode.CurveTo(218.19536f, 53.033417f, 245.99371f, 87.84145f, 246.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(179.76f, 171.76f),
                    PathNode.LineTo(158.0f, 193.51f),
                    PathNode.LineTo(158.0f, 128.0f),
                    PathNode.CurveTo(158.0f, 124.686295f, 155.3137f, 122.0f, 152.0f, 122.0f),
                    PathNode.CurveTo(148.6863f, 122.0f, 146.0f, 124.686295f, 146.0f, 128.0f),
                    PathNode.LineTo(146.0f, 193.51f),
                    PathNode.LineTo(124.24f, 171.76f),
                    PathNode.CurveTo(121.87592f, 169.55713f, 118.191925f, 169.62213f, 115.90703f, 171.90703f),
                    PathNode.CurveTo(113.62213f, 174.19193f, 113.55713f, 177.87592f, 115.76f, 180.24f),
                    PathNode.LineTo(147.76f, 212.24f),
                    PathNode.CurveTo(150.10254f, 214.57962f, 153.89746f, 214.57962f, 156.24f, 212.24f),
                    PathNode.LineTo(188.24f, 180.24f),
                    PathNode.CurveTo(190.44287f, 177.87592f, 190.37787f, 174.19193f, 188.09297f, 171.90703f),
                    PathNode.CurveTo(185.80807f, 169.62213f, 182.12408f, 169.55713f, 179.76f, 171.76f),
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
        return _cloudArrowDown!!
    }

private var _cloudArrowDown: ImageVector? = null
