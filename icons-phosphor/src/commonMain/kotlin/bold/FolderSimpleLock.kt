package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FolderSimpleLock: ImageVector
    get() {
        if (_folderSimpleLock != null) return _folderSimpleLock!!
        _folderSimpleLock = phosphorBoldIcon(
            name = "FolderSimpleLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 88.0f),
                    PathNode.LineTo(236.0f, 92.0f),
                    PathNode.CurveTo(236.0f, 98.62742f, 230.62741f, 104.0f, 224.0f, 104.0f),
                    PathNode.CurveTo(217.37259f, 104.0f, 212.0f, 98.62742f, 212.0f, 92.0f),
                    PathNode.LineTo(130.67f, 92.0f),
                    PathNode.CurveTo(126.343994f, 91.9914f, 122.13596f, 90.58872f, 118.67f, 88.0f),
                    PathNode.LineTo(92.0f, 68.0f),
                    PathNode.LineTo(44.0f, 68.0f),
                    PathNode.LineTo(44.0f, 196.0f),
                    PathNode.LineTo(104.0f, 196.0f),
                    PathNode.CurveTo(110.62742f, 196.0f, 116.0f, 201.37259f, 116.0f, 208.0f),
                    PathNode.CurveTo(116.0f, 214.62741f, 110.62742f, 220.0f, 104.0f, 220.0f),
                    PathNode.LineTo(40.0f, 220.0f),
                    PathNode.CurveTo(28.954306f, 220.0f, 20.0f, 211.0457f, 20.0f, 200.0f),
                    PathNode.LineTo(20.0f, 64.0f),
                    PathNode.CurveTo(20.0f, 52.954304f, 28.954306f, 44.0f, 40.0f, 44.0f),
                    PathNode.LineTo(93.33f, 44.0f),
                    PathNode.CurveTo(97.656006f, 44.0086f, 101.86404f, 45.41127f, 105.33f, 48.0f),
                    PathNode.LineTo(132.0f, 68.0f),
                    PathNode.LineTo(216.0f, 68.0f),
                    PathNode.CurveTo(227.0457f, 68.0f, 236.0f, 76.95431f, 236.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 164.0f),
                    PathNode.LineTo(236.0f, 208.0f),
                    PathNode.CurveTo(236.0f, 214.62741f, 230.62741f, 220.0f, 224.0f, 220.0f),
                    PathNode.LineTo(152.0f, 220.0f),
                    PathNode.CurveTo(145.37259f, 220.0f, 140.0f, 214.62741f, 140.0f, 208.0f),
                    PathNode.LineTo(140.0f, 164.0f),
                    PathNode.CurveTo(140.0f, 157.37259f, 145.37259f, 152.0f, 152.0f, 152.0f),
                    PathNode.LineTo(156.0f, 152.0f),
                    PathNode.LineTo(156.0f, 148.0f),
                    PathNode.CurveTo(156.0f, 130.32689f, 170.32689f, 116.0f, 188.0f, 116.0f),
                    PathNode.CurveTo(205.67311f, 116.0f, 220.0f, 130.32689f, 220.0f, 148.0f),
                    PathNode.LineTo(220.0f, 152.0f),
                    PathNode.LineTo(224.0f, 152.0f),
                    PathNode.CurveTo(230.62741f, 152.0f, 236.0f, 157.37259f, 236.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 152.0f),
                    PathNode.LineTo(196.0f, 152.0f),
                    PathNode.LineTo(196.0f, 148.0f),
                    PathNode.CurveTo(196.0f, 143.58173f, 192.41827f, 140.0f, 188.0f, 140.0f),
                    PathNode.CurveTo(183.58173f, 140.0f, 180.0f, 143.58173f, 180.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 176.0f),
                    PathNode.LineTo(164.0f, 176.0f),
                    PathNode.LineTo(164.0f, 196.0f),
                    PathNode.LineTo(212.0f, 196.0f),
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
        return _folderSimpleLock!!
    }

private var _folderSimpleLock: ImageVector? = null
