package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PoliceCar: ImageVector
    get() {
        if (_policeCar != null) return _policeCar!!
        _policeCar = phosphorBoldIcon(
            name = "PoliceCar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 100.0f),
                    PathNode.LineTo(231.0f, 100.0f),
                    PathNode.LineTo(204.72f, 54.08f),
                    PathNode.CurveTo(201.16072f, 47.848934f, 194.53598f, 44.002316f, 187.36f, 44.0f),
                    PathNode.LineTo(68.64f, 44.0f),
                    PathNode.CurveTo(61.464024f, 44.002316f, 54.839283f, 47.848934f, 51.28f, 54.08f),
                    PathNode.LineTo(25.0f, 100.0f),
                    PathNode.LineTo(16.0f, 100.0f),
                    PathNode.CurveTo(9.372583f, 100.0f, 4.0f, 105.37258f, 4.0f, 112.0f),
                    PathNode.CurveTo(4.0f, 118.62742f, 9.372583f, 124.0f, 16.0f, 124.0f),
                    PathNode.LineTo(20.0f, 124.0f),
                    PathNode.LineTo(20.0f, 200.0f),
                    PathNode.CurveTo(20.0f, 211.0457f, 28.954306f, 220.0f, 40.0f, 220.0f),
                    PathNode.LineTo(68.0f, 220.0f),
                    PathNode.CurveTo(79.04569f, 220.0f, 88.0f, 211.0457f, 88.0f, 200.0f),
                    PathNode.LineTo(88.0f, 180.0f),
                    PathNode.LineTo(168.0f, 180.0f),
                    PathNode.LineTo(168.0f, 200.0f),
                    PathNode.CurveTo(168.0f, 211.0457f, 176.9543f, 220.0f, 188.0f, 220.0f),
                    PathNode.LineTo(216.0f, 220.0f),
                    PathNode.CurveTo(227.0457f, 220.0f, 236.0f, 211.0457f, 236.0f, 200.0f),
                    PathNode.LineTo(236.0f, 124.0f),
                    PathNode.LineTo(240.0f, 124.0f),
                    PathNode.CurveTo(246.62741f, 124.0f, 252.0f, 118.62742f, 252.0f, 112.0f),
                    PathNode.CurveTo(252.0f, 105.37258f, 246.62741f, 100.0f, 240.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(71.0f, 68.0f),
                    PathNode.LineTo(185.0f, 68.0f),
                    PathNode.LineTo(203.28f, 100.0f),
                    PathNode.LineTo(52.68f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 196.0f),
                    PathNode.LineTo(44.0f, 196.0f),
                    PathNode.LineTo(44.0f, 180.0f),
                    PathNode.LineTo(64.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 196.0f),
                    PathNode.LineTo(192.0f, 196.0f),
                    PathNode.LineTo(192.0f, 180.0f),
                    PathNode.LineTo(212.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 156.0f),
                    PathNode.LineTo(44.0f, 156.0f),
                    PathNode.LineTo(44.0f, 124.0f),
                    PathNode.LineTo(212.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 20.0f),
                    PathNode.CurveTo(92.0f, 13.372583f, 97.37258f, 8.0f, 104.0f, 8.0f),
                    PathNode.LineTo(152.0f, 8.0f),
                    PathNode.CurveTo(158.62741f, 8.0f, 164.0f, 13.372583f, 164.0f, 20.0f),
                    PathNode.CurveTo(164.0f, 26.627417f, 158.62741f, 32.0f, 152.0f, 32.0f),
                    PathNode.LineTo(104.0f, 32.0f),
                    PathNode.CurveTo(97.37258f, 32.0f, 92.0f, 26.627417f, 92.0f, 20.0f),
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
        return _policeCar!!
    }

private var _policeCar: ImageVector? = null
