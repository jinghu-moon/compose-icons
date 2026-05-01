package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowsClockwise: ImageVector
    get() {
        if (_arrowsClockwise != null) return _arrowsClockwise!!
        _arrowsClockwise = phosphorRegularIcon(
            name = "ArrowsClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(224.0f, 96.0f),
                    PathNode.CurveTo(224.0f, 100.41828f, 220.41827f, 104.0f, 216.0f, 104.0f),
                    PathNode.LineTo(168.0f, 104.0f),
                    PathNode.CurveTo(163.58173f, 104.0f, 160.0f, 100.41828f, 160.0f, 96.0f),
                    PathNode.CurveTo(160.0f, 91.58172f, 163.58173f, 88.0f, 168.0f, 88.0f),
                    PathNode.LineTo(196.69f, 88.0f),
                    PathNode.LineTo(182.06f, 73.37f),
                    PathNode.CurveTo(167.1917f, 58.434048f, 147.00475f, 50.007538f, 125.93f, 49.94f),
                    PathNode.LineTo(125.48f, 49.94f),
                    PathNode.CurveTo(104.58173f, 49.891014f, 84.50417f, 58.070763f, 69.59f, 72.71f),
                    PathNode.CurveTo(66.412415f, 75.676315f, 61.44764f, 75.56243f, 58.409405f, 72.45354f),
                    PathNode.CurveTo(55.371166f, 69.34464f, 55.371433f, 64.37857f, 58.41f, 61.27f),
                    PathNode.CurveTo(96.02728f, 24.504456f, 156.22557f, 24.856728f, 193.41f, 62.06f),
                    PathNode.LineTo(208.0f, 76.69f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.CurveTo(208.0f, 43.581722f, 211.58173f, 40.0f, 216.0f, 40.0f),
                    PathNode.CurveTo(220.41827f, 40.0f, 224.0f, 43.581722f, 224.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(186.41f, 183.29f),
                    PathNode.CurveTo(155.06544f, 213.9077f, 104.923065f, 213.61345f, 73.94f, 182.63f),
                    PathNode.LineTo(59.31f, 168.0f),
                    PathNode.LineTo(88.0f, 168.0f),
                    PathNode.CurveTo(92.41828f, 168.0f, 96.0f, 164.41827f, 96.0f, 160.0f),
                    PathNode.CurveTo(96.0f, 155.58173f, 92.41828f, 152.0f, 88.0f, 152.0f),
                    PathNode.LineTo(40.0f, 152.0f),
                    PathNode.CurveTo(35.581722f, 152.0f, 32.0f, 155.58173f, 32.0f, 160.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 212.41827f, 35.581722f, 216.0f, 40.0f, 216.0f),
                    PathNode.CurveTo(44.418278f, 216.0f, 48.0f, 212.41827f, 48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 179.31f),
                    PathNode.LineTo(62.63f, 193.94f),
                    PathNode.CurveTo(80.47212f, 211.87193f, 104.70395f, 221.9862f, 130.0f, 222.06f),
                    PathNode.LineTo(130.53f, 222.06f),
                    PathNode.CurveTo(155.61081f, 222.12462f, 179.70734f, 212.30565f, 197.6f, 194.73f),
                    PathNode.CurveTo(200.63857f, 191.62143f, 200.63882f, 186.65535f, 197.6006f, 183.54646f),
                    PathNode.CurveTo(194.56236f, 180.43759f, 189.5976f, 180.32368f, 186.42f, 183.29f),
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
        return _arrowsClockwise!!
    }

private var _arrowsClockwise: ImageVector? = null
