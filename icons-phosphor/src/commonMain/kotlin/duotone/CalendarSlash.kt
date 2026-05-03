package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CalendarSlash: ImageVector
    get() {
        if (_calendarSlash != null) return _calendarSlash!!
        _calendarSlash = phosphorDuotoneIcon(
            name = "CalendarSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 48.0f),
                    PathNode.LineTo(216.0f, 88.0f),
                    PathNode.LineTo(40.0f, 88.0f),
                    PathNode.LineTo(40.0f, 48.0f),
                    PathNode.CurveTo(40.0f, 43.581722f, 43.581722f, 40.0f, 48.0f, 40.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(212.41827f, 40.0f, 216.0f, 43.581722f, 216.0f, 48.0f),
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
                    PathNode.MoveTo(53.92f, 34.62f),
                    PathNode.CurveTo(52.403957f, 32.95157f, 50.25434f, 32.000217f, 48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(211.16606f, 223.9997f, 214.03407f, 222.13223f, 215.31511f, 219.23692f),
                    PathNode.CurveTo(216.59616f, 216.34161f, 216.04918f, 212.9632f, 213.92f, 210.62f),
                    PathNode.Close,
                    PathNode.MoveTo(73.55f, 80.0f),
                    PathNode.LineTo(48.0f, 80.0f),
                    PathNode.LineTo(48.0f, 51.88f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 96.0f),
                    PathNode.LineTo(88.1f, 96.0f),
                    PathNode.LineTo(189.92f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(224.0f, 177.23f),
                    PathNode.CurveTo(224.0f, 181.64828f, 220.41827f, 185.23f, 216.0f, 185.23f),
                    PathNode.CurveTo(211.58173f, 185.23f, 208.0f, 181.64828f, 208.0f, 177.23f),
                    PathNode.LineTo(208.0f, 96.0f),
                    PathNode.LineTo(134.88f, 96.0f),
                    PathNode.CurveTo(130.46172f, 96.0f, 126.88f, 92.41828f, 126.88f, 88.0f),
                    PathNode.CurveTo(126.88f, 83.58172f, 130.46172f, 80.0f, 134.88f, 80.0f),
                    PathNode.LineTo(208.0f, 80.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.LineTo(184.0f, 48.0f),
                    PathNode.LineTo(184.0f, 56.0f),
                    PathNode.CurveTo(184.0f, 60.418278f, 180.41827f, 64.0f, 176.0f, 64.0f),
                    PathNode.CurveTo(171.58173f, 64.0f, 168.0f, 60.418278f, 168.0f, 56.0f),
                    PathNode.LineTo(168.0f, 48.0f),
                    PathNode.LineTo(91.25f, 48.0f),
                    PathNode.CurveTo(86.83172f, 48.0f, 83.25f, 44.418278f, 83.25f, 40.0f),
                    PathNode.CurveTo(83.25f, 35.581722f, 86.83172f, 32.0f, 91.25f, 32.0f),
                    PathNode.LineTo(168.0f, 32.0f),
                    PathNode.LineTo(168.0f, 24.0f),
                    PathNode.CurveTo(168.0f, 19.581722f, 171.58173f, 16.0f, 176.0f, 16.0f),
                    PathNode.CurveTo(180.41827f, 16.0f, 184.0f, 19.581722f, 184.0f, 24.0f),
                    PathNode.LineTo(184.0f, 32.0f),
                    PathNode.LineTo(208.0f, 32.0f),
                    PathNode.CurveTo(216.83656f, 32.0f, 224.0f, 39.163445f, 224.0f, 48.0f),
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
        return _calendarSlash!!
    }

private var _calendarSlash: ImageVector? = null
