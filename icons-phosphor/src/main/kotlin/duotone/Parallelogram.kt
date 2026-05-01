package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Parallelogram: ImageVector
    get() {
        if (_parallelogram != null) return _parallelogram!!
        _parallelogram = phosphorDuotoneIcon(
            name = "Parallelogram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(239.29f, 59.28f),
                    PathNode.LineTo(174.49f, 203.28f),
                    PathNode.CurveTo(173.19832f, 206.15347f, 170.34044f, 208.00131f, 167.19f, 208.0f),
                    PathNode.LineTo(24.0f, 208.0f),
                    PathNode.CurveTo(21.285349f, 208.00113f, 18.755348f, 206.62553f, 17.280441f, 204.34651f),
                    PathNode.CurveTo(15.805536f, 202.06747f, 15.586992f, 199.196f, 16.7f, 196.72f),
                    PathNode.LineTo(81.5f, 52.72f),
                    PathNode.CurveTo(82.79317f, 49.843216f, 85.65593f, 47.99475f, 88.81f, 48.0f),
                    PathNode.LineTo(232.0f, 48.0f),
                    PathNode.CurveTo(234.71288f, 48.002262f, 237.23976f, 49.37923f, 238.7123f, 51.657692f),
                    PathNode.CurveTo(240.1848f, 53.936157f, 240.40228f, 56.805622f, 239.29f, 59.28f),
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
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _parallelogram!!
    }

private var _parallelogram: ImageVector? = null
