package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberSquareOne: ImageVector
    get() {
        if (_numberSquareOne != null) return _numberSquareOne!!
        _numberSquareOne = phosphorBoldIcon(
            name = "NumberSquareOne",
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
                    PathNode.MoveTo(98.0f, 102.66f),
                    PathNode.CurveTo(96.22971f, 100.00901f, 95.58697f, 96.7626f, 96.21358f, 93.637054f),
                    PathNode.CurveTo(96.84019f, 90.51151f, 98.68465f, 87.76373f, 101.34f, 86.0f),
                    PathNode.LineTo(125.34f, 70.0f),
                    PathNode.CurveTo(129.02469f, 67.54161f, 133.76402f, 67.31299f, 137.66824f, 69.40528f),
                    PathNode.CurveTo(141.57246f, 71.497574f, 144.00658f, 75.57049f, 144.0f, 80.0f),
                    PathNode.LineTo(144.0f, 176.0f),
                    PathNode.CurveTo(144.0f, 182.62741f, 138.62741f, 188.0f, 132.0f, 188.0f),
                    PathNode.CurveTo(125.37258f, 188.0f, 120.0f, 182.62741f, 120.0f, 176.0f),
                    PathNode.LineTo(120.0f, 102.42f),
                    PathNode.LineTo(114.66f, 106.0f),
                    PathNode.CurveTo(112.00901f, 107.77029f, 108.7626f, 108.41303f, 105.637054f, 107.78642f),
                    PathNode.CurveTo(102.51151f, 107.15981f, 99.76373f, 105.31535f, 98.0f, 102.66f),
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
        return _numberSquareOne!!
    }

private var _numberSquareOne: ImageVector? = null
