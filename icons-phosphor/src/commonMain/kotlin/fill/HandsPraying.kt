package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HandsPraying: ImageVector
    get() {
        if (_handsPraying != null) return _handsPraying!!
        _handsPraying = phosphorFillIcon(
            name = "HandsPraying",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.32f, 180.0f),
                    PathNode.LineTo(199.08f, 143.75f),
                    PathNode.LineTo(162.62f, 23.46f),
                    PathNode.CurveTo(160.51562f, 16.503738f, 155.07735f, 11.057263f, 148.12427f, 8.942417f),
                    PathNode.CurveTo(141.17117f, 6.827571f, 133.62128f, 8.323569f, 128.0f, 12.93f),
                    PathNode.CurveTo(122.37872f, 8.323569f, 114.82883f, 6.827571f, 107.87575f, 8.942417f),
                    PathNode.CurveTo(100.92265f, 11.057263f, 95.484375f, 16.503738f, 93.38f, 23.46f),
                    PathNode.LineTo(56.92f, 143.76f),
                    PathNode.LineTo(20.68f, 180.0f),
                    PathNode.CurveTo(14.436554f, 186.24754f, 14.436554f, 196.37247f, 20.68f, 202.62f),
                    PathNode.LineTo(53.37f, 235.31f),
                    PathNode.CurveTo(56.370686f, 238.31137f, 60.440903f, 239.99759f, 64.685f, 239.99759f),
                    PathNode.CurveTo(68.92911f, 239.99759f, 72.99931f, 238.31137f, 76.0f, 235.31f),
                    PathNode.LineTo(124.28f, 187.0f),
                    PathNode.CurveTo(125.61841f, 185.65839f, 126.861435f, 184.2249f, 128.0f, 182.71f),
                    PathNode.CurveTo(129.13857f, 184.2249f, 130.38159f, 185.65839f, 131.72f, 187.0f),
                    PathNode.LineTo(180.0f, 235.32f),
                    PathNode.CurveTo(183.00069f, 238.32137f, 187.0709f, 240.00758f, 191.315f, 240.00758f),
                    PathNode.CurveTo(195.5591f, 240.00758f, 199.62932f, 238.32137f, 202.63f, 235.32f),
                    PathNode.LineTo(235.32f, 202.63f),
                    PathNode.CurveTo(238.32137f, 199.62932f, 240.00758f, 195.5591f, 240.00758f, 191.315f),
                    PathNode.CurveTo(240.00758f, 187.0709f, 238.32137f, 183.00069f, 235.32f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 158.75f),
                    PathNode.CurveTo(120.032265f, 165.12442f, 117.51141f, 171.24649f, 113.0f, 175.75f),
                    PathNode.LineTo(88.68f, 200.0f),
                    PathNode.LineTo(56.0f, 167.32f),
                    PathNode.LineTo(69.65f, 153.66f),
                    PathNode.CurveTo(70.58152f, 152.72833f, 71.26853f, 151.58104f, 71.65f, 150.32f),
                    PathNode.LineTo(108.65f, 28.1f),
                    PathNode.CurveTo(109.426605f, 25.28566f, 112.180016f, 23.49232f, 115.06808f, 23.919804f),
                    PathNode.CurveTo(117.95614f, 24.347286f, 120.071976f, 26.861362f, 120.0f, 29.78f),
                    PathNode.Close,
                    PathNode.MoveTo(167.44f, 200.13f),
                    PathNode.LineTo(143.0f, 175.72f),
                    PathNode.CurveTo(138.48859f, 171.21649f, 135.96774f, 165.09442f, 136.0f, 158.72f),
                    PathNode.LineTo(136.0f, 29.72f),
                    PathNode.CurveTo(136.00075f, 26.856367f, 138.09819f, 24.424997f, 140.93076f, 24.004246f),
                    PathNode.CurveTo(143.7633f, 23.583496f, 146.47691f, 25.300226f, 147.31f, 28.04f),
                    PathNode.LineTo(184.31f, 150.26f),
                    PathNode.CurveTo(184.69147f, 151.52103f, 185.37848f, 152.66833f, 186.31f, 153.6f),
                    PathNode.LineTo(200.8f, 168.09f),
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
        return _handsPraying!!
    }

private var _handsPraying: ImageVector? = null
