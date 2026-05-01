package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberSquareFour: ImageVector
    get() {
        if (_numberSquareFour != null) return _numberSquareFour!!
        _numberSquareFour = phosphorBoldIcon(
            name = "NumberSquareFour",
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
                    PathNode.MoveTo(88.0f, 164.0f),
                    PathNode.LineTo(132.0f, 164.0f),
                    PathNode.LineTo(132.0f, 176.0f),
                    PathNode.CurveTo(132.0f, 182.62741f, 137.37259f, 188.0f, 144.0f, 188.0f),
                    PathNode.CurveTo(150.62741f, 188.0f, 156.0f, 182.62741f, 156.0f, 176.0f),
                    PathNode.LineTo(156.0f, 164.0f),
                    PathNode.LineTo(160.0f, 164.0f),
                    PathNode.CurveTo(166.62741f, 164.0f, 172.0f, 158.62741f, 172.0f, 152.0f),
                    PathNode.CurveTo(172.0f, 145.37259f, 166.62741f, 140.0f, 160.0f, 140.0f),
                    PathNode.LineTo(156.0f, 140.0f),
                    PathNode.LineTo(156.0f, 80.0f),
                    PathNode.CurveTo(155.99994f, 74.874245f, 152.74416f, 70.31443f, 147.89607f, 68.65024f),
                    PathNode.CurveTo(143.048f, 66.98604f, 137.67813f, 68.58492f, 134.53f, 72.63f),
                    PathNode.LineTo(78.53f, 144.63f),
                    PathNode.CurveTo(75.71478f, 148.24742f, 75.20626f, 153.15262f, 77.21955f, 157.27061f),
                    PathNode.CurveTo(79.23284f, 161.38863f, 83.4162f, 163.99995f, 88.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 115.0f),
                    PathNode.LineTo(132.0f, 140.0f),
                    PathNode.LineTo(112.54f, 140.0f),
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
        return _numberSquareFour!!
    }

private var _numberSquareFour: ImageVector? = null
