package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BehanceLogo: ImageVector
    get() {
        if (_behanceLogo != null) return _behanceLogo!!
        _behanceLogo = phosphorLightIcon(
            name = "BehanceLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(112.15f, 122.36f),
                    PathNode.CurveTo(124.24863f, 112.900154f, 129.01376f, 96.806656f, 124.015915f, 82.284706f),
                    PathNode.CurveTo(119.01807f, 67.76276f, 105.35791f, 58.010468f, 90.0f, 58.0f),
                    PathNode.LineTo(32.0f, 58.0f),
                    PathNode.CurveTo(28.68629f, 58.0f, 26.0f, 60.68629f, 26.0f, 64.0f),
                    PathNode.LineTo(26.0f, 192.0f),
                    PathNode.CurveTo(26.0f, 195.3137f, 28.68629f, 198.0f, 32.0f, 198.0f),
                    PathNode.LineTo(94.0f, 198.0f),
                    PathNode.CurveTo(112.492386f, 197.99532f, 128.57097f, 185.31512f, 132.88579f, 167.33316f),
                    PathNode.CurveTo(137.20059f, 149.35121f, 128.62672f, 130.7556f, 112.15f, 122.36f),
                    PathNode.Close,
                    PathNode.MoveTo(38.0f, 70.0f),
                    PathNode.LineTo(90.0f, 70.0f),
                    PathNode.CurveTo(103.25484f, 70.0f, 114.0f, 80.74516f, 114.0f, 94.0f),
                    PathNode.CurveTo(114.0f, 107.25484f, 103.25484f, 118.0f, 90.0f, 118.0f),
                    PathNode.LineTo(38.0f, 118.0f),
                    PathNode.Close,
                    PathNode.MoveTo(94.0f, 186.0f),
                    PathNode.LineTo(38.0f, 186.0f),
                    PathNode.LineTo(38.0f, 130.0f),
                    PathNode.LineTo(94.0f, 130.0f),
                    PathNode.CurveTo(109.463974f, 130.0f, 122.0f, 142.53603f, 122.0f, 158.0f),
                    PathNode.CurveTo(122.0f, 173.46397f, 109.463974f, 186.0f, 94.0f, 186.0f),
                    PathNode.Close,
                    PathNode.MoveTo(162.0f, 80.0f),
                    PathNode.CurveTo(162.0f, 76.686295f, 164.6863f, 74.0f, 168.0f, 74.0f),
                    PathNode.LineTo(232.0f, 74.0f),
                    PathNode.CurveTo(235.3137f, 74.0f, 238.0f, 76.686295f, 238.0f, 80.0f),
                    PathNode.CurveTo(238.0f, 83.313705f, 235.3137f, 86.0f, 232.0f, 86.0f),
                    PathNode.LineTo(168.0f, 86.0f),
                    PathNode.CurveTo(164.6863f, 86.0f, 162.0f, 83.313705f, 162.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 106.0f),
                    PathNode.CurveTo(178.37051f, 106.003525f, 159.66516f, 121.07541f, 155.06151f, 142.20929f),
                    PathNode.CurveTo(150.45786f, 163.34317f, 161.19962f, 184.82959f, 180.86794f, 193.82913f),
                    PathNode.CurveTo(200.53625f, 202.82867f, 223.81761f, 196.91006f, 236.8f, 179.61f),
                    PathNode.CurveTo(238.79099f, 176.95903f, 238.25597f, 173.19598f, 235.605f, 171.205f),
                    PathNode.CurveTo(232.95404f, 169.21402f, 229.19098f, 169.74904f, 227.2f, 172.4f),
                    PathNode.CurveTo(219.0812f, 183.22829f, 205.31343f, 188.21027f, 192.14534f, 185.08484f),
                    PathNode.CurveTo(178.97726f, 181.9594f, 168.9168f, 171.32178f, 166.53f, 158.0f),
                    PathNode.LineTo(240.0f, 158.0f),
                    PathNode.CurveTo(243.3137f, 158.0f, 246.0f, 155.3137f, 246.0f, 152.0f),
                    PathNode.CurveTo(245.96695f, 126.608604f, 225.39139f, 106.03306f, 200.0f, 106.0f),
                    PathNode.Close,
                    PathNode.MoveTo(166.53f, 146.0f),
                    PathNode.CurveTo(169.4269f, 129.78584f, 183.5291f, 117.97989f, 200.0f, 117.97989f),
                    PathNode.CurveTo(216.4709f, 117.97989f, 230.5731f, 129.78584f, 233.47f, 146.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _behanceLogo!!
    }

private var _behanceLogo: ImageVector? = null
