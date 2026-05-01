package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AddressBook: ImageVector
    get() {
        if (_addressBook != null) return _addressBook!!
        _addressBook = phosphorFillIcon(
            name = "AddressBook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 112.0f),
                    PathNode.CurveTo(160.0f, 125.25484f, 149.25484f, 136.0f, 136.0f, 136.0f),
                    PathNode.CurveTo(122.74516f, 136.0f, 112.0f, 125.25484f, 112.0f, 112.0f),
                    PathNode.CurveTo(112.0f, 98.74516f, 122.74516f, 88.0f, 136.0f, 88.0f),
                    PathNode.CurveTo(149.25484f, 88.0f, 160.0f, 98.74516f, 160.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 40.0f),
                    PathNode.LineTo(224.0f, 216.0f),
                    PathNode.CurveTo(224.0f, 224.83656f, 216.83656f, 232.0f, 208.0f, 232.0f),
                    PathNode.LineTo(64.0f, 232.0f),
                    PathNode.CurveTo(55.163445f, 232.0f, 48.0f, 224.83656f, 48.0f, 216.0f),
                    PathNode.LineTo(48.0f, 192.0f),
                    PathNode.LineTo(32.0f, 192.0f),
                    PathNode.CurveTo(27.581722f, 192.0f, 24.0f, 188.41827f, 24.0f, 184.0f),
                    PathNode.CurveTo(24.0f, 179.58173f, 27.581722f, 176.0f, 32.0f, 176.0f),
                    PathNode.LineTo(48.0f, 176.0f),
                    PathNode.LineTo(48.0f, 136.0f),
                    PathNode.LineTo(32.0f, 136.0f),
                    PathNode.CurveTo(27.581722f, 136.0f, 24.0f, 132.41827f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 123.58172f, 27.581722f, 120.0f, 32.0f, 120.0f),
                    PathNode.LineTo(48.0f, 120.0f),
                    PathNode.LineTo(48.0f, 80.0f),
                    PathNode.LineTo(32.0f, 80.0f),
                    PathNode.CurveTo(27.581722f, 80.0f, 24.0f, 76.41828f, 24.0f, 72.0f),
                    PathNode.CurveTo(24.0f, 67.58172f, 27.581722f, 64.0f, 32.0f, 64.0f),
                    PathNode.LineTo(48.0f, 64.0f),
                    PathNode.LineTo(48.0f, 40.0f),
                    PathNode.CurveTo(48.0f, 31.163445f, 55.163445f, 24.0f, 64.0f, 24.0f),
                    PathNode.LineTo(208.0f, 24.0f),
                    PathNode.CurveTo(216.83656f, 24.0f, 224.0f, 31.163445f, 224.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(190.4f, 163.2f),
                    PathNode.CurveTo(183.31615f, 153.7026f, 173.86978f, 146.2248f, 163.0f, 141.51f),
                    PathNode.CurveTo(175.19264f, 130.37817f, 179.2933f, 112.89904f, 173.32347f, 97.50621f),
                    PathNode.CurveTo(167.3536f, 82.113396f, 152.53995f, 71.96987f, 136.03f, 71.96987f),
                    PathNode.CurveTo(119.52006f, 71.96987f, 104.70639f, 82.113396f, 98.736534f, 97.50621f),
                    PathNode.CurveTo(92.76668f, 112.89904f, 96.867355f, 130.37817f, 109.06f, 141.51f),
                    PathNode.CurveTo(98.168365f, 146.21588f, 88.700424f, 153.69438f, 81.6f, 163.2f),
                    PathNode.CurveTo(78.949036f, 166.73462f, 79.665375f, 171.74904f, 83.2f, 174.4f),
                    PathNode.CurveTo(86.73462f, 177.05096f, 91.74903f, 176.33463f, 94.4f, 172.8f),
                    PathNode.CurveTo(104.22043f, 159.7061f, 119.63262f, 152.0f, 136.0f, 152.0f),
                    PathNode.CurveTo(152.36739f, 152.0f, 167.77957f, 159.7061f, 177.6f, 172.8f),
                    PathNode.CurveTo(180.25096f, 176.33463f, 185.26538f, 177.05096f, 188.8f, 174.4f),
                    PathNode.CurveTo(192.33463f, 171.74904f, 193.05096f, 166.73462f, 190.4f, 163.2f),
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
        return _addressBook!!
    }

private var _addressBook: ImageVector? = null
