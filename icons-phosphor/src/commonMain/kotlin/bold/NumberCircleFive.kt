package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberCircleFive: ImageVector
    get() {
        if (_numberCircleFive != null) return _numberCircleFive!!
        _numberCircleFive = phosphorBoldIcon(
            name = "NumberCircleFive",
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
                    PathNode.MoveTo(122.17f, 92.0f),
                    PathNode.LineTo(119.46f, 108.23f),
                    PathNode.CurveTo(120.968544f, 108.07755f, 122.48377f, 108.00079f, 124.0f, 108.0f),
                    PathNode.CurveTo(146.09138f, 108.0f, 164.0f, 125.90861f, 164.0f, 148.0f),
                    PathNode.CurveTo(164.0f, 170.09138f, 146.09138f, 188.0f, 124.0f, 188.0f),
                    PathNode.CurveTo(113.29905f, 188.1602f, 102.990425f, 183.97469f, 95.43f, 176.4f),
                    PathNode.CurveTo(90.79081f, 171.66692f, 90.86692f, 164.0692f, 95.6f, 159.43f),
                    PathNode.CurveTo(100.33308f, 154.7908f, 107.93081f, 154.86691f, 112.57f, 159.6f),
                    PathNode.CurveTo(115.61702f, 162.56953f, 119.748314f, 164.15988f, 124.0f, 164.0f),
                    PathNode.CurveTo(132.83656f, 164.0f, 140.0f, 156.83656f, 140.0f, 148.0f),
                    PathNode.CurveTo(140.0f, 139.16344f, 132.83656f, 132.0f, 124.0f, 132.0f),
                    PathNode.CurveTo(119.748314f, 131.84012f, 115.61702f, 133.43047f, 112.57f, 136.4f),
                    PathNode.CurveTo(108.900604f, 140.15231f, 103.21851f, 141.08476f, 98.54233f, 138.702f),
                    PathNode.CurveTo(93.86614f, 136.31923f, 91.2809f, 131.17412f, 92.16f, 126.0f),
                    PathNode.LineTo(100.16f, 78.0f),
                    PathNode.CurveTo(101.13643f, 72.22334f, 106.141396f, 67.99617f, 112.0f, 68.0f),
                    PathNode.LineTo(152.0f, 68.0f),
                    PathNode.CurveTo(158.62741f, 68.0f, 164.0f, 73.37258f, 164.0f, 80.0f),
                    PathNode.CurveTo(164.0f, 86.62742f, 158.62741f, 92.0f, 152.0f, 92.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _numberCircleFive!!
    }

private var _numberCircleFive: ImageVector? = null
