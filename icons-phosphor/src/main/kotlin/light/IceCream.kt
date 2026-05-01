package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.IceCream: ImageVector
    get() {
        if (_iceCream != null) return _iceCream!!
        _iceCream = phosphorLightIcon(
            name = "IceCream",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(206.0f, 98.83f),
                    PathNode.LineTo(206.0f, 96.0f),
                    PathNode.CurveTo(206.0f, 52.92179f, 171.07822f, 18.0f, 128.0f, 18.0f),
                    PathNode.CurveTo(84.92179f, 18.0f, 50.0f, 52.92179f, 50.0f, 96.0f),
                    PathNode.LineTo(50.0f, 98.83f),
                    PathNode.CurveTo(39.429047f, 101.81898f, 32.683075f, 112.14776f, 34.19535f, 123.02858f),
                    PathNode.CurveTo(35.707623f, 133.90938f, 45.014603f, 142.00705f, 56.0f, 142.0f),
                    PathNode.LineTo(60.45f, 142.0f),
                    PathNode.LineTo(115.84f, 239.0f),
                    PathNode.CurveTo(118.33135f, 243.36658f, 122.97269f, 246.0621f, 128.0f, 246.0621f),
                    PathNode.CurveTo(133.02731f, 246.0621f, 137.66864f, 243.36658f, 140.16f, 239.0f),
                    PathNode.LineTo(195.55f, 142.0f),
                    PathNode.LineTo(200.0f, 142.0f),
                    PathNode.CurveTo(210.9854f, 142.00705f, 220.29237f, 133.90938f, 221.80466f, 123.02858f),
                    PathNode.CurveTo(223.31693f, 112.14776f, 216.57095f, 101.81898f, 206.0f, 98.83f),
                    PathNode.Close,
                    PathNode.MoveTo(129.74f, 233.0f),
                    PathNode.CurveTo(129.38487f, 233.62662f, 128.72026f, 234.0139f, 128.0f, 234.0139f),
                    PathNode.CurveTo(127.27975f, 234.0139f, 126.61512f, 233.62662f, 126.26f, 233.0f),
                    PathNode.LineTo(74.26f, 142.0f),
                    PathNode.LineTo(98.26f, 142.0f),
                    PathNode.LineTo(140.0f, 215.06f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 142.0f),
                    PathNode.LineTo(158.89f, 182.06f),
                    PathNode.LineTo(146.89f, 202.97f),
                    PathNode.LineTo(112.05f, 141.97f),
                    PathNode.Close,
                    PathNode.MoveTo(165.8f, 170.0f),
                    PathNode.LineTo(149.8f, 142.0f),
                    PathNode.LineTo(181.8f, 142.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 130.0f),
                    PathNode.LineTo(56.0f, 130.0f),
                    PathNode.CurveTo(50.477154f, 130.0f, 46.0f, 125.52285f, 46.0f, 120.0f),
                    PathNode.CurveTo(46.0f, 114.47715f, 50.477154f, 110.0f, 56.0f, 110.0f),
                    PathNode.CurveTo(59.31371f, 110.0f, 62.0f, 107.313705f, 62.0f, 104.0f),
                    PathNode.LineTo(62.0f, 96.0f),
                    PathNode.CurveTo(62.0f, 59.549206f, 91.54921f, 30.0f, 128.0f, 30.0f),
                    PathNode.CurveTo(164.45079f, 30.0f, 194.0f, 59.549206f, 194.0f, 96.0f),
                    PathNode.LineTo(194.0f, 104.0f),
                    PathNode.CurveTo(194.0f, 107.313705f, 196.6863f, 110.0f, 200.0f, 110.0f),
                    PathNode.CurveTo(205.52284f, 110.0f, 210.0f, 114.47715f, 210.0f, 120.0f),
                    PathNode.CurveTo(210.0f, 125.52285f, 205.52284f, 130.0f, 200.0f, 130.0f),
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
        return _iceCream!!
    }

private var _iceCream: ImageVector? = null
