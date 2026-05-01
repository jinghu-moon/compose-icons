package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MapPinSimpleLine: ImageVector
    get() {
        if (_mapPinSimpleLine != null) return _mapPinSimpleLine!!
        _mapPinSimpleLine = phosphorLightIcon(
            name = "MapPinSimpleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 210.0f),
                    PathNode.LineTo(134.0f, 210.0f),
                    PathNode.LineTo(134.0f, 133.66f),
                    PathNode.CurveTo(162.47859f, 130.476f, 183.51082f, 105.60136f, 181.91634f, 76.989716f),
                    PathNode.CurveTo(180.32187f, 48.378075f, 156.65604f, 25.994368f, 128.0f, 25.994368f),
                    PathNode.CurveTo(99.34396f, 25.994368f, 75.67813f, 48.378075f, 74.08366f, 76.989716f),
                    PathNode.CurveTo(72.48918f, 105.60136f, 93.52141f, 130.476f, 122.0f, 133.66f),
                    PathNode.LineTo(122.0f, 210.0f),
                    PathNode.LineTo(40.0f, 210.0f),
                    PathNode.CurveTo(36.68629f, 210.0f, 34.0f, 212.6863f, 34.0f, 216.0f),
                    PathNode.CurveTo(34.0f, 219.3137f, 36.68629f, 222.0f, 40.0f, 222.0f),
                    PathNode.LineTo(216.0f, 222.0f),
                    PathNode.CurveTo(219.3137f, 222.0f, 222.0f, 219.3137f, 222.0f, 216.0f),
                    PathNode.CurveTo(222.0f, 212.6863f, 219.3137f, 210.0f, 216.0f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(86.0f, 80.0f),
                    PathNode.CurveTo(86.0f, 56.80404f, 104.80404f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(151.19595f, 38.0f, 170.0f, 56.80404f, 170.0f, 80.0f),
                    PathNode.CurveTo(170.0f, 103.19596f, 151.19595f, 122.0f, 128.0f, 122.0f),
                    PathNode.CurveTo(104.80404f, 122.0f, 86.0f, 103.19596f, 86.0f, 80.0f),
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
        return _mapPinSimpleLine!!
    }

private var _mapPinSimpleLine: ImageVector? = null
