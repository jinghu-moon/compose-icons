package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CalendarDots: ImageVector
    get() {
        if (_calendarDots != null) return _calendarDots!!
        _calendarDots = phosphorRegularIcon(
            name = "CalendarDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(184.0f, 32.0f),
                    PathNode.LineTo(184.0f, 24.0f),
                    PathNode.CurveTo(184.0f, 19.581722f, 180.41827f, 16.0f, 176.0f, 16.0f),
                    PathNode.CurveTo(171.58173f, 16.0f, 168.0f, 19.581722f, 168.0f, 24.0f),
                    PathNode.LineTo(168.0f, 32.0f),
                    PathNode.LineTo(88.0f, 32.0f),
                    PathNode.LineTo(88.0f, 24.0f),
                    PathNode.CurveTo(88.0f, 19.581722f, 84.41828f, 16.0f, 80.0f, 16.0f),
                    PathNode.CurveTo(75.58172f, 16.0f, 72.0f, 19.581722f, 72.0f, 24.0f),
                    PathNode.LineTo(72.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 48.0f),
                    PathNode.LineTo(72.0f, 56.0f),
                    PathNode.CurveTo(72.0f, 60.418278f, 75.58172f, 64.0f, 80.0f, 64.0f),
                    PathNode.CurveTo(84.41828f, 64.0f, 88.0f, 60.418278f, 88.0f, 56.0f),
                    PathNode.LineTo(88.0f, 48.0f),
                    PathNode.LineTo(168.0f, 48.0f),
                    PathNode.LineTo(168.0f, 56.0f),
                    PathNode.CurveTo(168.0f, 60.418278f, 171.58173f, 64.0f, 176.0f, 64.0f),
                    PathNode.CurveTo(180.41827f, 64.0f, 184.0f, 60.418278f, 184.0f, 56.0f),
                    PathNode.LineTo(184.0f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.LineTo(208.0f, 80.0f),
                    PathNode.LineTo(48.0f, 80.0f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 96.0f),
                    PathNode.LineTo(208.0f, 96.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 132.0f),
                    PathNode.CurveTo(140.0f, 138.62741f, 134.62741f, 144.0f, 128.0f, 144.0f),
                    PathNode.CurveTo(121.37258f, 144.0f, 116.0f, 138.62741f, 116.0f, 132.0f),
                    PathNode.CurveTo(116.0f, 125.37258f, 121.37258f, 120.0f, 128.0f, 120.0f),
                    PathNode.CurveTo(134.62741f, 120.0f, 140.0f, 125.37258f, 140.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 132.0f),
                    PathNode.CurveTo(184.0f, 138.62741f, 178.62741f, 144.0f, 172.0f, 144.0f),
                    PathNode.CurveTo(165.37259f, 144.0f, 160.0f, 138.62741f, 160.0f, 132.0f),
                    PathNode.CurveTo(160.0f, 125.37258f, 165.37259f, 120.0f, 172.0f, 120.0f),
                    PathNode.CurveTo(178.62741f, 120.0f, 184.0f, 125.37258f, 184.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 172.0f),
                    PathNode.CurveTo(96.0f, 178.62741f, 90.62742f, 184.0f, 84.0f, 184.0f),
                    PathNode.CurveTo(77.37258f, 184.0f, 72.0f, 178.62741f, 72.0f, 172.0f),
                    PathNode.CurveTo(72.0f, 165.37259f, 77.37258f, 160.0f, 84.0f, 160.0f),
                    PathNode.CurveTo(90.62742f, 160.0f, 96.0f, 165.37259f, 96.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 172.0f),
                    PathNode.CurveTo(140.0f, 178.62741f, 134.62741f, 184.0f, 128.0f, 184.0f),
                    PathNode.CurveTo(121.37258f, 184.0f, 116.0f, 178.62741f, 116.0f, 172.0f),
                    PathNode.CurveTo(116.0f, 165.37259f, 121.37258f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(134.62741f, 160.0f, 140.0f, 165.37259f, 140.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 172.0f),
                    PathNode.CurveTo(184.0f, 178.62741f, 178.62741f, 184.0f, 172.0f, 184.0f),
                    PathNode.CurveTo(165.37259f, 184.0f, 160.0f, 178.62741f, 160.0f, 172.0f),
                    PathNode.CurveTo(160.0f, 165.37259f, 165.37259f, 160.0f, 172.0f, 160.0f),
                    PathNode.CurveTo(178.62741f, 160.0f, 184.0f, 165.37259f, 184.0f, 172.0f),
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
        return _calendarDots!!
    }

private var _calendarDots: ImageVector? = null
