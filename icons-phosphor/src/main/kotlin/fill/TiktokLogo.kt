package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TiktokLogo: ImageVector
    get() {
        if (_tiktokLogo != null) return _tiktokLogo!!
        _tiktokLogo = phosphorFillIcon(
            name = "TiktokLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 80.0f),
                    PathNode.LineTo(232.0f, 120.0f),
                    PathNode.CurveTo(232.0f, 124.41828f, 228.41827f, 128.0f, 224.0f, 128.0f),
                    PathNode.CurveTo(207.2881f, 128.0388f, 190.81653f, 124.02043f, 176.0f, 116.29f),
                    PathNode.LineTo(176.0f, 156.0f),
                    PathNode.CurveTo(176.0f, 197.97365f, 141.97365f, 232.0f, 100.0f, 232.0f),
                    PathNode.CurveTo(58.02636f, 232.0f, 24.0f, 197.97365f, 24.0f, 156.0f),
                    PathNode.CurveTo(24.0f, 119.1f, 50.91f, 86.48f, 86.6f, 80.12f),
                    PathNode.CurveTo(88.93074f, 79.70573f, 91.32527f, 80.34498f, 93.13942f, 81.86577f),
                    PathNode.CurveTo(94.95357f, 83.386566f, 96.00102f, 85.63274f, 96.0f, 88.0f),
                    PathNode.LineTo(96.0f, 130.69f),
                    PathNode.CurveTo(96.00101f, 133.7804f, 94.22194f, 136.59499f, 91.43f, 137.92f),
                    PathNode.CurveTo(82.47728f, 142.16579f, 77.98292f, 152.32669f, 80.86436f, 161.80695f),
                    PathNode.CurveTo(83.7458f, 171.2872f, 93.13429f, 177.22853f, 102.93546f, 175.77423f),
                    PathNode.CurveTo(112.73663f, 174.31995f, 119.99546f, 165.90848f, 120.0f, 156.0f),
                    PathNode.LineTo(120.0f, 24.0f),
                    PathNode.CurveTo(120.0f, 19.581722f, 123.58172f, 16.0f, 128.0f, 16.0f),
                    PathNode.LineTo(168.0f, 16.0f),
                    PathNode.CurveTo(172.41827f, 16.0f, 176.0f, 19.581722f, 176.0f, 24.0f),
                    PathNode.CurveTo(176.02756f, 50.498245f, 197.50175f, 71.97244f, 224.0f, 72.0f),
                    PathNode.CurveTo(228.41827f, 72.0f, 232.0f, 75.58172f, 232.0f, 80.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _tiktokLogo!!
    }

private var _tiktokLogo: ImageVector? = null
