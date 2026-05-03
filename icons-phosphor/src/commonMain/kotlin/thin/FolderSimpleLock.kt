package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FolderSimpleLock: ImageVector
    get() {
        if (_folderSimpleLock != null) return _folderSimpleLock!!
        _folderSimpleLock = phosphorThinIcon(
            name = "FolderSimpleLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 88.0f),
                    PathNode.LineTo(228.0f, 104.0f),
                    PathNode.CurveTo(228.0f, 106.20914f, 226.20914f, 108.0f, 224.0f, 108.0f),
                    PathNode.CurveTo(221.79086f, 108.0f, 220.0f, 106.20914f, 220.0f, 104.0f),
                    PathNode.LineTo(220.0f, 88.0f),
                    PathNode.CurveTo(220.0f, 85.79086f, 218.20914f, 84.0f, 216.0f, 84.0f),
                    PathNode.LineTo(130.67f, 84.0f),
                    PathNode.CurveTo(128.07414f, 83.996414f, 125.54884f, 83.15464f, 123.47f, 81.6f),
                    PathNode.LineTo(95.73f, 60.8f),
                    PathNode.CurveTo(95.03761f, 60.280712f, 94.19548f, 60.0f, 93.33f, 60.0f),
                    PathNode.LineTo(40.0f, 60.0f),
                    PathNode.CurveTo(37.79086f, 60.0f, 36.0f, 61.79086f, 36.0f, 64.0f),
                    PathNode.LineTo(36.0f, 200.0f),
                    PathNode.CurveTo(36.0f, 202.20914f, 37.79086f, 204.0f, 40.0f, 204.0f),
                    PathNode.LineTo(112.0f, 204.0f),
                    PathNode.CurveTo(114.20914f, 204.0f, 116.0f, 205.79086f, 116.0f, 208.0f),
                    PathNode.CurveTo(116.0f, 210.20914f, 114.20914f, 212.0f, 112.0f, 212.0f),
                    PathNode.LineTo(40.0f, 212.0f),
                    PathNode.CurveTo(33.37258f, 212.0f, 28.0f, 206.62741f, 28.0f, 200.0f),
                    PathNode.LineTo(28.0f, 64.0f),
                    PathNode.CurveTo(28.0f, 57.37258f, 33.37258f, 52.0f, 40.0f, 52.0f),
                    PathNode.LineTo(93.33f, 52.0f),
                    PathNode.CurveTo(95.92586f, 52.00359f, 98.45116f, 52.845356f, 100.53f, 54.4f),
                    PathNode.LineTo(128.27f, 75.2f),
                    PathNode.CurveTo(128.96239f, 75.71929f, 129.80452f, 76.0f, 130.67f, 76.0f),
                    PathNode.LineTo(216.0f, 76.0f),
                    PathNode.CurveTo(222.62741f, 76.0f, 228.0f, 81.37258f, 228.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 168.0f),
                    PathNode.LineTo(228.0f, 208.0f),
                    PathNode.CurveTo(228.0f, 210.20914f, 226.20914f, 212.0f, 224.0f, 212.0f),
                    PathNode.LineTo(152.0f, 212.0f),
                    PathNode.CurveTo(149.79086f, 212.0f, 148.0f, 210.20914f, 148.0f, 208.0f),
                    PathNode.LineTo(148.0f, 168.0f),
                    PathNode.CurveTo(148.0f, 165.79086f, 149.79086f, 164.0f, 152.0f, 164.0f),
                    PathNode.LineTo(164.0f, 164.0f),
                    PathNode.LineTo(164.0f, 156.0f),
                    PathNode.CurveTo(164.0f, 142.74516f, 174.74516f, 132.0f, 188.0f, 132.0f),
                    PathNode.CurveTo(201.25484f, 132.0f, 212.0f, 142.74516f, 212.0f, 156.0f),
                    PathNode.LineTo(212.0f, 164.0f),
                    PathNode.LineTo(224.0f, 164.0f),
                    PathNode.CurveTo(226.20914f, 164.0f, 228.0f, 165.79086f, 228.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 164.0f),
                    PathNode.LineTo(204.0f, 164.0f),
                    PathNode.LineTo(204.0f, 156.0f),
                    PathNode.CurveTo(204.0f, 147.16344f, 196.83656f, 140.0f, 188.0f, 140.0f),
                    PathNode.CurveTo(179.16344f, 140.0f, 172.0f, 147.16344f, 172.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 172.0f),
                    PathNode.LineTo(156.0f, 172.0f),
                    PathNode.LineTo(156.0f, 204.0f),
                    PathNode.LineTo(220.0f, 204.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _folderSimpleLock!!
    }

private var _folderSimpleLock: ImageVector? = null
