package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowSquareDownLeft: ImageVector
    get() {
        if (_arrowSquareDownLeft != null) return _arrowSquareDownLeft!!
        _arrowSquareDownLeft = phosphorBoldIcon(
            name = "ArrowSquareDownLeft",
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
                    PathNode.MoveTo(84.0f, 160.0f),
                    PathNode.LineTo(84.0f, 112.0f),
                    PathNode.CurveTo(84.0f, 105.37258f, 89.37258f, 100.0f, 96.0f, 100.0f),
                    PathNode.CurveTo(102.62742f, 100.0f, 108.0f, 105.37258f, 108.0f, 112.0f),
                    PathNode.LineTo(108.0f, 131.0f),
                    PathNode.LineTo(151.51f, 87.48f),
                    PathNode.CurveTo(156.20442f, 82.78558f, 163.81558f, 82.78558f, 168.51f, 87.48f),
                    PathNode.CurveTo(173.20442f, 92.17442f, 173.20442f, 99.785576f, 168.51f, 104.48f),
                    PathNode.LineTo(125.0f, 148.0f),
                    PathNode.LineTo(144.0f, 148.0f),
                    PathNode.CurveTo(150.62741f, 148.0f, 156.0f, 153.37259f, 156.0f, 160.0f),
                    PathNode.CurveTo(156.0f, 166.62741f, 150.62741f, 172.0f, 144.0f, 172.0f),
                    PathNode.LineTo(96.0f, 172.0f),
                    PathNode.CurveTo(89.37258f, 172.0f, 84.0f, 166.62741f, 84.0f, 160.0f),
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
        return _arrowSquareDownLeft!!
    }

private var _arrowSquareDownLeft: ImageVector? = null
