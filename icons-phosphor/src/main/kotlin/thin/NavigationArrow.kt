package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NavigationArrow: ImageVector
    get() {
        if (_navigationArrow != null) return _navigationArrow!!
        _navigationArrow = phosphorThinIcon(
            name = "NavigationArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 110.0f),
                    PathNode.LineTo(59.93f, 44.67f),
                    PathNode.CurveTo(55.5764f, 43.16421f, 50.74509f, 44.28359f, 47.497303f, 47.550556f),
                    PathNode.CurveTo(44.24951f, 50.817528f, 43.158604f, 55.655342f, 44.69f, 60.0f),
                    PathNode.LineTo(110.0f, 235.93f),
                    PathNode.CurveTo(111.62343f, 240.77316f, 116.172066f, 244.02736f, 121.28f, 244.0f),
                    PathNode.LineTo(121.5f, 244.0f),
                    PathNode.CurveTo(126.70983f, 243.96677f, 131.28352f, 240.52634f, 132.76f, 235.53f),
                    PathNode.LineTo(132.76f, 235.43f),
                    PathNode.LineTo(155.21f, 155.24f),
                    PathNode.LineTo(235.4f, 132.8f),
                    PathNode.LineTo(235.5f, 132.8f),
                    PathNode.CurveTo(240.463f, 131.29245f, 243.89565f, 126.76679f, 244.00937f, 121.58112f),
                    PathNode.CurveTo(244.1231f, 116.395454f, 240.89214f, 111.72368f, 236.0f, 110.0f),
                    PathNode.Close,
                    PathNode.MoveTo(233.21f, 125.12f),
                    PathNode.LineTo(150.91f, 148.12f),
                    PathNode.CurveTo(149.56294f, 148.49406f, 148.50893f, 149.54431f, 148.13f, 150.89f),
                    PathNode.LineTo(125.13f, 233.19f),
                    PathNode.CurveTo(124.6406f, 234.84549f, 123.116295f, 235.97853f, 121.39f, 235.97f),
                    PathNode.CurveTo(119.62761f, 236.00243f, 118.05173f, 234.87738f, 117.51f, 233.2f),
                    PathNode.LineTo(52.22f, 57.32f),
                    PathNode.CurveTo(51.711845f, 55.863342f, 52.102966f, 54.244102f, 53.22f, 53.18f),
                    PathNode.CurveTo(53.956875f, 52.438515f, 54.954742f, 52.014957f, 56.0f, 52.0f),
                    PathNode.CurveTo(56.425392f, 52.000645f, 56.84775f, 52.0716f, 57.25f, 52.21f),
                    PathNode.LineTo(233.33f, 117.53f),
                    PathNode.CurveTo(234.95763f, 118.09329f, 236.04192f, 119.63522f, 236.0215f, 121.35745f),
                    PathNode.CurveTo(236.00108f, 123.07967f, 234.88052f, 124.59545f, 233.24f, 125.12f),
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
        return _navigationArrow!!
    }

private var _navigationArrow: ImageVector? = null
