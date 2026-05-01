package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GenderNonbinary: ImageVector
    get() {
        if (_genderNonbinary != null) return _genderNonbinary!!
        _genderNonbinary = phosphorFillIcon(
            name = "GenderNonbinary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 24.0f),
                    PathNode.LineTo(56.0f, 24.0f),
                    PathNode.CurveTo(47.163445f, 24.0f, 40.0f, 31.163445f, 40.0f, 40.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(40.0f, 224.83656f, 47.163445f, 232.0f, 56.0f, 232.0f),
                    PathNode.LineTo(200.0f, 232.0f),
                    PathNode.CurveTo(208.83656f, 232.0f, 216.0f, 224.83656f, 216.0f, 216.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(216.0f, 31.163445f, 208.83656f, 24.0f, 200.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 208.0f),
                    PathNode.CurveTo(100.83958f, 207.99689f, 78.2565f, 187.09146f, 76.16097f, 160.012f),
                    PathNode.CurveTo(74.065445f, 132.93253f, 93.163414f, 108.80164f, 120.0f, 104.62f),
                    PathNode.LineTo(120.0f, 83.82f),
                    PathNode.LineTo(91.0f, 95.43f),
                    PathNode.CurveTo(86.89652f, 97.08685f, 82.22685f, 95.10348f, 80.57f, 91.0f),
                    PathNode.CurveTo(78.91315f, 86.89652f, 80.89652f, 82.22685f, 85.0f, 80.57f),
                    PathNode.LineTo(106.46f, 72.0f),
                    PathNode.LineTo(85.0f, 63.43f),
                    PathNode.CurveTo(80.89652f, 61.773148f, 78.91315f, 57.103477f, 80.57f, 53.0f),
                    PathNode.CurveTo(82.22685f, 48.896523f, 86.89652f, 46.913147f, 91.0f, 48.57f),
                    PathNode.LineTo(128.0f, 63.38f),
                    PathNode.LineTo(165.0f, 48.57f),
                    PathNode.CurveTo(169.10347f, 46.913147f, 173.77315f, 48.896523f, 175.43f, 53.0f),
                    PathNode.CurveTo(177.08685f, 57.103477f, 175.10347f, 61.773148f, 171.0f, 63.43f),
                    PathNode.LineTo(149.54f, 72.0f),
                    PathNode.LineTo(171.0f, 80.57f),
                    PathNode.CurveTo(175.10347f, 82.22685f, 177.08685f, 86.89652f, 175.43f, 91.0f),
                    PathNode.CurveTo(173.77315f, 95.10348f, 169.10347f, 97.08685f, 165.0f, 95.43f),
                    PathNode.LineTo(136.0f, 83.82f),
                    PathNode.LineTo(136.0f, 104.62f),
                    PathNode.CurveTo(162.8366f, 108.80164f, 181.93456f, 132.93253f, 179.83904f, 160.012f),
                    PathNode.CurveTo(177.7435f, 187.09146f, 155.16042f, 207.99689f, 128.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 156.0f),
                    PathNode.CurveTo(164.0f, 175.88223f, 147.88223f, 192.0f, 128.0f, 192.0f),
                    PathNode.CurveTo(108.11775f, 192.0f, 92.0f, 175.88223f, 92.0f, 156.0f),
                    PathNode.CurveTo(92.0f, 136.11777f, 108.11775f, 120.0f, 128.0f, 120.0f),
                    PathNode.CurveTo(147.88223f, 120.0f, 164.0f, 136.11777f, 164.0f, 156.0f),
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
        return _genderNonbinary!!
    }

private var _genderNonbinary: ImageVector? = null
