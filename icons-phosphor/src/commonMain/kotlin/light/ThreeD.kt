package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ThreeD: ImageVector
    get() {
        if (_threeD != null) return _threeD!!
        _threeD = phosphorLightIcon(
            name = "ThreeD",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(98.0f, 148.0f),
                    PathNode.CurveTo(98.0f, 135.84973f, 88.15026f, 126.0f, 76.0f, 126.0f),
                    PathNode.CurveTo(73.762184f, 126.00152f, 71.709496f, 124.757545f, 70.67522f, 122.77309f),
                    PathNode.CurveTo(69.640945f, 120.78861f, 69.79699f, 118.39349f, 71.08f, 116.56f),
                    PathNode.LineTo(92.48f, 86.0f),
                    PathNode.LineTo(56.0f, 86.0f),
                    PathNode.CurveTo(52.68629f, 86.0f, 50.0f, 83.313705f, 50.0f, 80.0f),
                    PathNode.CurveTo(50.0f, 76.686295f, 52.68629f, 74.0f, 56.0f, 74.0f),
                    PathNode.LineTo(104.0f, 74.0f),
                    PathNode.CurveTo(106.237816f, 73.99848f, 108.290504f, 75.242455f, 109.32478f, 77.22691f),
                    PathNode.CurveTo(110.359055f, 79.21139f, 110.20301f, 81.60651f, 108.92f, 83.44f),
                    PathNode.LineTo(86.39f, 115.62f),
                    PathNode.CurveTo(99.84473f, 119.94194f, 109.22324f, 132.13603f, 109.94713f, 146.24931f),
                    PathNode.CurveTo(110.67101f, 160.36261f, 102.589325f, 173.45224f, 89.64739f, 179.1281f),
                    PathNode.CurveTo(76.70546f, 184.80396f, 61.601906f, 181.88254f, 51.71f, 171.79f),
                    PathNode.CurveTo(49.393166f, 169.4207f, 49.4357f, 165.62184f, 51.805f, 163.305f),
                    PathNode.CurveTo(54.1743f, 160.98816f, 57.973164f, 161.0307f, 60.29f, 163.4f),
                    PathNode.CurveTo(66.546875f, 169.78235f, 76.043175f, 171.74501f, 84.31751f, 168.36594f),
                    PathNode.CurveTo(92.59185f, 164.98686f, 97.99953f, 156.93771f, 98.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 74.0f),
                    PathNode.CurveTo(189.82338f, 74.0f, 214.0f, 98.17662f, 214.0f, 128.0f),
                    PathNode.CurveTo(214.0f, 157.82338f, 189.82338f, 182.0f, 160.0f, 182.0f),
                    PathNode.LineTo(136.0f, 182.0f),
                    PathNode.CurveTo(132.6863f, 182.0f, 130.0f, 179.3137f, 130.0f, 176.0f),
                    PathNode.LineTo(130.0f, 80.0f),
                    PathNode.CurveTo(130.0f, 76.686295f, 132.6863f, 74.0f, 136.0f, 74.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 86.0f),
                    PathNode.LineTo(142.0f, 86.0f),
                    PathNode.LineTo(142.0f, 170.0f),
                    PathNode.LineTo(160.0f, 170.0f),
                    PathNode.CurveTo(183.19595f, 170.0f, 202.0f, 151.19595f, 202.0f, 128.0f),
                    PathNode.CurveTo(202.0f, 104.80404f, 183.19595f, 86.0f, 160.0f, 86.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 54.0f),
                    PathNode.LineTo(224.0f, 54.0f),
                    PathNode.CurveTo(227.3137f, 54.0f, 230.0f, 51.31371f, 230.0f, 48.0f),
                    PathNode.CurveTo(230.0f, 44.68629f, 227.3137f, 42.0f, 224.0f, 42.0f),
                    PathNode.LineTo(32.0f, 42.0f),
                    PathNode.CurveTo(28.68629f, 42.0f, 26.0f, 44.68629f, 26.0f, 48.0f),
                    PathNode.CurveTo(26.0f, 51.31371f, 28.68629f, 54.0f, 32.0f, 54.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 202.0f),
                    PathNode.LineTo(32.0f, 202.0f),
                    PathNode.CurveTo(28.68629f, 202.0f, 26.0f, 204.6863f, 26.0f, 208.0f),
                    PathNode.CurveTo(26.0f, 211.3137f, 28.68629f, 214.0f, 32.0f, 214.0f),
                    PathNode.LineTo(224.0f, 214.0f),
                    PathNode.CurveTo(227.3137f, 214.0f, 230.0f, 211.3137f, 230.0f, 208.0f),
                    PathNode.CurveTo(230.0f, 204.6863f, 227.3137f, 202.0f, 224.0f, 202.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _threeD!!
    }

private var _threeD: ImageVector? = null
