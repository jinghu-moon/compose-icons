package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FolderMinus: ImageVector
    get() {
        if (_folderMinus != null) return _folderMinus!!
        _folderMinus = phosphorBoldIcon(
            name = "FolderMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(92.0f, 144.0f),
                    PathNode.CurveTo(92.0f, 137.37259f, 97.37258f, 132.0f, 104.0f, 132.0f),
                    PathNode.LineTo(152.0f, 132.0f),
                    PathNode.CurveTo(158.62741f, 132.0f, 164.0f, 137.37259f, 164.0f, 144.0f),
                    PathNode.CurveTo(164.0f, 150.62741f, 158.62741f, 156.0f, 152.0f, 156.0f),
                    PathNode.LineTo(104.0f, 156.0f),
                    PathNode.CurveTo(97.37258f, 156.0f, 92.0f, 150.62741f, 92.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 88.0f),
                    PathNode.LineTo(236.0f, 200.89f),
                    PathNode.CurveTo(235.98898f, 211.43959f, 227.43959f, 219.98898f, 216.89f, 220.0f),
                    PathNode.LineTo(39.38f, 220.0f),
                    PathNode.CurveTo(28.68357f, 219.98347f, 20.01652f, 211.31642f, 20.0f, 200.62f),
                    PathNode.LineTo(20.0f, 52.0f),
                    PathNode.CurveTo(20.0f, 40.954304f, 28.954306f, 32.0f, 40.0f, 32.0f),
                    PathNode.LineTo(92.41f, 32.0f),
                    PathNode.CurveTo(98.14039f, 31.98448f, 103.602165f, 34.427715f, 107.41f, 38.71f),
                    PathNode.LineTo(133.41f, 68.0f),
                    PathNode.LineTo(216.0f, 68.0f),
                    PathNode.CurveTo(227.0457f, 68.0f, 236.0f, 76.95431f, 236.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 68.0f),
                    PathNode.LineTo(101.28f, 68.0f),
                    PathNode.LineTo(90.61f, 56.0f),
                    PathNode.LineTo(44.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 92.0f),
                    PathNode.LineTo(44.0f, 92.0f),
                    PathNode.LineTo(44.0f, 196.0f),
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
        return _folderMinus!!
    }

private var _folderMinus: ImageVector? = null
