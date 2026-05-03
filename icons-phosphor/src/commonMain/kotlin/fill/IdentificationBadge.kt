package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.IdentificationBadge: ImageVector
    get() {
        if (_identificationBadge != null) return _identificationBadge!!
        _identificationBadge = phosphorFillIcon(
            name = "IdentificationBadge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
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
                    PathNode.MoveTo(96.0f, 48.0f),
                    PathNode.LineTo(160.0f, 48.0f),
                    PathNode.CurveTo(164.41827f, 48.0f, 168.0f, 51.581722f, 168.0f, 56.0f),
                    PathNode.CurveTo(168.0f, 60.418278f, 164.41827f, 64.0f, 160.0f, 64.0f),
                    PathNode.LineTo(96.0f, 64.0f),
                    PathNode.CurveTo(91.58172f, 64.0f, 88.0f, 60.418278f, 88.0f, 56.0f),
                    PathNode.CurveTo(88.0f, 51.581722f, 91.58172f, 48.0f, 96.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.81f, 198.4f),
                    PathNode.CurveTo(179.11195f, 199.6762f, 176.97606f, 200.22469f, 174.87321f, 199.92455f),
                    PathNode.CurveTo(172.77037f, 199.6244f, 170.87321f, 198.50029f, 169.6f, 196.8f),
                    PathNode.CurveTo(159.77957f, 183.7061f, 144.36739f, 176.0f, 128.0f, 176.0f),
                    PathNode.CurveTo(111.63262f, 176.0f, 96.22043f, 183.7061f, 86.4f, 196.8f),
                    PathNode.CurveTo(83.74903f, 200.33463f, 78.73462f, 201.05096f, 75.2f, 198.4f),
                    PathNode.CurveTo(71.665375f, 195.74904f, 70.949036f, 190.73462f, 73.6f, 187.2f),
                    PathNode.CurveTo(80.683846f, 177.7026f, 90.130226f, 170.2248f, 101.0f, 165.51f),
                    PathNode.CurveTo(88.80736f, 154.37817f, 84.70668f, 136.89903f, 90.67654f, 121.50621f),
                    PathNode.CurveTo(96.64639f, 106.113396f, 111.46007f, 95.96987f, 127.97f, 95.96987f),
                    PathNode.CurveTo(144.47995f, 95.96987f, 159.29361f, 106.113396f, 165.26346f, 121.50621f),
                    PathNode.CurveTo(171.23332f, 136.89903f, 167.13264f, 154.37817f, 154.94f, 165.51f),
                    PathNode.CurveTo(165.83163f, 170.21588f, 175.29956f, 177.69438f, 182.4f, 187.2f),
                    PathNode.CurveTo(185.05315f, 190.73201f, 184.34135f, 195.74597f, 180.81f, 198.4f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 136.0f),
                    PathNode.CurveTo(152.0f, 149.25484f, 141.25484f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(114.74516f, 160.0f, 104.0f, 149.25484f, 104.0f, 136.0f),
                    PathNode.CurveTo(104.0f, 122.74516f, 114.74516f, 112.0f, 128.0f, 112.0f),
                    PathNode.CurveTo(141.25484f, 112.0f, 152.0f, 122.74516f, 152.0f, 136.0f),
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
        return _identificationBadge!!
    }

private var _identificationBadge: ImageVector? = null
