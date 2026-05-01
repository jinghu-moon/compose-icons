package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FlipHorizontal: ImageVector
    get() {
        if (_flipHorizontal != null) return _flipHorizontal!!
        _flipHorizontal = phosphorRegularIcon(
            name = "FlipHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(107.18f, 24.33f),
                    PathNode.CurveTo(99.71092f, 22.757504f, 92.18115f, 26.728283f, 89.26f, 33.78f),
                    PathNode.LineTo(89.2f, 33.92f),
                    PathNode.LineTo(25.2f, 193.85f),
                    PathNode.CurveTo(23.142014f, 198.79277f, 23.692715f, 204.43732f, 26.667265f, 208.88908f),
                    PathNode.CurveTo(29.641813f, 213.34087f, 34.645924f, 216.00977f, 40.0f, 216.0f),
                    PathNode.LineTo(104.0f, 216.0f),
                    PathNode.CurveTo(112.836555f, 216.0f, 120.0f, 208.83656f, 120.0f, 200.0f),
                    PathNode.LineTo(120.0f, 40.0f),
                    PathNode.CurveTo(120.054016f, 32.372314f, 114.66724f, 25.788008f, 107.18f, 24.33f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 200.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(40.06f, 199.85f),
                    PathNode.LineTo(104.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(230.77f, 193.85f),
                    PathNode.LineTo(166.77f, 33.92f),
                    PathNode.LineTo(166.71f, 33.78f),
                    PathNode.CurveTo(163.72656f, 26.806896f, 156.25726f, 22.886538f, 148.82368f, 24.392136f),
                    PathNode.CurveTo(141.39009f, 25.897732f, 136.03494f, 32.415554f, 136.0f, 40.0f),
                    PathNode.LineTo(136.0f, 200.0f),
                    PathNode.CurveTo(136.0f, 208.83656f, 143.16344f, 216.0f, 152.0f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(221.35054f, 216.00307f, 226.34848f, 213.33144f, 229.31827f, 208.88075f),
                    PathNode.CurveTo(232.28807f, 204.43007f, 232.83661f, 198.78949f, 230.78f, 193.85f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 200.0f),
                    PathNode.LineTo(152.0f, 40.0f),
                    PathNode.LineTo(215.93f, 199.84f),
                    PathNode.LineTo(215.99f, 199.99f),
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
        return _flipHorizontal!!
    }

private var _flipHorizontal: ImageVector? = null
