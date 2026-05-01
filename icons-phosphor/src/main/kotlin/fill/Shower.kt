package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Shower: ImageVector
    get() {
        if (_shower != null) return _shower!!
        _shower = phosphorFillIcon(
            name = "Shower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(64.0f, 236.0f),
                    PathNode.CurveTo(64.0f, 242.62741f, 58.62742f, 248.0f, 52.0f, 248.0f),
                    PathNode.CurveTo(45.37258f, 248.0f, 40.0f, 242.62741f, 40.0f, 236.0f),
                    PathNode.CurveTo(40.0f, 229.37259f, 45.37258f, 224.0f, 52.0f, 224.0f),
                    PathNode.CurveTo(58.62742f, 224.0f, 64.0f, 229.37259f, 64.0f, 236.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 192.0f),
                    PathNode.CurveTo(77.37258f, 192.0f, 72.0f, 197.37259f, 72.0f, 204.0f),
                    PathNode.CurveTo(72.0f, 210.62741f, 77.37258f, 216.0f, 84.0f, 216.0f),
                    PathNode.CurveTo(90.62742f, 216.0f, 96.0f, 210.62741f, 96.0f, 204.0f),
                    PathNode.CurveTo(96.0f, 197.37259f, 90.62742f, 192.0f, 84.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(20.0f, 192.0f),
                    PathNode.CurveTo(13.372583f, 192.0f, 8.0f, 197.37259f, 8.0f, 204.0f),
                    PathNode.CurveTo(8.0f, 210.62741f, 13.372583f, 216.0f, 20.0f, 216.0f),
                    PathNode.CurveTo(26.627417f, 216.0f, 32.0f, 210.62741f, 32.0f, 204.0f),
                    PathNode.CurveTo(32.0f, 197.37259f, 26.627417f, 192.0f, 20.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 160.0f),
                    PathNode.CurveTo(45.37258f, 160.0f, 40.0f, 165.37259f, 40.0f, 172.0f),
                    PathNode.CurveTo(40.0f, 178.62741f, 45.37258f, 184.0f, 52.0f, 184.0f),
                    PathNode.CurveTo(58.62742f, 184.0f, 64.0f, 178.62741f, 64.0f, 172.0f),
                    PathNode.CurveTo(64.0f, 165.37259f, 58.62742f, 160.0f, 52.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 32.0f),
                    PathNode.LineTo(216.0f, 32.0f),
                    PathNode.CurveTo(213.87762f, 31.998331f, 211.84158f, 32.84009f, 210.34f, 34.34f),
                    PathNode.LineTo(180.14f, 64.54f),
                    PathNode.LineTo(53.38f, 86.19f),
                    PathNode.CurveTo(47.465313f, 87.17226f, 42.596176f, 91.37889f, 40.765396f, 97.088234f),
                    PathNode.CurveTo(38.934612f, 102.79758f, 40.44948f, 109.05133f, 44.69f, 113.29f),
                    PathNode.LineTo(142.69f, 211.29f),
                    PathNode.CurveTo(146.92508f, 215.52374f, 153.16983f, 217.03813f, 158.87383f, 215.2147f),
                    PathNode.CurveTo(164.57782f, 213.39128f, 168.78612f, 208.53531f, 169.78f, 202.63f),
                    PathNode.LineTo(191.46f, 75.86f),
                    PathNode.LineTo(219.31f, 48.0f),
                    PathNode.LineTo(248.0f, 48.0f),
                    PathNode.CurveTo(252.41827f, 48.0f, 256.0f, 44.418278f, 256.0f, 40.0f),
                    PathNode.CurveTo(256.0f, 35.581722f, 252.41827f, 32.0f, 248.0f, 32.0f),
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
        return _shower!!
    }

private var _shower: ImageVector? = null
