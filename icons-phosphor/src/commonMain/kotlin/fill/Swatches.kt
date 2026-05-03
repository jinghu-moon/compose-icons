package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Swatches: ImageVector
    get() {
        if (_swatches != null) return _swatches!!
        _swatches = phosphorFillIcon(
            name = "Swatches",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 155.91f),
                    PathNode.CurveTo(239.96002f, 154.12642f, 239.62202f, 152.36208f, 239.0f, 150.69f),
                    PathNode.LineTo(219.94f, 98.48f),
                    PathNode.CurveTo(216.88388f, 90.2398f, 207.7534f, 86.00718f, 199.49f, 89.0f),
                    PathNode.LineTo(131.68f, 113.57f),
                    PathNode.LineTo(143.76f, 44.57f),
                    PathNode.CurveTo(145.31812f, 35.874733f, 139.53458f, 27.562002f, 130.84f, 26.0f),
                    PathNode.LineTo(76.17f, 16.25f),
                    PathNode.CurveTo(71.99575f, 15.516092f, 67.70108f, 16.474802f, 64.235214f, 18.914228f),
                    PathNode.CurveTo(60.769352f, 21.353655f, 58.41769f, 25.072927f, 57.7f, 29.25f),
                    PathNode.LineTo(32.7f, 172.37f),
                    PathNode.CurveTo(30.386255f, 185.14398f, 33.855545f, 198.28635f, 42.172573f, 208.25404f),
                    PathNode.CurveTo(50.4896f, 218.22174f, 62.798176f, 223.98865f, 75.78f, 224.0f),
                    PathNode.LineTo(224.0f, 224.0f),
                    PathNode.CurveTo(232.83656f, 224.0f, 240.0f, 216.83656f, 240.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 196.0f),
                    PathNode.CurveTo(67.163445f, 196.0f, 60.0f, 188.83656f, 60.0f, 180.0f),
                    PathNode.CurveTo(60.0f, 171.16344f, 67.163445f, 164.0f, 76.0f, 164.0f),
                    PathNode.CurveTo(84.836555f, 164.0f, 92.0f, 171.16344f, 92.0f, 180.0f),
                    PathNode.CurveTo(92.0f, 188.83656f, 84.836555f, 196.0f, 76.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(118.72f, 187.62f),
                    PathNode.LineTo(128.5f, 131.7f),
                    PathNode.LineTo(204.92f, 104.0f),
                    PathNode.LineTo(224.0f, 156.11f),
                    PathNode.LineTo(116.78f, 195.0f),
                    PathNode.CurveTo(117.63496f, 192.59952f, 118.283966f, 190.13058f, 118.72f, 187.62f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 208.0f),
                    PathNode.LineTo(127.74f, 208.0f),
                    PathNode.LineTo(224.0f, 173.11f),
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
        return _swatches!!
    }

private var _swatches: ImageVector? = null
