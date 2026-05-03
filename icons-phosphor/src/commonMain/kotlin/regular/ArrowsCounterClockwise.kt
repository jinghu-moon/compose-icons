package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowsCounterClockwise: ImageVector
    get() {
        if (_arrowsCounterClockwise != null) return _arrowsCounterClockwise!!
        _arrowsCounterClockwise = phosphorRegularIcon(
            name = "ArrowsCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(88.0f, 104.0f),
                    PathNode.LineTo(40.0f, 104.0f),
                    PathNode.CurveTo(35.581722f, 104.0f, 32.0f, 100.41828f, 32.0f, 96.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(32.0f, 43.581722f, 35.581722f, 40.0f, 40.0f, 40.0f),
                    PathNode.CurveTo(44.418278f, 40.0f, 48.0f, 43.581722f, 48.0f, 48.0f),
                    PathNode.LineTo(48.0f, 76.69f),
                    PathNode.LineTo(62.63f, 62.06f),
                    PathNode.CurveTo(80.47212f, 44.12807f, 104.70395f, 34.01379f, 130.0f, 33.94f),
                    PathNode.LineTo(130.53f, 33.94f),
                    PathNode.CurveTo(155.61081f, 33.875385f, 179.70734f, 43.69435f, 197.6f, 61.27f),
                    PathNode.CurveTo(200.63857f, 64.37857f, 200.63882f, 69.34464f, 197.6006f, 72.45354f),
                    PathNode.CurveTo(194.56236f, 75.56243f, 189.5976f, 75.676315f, 186.42f, 72.71f),
                    PathNode.CurveTo(171.50583f, 58.070763f, 151.42827f, 49.891014f, 130.53f, 49.94f),
                    PathNode.LineTo(130.08f, 49.94f),
                    PathNode.CurveTo(109.00179f, 50.004887f, 88.81076f, 58.431602f, 73.94f, 73.37f),
                    PathNode.LineTo(59.31f, 88.0f),
                    PathNode.LineTo(88.0f, 88.0f),
                    PathNode.CurveTo(92.41828f, 88.0f, 96.0f, 91.58172f, 96.0f, 96.0f),
                    PathNode.CurveTo(96.0f, 100.41828f, 92.41828f, 104.0f, 88.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 152.0f),
                    PathNode.LineTo(168.0f, 152.0f),
                    PathNode.CurveTo(163.58173f, 152.0f, 160.0f, 155.58173f, 160.0f, 160.0f),
                    PathNode.CurveTo(160.0f, 164.41827f, 163.58173f, 168.0f, 168.0f, 168.0f),
                    PathNode.LineTo(196.69f, 168.0f),
                    PathNode.LineTo(182.06f, 182.63f),
                    PathNode.CurveTo(167.1917f, 197.56595f, 147.00475f, 205.99246f, 125.93f, 206.06f),
                    PathNode.LineTo(125.48f, 206.06f),
                    PathNode.CurveTo(104.58173f, 206.10898f, 84.50417f, 197.92924f, 69.59f, 183.29f),
                    PathNode.CurveTo(67.56164f, 181.2149f, 64.56865f, 180.40086f, 61.76868f, 181.16273f),
                    PathNode.CurveTo(58.968716f, 181.92459f, 56.800823f, 184.1429f, 56.103516f, 186.95964f),
                    PathNode.CurveTo(55.40621f, 189.77638f, 56.288834f, 192.74988f, 58.41f, 194.73f),
                    PathNode.CurveTo(76.30267f, 212.30565f, 100.39919f, 222.12462f, 125.48f, 222.06f),
                    PathNode.LineTo(126.0f, 222.06f),
                    PathNode.CurveTo(151.29259f, 221.98357f, 175.52032f, 211.86949f, 193.36f, 193.94f),
                    PathNode.LineTo(208.0f, 179.31f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.CurveTo(208.0f, 212.41827f, 211.58173f, 216.0f, 216.0f, 216.0f),
                    PathNode.CurveTo(220.41827f, 216.0f, 224.0f, 212.41827f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 160.0f),
                    PathNode.CurveTo(224.0f, 155.58173f, 220.41827f, 152.0f, 216.0f, 152.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowsCounterClockwise!!
    }

private var _arrowsCounterClockwise: ImageVector? = null
