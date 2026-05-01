package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Timer: ImageVector
    get() {
        if (_timer != null) return _timer!!
        _timer = phosphorFillIcon(
            name = "Timer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 40.0f),
                    PathNode.CurveTo(74.98067f, 40.0f, 32.0f, 82.98067f, 32.0f, 136.0f),
                    PathNode.CurveTo(32.0f, 189.01933f, 74.98067f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(181.01933f, 232.0f, 224.0f, 189.01933f, 224.0f, 136.0f),
                    PathNode.CurveTo(223.93938f, 83.00579f, 180.9942f, 40.06062f, 128.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(173.66f, 101.66f),
                    PathNode.LineTo(133.66f, 141.66f),
                    PathNode.CurveTo(130.53407f, 144.78593f, 125.465935f, 144.78593f, 122.34f, 141.66f),
                    PathNode.CurveTo(119.214066f, 138.53407f, 119.214066f, 133.46593f, 122.34f, 130.34f),
                    PathNode.LineTo(162.34f, 90.34f),
                    PathNode.CurveTo(165.46593f, 87.214066f, 170.53407f, 87.214066f, 173.66f, 90.34f),
                    PathNode.CurveTo(176.78593f, 93.465935f, 176.78593f, 98.534065f, 173.66f, 101.66f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 16.0f),
                    PathNode.CurveTo(96.0f, 11.581722f, 99.58172f, 8.0f, 104.0f, 8.0f),
                    PathNode.LineTo(152.0f, 8.0f),
                    PathNode.CurveTo(156.41827f, 8.0f, 160.0f, 11.581722f, 160.0f, 16.0f),
                    PathNode.CurveTo(160.0f, 20.418278f, 156.41827f, 24.0f, 152.0f, 24.0f),
                    PathNode.LineTo(104.0f, 24.0f),
                    PathNode.CurveTo(99.58172f, 24.0f, 96.0f, 20.418278f, 96.0f, 16.0f),
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
        return _timer!!
    }

private var _timer: ImageVector? = null
