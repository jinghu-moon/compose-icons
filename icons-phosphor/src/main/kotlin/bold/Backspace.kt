package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Backspace: ImageVector
    get() {
        if (_backspace != null) return _backspace!!
        _backspace = phosphorBoldIcon(
            name = "Backspace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 36.0f),
                    PathNode.LineTo(68.53f, 36.0f),
                    PathNode.CurveTo(61.50941f, 36.017727f, 55.00735f, 39.699066f, 51.38f, 45.71f),
                    PathNode.LineTo(5.71f, 121.83f),
                    PathNode.CurveTo(3.433045f, 125.62823f, 3.433045f, 130.37177f, 5.71f, 134.17f),
                    PathNode.LineTo(51.38f, 210.29f),
                    PathNode.CurveTo(55.00735f, 216.30093f, 61.50941f, 219.98227f, 68.53f, 220.0f),
                    PathNode.LineTo(216.0f, 220.0f),
                    PathNode.CurveTo(227.0457f, 220.0f, 236.0f, 211.0457f, 236.0f, 200.0f),
                    PathNode.LineTo(236.0f, 56.0f),
                    PathNode.CurveTo(236.0f, 44.954304f, 227.0457f, 36.0f, 216.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 196.0f),
                    PathNode.LineTo(70.8f, 196.0f),
                    PathNode.LineTo(30.0f, 128.0f),
                    PathNode.LineTo(70.8f, 60.0f),
                    PathNode.LineTo(212.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(103.51f, 143.51f),
                    PathNode.LineTo(119.0f, 128.0f),
                    PathNode.LineTo(103.48f, 112.49f),
                    PathNode.CurveTo(98.78558f, 107.79558f, 98.78558f, 100.18442f, 103.48f, 95.49f),
                    PathNode.CurveTo(108.17442f, 90.79558f, 115.785576f, 90.79558f, 120.48f, 95.49f),
                    PathNode.LineTo(136.0f, 111.0f),
                    PathNode.LineTo(151.51f, 95.48f),
                    PathNode.CurveTo(156.20442f, 90.78558f, 163.81558f, 90.78558f, 168.51f, 95.48f),
                    PathNode.CurveTo(173.20442f, 100.17442f, 173.20442f, 107.785576f, 168.51f, 112.48f),
                    PathNode.LineTo(153.0f, 128.0f),
                    PathNode.LineTo(168.52f, 143.51f),
                    PathNode.CurveTo(173.21442f, 148.20442f, 173.21442f, 155.81558f, 168.52f, 160.51f),
                    PathNode.CurveTo(163.82558f, 165.20442f, 156.21442f, 165.20442f, 151.52f, 160.51f),
                    PathNode.LineTo(136.0f, 145.0f),
                    PathNode.LineTo(120.49f, 160.52f),
                    PathNode.CurveTo(115.79558f, 165.21442f, 108.18442f, 165.21442f, 103.49f, 160.52f),
                    PathNode.CurveTo(98.79558f, 155.82558f, 98.79558f, 148.21442f, 103.49f, 143.52f),
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
        return _backspace!!
    }

private var _backspace: ImageVector? = null
