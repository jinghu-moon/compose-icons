package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GoogleLogo: ImageVector
    get() {
        if (_googleLogo != null) return _googleLogo!!
        _googleLogo = phosphorLightIcon(
            name = "GoogleLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.0f, 128.0f),
                    PathNode.CurveTo(221.99947f, 173.69156f, 189.14284f, 212.76488f, 144.1289f, 220.60483f),
                    PathNode.CurveTo(99.114975f, 228.44476f, 54.983154f, 202.7803f, 39.5353f, 159.77934f),
                    PathNode.CurveTo(24.087446f, 116.77838f, 41.798416f, 68.89724f, 81.51077f, 46.299736f),
                    PathNode.CurveTo(121.22314f, 23.702236f, 171.43321f, 32.93431f, 200.51f, 68.18f),
                    PathNode.CurveTo(201.93094f, 69.826225f, 202.3499f, 72.11245f, 201.60504f, 74.15556f),
                    PathNode.CurveTo(200.86017f, 76.19868f, 199.06812f, 77.678825f, 196.92107f, 78.02427f),
                    PathNode.CurveTo(194.77402f, 78.36971f, 192.60812f, 77.52637f, 191.26f, 75.82f),
                    PathNode.CurveTo(166.25871f, 45.506897f, 123.2682f, 37.189632f, 88.764946f, 55.990547f),
                    PathNode.CurveTo(54.2617f, 74.79146f, 37.944862f, 115.42546f, 49.86346f, 152.86736f),
                    PathNode.CurveTo(61.782055f, 190.30925f, 98.58567f, 214.03383f, 137.60812f, 209.42986f),
                    PathNode.CurveTo(176.63058f, 204.82588f, 206.90233f, 173.18759f, 209.78f, 134.0f),
                    PathNode.LineTo(128.0f, 134.0f),
                    PathNode.CurveTo(124.686295f, 134.0f, 122.0f, 131.3137f, 122.0f, 128.0f),
                    PathNode.CurveTo(122.0f, 124.686295f, 124.686295f, 122.0f, 128.0f, 122.0f),
                    PathNode.LineTo(216.0f, 122.0f),
                    PathNode.CurveTo(219.3137f, 122.0f, 222.0f, 124.686295f, 222.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _googleLogo!!
    }

private var _googleLogo: ImageVector? = null
