package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Hurricane: ImageVector
    get() {
        if (_hurricane != null) return _hurricane!!
        _hurricane = phosphorLightIcon(
            name = "Hurricane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 98.0f),
                    PathNode.CurveTo(111.43146f, 98.0f, 98.0f, 111.43146f, 98.0f, 128.0f),
                    PathNode.CurveTo(98.0f, 144.56854f, 111.43146f, 158.0f, 128.0f, 158.0f),
                    PathNode.CurveTo(144.56854f, 158.0f, 158.0f, 144.56854f, 158.0f, 128.0f),
                    PathNode.CurveTo(158.0f, 111.43146f, 144.56854f, 98.0f, 128.0f, 98.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 146.0f),
                    PathNode.CurveTo(118.05888f, 146.0f, 110.0f, 137.94113f, 110.0f, 128.0f),
                    PathNode.CurveTo(110.0f, 118.05888f, 118.05888f, 110.0f, 128.0f, 110.0f),
                    PathNode.CurveTo(137.94113f, 110.0f, 146.0f, 118.05888f, 146.0f, 128.0f),
                    PathNode.CurveTo(146.0f, 137.94113f, 137.94113f, 146.0f, 128.0f, 146.0f),
                    PathNode.Close,
                    PathNode.MoveTo(155.91f, 46.63f),
                    PathNode.LineTo(165.8f, 9.54f),
                    PathNode.CurveTo(166.33757f, 7.521719f, 165.78687f, 5.369117f, 164.34612f, 3.856941f),
                    PathNode.CurveTo(162.90536f, 2.344766f, 160.7819f, 1.690643f, 158.74f, 2.13f),
                    PathNode.CurveTo(138.1816f, 7.182298f, 118.5891f, 15.566535f, 100.74f, 26.95f),
                    PathNode.CurveTo(62.32f, 51.66f, 42.0f, 86.6f, 42.0f, 128.0f),
                    PathNode.CurveTo(42.01985f, 164.739f, 65.34944f, 197.41809f, 100.09f, 209.37f),
                    PathNode.LineTo(90.2f, 246.45f),
                    PathNode.CurveTo(89.658104f, 248.46968f, 90.20682f, 250.62581f, 91.648254f, 252.14075f),
                    PathNode.CurveTo(93.08969f, 253.65569f, 95.21589f, 254.31087f, 97.26f, 253.87f),
                    PathNode.CurveTo(117.818405f, 248.8177f, 137.41089f, 240.43347f, 155.26f, 229.05f),
                    PathNode.CurveTo(193.68f, 204.34f, 214.0f, 169.4f, 214.0f, 128.0f),
                    PathNode.CurveTo(213.98318f, 91.260025f, 190.65247f, 58.57934f, 155.91f, 46.63f),
                    PathNode.Close,
                    PathNode.MoveTo(149.05f, 218.76f),
                    PathNode.CurveTo(135.16975f, 227.57211f, 120.191475f, 234.52162f, 104.5f, 239.43f),
                    PathNode.LineTo(113.18f, 206.86f),
                    PathNode.CurveTo(113.5887f, 205.32173f, 113.36945f, 203.68411f, 112.57051f, 202.30753f),
                    PathNode.CurveTo(111.77157f, 200.93094f, 110.4584f, 199.9282f, 108.92f, 199.52f),
                    PathNode.CurveTo(76.536934f, 190.85663f, 54.010864f, 161.52188f, 54.0f, 128.0f),
                    PathNode.CurveTo(54.0f, 90.47f, 71.82f, 59.93f, 107.0f, 37.23f),
                    PathNode.CurveTo(120.866806f, 28.428366f, 135.82759f, 21.482521f, 151.5f, 16.57f),
                    PathNode.LineTo(142.82f, 49.14f),
                    PathNode.CurveTo(142.4113f, 50.678265f, 142.63054f, 52.31589f, 143.42949f, 53.692474f),
                    PathNode.CurveTo(144.22844f, 55.06906f, 145.5416f, 56.071793f, 147.08f, 56.48f),
                    PathNode.CurveTo(179.46306f, 65.143364f, 201.98914f, 94.47812f, 202.0f, 128.0f),
                    PathNode.CurveTo(202.0f, 165.53f, 184.18f, 196.07f, 149.05f, 218.76f),
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
        return _hurricane!!
    }

private var _hurricane: ImageVector? = null
