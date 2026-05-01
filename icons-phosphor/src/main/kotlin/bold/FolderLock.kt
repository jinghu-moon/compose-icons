package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FolderLock: ImageVector
    get() {
        if (_folderLock != null) return _folderLock!!
        _folderLock = phosphorBoldIcon(
            name = "FolderLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 152.0f),
                    PathNode.LineTo(220.0f, 152.0f),
                    PathNode.LineTo(220.0f, 148.0f),
                    PathNode.CurveTo(220.0f, 130.32689f, 205.67311f, 116.0f, 188.0f, 116.0f),
                    PathNode.CurveTo(170.32689f, 116.0f, 156.0f, 130.32689f, 156.0f, 148.0f),
                    PathNode.LineTo(156.0f, 152.0f),
                    PathNode.LineTo(152.0f, 152.0f),
                    PathNode.CurveTo(145.37259f, 152.0f, 140.0f, 157.37259f, 140.0f, 164.0f),
                    PathNode.LineTo(140.0f, 208.0f),
                    PathNode.CurveTo(140.0f, 214.62741f, 145.37259f, 220.0f, 152.0f, 220.0f),
                    PathNode.LineTo(224.0f, 220.0f),
                    PathNode.CurveTo(230.62741f, 220.0f, 236.0f, 214.62741f, 236.0f, 208.0f),
                    PathNode.LineTo(236.0f, 164.0f),
                    PathNode.CurveTo(236.0f, 157.37259f, 230.62741f, 152.0f, 224.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 148.0f),
                    PathNode.CurveTo(180.0f, 143.58173f, 183.58173f, 140.0f, 188.0f, 140.0f),
                    PathNode.CurveTo(192.41827f, 140.0f, 196.0f, 143.58173f, 196.0f, 148.0f),
                    PathNode.LineTo(196.0f, 152.0f),
                    PathNode.LineTo(180.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 196.0f),
                    PathNode.LineTo(164.0f, 196.0f),
                    PathNode.LineTo(164.0f, 176.0f),
                    PathNode.LineTo(212.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 68.0f),
                    PathNode.LineTo(133.39f, 68.0f),
                    PathNode.LineTo(107.39f, 38.71f),
                    PathNode.CurveTo(103.58217f, 34.427715f, 98.120384f, 31.98448f, 92.39f, 32.0f),
                    PathNode.LineTo(40.0f, 32.0f),
                    PathNode.CurveTo(28.954306f, 32.0f, 20.0f, 40.954304f, 20.0f, 52.0f),
                    PathNode.LineTo(20.0f, 200.62f),
                    PathNode.CurveTo(20.01652f, 211.31642f, 28.68357f, 219.98347f, 39.38f, 220.0f),
                    PathNode.LineTo(104.56f, 220.0f),
                    PathNode.CurveTo(111.187416f, 220.0f, 116.56f, 214.62741f, 116.56f, 208.0f),
                    PathNode.CurveTo(116.56f, 201.37259f, 111.187416f, 196.0f, 104.56f, 196.0f),
                    PathNode.LineTo(44.0f, 196.0f),
                    PathNode.LineTo(44.0f, 92.0f),
                    PathNode.LineTo(212.0f, 92.0f),
                    PathNode.CurveTo(212.0f, 98.62742f, 217.37259f, 104.0f, 224.0f, 104.0f),
                    PathNode.CurveTo(230.62741f, 104.0f, 236.0f, 98.62742f, 236.0f, 92.0f),
                    PathNode.LineTo(236.0f, 88.0f),
                    PathNode.CurveTo(236.0f, 76.95431f, 227.0457f, 68.0f, 216.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 68.0f),
                    PathNode.LineTo(44.0f, 56.0f),
                    PathNode.LineTo(90.61f, 56.0f),
                    PathNode.LineTo(101.28f, 68.0f),
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
        return _folderLock!!
    }

private var _folderLock: ImageVector? = null
