package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FolderUser: ImageVector
    get() {
        if (_folderUser != null) return _folderUser!!
        _folderUser = phosphorBoldIcon(
            name = "FolderUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.51f, 197.94f),
                    PathNode.CurveTo(231.92973f, 183.14244f, 230.12498f, 162.06673f, 216.35571f, 149.42613f),
                    PathNode.CurveTo(202.58643f, 136.78554f, 181.43358f, 136.78554f, 167.66429f, 149.42613f),
                    PathNode.CurveTo(153.895f, 162.06673f, 152.09027f, 183.14244f, 163.51f, 197.94f),
                    PathNode.CurveTo(156.1416f, 203.78629f, 150.85355f, 211.85162f, 148.43f, 220.94f),
                    PathNode.CurveTo(146.7342f, 227.34341f, 150.54778f, 233.90974f, 156.95f, 235.61f),
                    PathNode.CurveTo(157.94524f, 235.87282f, 158.97066f, 236.00394f, 160.0f, 236.0f),
                    PathNode.CurveTo(165.43823f, 235.99637f, 170.19418f, 232.33606f, 171.59f, 227.08f),
                    PathNode.CurveTo(174.0f, 218.2f, 182.35f, 212.0f, 192.0f, 212.0f),
                    PathNode.CurveTo(201.65f, 212.0f, 210.0f, 218.2f, 212.4f, 227.08f),
                    PathNode.CurveTo(214.1879f, 233.38196f, 220.69937f, 237.08562f, 227.0298f, 235.40132f),
                    PathNode.CurveTo(233.36023f, 233.71704f, 237.17023f, 227.26721f, 235.59f, 220.91f),
                    PathNode.CurveTo(233.1639f, 211.83105f, 227.87572f, 203.77605f, 220.51f, 197.94f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 164.0f),
                    PathNode.CurveTo(198.62741f, 164.0f, 204.0f, 169.37259f, 204.0f, 176.0f),
                    PathNode.CurveTo(204.0f, 182.62741f, 198.62741f, 188.0f, 192.0f, 188.0f),
                    PathNode.CurveTo(185.37259f, 188.0f, 180.0f, 182.62741f, 180.0f, 176.0f),
                    PathNode.CurveTo(180.0f, 169.37259f, 185.37259f, 164.0f, 192.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 68.0f),
                    PathNode.LineTo(133.39f, 68.0f),
                    PathNode.LineTo(107.39f, 38.71f),
                    PathNode.CurveTo(103.58679f, 34.43294f, 98.133415f, 31.99021f, 92.41f, 32.0f),
                    PathNode.LineTo(40.0f, 32.0f),
                    PathNode.CurveTo(28.954306f, 32.0f, 20.0f, 40.954304f, 20.0f, 52.0f),
                    PathNode.LineTo(20.0f, 200.61f),
                    PathNode.CurveTo(20.011015f, 211.31033f, 28.679674f, 219.98347f, 39.38f, 220.0f),
                    PathNode.LineTo(112.56f, 220.0f),
                    PathNode.CurveTo(119.187416f, 220.0f, 124.56f, 214.62741f, 124.56f, 208.0f),
                    PathNode.CurveTo(124.56f, 201.37259f, 119.187416f, 196.0f, 112.56f, 196.0f),
                    PathNode.LineTo(44.0f, 196.0f),
                    PathNode.LineTo(44.0f, 92.0f),
                    PathNode.LineTo(212.0f, 92.0f),
                    PathNode.LineTo(212.0f, 108.0f),
                    PathNode.CurveTo(212.0f, 114.62742f, 217.37259f, 120.0f, 224.0f, 120.0f),
                    PathNode.CurveTo(230.62741f, 120.0f, 236.0f, 114.62742f, 236.0f, 108.0f),
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
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _folderUser!!
    }

private var _folderUser: ImageVector? = null
