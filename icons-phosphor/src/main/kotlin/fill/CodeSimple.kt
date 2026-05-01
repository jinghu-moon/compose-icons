package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CodeSimple: ImageVector
    get() {
        if (_codeSimple != null) return _codeSimple!!
        _codeSimple = phosphorFillIcon(
            name = "CodeSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(224.83656f, 216.0f, 232.0f, 208.83656f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(101.66f, 162.34f),
                    PathNode.CurveTo(104.785934f, 165.46593f, 104.785934f, 170.53407f, 101.66f, 173.66f),
                    PathNode.CurveTo(98.534065f, 176.78593f, 93.465935f, 176.78593f, 90.34f, 173.66f),
                    PathNode.LineTo(50.34f, 133.66f),
                    PathNode.CurveTo(48.837784f, 132.15945f, 47.993706f, 130.12328f, 47.993706f, 128.0f),
                    PathNode.CurveTo(47.993706f, 125.876724f, 48.837784f, 123.840546f, 50.34f, 122.34f),
                    PathNode.LineTo(90.34f, 82.34f),
                    PathNode.CurveTo(93.465935f, 79.214066f, 98.534065f, 79.214066f, 101.66f, 82.34f),
                    PathNode.CurveTo(104.785934f, 85.465935f, 104.785934f, 90.534065f, 101.66f, 93.66f),
                    PathNode.LineTo(67.31f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(205.66f, 133.66f),
                    PathNode.LineTo(165.66f, 173.66f),
                    PathNode.CurveTo(162.53407f, 176.78593f, 157.46593f, 176.78593f, 154.34f, 173.66f),
                    PathNode.CurveTo(151.21407f, 170.53407f, 151.21407f, 165.46593f, 154.34f, 162.34f),
                    PathNode.LineTo(188.69f, 128.0f),
                    PathNode.LineTo(154.34f, 93.66f),
                    PathNode.CurveTo(151.21407f, 90.534065f, 151.21407f, 85.465935f, 154.34f, 82.34f),
                    PathNode.CurveTo(157.46593f, 79.214066f, 162.53407f, 79.214066f, 165.66f, 82.34f),
                    PathNode.LineTo(205.66f, 122.34f),
                    PathNode.CurveTo(207.16223f, 123.840546f, 208.00629f, 125.876724f, 208.00629f, 128.0f),
                    PathNode.CurveTo(208.00629f, 130.12328f, 207.16223f, 132.15945f, 205.66f, 133.66f),
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
        return _codeSimple!!
    }

private var _codeSimple: ImageVector? = null
