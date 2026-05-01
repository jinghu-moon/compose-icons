package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CalendarHeart: ImageVector
    get() {
        if (_calendarHeart != null) return _calendarHeart!!
        _calendarHeart = phosphorRegularIcon(
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
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
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
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 88.0f),
                    PathNode.CurveTo(142.80936f, 87.99487f, 134.06277f, 91.952705f, 128.0f, 98.86f),
                    PathNode.CurveTo(119.20032f, 88.88209f, 105.145f, 85.38958f, 92.69845f, 90.08814f),
                    PathNode.CurveTo(80.2519f, 94.78671f, 72.01081f, 106.69613f, 72.0f, 120.0f),
                    PathNode.CurveTo(72.0f, 156.52f, 122.28f, 182.08f, 124.42f, 183.16f),
                    PathNode.CurveTo(126.67347f, 184.28764f, 129.32652f, 184.28764f, 131.58f, 183.16f),
                    PathNode.CurveTo(133.72f, 182.08f, 184.0f, 156.52f, 184.0f, 120.0f),
                    PathNode.CurveTo(184.0f, 102.32689f, 169.67311f, 88.0f, 152.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 166.93f),
                    PathNode.CurveTo(114.21f, 159.14f, 88.0f, 140.18f, 88.0f, 120.0f),
                    PathNode.CurveTo(88.0f, 111.163445f, 95.163445f, 104.0f, 104.0f, 104.0f),
                    PathNode.CurveTo(112.836555f, 104.0f, 120.0f, 111.163445f, 120.0f, 120.0f),
                    PathNode.CurveTo(120.0f, 124.41828f, 123.58172f, 128.0f, 128.0f, 128.0f),
                    PathNode.CurveTo(132.41827f, 128.0f, 136.0f, 124.41828f, 136.0f, 120.0f),
                    PathNode.CurveTo(136.0f, 111.163445f, 143.16344f, 104.0f, 152.0f, 104.0f),
                    PathNode.CurveTo(160.83656f, 104.0f, 168.0f, 111.163445f, 168.0f, 120.0f),
                    PathNode.CurveTo(168.0f, 140.19f, 141.79f, 159.15f, 128.0f, 166.93f),
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
        return _calendarHeart!!
    }

private var _calendarHeart: ImageVector? = null
