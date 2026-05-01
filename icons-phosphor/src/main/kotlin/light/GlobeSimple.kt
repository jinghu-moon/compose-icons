package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GlobeSimple: ImageVector
    get() {
        if (_globeSimple != null) return _globeSimple!!
        _globeSimple = phosphorLightIcon(
            name = "GlobeSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(71.666954f, 26.0f, 26.0f, 71.666954f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 184.33304f, 71.666954f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(184.33304f, 230.0f, 230.0f, 184.33304f, 230.0f, 128.0f),
                    PathNode.CurveTo(229.93387f, 71.69437f, 184.30563f, 26.066126f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(217.8f, 122.0f),
                    PathNode.LineTo(173.89f, 122.0f),
                    PathNode.CurveTo(172.35f, 81.23f, 155.41f, 53.77f, 143.46f, 39.33f),
                    PathNode.CurveTo(184.29794f, 46.520638f, 214.9708f, 80.63046f, 217.8f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 215.83f),
                    PathNode.CurveTo(122.22312f, 209.93698f, 117.12772f, 203.4126f, 112.81f, 196.38f),
                    PathNode.CurveTo(101.32536f, 177.5378f, 94.89171f, 156.05324f, 94.13f, 134.0f),
                    PathNode.LineTo(161.87f, 134.0f),
                    PathNode.CurveTo(161.10829f, 156.05324f, 154.67464f, 177.5378f, 143.19f, 196.38f),
                    PathNode.CurveTo(138.87227f, 203.4126f, 133.77689f, 209.93698f, 128.0f, 215.83f),
                    PathNode.Close,
                    PathNode.MoveTo(94.13f, 122.0f),
                    PathNode.CurveTo(94.89171f, 99.946754f, 101.32536f, 78.46221f, 112.81f, 59.62f),
                    PathNode.CurveTo(117.12772f, 52.587406f, 122.22312f, 46.063026f, 128.0f, 40.17f),
                    PathNode.CurveTo(133.77689f, 46.063026f, 138.87227f, 52.587406f, 143.19f, 59.62f),
                    PathNode.CurveTo(154.67464f, 78.46221f, 161.10829f, 99.946754f, 161.87f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.54f, 39.33f),
                    PathNode.CurveTo(100.54f, 53.77f, 83.65f, 81.23f, 82.11f, 122.0f),
                    PathNode.LineTo(38.2f, 122.0f),
                    PathNode.CurveTo(41.02921f, 80.63046f, 71.70205f, 46.520638f, 112.54f, 39.33f),
                    PathNode.Close,
                    PathNode.MoveTo(38.2f, 134.0f),
                    PathNode.LineTo(82.11f, 134.0f),
                    PathNode.CurveTo(83.65f, 174.77f, 100.59f, 202.23f, 112.54f, 216.67f),
                    PathNode.CurveTo(71.70205f, 209.47935f, 41.02921f, 175.36954f, 38.2f, 134.0f),
                    PathNode.Close,
                    PathNode.MoveTo(143.46f, 216.67f),
                    PathNode.CurveTo(155.41f, 202.23f, 172.35f, 174.77f, 173.89f, 134.0f),
                    PathNode.LineTo(217.8f, 134.0f),
                    PathNode.CurveTo(214.9708f, 175.36954f, 184.29794f, 209.47935f, 143.46f, 216.67f),
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
        return _globeSimple!!
    }

private var _globeSimple: ImageVector? = null
