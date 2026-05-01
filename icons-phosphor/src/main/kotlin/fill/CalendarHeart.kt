package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CalendarHeart: ImageVector
    get() {
        if (_calendarHeart != null) return _calendarHeart!!
        _calendarHeart = phosphorFillIcon(
            name = "CalendarHeart",
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
                    PathNode.MoveTo(154.56f, 167.07f),
                    PathNode.CurveTo(146.89793f, 173.41704f, 138.59662f, 178.95013f, 129.79f, 183.58f),
                    PathNode.CurveTo(128.66327f, 184.14381f, 127.33674f, 184.14381f, 126.21f, 183.58f),
                    PathNode.CurveTo(117.40338f, 178.95013f, 109.10207f, 173.41704f, 101.44f, 167.07f),
                    PathNode.CurveTo(84.56f, 153.0f, 76.0f, 138.51f, 76.0f, 124.0f),
                    PathNode.CurveTo(76.00548f, 111.42032f, 84.39975f, 100.38851f, 96.52256f, 97.0291f),
                    PathNode.CurveTo(108.64538f, 93.66968f, 121.52048f, 98.80741f, 128.0f, 109.59f),
                    PathNode.CurveTo(134.47952f, 98.80741f, 147.35461f, 93.66968f, 159.47745f, 97.0291f),
                    PathNode.CurveTo(171.60025f, 100.38851f, 179.99452f, 111.42032f, 180.0f, 124.0f),
                    PathNode.CurveTo(180.0f, 138.51f, 171.44f, 153.0f, 154.56f, 167.07f),
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
        return _calendarHeart!!
    }

private var _calendarHeart: ImageVector? = null
