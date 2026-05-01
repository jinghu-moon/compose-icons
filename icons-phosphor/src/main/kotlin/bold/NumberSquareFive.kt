package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberSquareFive: ImageVector
    get() {
        if (_numberSquareFive != null) return _numberSquareFive!!
        _numberSquareFive = phosphorBoldIcon(
            name = "NumberSquareFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 28.0f),
                    PathNode.LineTo(48.0f, 28.0f),
                    PathNode.CurveTo(36.954304f, 28.0f, 28.0f, 36.954304f, 28.0f, 48.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(208.0f, 228.0f),
                    PathNode.CurveTo(219.0457f, 228.0f, 228.0f, 219.0457f, 228.0f, 208.0f),
                    PathNode.LineTo(228.0f, 48.0f),
                    PathNode.CurveTo(228.0f, 36.954304f, 219.0457f, 28.0f, 208.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 52.0f),
                    PathNode.LineTo(204.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.16f, 126.0f),
                    PathNode.LineTo(100.16f, 78.0f),
                    PathNode.CurveTo(101.13643f, 72.22334f, 106.141396f, 67.99617f, 112.0f, 68.0f),
                    PathNode.LineTo(152.0f, 68.0f),
                    PathNode.CurveTo(158.62741f, 68.0f, 164.0f, 73.37258f, 164.0f, 80.0f),
                    PathNode.CurveTo(164.0f, 86.62742f, 158.62741f, 92.0f, 152.0f, 92.0f),
                    PathNode.LineTo(122.17f, 92.0f),
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
        return _numberSquareFive!!
    }

private var _numberSquareFive: ImageVector? = null
