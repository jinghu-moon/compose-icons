package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SoundcloudLogo: ImageVector
    get() {
        if (_soundcloudLogo != null) return _soundcloudLogo!!
        _soundcloudLogo = phosphorFillIcon(
            name = "SoundcloudLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(24.0f, 120.0f),
                    PathNode.LineTo(24.0f, 168.0f),
                    PathNode.CurveTo(24.0f, 172.41827f, 20.418278f, 176.0f, 16.0f, 176.0f),
                    PathNode.CurveTo(11.581722f, 176.0f, 8.0f, 172.41827f, 8.0f, 168.0f),
                    PathNode.LineTo(8.0f, 120.0f),
                    PathNode.CurveTo(8.0f, 115.58172f, 11.581722f, 112.0f, 16.0f, 112.0f),
                    PathNode.CurveTo(20.418278f, 112.0f, 24.0f, 115.58172f, 24.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 88.0f),
                    PathNode.CurveTo(43.581722f, 88.0f, 40.0f, 91.58172f, 40.0f, 96.0f),
                    PathNode.LineTo(40.0f, 192.0f),
                    PathNode.CurveTo(40.0f, 196.41827f, 43.581722f, 200.0f, 48.0f, 200.0f),
                    PathNode.CurveTo(52.418278f, 200.0f, 56.0f, 196.41827f, 56.0f, 192.0f),
                    PathNode.LineTo(56.0f, 96.0f),
                    PathNode.CurveTo(56.0f, 91.58172f, 52.418278f, 88.0f, 48.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 80.0f),
                    PathNode.CurveTo(75.58172f, 80.0f, 72.0f, 83.58172f, 72.0f, 88.0f),
                    PathNode.LineTo(72.0f, 192.0f),
                    PathNode.CurveTo(72.0f, 196.41827f, 75.58172f, 200.0f, 80.0f, 200.0f),
                    PathNode.CurveTo(84.41828f, 200.0f, 88.0f, 196.41827f, 88.0f, 192.0f),
                    PathNode.LineTo(88.0f, 88.0f),
                    PathNode.CurveTo(88.0f, 83.58172f, 84.41828f, 80.0f, 80.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 48.0f),
                    PathNode.CurveTo(107.58172f, 48.0f, 104.0f, 51.581722f, 104.0f, 56.0f),
                    PathNode.LineTo(104.0f, 192.0f),
                    PathNode.CurveTo(104.0f, 196.41827f, 107.58172f, 200.0f, 112.0f, 200.0f),
                    PathNode.CurveTo(116.41828f, 200.0f, 120.0f, 196.41827f, 120.0f, 192.0f),
                    PathNode.LineTo(120.0f, 56.0f),
                    PathNode.CurveTo(120.0f, 51.581722f, 116.41828f, 48.0f, 112.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(222.84f, 106.34f),
                    PathNode.CurveTo(216.19476f, 67.99356f, 182.91797f, 39.992775f, 144.0f, 40.0f),
                    PathNode.LineTo(140.0f, 40.0f),
                    PathNode.CurveTo(137.79086f, 40.0f, 136.0f, 41.79086f, 136.0f, 44.0f),
                    PathNode.LineTo(136.0f, 196.0f),
                    PathNode.CurveTo(136.0f, 198.20914f, 137.79086f, 200.0f, 140.0f, 200.0f),
                    PathNode.LineTo(207.21f, 200.0f),
                    PathNode.CurveTo(232.79f, 200.0f, 254.48f, 180.28f, 255.92f, 154.74f),
                    PathNode.CurveTo(257.14914f, 132.97064f, 243.56915f, 113.10151f, 222.84f, 106.34f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _soundcloudLogo!!
    }

private var _soundcloudLogo: ImageVector? = null
