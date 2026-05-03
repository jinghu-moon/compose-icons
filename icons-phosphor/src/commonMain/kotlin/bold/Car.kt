package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Car: ImageVector
    get() {
        if (_car != null) return _car!!
        _car = phosphorBoldIcon(
            name = "Car",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 100.0f),
                    PathNode.LineTo(231.8f, 100.0f),
                    PathNode.LineTo(205.08f, 39.88f),
                    PathNode.CurveTo(201.87025f, 32.65511f, 194.7058f, 27.998997f, 186.8f, 28.0f),
                    PathNode.LineTo(69.2f, 28.0f),
                    PathNode.CurveTo(61.294205f, 27.998997f, 54.129753f, 32.65511f, 50.92f, 39.88f),
                    PathNode.LineTo(24.2f, 100.0f),
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
                    PathNode.MoveTo(71.8f, 52.0f),
                    PathNode.LineTo(184.2f, 52.0f),
                    PathNode.LineTo(205.53f, 100.0f),
                    PathNode.LineTo(50.47f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 196.0f),
                    PathNode.LineTo(44.0f, 196.0f),
                    PathNode.LineTo(44.0f, 180.0f),
                    PathNode.LineTo(64.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 196.0f),
                    PathNode.LineTo(192.0f, 180.0f),
                    PathNode.LineTo(212.0f, 180.0f),
                    PathNode.LineTo(212.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 156.0f),
                    PathNode.LineTo(44.0f, 156.0f),
                    PathNode.LineTo(44.0f, 124.0f),
                    PathNode.LineTo(212.0f, 124.0f),
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
        return _car!!
    }

private var _car: ImageVector? = null
