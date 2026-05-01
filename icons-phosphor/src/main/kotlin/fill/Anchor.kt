package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Anchor: ImageVector
    get() {
        if (_anchor != null) return _anchor!!
        _anchor = phosphorFillIcon(
            name = "Anchor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 144.0f),
                    PathNode.CurveTo(224.0f, 182.11f, 196.33f, 189.66f, 174.1f, 195.72f),
                    PathNode.CurveTo(149.77f, 202.36f, 136.0f, 207.31f, 136.0f, 232.0f),
                    PathNode.CurveTo(136.0f, 236.41827f, 132.41827f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(123.58172f, 240.0f, 120.0f, 236.41827f, 120.0f, 232.0f),
                    PathNode.CurveTo(120.0f, 207.31f, 106.23f, 202.36f, 81.9f, 195.72f),
                    PathNode.CurveTo(59.67f, 189.66f, 32.0f, 182.11f, 32.0f, 144.0f),
                    PathNode.CurveTo(32.0f, 139.58173f, 35.581722f, 136.0f, 40.0f, 136.0f),
                    PathNode.CurveTo(44.418278f, 136.0f, 48.0f, 139.58173f, 48.0f, 144.0f),
                    PathNode.CurveTo(48.0f, 168.69f, 61.77f, 173.64f, 86.1f, 180.28f),
                    PathNode.CurveTo(97.46f, 183.38f, 110.22f, 186.88f, 120.0f, 194.62f),
                    PathNode.LineTo(120.0f, 128.0f),
                    PathNode.LineTo(88.0f, 128.0f),
                    PathNode.CurveTo(83.58172f, 128.0f, 80.0f, 124.41828f, 80.0f, 120.0f),
                    PathNode.CurveTo(80.0f, 115.58172f, 83.58172f, 112.0f, 88.0f, 112.0f),
                    PathNode.LineTo(120.0f, 112.0f),
                    PathNode.LineTo(120.0f, 82.83f),
                    PathNode.CurveTo(106.67699f, 78.85784f, 98.286224f, 65.71174f, 100.293335f, 51.954838f),
                    PathNode.CurveTo(102.30044f, 38.197937f, 114.09746f, 27.997185f, 128.0f, 27.997185f),
                    PathNode.CurveTo(141.90254f, 27.997185f, 153.69957f, 38.197937f, 155.70667f, 51.954838f),
                    PathNode.CurveTo(157.71378f, 65.71174f, 149.32301f, 78.85784f, 136.0f, 82.83f),
                    PathNode.LineTo(136.0f, 112.0f),
                    PathNode.LineTo(168.0f, 112.0f),
                    PathNode.CurveTo(172.41827f, 112.0f, 176.0f, 115.58172f, 176.0f, 120.0f),
                    PathNode.CurveTo(176.0f, 124.41828f, 172.41827f, 128.0f, 168.0f, 128.0f),
                    PathNode.LineTo(136.0f, 128.0f),
                    PathNode.LineTo(136.0f, 194.62f),
                    PathNode.CurveTo(145.78f, 186.88f, 158.54f, 183.38f, 169.9f, 180.28f),
                    PathNode.CurveTo(194.23f, 173.64f, 208.0f, 168.69f, 208.0f, 144.0f),
                    PathNode.CurveTo(208.0f, 139.58173f, 211.58173f, 136.0f, 216.0f, 136.0f),
                    PathNode.CurveTo(220.41827f, 136.0f, 224.0f, 139.58173f, 224.0f, 144.0f),
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
        return _anchor!!
    }

private var _anchor: ImageVector? = null
