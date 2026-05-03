package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.EjectSimple: ImageVector
    get() {
        if (_ejectSimple != null) return _ejectSimple!!
        _ejectSimple = phosphorDuotoneIcon(
            name = "EjectSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(215.92f, 152.0f),
                    PathNode.LineTo(40.08f, 152.0f),
                    PathNode.CurveTo(36.962982f, 151.98738f, 34.12975f, 150.18729f, 32.794106f, 147.3709f),
                    PathNode.CurveTo(31.458458f, 144.5545f, 31.857393f, 141.22159f, 33.82f, 138.8f),
                    PathNode.LineTo(115.48f, 38.0f),
                    PathNode.CurveTo(118.537125f, 34.233925f, 123.129295f, 32.04692f, 127.98f, 32.04692f),
                    PathNode.CurveTo(132.8307f, 32.04692f, 137.42287f, 34.233925f, 140.48f, 38.0f),
                    PathNode.LineTo(222.18f, 138.8f),
                    PathNode.CurveTo(224.14261f, 141.22159f, 224.54155f, 144.5545f, 223.2059f, 147.3709f),
                    PathNode.CurveTo(221.87025f, 150.18729f, 219.03702f, 151.98738f, 215.92f, 152.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 200.0f),
                    PathNode.CurveTo(232.0f, 204.41827f, 228.41827f, 208.0f, 224.0f, 208.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(27.581722f, 208.0f, 24.0f, 204.41827f, 24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 195.58173f, 27.581722f, 192.0f, 32.0f, 192.0f),
                    PathNode.LineTo(224.0f, 192.0f),
                    PathNode.CurveTo(228.41827f, 192.0f, 232.0f, 195.58173f, 232.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(25.59f, 150.84f),
                    PathNode.CurveTo(22.884674f, 145.2445f, 23.66451f, 138.58861f, 27.59f, 133.77f),
                    PathNode.LineTo(109.26f, 32.94f),
                    PathNode.CurveTo(113.83764f, 27.284792f, 120.72427f, 23.999195f, 128.0f, 23.999195f),
                    PathNode.CurveTo(135.27573f, 23.999195f, 142.16235f, 27.284792f, 146.74f, 32.94f),
                    PathNode.LineTo(228.39f, 133.77f),
                    PathNode.CurveTo(232.29077f, 138.58865f, 233.07822f, 145.21896f, 230.41463f, 150.81723f),
                    PathNode.CurveTo(227.751f, 156.4155f, 222.10962f, 159.98703f, 215.91f, 160.0f),
                    PathNode.LineTo(40.09f, 160.0f),
                    PathNode.CurveTo(33.89018f, 160.01384f, 28.240414f, 156.44475f, 25.59f, 150.84f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 143.91f),
                    PathNode.CurveTo(40.0f, 143.91f, 40.0f, 144.0f, 40.08f, 144.02f),
                    PathNode.LineTo(215.91f, 144.02f),
                    PathNode.CurveTo(215.91f, 144.02f, 215.99f, 143.93f, 215.99f, 143.89f),
                    PathNode.LineTo(134.3f, 43.0f),
                    PathNode.CurveTo(132.76219f, 41.097057f, 130.44664f, 39.99117f, 128.0f, 39.99117f),
                    PathNode.CurveTo(125.55336f, 39.99117f, 123.23781f, 41.097057f, 121.7f, 43.0f),
                    PathNode.LineTo(40.0f, 143.84f),
                    PathNode.CurveTo(39.99707f, 143.86324f, 39.99707f, 143.88676f, 40.0f, 143.91f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _ejectSimple!!
    }

private var _ejectSimple: ImageVector? = null
