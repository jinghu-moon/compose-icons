package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.EjectSimple: ImageVector
    get() {
        if (_ejectSimple != null) return _ejectSimple!!
        _ejectSimple = phosphorFillIcon(
            name = "EjectSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
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
                    PathNode.MoveTo(40.09f, 160.0f),
                    PathNode.LineTo(215.91f, 160.0f),
                    PathNode.CurveTo(222.10962f, 159.98703f, 227.751f, 156.4155f, 230.41463f, 150.81723f),
                    PathNode.CurveTo(233.07822f, 145.21896f, 232.29077f, 138.58865f, 228.39f, 133.77f),
                    PathNode.LineTo(146.74f, 32.94f),
                    PathNode.CurveTo(142.16235f, 27.284792f, 135.27573f, 23.999195f, 128.0f, 23.999195f),
                    PathNode.CurveTo(120.72427f, 23.999195f, 113.83764f, 27.284792f, 109.26f, 32.94f),
                    PathNode.LineTo(27.61f, 133.77f),
                    PathNode.CurveTo(23.709227f, 138.58865f, 22.921774f, 145.21896f, 25.58538f, 150.81723f),
                    PathNode.CurveTo(28.248987f, 156.4155f, 33.890385f, 159.98703f, 40.09f, 160.0f),
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
        return _ejectSimple!!
    }

private var _ejectSimple: ImageVector? = null
