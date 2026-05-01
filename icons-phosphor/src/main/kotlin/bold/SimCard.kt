package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SimCard: ImageVector
    get() {
        if (_simCard != null) return _simCard!!
        _simCard = phosphorBoldIcon(
            name = "SimCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.49f, 79.51f),
                    PathNode.LineTo(160.49f, 23.51f),
                    PathNode.CurveTo(158.23764f, 21.260138f, 155.18355f, 19.997498f, 152.0f, 20.0f),
                    PathNode.LineTo(56.0f, 20.0f),
                    PathNode.CurveTo(44.954304f, 20.0f, 36.0f, 28.954306f, 36.0f, 40.0f),
                    PathNode.LineTo(36.0f, 216.0f),
                    PathNode.CurveTo(36.0f, 227.0457f, 44.954304f, 236.0f, 56.0f, 236.0f),
                    PathNode.LineTo(200.0f, 236.0f),
                    PathNode.CurveTo(211.0457f, 236.0f, 220.0f, 227.0457f, 220.0f, 216.0f),
                    PathNode.LineTo(220.0f, 88.0f),
                    PathNode.CurveTo(220.0025f, 84.816444f, 218.73987f, 81.76237f, 216.49f, 79.51f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 212.0f),
                    PathNode.LineTo(60.0f, 212.0f),
                    PathNode.LineTo(60.0f, 44.0f),
                    PathNode.LineTo(147.0f, 44.0f),
                    PathNode.LineTo(196.0f, 93.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 112.0f),
                    PathNode.CurveTo(81.37258f, 112.0f, 76.0f, 117.37258f, 76.0f, 124.0f),
                    PathNode.LineTo(76.0f, 184.0f),
                    PathNode.CurveTo(76.0f, 190.62741f, 81.37258f, 196.0f, 88.0f, 196.0f),
                    PathNode.LineTo(168.0f, 196.0f),
                    PathNode.CurveTo(174.62741f, 196.0f, 180.0f, 190.62741f, 180.0f, 184.0f),
                    PathNode.LineTo(180.0f, 124.0f),
                    PathNode.CurveTo(180.0f, 117.37258f, 174.62741f, 112.0f, 168.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 136.0f),
                    PathNode.LineTo(116.0f, 136.0f),
                    PathNode.LineTo(116.0f, 172.0f),
                    PathNode.LineTo(100.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 172.0f),
                    PathNode.LineTo(140.0f, 172.0f),
                    PathNode.LineTo(140.0f, 136.0f),
                    PathNode.LineTo(156.0f, 136.0f),
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
        return _simCard!!
    }

private var _simCard: ImageVector? = null
