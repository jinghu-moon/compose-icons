package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Garage: ImageVector
    get() {
        if (_garage != null) return _garage!!
        _garage = phosphorBoldIcon(
            name = "Garage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 188.0f),
                    PathNode.LineTo(236.0f, 188.0f),
                    PathNode.LineTo(236.0f, 98.67f),
                    PathNode.CurveTo(236.00882f, 91.97191f, 232.66405f, 85.71409f, 227.09f, 82.0f),
                    PathNode.LineTo(139.09f, 23.34f),
                    PathNode.CurveTo(132.37875f, 18.848701f, 123.62124f, 18.848701f, 116.91f, 23.34f),
                    PathNode.LineTo(28.91f, 82.0f),
                    PathNode.CurveTo(23.335949f, 85.71409f, 19.991188f, 91.97191f, 20.0f, 98.67f),
                    PathNode.LineTo(20.0f, 188.0f),
                    PathNode.LineTo(16.0f, 188.0f),
                    PathNode.CurveTo(9.372583f, 188.0f, 4.0f, 193.37259f, 4.0f, 200.0f),
                    PathNode.CurveTo(4.0f, 206.62741f, 9.372583f, 212.0f, 16.0f, 212.0f),
                    PathNode.LineTo(240.0f, 212.0f),
                    PathNode.CurveTo(246.62741f, 212.0f, 252.0f, 206.62741f, 252.0f, 200.0f),
                    PathNode.CurveTo(252.0f, 193.37259f, 246.62741f, 188.0f, 240.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 100.81f),
                    PathNode.LineTo(128.0f, 44.81f),
                    PathNode.LineTo(212.0f, 100.81f),
                    PathNode.LineTo(212.0f, 188.0f),
                    PathNode.LineTo(196.0f, 188.0f),
                    PathNode.LineTo(196.0f, 120.0f),
                    PathNode.CurveTo(196.0f, 113.37258f, 190.62741f, 108.0f, 184.0f, 108.0f),
                    PathNode.LineTo(72.0f, 108.0f),
                    PathNode.CurveTo(65.37258f, 108.0f, 60.0f, 113.37258f, 60.0f, 120.0f),
                    PathNode.LineTo(60.0f, 188.0f),
                    PathNode.LineTo(44.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 132.0f),
                    PathNode.LineTo(172.0f, 148.0f),
                    PathNode.LineTo(140.0f, 148.0f),
                    PathNode.LineTo(140.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 148.0f),
                    PathNode.LineTo(84.0f, 148.0f),
                    PathNode.LineTo(84.0f, 132.0f),
                    PathNode.LineTo(116.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 172.0f),
                    PathNode.LineTo(116.0f, 172.0f),
                    PathNode.LineTo(116.0f, 188.0f),
                    PathNode.LineTo(84.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 172.0f),
                    PathNode.LineTo(172.0f, 172.0f),
                    PathNode.LineTo(172.0f, 188.0f),
                    PathNode.LineTo(140.0f, 188.0f),
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
        return _garage!!
    }

private var _garage: ImageVector? = null
