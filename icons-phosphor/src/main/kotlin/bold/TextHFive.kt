package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextHFive: ImageVector
    get() {
        if (_textHFive != null) return _textHFive!!
        _textHFive = phosphorBoldIcon(
            name = "TextHFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(252.0f, 180.0f),
                    PathNode.CurveTo(252.0f, 202.09138f, 234.09138f, 220.0f, 212.0f, 220.0f),
                    PathNode.CurveTo(201.29904f, 220.1602f, 190.99043f, 215.97469f, 183.43f, 208.4f),
                    PathNode.CurveTo(178.7908f, 203.66692f, 178.86691f, 196.0692f, 183.6f, 191.43f),
                    PathNode.CurveTo(188.33308f, 186.7908f, 195.9308f, 186.86691f, 200.57f, 191.6f),
                    PathNode.CurveTo(203.61702f, 194.56953f, 207.7483f, 196.15988f, 212.0f, 196.0f),
                    PathNode.CurveTo(220.83656f, 196.0f, 228.0f, 188.83656f, 228.0f, 180.0f),
                    PathNode.CurveTo(228.0f, 171.16344f, 220.83656f, 164.0f, 212.0f, 164.0f),
                    PathNode.CurveTo(207.7483f, 163.84012f, 203.61702f, 165.43047f, 200.57f, 168.4f),
                    PathNode.CurveTo(196.9006f, 172.15231f, 191.2185f, 173.08476f, 186.54231f, 170.702f),
                    PathNode.CurveTo(181.86615f, 168.31923f, 179.2809f, 163.17412f, 180.16f, 158.0f),
                    PathNode.LineTo(188.16f, 110.0f),
                    PathNode.CurveTo(189.13643f, 104.22334f, 194.1414f, 99.99617f, 200.0f, 100.0f),
                    PathNode.LineTo(240.0f, 100.0f),
                    PathNode.CurveTo(246.62741f, 100.0f, 252.0f, 105.37258f, 252.0f, 112.0f),
                    PathNode.CurveTo(252.0f, 118.62742f, 246.62741f, 124.0f, 240.0f, 124.0f),
                    PathNode.LineTo(210.17f, 124.0f),
                    PathNode.LineTo(207.46f, 140.23f),
                    PathNode.CurveTo(208.96854f, 140.07756f, 210.48378f, 140.0008f, 212.0f, 140.0f),
                    PathNode.CurveTo(234.09138f, 140.0f, 252.0f, 157.90862f, 252.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 44.0f),
                    PathNode.CurveTo(137.37259f, 44.0f, 132.0f, 49.37258f, 132.0f, 56.0f),
                    PathNode.LineTo(132.0f, 104.0f),
                    PathNode.LineTo(52.0f, 104.0f),
                    PathNode.LineTo(52.0f, 56.0f),
                    PathNode.CurveTo(52.0f, 49.37258f, 46.62742f, 44.0f, 40.0f, 44.0f),
                    PathNode.CurveTo(33.37258f, 44.0f, 28.0f, 49.37258f, 28.0f, 56.0f),
                    PathNode.LineTo(28.0f, 176.0f),
                    PathNode.CurveTo(28.0f, 182.62741f, 33.37258f, 188.0f, 40.0f, 188.0f),
                    PathNode.CurveTo(46.62742f, 188.0f, 52.0f, 182.62741f, 52.0f, 176.0f),
                    PathNode.LineTo(52.0f, 128.0f),
                    PathNode.LineTo(132.0f, 128.0f),
                    PathNode.LineTo(132.0f, 176.0f),
                    PathNode.CurveTo(132.0f, 182.62741f, 137.37259f, 188.0f, 144.0f, 188.0f),
                    PathNode.CurveTo(150.62741f, 188.0f, 156.0f, 182.62741f, 156.0f, 176.0f),
                    PathNode.LineTo(156.0f, 56.0f),
                    PathNode.CurveTo(156.0f, 49.37258f, 150.62741f, 44.0f, 144.0f, 44.0f),
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
        return _textHFive!!
    }

private var _textHFive: ImageVector? = null
