package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GitCommit: ImageVector
    get() {
        if (_gitCommit != null) return _gitCommit!!
        _gitCommit = phosphorLightIcon(
            name = "GitCommit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 122.0f),
                    PathNode.LineTo(181.66f, 122.0f),
                    PathNode.CurveTo(178.58089f, 94.69076f, 155.48227f, 74.050156f, 128.0f, 74.050156f),
                    PathNode.CurveTo(100.51772f, 74.050156f, 77.41911f, 94.69076f, 74.34f, 122.0f),
                    PathNode.LineTo(8.0f, 122.0f),
                    PathNode.CurveTo(4.686292f, 122.0f, 2.0f, 124.686295f, 2.0f, 128.0f),
                    PathNode.CurveTo(2.0f, 131.3137f, 4.686292f, 134.0f, 8.0f, 134.0f),
                    PathNode.LineTo(74.34f, 134.0f),
                    PathNode.CurveTo(77.41911f, 161.30923f, 100.51772f, 181.94984f, 128.0f, 181.94984f),
                    PathNode.CurveTo(155.48227f, 181.94984f, 178.58089f, 161.30923f, 181.66f, 134.0f),
                    PathNode.LineTo(248.0f, 134.0f),
                    PathNode.CurveTo(251.3137f, 134.0f, 254.0f, 131.3137f, 254.0f, 128.0f),
                    PathNode.CurveTo(254.0f, 124.686295f, 251.3137f, 122.0f, 248.0f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 170.0f),
                    PathNode.CurveTo(104.80404f, 170.0f, 86.0f, 151.19595f, 86.0f, 128.0f),
                    PathNode.CurveTo(86.0f, 104.80404f, 104.80404f, 86.0f, 128.0f, 86.0f),
                    PathNode.CurveTo(151.19595f, 86.0f, 170.0f, 104.80404f, 170.0f, 128.0f),
                    PathNode.CurveTo(170.0f, 151.19595f, 151.19595f, 170.0f, 128.0f, 170.0f),
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
        return _gitCommit!!
    }

private var _gitCommit: ImageVector? = null
