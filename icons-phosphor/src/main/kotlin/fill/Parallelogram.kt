package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Parallelogram: ImageVector
    get() {
        if (_parallelogram != null) return _parallelogram!!
        _parallelogram = phosphorFillIcon(
            name = "Parallelogram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(246.58f, 62.57f),
                    PathNode.LineTo(181.78f, 206.57f),
                    PathNode.CurveTo(179.19514f, 212.30974f, 173.48492f, 216.00044f, 167.19f, 216.0f),
                    PathNode.LineTo(24.0f, 216.0f),
                    PathNode.CurveTo(18.571503f, 215.997f, 13.514803f, 213.24173f, 10.5692f, 208.6819f),
                    PathNode.CurveTo(7.623596f, 204.12207f, 7.190922f, 198.37973f, 9.42f, 193.43f),
                    PathNode.LineTo(74.22f, 49.43f),
                    PathNode.CurveTo(76.804855f, 43.69026f, 82.515076f, 39.999554f, 88.81f, 40.0f),
                    PathNode.LineTo(232.0f, 40.0f),
                    PathNode.CurveTo(237.43027f, 39.999615f, 242.4901f, 42.75351f, 245.43808f, 47.313904f),
                    PathNode.CurveTo(248.38608f, 51.8743f, 248.81981f, 57.618652f, 246.59f, 62.57f),
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
        return _parallelogram!!
    }

private var _parallelogram: ImageVector? = null
