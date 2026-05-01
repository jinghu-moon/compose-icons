package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Wrench: ImageVector
    get() {
        if (_wrench != null) return _wrench!!
        _wrench = phosphorFillIcon(
            name = "Wrench",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 96.0f),
                    PathNode.CurveTo(232.0244f, 120.326775f, 219.763f, 143.02087f, 199.40231f, 156.3338f),
                    PathNode.CurveTo(179.0416f, 169.64673f, 153.33516f, 171.77803f, 131.06f, 162.0f),
                    PathNode.LineTo(79.0f, 222.22f),
                    PathNode.CurveTo(78.88f, 222.36f, 78.74f, 222.51f, 78.61f, 222.64f),
                    PathNode.CurveTo(66.11179f, 235.1382f, 45.848206f, 235.1382f, 33.35f, 222.64f),
                    PathNode.CurveTo(20.851795f, 210.14178f, 20.851795f, 189.8782f, 33.35f, 177.38f),
                    PathNode.CurveTo(33.49f, 177.25f, 33.63f, 177.11f, 33.78f, 176.99f),
                    PathNode.LineTo(94.0f, 124.94f),
                    PathNode.CurveTo(82.99302f, 99.76145f, 87.26197f, 70.51477f, 105.00669f, 49.532925f),
                    PathNode.CurveTo(122.75141f, 28.551077f, 150.8835f, 19.485874f, 177.54f, 26.16f),
                    PathNode.CurveTo(180.28036f, 26.846834f, 182.45528f, 28.9281f, 183.26198f, 31.635595f),
                    PathNode.CurveTo(184.0687f, 34.343094f, 183.38756f, 37.275326f, 181.47f, 39.35f),
                    PathNode.LineTo(144.0f, 80.0f),
                    PathNode.LineTo(149.66f, 106.35f),
                    PathNode.LineTo(176.0f, 112.0f),
                    PathNode.LineTo(216.65f, 74.48f),
                    PathNode.CurveTo(218.72467f, 72.56244f, 221.6569f, 71.88131f, 224.36441f, 72.68802f),
                    PathNode.CurveTo(227.0719f, 73.49472f, 229.15317f, 75.66964f, 229.84f, 78.41f),
                    PathNode.CurveTo(231.27562f, 84.16313f, 232.00102f, 90.07046f, 232.0f, 96.0f),
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
        return _wrench!!
    }

private var _wrench: ImageVector? = null
