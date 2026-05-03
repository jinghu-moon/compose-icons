package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.StarAndCrescent: ImageVector
    get() {
        if (_starAndCrescent != null) return _starAndCrescent!!
        _starAndCrescent = phosphorFillIcon(
            name = "StarAndCrescent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 206.4f),
                    PathNode.CurveTo(160.00227f, 209.40723f, 158.31792f, 212.16171f, 155.64f, 213.53f),
                    PathNode.CurveTo(142.13922f, 220.45775f, 127.1744f, 224.04807f, 112.0f, 224.0f),
                    PathNode.CurveTo(58.980663f, 224.0f, 16.0f, 181.01933f, 16.0f, 128.0f),
                    PathNode.CurveTo(16.0f, 74.98067f, 58.980663f, 32.0f, 112.0f, 32.0f),
                    PathNode.CurveTo(127.1744f, 31.95193f, 142.13922f, 35.542255f, 155.64f, 42.47f),
                    PathNode.CurveTo(158.31712f, 43.836895f, 160.00209f, 46.589108f, 160.00209f, 49.595f),
                    PathNode.CurveTo(160.00209f, 52.600895f, 158.31712f, 55.353104f, 155.64f, 56.72f),
                    PathNode.CurveTo(128.83632f, 70.37765f, 111.960266f, 97.917305f, 111.960266f, 128.0f),
                    PathNode.CurveTo(111.960266f, 158.0827f, 128.83632f, 185.62238f, 155.64f, 199.28f),
                    PathNode.CurveTo(158.31471f, 200.64665f, 159.9985f, 203.39636f, 160.0f, 206.4f),
                    PathNode.Close,
                    PathNode.MoveTo(251.17f, 120.65f),
                    PathNode.LineTo(224.67f, 109.22f),
                    PathNode.LineTo(222.36f, 79.38f),
                    PathNode.CurveTo(222.10394f, 76.131485f, 219.90315f, 73.362915f, 216.79611f, 72.3807f),
                    PathNode.CurveTo(213.68907f, 71.39849f, 210.2968f, 72.39896f, 208.22f, 74.91f),
                    PathNode.LineTo(189.63f, 97.42f),
                    PathNode.LineTo(161.92f, 90.57f),
                    PathNode.CurveTo(158.7964f, 89.801186f, 155.51613f, 90.97807f, 153.59372f, 93.55728f),
                    PathNode.CurveTo(151.67131f, 96.1365f, 151.48074f, 99.61629f, 153.11f, 102.39f),
                    PathNode.LineTo(168.18f, 128.0f),
                    PathNode.LineTo(153.11f, 153.61f),
                    PathNode.CurveTo(151.48074f, 156.38371f, 151.67131f, 159.86351f, 153.59372f, 162.44272f),
                    PathNode.CurveTo(155.51613f, 165.02193f, 158.7964f, 166.19882f, 161.92f, 165.43f),
                    PathNode.LineTo(189.63f, 158.58f),
                    PathNode.LineTo(208.22f, 181.09f),
                    PathNode.CurveTo(210.2968f, 183.60104f, 213.68907f, 184.6015f, 216.79611f, 183.6193f),
                    PathNode.CurveTo(219.90315f, 182.63708f, 222.10394f, 179.86852f, 222.36f, 176.62f),
                    PathNode.LineTo(224.67f, 146.78f),
                    PathNode.LineTo(251.17f, 135.35f),
                    PathNode.CurveTo(254.10753f, 134.08757f, 256.0113f, 131.19731f, 256.0113f, 128.0f),
                    PathNode.CurveTo(256.0113f, 124.80269f, 254.10753f, 121.91243f, 251.17f, 120.65f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _starAndCrescent!!
    }

private var _starAndCrescent: ImageVector? = null
