package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Aperture: ImageVector
    get() {
        if (_aperture != null) return _aperture!!
        _aperture = phosphorBoldIcon(
            name = "Aperture",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.41f, 51.63f),
                    PathNode.CurveTo(162.23265f, 9.455381f, 93.852104f, 9.456855f, 51.67658f, 51.63329f),
                    PathNode.CurveTo(9.501054f, 93.80972f, 9.501054f, 162.19028f, 51.67658f, 204.36671f),
                    PathNode.CurveTo(93.852104f, 246.54315f, 162.23265f, 246.54462f, 204.41f, 204.37f),
                    PathNode.CurveTo(224.81874f, 184.19759f, 236.30432f, 156.6957f, 236.30432f, 128.0f),
                    PathNode.CurveTo(236.30432f, 99.304306f, 224.81874f, 71.802414f, 204.41f, 51.63f),
                    PathNode.Close,
                    PathNode.MoveTo(187.41f, 68.63f),
                    PathNode.CurveTo(190.63658f, 71.84072f, 193.59636f, 75.308846f, 196.26f, 79.0f),
                    PathNode.LineTo(169.0f, 111.09f),
                    PathNode.LineTo(145.7f, 45.88f),
                    PathNode.CurveTo(161.5163f, 49.2535f, 176.013f, 57.146275f, 187.43f, 68.6f),
                    PathNode.Close,
                    PathNode.MoveTo(68.56f, 68.63f),
                    PathNode.CurveTo(82.26048f, 54.860126f, 100.335846f, 46.301647f, 119.67f, 44.43f),
                    PathNode.LineTo(133.83f, 84.08f),
                    PathNode.LineTo(65.71f, 71.61f),
                    PathNode.CurveTo(66.64f, 70.59f, 67.59f, 69.59f, 68.58f, 68.6f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 153.7f),
                    PathNode.CurveTo(41.664288f, 133.86774f, 42.875057f, 112.394356f, 51.4f, 93.4f),
                    PathNode.LineTo(92.84f, 101.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.55f, 187.4f),
                    PathNode.CurveTo(65.336266f, 184.17789f, 62.389893f, 180.69975f, 59.74f, 177.0f),
                    PathNode.LineTo(87.0f, 144.91f),
                    PathNode.LineTo(110.3f, 210.12f),
                    PathNode.CurveTo(94.48749f, 206.74414f, 79.99461f, 198.85158f, 68.58f, 187.4f),
                    PathNode.Close,
                    PathNode.MoveTo(104.91f, 123.79f),
                    PathNode.LineTo(120.09f, 105.94f),
                    PathNode.LineTo(143.15f, 110.15f),
                    PathNode.LineTo(151.03f, 132.21f),
                    PathNode.LineTo(135.86f, 150.06f),
                    PathNode.LineTo(112.8f, 145.85f),
                    PathNode.Close,
                    PathNode.MoveTo(187.4f, 187.4f),
                    PathNode.CurveTo(173.69707f, 201.1664f, 155.62303f, 209.72426f, 136.29f, 211.6f),
                    PathNode.LineTo(122.15f, 172.0f),
                    PathNode.LineTo(190.29f, 184.44f),
                    PathNode.CurveTo(189.36f, 185.41f, 188.41f, 186.41f, 187.43f, 187.4f),
                    PathNode.Close,
                    PathNode.MoveTo(163.16f, 155.0f),
                    PathNode.LineTo(208.0f, 102.3f),
                    PathNode.CurveTo(214.33733f, 122.13289f, 213.1229f, 143.60803f, 204.59f, 162.6f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _aperture!!
    }

private var _aperture: ImageVector? = null
