package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Person: ImageVector
    get() {
        if (_person != null) return _person!!
        _person = phosphorFillIcon(
            name = "Person",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(100.0f, 36.0f),
                    PathNode.CurveTo(100.0f, 20.536028f, 112.536026f, 8.0f, 128.0f, 8.0f),
                    PathNode.CurveTo(143.46397f, 8.0f, 156.0f, 20.536028f, 156.0f, 36.0f),
                    PathNode.CurveTo(156.0f, 51.46397f, 143.46397f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(112.536026f, 64.0f, 100.0f, 51.46397f, 100.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(215.42f, 140.78f),
                    PathNode.LineTo(170.17f, 89.48f),
                    PathNode.CurveTo(164.85472f, 83.45289f, 157.20605f, 80.00007f, 149.17f, 80.0f),
                    PathNode.LineTo(106.83f, 80.0f),
                    PathNode.CurveTo(98.793945f, 80.00007f, 91.14528f, 83.45289f, 85.83f, 89.48f),
                    PathNode.LineTo(40.58f, 140.78f),
                    PathNode.CurveTo(34.466118f, 147.03563f, 34.509068f, 157.04158f, 40.676434f, 163.24449f),
                    PathNode.CurveTo(46.843803f, 169.4474f, 56.849346f, 169.54784f, 63.14f, 163.47f),
                    PathNode.LineTo(89.0f, 142.7f),
                    PathNode.LineTo(69.3f, 217.58f),
                    PathNode.CurveTo(65.7331f, 225.58743f, 69.27355f, 234.97412f, 77.240105f, 238.63141f),
                    PathNode.CurveTo(85.20666f, 242.28868f, 94.63283f, 238.85466f, 98.38f, 230.93f),
                    PathNode.LineTo(128.0f, 180.0f),
                    PathNode.LineTo(157.58f, 231.0f),
                    PathNode.CurveTo(161.32718f, 238.92467f, 170.75334f, 242.35867f, 178.7199f, 238.7014f),
                    PathNode.CurveTo(186.68645f, 235.04413f, 190.2269f, 225.65742f, 186.66f, 217.65f),
                    PathNode.LineTo(167.0f, 142.7f),
                    PathNode.LineTo(192.9f, 163.47f),
                    PathNode.CurveTo(199.19066f, 169.54784f, 209.1962f, 169.4474f, 215.36357f, 163.24449f),
                    PathNode.CurveTo(221.53093f, 157.04158f, 221.57388f, 147.03563f, 215.46f, 140.78f),
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
        return _person!!
    }

private var _person: ImageVector? = null
