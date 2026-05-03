package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.WaveSawtooth: ImageVector
    get() {
        if (_waveSawtooth != null) return _waveSawtooth!!
        _waveSawtooth = phosphorDuotoneIcon(
            name = "WaveSawtooth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 64.0f),
                    PathNode.LineTo(128.0f, 128.0f),
                    PathNode.LineTo(24.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.LineTo(128.0f, 128.0f),
                    PathNode.LineTo(128.0f, 192.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.19f, 134.81f),
                    PathNode.LineTo(132.19f, 198.81f),
                    PathNode.CurveTo(129.7223f, 200.3272f, 126.627235f, 200.39186f, 124.09833f, 198.9791f),
                    PathNode.CurveTo(121.56941f, 197.56628f, 120.0018f, 194.89679f, 120.0f, 192.0f),
                    PathNode.LineTo(120.0f, 78.32f),
                    PathNode.LineTo(28.19f, 134.81f),
                    PathNode.CurveTo(24.441599f, 136.95131f, 19.670341f, 135.7325f, 17.40816f, 132.05577f),
                    PathNode.CurveTo(15.145978f, 128.37906f, 16.208857f, 123.570656f, 19.81f, 121.19f),
                    PathNode.LineTo(123.81f, 57.19f),
                    PathNode.CurveTo(126.27769f, 55.67281f, 129.37276f, 55.60814f, 131.90167f, 57.020924f),
                    PathNode.CurveTo(134.43059f, 58.433712f, 135.9982f, 61.10322f, 136.0f, 64.0f),
                    PathNode.LineTo(136.0f, 177.68f),
                    PathNode.LineTo(227.81f, 121.19f),
                    PathNode.CurveTo(231.5584f, 119.04868f, 236.32967f, 120.26751f, 238.59184f, 123.94423f),
                    PathNode.CurveTo(240.85402f, 127.62095f, 239.79114f, 132.42935f, 236.19f, 134.81f),
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
        return _waveSawtooth!!
    }

private var _waveSawtooth: ImageVector? = null
