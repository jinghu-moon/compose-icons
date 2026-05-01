package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CalendarStar: ImageVector
    get() {
        if (_calendarStar != null) return _calendarStar!!
        _calendarStar = phosphorFillIcon(
            name = "CalendarStar",
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
                    PathNode.MoveTo(72.0f, 64.0f),
                    PathNode.LineTo(72.0f, 56.0f),
                    PathNode.CurveTo(72.0f, 51.581722f, 75.58172f, 48.0f, 80.0f, 48.0f),
                    PathNode.CurveTo(84.41828f, 48.0f, 88.0f, 51.581722f, 88.0f, 56.0f),
                    PathNode.LineTo(88.0f, 64.0f),
                    PathNode.CurveTo(88.0f, 68.41828f, 84.41828f, 72.0f, 80.0f, 72.0f),
                    PathNode.CurveTo(75.58172f, 72.0f, 72.0f, 68.41828f, 72.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(178.55f, 124.7f),
                    PathNode.LineTo(154.09f, 144.89f),
                    PathNode.LineTo(161.55f, 175.0f),
                    PathNode.CurveTo(161.9382f, 176.56322f, 161.35094f, 178.20677f, 160.06f, 179.17f),
                    PathNode.CurveTo(159.36746f, 179.68051f, 158.53035f, 179.95721f, 157.67f, 179.96f),
                    PathNode.CurveTo(156.96655f, 179.95572f, 156.2767f, 179.766f, 155.67f, 179.41f),
                    PathNode.LineTo(128.0f, 163.18f),
                    PathNode.LineTo(100.36f, 179.45f),
                    PathNode.CurveTo(98.96534f, 180.2765f, 97.209724f, 180.17952f, 95.91462f, 179.20436f),
                    PathNode.CurveTo(94.61952f, 178.2292f, 94.0411f, 176.56876f, 94.45f, 175.0f),
                    PathNode.LineTo(101.91f, 144.85f),
                    PathNode.LineTo(77.45f, 124.7f),
                    PathNode.CurveTo(76.18674f, 123.66254f, 75.68187f, 121.960785f, 76.174965f, 120.402245f),
                    PathNode.CurveTo(76.66806f, 118.84371f, 78.05988f, 117.74204f, 79.69f, 117.62f),
                    PathNode.LineTo(111.93f, 115.13f),
                    PathNode.LineTo(124.33f, 86.42f),
                    PathNode.CurveTo(124.96402f, 84.957436f, 126.40592f, 84.01094f, 128.0f, 84.01094f),
                    PathNode.CurveTo(129.59407f, 84.01094f, 131.03598f, 84.957436f, 131.67f, 86.42f),
                    PathNode.LineTo(144.07f, 115.13f),
                    PathNode.LineTo(176.31f, 117.62f),
                    PathNode.CurveTo(177.94012f, 117.74204f, 179.33194f, 118.84371f, 179.82504f, 120.402245f),
                    PathNode.CurveTo(180.31813f, 121.960785f, 179.81326f, 123.66254f, 178.55f, 124.7f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 64.0f),
                    PathNode.CurveTo(184.0f, 68.41828f, 180.41827f, 72.0f, 176.0f, 72.0f),
                    PathNode.CurveTo(171.58173f, 72.0f, 168.0f, 68.41828f, 168.0f, 64.0f),
                    PathNode.LineTo(168.0f, 56.0f),
                    PathNode.CurveTo(168.0f, 51.581722f, 171.58173f, 48.0f, 176.0f, 48.0f),
                    PathNode.CurveTo(180.41827f, 48.0f, 184.0f, 51.581722f, 184.0f, 56.0f),
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
        return _calendarStar!!
    }

private var _calendarStar: ImageVector? = null
