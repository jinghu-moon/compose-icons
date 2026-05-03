package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TiktokLogo: ImageVector
    get() {
        if (_tiktokLogo != null) return _tiktokLogo!!
        _tiktokLogo = phosphorRegularIcon(
            name = "TiktokLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 72.0f),
                    PathNode.CurveTo(197.50175f, 71.97244f, 176.02756f, 50.498245f, 176.0f, 24.0f),
                    PathNode.CurveTo(176.0f, 19.581722f, 172.41827f, 16.0f, 168.0f, 16.0f),
                    PathNode.LineTo(128.0f, 16.0f),
                    PathNode.CurveTo(123.58172f, 16.0f, 120.0f, 19.581722f, 120.0f, 24.0f),
                    PathNode.LineTo(120.0f, 156.0f),
                    PathNode.CurveTo(119.99546f, 165.90848f, 112.73663f, 174.31995f, 102.93546f, 175.77423f),
                    PathNode.CurveTo(93.13429f, 177.22853f, 83.7458f, 171.2872f, 80.86436f, 161.80695f),
                    PathNode.CurveTo(77.98292f, 152.32669f, 82.47728f, 142.16579f, 91.43f, 137.92f),
                    PathNode.CurveTo(94.22194f, 136.59499f, 96.00101f, 133.7804f, 96.0f, 130.69f),
                    PathNode.LineTo(96.0f, 88.0f),
                    PathNode.CurveTo(96.00102f, 85.63274f, 94.95357f, 83.386566f, 93.13942f, 81.86577f),
                    PathNode.CurveTo(91.32527f, 80.34498f, 88.93074f, 79.70573f, 86.6f, 80.12f),
                    PathNode.CurveTo(50.91f, 86.48f, 24.0f, 119.1f, 24.0f, 156.0f),
                    PathNode.CurveTo(24.0f, 197.97365f, 58.02636f, 232.0f, 100.0f, 232.0f),
                    PathNode.CurveTo(141.97365f, 232.0f, 176.0f, 197.97365f, 176.0f, 156.0f),
                    PathNode.LineTo(176.0f, 116.29f),
                    PathNode.CurveTo(190.81653f, 124.02043f, 207.2881f, 128.0388f, 224.0f, 128.0f),
                    PathNode.CurveTo(228.41827f, 128.0f, 232.0f, 124.41828f, 232.0f, 120.0f),
                    PathNode.LineTo(232.0f, 80.0f),
                    PathNode.CurveTo(232.0f, 75.58172f, 228.41827f, 72.0f, 224.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 111.64f),
                    PathNode.CurveTo(200.36635f, 110.25466f, 185.39651f, 104.67509f, 172.67f, 95.49f),
                    PathNode.CurveTo(170.23114f, 93.73655f, 167.0156f, 93.49702f, 164.34387f, 94.86979f),
                    PathNode.CurveTo(161.67215f, 96.24255f, 159.99454f, 98.99624f, 160.0f, 102.0f),
                    PathNode.LineTo(160.0f, 156.0f),
                    PathNode.CurveTo(160.0f, 189.13708f, 133.13708f, 216.0f, 100.0f, 216.0f),
                    PathNode.CurveTo(66.862915f, 216.0f, 40.0f, 189.13708f, 40.0f, 156.0f),
                    PathNode.CurveTo(40.0f, 130.1f, 56.64f, 106.87f, 80.0f, 98.4f),
                    PathNode.LineTo(80.0f, 126.07f),
                    PathNode.CurveTo(65.71921f, 135.61176f, 60.16765f, 153.91281f, 66.74059f, 169.78046f),
                    PathNode.CurveTo(73.31353f, 185.64813f, 90.180214f, 194.66277f, 107.02518f, 191.31114f),
                    PathNode.CurveTo(123.87015f, 187.95952f, 136.00156f, 173.17516f, 136.0f, 156.0f),
                    PathNode.LineTo(136.0f, 32.0f),
                    PathNode.LineTo(160.5f, 32.0f),
                    PathNode.CurveTo(164.20035f, 60.981247f, 187.01875f, 83.79966f, 216.0f, 87.5f),
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
        return _tiktokLogo!!
    }

private var _tiktokLogo: ImageVector? = null
