package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Ghost: ImageVector
    get() {
        if (_ghost != null) return _ghost!!
        _ghost = phosphorThinIcon(
            name = "Ghost",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(108.0f, 116.0f),
                    PathNode.CurveTo(108.0f, 120.41828f, 104.41828f, 124.0f, 100.0f, 124.0f),
                    PathNode.CurveTo(95.58172f, 124.0f, 92.0f, 120.41828f, 92.0f, 116.0f),
                    PathNode.CurveTo(92.0f, 111.58172f, 95.58172f, 108.0f, 100.0f, 108.0f),
                    PathNode.CurveTo(104.41828f, 108.0f, 108.0f, 111.58172f, 108.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 108.0f),
                    PathNode.CurveTo(151.58173f, 108.0f, 148.0f, 111.58172f, 148.0f, 116.0f),
                    PathNode.CurveTo(148.0f, 120.41828f, 151.58173f, 124.0f, 156.0f, 124.0f),
                    PathNode.CurveTo(160.41827f, 124.0f, 164.0f, 120.41828f, 164.0f, 116.0f),
                    PathNode.CurveTo(164.0f, 111.58172f, 160.41827f, 108.0f, 156.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 120.0f),
                    PathNode.LineTo(220.0f, 216.0f),
                    PathNode.CurveTo(220.00069f, 217.54518f, 219.11131f, 218.95258f, 217.71544f, 219.61525f),
                    PathNode.CurveTo(216.31956f, 220.27791f, 214.66684f, 220.07733f, 213.47f, 219.1f),
                    PathNode.LineTo(186.67f, 197.17f),
                    PathNode.LineTo(159.87f, 219.1f),
                    PathNode.CurveTo(158.3958f, 220.30782f, 156.2742f, 220.30782f, 154.8f, 219.1f),
                    PathNode.LineTo(128.0f, 197.17f),
                    PathNode.LineTo(101.2f, 219.1f),
                    PathNode.CurveTo(99.72579f, 220.30782f, 97.6042f, 220.30782f, 96.13f, 219.1f),
                    PathNode.LineTo(69.33f, 197.17f),
                    PathNode.LineTo(42.53f, 219.1f),
                    PathNode.CurveTo(41.33316f, 220.07733f, 39.68044f, 220.27791f, 38.28456f, 219.61525f),
                    PathNode.CurveTo(36.888683f, 218.95258f, 35.99932f, 217.54518f, 36.0f, 216.0f),
                    PathNode.LineTo(36.0f, 120.0f),
                    PathNode.CurveTo(36.0f, 69.18981f, 77.18981f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(178.8102f, 28.0f, 220.0f, 69.18981f, 220.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 120.0f),
                    PathNode.CurveTo(212.0f, 73.60808f, 174.39192f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(81.60808f, 36.0f, 44.0f, 73.60808f, 44.0f, 120.0f),
                    PathNode.LineTo(44.0f, 207.56f),
                    PathNode.LineTo(66.8f, 188.9f),
                    PathNode.CurveTo(68.27421f, 187.69218f, 70.3958f, 187.69218f, 71.87f, 188.9f),
                    PathNode.LineTo(98.67f, 210.83f),
                    PathNode.LineTo(125.47f, 188.9f),
                    PathNode.CurveTo(126.94239f, 187.69766f, 129.0576f, 187.69766f, 130.53f, 188.9f),
                    PathNode.LineTo(157.33f, 210.83f),
                    PathNode.LineTo(184.13f, 188.9f),
                    PathNode.CurveTo(185.6042f, 187.69218f, 187.7258f, 187.69218f, 189.2f, 188.9f),
                    PathNode.LineTo(212.0f, 207.56f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _ghost!!
    }

private var _ghost: ImageVector? = null
