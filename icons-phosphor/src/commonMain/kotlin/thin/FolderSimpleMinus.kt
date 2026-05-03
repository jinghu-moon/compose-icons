package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FolderSimpleMinus: ImageVector
    get() {
        if (_folderSimpleMinus != null) return _folderSimpleMinus!!
        _folderSimpleMinus = phosphorThinIcon(
            name = "FolderSimpleMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 76.0f),
                    PathNode.LineTo(129.33f, 76.0f),
                    PathNode.LineTo(100.53f, 54.4f),
                    PathNode.CurveTo(98.45116f, 52.845356f, 95.92586f, 52.00359f, 93.33f, 52.0f),
                    PathNode.LineTo(40.0f, 52.0f),
                    PathNode.CurveTo(33.37258f, 52.0f, 28.0f, 57.37258f, 28.0f, 64.0f),
                    PathNode.LineTo(28.0f, 200.0f),
                    PathNode.CurveTo(28.0f, 206.62741f, 33.37258f, 212.0f, 40.0f, 212.0f),
                    PathNode.LineTo(216.89f, 212.0f),
                    PathNode.CurveTo(223.0236f, 211.99449f, 227.99449f, 207.0236f, 228.0f, 200.89f),
                    PathNode.LineTo(228.0f, 88.0f),
                    PathNode.CurveTo(228.0f, 81.37258f, 222.62741f, 76.0f, 216.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 200.89f),
                    PathNode.CurveTo(219.9945f, 202.60533f, 218.60533f, 203.9945f, 216.89f, 204.0f),
                    PathNode.LineTo(40.0f, 204.0f),
                    PathNode.CurveTo(37.79086f, 204.0f, 36.0f, 202.20914f, 36.0f, 200.0f),
                    PathNode.LineTo(36.0f, 64.0f),
                    PathNode.CurveTo(36.0f, 61.79086f, 37.79086f, 60.0f, 40.0f, 60.0f),
                    PathNode.LineTo(93.33f, 60.0f),
                    PathNode.CurveTo(94.19548f, 60.0f, 95.03761f, 60.280712f, 95.73f, 60.8f),
                    PathNode.LineTo(125.6f, 83.2f),
                    PathNode.CurveTo(126.29238f, 83.71929f, 127.13452f, 84.0f, 128.0f, 84.0f),
                    PathNode.LineTo(216.0f, 84.0f),
                    PathNode.CurveTo(218.20914f, 84.0f, 220.0f, 85.79086f, 220.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 144.0f),
                    PathNode.CurveTo(156.0f, 146.20914f, 154.20914f, 148.0f, 152.0f, 148.0f),
                    PathNode.LineTo(104.0f, 148.0f),
                    PathNode.CurveTo(101.79086f, 148.0f, 100.0f, 146.20914f, 100.0f, 144.0f),
                    PathNode.CurveTo(100.0f, 141.79086f, 101.79086f, 140.0f, 104.0f, 140.0f),
                    PathNode.LineTo(152.0f, 140.0f),
                    PathNode.CurveTo(154.20914f, 140.0f, 156.0f, 141.79086f, 156.0f, 144.0f),
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
        return _folderSimpleMinus!!
    }

private var _folderSimpleMinus: ImageVector? = null
