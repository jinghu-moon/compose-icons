package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.IdentificationBadge: ImageVector
    get() {
        if (_identificationBadge != null) return _identificationBadge!!
        _identificationBadge = phosphorRegularIcon(
            name = "IdentificationBadge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(75.19f, 198.4f),
                    PathNode.CurveTo(76.888054f, 199.6762f, 79.02393f, 200.22469f, 81.12678f, 199.92455f),
                    PathNode.CurveTo(83.22963f, 199.6244f, 85.12678f, 198.50029f, 86.4f, 196.8f),
                    PathNode.CurveTo(96.22043f, 183.7061f, 111.63262f, 176.0f, 128.0f, 176.0f),
                    PathNode.CurveTo(144.36739f, 176.0f, 159.77957f, 183.7061f, 169.6f, 196.8f),
                    PathNode.CurveTo(172.25096f, 200.33463f, 177.26538f, 201.05096f, 180.8f, 198.4f),
                    PathNode.CurveTo(184.33463f, 195.74904f, 185.05096f, 190.73462f, 182.4f, 187.2f),
                    PathNode.CurveTo(175.31615f, 177.7026f, 165.86978f, 170.2248f, 155.0f, 165.51f),
                    PathNode.CurveTo(167.19264f, 154.37817f, 171.2933f, 136.89903f, 165.32347f, 121.50621f),
                    PathNode.CurveTo(159.3536f, 106.113396f, 144.53995f, 95.96987f, 128.03f, 95.96987f),
                    PathNode.CurveTo(111.52006f, 95.96987f, 96.70639f, 106.113396f, 90.736534f, 121.50621f),
                    PathNode.CurveTo(84.76668f, 136.89903f, 88.867355f, 154.37817f, 101.06f, 165.51f),
                    PathNode.CurveTo(90.168365f, 170.21588f, 80.700424f, 177.69438f, 73.6f, 187.2f),
                    PathNode.CurveTo(70.946846f, 190.73201f, 71.65865f, 195.74597f, 75.19f, 198.4f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 112.0f),
                    PathNode.CurveTo(141.25484f, 112.0f, 152.0f, 122.74516f, 152.0f, 136.0f),
                    PathNode.CurveTo(152.0f, 149.25484f, 141.25484f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(114.74516f, 160.0f, 104.0f, 149.25484f, 104.0f, 136.0f),
                    PathNode.CurveTo(104.0f, 122.74516f, 114.74516f, 112.0f, 128.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 24.0f),
                    PathNode.LineTo(56.0f, 24.0f),
                    PathNode.CurveTo(47.163445f, 24.0f, 40.0f, 31.163445f, 40.0f, 40.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(40.0f, 224.83656f, 47.163445f, 232.0f, 56.0f, 232.0f),
                    PathNode.LineTo(200.0f, 232.0f),
                    PathNode.CurveTo(208.83656f, 232.0f, 216.0f, 224.83656f, 216.0f, 216.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(216.0f, 31.163445f, 208.83656f, 24.0f, 200.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 216.0f),
                    PathNode.LineTo(56.0f, 216.0f),
                    PathNode.LineTo(56.0f, 40.0f),
                    PathNode.LineTo(200.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 64.0f),
                    PathNode.CurveTo(88.0f, 59.581722f, 91.58172f, 56.0f, 96.0f, 56.0f),
                    PathNode.LineTo(160.0f, 56.0f),
                    PathNode.CurveTo(164.41827f, 56.0f, 168.0f, 59.581722f, 168.0f, 64.0f),
                    PathNode.CurveTo(168.0f, 68.41828f, 164.41827f, 72.0f, 160.0f, 72.0f),
                    PathNode.LineTo(96.0f, 72.0f),
                    PathNode.CurveTo(91.58172f, 72.0f, 88.0f, 68.41828f, 88.0f, 64.0f),
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
        return _identificationBadge!!
    }

private var _identificationBadge: ImageVector? = null
