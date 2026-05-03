package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Funnel: ImageVector
    get() {
        if (_funnel != null) return _funnel!!
        _funnel = phosphorFillIcon(
            name = "Funnel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(227.81f, 66.76f),
                    PathNode.LineTo(227.73f, 66.85f),
                    PathNode.LineTo(160.0f, 139.17f),
                    PathNode.LineTo(160.0f, 194.66f),
                    PathNode.CurveTo(160.00795f, 200.02028f, 157.3312f, 205.0284f, 152.87f, 208.0f),
                    PathNode.LineTo(120.87f, 229.34f),
                    PathNode.CurveTo(115.95641f, 232.61296f, 109.639725f, 232.91412f, 104.43705f, 230.12346f),
                    PathNode.CurveTo(99.23437f, 227.3328f, 95.99124f, 221.90385f, 96.0f, 216.0f),
                    PathNode.LineTo(96.0f, 139.17f),
                    PathNode.LineTo(28.27f, 66.85f),
                    PathNode.LineTo(28.19f, 66.76f),
                    PathNode.CurveTo(23.935287f, 62.077644f, 22.83922f, 55.327915f, 25.393673f, 49.53984f),
                    PathNode.CurveTo(27.948126f, 43.751766f, 33.67332f, 40.012466f, 40.0f, 40.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(222.33212f, 40.000614f, 228.06816f, 43.735504f, 230.63023f, 49.526142f),
                    PathNode.CurveTo(233.1923f, 55.316784f, 232.09836f, 62.073616f, 227.84f, 66.76f),
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
        return _funnel!!
    }

private var _funnel: ImageVector? = null
