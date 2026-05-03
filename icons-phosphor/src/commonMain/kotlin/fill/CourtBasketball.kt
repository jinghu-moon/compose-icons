package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CourtBasketball: ImageVector
    get() {
        if (_courtBasketball != null) return _courtBasketball!!
        _courtBasketball = phosphorFillIcon(
            name = "CourtBasketball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 92.23f),
                    PathNode.LineTo(240.0f, 163.77f),
                    PathNode.CurveTo(240.00598f, 164.90588f, 239.52876f, 165.99074f, 238.68741f, 166.75388f),
                    PathNode.CurveTo(237.84604f, 167.51701f, 236.71991f, 167.88644f, 235.59f, 167.77f),
                    PathNode.CurveTo(215.31425f, 165.53885f, 199.96521f, 148.40814f, 199.96521f, 128.01f),
                    PathNode.CurveTo(199.96521f, 107.61186f, 215.31425f, 90.48115f, 235.59f, 88.25f),
                    PathNode.CurveTo(236.71643f, 88.13393f, 237.83928f, 88.50075f, 238.67995f, 89.25944f),
                    PathNode.CurveTo(239.52061f, 90.018135f, 240.0003f, 91.0976f, 240.0f, 92.23f),
                    PathNode.Close,
                    PathNode.MoveTo(20.41f, 167.76f),
                    PathNode.CurveTo(40.685745f, 165.52885f, 56.034798f, 148.39813f, 56.034798f, 128.0f),
                    PathNode.CurveTo(56.034798f, 107.60187f, 40.685745f, 90.47115f, 20.41f, 88.24f),
                    PathNode.CurveTo(19.28009f, 88.12356f, 18.153955f, 88.493f, 17.3126f, 89.25613f),
                    PathNode.CurveTo(16.471243f, 90.019264f, 15.994016f, 91.10412f, 16.0f, 92.24f),
                    PathNode.LineTo(16.0f, 163.78f),
                    PathNode.CurveTo(15.999698f, 164.9124f, 16.47939f, 165.99187f, 17.320051f, 166.75056f),
                    PathNode.CurveTo(18.160715f, 167.50925f, 19.283564f, 167.87607f, 20.41f, 167.76f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 48.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(23.163445f, 48.0f, 16.0f, 55.163445f, 16.0f, 64.0f),
                    PathNode.LineTo(16.0f, 68.13f),
                    PathNode.CurveTo(15.997332f, 70.263336f, 17.669333f, 72.02334f, 19.8f, 72.13f),
                    PathNode.CurveTo(49.179455f, 74.13537f, 71.98646f, 98.552185f, 71.98646f, 128.0f),
                    PathNode.CurveTo(71.98646f, 157.44781f, 49.179455f, 181.86464f, 19.8f, 183.87f),
                    PathNode.CurveTo(17.669333f, 183.97667f, 15.997332f, 185.73665f, 16.0f, 187.87f),
                    PathNode.LineTo(16.0f, 192.0f),
                    PathNode.CurveTo(16.0f, 200.83656f, 23.163445f, 208.0f, 32.0f, 208.0f),
                    PathNode.LineTo(116.0f, 208.0f),
                    PathNode.CurveTo(118.20914f, 208.0f, 120.0f, 206.20914f, 120.0f, 204.0f),
                    PathNode.LineTo(120.0f, 52.0f),
                    PathNode.CurveTo(120.0f, 49.79086f, 118.20914f, 48.0f, 116.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(140.0f, 48.0f),
                    PathNode.CurveTo(137.79086f, 48.0f, 136.0f, 49.79086f, 136.0f, 52.0f),
                    PathNode.LineTo(136.0f, 204.0f),
                    PathNode.CurveTo(136.0f, 206.20914f, 137.79086f, 208.0f, 140.0f, 208.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(232.83656f, 208.0f, 240.0f, 200.83656f, 240.0f, 192.0f),
                    PathNode.LineTo(240.0f, 187.87f),
                    PathNode.CurveTo(240.00267f, 185.73665f, 238.33067f, 183.97667f, 236.2f, 183.87f),
                    PathNode.CurveTo(206.82054f, 181.86464f, 184.01353f, 157.44781f, 184.01353f, 128.0f),
                    PathNode.CurveTo(184.01353f, 98.552185f, 206.82054f, 74.13537f, 236.2f, 72.13f),
                    PathNode.CurveTo(238.33067f, 72.02334f, 240.00267f, 70.263336f, 240.0f, 68.13f),
                    PathNode.LineTo(240.0f, 64.0f),
                    PathNode.CurveTo(240.0f, 55.163445f, 232.83656f, 48.0f, 224.0f, 48.0f),
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
        return _courtBasketball!!
    }

private var _courtBasketball: ImageVector? = null
