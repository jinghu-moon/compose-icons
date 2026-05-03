package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ClockCountdown: ImageVector
    get() {
        if (_clockCountdown != null) return _clockCountdown!!
        _clockCountdown = phosphorFillIcon(
            name = "ClockCountdown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 96.0f),
                    PathNode.CurveTo(208.0f, 89.37258f, 213.37259f, 84.0f, 220.0f, 84.0f),
                    PathNode.CurveTo(226.62741f, 84.0f, 232.0f, 89.37258f, 232.0f, 96.0f),
                    PathNode.CurveTo(232.0f, 102.62742f, 226.62741f, 108.0f, 220.0f, 108.0f),
                    PathNode.CurveTo(213.37259f, 108.0f, 208.0f, 102.62742f, 208.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 72.0f),
                    PathNode.CurveTo(202.62741f, 72.0f, 208.0f, 66.62742f, 208.0f, 60.0f),
                    PathNode.CurveTo(208.0f, 53.37258f, 202.62741f, 48.0f, 196.0f, 48.0f),
                    PathNode.CurveTo(189.37259f, 48.0f, 184.0f, 53.37258f, 184.0f, 60.0f),
                    PathNode.CurveTo(184.0f, 66.62742f, 189.37259f, 72.0f, 196.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.66f, 128.0f),
                    PathNode.CurveTo(220.25879f, 127.63704f, 216.39595f, 130.90903f, 216.03f, 135.31f),
                    PathNode.CurveTo(212.04585f, 181.8522f, 172.43536f, 217.19867f, 125.741585f, 215.87898f),
                    PathNode.CurveTo(79.04781f, 214.55928f, 41.496937f, 177.03203f, 40.14786f, 130.3391f),
                    PathNode.CurveTo(38.798782f, 83.64616f, 74.120316f, 44.013443f, 120.66f, 40.0f),
                    PathNode.CurveTo(125.07828f, 39.63549f, 128.3645f, 35.758278f, 128.0f, 31.34f),
                    PathNode.CurveTo(127.63549f, 26.921722f, 123.75828f, 23.635492f, 119.34f, 24.0f),
                    PathNode.CurveTo(64.351585f, 28.729893f, 22.607288f, 75.545654f, 24.185642f, 130.71454f),
                    PathNode.CurveTo(25.763994f, 185.88344f, 70.11657f, 230.236f, 125.28545f, 231.81436f),
                    PathNode.CurveTo(180.45435f, 233.39272f, 227.27011f, 191.6484f, 232.0f, 136.66f),
                    PathNode.CurveTo(232.18245f, 134.53665f, 231.51015f, 132.42828f, 230.13219f, 130.80252f),
                    PathNode.CurveTo(228.75423f, 129.17676f, 226.78453f, 128.168f, 224.66f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 56.0f),
                    PathNode.CurveTo(167.7645f, 56.0f, 200.0f, 88.2355f, 200.0f, 128.0f),
                    PathNode.CurveTo(200.0f, 167.7645f, 167.7645f, 200.0f, 128.0f, 200.0f),
                    PathNode.CurveTo(88.2355f, 200.0f, 56.0f, 167.7645f, 56.0f, 128.0f),
                    PathNode.CurveTo(56.04409f, 88.25378f, 88.25378f, 56.04409f, 128.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 128.0f),
                    PathNode.CurveTo(120.0f, 132.41827f, 123.58172f, 136.0f, 128.0f, 136.0f),
                    PathNode.LineTo(176.0f, 136.0f),
                    PathNode.CurveTo(180.41827f, 136.0f, 184.0f, 132.41827f, 184.0f, 128.0f),
                    PathNode.CurveTo(184.0f, 123.58172f, 180.41827f, 120.0f, 176.0f, 120.0f),
                    PathNode.LineTo(136.0f, 120.0f),
                    PathNode.LineTo(136.0f, 80.0f),
                    PathNode.CurveTo(136.0f, 75.58172f, 132.41827f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(123.58172f, 72.0f, 120.0f, 75.58172f, 120.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 48.0f),
                    PathNode.CurveTo(166.62741f, 48.0f, 172.0f, 42.62742f, 172.0f, 36.0f),
                    PathNode.CurveTo(172.0f, 29.372583f, 166.62741f, 24.0f, 160.0f, 24.0f),
                    PathNode.CurveTo(153.37259f, 24.0f, 148.0f, 29.372583f, 148.0f, 36.0f),
                    PathNode.CurveTo(148.0f, 42.62742f, 153.37259f, 48.0f, 160.0f, 48.0f),
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
        return _clockCountdown!!
    }

private var _clockCountdown: ImageVector? = null
