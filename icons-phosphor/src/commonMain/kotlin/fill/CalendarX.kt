package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CalendarX: ImageVector
    get() {
        if (_calendarX != null) return _calendarX!!
        _calendarX = phosphorFillIcon(
            name = "CalendarX",
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
                    PathNode.MoveTo(157.66f, 170.34f),
                    PathNode.CurveTo(160.78593f, 173.46593f, 160.78593f, 178.53407f, 157.66f, 181.66f),
                    PathNode.CurveTo(154.53407f, 184.78593f, 149.46593f, 184.78593f, 146.34f, 181.66f),
                    PathNode.LineTo(128.0f, 163.31f),
                    PathNode.LineTo(109.66f, 181.66f),
                    PathNode.CurveTo(106.534065f, 184.78593f, 101.465935f, 184.78593f, 98.34f, 181.66f),
                    PathNode.CurveTo(95.214066f, 178.53407f, 95.214066f, 173.46593f, 98.34f, 170.34f),
                    PathNode.LineTo(116.69f, 152.0f),
                    PathNode.LineTo(98.34f, 133.66f),
                    PathNode.CurveTo(95.214066f, 130.53407f, 95.214066f, 125.465935f, 98.34f, 122.34f),
                    PathNode.CurveTo(101.465935f, 119.214066f, 106.534065f, 119.214066f, 109.66f, 122.34f),
                    PathNode.LineTo(128.0f, 140.69f),
                    PathNode.LineTo(146.34f, 122.34f),
                    PathNode.CurveTo(149.46593f, 119.214066f, 154.53407f, 119.214066f, 157.66f, 122.34f),
                    PathNode.CurveTo(160.78593f, 125.465935f, 160.78593f, 130.53407f, 157.66f, 133.66f),
                    PathNode.LineTo(139.31f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 80.0f),
                    PathNode.LineTo(48.0f, 80.0f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.LineTo(72.0f, 48.0f),
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
        return _calendarX!!
    }

private var _calendarX: ImageVector? = null
