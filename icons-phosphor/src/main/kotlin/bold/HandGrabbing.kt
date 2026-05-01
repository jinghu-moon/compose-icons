package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HandGrabbing: ImageVector
    get() {
        if (_handGrabbing != null) return _handGrabbing!!
        _handGrabbing = phosphorBoldIcon(
            name = "HandGrabbing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(188.0f, 76.0f),
                    PathNode.CurveTo(184.17352f, 75.98786f, 180.37619f, 76.66536f, 176.79f, 78.0f),
                    PathNode.CurveTo(172.53925f, 69.24536f, 164.53549f, 62.900906f, 155.04175f, 60.760483f),
                    PathNode.CurveTo(145.548f, 58.620064f, 135.59615f, 60.916317f, 128.0f, 67.0f),
                    PathNode.CurveTo(118.39298f, 59.308224f, 105.226135f, 57.807426f, 94.134575f, 63.139908f),
                    PathNode.CurveTo(83.04301f, 68.47239f, 75.9923f, 79.69317f, 76.0f, 92.0f),
                    PathNode.LineTo(76.0f, 108.0f),
                    PathNode.LineTo(68.0f, 108.0f),
                    PathNode.CurveTo(50.32689f, 108.0f, 36.0f, 122.32689f, 36.0f, 140.0f),
                    PathNode.LineTo(36.0f, 152.0f),
                    PathNode.CurveTo(36.0f, 202.8102f, 77.18981f, 244.0f, 128.0f, 244.0f),
                    PathNode.CurveTo(178.8102f, 244.0f, 220.0f, 202.8102f, 220.0f, 152.0f),
                    PathNode.LineTo(220.0f, 108.0f),
                    PathNode.CurveTo(220.0f, 90.32689f, 205.67311f, 76.0f, 188.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 152.0f),
                    PathNode.CurveTo(196.0f, 189.55536f, 165.55536f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(90.44463f, 220.0f, 60.0f, 189.55536f, 60.0f, 152.0f),
                    PathNode.LineTo(60.0f, 140.0f),
                    PathNode.CurveTo(60.0f, 135.58173f, 63.581722f, 132.0f, 68.0f, 132.0f),
                    PathNode.LineTo(76.0f, 132.0f),
                    PathNode.LineTo(76.0f, 152.0f),
                    PathNode.CurveTo(76.0f, 158.62741f, 81.37258f, 164.0f, 88.0f, 164.0f),
                    PathNode.CurveTo(94.62742f, 164.0f, 100.0f, 158.62741f, 100.0f, 152.0f),
                    PathNode.LineTo(100.0f, 92.0f),
                    PathNode.CurveTo(100.0f, 87.58172f, 103.58172f, 84.0f, 108.0f, 84.0f),
                    PathNode.CurveTo(112.41828f, 84.0f, 116.0f, 87.58172f, 116.0f, 92.0f),
                    PathNode.LineTo(116.0f, 120.0f),
                    PathNode.CurveTo(116.0f, 126.62742f, 121.37258f, 132.0f, 128.0f, 132.0f),
                    PathNode.CurveTo(134.62741f, 132.0f, 140.0f, 126.62742f, 140.0f, 120.0f),
                    PathNode.LineTo(140.0f, 92.0f),
                    PathNode.CurveTo(140.0f, 87.58172f, 143.58173f, 84.0f, 148.0f, 84.0f),
                    PathNode.CurveTo(152.41827f, 84.0f, 156.0f, 87.58172f, 156.0f, 92.0f),
                    PathNode.LineTo(156.0f, 120.0f),
                    PathNode.CurveTo(156.0f, 126.62742f, 161.37259f, 132.0f, 168.0f, 132.0f),
                    PathNode.CurveTo(174.62741f, 132.0f, 180.0f, 126.62742f, 180.0f, 120.0f),
                    PathNode.LineTo(180.0f, 108.0f),
                    PathNode.CurveTo(180.0f, 103.58172f, 183.58173f, 100.0f, 188.0f, 100.0f),
                    PathNode.CurveTo(192.41827f, 100.0f, 196.0f, 103.58172f, 196.0f, 108.0f),
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
        return _handGrabbing!!
    }

private var _handGrabbing: ImageVector? = null
