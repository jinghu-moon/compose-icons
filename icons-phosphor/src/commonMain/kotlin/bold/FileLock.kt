package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileLock: ImageVector
    get() {
        if (_fileLock != null) return _fileLock!!
        _fileLock = phosphorBoldIcon(
            name = "FileLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(120.0f, 168.0f),
                    PathNode.LineTo(116.0f, 168.0f),
                    PathNode.LineTo(116.0f, 164.0f),
                    PathNode.CurveTo(116.0f, 146.32689f, 101.67311f, 132.0f, 84.0f, 132.0f),
                    PathNode.CurveTo(66.32689f, 132.0f, 52.0f, 146.32689f, 52.0f, 164.0f),
                    PathNode.LineTo(52.0f, 168.0f),
                    PathNode.LineTo(48.0f, 168.0f),
                    PathNode.CurveTo(41.37258f, 168.0f, 36.0f, 173.37259f, 36.0f, 180.0f),
                    PathNode.LineTo(36.0f, 224.0f),
                    PathNode.CurveTo(36.0f, 230.62741f, 41.37258f, 236.0f, 48.0f, 236.0f),
                    PathNode.LineTo(120.0f, 236.0f),
                    PathNode.CurveTo(126.62742f, 236.0f, 132.0f, 230.62741f, 132.0f, 224.0f),
                    PathNode.LineTo(132.0f, 180.0f),
                    PathNode.CurveTo(132.0f, 173.37259f, 126.62742f, 168.0f, 120.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 164.0f),
                    PathNode.CurveTo(76.0f, 159.58173f, 79.58172f, 156.0f, 84.0f, 156.0f),
                    PathNode.CurveTo(88.41828f, 156.0f, 92.0f, 159.58173f, 92.0f, 164.0f),
                    PathNode.LineTo(92.0f, 168.0f),
                    PathNode.LineTo(76.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 212.0f),
                    PathNode.LineTo(60.0f, 212.0f),
                    PathNode.LineTo(60.0f, 192.0f),
                    PathNode.LineTo(108.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.49f, 79.52f),
                    PathNode.LineTo(160.49f, 23.52f),
                    PathNode.CurveTo(158.23927f, 21.26647f, 155.185f, 20.000149f, 152.0f, 20.0f),
                    PathNode.LineTo(56.0f, 20.0f),
                    PathNode.CurveTo(44.954304f, 20.0f, 36.0f, 28.954306f, 36.0f, 40.0f),
                    PathNode.LineTo(36.0f, 108.0f),
                    PathNode.CurveTo(36.0f, 114.62742f, 41.37258f, 120.0f, 48.0f, 120.0f),
                    PathNode.CurveTo(54.62742f, 120.0f, 60.0f, 114.62742f, 60.0f, 108.0f),
                    PathNode.LineTo(60.0f, 44.0f),
                    PathNode.LineTo(136.0f, 44.0f),
                    PathNode.LineTo(136.0f, 92.0f),
                    PathNode.CurveTo(136.0f, 98.62742f, 141.37259f, 104.0f, 148.0f, 104.0f),
                    PathNode.LineTo(196.0f, 104.0f),
                    PathNode.LineTo(196.0f, 212.0f),
                    PathNode.LineTo(164.0f, 212.0f),
                    PathNode.CurveTo(157.37259f, 212.0f, 152.0f, 217.37259f, 152.0f, 224.0f),
                    PathNode.CurveTo(152.0f, 230.62741f, 157.37259f, 236.0f, 164.0f, 236.0f),
                    PathNode.LineTo(200.0f, 236.0f),
                    PathNode.CurveTo(211.0457f, 236.0f, 220.0f, 227.0457f, 220.0f, 216.0f),
                    PathNode.LineTo(220.0f, 88.0f),
                    PathNode.CurveTo(219.99985f, 84.819916f, 218.73741f, 81.76991f, 216.49f, 79.52f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 57.0f),
                    PathNode.LineTo(183.0f, 80.0f),
                    PathNode.LineTo(160.0f, 80.0f),
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
        return _fileLock!!
    }

private var _fileLock: ImageVector? = null
