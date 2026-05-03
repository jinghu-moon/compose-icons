package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PaperPlaneRight: ImageVector
    get() {
        if (_paperPlaneRight != null) return _paperPlaneRight!!
        _paperPlaneRight = phosphorLightIcon(
            name = "PaperPlaneRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.88f, 115.69f),
                    PathNode.LineTo(62.88f, 19.81f),
                    PathNode.CurveTo(57.79924f, 16.9945f, 51.50763f, 17.608883f, 47.06753f, 21.354103f),
                    PathNode.CurveTo(42.627426f, 25.099327f, 40.961254f, 31.197336f, 42.88f, 36.68f),
                    PathNode.LineTo(73.66f, 128.0f),
                    PathNode.LineTo(42.81f, 219.33f),
                    PathNode.CurveTo(41.294228f, 223.61382f, 41.95185f, 228.36682f, 44.573826f, 232.07814f),
                    PathNode.CurveTo(47.195797f, 235.78944f, 51.45593f, 237.99736f, 56.0f, 238.0f),
                    PathNode.CurveTo(58.428772f, 237.99486f, 60.81534f, 237.36464f, 62.93f, 236.17f),
                    PathNode.LineTo(230.84f, 140.1f),
                    PathNode.CurveTo(235.25122f, 137.62119f, 237.98158f, 132.95497f, 237.98158f, 127.895f),
                    PathNode.CurveTo(237.98158f, 122.83502f, 235.25122f, 118.168816f, 230.84f, 115.69f),
                    PathNode.Close,
                    PathNode.MoveTo(224.93f, 129.69f),
                    PathNode.LineTo(57.0f, 225.73f),
                    PathNode.CurveTo(56.272118f, 226.13771f, 55.36762f, 226.05077f, 54.730736f, 225.51186f),
                    PathNode.CurveTo(54.093853f, 224.97296f, 53.85839f, 224.09532f, 54.14f, 223.31f),
                    PathNode.CurveTo(54.14398f, 223.27678f, 54.14398f, 223.24321f, 54.14f, 223.21f),
                    PathNode.LineTo(84.3f, 134.0f),
                    PathNode.LineTo(144.0f, 134.0f),
                    PathNode.CurveTo(147.3137f, 134.0f, 150.0f, 131.3137f, 150.0f, 128.0f),
                    PathNode.CurveTo(150.0f, 124.686295f, 147.3137f, 122.0f, 144.0f, 122.0f),
                    PathNode.LineTo(84.3f, 122.0f),
                    PathNode.LineTo(54.17f, 32.8f),
                    PathNode.CurveTo(54.175594f, 32.766903f, 54.175594f, 32.733097f, 54.17f, 32.7f),
                    PathNode.CurveTo(53.848007f, 31.915451f, 54.094284f, 31.012445f, 54.77f, 30.5f),
                    PathNode.CurveTo(55.372177f, 29.923904f, 56.285206f, 29.821548f, 57.0f, 30.25f),
                    PathNode.LineTo(225.0f, 126.14f),
                    PathNode.CurveTo(225.63239f, 126.487465f, 226.01814f, 127.15867f, 226.0f, 127.88f),
                    PathNode.CurveTo(226.0035f, 128.62653f, 225.59093f, 129.31287f, 224.93f, 129.66f),
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
        return _paperPlaneRight!!
    }

private var _paperPlaneRight: ImageVector? = null
