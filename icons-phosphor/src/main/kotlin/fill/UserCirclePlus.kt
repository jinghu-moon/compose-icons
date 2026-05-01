package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserCirclePlus: ImageVector
    get() {
        if (_userCirclePlus != null) return _userCirclePlus!!
        _userCirclePlus = phosphorFillIcon(
            name = "UserCirclePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 76.0f),
                    PathNode.CurveTo(152.30052f, 76.0f, 172.0f, 95.69947f, 172.0f, 120.0f),
                    PathNode.CurveTo(172.0f, 144.30052f, 152.30052f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(103.69947f, 164.0f, 84.0f, 144.30052f, 84.0f, 120.0f),
                    PathNode.CurveTo(84.0f, 95.69947f, 103.69947f, 76.0f, 128.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 64.0f),
                    PathNode.LineTo(192.0f, 64.0f),
                    PathNode.LineTo(192.0f, 80.0f),
                    PathNode.CurveTo(192.0f, 84.41828f, 195.58173f, 88.0f, 200.0f, 88.0f),
                    PathNode.CurveTo(204.41827f, 88.0f, 208.0f, 84.41828f, 208.0f, 80.0f),
                    PathNode.LineTo(208.0f, 64.0f),
                    PathNode.LineTo(224.0f, 64.0f),
                    PathNode.CurveTo(228.41827f, 64.0f, 232.0f, 60.418278f, 232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 51.581722f, 228.41827f, 48.0f, 224.0f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.LineTo(208.0f, 32.0f),
                    PathNode.CurveTo(208.0f, 27.581722f, 204.41827f, 24.0f, 200.0f, 24.0f),
                    PathNode.CurveTo(195.58173f, 24.0f, 192.0f, 27.581722f, 192.0f, 32.0f),
                    PathNode.LineTo(192.0f, 48.0f),
                    PathNode.LineTo(176.0f, 48.0f),
                    PathNode.CurveTo(171.58173f, 48.0f, 168.0f, 51.581722f, 168.0f, 56.0f),
                    PathNode.CurveTo(168.0f, 60.418278f, 171.58173f, 64.0f, 176.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(221.35f, 104.11f),
                    PathNode.CurveTo(216.9926f, 104.83919f, 214.05118f, 108.96252f, 214.78f, 113.32f),
                    PathNode.CurveTo(215.5923f, 118.17113f, 216.00037f, 123.08133f, 216.0f, 128.0f),
                    PathNode.CurveTo(216.01897f, 149.54193f, 208.10152f, 170.3359f, 193.76f, 186.41f),
                    PathNode.CurveTo(187.9409f, 177.9765f, 180.55324f, 170.74162f, 172.0f, 165.1f),
                    PathNode.CurveTo(170.49864f, 164.10472f, 168.51724f, 164.23572f, 167.16f, 165.42f),
                    PathNode.CurveTo(144.6916f, 184.86096f, 111.35839f, 184.86096f, 88.89f, 165.42f),
                    PathNode.CurveTo(87.52378f, 164.21048f, 85.51219f, 164.07884f, 84.0f, 165.1f),
                    PathNode.CurveTo(75.43361f, 170.73566f, 68.03506f, 177.97125f, 62.21f, 186.41f),
                    PathNode.CurveTo(39.220898f, 160.50447f, 33.56543f, 123.523186f, 47.761524f, 91.93099f),
                    PathNode.CurveTo(61.95762f, 60.338802f, 93.36482f, 40.011803f, 128.0f, 40.0f),
                    PathNode.CurveTo(132.91869f, 39.999214f, 137.82892f, 40.407284f, 142.68f, 41.22f),
                    PathNode.CurveTo(147.0157f, 41.904106f, 151.09293f, 38.966995f, 151.8172f, 34.63782f),
                    PathNode.CurveTo(152.54147f, 30.308643f, 149.64227f, 26.204374f, 145.32f, 25.44f),
                    PathNode.CurveTo(100.74186f, 17.940714f, 56.429115f, 40.119274f, 35.71384f, 80.297966f),
                    PathNode.CurveTo(14.998562f, 120.476654f, 22.633038f, 169.4381f, 54.59747f, 201.40253f),
                    PathNode.CurveTo(86.561905f, 233.36696f, 135.52335f, 241.00143f, 175.70204f, 220.28616f),
                    PathNode.CurveTo(215.88072f, 199.57088f, 238.05928f, 155.25815f, 230.56f, 110.68f),
                    PathNode.CurveTo(229.83081f, 106.32258f, 225.70747f, 103.38119f, 221.35f, 104.11f),
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
        return _userCirclePlus!!
    }

private var _userCirclePlus: ImageVector? = null
