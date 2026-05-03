package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserCircleCheck: ImageVector
    get() {
        if (_userCircleCheck != null) return _userCircleCheck!!
        _userCircleCheck = phosphorFillIcon(
            name = "UserCircleCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
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
                    PathNode.CurveTo(85.50135f, 164.10472f, 87.48275f, 164.23572f, 88.84f, 165.42f),
                    PathNode.CurveTo(111.305145f, 184.85948f, 144.63486f, 184.85948f, 167.1f, 165.42f),
                    PathNode.CurveTo(168.45724f, 164.23572f, 170.43864f, 164.10472f, 171.94f, 165.1f),
                    PathNode.CurveTo(180.50403f, 170.7386f, 187.90207f, 177.97368f, 193.73f, 186.41f),
                    PathNode.CurveTo(208.0824f, 170.34035f, 216.0107f, 149.54588f, 216.0f, 128.0f),
                    PathNode.CurveTo(216.00037f, 123.08133f, 215.5923f, 118.17113f, 214.78f, 113.32f),
                    PathNode.CurveTo(214.2792f, 110.488144f, 215.3369f, 107.60539f, 217.55034f, 105.7694f),
                    PathNode.CurveTo(219.76378f, 103.93341f, 222.79236f, 103.426735f, 225.48286f, 104.44228f),
                    PathNode.CurveTo(228.17339f, 105.45784f, 230.11179f, 107.83934f, 230.56f, 110.68f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 120.0f),
                    PathNode.CurveTo(84.0f, 144.30052f, 103.69947f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(152.30052f, 164.0f, 172.0f, 144.30052f, 172.0f, 120.0f),
                    PathNode.CurveTo(172.0f, 95.69947f, 152.30052f, 76.0f, 128.0f, 76.0f),
                    PathNode.CurveTo(103.69947f, 76.0f, 84.0f, 95.69947f, 84.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(237.66f, 34.34f),
                    PathNode.CurveTo(236.15945f, 32.837784f, 234.12328f, 31.993708f, 232.0f, 31.993708f),
                    PathNode.CurveTo(229.87672f, 31.993708f, 227.84055f, 32.837784f, 226.34f, 34.34f),
                    PathNode.LineTo(200.0f, 60.69f),
                    PathNode.LineTo(189.66f, 50.34f),
                    PathNode.CurveTo(186.53407f, 47.21407f, 181.46593f, 47.21407f, 178.34f, 50.34f),
                    PathNode.CurveTo(175.21407f, 53.46593f, 175.21407f, 58.53407f, 178.34f, 61.66f),
                    PathNode.LineTo(194.34f, 77.66f),
                    PathNode.CurveTo(195.84055f, 79.16222f, 197.87672f, 80.006294f, 200.0f, 80.006294f),
                    PathNode.CurveTo(202.12328f, 80.006294f, 204.15945f, 79.16222f, 205.66f, 77.66f),
                    PathNode.LineTo(237.66f, 45.66f),
                    PathNode.CurveTo(239.16223f, 44.159454f, 240.00629f, 42.123276f, 240.00629f, 40.0f),
                    PathNode.CurveTo(240.00629f, 37.876724f, 239.16223f, 35.840546f, 237.66f, 34.34f),
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
        return _userCircleCheck!!
    }

private var _userCircleCheck: ImageVector? = null
