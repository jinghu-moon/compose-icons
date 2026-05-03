package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserCircleMinus: ImageVector
    get() {
        if (_userCircleMinus != null) return _userCircleMinus!!
        _userCircleMinus = phosphorFillIcon(
            name = "UserCircleMinus",
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
                    PathNode.LineTo(224.0f, 64.0f),
                    PathNode.CurveTo(228.41827f, 64.0f, 232.0f, 60.418278f, 232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 51.581722f, 228.41827f, 48.0f, 224.0f, 48.0f),
                    PathNode.LineTo(176.0f, 48.0f),
                    PathNode.CurveTo(171.58173f, 48.0f, 168.0f, 51.581722f, 168.0f, 56.0f),
                    PathNode.CurveTo(168.0f, 60.418278f, 171.58173f, 64.0f, 176.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(215.87f, 88.46f),
                    PathNode.CurveTo(211.70625f, 89.93514f, 209.52612f, 94.50581f, 211.0f, 98.67f),
                    PathNode.CurveTo(221.6501f, 128.87305f, 215.05103f, 162.47745f, 193.77f, 186.41f),
                    PathNode.CurveTo(187.94795f, 177.97557f, 180.55684f, 170.7406f, 172.0f, 165.1f),
                    PathNode.CurveTo(170.49864f, 164.10472f, 168.51724f, 164.23572f, 167.16f, 165.42f),
                    PathNode.CurveTo(144.6916f, 184.86096f, 111.35839f, 184.86096f, 88.89f, 165.42f),
                    PathNode.CurveTo(87.52378f, 164.21048f, 85.51219f, 164.07884f, 84.0f, 165.1f),
                    PathNode.CurveTo(75.43361f, 170.73566f, 68.03506f, 177.97125f, 62.21f, 186.41f),
                    PathNode.CurveTo(39.220898f, 160.50447f, 33.56543f, 123.523186f, 47.761524f, 91.93099f),
                    PathNode.CurveTo(61.95762f, 60.338802f, 93.36482f, 40.011803f, 128.0f, 40.0f),
                    PathNode.CurveTo(132.91869f, 39.999214f, 137.82892f, 40.407284f, 142.68f, 41.22f),
                    PathNode.CurveTo(147.0157f, 41.904106f, 151.09293f, 38.966995f, 151.8172f, 34.63782f),
                    PathNode.CurveTo(152.54147f, 30.308643f, 149.64227f, 26.204374f, 145.32f, 25.44f),
                    PathNode.CurveTo(99.11475f, 17.675144f, 53.42888f, 41.795647f, 33.77949f, 84.329384f),
                    PathNode.CurveTo(14.1301f, 126.86313f, 25.379068f, 177.28592f, 61.243465f, 207.43494f),
                    PathNode.CurveTo(97.10786f, 237.58394f, 148.71371f, 239.99934f, 187.23738f, 213.33206f),
                    PathNode.CurveTo(225.76106f, 186.6648f, 241.67061f, 137.51315f, 226.08f, 93.33f),
                    PathNode.CurveTo(224.60486f, 89.16626f, 220.0342f, 86.98613f, 215.87f, 88.46f),
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
        return _userCircleMinus!!
    }

private var _userCircleMinus: ImageVector? = null
