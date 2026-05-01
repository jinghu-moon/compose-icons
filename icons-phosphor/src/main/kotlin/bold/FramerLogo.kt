package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FramerLogo: ImageVector
    get() {
        if (_framerLogo != null) return _framerLogo!!
        _framerLogo = phosphorBoldIcon(
            name = "FramerLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 104.0f),
                    PathNode.LineTo(212.0f, 40.0f),
                    PathNode.CurveTo(212.0f, 33.37258f, 206.62741f, 28.0f, 200.0f, 28.0f),
                    PathNode.LineTo(56.0f, 28.0f),
                    PathNode.CurveTo(50.997776f, 27.973766f, 46.504005f, 31.053308f, 44.723213f, 35.727894f),
                    PathNode.CurveTo(42.94242f, 40.402473f, 44.24821f, 45.691372f, 48.0f, 49.0f),
                    PathNode.LineTo(96.44f, 92.0f),
                    PathNode.LineTo(56.0f, 92.0f),
                    PathNode.CurveTo(49.37258f, 92.0f, 44.0f, 97.37258f, 44.0f, 104.0f),
                    PathNode.LineTo(44.0f, 168.0f),
                    PathNode.CurveTo(44.00015f, 171.185f, 45.26647f, 174.23927f, 47.52f, 176.49f),
                    PathNode.LineTo(119.52f, 248.49f),
                    PathNode.CurveTo(122.95308f, 251.9188f, 128.11319f, 252.94278f, 132.5954f, 251.08467f),
                    PathNode.CurveTo(137.0776f, 249.22656f, 139.99977f, 244.85208f, 140.0f, 240.0f),
                    PathNode.LineTo(140.0f, 180.0f),
                    PathNode.LineTo(200.0f, 180.0f),
                    PathNode.CurveTo(205.00223f, 180.02623f, 209.49599f, 176.94669f, 211.27678f, 172.27211f),
                    PathNode.CurveTo(213.05759f, 167.59753f, 211.75179f, 162.30862f, 208.0f, 159.0f),
                    PathNode.LineTo(159.59f, 116.0f),
                    PathNode.LineTo(200.0f, 116.0f),
                    PathNode.CurveTo(206.62741f, 116.0f, 212.0f, 110.62742f, 212.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.44f, 156.0f),
                    PathNode.LineTo(128.0f, 156.0f),
                    PathNode.CurveTo(121.37258f, 156.0f, 116.0f, 161.37259f, 116.0f, 168.0f),
                    PathNode.LineTo(116.0f, 211.0f),
                    PathNode.LineTo(68.0f, 163.0f),
                    PathNode.LineTo(68.0f, 116.0f),
                    PathNode.LineTo(123.44f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 92.0f),
                    PathNode.LineTo(132.56f, 92.0f),
                    PathNode.LineTo(87.56f, 52.0f),
                    PathNode.LineTo(188.0f, 52.0f),
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
        return _framerLogo!!
    }

private var _framerLogo: ImageVector? = null
