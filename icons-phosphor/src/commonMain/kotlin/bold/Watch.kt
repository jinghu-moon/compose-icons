package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Watch: ImageVector
    get() {
        if (_watch != null) return _watch!!
        _watch = phosphorBoldIcon(
            name = "Watch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 128.0f),
                    PathNode.CurveTo(207.99916f, 104.6606f, 197.78703f, 82.48988f, 180.05f, 67.32f),
                    PathNode.LineTo(173.0f, 28.43f),
                    PathNode.CurveTo(171.27406f, 18.916157f, 162.98914f, 11.999419f, 153.32f, 12.0f),
                    PathNode.LineTo(102.68f, 12.0f),
                    PathNode.CurveTo(93.01087f, 11.999419f, 84.72594f, 18.916157f, 83.0f, 28.43f),
                    PathNode.LineTo(76.0f, 67.32f),
                    PathNode.CurveTo(58.261112f, 82.48867f, 48.04799f, 104.65997f, 48.04799f, 128.0f),
                    PathNode.CurveTo(48.04799f, 151.34003f, 58.261112f, 173.51132f, 76.0f, 188.68f),
                    PathNode.LineTo(83.0f, 227.57f),
                    PathNode.CurveTo(84.72594f, 237.08385f, 93.01087f, 244.00058f, 102.68f, 244.0f),
                    PathNode.LineTo(153.32f, 244.0f),
                    PathNode.CurveTo(162.98914f, 244.00058f, 171.27406f, 237.08385f, 173.0f, 227.57f),
                    PathNode.LineTo(180.05f, 188.68f),
                    PathNode.CurveTo(197.78703f, 173.51012f, 207.99916f, 151.3394f, 208.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(106.0f, 36.0f),
                    PathNode.LineTo(150.0f, 36.0f),
                    PathNode.LineTo(152.9f, 52.0f),
                    PathNode.CurveTo(136.73773f, 46.693638f, 119.30227f, 46.693638f, 103.14f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(150.0f, 220.0f),
                    PathNode.LineTo(106.0f, 220.0f),
                    PathNode.LineTo(103.1f, 204.0f),
                    PathNode.CurveTo(119.262276f, 209.30637f, 136.69774f, 209.30637f, 152.86f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 184.0f),
                    PathNode.CurveTo(97.07206f, 184.0f, 72.0f, 158.92795f, 72.0f, 128.0f),
                    PathNode.CurveTo(72.0f, 97.07206f, 97.07206f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(158.92795f, 72.0f, 184.0f, 97.07206f, 184.0f, 128.0f),
                    PathNode.CurveTo(183.96693f, 158.91423f, 158.91423f, 183.96693f, 128.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 128.0f),
                    PathNode.CurveTo(168.0f, 134.62741f, 162.62741f, 140.0f, 156.0f, 140.0f),
                    PathNode.LineTo(128.0f, 140.0f),
                    PathNode.CurveTo(121.37258f, 140.0f, 116.0f, 134.62741f, 116.0f, 128.0f),
                    PathNode.LineTo(116.0f, 100.0f),
                    PathNode.CurveTo(116.0f, 93.37258f, 121.37258f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(134.62741f, 88.0f, 140.0f, 93.37258f, 140.0f, 100.0f),
                    PathNode.LineTo(140.0f, 116.0f),
                    PathNode.LineTo(156.0f, 116.0f),
                    PathNode.CurveTo(162.62741f, 116.0f, 168.0f, 121.37258f, 168.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _watch!!
    }

private var _watch: ImageVector? = null
