package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ThumbsUp: ImageVector
    get() {
        if (_thumbsUp != null) return _thumbsUp!!
        _thumbsUp = phosphorDuotoneIcon(
            name = "ThumbsUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(80.0f, 104.0f),
                    PathNode.LineTo(80.0f, 208.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(27.581722f, 208.0f, 24.0f, 204.41827f, 24.0f, 200.0f),
                    PathNode.LineTo(24.0f, 112.0f),
                    PathNode.CurveTo(24.0f, 107.58172f, 27.581722f, 104.0f, 32.0f, 104.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(234.0f, 80.12f),
                    PathNode.CurveTo(229.44301f, 74.95603f, 222.88715f, 71.99861f, 216.0f, 72.0f),
                    PathNode.LineTo(160.0f, 72.0f),
                    PathNode.LineTo(160.0f, 56.0f),
                    PathNode.CurveTo(160.0f, 33.90861f, 142.09138f, 16.0f, 120.0f, 16.0f),
                    PathNode.CurveTo(116.96868f, 15.997829f, 114.19651f, 17.70914f, 112.84f, 20.42f),
                    PathNode.LineTo(75.06f, 96.0f),
                    PathNode.LineTo(32.0f, 96.0f),
                    PathNode.CurveTo(23.163445f, 96.0f, 16.0f, 103.163445f, 16.0f, 112.0f),
                    PathNode.LineTo(16.0f, 200.0f),
                    PathNode.CurveTo(16.0f, 208.83656f, 23.163445f, 216.0f, 32.0f, 216.0f),
                    PathNode.LineTo(204.0f, 216.0f),
                    PathNode.CurveTo(216.098f, 216.00415f, 226.30775f, 207.00311f, 227.82f, 195.0f),
                    PathNode.LineTo(239.82f, 99.0f),
                    PathNode.CurveTo(240.6804f, 92.16297f, 238.56049f, 85.28597f, 234.0f, 80.12f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 112.0f),
                    PathNode.LineTo(72.0f, 112.0f),
                    PathNode.LineTo(72.0f, 200.0f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(223.94f, 97.0f),
                    PathNode.LineTo(211.94f, 193.0f),
                    PathNode.CurveTo(211.43591f, 197.00104f, 208.03267f, 200.00139f, 204.0f, 200.0f),
                    PathNode.LineTo(88.0f, 200.0f),
                    PathNode.LineTo(88.0f, 105.89f),
                    PathNode.LineTo(124.71f, 32.46f),
                    PathNode.CurveTo(135.92914f, 34.70542f, 144.0032f, 44.558365f, 144.0f, 56.0f),
                    PathNode.LineTo(144.0f, 80.0f),
                    PathNode.CurveTo(144.0f, 84.41828f, 147.58173f, 88.0f, 152.0f, 88.0f),
                    PathNode.LineTo(216.0f, 88.0f),
                    PathNode.CurveTo(218.29648f, 87.999214f, 220.48256f, 88.98537f, 222.00183f, 90.707466f),
                    PathNode.CurveTo(223.52112f, 92.42957f, 224.22707f, 94.72153f, 223.94f, 97.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _thumbsUp!!
    }

private var _thumbsUp: ImageVector? = null
