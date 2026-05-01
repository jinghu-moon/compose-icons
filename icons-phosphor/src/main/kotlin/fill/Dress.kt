package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Dress: ImageVector
    get() {
        if (_dress != null) return _dress!!
        _dress = phosphorFillIcon(
            name = "Dress",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(66.26f, 80.23f),
                    PathNode.CurveTo(64.029816f, 76.58346f, 63.431267f, 72.16872f, 64.61f, 68.06f),
                    PathNode.CurveTo(65.00658f, 66.37291f, 65.68257f, 64.764046f, 66.61f, 63.3f),
                    PathNode.LineTo(88.0f, 32.7f),
                    PathNode.LineTo(88.0f, 8.0f),
                    PathNode.CurveTo(87.99513f, 5.783165f, 88.91034f, 3.663696f, 90.52731f, 2.147192f),
                    PathNode.CurveTo(92.14429f, 0.630689f, 94.31803f, -0.146871f, 96.53f, 0f),
                    PathNode.CurveTo(100.805466f, 0.367124f, 104.06826f, 3.979348f, 104.0f, 8.270001f),
                    PathNode.LineTo(104.0f, 32.42f),
                    PathNode.LineTo(109.25f, 39.0f),
                    PathNode.CurveTo(113.881966f, 44.80932f, 120.95134f, 48.135216f, 128.38f, 48.0f),
                    PathNode.CurveTo(135.708f, 47.792725f, 142.56422f, 44.337128f, 147.09f, 38.57f),
                    PathNode.LineTo(152.0f, 32.42f),
                    PathNode.LineTo(152.0f, 8.0f),
                    PathNode.CurveTo(151.99513f, 5.783165f, 152.91034f, 3.663696f, 154.52731f, 2.147192f),
                    PathNode.CurveTo(156.14429f, 0.630689f, 158.31801f, -0.146871f, 160.53f, 0f),
                    PathNode.CurveTo(164.80547f, 0.367124f, 168.06825f, 3.979348f, 168.0f, 8.270001f),
                    PathNode.LineTo(168.0f, 32.7f),
                    PathNode.LineTo(189.42f, 63.3f),
                    PathNode.CurveTo(190.34743f, 64.764046f, 191.02342f, 66.37291f, 191.42f, 68.06f),
                    PathNode.CurveTo(192.59874f, 72.16872f, 192.00018f, 76.58346f, 189.77f, 80.23f),
                    PathNode.CurveTo(189.72972f, 80.28772f, 189.693f, 80.34783f, 189.66f, 80.41f),
                    PathNode.LineTo(175.8f, 102.15f),
                    PathNode.CurveTo(175.06035f, 103.31047f, 173.77611f, 104.00925f, 172.4f, 104.0f),
                    PathNode.LineTo(83.6f, 104.0f),
                    PathNode.CurveTo(82.234535f, 103.998955f, 80.963936f, 103.301445f, 80.23f, 102.15f),
                    PathNode.LineTo(66.37f, 80.41f),
                    PathNode.CurveTo(66.337006f, 80.34783f, 66.30027f, 80.28772f, 66.26f, 80.23f),
                    PathNode.Close,
                    PathNode.MoveTo(214.76f, 209.79f),
                    PathNode.CurveTo(214.71843f, 209.67313f, 214.6683f, 209.5595f, 214.61f, 209.45f),
                    PathNode.LineTo(173.69f, 122.3f),
                    PathNode.CurveTo(173.02953f, 120.89327f, 171.61406f, 119.996414f, 170.06f, 120.0f),
                    PathNode.LineTo(85.94f, 120.0f),
                    PathNode.CurveTo(84.38594f, 119.996414f, 82.970474f, 120.89327f, 82.31f, 122.3f),
                    PathNode.LineTo(41.39f, 209.45f),
                    PathNode.CurveTo(41.3317f, 209.5595f, 41.281563f, 209.67313f, 41.24f, 209.79f),
                    PathNode.CurveTo(39.475655f, 214.04411f, 39.60658f, 218.8483f, 41.6f, 223.0f),
                    PathNode.CurveTo(44.28071f, 228.50983f, 49.87266f, 232.00479f, 56.0f, 232.0f),
                    PathNode.LineTo(200.0f, 232.0f),
                    PathNode.CurveTo(206.12373f, 232.00096f, 211.71086f, 228.50658f, 214.39f, 223.0f),
                    PathNode.CurveTo(216.38664f, 218.84973f, 216.52121f, 214.04552f, 214.76f, 209.79f),
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
        return _dress!!
    }

private var _dress: ImageVector? = null
