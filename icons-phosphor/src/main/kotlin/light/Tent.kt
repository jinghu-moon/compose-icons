package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Tent: ImageVector
    get() {
        if (_tent != null) return _tent!!
        _tent = phosphorLightIcon(
            name = "Tent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(253.48f, 189.56f),
                    PathNode.LineTo(189.48f, 45.56f),
                    PathNode.CurveTo(188.51646f, 43.39542f, 186.36934f, 42.000576f, 184.0f, 42.0f),
                    PathNode.LineTo(72.0f, 42.0f),
                    PathNode.CurveTo(69.65323f, 42.003494f, 67.52391f, 43.374855f, 66.55f, 45.51f),
                    PathNode.LineTo(66.55f, 45.56f),
                    PathNode.LineTo(66.55f, 45.65f),
                    PathNode.LineTo(66.55f, 45.65f),
                    PathNode.LineTo(2.52f, 189.56f),
                    PathNode.CurveTo(1.693897f, 191.41583f, 1.862926f, 193.56364f, 2.969164f, 195.26741f),
                    PathNode.CurveTo(4.075402f, 196.97119f, 5.9686f, 197.9995f, 8.0f, 198.0f),
                    PathNode.LineTo(248.0f, 198.0f),
                    PathNode.CurveTo(250.0314f, 197.9995f, 251.92459f, 196.97119f, 253.03084f, 195.26741f),
                    PathNode.CurveTo(254.13707f, 193.56364f, 254.3061f, 191.41583f, 253.48f, 189.56f),
                    PathNode.Close,
                    PathNode.MoveTo(66.0f, 76.27f),
                    PathNode.LineTo(66.0f, 186.0f),
                    PathNode.LineTo(17.23f, 186.0f),
                    PathNode.Close,
                    PathNode.MoveTo(78.0f, 186.0f),
                    PathNode.LineTo(78.0f, 76.27f),
                    PathNode.LineTo(126.77f, 186.0f),
                    PathNode.Close,
                    PathNode.MoveTo(139.9f, 186.0f),
                    PathNode.LineTo(81.23f, 54.0f),
                    PathNode.LineTo(180.1f, 54.0f),
                    PathNode.LineTo(238.77f, 186.0f),
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
        return _tent!!
    }

private var _tent: ImageVector? = null
