package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GlobeSimple: ImageVector
    get() {
        if (_globeSimple != null) return _globeSimple!!
        _globeSimple = phosphorDuotoneIcon(
            name = "GlobeSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 181.01933f, 181.01933f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(74.98067f, 224.0f, 32.0f, 181.01933f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 74.98067f, 74.98067f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(181.01933f, 32.0f, 224.0f, 74.98067f, 224.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.LineTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93387f, 70.5898f, 185.4102f, 24.066128f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(215.62f, 120.0f),
                    PathNode.LineTo(175.79f, 120.0f),
                    PathNode.CurveTo(174.0f, 83.49f, 159.94f, 57.67f, 148.41f, 42.4f),
                    PathNode.CurveTo(185.1154f, 51.214382f, 212.14055f, 82.41272f, 215.63f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.23f, 136.0f),
                    PathNode.LineTo(159.77f, 136.0f),
                    PathNode.CurveTo(157.46f, 177.61f, 137.54f, 203.11f, 128.0f, 213.0f),
                    PathNode.CurveTo(118.45f, 203.1f, 98.54f, 177.6f, 96.23f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.23f, 120.0f),
                    PathNode.CurveTo(98.54f, 78.39f, 118.46f, 52.89f, 128.0f, 43.0f),
                    PathNode.CurveTo(137.55f, 52.93f, 157.46f, 78.43f, 159.77f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(107.59f, 42.4f),
                    PathNode.CurveTo(96.06f, 57.67f, 82.0f, 83.49f, 80.21f, 120.0f),
                    PathNode.LineTo(40.37f, 120.0f),
                    PathNode.CurveTo(43.859447f, 82.41272f, 70.8846f, 51.214382f, 107.59f, 42.4f),
                    PathNode.Close,
                    PathNode.MoveTo(40.37f, 136.0f),
                    PathNode.LineTo(80.21f, 136.0f),
                    PathNode.CurveTo(82.03f, 172.51f, 96.06f, 198.33f, 107.59f, 213.6f),
                    PathNode.CurveTo(70.8846f, 204.78561f, 43.859447f, 173.58728f, 40.37f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.37f, 213.6f),
                    PathNode.CurveTo(159.9f, 198.33f, 173.93f, 172.51f, 175.75f, 136.0f),
                    PathNode.LineTo(215.59f, 136.0f),
                    PathNode.CurveTo(212.10585f, 173.57588f, 185.09969f, 204.77087f, 148.41f, 213.6f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _globeSimple!!
    }

private var _globeSimple: ImageVector? = null
