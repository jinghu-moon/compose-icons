package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Synagogue: ImageVector
    get() {
        if (_synagogue != null) return _synagogue!!
        _synagogue = phosphorFillIcon(
            name = "Synagogue",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 57.38f),
                    PathNode.LineTo(208.0f, 32.0f),
                    PathNode.CurveTo(208.0f, 27.581722f, 204.41827f, 24.0f, 200.0f, 24.0f),
                    PathNode.CurveTo(195.58173f, 24.0f, 192.0f, 27.581722f, 192.0f, 32.0f),
                    PathNode.LineTo(192.0f, 57.38f),
                    PathNode.CurveTo(182.41345f, 60.769356f, 176.00314f, 69.83194f, 176.0f, 80.0f),
                    PathNode.LineTo(176.0f, 122.21f),
                    PathNode.LineTo(136.0f, 99.36f),
                    PathNode.LineTo(136.0f, 72.0f),
                    PathNode.CurveTo(136.0f, 67.58172f, 132.41827f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(123.58172f, 64.0f, 120.0f, 67.58172f, 120.0f, 72.0f),
                    PathNode.LineTo(120.0f, 99.36f),
                    PathNode.LineTo(80.0f, 122.21f),
                    PathNode.LineTo(80.0f, 80.0f),
                    PathNode.CurveTo(79.99686f, 69.83194f, 73.58654f, 60.769356f, 64.0f, 57.38f),
                    PathNode.LineTo(64.0f, 32.0f),
                    PathNode.CurveTo(64.0f, 27.581722f, 60.418278f, 24.0f, 56.0f, 24.0f),
                    PathNode.CurveTo(51.581722f, 24.0f, 48.0f, 27.581722f, 48.0f, 32.0f),
                    PathNode.LineTo(48.0f, 57.38f),
                    PathNode.CurveTo(38.413452f, 60.769356f, 32.003143f, 69.83194f, 32.0f, 80.0f),
                    PathNode.LineTo(32.0f, 216.0f),
                    PathNode.CurveTo(32.0f, 220.41827f, 35.581722f, 224.0f, 40.0f, 224.0f),
                    PathNode.LineTo(104.0f, 224.0f),
                    PathNode.CurveTo(108.41828f, 224.0f, 112.0f, 220.41827f, 112.0f, 216.0f),
                    PathNode.LineTo(112.0f, 176.0f),
                    PathNode.CurveTo(112.0f, 167.16344f, 119.163445f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(136.83656f, 160.0f, 144.0f, 167.16344f, 144.0f, 176.0f),
                    PathNode.LineTo(144.0f, 216.0f),
                    PathNode.CurveTo(144.0f, 220.41827f, 147.58173f, 224.0f, 152.0f, 224.0f),
                    PathNode.LineTo(216.0f, 224.0f),
                    PathNode.CurveTo(220.41827f, 224.0f, 224.0f, 220.41827f, 224.0f, 216.0f),
                    PathNode.LineTo(224.0f, 80.0f),
                    PathNode.CurveTo(223.99686f, 69.83194f, 217.58655f, 60.769356f, 208.0f, 57.38f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 112.0f),
                    PathNode.LineTo(64.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.LineTo(192.0f, 208.0f),
                    PathNode.LineTo(192.0f, 112.0f),
                    PathNode.LineTo(208.0f, 112.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _synagogue!!
    }

private var _synagogue: ImageVector? = null
