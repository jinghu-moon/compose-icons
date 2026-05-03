package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.KeyReturn: ImageVector
    get() {
        if (_keyReturn != null) return _keyReturn!!
        _keyReturn = phosphorBoldIcon(
            name = "KeyReturn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(71.51f, 144.49f),
                    PathNode.CurveTo(69.25055f, 142.23837f, 67.98054f, 139.17982f, 67.98054f, 135.99f),
                    PathNode.CurveTo(67.98054f, 132.80019f, 69.25055f, 129.74162f, 71.51f, 127.49f),
                    PathNode.LineTo(95.51f, 103.49f),
                    PathNode.CurveTo(100.20442f, 98.79558f, 107.81558f, 98.79558f, 112.51f, 103.49f),
                    PathNode.CurveTo(117.20442f, 108.18442f, 117.20442f, 115.79558f, 112.51f, 120.49f),
                    PathNode.LineTo(109.0f, 124.0f),
                    PathNode.LineTo(164.0f, 124.0f),
                    PathNode.LineTo(164.0f, 104.0f),
                    PathNode.CurveTo(164.0f, 97.37258f, 169.37259f, 92.0f, 176.0f, 92.0f),
                    PathNode.CurveTo(182.62741f, 92.0f, 188.0f, 97.37258f, 188.0f, 104.0f),
                    PathNode.LineTo(188.0f, 136.0f),
                    PathNode.CurveTo(188.0f, 142.62741f, 182.62741f, 148.0f, 176.0f, 148.0f),
                    PathNode.LineTo(109.0f, 148.0f),
                    PathNode.LineTo(112.52f, 151.51f),
                    PathNode.CurveTo(117.21442f, 156.20442f, 117.21442f, 163.81558f, 112.52f, 168.51f),
                    PathNode.CurveTo(107.82558f, 173.20442f, 100.214424f, 173.20442f, 95.52f, 168.51f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 56.0f),
                    PathNode.LineTo(236.0f, 200.0f),
                    PathNode.CurveTo(236.0f, 211.0457f, 227.0457f, 220.0f, 216.0f, 220.0f),
                    PathNode.LineTo(40.0f, 220.0f),
                    PathNode.CurveTo(28.954306f, 220.0f, 20.0f, 211.0457f, 20.0f, 200.0f),
                    PathNode.LineTo(20.0f, 56.0f),
                    PathNode.CurveTo(20.0f, 44.954304f, 28.954306f, 36.0f, 40.0f, 36.0f),
                    PathNode.LineTo(216.0f, 36.0f),
                    PathNode.CurveTo(227.0457f, 36.0f, 236.0f, 44.954304f, 236.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 60.0f),
                    PathNode.LineTo(44.0f, 60.0f),
                    PathNode.LineTo(44.0f, 196.0f),
                    PathNode.LineTo(212.0f, 196.0f),
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
        return _keyReturn!!
    }

private var _keyReturn: ImageVector? = null
