package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TShirt: ImageVector
    get() {
        if (_tShirt != null) return _tShirt!!
        _tShirt = phosphorBoldIcon(
            name = "TShirt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(246.17f, 57.9f),
                    PathNode.LineTo(198.09f, 29.65f),
                    PathNode.LineTo(198.09f, 29.65f),
                    PathNode.CurveTo(196.24544f, 28.562046f, 194.14148f, 27.992008f, 192.0f, 28.0f),
                    PathNode.LineTo(160.0f, 28.0f),
                    PathNode.CurveTo(153.37259f, 28.0f, 148.0f, 33.37258f, 148.0f, 40.0f),
                    PathNode.CurveTo(148.0f, 51.045696f, 139.0457f, 60.0f, 128.0f, 60.0f),
                    PathNode.CurveTo(116.95431f, 60.0f, 108.0f, 51.045696f, 108.0f, 40.0f),
                    PathNode.CurveTo(108.0f, 33.37258f, 102.62742f, 28.0f, 96.0f, 28.0f),
                    PathNode.LineTo(64.0f, 28.0f),
                    PathNode.CurveTo(61.86437f, 27.998632f, 59.76772f, 28.572016f, 57.93f, 29.66f),
                    PathNode.LineTo(57.93f, 29.66f),
                    PathNode.LineTo(9.83f, 57.9f),
                    PathNode.CurveTo(0.853449f, 63.258465f, -2.544572f, 74.5852f, 2.0f, 84.0f),
                    PathNode.LineTo(19.9f, 120.8f),
                    PathNode.CurveTo(23.157808f, 127.65671f, 30.078732f, 132.0188f, 37.67f, 132.0f),
                    PathNode.LineTo(52.0f, 132.0f),
                    PathNode.LineTo(52.0f, 208.0f),
                    PathNode.CurveTo(52.0f, 219.0457f, 60.954304f, 228.0f, 72.0f, 228.0f),
                    PathNode.LineTo(184.0f, 228.0f),
                    PathNode.CurveTo(195.0457f, 228.0f, 204.0f, 219.0457f, 204.0f, 208.0f),
                    PathNode.LineTo(204.0f, 132.0f),
                    PathNode.LineTo(218.32f, 132.0f),
                    PathNode.CurveTo(225.8958f, 132.01167f, 232.80284f, 127.66509f, 236.07f, 120.83f),
                    PathNode.LineTo(254.0f, 84.0f),
                    PathNode.CurveTo(258.5446f, 74.5852f, 255.14655f, 63.258465f, 246.17f, 57.9f),
                    PathNode.Close,
                    PathNode.MoveTo(40.37f, 108.0f),
                    PathNode.LineTo(25.16f, 76.73f),
                    PathNode.LineTo(52.0f, 61.0f),
                    PathNode.LineTo(52.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 204.0f),
                    PathNode.LineTo(76.0f, 204.0f),
                    PathNode.LineTo(76.0f, 52.0f),
                    PathNode.LineTo(85.67f, 52.0f),
                    PathNode.CurveTo(91.027336f, 70.946976f, 108.32018f, 84.02818f, 128.01f, 84.02818f),
                    PathNode.CurveTo(147.69981f, 84.02818f, 164.99266f, 70.946976f, 170.35f, 52.0f),
                    PathNode.LineTo(180.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(215.62f, 108.0f),
                    PathNode.LineTo(204.0f, 108.0f),
                    PathNode.LineTo(204.0f, 61.0f),
                    PathNode.LineTo(230.83f, 76.76f),
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
        return _tShirt!!
    }

private var _tShirt: ImageVector? = null
