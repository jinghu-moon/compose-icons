package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FalloutShelter: ImageVector
    get() {
        if (_falloutShelter != null) return _falloutShelter!!
        _falloutShelter = phosphorFillIcon(
            name = "FalloutShelter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(231.94f, 124.55f),
                    PathNode.CurveTo(230.17f, 70.06f, 185.94f, 25.83f, 131.45f, 24.06f),
                    PathNode.CurveTo(102.694214f, 23.132933f, 74.83718f, 34.149223f, 54.493202f, 54.493202f),
                    PathNode.CurveTo(34.149223f, 74.83718f, 23.132933f, 102.694214f, 24.06f, 131.45f),
                    PathNode.CurveTo(25.83f, 185.94f, 70.06f, 230.17f, 124.55f, 231.94f),
                    PathNode.CurveTo(153.30579f, 232.86707f, 181.16281f, 221.85077f, 201.50679f, 201.50679f),
                    PathNode.CurveTo(221.85077f, 181.16281f, 232.86707f, 153.30579f, 231.94f, 124.55f),
                    PathNode.Close,
                    PathNode.MoveTo(198.38f, 141.47f),
                    PathNode.LineTo(174.93f, 174.3f),
                    PathNode.CurveTo(173.3304f, 176.53656f, 170.74971f, 177.86365f, 168.0f, 177.86365f),
                    PathNode.CurveTo(165.25029f, 177.86365f, 162.6696f, 176.53656f, 161.07f, 174.3f),
                    PathNode.LineTo(128.0f, 128.0f),
                    PathNode.LineTo(94.93f, 174.3f),
                    PathNode.CurveTo(93.3304f, 176.53656f, 90.74972f, 177.86365f, 88.0f, 177.86365f),
                    PathNode.CurveTo(85.25028f, 177.86365f, 82.6696f, 176.53656f, 81.07f, 174.3f),
                    PathNode.LineTo(57.62f, 141.47f),
                    PathNode.CurveTo(55.76654f, 138.87346f, 55.518944f, 135.45903f, 56.9784f, 132.62225f),
                    PathNode.CurveTo(58.437855f, 129.78548f, 61.35981f, 128.0017f, 64.55f, 128.0f),
                    PathNode.LineTo(128.0f, 128.0f),
                    PathNode.LineTo(97.62f, 85.47f),
                    PathNode.CurveTo(95.76654f, 82.87346f, 95.51894f, 79.45903f, 96.9784f, 76.62225f),
                    PathNode.CurveTo(98.43786f, 73.78547f, 101.35981f, 72.0017f, 104.55f, 72.0f),
                    PathNode.LineTo(151.45f, 72.0f),
                    PathNode.CurveTo(154.6402f, 72.0017f, 157.56215f, 73.78547f, 159.0216f, 76.62225f),
                    PathNode.CurveTo(160.48105f, 79.45903f, 160.23346f, 82.87346f, 158.38f, 85.47f),
                    PathNode.LineTo(128.0f, 128.0f),
                    PathNode.LineTo(191.45f, 128.0f),
                    PathNode.CurveTo(194.6402f, 128.0017f, 197.56215f, 129.78548f, 199.0216f, 132.62225f),
                    PathNode.CurveTo(200.48105f, 135.45903f, 200.23346f, 138.87346f, 198.38f, 141.47f),
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
        return _falloutShelter!!
    }

private var _falloutShelter: ImageVector? = null
