package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CalendarCheck: ImageVector
    get() {
        if (_calendarCheck != null) return _calendarCheck!!
        _calendarCheck = phosphorRegularIcon(
            name = "CalendarCheck",
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
                    PathNode.MoveTo(169.66f, 122.34f),
                    PathNode.CurveTo(171.16223f, 123.840546f, 172.00629f, 125.876724f, 172.00629f, 128.0f),
                    PathNode.CurveTo(172.00629f, 130.12328f, 171.16223f, 132.15945f, 169.66f, 133.66f),
                    PathNode.LineTo(121.66f, 181.66f),
                    PathNode.CurveTo(120.159454f, 183.16223f, 118.123276f, 184.00629f, 116.0f, 184.00629f),
                    PathNode.CurveTo(113.876724f, 184.00629f, 111.840546f, 183.16223f, 110.34f, 181.66f),
                    PathNode.LineTo(86.34f, 157.66f),
                    PathNode.CurveTo(83.214066f, 154.53407f, 83.214066f, 149.46593f, 86.34f, 146.34f),
                    PathNode.CurveTo(89.465935f, 143.21407f, 94.534065f, 143.21407f, 97.66f, 146.34f),
                    PathNode.LineTo(116.0f, 164.69f),
                    PathNode.LineTo(158.34f, 122.34f),
                    PathNode.CurveTo(159.84055f, 120.83778f, 161.87672f, 119.993706f, 164.0f, 119.993706f),
                    PathNode.CurveTo(166.12328f, 119.993706f, 168.15945f, 120.83778f, 169.66f, 122.34f),
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
        return _calendarCheck!!
    }

private var _calendarCheck: ImageVector? = null
