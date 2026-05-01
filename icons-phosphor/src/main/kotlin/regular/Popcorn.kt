package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Popcorn: ImageVector
    get() {
        if (_popcorn != null) return _popcorn!!
        _popcorn = phosphorRegularIcon(
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
                    PathNode.MoveTo(76.0f, 56.0f),
                    PathNode.CurveTo(80.572174f, 55.987232f, 85.07631f, 57.107258f, 89.11f, 59.26f),
                    PathNode.CurveTo(91.31742f, 60.430878f, 93.94515f, 60.5031f, 96.21356f, 59.45524f),
                    PathNode.CurveTo(98.48197f, 58.407375f, 100.13048f, 56.359795f, 100.67f, 53.92f),
                    PathNode.CurveTo(103.52251f, 41.115913f, 114.88202f, 32.008606f, 128.0f, 32.008606f),
                    PathNode.CurveTo(141.11798f, 32.008606f, 152.4775f, 41.115913f, 155.33f, 53.92f),
                    PathNode.CurveTo(155.86952f, 56.359795f, 157.51804f, 58.407375f, 159.78644f, 59.45524f),
                    PathNode.CurveTo(162.05486f, 60.5031f, 164.68257f, 60.430878f, 166.89f, 59.26f),
                    PathNode.CurveTo(174.39069f, 55.2813f, 183.29155f, 54.92097f, 191.0893f, 58.280357f),
                    PathNode.CurveTo(198.88702f, 61.639744f, 204.73923f, 68.35592f, 207.0f, 76.54f),
                    PathNode.LineTo(168.44f, 87.54f),
                    PathNode.LineTo(133.95f, 73.74f),
                    PathNode.CurveTo(130.13675f, 72.21537f, 125.883255f, 72.21537f, 122.07f, 73.74f),
                    PathNode.LineTo(87.57f, 87.56f),
                    PathNode.LineTo(49.0f, 76.54f),
                    PathNode.CurveTo(52.35577f, 64.39986f, 63.404594f, 55.99457f, 76.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(70.34f, 208.0f),
                    PathNode.LineTo(42.91f, 91.44f),
                    PathNode.LineTo(80.76f, 102.25f),
                    PathNode.LineTo(94.86f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(145.0f, 208.0f),
                    PathNode.LineTo(111.0f, 208.0f),
                    PathNode.LineTo(96.75f, 101.12f),
                    PathNode.LineTo(128.0f, 88.62f),
                    PathNode.LineTo(159.25f, 101.12f),
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
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _popcorn!!
    }

private var _popcorn: ImageVector? = null
