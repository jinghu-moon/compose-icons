package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CalendarSlash: ImageVector
    get() {
        if (_calendarSlash != null) return _calendarSlash!!
        _calendarSlash = phosphorFillIcon(
            name = "CalendarSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(224.0f, 187.57f),
                    PathNode.CurveTo(224.02287f, 189.24353f, 223.00142f, 190.75436f, 221.43987f, 191.35667f),
                    PathNode.CurveTo(219.87831f, 191.95898f, 218.10686f, 191.52542f, 217.0f, 190.27f),
                    PathNode.LineTo(116.8f, 80.0f),
                    PathNode.LineTo(208.0f, 80.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.LineTo(184.0f, 48.0f),
                    PathNode.LineTo(184.0f, 56.0f),
                    PathNode.CurveTo(184.00468f, 58.214977f, 183.09084f, 60.332767f, 181.4761f, 61.848946f),
                    PathNode.CurveTo(179.86137f, 63.365124f, 177.69029f, 64.14398f, 175.48f, 64.0f),
                    PathNode.CurveTo(171.20291f, 63.633106f, 167.93706f, 60.022335f, 168.0f, 55.73f),
                    PathNode.LineTo(168.0f, 48.0f),
                    PathNode.LineTo(87.71f, 48.0f),
                    PathNode.LineTo(79.25f, 38.69f),
                    PathNode.CurveTo(78.1804f, 37.513046f, 77.909645f, 35.81425f, 78.56038f, 34.36311f),
                    PathNode.CurveTo(79.21112f, 32.91197f, 80.65971f, 31.984179f, 82.25f, 32.0f),
                    PathNode.LineTo(168.0f, 32.0f),
                    PathNode.LineTo(168.0f, 24.0f),
                    PathNode.CurveTo(167.99532f, 21.78502f, 168.90916f, 19.667233f, 170.5239f, 18.151054f),
                    PathNode.CurveTo(172.13863f, 16.634876f, 174.30971f, 15.856021f, 176.52f, 16.0f),
                    PathNode.CurveTo(180.79709f, 16.366894f, 184.06294f, 19.977665f, 184.0f, 24.27f),
                    PathNode.LineTo(184.0f, 32.0f),
                    PathNode.LineTo(208.0f, 32.0f),
                    PathNode.CurveTo(216.83656f, 32.0f, 224.0f, 39.163445f, 224.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(213.92f, 210.62f),
                    PathNode.CurveTo(216.04918f, 212.9632f, 216.59616f, 216.34161f, 215.31511f, 219.23692f),
                    PathNode.CurveTo(214.03407f, 222.13223f, 211.16606f, 223.9997f, 208.0f, 224.0f),
                    PathNode.LineTo(48.0f, 224.0f),
                    PathNode.CurveTo(39.163445f, 224.0f, 32.0f, 216.83656f, 32.0f, 208.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(32.0f, 39.163445f, 39.163445f, 32.0f, 48.0f, 32.0f),
                    PathNode.CurveTo(50.25782f, 31.997398f, 52.411617f, 32.94899f, 53.93f, 34.62f),
                    PathNode.Close,
                    PathNode.MoveTo(73.55f, 80.0f),
                    PathNode.LineTo(48.0f, 51.89f),
                    PathNode.LineTo(48.0f, 80.0f),
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
        return _calendarSlash!!
    }

private var _calendarSlash: ImageVector? = null
