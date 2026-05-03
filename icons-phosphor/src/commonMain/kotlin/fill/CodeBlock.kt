package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CodeBlock: ImageVector
    get() {
        if (_codeBlock != null) return _codeBlock!!
        _codeBlock = phosphorFillIcon(
            name = "CodeBlock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 40.0f),
                    PathNode.LineTo(168.0f, 40.0f),
                    PathNode.CurveTo(168.0f, 31.163445f, 160.83656f, 24.0f, 152.0f, 24.0f),
                    PathNode.LineTo(32.0f, 24.0f),
                    PathNode.CurveTo(23.163445f, 24.0f, 16.0f, 31.163445f, 16.0f, 40.0f),
                    PathNode.LineTo(16.0f, 120.0f),
                    PathNode.CurveTo(16.0f, 128.83656f, 23.163445f, 136.0f, 32.0f, 136.0f),
                    PathNode.LineTo(40.0f, 136.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.CurveTo(40.0f, 208.83656f, 47.163445f, 216.0f, 56.0f, 216.0f),
                    PathNode.LineTo(200.0f, 216.0f),
                    PathNode.CurveTo(208.83656f, 216.0f, 216.0f, 208.83656f, 216.0f, 200.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.CurveTo(216.0f, 47.163445f, 208.83656f, 40.0f, 200.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(106.34f, 61.66f),
                    PathNode.CurveTo(103.214066f, 58.53407f, 103.214066f, 53.46593f, 106.34f, 50.34f),
                    PathNode.CurveTo(109.465935f, 47.21407f, 114.534065f, 47.21407f, 117.66f, 50.34f),
                    PathNode.LineTo(141.66f, 74.34f),
                    PathNode.CurveTo(143.16223f, 75.840546f, 144.00629f, 77.876724f, 144.00629f, 80.0f),
                    PathNode.CurveTo(144.00629f, 82.123276f, 143.16223f, 84.159454f, 141.66f, 85.66f),
                    PathNode.LineTo(117.66f, 109.66f),
                    PathNode.CurveTo(114.534065f, 112.785934f, 109.465935f, 112.785934f, 106.34f, 109.66f),
                    PathNode.CurveTo(103.214066f, 106.534065f, 103.214066f, 101.465935f, 106.34f, 98.34f),
                    PathNode.LineTo(124.69f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(42.34f, 85.66f),
                    PathNode.CurveTo(40.837784f, 84.159454f, 39.993706f, 82.123276f, 39.993706f, 80.0f),
                    PathNode.CurveTo(39.993706f, 77.876724f, 40.837784f, 75.840546f, 42.34f, 74.34f),
                    PathNode.LineTo(66.34f, 50.34f),
                    PathNode.CurveTo(69.465935f, 47.21407f, 74.534065f, 47.21407f, 77.66f, 50.34f),
                    PathNode.CurveTo(80.785934f, 53.46593f, 80.785934f, 58.53407f, 77.66f, 61.66f),
                    PathNode.LineTo(59.31f, 80.0f),
                    PathNode.LineTo(77.66f, 98.34f),
                    PathNode.CurveTo(80.785934f, 101.465935f, 80.785934f, 106.534065f, 77.66f, 109.66f),
                    PathNode.CurveTo(74.534065f, 112.785934f, 69.465935f, 112.785934f, 66.34f, 109.66f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 200.0f),
                    PathNode.LineTo(56.0f, 200.0f),
                    PathNode.LineTo(56.0f, 136.0f),
                    PathNode.LineTo(152.0f, 136.0f),
                    PathNode.CurveTo(160.83656f, 136.0f, 168.0f, 128.83656f, 168.0f, 120.0f),
                    PathNode.LineTo(168.0f, 56.0f),
                    PathNode.LineTo(200.0f, 56.0f),
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
        return _codeBlock!!
    }

private var _codeBlock: ImageVector? = null
