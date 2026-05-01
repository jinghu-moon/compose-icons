package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.UserCircleGear: ImageVector
    get() {
        if (_userCircleGear != null) return _userCircleGear!!
        _userCircleGear = phosphorRegularIcon(
            name = "UserCircleGear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.25f, 63.07f),
                    PathNode.LineTo(223.59f, 60.38f),
                    PathNode.CurveTo(224.13669f, 57.485588f, 224.13669f, 54.514412f, 223.59f, 51.62f),
                    PathNode.LineTo(228.25f, 48.93f),
                    PathNode.CurveTo(232.07733f, 46.72086f, 233.38914f, 41.82733f, 231.18f, 38.0f),
                    PathNode.CurveTo(228.97084f, 34.17267f, 224.07733f, 32.860863f, 220.25f, 35.07f),
                    PathNode.LineTo(215.58f, 37.77f),
                    PathNode.CurveTo(213.3451f, 35.852566f, 210.77534f, 34.364285f, 208.0f, 33.38f),
                    PathNode.LineTo(208.0f, 28.0f),
                    PathNode.CurveTo(208.0f, 23.581722f, 204.41827f, 20.0f, 200.0f, 20.0f),
                    PathNode.CurveTo(195.58173f, 20.0f, 192.0f, 23.581722f, 192.0f, 28.0f),
                    PathNode.LineTo(192.0f, 33.38f),
                    PathNode.CurveTo(189.22466f, 34.364285f, 186.6549f, 35.852566f, 184.42f, 37.77f),
                    PathNode.LineTo(179.75f, 35.07f),
                    PathNode.CurveTo(175.92267f, 32.860863f, 171.02916f, 34.17267f, 168.82f, 38.0f),
                    PathNode.CurveTo(166.61086f, 41.82733f, 167.92267f, 46.72086f, 171.75f, 48.93f),
                    PathNode.LineTo(176.41f, 51.62f),
                    PathNode.CurveTo(175.86331f, 54.514412f, 175.86331f, 57.485588f, 176.41f, 60.38f),
                    PathNode.LineTo(171.75f, 63.07f),
                    PathNode.CurveTo(168.61237f, 64.87964f, 167.08206f, 68.57162f, 168.01941f, 72.07032f),
                    PathNode.CurveTo(168.95677f, 75.56902f, 172.12791f, 78.00141f, 175.75f, 78.0f),
                    PathNode.CurveTo(177.15463f, 78.00435f, 178.53514f, 77.63506f, 179.75f, 76.93f),
                    PathNode.LineTo(184.42f, 74.23f),
                    PathNode.CurveTo(186.6549f, 76.14743f, 189.22466f, 77.63572f, 192.0f, 78.62f),
                    PathNode.LineTo(192.0f, 84.0f),
                    PathNode.CurveTo(192.0f, 88.41828f, 195.58173f, 92.0f, 200.0f, 92.0f),
                    PathNode.CurveTo(204.41827f, 92.0f, 208.0f, 88.41828f, 208.0f, 84.0f),
                    PathNode.LineTo(208.0f, 78.62f),
                    PathNode.CurveTo(210.77534f, 77.63572f, 213.3451f, 76.14743f, 215.58f, 74.23f),
                    PathNode.LineTo(220.25f, 76.93f),
                    PathNode.CurveTo(221.46486f, 77.63506f, 222.84537f, 78.00435f, 224.25f, 78.0f),
                    PathNode.CurveTo(227.87209f, 78.00141f, 231.04323f, 75.56902f, 231.98059f, 72.07032f),
                    PathNode.CurveTo(232.91794f, 68.57162f, 231.38763f, 64.87964f, 228.25f, 63.07f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 56.0f),
                    PathNode.CurveTo(192.0f, 51.581722f, 195.58173f, 48.0f, 200.0f, 48.0f),
                    PathNode.CurveTo(204.41827f, 48.0f, 208.0f, 51.581722f, 208.0f, 56.0f),
                    PathNode.CurveTo(208.0f, 60.418278f, 204.41827f, 64.0f, 200.0f, 64.0f),
                    PathNode.CurveTo(195.58173f, 64.0f, 192.0f, 60.418278f, 192.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(221.35f, 104.11f),
                    PathNode.CurveTo(216.9926f, 104.83919f, 214.05118f, 108.96252f, 214.78f, 113.32f),
                    PathNode.CurveTo(215.5923f, 118.17113f, 216.00037f, 123.08133f, 216.0f, 128.0f),
                    PathNode.CurveTo(216.01897f, 149.54193f, 208.10152f, 170.3359f, 193.76f, 186.41f),
                    PathNode.CurveTo(184.83769f, 173.48077f, 172.29182f, 163.47818f, 157.7f, 157.66f),
                    PathNode.CurveTo(173.7668f, 145.00536f, 180.05058f, 123.56005f, 173.35413f, 104.23546f),
                    PathNode.CurveTo(166.65768f, 84.91087f, 148.45195f, 71.951775f, 128.0f, 71.951775f),
                    PathNode.CurveTo(107.54806f, 71.951775f, 89.342316f, 84.91087f, 82.64587f, 104.23546f),
                    PathNode.CurveTo(75.949425f, 123.56005f, 82.2332f, 145.00536f, 98.3f, 157.66f),
                    PathNode.CurveTo(83.708176f, 163.47818f, 71.16231f, 173.48077f, 62.24f, 186.41f),
                    PathNode.CurveTo(39.254498f, 160.50853f, 33.59688f, 123.534325f, 47.785362f, 91.944664f),
                    PathNode.CurveTo(61.973843f, 60.355007f, 93.37026f, 40.0236f, 128.0f, 40.0f),
                    PathNode.CurveTo(132.91869f, 39.999214f, 137.82892f, 40.407284f, 142.68f, 41.22f),
                    PathNode.CurveTo(147.0157f, 41.904106f, 151.09293f, 38.966995f, 151.8172f, 34.63782f),
                    PathNode.CurveTo(152.54147f, 30.308643f, 149.64227f, 26.204374f, 145.32f, 25.44f),
                    PathNode.CurveTo(100.74186f, 17.940714f, 56.429115f, 40.119274f, 35.71384f, 80.297966f),
                    PathNode.CurveTo(14.998562f, 120.476654f, 22.633038f, 169.4381f, 54.59747f, 201.40253f),
                    PathNode.CurveTo(86.561905f, 233.36696f, 135.52335f, 241.00143f, 175.70204f, 220.28616f),
                    PathNode.CurveTo(215.88072f, 199.57088f, 238.05928f, 155.25815f, 230.56f, 110.68f),
                    PathNode.CurveTo(229.83081f, 106.32258f, 225.70747f, 103.38119f, 221.35f, 104.11f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 120.0f),
                    PathNode.CurveTo(96.0f, 102.32689f, 110.32689f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(145.67311f, 88.0f, 160.0f, 102.32689f, 160.0f, 120.0f),
                    PathNode.CurveTo(160.0f, 137.67311f, 145.67311f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(110.32689f, 152.0f, 96.0f, 137.67311f, 96.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(74.08f, 197.5f),
                    PathNode.CurveTo(85.8411f, 179.1061f, 106.16747f, 167.97656f, 128.0f, 167.97656f),
                    PathNode.CurveTo(149.83252f, 167.97656f, 170.1589f, 179.1061f, 181.92f, 197.5f),
                    PathNode.CurveTo(150.2046f, 222.16577f, 105.795395f, 222.16577f, 74.08f, 197.5f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _userCircleGear!!
    }

private var _userCircleGear: ImageVector? = null
