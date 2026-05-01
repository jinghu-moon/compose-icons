package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TrafficSign: ImageVector
    get() {
        if (_trafficSign != null) return _trafficSign!!
        _trafficSign = phosphorBoldIcon(
            name = "TrafficSign",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(246.0f, 113.46f),
                    PathNode.LineTo(142.54f, 10.0f),
                    PathNode.CurveTo(134.5081f, 1.973828f, 121.4919f, 1.973828f, 113.46f, 10.0f),
                    PathNode.LineTo(10.0f, 113.46f),
                    PathNode.CurveTo(1.973828f, 121.4919f, 1.973828f, 134.5081f, 10.0f, 142.54f),
                    PathNode.LineTo(113.46f, 246.0f),
                    PathNode.LineTo(113.46f, 246.0f),
                    PathNode.CurveTo(121.4919f, 254.02617f, 134.5081f, 254.02617f, 142.54f, 246.0f),
                    PathNode.LineTo(246.0f, 142.54f),
                    PathNode.CurveTo(254.02617f, 134.5081f, 254.02617f, 121.4919f, 246.0f, 113.46f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 226.57f),
                    PathNode.LineTo(29.43f, 128.0f),
                    PathNode.LineTo(128.0f, 29.43f),
                    PathNode.LineTo(226.57f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(135.51f, 104.49f),
                    PathNode.CurveTo(130.81558f, 99.79558f, 130.81558f, 92.18442f, 135.51f, 87.49f),
                    PathNode.CurveTo(140.20442f, 82.79558f, 147.81558f, 82.79558f, 152.51f, 87.49f),
                    PathNode.LineTo(176.51f, 111.49f),
                    PathNode.CurveTo(178.76945f, 113.74162f, 180.03946f, 116.80018f, 180.03946f, 119.99f),
                    PathNode.CurveTo(180.03946f, 123.17982f, 178.76945f, 126.23838f, 176.51f, 128.49f),
                    PathNode.LineTo(152.51f, 152.49f),
                    PathNode.CurveTo(147.81558f, 157.18442f, 140.20442f, 157.18442f, 135.51f, 152.49f),
                    PathNode.CurveTo(130.81558f, 147.79558f, 130.81558f, 140.18442f, 135.51f, 135.49f),
                    PathNode.LineTo(139.0f, 132.0f),
                    PathNode.LineTo(112.0f, 132.0f),
                    PathNode.CurveTo(105.37258f, 132.0f, 100.0f, 137.37259f, 100.0f, 144.0f),
                    PathNode.LineTo(100.0f, 148.0f),
                    PathNode.CurveTo(100.0f, 154.62741f, 94.62742f, 160.0f, 88.0f, 160.0f),
                    PathNode.CurveTo(81.37258f, 160.0f, 76.0f, 154.62741f, 76.0f, 148.0f),
                    PathNode.LineTo(76.0f, 144.0f),
                    PathNode.CurveTo(76.0f, 124.11775f, 92.11775f, 108.0f, 112.0f, 108.0f),
                    PathNode.LineTo(139.0f, 108.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _trafficSign!!
    }

private var _trafficSign: ImageVector? = null
