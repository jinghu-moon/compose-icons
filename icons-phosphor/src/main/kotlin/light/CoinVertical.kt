package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CoinVertical: ImageVector
    get() {
        if (_coinVertical != null) return _coinVertical!!
        _coinVertical = phosphorLightIcon(
            name = "CoinVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(196.78f, 57.09f),
                    PathNode.CurveTo(185.08f, 37.0f, 169.18f, 26.0f, 152.0f, 26.0f),
                    PathNode.LineTo(104.0f, 26.0f),
                    PathNode.CurveTo(86.82f, 26.0f, 70.92f, 37.0f, 59.22f, 57.09f),
                    PathNode.CurveTo(48.12f, 76.13f, 42.0f, 101.31f, 42.0f, 128.0f),
                    PathNode.CurveTo(42.0f, 154.69f, 48.12f, 179.87f, 59.22f, 198.91f),
                    PathNode.CurveTo(70.92f, 219.0f, 86.82f, 230.0f, 104.0f, 230.0f),
                    PathNode.LineTo(152.0f, 230.0f),
                    PathNode.CurveTo(169.18f, 230.0f, 185.08f, 219.0f, 196.78f, 198.91f),
                    PathNode.CurveTo(207.88f, 179.91f, 214.0f, 154.69f, 214.0f, 128.0f),
                    PathNode.CurveTo(214.0f, 101.31f, 207.88f, 76.13f, 196.78f, 57.09f),
                    PathNode.Close,
                    PathNode.MoveTo(201.88f, 122.0f),
                    PathNode.LineTo(165.88f, 122.0f),
                    PathNode.CurveTo(165.23f, 103.16f, 161.51f, 85.27f, 155.14f, 70.0f),
                    PathNode.LineTo(190.0f, 70.0f),
                    PathNode.CurveTo(197.06f, 84.74f, 201.16f, 102.77f, 201.88f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 38.0f),
                    PathNode.CurveTo(163.31f, 38.0f, 174.22f, 45.06f, 183.14f, 58.0f),
                    PathNode.LineTo(149.28f, 58.0f),
                    PathNode.LineTo(148.78f, 57.09f),
                    PathNode.CurveTo(144.73582f, 49.95075f, 139.57372f, 43.505703f, 133.49f, 38.0f),
                    PathNode.Close,
                    PathNode.MoveTo(69.58f, 192.86f),
                    PathNode.CurveTo(59.54f, 175.63f, 54.0f, 152.6f, 54.0f, 128.0f),
                    PathNode.CurveTo(54.0f, 103.4f, 59.54f, 80.37f, 69.58f, 63.14f),
                    PathNode.CurveTo(79.0f, 46.93f, 91.26f, 38.0f, 104.0f, 38.0f),
                    PathNode.CurveTo(116.74f, 38.0f, 129.0f, 46.93f, 138.42f, 63.14f),
                    PathNode.CurveTo(148.46f, 80.37f, 154.0f, 103.4f, 154.0f, 128.0f),
                    PathNode.CurveTo(154.0f, 152.6f, 148.46f, 175.63f, 138.42f, 192.86f),
                    PathNode.CurveTo(129.0f, 209.07f, 116.74f, 218.0f, 104.0f, 218.0f),
                    PathNode.CurveTo(91.26f, 218.0f, 79.0f, 209.07f, 69.58f, 192.86f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 218.0f),
                    PathNode.LineTo(133.49f, 218.0f),
                    PathNode.CurveTo(139.57372f, 212.4943f, 144.73582f, 206.04926f, 148.78f, 198.91f),
                    PathNode.LineTo(149.28f, 198.0f),
                    PathNode.LineTo(183.14f, 198.0f),
                    PathNode.CurveTo(174.22f, 210.94f, 163.31f, 218.0f, 152.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(190.0f, 186.0f),
                    PathNode.LineTo(155.14f, 186.0f),
                    PathNode.CurveTo(161.51f, 170.73f, 165.23f, 152.84f, 165.88f, 134.0f),
                    PathNode.LineTo(201.88f, 134.0f),
                    PathNode.CurveTo(201.16f, 153.23f, 197.06f, 171.26f, 190.0f, 186.0f),
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
        return _coinVertical!!
    }

private var _coinVertical: ImageVector? = null
