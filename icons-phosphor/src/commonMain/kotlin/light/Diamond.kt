package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Diamond: ImageVector
    get() {
        if (_diamond != null) return _diamond!!
        _diamond = phosphorLightIcon(
            name = "Diamond",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(233.92f, 118.14f),
                    PathNode.LineTo(137.86f, 22.08f),
                    PathNode.CurveTo(132.40181f, 16.66511f, 123.59818f, 16.66511f, 118.14f, 22.08f),
                    PathNode.LineTo(22.08f, 118.14f),
                    PathNode.CurveTo(16.66511f, 123.59818f, 16.66511f, 132.40181f, 22.08f, 137.86f),
                    PathNode.LineTo(118.14f, 233.92f),
                    PathNode.LineTo(118.14f, 233.92f),
                    PathNode.CurveTo(123.59818f, 239.33488f, 132.40181f, 239.33488f, 137.86f, 233.92f),
                    PathNode.LineTo(233.86f, 137.86f),
                    PathNode.CurveTo(236.47604f, 135.2455f, 237.94586f, 131.69855f, 237.94586f, 128.0f),
                    PathNode.CurveTo(237.94586f, 124.301445f, 236.47604f, 120.75449f, 233.86f, 118.14f),
                    PathNode.Close,
                    PathNode.MoveTo(225.43f, 129.38f),
                    PathNode.LineTo(129.38f, 225.44f),
                    PathNode.CurveTo(128.6074f, 226.17651f, 127.39259f, 226.17651f, 126.62f, 225.44f),
                    PathNode.LineTo(30.57f, 129.38f),
                    PathNode.CurveTo(29.833492f, 128.6074f, 29.833492f, 127.39259f, 30.57f, 126.62f),
                    PathNode.LineTo(126.62f, 30.56f),
                    PathNode.CurveTo(127.39259f, 29.823492f, 128.6074f, 29.823492f, 129.38f, 30.56f),
                    PathNode.LineTo(225.43f, 126.62f),
                    PathNode.CurveTo(226.16649f, 127.39259f, 226.16649f, 128.6074f, 225.43f, 129.38f),
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
        return _diamond!!
    }

private var _diamond: ImageVector? = null
