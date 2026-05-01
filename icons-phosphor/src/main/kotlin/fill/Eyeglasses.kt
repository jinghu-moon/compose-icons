package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Eyeglasses: ImageVector
    get() {
        if (_eyeglasses != null) return _eyeglasses!!
        _eyeglasses = phosphorFillIcon(
            name = "Eyeglasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 72.0f),
                    PathNode.LineTo(232.0f, 164.0f),
                    PathNode.CurveTo(231.95529f, 187.48953f, 213.46758f, 206.80177f, 190.00233f, 207.87068f),
                    PathNode.CurveTo(166.5371f, 208.93959f, 146.37012f, 191.38818f, 144.19f, 168.0f),
                    PathNode.LineTo(111.81f, 168.0f),
                    PathNode.CurveTo(109.62988f, 191.38818f, 89.462906f, 208.93959f, 65.997665f, 207.87068f),
                    PathNode.CurveTo(42.53243f, 206.80177f, 24.044704f, 187.48953f, 24.0f, 164.0f),
                    PathNode.LineTo(24.0f, 72.0f),
                    PathNode.CurveTo(24.0f, 54.32689f, 38.32689f, 40.0f, 56.0f, 40.0f),
                    PathNode.CurveTo(60.418278f, 40.0f, 64.0f, 43.581722f, 64.0f, 48.0f),
                    PathNode.CurveTo(64.0f, 52.418278f, 60.418278f, 56.0f, 56.0f, 56.0f),
                    PathNode.CurveTo(47.163445f, 56.0f, 40.0f, 63.163445f, 40.0f, 72.0f),
                    PathNode.LineTo(40.0f, 130.08f),
                    PathNode.CurveTo(51.458084f, 120.63033f, 66.910126f, 117.59879f, 81.08928f, 122.0187f),
                    PathNode.CurveTo(95.26844f, 126.43859f, 106.260956f, 137.71336f, 110.32f, 152.0f),
                    PathNode.LineTo(145.68f, 152.0f),
                    PathNode.CurveTo(149.73906f, 137.71336f, 160.73157f, 126.43859f, 174.91072f, 122.0187f),
                    PathNode.CurveTo(189.08987f, 117.59879f, 204.54192f, 120.63033f, 216.0f, 130.08f),
                    PathNode.LineTo(216.0f, 72.0f),
                    PathNode.CurveTo(216.0f, 63.163445f, 208.83656f, 56.0f, 200.0f, 56.0f),
                    PathNode.CurveTo(195.58173f, 56.0f, 192.0f, 52.418278f, 192.0f, 48.0f),
                    PathNode.CurveTo(192.0f, 43.581722f, 195.58173f, 40.0f, 200.0f, 40.0f),
                    PathNode.CurveTo(217.67311f, 40.0f, 232.0f, 54.32689f, 232.0f, 72.0f),
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
        return _eyeglasses!!
    }

private var _eyeglasses: ImageVector? = null
