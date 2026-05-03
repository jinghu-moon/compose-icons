package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Power: ImageVector
    get() {
        if (_power != null) return _power!!
        _power = phosphorLightIcon(
            name = "Power",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(122.0f, 128.0f),
                    PathNode.LineTo(122.0f, 48.0f),
                    PathNode.CurveTo(122.0f, 44.68629f, 124.686295f, 42.0f, 128.0f, 42.0f),
                    PathNode.CurveTo(131.3137f, 42.0f, 134.0f, 44.68629f, 134.0f, 48.0f),
                    PathNode.LineTo(134.0f, 128.0f),
                    PathNode.CurveTo(134.0f, 131.3137f, 131.3137f, 134.0f, 128.0f, 134.0f),
                    PathNode.CurveTo(124.686295f, 134.0f, 122.0f, 131.3137f, 122.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(179.28f, 51.0f),
                    PathNode.CurveTo(176.53706f, 49.50662f, 173.1072f, 50.36716f, 171.39412f, 52.978546f),
                    PathNode.CurveTo(169.68106f, 55.58993f, 170.25772f, 59.07876f, 172.72f, 61.0f),
                    PathNode.CurveTo(196.41f, 76.47f, 210.0f, 100.88f, 210.0f, 128.0f),
                    PathNode.CurveTo(210.0f, 173.28735f, 173.28735f, 210.0f, 128.0f, 210.0f),
                    PathNode.CurveTo(82.712654f, 210.0f, 46.0f, 173.28735f, 46.0f, 128.0f),
                    PathNode.CurveTo(46.0f, 100.88f, 59.59f, 76.47f, 83.28f, 61.0f),
                    PathNode.CurveTo(85.74227f, 59.07876f, 86.31895f, 55.58993f, 84.60587f, 52.978546f),
                    PathNode.CurveTo(82.89281f, 50.36716f, 79.462944f, 49.50662f, 76.72f, 51.0f),
                    PathNode.CurveTo(49.57f, 68.68f, 34.0f, 96.75f, 34.0f, 128.0f),
                    PathNode.CurveTo(34.0f, 179.91476f, 76.085236f, 222.0f, 128.0f, 222.0f),
                    PathNode.CurveTo(179.91476f, 222.0f, 222.0f, 179.91476f, 222.0f, 128.0f),
                    PathNode.CurveTo(222.0f, 96.75f, 206.43f, 68.68f, 179.28f, 51.0f),
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
        return _power!!
    }

private var _power: ImageVector? = null
