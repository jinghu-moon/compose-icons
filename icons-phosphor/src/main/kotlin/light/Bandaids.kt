package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bandaids: ImageVector
    get() {
        if (_bandaids != null) return _bandaids!!
        _bandaids = phosphorLightIcon(
            name = "Bandaids",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(181.74f, 128.0f),
                    PathNode.LineTo(210.87f, 98.87f),
                    PathNode.CurveTo(220.50291f, 89.27693f, 224.27716f, 75.26859f, 220.76764f, 62.134552f),
                    PathNode.CurveTo(217.2581f, 49.00051f, 206.9995f, 38.741886f, 193.86543f, 35.232357f),
                    PathNode.CurveTo(180.7314f, 31.722822f, 166.72307f, 35.497093f, 157.13f, 45.13f),
                    PathNode.LineTo(128.0f, 74.26f),
                    PathNode.LineTo(98.87f, 45.13f),
                    PathNode.CurveTo(89.27693f, 35.497093f, 75.26859f, 31.722822f, 62.134552f, 35.232357f),
                    PathNode.CurveTo(49.00051f, 38.741886f, 38.741886f, 49.00051f, 35.232357f, 62.134552f),
                    PathNode.CurveTo(31.722822f, 75.26859f, 35.497093f, 89.27693f, 45.13f, 98.87f),
                    PathNode.LineTo(74.26f, 128.0f),
                    PathNode.LineTo(45.13f, 157.13f),
                    PathNode.CurveTo(35.497093f, 166.72307f, 31.722822f, 180.7314f, 35.232357f, 193.86543f),
                    PathNode.CurveTo(38.741886f, 206.9995f, 49.00051f, 217.2581f, 62.134552f, 220.76764f),
                    PathNode.CurveTo(75.26859f, 224.27716f, 89.27693f, 220.50291f, 98.87f, 210.87f),
                    PathNode.LineTo(128.0f, 181.74f),
                    PathNode.LineTo(157.13f, 210.87f),
                    PathNode.CurveTo(166.72307f, 220.50291f, 180.7314f, 224.27716f, 193.86543f, 220.76764f),
                    PathNode.CurveTo(206.9995f, 217.2581f, 217.2581f, 206.9995f, 220.76764f, 193.86543f),
                    PathNode.CurveTo(224.27716f, 180.7314f, 220.50291f, 166.72307f, 210.87f, 157.13f),
                    PathNode.Close,
                    PathNode.MoveTo(165.62f, 53.62f),
                    PathNode.LineTo(165.62f, 53.62f),
                    PathNode.CurveTo(172.15286f, 46.88007f, 181.81134f, 44.184597f, 190.89021f, 46.567627f),
                    PathNode.CurveTo(199.9691f, 48.950657f, 207.05869f, 56.04217f, 209.43925f, 65.1217f),
                    PathNode.CurveTo(211.81981f, 74.201225f, 209.12172f, 83.85898f, 202.38f, 90.39f),
                    PathNode.LineTo(173.25f, 119.52f),
                    PathNode.LineTo(136.49f, 82.75f),
                    PathNode.Close,
                    PathNode.MoveTo(164.77f, 128.0f),
                    PathNode.LineTo(128.0f, 164.77f),
                    PathNode.LineTo(91.23f, 128.0f),
                    PathNode.LineTo(128.0f, 91.23f),
                    PathNode.Close,
                    PathNode.MoveTo(53.62f, 90.38f),
                    PathNode.CurveTo(46.80158f, 83.865555f, 44.04504f, 74.169846f, 46.416477f, 65.04268f),
                    PathNode.CurveTo(48.78791f, 55.91551f, 55.91551f, 48.78791f, 65.04268f, 46.416477f),
                    PathNode.CurveTo(74.169846f, 44.04504f, 83.865555f, 46.80158f, 90.38f, 53.62f),
                    PathNode.LineTo(119.51f, 82.75f),
                    PathNode.LineTo(82.75f, 119.52f),
                    PathNode.Close,
                    PathNode.MoveTo(90.38f, 202.38f),
                    PathNode.CurveTo(83.865555f, 209.19843f, 74.169846f, 211.95496f, 65.04268f, 209.58353f),
                    PathNode.CurveTo(55.91551f, 207.21208f, 48.78791f, 200.08447f, 46.416477f, 190.95732f),
                    PathNode.CurveTo(44.04504f, 181.83015f, 46.80158f, 172.13445f, 53.62f, 165.62f),
                    PathNode.LineTo(82.75f, 136.49f),
                    PathNode.LineTo(119.51f, 173.25f),
                    PathNode.Close,
                    PathNode.MoveTo(202.38f, 202.38f),
                    PathNode.CurveTo(192.22746f, 212.52727f, 175.77254f, 212.52727f, 165.62f, 202.38f),
                    PathNode.LineTo(136.48f, 173.25f),
                    PathNode.LineTo(173.25f, 136.48f),
                    PathNode.LineTo(202.38f, 165.62f),
                    PathNode.CurveTo(212.52727f, 175.77254f, 212.52727f, 192.22746f, 202.38f, 202.38f),
                    PathNode.Close,
                    PathNode.MoveTo(118.0f, 128.0f),
                    PathNode.CurveTo(118.0f, 122.47715f, 122.47715f, 118.0f, 128.0f, 118.0f),
                    PathNode.CurveTo(133.52284f, 118.0f, 138.0f, 122.47715f, 138.0f, 128.0f),
                    PathNode.CurveTo(138.0f, 133.52284f, 133.52284f, 138.0f, 128.0f, 138.0f),
                    PathNode.CurveTo(122.47715f, 138.0f, 118.0f, 133.52284f, 118.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bandaids!!
    }

private var _bandaids: ImageVector? = null
