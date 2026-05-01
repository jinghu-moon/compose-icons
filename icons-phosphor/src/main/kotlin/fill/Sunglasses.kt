package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Sunglasses: ImageVector
    get() {
        if (_sunglasses != null) return _sunglasses!!
        _sunglasses = phosphorFillIcon(
            name = "Sunglasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 40.0f),
                    PathNode.CurveTo(195.58173f, 40.0f, 192.0f, 43.581722f, 192.0f, 48.0f),
                    PathNode.CurveTo(192.0f, 52.418278f, 195.58173f, 56.0f, 200.0f, 56.0f),
                    PathNode.CurveTo(208.83656f, 56.0f, 216.0f, 63.163445f, 216.0f, 72.0f),
                    PathNode.LineTo(216.0f, 128.0f),
                    PathNode.LineTo(40.0f, 128.0f),
                    PathNode.LineTo(40.0f, 72.0f),
                    PathNode.CurveTo(40.0f, 63.163445f, 47.163445f, 56.0f, 56.0f, 56.0f),
                    PathNode.CurveTo(60.418278f, 56.0f, 64.0f, 52.418278f, 64.0f, 48.0f),
                    PathNode.CurveTo(64.0f, 43.581722f, 60.418278f, 40.0f, 56.0f, 40.0f),
                    PathNode.CurveTo(38.32689f, 40.0f, 24.0f, 54.32689f, 24.0f, 72.0f),
                    PathNode.LineTo(24.0f, 164.0f),
                    PathNode.CurveTo(24.0f, 188.30052f, 43.69947f, 208.0f, 68.0f, 208.0f),
                    PathNode.CurveTo(92.30053f, 208.0f, 112.0f, 188.30052f, 112.0f, 164.0f),
                    PathNode.LineTo(112.0f, 144.0f),
                    PathNode.LineTo(144.0f, 144.0f),
                    PathNode.LineTo(144.0f, 164.0f),
                    PathNode.CurveTo(144.0f, 188.30052f, 163.69948f, 208.0f, 188.0f, 208.0f),
                    PathNode.CurveTo(212.30052f, 208.0f, 232.0f, 188.30052f, 232.0f, 164.0f),
                    PathNode.LineTo(232.0f, 72.0f),
                    PathNode.CurveTo(232.0f, 54.32689f, 217.67311f, 40.0f, 200.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(91.22f, 179.22f),
                    PathNode.CurveTo(88.09623f, 182.34172f, 83.03377f, 182.34172f, 79.91f, 179.22f),
                    PathNode.LineTo(58.34f, 157.66f),
                    PathNode.CurveTo(55.21407f, 154.53407f, 55.21407f, 149.46593f, 58.34f, 146.34f),
                    PathNode.CurveTo(61.46593f, 143.21407f, 66.534065f, 143.21407f, 69.66f, 146.34f),
                    PathNode.LineTo(91.22f, 167.91f),
                    PathNode.CurveTo(94.34172f, 171.03375f, 94.34172f, 176.09624f, 91.22f, 179.22f),
                    PathNode.Close,
                    PathNode.MoveTo(211.22f, 179.22f),
                    PathNode.CurveTo(208.09624f, 182.34172f, 203.03375f, 182.34172f, 199.91f, 179.22f),
                    PathNode.LineTo(178.34f, 157.66f),
                    PathNode.CurveTo(175.21407f, 154.53407f, 175.21407f, 149.46593f, 178.34f, 146.34f),
                    PathNode.CurveTo(181.46593f, 143.21407f, 186.53407f, 143.21407f, 189.66f, 146.34f),
                    PathNode.LineTo(211.22f, 167.91f),
                    PathNode.CurveTo(214.34172f, 171.03375f, 214.34172f, 176.09624f, 211.22f, 179.22f),
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
        return _sunglasses!!
    }

private var _sunglasses: ImageVector? = null
