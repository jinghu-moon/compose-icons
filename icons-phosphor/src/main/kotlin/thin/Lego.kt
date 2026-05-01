package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Lego: ImageVector
    get() {
        if (_lego != null) return _lego!!
        _lego = phosphorThinIcon(
            name = "Lego",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(241.79f, 76.42f),
                    PathNode.LineTo(194.37f, 52.71f),
                    PathNode.CurveTo(189.84f, 42.92f, 176.36f, 36.0f, 160.0f, 36.0f),
                    PathNode.CurveTo(139.81f, 36.0f, 124.0f, 46.54f, 124.0f, 60.0f),
                    PathNode.CurveTo(124.01311f, 62.95025f, 124.76975f, 65.84959f, 126.2f, 68.43f),
                    PathNode.LineTo(101.65f, 80.7f),
                    PathNode.CurveTo(94.884834f, 77.506775f, 87.48024f, 75.89931f, 80.0f, 76.0f),
                    PathNode.CurveTo(59.81f, 76.0f, 44.0f, 86.54f, 44.0f, 100.0f),
                    PathNode.CurveTo(44.013103f, 102.95025f, 44.769753f, 105.84959f, 46.2f, 108.43f),
                    PathNode.LineTo(14.2f, 124.43f),
                    PathNode.CurveTo(12.851673f, 125.10943f, 12.000798f, 126.490166f, 12.0f, 128.0f),
                    PathNode.LineTo(12.0f, 192.0f),
                    PathNode.CurveTo(11.998915f, 193.51566f, 12.85457f, 194.90175f, 14.21f, 195.58f),
                    PathNode.LineTo(78.21f, 227.58f),
                    PathNode.CurveTo(79.33674f, 228.14381f, 80.66326f, 228.14381f, 81.79f, 227.58f),
                    PathNode.LineTo(241.79f, 147.58f),
                    PathNode.CurveTo(243.14543f, 146.90175f, 244.00108f, 145.51566f, 244.0f, 144.0f),
                    PathNode.LineTo(244.0f, 80.0f),
                    PathNode.CurveTo(244.00108f, 78.484344f, 243.14543f, 77.09826f, 241.79f, 76.42f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 44.0f),
                    PathNode.CurveTo(175.18f, 44.0f, 188.0f, 51.33f, 188.0f, 60.0f),
                    PathNode.CurveTo(188.0f, 68.67f, 175.18f, 76.0f, 160.0f, 76.0f),
                    PathNode.CurveTo(144.82f, 76.0f, 132.0f, 68.67f, 132.0f, 60.0f),
                    PathNode.CurveTo(132.0f, 51.33f, 144.82f, 44.0f, 160.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(131.43f, 74.76f),
                    PathNode.CurveTo(138.0f, 80.41f, 148.23f, 84.0f, 160.0f, 84.0f),
                    PathNode.CurveTo(179.0f, 84.0f, 194.09f, 74.68f, 195.83f, 62.39f),
                    PathNode.LineTo(231.06f, 80.0f),
                    PathNode.LineTo(80.0f, 155.53f),
                    PathNode.LineTo(24.94f, 128.0f),
                    PathNode.LineTo(51.43f, 114.76f),
                    PathNode.CurveTo(58.0f, 120.41f, 68.23f, 124.0f, 80.0f, 124.0f),
                    PathNode.CurveTo(100.19f, 124.0f, 116.0f, 113.46f, 116.0f, 100.0f),
                    PathNode.CurveTo(116.0f, 94.66f, 113.51f, 89.79f, 109.25f, 85.85f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 84.0f),
                    PathNode.CurveTo(95.18f, 84.0f, 108.0f, 91.33f, 108.0f, 100.0f),
                    PathNode.CurveTo(108.0f, 108.67f, 95.18f, 116.0f, 80.0f, 116.0f),
                    PathNode.CurveTo(69.51f, 116.0f, 60.15f, 112.5f, 55.37f, 107.48f),
                    PathNode.CurveTo(55.28f, 107.36f, 55.18f, 107.27f, 55.09f, 107.17f),
                    PathNode.CurveTo(53.193684f, 105.2545f, 52.090153f, 102.693886f, 52.0f, 100.0f),
                    PathNode.CurveTo(52.0f, 91.33f, 64.82f, 84.0f, 80.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(20.0f, 134.47f),
                    PathNode.LineTo(76.0f, 162.47f),
                    PathNode.LineTo(76.0f, 217.53f),
                    PathNode.LineTo(20.0f, 189.53f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 217.53f),
                    PathNode.LineTo(84.0f, 162.47f),
                    PathNode.LineTo(236.0f, 86.47f),
                    PathNode.LineTo(236.0f, 141.53f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _lego!!
    }

private var _lego: ImageVector? = null
