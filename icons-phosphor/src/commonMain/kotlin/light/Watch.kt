package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Watch: ImageVector
    get() {
        if (_watch != null) return _watch!!
        _watch = phosphorLightIcon(
            name = "Watch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(206.0f, 128.0f),
                    PathNode.CurveTo(205.99207f, 102.88769f, 193.88168f, 79.318436f, 173.47f, 64.69f),
                    PathNode.LineTo(167.1f, 29.5f),
                    PathNode.CurveTo(165.89113f, 22.839222f, 160.08958f, 17.997572f, 153.32f, 18.0f),
                    PathNode.LineTo(102.68f, 18.0f),
                    PathNode.CurveTo(95.910416f, 17.997572f, 90.10886f, 22.839222f, 88.9f, 29.5f),
                    PathNode.LineTo(82.53f, 64.69f),
                    PathNode.CurveTo(62.111298f, 79.312546f, 49.998512f, 102.885414f, 49.998512f, 128.0f),
                    PathNode.CurveTo(49.998512f, 153.11458f, 62.111298f, 176.68745f, 82.53f, 191.31f),
                    PathNode.LineTo(88.9f, 226.5f),
                    PathNode.CurveTo(90.10886f, 233.16078f, 95.910416f, 238.00243f, 102.68f, 238.0f),
                    PathNode.LineTo(153.32f, 238.0f),
                    PathNode.CurveTo(160.08958f, 238.00243f, 165.89113f, 233.16078f, 167.1f, 226.5f),
                    PathNode.LineTo(173.47f, 191.31f),
                    PathNode.CurveTo(193.88168f, 176.68156f, 205.99207f, 153.1123f, 206.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.71f, 31.64f),
                    PathNode.CurveTo(100.88593f, 30.677814f, 101.731995f, 29.984047f, 102.71f, 30.0f),
                    PathNode.LineTo(153.35f, 30.0f),
                    PathNode.CurveTo(154.328f, 29.984047f, 155.17409f, 30.677814f, 155.35f, 31.64f),
                    PathNode.LineTo(159.91f, 56.83f),
                    PathNode.CurveTo(139.65302f, 47.723686f, 116.46697f, 47.723686f, 96.21f, 56.83f),
                    PathNode.Close,
                    PathNode.MoveTo(155.29f, 224.36f),
                    PathNode.CurveTo(155.11406f, 225.32219f, 154.268f, 226.01595f, 153.29f, 226.0f),
                    PathNode.LineTo(102.68f, 226.0f),
                    PathNode.CurveTo(101.70199f, 226.01595f, 100.855934f, 225.32219f, 100.68f, 224.36f),
                    PathNode.LineTo(96.12f, 199.17f),
                    PathNode.CurveTo(116.376976f, 208.27632f, 139.56302f, 208.27632f, 159.82f, 199.17f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 194.0f),
                    PathNode.CurveTo(91.54921f, 194.0f, 62.0f, 164.45079f, 62.0f, 128.0f),
                    PathNode.CurveTo(62.0f, 91.54921f, 91.54921f, 62.0f, 128.0f, 62.0f),
                    PathNode.CurveTo(164.45079f, 62.0f, 194.0f, 91.54921f, 194.0f, 128.0f),
                    PathNode.CurveTo(193.95592f, 164.43253f, 164.43253f, 193.95592f, 128.0f, 194.0f),
                    PathNode.Close,
                    PathNode.MoveTo(174.0f, 128.0f),
                    PathNode.CurveTo(174.0f, 131.3137f, 171.3137f, 134.0f, 168.0f, 134.0f),
                    PathNode.LineTo(128.0f, 134.0f),
                    PathNode.CurveTo(124.686295f, 134.0f, 122.0f, 131.3137f, 122.0f, 128.0f),
                    PathNode.LineTo(122.0f, 88.0f),
                    PathNode.CurveTo(122.0f, 84.686295f, 124.686295f, 82.0f, 128.0f, 82.0f),
                    PathNode.CurveTo(131.3137f, 82.0f, 134.0f, 84.686295f, 134.0f, 88.0f),
                    PathNode.LineTo(134.0f, 122.0f),
                    PathNode.LineTo(168.0f, 122.0f),
                    PathNode.CurveTo(171.3137f, 122.0f, 174.0f, 124.686295f, 174.0f, 128.0f),
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
        return _watch!!
    }

private var _watch: ImageVector? = null
