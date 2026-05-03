package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Brandy: ImageVector
    get() {
        if (_brandy != null) return _brandy!!
        _brandy = phosphorLightIcon(
            name = "Brandy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.0f, 88.0f),
                    PathNode.LineTo(222.0f, 88.0f),
                    PathNode.CurveTo(222.02362f, 69.79141f, 216.73795f, 51.970955f, 206.79f, 36.72f),
                    PathNode.CurveTo(205.68681f, 35.03017f, 203.80803f, 34.008118f, 201.79f, 34.0f),
                    PathNode.LineTo(54.23f, 34.0f),
                    PathNode.CurveTo(52.211964f, 34.008118f, 50.333187f, 35.03017f, 49.23f, 36.72f),
                    PathNode.CurveTo(39.274998f, 51.968765f, 33.98233f, 69.78938f, 34.0f, 88.0f),
                    PathNode.LineTo(34.0f, 88.0f),
                    PathNode.CurveTo(34.053764f, 137.56248f, 72.54174f, 178.58716f, 122.0f, 181.8f),
                    PathNode.LineTo(122.0f, 218.0f),
                    PathNode.LineTo(88.0f, 218.0f),
                    PathNode.CurveTo(84.686295f, 218.0f, 82.0f, 220.6863f, 82.0f, 224.0f),
                    PathNode.CurveTo(82.0f, 227.3137f, 84.686295f, 230.0f, 88.0f, 230.0f),
                    PathNode.LineTo(168.0f, 230.0f),
                    PathNode.CurveTo(171.3137f, 230.0f, 174.0f, 227.3137f, 174.0f, 224.0f),
                    PathNode.CurveTo(174.0f, 220.6863f, 171.3137f, 218.0f, 168.0f, 218.0f),
                    PathNode.LineTo(134.0f, 218.0f),
                    PathNode.LineTo(134.0f, 181.8f),
                    PathNode.CurveTo(183.45827f, 178.58716f, 221.94623f, 137.56248f, 222.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(57.56f, 46.0f),
                    PathNode.LineTo(198.44f, 46.0f),
                    PathNode.CurveTo(204.98079f, 56.949177f, 208.86462f, 69.27882f, 209.78f, 82.0f),
                    PathNode.LineTo(46.22f, 82.0f),
                    PathNode.CurveTo(47.135372f, 69.27882f, 51.019207f, 56.949177f, 57.56f, 46.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 170.0f),
                    PathNode.CurveTo(85.06546f, 169.94571f, 49.425148f, 136.81625f, 46.24f, 94.0f),
                    PathNode.LineTo(209.76f, 94.0f),
                    PathNode.CurveTo(206.57486f, 136.81625f, 170.93454f, 169.94571f, 128.0f, 170.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _brandy!!
    }

private var _brandy: ImageVector? = null
