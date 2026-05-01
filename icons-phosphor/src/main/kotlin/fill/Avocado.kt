package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Avocado: ImageVector
    get() {
        if (_avocado != null) return _avocado!!
        _avocado = phosphorFillIcon(
            name = "Avocado",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(211.0f, 130.66f),
                    PathNode.LineTo(181.2f, 46.47f),
                    PathNode.CurveTo(173.71046f, 23.708273f, 152.56873f, 8.234041f, 128.60786f, 7.976349f),
                    PathNode.CurveTo(104.646996f, 7.718657f, 83.17734f, 22.734613f, 75.2f, 45.33f),
                    PathNode.LineTo(75.2f, 45.33f),
                    PathNode.LineTo(45.69f, 128.83f),
                    PathNode.CurveTo(31.940578f, 165.22302f, 43.719368f, 206.3256f, 74.65729f, 229.91254f),
                    PathNode.CurveTo(105.59521f, 253.49948f, 148.3496f, 253.97278f, 179.8021f, 231.0765f),
                    PathNode.CurveTo(211.2546f, 208.18024f, 223.9404f, 167.34848f, 211.0f, 130.66f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 200.0f),
                    PathNode.CurveTo(105.90861f, 200.0f, 88.0f, 182.09138f, 88.0f, 160.0f),
                    PathNode.CurveTo(88.0f, 137.90862f, 105.90861f, 120.0f, 128.0f, 120.0f),
                    PathNode.CurveTo(150.09138f, 120.0f, 168.0f, 137.90862f, 168.0f, 160.0f),
                    PathNode.CurveTo(168.0f, 182.09138f, 150.09138f, 200.0f, 128.0f, 200.0f),
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
        return _avocado!!
    }

private var _avocado: ImageVector? = null
