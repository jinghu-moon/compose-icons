package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Barricade: ImageVector
    get() {
        if (_barricade != null) return _barricade!!
        _barricade = phosphorBoldIcon(
            name = "Barricade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 60.0f),
                    PathNode.LineTo(32.0f, 60.0f),
                    PathNode.CurveTo(20.954306f, 60.0f, 12.0f, 68.95431f, 12.0f, 80.0f),
                    PathNode.LineTo(12.0f, 152.0f),
                    PathNode.CurveTo(12.0f, 163.0457f, 20.954306f, 172.0f, 32.0f, 172.0f),
                    PathNode.LineTo(52.0f, 172.0f),
                    PathNode.LineTo(52.0f, 200.0f),
                    PathNode.CurveTo(52.0f, 206.62741f, 57.37258f, 212.0f, 64.0f, 212.0f),
                    PathNode.CurveTo(70.62742f, 212.0f, 76.0f, 206.62741f, 76.0f, 200.0f),
                    PathNode.LineTo(76.0f, 172.0f),
                    PathNode.LineTo(180.0f, 172.0f),
                    PathNode.LineTo(180.0f, 200.0f),
                    PathNode.CurveTo(180.0f, 206.62741f, 185.37259f, 212.0f, 192.0f, 212.0f),
                    PathNode.CurveTo(198.62741f, 212.0f, 204.0f, 206.62741f, 204.0f, 200.0f),
                    PathNode.LineTo(204.0f, 172.0f),
                    PathNode.LineTo(224.0f, 172.0f),
                    PathNode.CurveTo(235.0457f, 172.0f, 244.0f, 163.0457f, 244.0f, 152.0f),
                    PathNode.LineTo(244.0f, 80.0f),
                    PathNode.CurveTo(244.0f, 68.95431f, 235.0457f, 60.0f, 224.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 119.0f),
                    PathNode.LineTo(185.0f, 84.0f),
                    PathNode.LineTo(220.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(177.0f, 148.0f),
                    PathNode.LineTo(113.0f, 84.0f),
                    PathNode.LineTo(151.0f, 84.0f),
                    PathNode.LineTo(215.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(105.0f, 148.0f),
                    PathNode.LineTo(41.0f, 84.0f),
                    PathNode.LineTo(79.0f, 84.0f),
                    PathNode.LineTo(143.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 113.0f),
                    PathNode.LineTo(71.0f, 148.0f),
                    PathNode.LineTo(36.0f, 148.0f),
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
        return _barricade!!
    }

private var _barricade: ImageVector? = null
