package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberSquareSeven: ImageVector
    get() {
        if (_numberSquareSeven != null) return _numberSquareSeven!!
        _numberSquareSeven = phosphorBoldIcon(
            name = "NumberSquareSeven",
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
                    PathNode.MoveTo(92.0f, 88.0f),
                    PathNode.CurveTo(92.0f, 81.37258f, 97.37258f, 76.0f, 104.0f, 76.0f),
                    PathNode.LineTo(152.0f, 76.0f),
                    PathNode.CurveTo(155.91475f, 75.9993f, 159.58376f, 77.908195f, 161.83006f, 81.11436f),
                    PathNode.CurveTo(164.07635f, 84.32051f, 164.61754f, 88.42083f, 163.28f, 92.1f),
                    PathNode.LineTo(131.28f, 180.1f),
                    PathNode.CurveTo(129.01562f, 186.32977f, 122.12977f, 189.54437f, 115.9f, 187.28f),
                    PathNode.CurveTo(109.67023f, 185.01562f, 106.455635f, 178.12978f, 108.72f, 171.9f),
                    PathNode.LineTo(134.87f, 100.0f),
                    PathNode.LineTo(104.0f, 100.0f),
                    PathNode.CurveTo(97.37258f, 100.0f, 92.0f, 94.62742f, 92.0f, 88.0f),
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
        return _numberSquareSeven!!
    }

private var _numberSquareSeven: ImageVector? = null
