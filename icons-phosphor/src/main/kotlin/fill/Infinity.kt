package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Infinity: ImageVector
    get() {
        if (_infinity != null) return _infinity!!
        _infinity = phosphorFillIcon(
            name = "Infinity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(224.83656f, 216.0f, 232.0f, 208.83656f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.28f, 156.28f),
                    PathNode.CurveTo(188.7253f, 171.83607f, 163.5282f, 171.91202f, 147.88f, 156.45f),
                    PathNode.LineTo(97.29f, 111.34f),
                    PathNode.LineTo(97.0f, 111.0f),
                    PathNode.CurveTo(87.61884f, 101.65136f, 72.438034f, 101.66893f, 63.078545f, 111.03926f),
                    PathNode.CurveTo(53.71905f, 120.40959f, 53.71905f, 135.59042f, 63.078545f, 144.96074f),
                    PathNode.CurveTo(72.438034f, 154.33107f, 87.61884f, 154.34866f, 97.0f, 145.0f),
                    PathNode.CurveTo(97.36f, 144.64f, 97.71f, 144.27f, 98.0f, 143.9f),
                    PathNode.CurveTo(100.92711f, 140.58629f, 105.98629f, 140.2729f, 109.3f, 143.2f),
                    PathNode.CurveTo(112.61371f, 146.1271f, 112.92711f, 151.1863f, 110.0f, 154.5f),
                    PathNode.CurveTo(109.45f, 155.12f, 108.87f, 155.73f, 108.29f, 156.31f),
                    PathNode.CurveTo(92.69219f, 171.91199f, 67.40722f, 171.9395f, 51.775497f, 156.37149f),
                    PathNode.CurveTo(36.143776f, 140.8035f, 36.068005f, 115.518616f, 51.606144f, 99.857216f),
                    PathNode.CurveTo(67.14429f, 84.19581f, 92.42897f, 84.07178f, 108.12f, 99.58f),
                    PathNode.LineTo(158.7f, 144.69f),
                    PathNode.LineTo(159.03f, 145.0f),
                    PathNode.CurveTo(168.4194f, 154.34035f, 183.60019f, 154.30939f, 192.9514f, 144.9308f),
                    PathNode.CurveTo(202.30263f, 135.55222f, 202.28923f, 120.37141f, 192.92148f, 111.00934f),
                    PathNode.CurveTo(183.55373f, 101.64727f, 168.37291f, 101.64309f, 159.0f, 111.0f),
                    PathNode.CurveTo(158.64f, 111.36f, 158.3f, 111.72f, 158.0f, 112.1f),
                    PathNode.CurveTo(155.07565f, 115.41371f, 150.0187f, 115.72935f, 146.705f, 112.805f),
                    PathNode.CurveTo(143.3913f, 109.88065f, 143.07565f, 104.82371f, 146.0f, 101.51f),
                    PathNode.CurveTo(146.54f, 100.89f, 147.12f, 100.27f, 147.71f, 99.69f),
                    PathNode.CurveTo(163.3786f, 84.36552f, 188.46141f, 84.50365f, 203.96028f, 99.99978f),
                    PathNode.CurveTo(219.45915f, 115.49591f, 219.60172f, 140.57869f, 204.28f, 156.25f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _infinity!!
    }

private var _infinity: ImageVector? = null
