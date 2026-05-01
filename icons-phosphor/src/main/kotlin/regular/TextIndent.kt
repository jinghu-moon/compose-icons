package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TextIndent: ImageVector
    get() {
        if (_textIndent != null) return _textIndent!!
        _textIndent = phosphorRegularIcon(
            name = "TextIndent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 132.41827f, 220.41827f, 136.0f, 216.0f, 136.0f),
                    PathNode.LineTo(112.0f, 136.0f),
                    PathNode.CurveTo(107.58172f, 136.0f, 104.0f, 132.41827f, 104.0f, 128.0f),
                    PathNode.CurveTo(104.0f, 123.58172f, 107.58172f, 120.0f, 112.0f, 120.0f),
                    PathNode.LineTo(216.0f, 120.0f),
                    PathNode.CurveTo(220.41827f, 120.0f, 224.0f, 123.58172f, 224.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 72.0f),
                    PathNode.LineTo(216.0f, 72.0f),
                    PathNode.CurveTo(220.41827f, 72.0f, 224.0f, 68.41828f, 224.0f, 64.0f),
                    PathNode.CurveTo(224.0f, 59.581722f, 220.41827f, 56.0f, 216.0f, 56.0f),
                    PathNode.LineTo(112.0f, 56.0f),
                    PathNode.CurveTo(107.58172f, 56.0f, 104.0f, 59.581722f, 104.0f, 64.0f),
                    PathNode.CurveTo(104.0f, 68.41828f, 107.58172f, 72.0f, 112.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 184.0f),
                    PathNode.LineTo(40.0f, 184.0f),
                    PathNode.CurveTo(35.581722f, 184.0f, 32.0f, 187.58173f, 32.0f, 192.0f),
                    PathNode.CurveTo(32.0f, 196.41827f, 35.581722f, 200.0f, 40.0f, 200.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.CurveTo(220.41827f, 200.0f, 224.0f, 196.41827f, 224.0f, 192.0f),
                    PathNode.CurveTo(224.0f, 187.58173f, 220.41827f, 184.0f, 216.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(34.34f, 141.66f),
                    PathNode.CurveTo(35.840546f, 143.16223f, 37.876724f, 144.00629f, 40.0f, 144.00629f),
                    PathNode.CurveTo(42.123276f, 144.00629f, 44.159454f, 143.16223f, 45.66f, 141.66f),
                    PathNode.LineTo(85.66f, 101.66f),
                    PathNode.CurveTo(87.16222f, 100.159454f, 88.006294f, 98.123276f, 88.006294f, 96.0f),
                    PathNode.CurveTo(88.006294f, 93.876724f, 87.16222f, 91.840546f, 85.66f, 90.34f),
                    PathNode.LineTo(45.66f, 50.34f),
                    PathNode.CurveTo(42.53407f, 47.21407f, 37.46593f, 47.21407f, 34.34f, 50.34f),
                    PathNode.CurveTo(31.21407f, 53.46593f, 31.21407f, 58.53407f, 34.34f, 61.66f),
                    PathNode.LineTo(68.69f, 96.0f),
                    PathNode.LineTo(34.34f, 130.34f),
                    PathNode.CurveTo(32.837784f, 131.84055f, 31.993708f, 133.87672f, 31.993708f, 136.0f),
                    PathNode.CurveTo(31.993708f, 138.12328f, 32.837784f, 140.15945f, 34.34f, 141.66f),
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
        return _textIndent!!
    }

private var _textIndent: ImageVector? = null
