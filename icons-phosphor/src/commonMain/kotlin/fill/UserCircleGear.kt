package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserCircleGear: ImageVector
    get() {
        if (_userCircleGear != null) return _userCircleGear!!
        _userCircleGear = phosphorFillIcon(
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
                    PathNode.MoveTo(200.0f, 64.0f),
                    PathNode.CurveTo(195.58173f, 64.0f, 192.0f, 60.418278f, 192.0f, 56.0f),
                    PathNode.CurveTo(192.0f, 51.581722f, 195.58173f, 48.0f, 200.0f, 48.0f),
                    PathNode.CurveTo(204.41827f, 48.0f, 208.0f, 51.581722f, 208.0f, 56.0f),
                    PathNode.CurveTo(208.0f, 60.418278f, 204.41827f, 64.0f, 200.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 76.0f),
                    PathNode.CurveTo(152.30052f, 76.0f, 172.0f, 95.69947f, 172.0f, 120.0f),
                    PathNode.CurveTo(172.0f, 144.30052f, 152.30052f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(103.69947f, 164.0f, 84.0f, 144.30052f, 84.0f, 120.0f),
                    PathNode.CurveTo(84.0f, 95.69947f, 103.69947f, 76.0f, 128.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(230.56f, 110.68f),
                    PathNode.CurveTo(238.05928f, 155.25815f, 215.88072f, 199.57088f, 175.70204f, 220.28616f),
                    PathNode.CurveTo(135.52335f, 241.00143f, 86.561905f, 233.36696f, 54.59747f, 201.40253f),
                    PathNode.CurveTo(22.633038f, 169.4381f, 14.998562f, 120.476654f, 35.71384f, 80.297966f),
                    PathNode.CurveTo(56.429115f, 40.119274f, 100.74186f, 17.940714f, 145.32f, 25.44f),
                    PathNode.CurveTo(149.64227f, 26.204374f, 152.54147f, 30.308643f, 151.8172f, 34.63782f),
                    PathNode.CurveTo(151.09293f, 38.966995f, 147.0157f, 41.904106f, 142.68f, 41.22f),
                    PathNode.CurveTo(117.13937f, 36.923504f, 91.002304f, 44.086994f, 71.2212f, 60.804993f),
                    PathNode.CurveTo(51.44009f, 77.522995f, 40.0205f, 102.10052f, 40.0f, 128.0f),
                    PathNode.CurveTo(39.981037f, 149.54193f, 47.898487f, 170.3359f, 62.24f, 186.41f),
                    PathNode.CurveTo(68.05623f, 177.97409f, 75.444405f, 170.7387f, 84.0f, 165.1f),
                    PathNode.CurveTo(85.49916f, 164.10986f, 87.47457f, 164.24072f, 88.83f, 165.42f),
                    PathNode.CurveTo(111.29839f, 184.86096f, 144.6316f, 184.86096f, 167.1f, 165.42f),
                    PathNode.CurveTo(168.45724f, 164.23572f, 170.43864f, 164.10472f, 171.94f, 165.1f),
                    PathNode.CurveTo(180.50403f, 170.7386f, 187.90207f, 177.97368f, 193.73f, 186.41f),
                    PathNode.CurveTo(208.0824f, 170.34035f, 216.0107f, 149.54588f, 216.0f, 128.0f),
                    PathNode.CurveTo(216.00037f, 123.08133f, 215.5923f, 118.17113f, 214.78f, 113.32f),
                    PathNode.CurveTo(214.2792f, 110.488144f, 215.3369f, 107.60539f, 217.55034f, 105.7694f),
                    PathNode.CurveTo(219.76378f, 103.93341f, 222.79236f, 103.426735f, 225.48286f, 104.44228f),
                    PathNode.CurveTo(228.17339f, 105.45784f, 230.11179f, 107.83934f, 230.56f, 110.68f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _userCircleGear!!
    }

private var _userCircleGear: ImageVector? = null
