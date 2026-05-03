package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ClockCountdown: ImageVector
    get() {
        if (_clockCountdown != null) return _clockCountdown!!
        _clockCountdown = phosphorDuotoneIcon(
            name = "ClockCountdown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 181.01933f, 181.01933f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(74.98067f, 224.0f, 32.0f, 181.01933f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 74.98067f, 74.98067f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(181.01933f, 32.0f, 224.0f, 74.98067f, 224.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 136.66f),
                    PathNode.CurveTo(227.27011f, 191.6484f, 180.45435f, 233.39272f, 125.28545f, 231.81436f),
                    PathNode.CurveTo(70.11657f, 230.236f, 25.763994f, 185.88344f, 24.185642f, 130.71454f),
                    PathNode.CurveTo(22.607288f, 75.545654f, 64.351585f, 28.729893f, 119.34f, 24.0f),
                    PathNode.CurveTo(123.75828f, 23.635492f, 127.63549f, 26.921722f, 128.0f, 31.34f),
                    PathNode.CurveTo(128.3645f, 35.758278f, 125.07828f, 39.63549f, 120.66f, 40.0f),
                    PathNode.CurveTo(74.11905f, 43.998795f, 38.78505f, 83.6204f, 40.11943f, 130.31375f),
                    PathNode.CurveTo(41.453815f, 177.00711f, 78.99288f, 214.54619f, 125.68624f, 215.88057f),
                    PathNode.CurveTo(172.3796f, 217.21495f, 212.0012f, 181.88095f, 216.0f, 135.34f),
                    PathNode.CurveTo(216.3645f, 130.92172f, 220.24171f, 127.63549f, 224.66f, 128.0f),
                    PathNode.CurveTo(229.07828f, 128.3645f, 232.3645f, 132.24171f, 232.0f, 136.66f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 72.0f),
                    PathNode.LineTo(120.0f, 128.0f),
                    PathNode.CurveTo(120.0f, 132.41827f, 123.58172f, 136.0f, 128.0f, 136.0f),
                    PathNode.LineTo(184.0f, 136.0f),
                    PathNode.CurveTo(188.41827f, 136.0f, 192.0f, 132.41827f, 192.0f, 128.0f),
                    PathNode.CurveTo(192.0f, 123.58172f, 188.41827f, 120.0f, 184.0f, 120.0f),
                    PathNode.LineTo(136.0f, 120.0f),
                    PathNode.LineTo(136.0f, 72.0f),
                    PathNode.CurveTo(136.0f, 67.58172f, 132.41827f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(123.58172f, 64.0f, 120.0f, 67.58172f, 120.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 48.0f),
                    PathNode.CurveTo(166.62741f, 48.0f, 172.0f, 42.62742f, 172.0f, 36.0f),
                    PathNode.CurveTo(172.0f, 29.372583f, 166.62741f, 24.0f, 160.0f, 24.0f),
                    PathNode.CurveTo(153.37259f, 24.0f, 148.0f, 29.372583f, 148.0f, 36.0f),
                    PathNode.CurveTo(148.0f, 42.62742f, 153.37259f, 48.0f, 160.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 72.0f),
                    PathNode.CurveTo(202.62741f, 72.0f, 208.0f, 66.62742f, 208.0f, 60.0f),
                    PathNode.CurveTo(208.0f, 53.37258f, 202.62741f, 48.0f, 196.0f, 48.0f),
                    PathNode.CurveTo(189.37259f, 48.0f, 184.0f, 53.37258f, 184.0f, 60.0f),
                    PathNode.CurveTo(184.0f, 66.62742f, 189.37259f, 72.0f, 196.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 108.0f),
                    PathNode.CurveTo(226.62741f, 108.0f, 232.0f, 102.62742f, 232.0f, 96.0f),
                    PathNode.CurveTo(232.0f, 89.37258f, 226.62741f, 84.0f, 220.0f, 84.0f),
                    PathNode.CurveTo(213.37259f, 84.0f, 208.0f, 89.37258f, 208.0f, 96.0f),
                    PathNode.CurveTo(208.0f, 102.62742f, 213.37259f, 108.0f, 220.0f, 108.0f),
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
        return _clockCountdown!!
    }

private var _clockCountdown: ImageVector? = null
