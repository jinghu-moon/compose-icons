package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CalendarSlash: ImageVector
    get() {
        if (_calendarSlash != null) return _calendarSlash!!
        _calendarSlash = phosphorThinIcon(
            name = "CalendarSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(51.0f, 37.31f),
                    PathNode.CurveTo(50.232643f, 36.465397f, 49.141083f, 35.98875f, 48.0f, 36.0f),
                    PathNode.CurveTo(41.37258f, 36.0f, 36.0f, 41.37258f, 36.0f, 48.0f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 214.62741f, 41.37258f, 220.0f, 48.0f, 220.0f),
                    PathNode.LineTo(208.0f, 220.0f),
                    PathNode.CurveTo(209.59029f, 220.01582f, 211.03888f, 219.08803f, 211.68962f, 217.63689f),
                    PathNode.CurveTo(212.34035f, 216.18575f, 212.0696f, 214.48695f, 211.0f, 213.31f),
                    PathNode.Close,
                    PathNode.MoveTo(46.54f, 44.31f),
                    PathNode.LineTo(82.59f, 84.0f),
                    PathNode.LineTo(44.0f, 84.0f),
                    PathNode.LineTo(44.0f, 48.0f),
                    PathNode.CurveTo(43.999226f, 46.36936f, 44.988358f, 44.90149f, 46.5f, 44.29f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 212.0f),
                    PathNode.CurveTo(45.79086f, 212.0f, 44.0f, 210.20914f, 44.0f, 208.0f),
                    PathNode.LineTo(44.0f, 92.0f),
                    PathNode.LineTo(89.87f, 92.0f),
                    PathNode.LineTo(199.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 48.0f),
                    PathNode.LineTo(220.0f, 177.23f),
                    PathNode.CurveTo(220.0f, 179.43913f, 218.20914f, 181.23f, 216.0f, 181.23f),
                    PathNode.CurveTo(213.79086f, 181.23f, 212.0f, 179.43913f, 212.0f, 177.23f),
                    PathNode.LineTo(212.0f, 92.0f),
                    PathNode.LineTo(134.88f, 92.0f),
                    PathNode.CurveTo(132.67087f, 92.0f, 130.88f, 90.20914f, 130.88f, 88.0f),
                    PathNode.CurveTo(130.88f, 85.79086f, 132.67087f, 84.0f, 134.88f, 84.0f),
                    PathNode.LineTo(212.0f, 84.0f),
                    PathNode.LineTo(212.0f, 48.0f),
                    PathNode.CurveTo(212.0f, 45.79086f, 210.20914f, 44.0f, 208.0f, 44.0f),
                    PathNode.LineTo(180.0f, 44.0f),
                    PathNode.LineTo(180.0f, 56.0f),
                    PathNode.CurveTo(180.0f, 58.20914f, 178.20914f, 60.0f, 176.0f, 60.0f),
                    PathNode.CurveTo(173.79086f, 60.0f, 172.0f, 58.20914f, 172.0f, 56.0f),
                    PathNode.LineTo(172.0f, 44.0f),
                    PathNode.LineTo(91.25f, 44.0f),
                    PathNode.CurveTo(89.04086f, 44.0f, 87.25f, 42.20914f, 87.25f, 40.0f),
                    PathNode.CurveTo(87.25f, 37.79086f, 89.04086f, 36.0f, 91.25f, 36.0f),
                    PathNode.LineTo(172.0f, 36.0f),
                    PathNode.LineTo(172.0f, 24.0f),
                    PathNode.CurveTo(172.0f, 21.790861f, 173.79086f, 20.0f, 176.0f, 20.0f),
                    PathNode.CurveTo(178.20914f, 20.0f, 180.0f, 21.790861f, 180.0f, 24.0f),
                    PathNode.LineTo(180.0f, 36.0f),
                    PathNode.LineTo(208.0f, 36.0f),
                    PathNode.CurveTo(214.62741f, 36.0f, 220.0f, 41.37258f, 220.0f, 48.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _calendarSlash!!
    }

private var _calendarSlash: ImageVector? = null
