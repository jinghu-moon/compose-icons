package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.XLogo: ImageVector
    get() {
        if (_xLogo != null) return _xLogo!!
        _xLogo = phosphorThinIcon(
            name = "XLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(211.37f, 213.85f),
                    PathNode.LineTo(147.13f, 112.9f),
                    PathNode.LineTo(211.0f, 42.69f),
                    PathNode.CurveTo(212.48564f, 41.033146f, 212.34685f, 38.485645f, 210.69f, 37.0f),
                    PathNode.CurveTo(209.03314f, 35.514355f, 206.48564f, 35.653145f, 205.0f, 37.31f),
                    PathNode.LineTo(142.68f, 105.9f),
                    PathNode.LineTo(99.38f, 37.85f),
                    PathNode.CurveTo(98.64416f, 36.695557f, 97.36902f, 35.997623f, 96.0f, 36.0f),
                    PathNode.LineTo(48.0f, 36.0f),
                    PathNode.CurveTo(46.540092f, 36.001114f, 45.196743f, 36.79751f, 44.495186f, 38.0778f),
                    PathNode.CurveTo(43.793625f, 39.358093f, 43.8453f, 40.91891f, 44.63f, 42.15f),
                    PathNode.LineTo(108.87f, 143.1f),
                    PathNode.LineTo(45.0f, 213.31f),
                    PathNode.CurveTo(43.514355f, 214.96686f, 43.653145f, 217.51436f, 45.31f, 219.0f),
                    PathNode.CurveTo(46.966854f, 220.48564f, 49.514355f, 220.34685f, 51.0f, 218.69f),
                    PathNode.LineTo(113.36f, 150.1f),
                    PathNode.LineTo(156.66f, 218.15f),
                    PathNode.CurveTo(157.38818f, 219.29251f, 158.6452f, 219.98877f, 160.0f, 220.0f),
                    PathNode.LineTo(208.0f, 220.0f),
                    PathNode.CurveTo(209.45992f, 219.99889f, 210.80325f, 219.2025f, 211.50482f, 217.9222f),
                    PathNode.CurveTo(212.20638f, 216.6419f, 212.15471f, 215.08109f, 211.37f, 213.85f),
                    PathNode.Close,
                    PathNode.MoveTo(162.2f, 212.0f),
                    PathNode.LineTo(55.29f, 44.0f),
                    PathNode.LineTo(93.8f, 44.0f),
                    PathNode.LineTo(200.71f, 212.0f),
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
        return _xLogo!!
    }

private var _xLogo: ImageVector? = null
