package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PencilLine: ImageVector
    get() {
        if (_pencilLine != null) return _pencilLine!!
        _pencilLine = phosphorBoldIcon(
            name = "PencilLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.15f, 70.54f),
                    PathNode.LineTo(185.46f, 25.86f),
                    PathNode.CurveTo(177.65001f, 18.05236f, 164.98999f, 18.05236f, 157.18f, 25.86f),
                    PathNode.LineTo(33.86f, 149.17f),
                    PathNode.CurveTo(30.095879f, 152.91106f, 27.98563f, 158.00302f, 28.0f, 163.31f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(216.0f, 228.0f),
                    PathNode.CurveTo(222.62741f, 228.0f, 228.0f, 222.62741f, 228.0f, 216.0f),
                    PathNode.CurveTo(228.0f, 209.37259f, 222.62741f, 204.0f, 216.0f, 204.0f),
                    PathNode.LineTo(125.0f, 204.0f),
                    PathNode.LineTo(230.15f, 98.83f),
                    PathNode.CurveTo(233.90248f, 95.07904f, 236.01073f, 89.99073f, 236.01073f, 84.685f),
                    PathNode.CurveTo(236.01073f, 79.379265f, 233.90248f, 74.29096f, 230.15f, 70.54f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 81.0f),
                    PathNode.LineTo(147.0f, 92.0f),
                    PathNode.LineTo(76.0f, 163.0f),
                    PathNode.LineTo(65.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 173.0f),
                    PathNode.LineTo(67.52f, 188.51f),
                    PathNode.LineTo(67.52f, 188.51f),
                    PathNode.LineTo(83.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 191.0f),
                    PathNode.LineTo(93.0f, 180.0f),
                    PathNode.LineTo(164.0f, 109.0f),
                    PathNode.LineTo(175.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 103.0f),
                    PathNode.LineTo(153.0f, 64.0f),
                    PathNode.LineTo(171.34f, 45.66f),
                    PathNode.LineTo(210.34f, 84.66f),
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
        return _pencilLine!!
    }

private var _pencilLine: ImageVector? = null
