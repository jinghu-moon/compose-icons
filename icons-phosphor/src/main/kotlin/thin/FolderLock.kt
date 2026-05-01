package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FolderLock: ImageVector
    get() {
        if (_folderLock != null) return _folderLock!!
        _folderLock = phosphorThinIcon(
            name = "FolderLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 164.0f),
                    PathNode.LineTo(212.0f, 164.0f),
                    PathNode.LineTo(212.0f, 156.0f),
                    PathNode.CurveTo(212.0f, 142.74516f, 201.25484f, 132.0f, 188.0f, 132.0f),
                    PathNode.CurveTo(174.74516f, 132.0f, 164.0f, 142.74516f, 164.0f, 156.0f),
                    PathNode.LineTo(164.0f, 164.0f),
                    PathNode.LineTo(152.0f, 164.0f),
                    PathNode.CurveTo(149.79086f, 164.0f, 148.0f, 165.79086f, 148.0f, 168.0f),
                    PathNode.LineTo(148.0f, 208.0f),
                    PathNode.CurveTo(148.0f, 210.20914f, 149.79086f, 212.0f, 152.0f, 212.0f),
                    PathNode.LineTo(224.0f, 212.0f),
                    PathNode.CurveTo(226.20914f, 212.0f, 228.0f, 210.20914f, 228.0f, 208.0f),
                    PathNode.LineTo(228.0f, 168.0f),
                    PathNode.CurveTo(228.0f, 165.79086f, 226.20914f, 164.0f, 224.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 156.0f),
                    PathNode.CurveTo(172.0f, 147.16344f, 179.16344f, 140.0f, 188.0f, 140.0f),
                    PathNode.CurveTo(196.83656f, 140.0f, 204.0f, 147.16344f, 204.0f, 156.0f),
                    PathNode.LineTo(204.0f, 164.0f),
                    PathNode.LineTo(172.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 204.0f),
                    PathNode.LineTo(156.0f, 204.0f),
                    PathNode.LineTo(156.0f, 172.0f),
                    PathNode.LineTo(220.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 76.0f),
                    PathNode.LineTo(129.66f, 76.0f),
                    PathNode.LineTo(101.17f, 47.51f),
                    PathNode.CurveTo(98.92008f, 45.26259f, 95.870094f, 44.00015f, 92.69f, 44.0f),
                    PathNode.LineTo(40.0f, 44.0f),
                    PathNode.CurveTo(33.37258f, 44.0f, 28.0f, 49.37258f, 28.0f, 56.0f),
                    PathNode.LineTo(28.0f, 200.62f),
                    PathNode.CurveTo(28.01101f, 206.90044f, 33.099564f, 211.989f, 39.38f, 212.0f),
                    PathNode.LineTo(112.56f, 212.0f),
                    PathNode.CurveTo(114.76914f, 212.0f, 116.56f, 210.20914f, 116.56f, 208.0f),
                    PathNode.CurveTo(116.56f, 205.79086f, 114.76914f, 204.0f, 112.56f, 204.0f),
                    PathNode.LineTo(39.38f, 204.0f),
                    PathNode.CurveTo(37.515556f, 203.9945f, 36.005493f, 202.48444f, 36.0f, 200.62f),
                    PathNode.LineTo(36.0f, 84.0f),
                    PathNode.LineTo(216.0f, 84.0f),
                    PathNode.CurveTo(218.20914f, 84.0f, 220.0f, 85.79086f, 220.0f, 88.0f),
                    PathNode.LineTo(220.0f, 104.0f),
                    PathNode.CurveTo(220.0f, 106.20914f, 221.79086f, 108.0f, 224.0f, 108.0f),
                    PathNode.CurveTo(226.20914f, 108.0f, 228.0f, 106.20914f, 228.0f, 104.0f),
                    PathNode.LineTo(228.0f, 88.0f),
                    PathNode.CurveTo(228.0f, 81.37258f, 222.62741f, 76.0f, 216.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 52.0f),
                    PathNode.LineTo(92.69f, 52.0f),
                    PathNode.CurveTo(93.74772f, 52.001812f, 94.761665f, 52.422493f, 95.51f, 53.17f),
                    PathNode.LineTo(118.34f, 76.0f),
                    PathNode.LineTo(36.0f, 76.0f),
                    PathNode.LineTo(36.0f, 56.0f),
                    PathNode.CurveTo(36.0f, 53.79086f, 37.79086f, 52.0f, 40.0f, 52.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _folderLock!!
    }

private var _folderLock: ImageVector? = null
