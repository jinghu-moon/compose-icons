package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberCircleNine: ImageVector
    get() {
        if (_numberCircleNine != null) return _numberCircleNine!!
        _numberCircleNine = phosphorBoldIcon(
            name = "NumberCircleNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(81.60808f, 212.0f, 44.0f, 174.39192f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 81.60808f, 81.60808f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(174.39192f, 44.0f, 212.0f, 81.60808f, 212.0f, 128.0f),
                    PathNode.CurveTo(211.9504f, 174.37135f, 174.37135f, 211.9504f, 128.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 73.36f),
                    PathNode.CurveTo(133.97194f, 65.261284f, 116.4444f, 66.42226f, 103.607086f, 76.30046f),
                    PathNode.CurveTo(90.769775f, 86.178665f, 85.15718f, 102.82384f, 89.391785f, 118.45853f),
                    PathNode.CurveTo(93.62639f, 134.09322f, 106.872154f, 145.63066f, 122.94f, 147.68f),
                    PathNode.LineTo(109.7f, 169.85f),
                    PathNode.CurveTo(107.374435f, 173.53531f, 107.22952f, 178.19171f, 109.32142f, 182.0145f),
                    PathNode.CurveTo(111.41332f, 185.8373f, 115.413216f, 188.22559f, 119.77085f, 188.25372f),
                    PathNode.CurveTo(124.12849f, 188.28188f, 128.15889f, 185.94545f, 130.3f, 182.15f),
                    PathNode.LineTo(162.64f, 128.0f),
                    PathNode.CurveTo(173.68518f, 108.86879f, 167.13072f, 84.40601f, 148.0f, 73.36f),
                    PathNode.Close,
                    PathNode.MoveTo(141.86f, 116.0f),
                    PathNode.LineTo(141.86f, 116.0f),
                    PathNode.CurveTo(137.4415f, 123.65162f, 127.6571f, 126.273155f, 120.004906f, 121.855644f),
                    PathNode.CurveTo(112.35272f, 117.43813f, 109.72991f, 107.654076f, 114.14643f, 100.00131f),
                    PathNode.CurveTo(118.56294f, 92.34855f, 128.34666f, 89.72447f, 136.0f, 94.14f),
                    PathNode.CurveTo(143.64888f, 98.563995f, 146.26347f, 108.350815f, 141.84f, 116.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _numberCircleNine!!
    }

private var _numberCircleNine: ImageVector? = null
