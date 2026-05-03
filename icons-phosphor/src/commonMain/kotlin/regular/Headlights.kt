package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Headlights: ImageVector
    get() {
        if (_headlights != null) return _headlights!!
        _headlights = phosphorRegularIcon(
            name = "Headlights",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 80.0f),
                    PathNode.CurveTo(160.0f, 75.58172f, 163.58173f, 72.0f, 168.0f, 72.0f),
                    PathNode.LineTo(240.0f, 72.0f),
                    PathNode.CurveTo(244.41827f, 72.0f, 248.0f, 75.58172f, 248.0f, 80.0f),
                    PathNode.CurveTo(248.0f, 84.41828f, 244.41827f, 88.0f, 240.0f, 88.0f),
                    PathNode.LineTo(168.0f, 88.0f),
                    PathNode.CurveTo(163.58173f, 88.0f, 160.0f, 84.41828f, 160.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 168.0f),
                    PathNode.LineTo(168.0f, 168.0f),
                    PathNode.CurveTo(163.58173f, 168.0f, 160.0f, 171.58173f, 160.0f, 176.0f),
                    PathNode.CurveTo(160.0f, 180.41827f, 163.58173f, 184.0f, 168.0f, 184.0f),
                    PathNode.LineTo(240.0f, 184.0f),
                    PathNode.CurveTo(244.41827f, 184.0f, 248.0f, 180.41827f, 248.0f, 176.0f),
                    PathNode.CurveTo(248.0f, 171.58173f, 244.41827f, 168.0f, 240.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 104.0f),
                    PathNode.LineTo(168.0f, 104.0f),
                    PathNode.CurveTo(163.58173f, 104.0f, 160.0f, 107.58172f, 160.0f, 112.0f),
                    PathNode.CurveTo(160.0f, 116.41828f, 163.58173f, 120.0f, 168.0f, 120.0f),
                    PathNode.LineTo(240.0f, 120.0f),
                    PathNode.CurveTo(244.41827f, 120.0f, 248.0f, 116.41828f, 248.0f, 112.0f),
                    PathNode.CurveTo(248.0f, 107.58172f, 244.41827f, 104.0f, 240.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 136.0f),
                    PathNode.LineTo(168.0f, 136.0f),
                    PathNode.CurveTo(163.58173f, 136.0f, 160.0f, 139.58173f, 160.0f, 144.0f),
                    PathNode.CurveTo(160.0f, 148.41827f, 163.58173f, 152.0f, 168.0f, 152.0f),
                    PathNode.LineTo(240.0f, 152.0f),
                    PathNode.CurveTo(244.41827f, 152.0f, 248.0f, 148.41827f, 248.0f, 144.0f),
                    PathNode.CurveTo(248.0f, 139.58173f, 244.41827f, 136.0f, 240.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 64.0f),
                    PathNode.LineTo(144.0f, 192.0f),
                    PathNode.CurveTo(144.0f, 200.83656f, 136.83656f, 208.0f, 128.0f, 208.0f),
                    PathNode.LineTo(88.0f, 208.0f),
                    PathNode.CurveTo(66.67657f, 208.00063f, 46.235264f, 199.48839f, 31.214693f, 184.35329f),
                    PathNode.CurveTo(16.194124f, 169.21819f, 7.837409f, 148.71281f, 8.0f, 127.39f),
                    PathNode.CurveTo(8.33f, 83.62f, 44.62f, 48.0f, 88.9f, 48.0f),
                    PathNode.LineTo(128.0f, 48.0f),
                    PathNode.CurveTo(136.83656f, 48.0f, 144.0f, 55.163445f, 144.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 64.0f),
                    PathNode.LineTo(88.9f, 64.0f),
                    PathNode.CurveTo(53.38f, 64.0f, 24.26f, 92.49f, 24.0f, 127.51f),
                    PathNode.CurveTo(23.86939f, 144.56859f, 30.554527f, 160.9734f, 42.57104f, 173.08192f),
                    PathNode.CurveTo(54.587555f, 185.19044f, 70.9409f, 192.0005f, 88.0f, 192.0f),
                    PathNode.LineTo(128.0f, 192.0f),
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
        return _headlights!!
    }

private var _headlights: ImageVector? = null
