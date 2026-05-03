package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) return _folderOpen!!
        _folderOpen = phosphorThinIcon(
            name = "FolderOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(241.72f, 113.0f),
                    PathNode.CurveTo(239.48262f, 109.850365f, 235.85341f, 107.9854f, 231.99f, 108.0f),
                    PathNode.LineTo(212.0f, 108.0f),
                    PathNode.LineTo(212.0f, 88.0f),
                    PathNode.CurveTo(212.0f, 81.37258f, 206.62741f, 76.0f, 200.0f, 76.0f),
                    PathNode.LineTo(129.33f, 76.0f),
                    PathNode.LineTo(100.53f, 54.4f),
                    PathNode.CurveTo(98.45116f, 52.845356f, 95.92586f, 52.00359f, 93.33f, 52.0f),
                    PathNode.LineTo(40.0f, 52.0f),
                    PathNode.CurveTo(33.37258f, 52.0f, 28.0f, 57.37258f, 28.0f, 64.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 210.20914f, 29.790861f, 212.0f, 32.0f, 212.0f),
                    PathNode.LineTo(211.09f, 212.0f),
                    PathNode.CurveTo(212.81128f, 211.99725f, 214.3378f, 210.89366f, 214.88f, 209.26f),
                    PathNode.LineTo(243.37f, 123.79f),
                    PathNode.CurveTo(244.60614f, 120.13891f, 243.99077f, 116.114815f, 241.72f, 113.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 60.0f),
                    PathNode.LineTo(93.33f, 60.0f),
                    PathNode.CurveTo(94.19548f, 60.0f, 95.03761f, 60.280712f, 95.73f, 60.8f),
                    PathNode.LineTo(125.6f, 83.2f),
                    PathNode.CurveTo(126.29238f, 83.71929f, 127.13452f, 84.0f, 128.0f, 84.0f),
                    PathNode.LineTo(200.0f, 84.0f),
                    PathNode.CurveTo(202.20914f, 84.0f, 204.0f, 85.79086f, 204.0f, 88.0f),
                    PathNode.LineTo(204.0f, 108.0f),
                    PathNode.LineTo(69.76f, 108.0f),
                    PathNode.CurveTo(64.59512f, 108.00249f, 60.01124f, 111.30949f, 58.38f, 116.21f),
                    PathNode.LineTo(36.0f, 183.35f),
                    PathNode.LineTo(36.0f, 64.0f),
                    PathNode.CurveTo(36.0f, 61.79086f, 37.79086f, 60.0f, 40.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(235.78f, 121.26f),
                    PathNode.LineTo(208.2f, 204.0f),
                    PathNode.LineTo(37.55f, 204.0f),
                    PathNode.LineTo(66.0f, 118.74f),
                    PathNode.CurveTo(66.53867f, 117.11675f, 68.04978f, 116.01557f, 69.76f, 116.0f),
                    PathNode.LineTo(232.0f, 116.0f),
                    PathNode.CurveTo(233.28374f, 116.002045f, 234.4885f, 116.6201f, 235.23895f, 117.66164f),
                    PathNode.CurveTo(235.98941f, 118.70317f, 236.19438f, 120.04161f, 235.79f, 121.26f),
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
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
