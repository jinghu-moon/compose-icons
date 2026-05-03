package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ClockClockwise: ImageVector
    get() {
        if (_clockClockwise != null) return _clockClockwise!!
        _clockClockwise = phosphorRegularIcon(
            name = "ClockClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(136.0f, 80.0f),
                    PathNode.LineTo(136.0f, 123.47f),
                    PathNode.LineTo(172.12f, 145.14f),
                    PathNode.CurveTo(175.90868f, 147.41542f, 177.1354f, 152.33133f, 174.86f, 156.12f),
                    PathNode.CurveTo(172.58458f, 159.90868f, 167.66867f, 161.1354f, 163.88f, 158.86f),
                    PathNode.LineTo(123.88f, 134.86f),
                    PathNode.CurveTo(121.471886f, 133.41321f, 119.99913f, 130.80931f, 120.0f, 128.0f),
                    PathNode.LineTo(120.0f, 80.0f),
                    PathNode.CurveTo(120.0f, 75.58172f, 123.58172f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(132.41827f, 72.0f, 136.0f, 75.58172f, 136.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 56.0f),
                    PathNode.CurveTo(219.58173f, 56.0f, 216.0f, 59.581722f, 216.0f, 64.0f),
                    PathNode.LineTo(216.0f, 82.0f),
                    PathNode.CurveTo(209.65f, 74.64f, 203.17f, 67.55f, 195.88f, 60.17f),
                    PathNode.CurveTo(158.64716f, 22.933075f, 98.367775f, 22.639046f, 60.77345f, 59.510986f),
                    PathNode.CurveTo(23.179125f, 96.38293f, 22.303688f, 156.65668f, 58.8113f, 194.60492f),
                    PathNode.CurveTo(95.31891f, 232.55312f, 155.5814f, 234.00989f, 193.88f, 197.87f),
                    PathNode.CurveTo(197.0943f, 194.83243f, 197.23756f, 189.7643f, 194.2f, 186.55f),
                    PathNode.CurveTo(191.16243f, 183.33571f, 186.0943f, 183.19243f, 182.88f, 186.23f),
                    PathNode.CurveTo(150.95583f, 216.31564f, 100.75832f, 215.0816f, 70.35104f, 183.46362f),
                    PathNode.CurveTo(39.943756f, 151.84566f, 40.669563f, 101.63822f, 71.978096f, 70.91242f),
                    PathNode.CurveTo(103.28662f, 40.186623f, 153.49883f, 40.404125f, 184.54f, 71.4f),
                    PathNode.CurveTo(192.68f, 79.64f, 199.81f, 87.58f, 207.0f, 96.0f),
                    PathNode.LineTo(184.0f, 96.0f),
                    PathNode.CurveTo(179.58173f, 96.0f, 176.0f, 99.58172f, 176.0f, 104.0f),
                    PathNode.CurveTo(176.0f, 108.41828f, 179.58173f, 112.0f, 184.0f, 112.0f),
                    PathNode.LineTo(224.0f, 112.0f),
                    PathNode.CurveTo(228.41827f, 112.0f, 232.0f, 108.41828f, 232.0f, 104.0f),
                    PathNode.LineTo(232.0f, 64.0f),
                    PathNode.CurveTo(232.0f, 59.581722f, 228.41827f, 56.0f, 224.0f, 56.0f),
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
        return _clockClockwise!!
    }

private var _clockClockwise: ImageVector? = null
