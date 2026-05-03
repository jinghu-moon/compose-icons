package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Gps: ImageVector
    get() {
        if (_gps != null) return _gps!!
        _gps = phosphorLightIcon(
            name = "Gps",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 122.0f),
                    PathNode.LineTo(213.77f, 122.0f),
                    PathNode.CurveTo(210.72012f, 79.27123f, 176.72878f, 45.279884f, 134.0f, 42.23f),
                    PathNode.LineTo(134.0f, 16.0f),
                    PathNode.CurveTo(134.0f, 12.686292f, 131.3137f, 10.0f, 128.0f, 10.0f),
                    PathNode.CurveTo(124.686295f, 10.0f, 122.0f, 12.686292f, 122.0f, 16.0f),
                    PathNode.LineTo(122.0f, 42.23f),
                    PathNode.CurveTo(79.27123f, 45.279884f, 45.279884f, 79.27123f, 42.23f, 122.0f),
                    PathNode.LineTo(16.0f, 122.0f),
                    PathNode.CurveTo(12.686292f, 122.0f, 10.0f, 124.686295f, 10.0f, 128.0f),
                    PathNode.CurveTo(10.0f, 131.3137f, 12.686292f, 134.0f, 16.0f, 134.0f),
                    PathNode.LineTo(42.23f, 134.0f),
                    PathNode.CurveTo(45.279884f, 176.72878f, 79.27123f, 210.72012f, 122.0f, 213.77f),
                    PathNode.LineTo(122.0f, 240.0f),
                    PathNode.CurveTo(122.0f, 243.3137f, 124.686295f, 246.0f, 128.0f, 246.0f),
                    PathNode.CurveTo(131.3137f, 246.0f, 134.0f, 243.3137f, 134.0f, 240.0f),
                    PathNode.LineTo(134.0f, 213.77f),
                    PathNode.CurveTo(176.72878f, 210.72012f, 210.72012f, 176.72878f, 213.77f, 134.0f),
                    PathNode.LineTo(240.0f, 134.0f),
                    PathNode.CurveTo(243.3137f, 134.0f, 246.0f, 131.3137f, 246.0f, 128.0f),
                    PathNode.CurveTo(246.0f, 124.686295f, 243.3137f, 122.0f, 240.0f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 202.0f),
                    PathNode.CurveTo(87.13093f, 202.0f, 54.0f, 168.86908f, 54.0f, 128.0f),
                    PathNode.CurveTo(54.0f, 87.13093f, 87.13093f, 54.0f, 128.0f, 54.0f),
                    PathNode.CurveTo(168.86908f, 54.0f, 202.0f, 87.13093f, 202.0f, 128.0f),
                    PathNode.CurveTo(201.95041f, 168.84851f, 168.84851f, 201.95041f, 128.0f, 202.0f),
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
        return _gps!!
    }

private var _gps: ImageVector? = null
