package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Jeep: ImageVector
    get() {
        if (_jeep != null) return _jeep!!
        _jeep = phosphorBoldIcon(
            name = "Jeep",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 84.0f),
                    PathNode.LineTo(233.7f, 84.0f),
                    PathNode.LineTo(225.09f, 43.81f),
                    PathNode.CurveTo(223.07634f, 34.610046f, 214.94766f, 28.039778f, 205.53f, 28.0f),
                    PathNode.LineTo(50.47f, 28.0f),
                    PathNode.CurveTo(41.052338f, 28.039778f, 32.923656f, 34.610046f, 30.91f, 43.81f),
                    PathNode.LineTo(22.3f, 84.0f),
                    PathNode.LineTo(16.0f, 84.0f),
                    PathNode.CurveTo(9.372583f, 84.0f, 4.0f, 89.37258f, 4.0f, 96.0f),
                    PathNode.CurveTo(4.0f, 102.62742f, 9.372583f, 108.0f, 16.0f, 108.0f),
                    PathNode.LineTo(20.0f, 108.0f),
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
                    PathNode.LineTo(236.0f, 108.0f),
                    PathNode.LineTo(240.0f, 108.0f),
                    PathNode.CurveTo(246.62741f, 108.0f, 252.0f, 102.62742f, 252.0f, 96.0f),
                    PathNode.CurveTo(252.0f, 89.37258f, 246.62741f, 84.0f, 240.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(53.7f, 52.0f),
                    PathNode.LineTo(202.3f, 52.0f),
                    PathNode.LineTo(209.16f, 84.0f),
                    PathNode.LineTo(46.84f, 84.0f),
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
                    PathNode.LineTo(180.0f, 156.0f),
                    PathNode.LineTo(180.0f, 132.0f),
                    PathNode.CurveTo(180.0f, 125.37258f, 174.62741f, 120.0f, 168.0f, 120.0f),
                    PathNode.CurveTo(161.37259f, 120.0f, 156.0f, 125.37258f, 156.0f, 132.0f),
                    PathNode.LineTo(156.0f, 156.0f),
                    PathNode.LineTo(140.0f, 156.0f),
                    PathNode.LineTo(140.0f, 132.0f),
                    PathNode.CurveTo(140.0f, 125.37258f, 134.62741f, 120.0f, 128.0f, 120.0f),
                    PathNode.CurveTo(121.37258f, 120.0f, 116.0f, 125.37258f, 116.0f, 132.0f),
                    PathNode.LineTo(116.0f, 156.0f),
                    PathNode.LineTo(100.0f, 156.0f),
                    PathNode.LineTo(100.0f, 132.0f),
                    PathNode.CurveTo(100.0f, 125.37258f, 94.62742f, 120.0f, 88.0f, 120.0f),
                    PathNode.CurveTo(81.37258f, 120.0f, 76.0f, 125.37258f, 76.0f, 132.0f),
                    PathNode.LineTo(76.0f, 156.0f),
                    PathNode.LineTo(44.0f, 156.0f),
                    PathNode.LineTo(44.0f, 108.0f),
                    PathNode.LineTo(212.0f, 108.0f),
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
        return _jeep!!
    }

private var _jeep: ImageVector? = null
