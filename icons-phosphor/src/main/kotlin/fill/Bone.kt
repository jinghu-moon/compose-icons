package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Bone: ImageVector
    get() {
        if (_bone != null) return _bone!!
        _bone = phosphorFillIcon(
            name = "Bone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(231.12f, 107.72f),
                    PathNode.CurveTo(219.49864f, 121.05192f, 199.90042f, 123.937126f, 184.93f, 114.52f),
                    PathNode.CurveTo(184.8978f, 114.50769f, 184.8622f, 114.50769f, 184.83f, 114.52f),
                    PathNode.LineTo(114.48f, 184.88f),
                    PathNode.CurveTo(114.48f, 184.88f, 114.48f, 184.88f, 114.48f, 184.96f),
                    PathNode.CurveTo(122.28307f, 197.5292f, 121.602f, 213.59262f, 112.762985f, 225.4562f),
                    PathNode.CurveTo(103.92398f, 237.3198f, 88.72681f, 242.56793f, 74.45059f, 238.68689f),
                    PathNode.CurveTo(60.174374f, 234.80582f, 49.725994f, 222.58583f, 48.11f, 207.88f),
                    PathNode.CurveTo(33.40417f, 206.264f, 21.184168f, 195.81563f, 17.303116f, 181.53941f),
                    PathNode.CurveTo(13.422062f, 167.2632f, 18.670204f, 152.06602f, 30.533794f, 143.227f),
                    PathNode.CurveTo(42.397385f, 134.388f, 58.460796f, 133.70692f, 71.03f, 141.51f),
                    PathNode.CurveTo(71.062195f, 141.52231f, 71.0978f, 141.52231f, 71.13f, 141.51f),
                    PathNode.LineTo(141.48f, 71.15f),
                    PathNode.CurveTo(141.48f, 71.15f, 141.48f, 71.15f, 141.48f, 71.07f),
                    PathNode.CurveTo(133.67693f, 58.500797f, 134.358f, 42.437386f, 143.197f, 30.573795f),
                    PathNode.CurveTo(152.03603f, 18.710205f, 167.2332f, 13.462062f, 181.50941f, 17.343115f),
                    PathNode.CurveTo(195.78563f, 21.224169f, 206.23401f, 33.444168f, 207.85f, 48.15f),
                    PathNode.CurveTo(221.23517f, 49.558983f, 232.71648f, 58.316772f, 237.61368f, 70.85335f),
                    PathNode.CurveTo(242.51088f, 83.389915f, 240.00595f, 97.61118f, 231.12f, 107.72f),
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
        return _bone!!
    }

private var _bone: ImageVector? = null
