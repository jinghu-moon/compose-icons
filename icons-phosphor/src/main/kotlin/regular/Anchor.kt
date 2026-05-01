package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Anchor: ImageVector
    get() {
        if (_anchor != null) return _anchor!!
        _anchor = phosphorRegularIcon(
            name = "Anchor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 136.0f),
                    PathNode.CurveTo(211.58173f, 136.0f, 208.0f, 139.58173f, 208.0f, 144.0f),
                    PathNode.CurveTo(208.0f, 168.69f, 194.23f, 173.64f, 169.9f, 180.28f),
                    PathNode.CurveTo(158.54f, 183.38f, 145.78f, 186.88f, 136.0f, 194.62f),
                    PathNode.LineTo(136.0f, 128.0f),
                    PathNode.LineTo(168.0f, 128.0f),
                    PathNode.CurveTo(172.41827f, 128.0f, 176.0f, 124.41828f, 176.0f, 120.0f),
                    PathNode.CurveTo(176.0f, 115.58172f, 172.41827f, 112.0f, 168.0f, 112.0f),
                    PathNode.LineTo(136.0f, 112.0f),
                    PathNode.LineTo(136.0f, 87.0f),
                    PathNode.CurveTo(151.60245f, 82.971466f, 161.7754f, 67.9697f, 159.74495f, 51.983997f),
                    PathNode.CurveTo(157.7145f, 35.998287f, 144.11415f, 24.016132f, 128.0f, 24.016132f),
                    PathNode.CurveTo(111.88586f, 24.016132f, 98.2855f, 35.998287f, 96.25505f, 51.983997f),
                    PathNode.CurveTo(94.2246f, 67.9697f, 104.397545f, 82.971466f, 120.0f, 87.0f),
                    PathNode.LineTo(120.0f, 112.0f),
                    PathNode.LineTo(88.0f, 112.0f),
                    PathNode.CurveTo(83.58172f, 112.0f, 80.0f, 115.58172f, 80.0f, 120.0f),
                    PathNode.CurveTo(80.0f, 124.41828f, 83.58172f, 128.0f, 88.0f, 128.0f),
                    PathNode.LineTo(120.0f, 128.0f),
                    PathNode.LineTo(120.0f, 194.62f),
                    PathNode.CurveTo(110.22f, 186.88f, 97.46f, 183.38f, 86.1f, 180.28f),
                    PathNode.CurveTo(61.77f, 173.64f, 48.0f, 168.69f, 48.0f, 144.0f),
                    PathNode.CurveTo(48.0f, 139.58173f, 44.418278f, 136.0f, 40.0f, 136.0f),
                    PathNode.CurveTo(35.581722f, 136.0f, 32.0f, 139.58173f, 32.0f, 144.0f),
                    PathNode.CurveTo(32.0f, 182.11f, 59.67f, 189.66f, 81.9f, 195.72f),
                    PathNode.CurveTo(106.23f, 202.36f, 120.0f, 207.31f, 120.0f, 232.0f),
                    PathNode.CurveTo(120.0f, 236.41827f, 123.58172f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(132.41827f, 240.0f, 136.0f, 236.41827f, 136.0f, 232.0f),
                    PathNode.CurveTo(136.0f, 207.31f, 149.77f, 202.36f, 174.1f, 195.72f),
                    PathNode.CurveTo(196.33f, 189.66f, 224.0f, 182.11f, 224.0f, 144.0f),
                    PathNode.CurveTo(224.0f, 139.58173f, 220.41827f, 136.0f, 216.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 56.0f),
                    PathNode.CurveTo(112.0f, 47.163445f, 119.163445f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(136.83656f, 40.0f, 144.0f, 47.163445f, 144.0f, 56.0f),
                    PathNode.CurveTo(144.0f, 64.836555f, 136.83656f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(119.163445f, 72.0f, 112.0f, 64.836555f, 112.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _anchor!!
    }

private var _anchor: ImageVector? = null
