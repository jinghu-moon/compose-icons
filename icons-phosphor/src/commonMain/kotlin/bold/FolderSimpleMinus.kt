package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FolderSimpleMinus: ImageVector
    get() {
        if (_folderSimpleMinus != null) return _folderSimpleMinus!!
        _folderSimpleMinus = phosphorBoldIcon(
            name = "FolderSimpleMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 68.0f),
                    PathNode.LineTo(132.0f, 68.0f),
                    PathNode.LineTo(105.33f, 48.0f),
                    PathNode.CurveTo(101.86404f, 45.41127f, 97.656006f, 44.0086f, 93.33f, 44.0f),
                    PathNode.LineTo(40.0f, 44.0f),
                    PathNode.CurveTo(28.954306f, 44.0f, 20.0f, 52.954304f, 20.0f, 64.0f),
                    PathNode.LineTo(20.0f, 200.0f),
                    PathNode.CurveTo(20.0f, 211.0457f, 28.954306f, 220.0f, 40.0f, 220.0f),
                    PathNode.LineTo(216.89f, 220.0f),
                    PathNode.CurveTo(227.43959f, 219.98898f, 235.98898f, 211.43959f, 236.0f, 200.89f),
                    PathNode.LineTo(236.0f, 88.0f),
                    PathNode.CurveTo(236.0f, 76.95431f, 227.0457f, 68.0f, 216.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 196.0f),
                    PathNode.LineTo(44.0f, 196.0f),
                    PathNode.LineTo(44.0f, 68.0f),
                    PathNode.LineTo(92.0f, 68.0f),
                    PathNode.LineTo(120.8f, 89.6f),
                    PathNode.CurveTo(122.87715f, 91.15787f, 125.40356f, 92.0f, 128.0f, 92.0f),
                    PathNode.LineTo(212.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 132.0f),
                    PathNode.LineTo(152.0f, 132.0f),
                    PathNode.CurveTo(158.62741f, 132.0f, 164.0f, 137.37259f, 164.0f, 144.0f),
                    PathNode.CurveTo(164.0f, 150.62741f, 158.62741f, 156.0f, 152.0f, 156.0f),
                    PathNode.LineTo(104.0f, 156.0f),
                    PathNode.CurveTo(97.37258f, 156.0f, 92.0f, 150.62741f, 92.0f, 144.0f),
                    PathNode.CurveTo(92.0f, 137.37259f, 97.37258f, 132.0f, 104.0f, 132.0f),
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
        return _folderSimpleMinus!!
    }

private var _folderSimpleMinus: ImageVector? = null
