package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ShieldSlash: ImageVector
    get() {
        if (_shieldSlash != null) return _shieldSlash!!
        _shieldSlash = phosphorRegularIcon(
            name = "ShieldSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(53.92f, 34.62f),
                    PathNode.CurveTo(51.444565f, 31.905285f, 47.438316f, 31.22556f, 44.205997f, 32.971863f),
                    PathNode.CurveTo(40.973682f, 34.718166f, 39.34627f, 38.44155f, 40.26f, 42.0f),
                    PathNode.CurveTo(35.164642f, 44.81634f, 32.0012f, 50.17811f, 32.0f, 56.0f),
                    PathNode.LineTo(32.0f, 112.0f),
                    PathNode.CurveTo(32.0f, 164.72f, 57.52f, 196.67f, 78.93f, 214.19f),
                    PathNode.CurveTo(101.99f, 233.05f, 124.93f, 239.46f, 125.93f, 239.72f),
                    PathNode.CurveTo(127.305016f, 240.09406f, 128.75499f, 240.09406f, 130.13f, 239.72f),
                    PathNode.CurveTo(131.49f, 239.35f, 161.4f, 230.94f, 187.22f, 205.0f),
                    PathNode.LineTo(202.11f, 221.38f),
                    PathNode.CurveTo(204.02191f, 223.53516f, 206.94493f, 224.49586f, 209.76259f, 223.89514f),
                    PathNode.CurveTo(212.58025f, 223.29443f, 214.85728f, 221.2251f, 215.72395f, 218.47755f),
                    PathNode.CurveTo(216.5906f, 215.73003f, 215.91302f, 212.7287f, 213.95f, 210.62f),
                    PathNode.Close,
                    PathNode.MoveTo(127.99f, 223.62f),
                    PathNode.CurveTo(113.84403f, 218.67535f, 100.67216f, 211.29408f, 89.07f, 201.81f),
                    PathNode.CurveTo(61.82f, 179.51f, 48.0f, 149.3f, 48.0f, 112.0f),
                    PathNode.LineTo(48.0f, 56.0f),
                    PathNode.LineTo(51.71f, 56.0f),
                    PathNode.LineTo(176.41f, 193.15f),
                    PathNode.CurveTo(162.75131f, 206.79446f, 146.20967f, 217.20604f, 128.0f, 223.62f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 56.0f),
                    PathNode.LineTo(224.0f, 112.0f),
                    PathNode.CurveTo(224.0f, 132.58f, 220.11f, 151.61f, 212.44f, 168.59f),
                    PathNode.CurveTo(210.62022f, 172.61615f, 205.88115f, 174.40479f, 201.855f, 172.585f),
                    PathNode.CurveTo(197.82884f, 170.76523f, 196.04022f, 166.02615f, 197.86f, 162.0f),
                    PathNode.CurveTo(204.59f, 147.11f, 208.0f, 130.29f, 208.0f, 112.0f),
                    PathNode.LineTo(208.0f, 56.0f),
                    PathNode.LineTo(98.52f, 56.0f),
                    PathNode.CurveTo(94.10172f, 56.0f, 90.52f, 52.418278f, 90.52f, 48.0f),
                    PathNode.CurveTo(90.52f, 43.581722f, 94.10172f, 40.0f, 98.52f, 40.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(216.83656f, 40.0f, 224.0f, 47.163445f, 224.0f, 56.0f),
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
        return _shieldSlash!!
    }

private var _shieldSlash: ImageVector? = null
