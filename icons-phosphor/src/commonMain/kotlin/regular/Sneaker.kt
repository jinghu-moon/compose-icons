package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Sneaker: ImageVector
    get() {
        if (_sneaker != null) return _sneaker!!
        _sneaker = phosphorRegularIcon(
            name = "Sneaker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.65f, 129.11f),
                    PathNode.LineTo(167.92f, 108.87f),
                    PathNode.CurveTo(161.53462f, 106.736916f, 156.33875f, 102.01999f, 153.6f, 95.87f),
                    PathNode.LineTo(130.39f, 41.6f),
                    PathNode.CurveTo(130.39f, 41.6f, 130.39f, 41.53f, 130.39f, 41.5f),
                    PathNode.CurveTo(126.96033f, 33.807365f, 118.15415f, 30.090755f, 110.25f, 33.0f),
                    PathNode.LineTo(34.53f, 60.49f),
                    PathNode.CurveTo(28.216034f, 62.802593f, 24.01295f, 68.805855f, 24.0f, 75.53f),
                    PathNode.LineTo(24.0f, 192.0f),
                    PathNode.CurveTo(24.0f, 200.83656f, 31.163445f, 208.0f, 40.0f, 208.0f),
                    PathNode.LineTo(240.0f, 208.0f),
                    PathNode.CurveTo(248.83656f, 208.0f, 256.0f, 200.83656f, 256.0f, 192.0f),
                    PathNode.LineTo(256.0f, 167.06f),
                    PathNode.CurveTo(256.00128f, 149.84204f, 244.98427f, 134.55516f, 228.65f, 129.11f),
                    PathNode.Close,
                    PathNode.MoveTo(115.72f, 48.0f),
                    PathNode.LineTo(122.83f, 64.63f),
                    PathNode.LineTo(101.27f, 72.48f),
                    PathNode.CurveTo(97.61921f, 73.80506f, 95.44752f, 77.560844f, 96.12036f, 81.38594f),
                    PathNode.CurveTo(96.793205f, 85.21104f, 100.11618f, 88.00029f, 104.0f, 88.0f),
                    PathNode.CurveTo(104.931755f, 87.99873f, 105.855965f, 87.83285f, 106.73f, 87.51f),
                    PathNode.LineTo(129.13f, 79.37f),
                    PathNode.LineTo(133.87f, 90.44f),
                    PathNode.LineTo(117.27f, 96.44f),
                    PathNode.CurveTo(113.556946f, 97.72378f, 111.32557f, 101.5137f, 112.00449f, 105.38332f),
                    PathNode.CurveTo(112.68342f, 109.25294f, 116.07169f, 112.05691f, 120.0f, 112.0f),
                    PathNode.CurveTo(120.931755f, 111.99873f, 121.855965f, 111.83285f, 122.73f, 111.51f),
                    PathNode.LineTo(140.33f, 105.11f),
                    PathNode.CurveTo(142.34862f, 108.826195f, 144.94043f, 112.20094f, 148.01f, 115.11f),
                    PathNode.LineTo(133.27f, 120.47f),
                    PathNode.CurveTo(129.60411f, 121.7852f, 127.41806f, 125.54927f, 128.09236f, 129.38512f),
                    PathNode.CurveTo(128.76666f, 133.22098f, 132.10535f, 136.01385f, 136.0f, 136.0f),
                    PathNode.CurveTo(136.93076f, 135.99725f, 137.85414f, 135.8349f, 138.73f, 135.52f),
                    PathNode.LineTo(166.73f, 125.34f),
                    PathNode.LineTo(223.6f, 144.29f),
                    PathNode.CurveTo(230.94563f, 146.74619f, 236.65437f, 152.59644f, 238.93f, 160.0f),
                    PathNode.LineTo(40.0f, 160.0f),
                    PathNode.LineTo(40.0f, 75.53f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 192.0f),
                    PathNode.LineTo(40.0f, 192.0f),
                    PathNode.LineTo(40.0f, 176.0f),
                    PathNode.LineTo(240.0f, 176.0f),
                    PathNode.LineTo(240.0f, 192.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _sneaker!!
    }

private var _sneaker: ImageVector? = null
