package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CloudFog: ImageVector
    get() {
        if (_cloudFog != null) return _cloudFog!!
        _cloudFog = phosphorBoldIcon(
            name = "CloudFog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(120.0f, 208.0f),
                    PathNode.LineTo(72.0f, 208.0f),
                    PathNode.CurveTo(65.37258f, 208.0f, 60.0f, 202.62741f, 60.0f, 196.0f),
                    PathNode.CurveTo(60.0f, 189.37259f, 65.37258f, 184.0f, 72.0f, 184.0f),
                    PathNode.LineTo(120.0f, 184.0f),
                    PathNode.CurveTo(126.62742f, 184.0f, 132.0f, 189.37259f, 132.0f, 196.0f),
                    PathNode.CurveTo(132.0f, 202.62741f, 126.62742f, 208.0f, 120.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 184.0f),
                    PathNode.LineTo(160.0f, 184.0f),
                    PathNode.CurveTo(153.37259f, 184.0f, 148.0f, 189.37259f, 148.0f, 196.0f),
                    PathNode.CurveTo(148.0f, 202.62741f, 153.37259f, 208.0f, 160.0f, 208.0f),
                    PathNode.LineTo(184.0f, 208.0f),
                    PathNode.CurveTo(190.62741f, 208.0f, 196.0f, 202.62741f, 196.0f, 196.0f),
                    PathNode.CurveTo(196.0f, 189.37259f, 190.62741f, 184.0f, 184.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 220.0f),
                    PathNode.LineTo(104.0f, 220.0f),
                    PathNode.CurveTo(97.37258f, 220.0f, 92.0f, 225.37259f, 92.0f, 232.0f),
                    PathNode.CurveTo(92.0f, 238.62741f, 97.37258f, 244.0f, 104.0f, 244.0f),
                    PathNode.LineTo(160.0f, 244.0f),
                    PathNode.CurveTo(166.62741f, 244.0f, 172.0f, 238.62741f, 172.0f, 232.0f),
                    PathNode.CurveTo(172.0f, 225.37259f, 166.62741f, 220.0f, 160.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 96.0f),
                    PathNode.CurveTo(231.9559f, 137.95538f, 197.95538f, 171.9559f, 156.0f, 172.0f),
                    PathNode.LineTo(76.0f, 172.0f),
                    PathNode.CurveTo(56.34728f, 171.98972f, 38.379326f, 160.90068f, 29.55882f, 143.33856f),
                    PathNode.CurveTo(20.738316f, 125.77644f, 22.572363f, 104.74194f, 34.299225f, 88.97139f),
                    PathNode.CurveTo(46.02609f, 73.20084f, 65.64207f, 65.388855f, 85.0f, 68.78f),
                    PathNode.CurveTo(98.08377f, 34.51495f, 133.77281f, 14.482892f, 169.83777f, 21.161043f),
                    PathNode.CurveTo(205.90273f, 27.839193f, 232.05276f, 59.321995f, 232.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 96.0f),
                    PathNode.CurveTo(208.0f, 67.2812f, 184.71881f, 44.0f, 156.0f, 44.0f),
                    PathNode.CurveTo(127.2812f, 44.0f, 104.0f, 67.2812f, 104.0f, 96.0f),
                    PathNode.CurveTo(104.0f, 102.62742f, 98.62742f, 108.0f, 92.0f, 108.0f),
                    PathNode.CurveTo(85.37258f, 108.0f, 80.0f, 102.62742f, 80.0f, 96.0f),
                    PathNode.CurveTo(80.0f, 94.76f, 80.0f, 93.52f, 80.09f, 92.29f),
                    PathNode.CurveTo(78.735115f, 92.09788f, 77.36844f, 92.00097f, 76.0f, 92.0f),
                    PathNode.CurveTo(60.53603f, 92.0f, 48.0f, 104.536026f, 48.0f, 120.0f),
                    PathNode.CurveTo(48.0f, 135.46397f, 60.53603f, 148.0f, 76.0f, 148.0f),
                    PathNode.LineTo(156.0f, 148.0f),
                    PathNode.CurveTo(184.7051f, 147.96693f, 207.96693f, 124.7051f, 208.0f, 96.0f),
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
        return _cloudFog!!
    }

private var _cloudFog: ImageVector? = null
