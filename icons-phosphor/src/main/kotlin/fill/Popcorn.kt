package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Popcorn: ImageVector
    get() {
        if (_popcorn != null) return _popcorn!!
        _popcorn = phosphorFillIcon(
            name = "Popcorn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(229.52f, 74.21f),
                    PathNode.CurveTo(227.61351f, 72.417274f, 224.95073f, 71.67035f, 222.39f, 72.21f),
                    PathNode.CurveTo(219.25252f, 60.931393f, 211.74974f, 51.3681f, 201.54196f, 45.636433f),
                    PathNode.CurveTo(191.33418f, 39.904762f, 179.2631f, 38.47732f, 168.0f, 41.67f),
                    PathNode.CurveTo(160.83228f, 26.028755f, 145.20538f, 16.000303f, 128.0f, 16.000303f),
                    PathNode.CurveTo(110.79463f, 16.000303f, 95.16772f, 26.028755f, 88.0f, 41.67f),
                    PathNode.CurveTo(76.739586f, 38.473194f, 64.66949f, 39.895016f, 54.460136f, 45.620884f),
                    PathNode.CurveTo(44.250786f, 51.346756f, 36.743786f, 60.904667f, 33.6f, 72.18f),
                    PathNode.CurveTo(30.929375f, 71.63194f, 28.163494f, 72.48164f, 26.261187f, 74.43455f),
                    PathNode.CurveTo(24.358877f, 76.38745f, 23.58205f, 79.174675f, 24.2f, 81.83f),
                    PathNode.LineTo(54.76f, 211.67f),
                    PathNode.CurveTo(56.46316f, 218.89725f, 62.914776f, 224.00305f, 70.34f, 224.0f),
                    PathNode.LineTo(185.66f, 224.0f),
                    PathNode.CurveTo(193.08522f, 224.00305f, 199.53683f, 218.89725f, 201.24f, 211.67f),
                    PathNode.LineTo(231.79f, 81.83f),
                    PathNode.CurveTo(232.43845f, 79.06716f, 231.57466f, 76.16758f, 229.52f, 74.21f),
                    PathNode.Close,
                    PathNode.MoveTo(70.34f, 208.0f),
                    PathNode.LineTo(42.91f, 91.44f),
                    PathNode.LineTo(80.76f, 102.25f),
                    PathNode.LineTo(94.86f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(122.06f, 73.76f),
                    PathNode.LineTo(87.57f, 87.56f),
                    PathNode.LineTo(49.0f, 76.54f),
                    PathNode.CurveTo(51.26149f, 68.35879f, 57.112034f, 61.64506f, 64.907104f, 58.285988f),
                    PathNode.CurveTo(72.70218f, 54.926914f, 81.60019f, 55.28515f, 89.1f, 59.26f),
                    PathNode.CurveTo(91.30743f, 60.430878f, 93.93516f, 60.5031f, 96.20356f, 59.45524f),
                    PathNode.CurveTo(98.47197f, 58.407375f, 100.12048f, 56.359795f, 100.66f, 53.92f),
                    PathNode.CurveTo(103.512505f, 41.115913f, 114.87202f, 32.008606f, 127.99f, 32.008606f),
                    PathNode.CurveTo(141.10799f, 32.008606f, 152.4675f, 41.115913f, 155.32f, 53.92f),
                    PathNode.CurveTo(155.85953f, 56.359795f, 157.50803f, 58.407375f, 159.77644f, 59.45524f),
                    PathNode.CurveTo(162.04485f, 60.5031f, 164.67258f, 60.430878f, 166.88f, 59.26f),
                    PathNode.CurveTo(174.38155f, 55.27745f, 183.28528f, 54.91503f, 191.08568f, 58.274727f),
                    PathNode.CurveTo(198.8861f, 61.634422f, 204.73994f, 68.35305f, 207.0f, 76.54f),
                    PathNode.LineTo(168.44f, 87.54f),
                    PathNode.LineTo(133.95f, 73.74f),
                    PathNode.CurveTo(130.13124f, 72.21912f, 125.87363f, 72.22628f, 122.06f, 73.76f),
                    PathNode.Close,
                    PathNode.MoveTo(185.66f, 208.0f),
                    PathNode.LineTo(161.14f, 208.0f),
                    PathNode.LineTo(175.24f, 102.25f),
                    PathNode.LineTo(213.09f, 91.44f),
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
        return _popcorn!!
    }

private var _popcorn: ImageVector? = null
