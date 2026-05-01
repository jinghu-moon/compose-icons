package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CodeBlock: ImageVector
    get() {
        if (_codeBlock != null) return _codeBlock!!
        _codeBlock = phosphorRegularIcon(
            name = "CodeBlock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(58.34f, 101.66f),
                    PathNode.LineTo(26.34f, 69.66f),
                    PathNode.CurveTo(24.837784f, 68.159454f, 23.993708f, 66.123276f, 23.993708f, 64.0f),
                    PathNode.CurveTo(23.993708f, 61.876724f, 24.837784f, 59.840546f, 26.34f, 58.34f),
                    PathNode.LineTo(58.34f, 26.34f),
                    PathNode.CurveTo(61.46593f, 23.21407f, 66.534065f, 23.21407f, 69.66f, 26.34f),
                    PathNode.CurveTo(72.785934f, 29.46593f, 72.785934f, 34.53407f, 69.66f, 37.66f),
                    PathNode.LineTo(43.31f, 64.0f),
                    PathNode.LineTo(69.66f, 90.34f),
                    PathNode.CurveTo(72.785934f, 93.465935f, 72.785934f, 98.534065f, 69.66f, 101.66f),
                    PathNode.CurveTo(66.534065f, 104.785934f, 61.46593f, 104.785934f, 58.34f, 101.66f),
                    PathNode.Close,
                    PathNode.MoveTo(98.34f, 101.66f),
                    PathNode.CurveTo(99.840546f, 103.16222f, 101.876724f, 104.006294f, 104.0f, 104.006294f),
                    PathNode.CurveTo(106.123276f, 104.006294f, 108.159454f, 103.16222f, 109.66f, 101.66f),
                    PathNode.LineTo(141.66f, 69.66f),
                    PathNode.CurveTo(143.16223f, 68.159454f, 144.00629f, 66.123276f, 144.00629f, 64.0f),
                    PathNode.CurveTo(144.00629f, 61.876724f, 143.16223f, 59.840546f, 141.66f, 58.34f),
                    PathNode.LineTo(109.66f, 26.34f),
                    PathNode.CurveTo(106.534065f, 23.214067f, 101.465935f, 23.21407f, 98.34f, 26.34f),
                    PathNode.CurveTo(95.214066f, 29.46593f, 95.214066f, 34.53407f, 98.34f, 37.66f),
                    PathNode.LineTo(124.69f, 64.0f),
                    PathNode.LineTo(98.34f, 90.34f),
                    PathNode.CurveTo(96.83778f, 91.840546f, 95.993706f, 93.876724f, 95.993706f, 96.0f),
                    PathNode.CurveTo(95.993706f, 98.123276f, 96.83778f, 100.159454f, 98.34f, 101.66f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 40.0f),
                    PathNode.LineTo(176.0f, 40.0f),
                    PathNode.CurveTo(171.58173f, 40.0f, 168.0f, 43.581722f, 168.0f, 48.0f),
                    PathNode.CurveTo(168.0f, 52.418278f, 171.58173f, 56.0f, 176.0f, 56.0f),
                    PathNode.LineTo(200.0f, 56.0f),
                    PathNode.LineTo(200.0f, 200.0f),
                    PathNode.LineTo(56.0f, 200.0f),
                    PathNode.LineTo(56.0f, 136.0f),
                    PathNode.CurveTo(56.0f, 131.58173f, 52.418278f, 128.0f, 48.0f, 128.0f),
                    PathNode.CurveTo(43.581722f, 128.0f, 40.0f, 131.58173f, 40.0f, 136.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.CurveTo(40.0f, 208.83656f, 47.163445f, 216.0f, 56.0f, 216.0f),
                    PathNode.LineTo(200.0f, 216.0f),
                    PathNode.CurveTo(208.83656f, 216.0f, 216.0f, 208.83656f, 216.0f, 200.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.CurveTo(216.0f, 47.163445f, 208.83656f, 40.0f, 200.0f, 40.0f),
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
        return _codeBlock!!
    }

private var _codeBlock: ImageVector? = null
