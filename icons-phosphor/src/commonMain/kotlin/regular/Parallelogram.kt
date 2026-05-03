package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Parallelogram: ImageVector
    get() {
        if (_parallelogram != null) return _parallelogram!!
        _parallelogram = phosphorRegularIcon(
            name = "Parallelogram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(245.43f, 47.31f),
                    PathNode.CurveTo(242.49046f, 42.745094f, 237.42947f, 39.99038f, 232.0f, 40.0f),
                    PathNode.LineTo(88.81f, 40.0f),
                    PathNode.CurveTo(82.515076f, 39.999554f, 76.804855f, 43.69026f, 74.22f, 49.43f),
                    PathNode.LineTo(9.42f, 193.43f),
                    PathNode.CurveTo(7.190922f, 198.37973f, 7.623596f, 204.12207f, 10.5692f, 208.6819f),
                    PathNode.CurveTo(13.514803f, 213.24173f, 18.571503f, 215.997f, 24.0f, 216.0f),
                    PathNode.LineTo(167.19f, 216.0f),
                    PathNode.CurveTo(173.48492f, 216.00044f, 179.19514f, 212.30974f, 181.78f, 206.57f),
                    PathNode.LineTo(246.58f, 62.57f),
                    PathNode.CurveTo(248.8118f, 57.61789f, 248.37877f, 51.8717f, 245.43f, 47.31f),
                    PathNode.Close,
                    PathNode.MoveTo(167.19f, 200.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.LineTo(88.81f, 56.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _parallelogram!!
    }

private var _parallelogram: ImageVector? = null
