package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FolderPlus: ImageVector
    get() {
        if (_folderPlus != null) return _folderPlus!!
        _folderPlus = phosphorBoldIcon(
            name = "FolderPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 68.0f),
                    PathNode.LineTo(133.39f, 68.0f),
                    PathNode.LineTo(107.39f, 38.71f),
                    PathNode.CurveTo(103.58217f, 34.427715f, 98.120384f, 31.98448f, 92.39f, 32.0f),
                    PathNode.LineTo(40.0f, 32.0f),
                    PathNode.CurveTo(28.954306f, 32.0f, 20.0f, 40.954304f, 20.0f, 52.0f),
                    PathNode.LineTo(20.0f, 200.62f),
                    PathNode.CurveTo(20.01652f, 211.31642f, 28.68357f, 219.98347f, 39.38f, 220.0f),
                    PathNode.LineTo(216.89f, 220.0f),
                    PathNode.CurveTo(227.43959f, 219.98898f, 235.98898f, 211.43959f, 236.0f, 200.89f),
                    PathNode.LineTo(236.0f, 88.0f),
                    PathNode.CurveTo(236.0f, 76.95431f, 227.0457f, 68.0f, 216.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(90.61f, 56.0f),
                    PathNode.LineTo(101.28f, 68.0f),
                    PathNode.LineTo(44.0f, 68.0f),
                    PathNode.LineTo(44.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 196.0f),
                    PathNode.LineTo(44.0f, 196.0f),
                    PathNode.LineTo(44.0f, 92.0f),
                    PathNode.LineTo(212.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 120.0f),
                    PathNode.LineTo(140.0f, 132.0f),
                    PathNode.LineTo(152.0f, 132.0f),
                    PathNode.CurveTo(158.62741f, 132.0f, 164.0f, 137.37259f, 164.0f, 144.0f),
                    PathNode.CurveTo(164.0f, 150.62741f, 158.62741f, 156.0f, 152.0f, 156.0f),
                    PathNode.LineTo(140.0f, 156.0f),
                    PathNode.LineTo(140.0f, 168.0f),
                    PathNode.CurveTo(140.0f, 174.62741f, 134.62741f, 180.0f, 128.0f, 180.0f),
                    PathNode.CurveTo(121.37258f, 180.0f, 116.0f, 174.62741f, 116.0f, 168.0f),
                    PathNode.LineTo(116.0f, 156.0f),
                    PathNode.LineTo(104.0f, 156.0f),
                    PathNode.CurveTo(97.37258f, 156.0f, 92.0f, 150.62741f, 92.0f, 144.0f),
                    PathNode.CurveTo(92.0f, 137.37259f, 97.37258f, 132.0f, 104.0f, 132.0f),
                    PathNode.LineTo(116.0f, 132.0f),
                    PathNode.LineTo(116.0f, 120.0f),
                    PathNode.CurveTo(116.0f, 113.37258f, 121.37258f, 108.0f, 128.0f, 108.0f),
                    PathNode.CurveTo(134.62741f, 108.0f, 140.0f, 113.37258f, 140.0f, 120.0f),
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
        return _folderPlus!!
    }

private var _folderPlus: ImageVector? = null
