package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Checks: ImageVector
    get() {
        if (_checks != null) return _checks!!
        _checks = phosphorThinIcon(
            name = "Checks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(146.8f, 82.85f),
                    PathNode.LineTo(57.2f, 170.85f),
                    PathNode.CurveTo(55.644627f, 172.37457f, 53.155373f, 172.37457f, 51.6f, 170.85f),
                    PathNode.LineTo(13.2f, 133.14f),
                    PathNode.CurveTo(11.685595f, 131.5827f, 11.690849f, 129.10141f, 13.211836f, 127.550545f),
                    PathNode.CurveTo(14.732822f, 125.99969f, 17.213549f, 125.94617f, 18.8f, 127.43f),
                    PathNode.LineTo(54.4f, 162.43f),
                    PathNode.LineTo(141.2f, 77.19f),
                    PathNode.CurveTo(142.79277f, 75.76999f, 145.21976f, 75.850266f, 146.71521f, 77.37243f),
                    PathNode.CurveTo(148.21066f, 78.894585f, 148.24797f, 81.32261f, 146.8f, 82.89f),
                    PathNode.Close,
                    PathNode.MoveTo(242.8f, 77.2f),
                    PathNode.CurveTo(241.2387f, 75.64246f, 238.71129f, 75.64246f, 237.15f, 77.2f),
                    PathNode.LineTo(150.35f, 162.44f),
                    PathNode.LineTo(128.72f, 141.2f),
                    PathNode.CurveTo(127.710045f, 140.1564f, 126.2138f, 139.7422f, 124.81095f, 140.11786f),
                    PathNode.CurveTo(123.408104f, 140.49352f, 122.31907f, 141.60002f, 121.96578f, 143.00867f),
                    PathNode.CurveTo(121.612495f, 144.41731f, 122.05046f, 145.90678f, 123.11f, 146.9f),
                    PathNode.LineTo(147.55f, 170.9f),
                    PathNode.CurveTo(149.10538f, 172.42458f, 151.59462f, 172.42458f, 153.15f, 170.9f),
                    PathNode.LineTo(242.75f, 82.9f),
                    PathNode.CurveTo(243.52678f, 82.16165f, 243.97478f, 81.14247f, 243.99359f, 80.07094f),
                    PathNode.CurveTo(244.01237f, 78.999405f, 243.6004f, 77.96514f, 242.85f, 77.2f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _checks!!
    }

private var _checks: ImageVector? = null
