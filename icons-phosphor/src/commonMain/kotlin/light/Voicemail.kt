package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Voicemail: ImageVector
    get() {
        if (_voicemail != null) return _voicemail!!
        _voicemail = phosphorLightIcon(
            name = "Voicemail",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 74.0f),
                    PathNode.CurveTo(177.12509f, 74.021645f, 156.74565f, 88.45381f, 149.13089f, 110.024086f),
                    PathNode.CurveTo(141.51613f, 131.59436f, 148.31839f, 155.62222f, 166.11f, 170.0f),
                    PathNode.LineTo(89.89f, 170.0f),
                    PathNode.CurveTo(110.349266f, 153.46638f, 115.91847f, 124.596245f, 103.07724f, 101.638794f),
                    PathNode.CurveTo(90.23601f, 78.68134f, 62.720947f, 68.31686f, 37.924713f, 77.09687f),
                    PathNode.CurveTo(13.12848f, 85.8769f, -1.73359f, 111.24656f, 2.733025f, 137.16936f),
                    PathNode.CurveTo(7.199641f, 163.09215f, 29.695223f, 182.02492f, 56.0f, 182.0f),
                    PathNode.LineTo(200.0f, 182.0f),
                    PathNode.CurveTo(229.82338f, 182.0f, 254.0f, 157.82338f, 254.0f, 128.0f),
                    PathNode.CurveTo(254.0f, 98.17662f, 229.82338f, 74.0f, 200.0f, 74.0f),
                    PathNode.Close,
                    PathNode.MoveTo(14.0f, 128.0f),
                    PathNode.CurveTo(14.0f, 104.80404f, 32.80404f, 86.0f, 56.0f, 86.0f),
                    PathNode.CurveTo(79.19596f, 86.0f, 98.0f, 104.80404f, 98.0f, 128.0f),
                    PathNode.CurveTo(98.0f, 151.19595f, 79.19596f, 170.0f, 56.0f, 170.0f),
                    PathNode.CurveTo(32.80404f, 170.0f, 14.0f, 151.19595f, 14.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 170.0f),
                    PathNode.CurveTo(176.80405f, 170.0f, 158.0f, 151.19595f, 158.0f, 128.0f),
                    PathNode.CurveTo(158.0f, 104.80404f, 176.80405f, 86.0f, 200.0f, 86.0f),
                    PathNode.CurveTo(223.19595f, 86.0f, 242.0f, 104.80404f, 242.0f, 128.0f),
                    PathNode.CurveTo(242.0f, 151.19595f, 223.19595f, 170.0f, 200.0f, 170.0f),
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
        return _voicemail!!
    }

private var _voicemail: ImageVector? = null
