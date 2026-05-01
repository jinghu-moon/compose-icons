package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Basketball: ImageVector
    get() {
        if (_basketball != null) return _basketball!!
        _basketball = phosphorLightIcon(
            name = "Basketball",
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
                    PathNode.MoveTo(60.0f, 69.09f),
                    PathNode.CurveTo(72.87111f, 83.85772f, 80.524765f, 102.45069f, 81.78f, 122.0f),
                    PathNode.LineTo(38.2f, 122.0f),
                    PathNode.CurveTo(39.491516f, 102.455414f, 47.148422f, 83.871605f, 60.0f, 69.09f),
                    PathNode.Close,
                    PathNode.MoveTo(38.2f, 134.0f),
                    PathNode.LineTo(81.78f, 134.0f),
                    PathNode.CurveTo(80.524765f, 153.5493f, 72.87111f, 172.14227f, 60.0f, 186.91f),
                    PathNode.CurveTo(47.148422f, 172.12839f, 39.491516f, 153.54459f, 38.2f, 134.0f),
                    PathNode.Close,
                    PathNode.MoveTo(122.0f, 217.8f),
                    PathNode.CurveTo(102.18472f, 216.48373f, 83.36715f, 208.62608f, 68.5f, 195.46f),
                    PathNode.CurveTo(83.62066f, 178.40944f, 92.54235f, 156.75354f, 93.82f, 134.0f),
                    PathNode.LineTo(122.0f, 134.0f),
                    PathNode.Close,
                    PathNode.MoveTo(122.0f, 122.0f),
                    PathNode.LineTo(93.82f, 122.0f),
                    PathNode.CurveTo(92.54235f, 99.24645f, 83.62066f, 77.59056f, 68.5f, 60.54f),
                    PathNode.CurveTo(83.36715f, 47.373924f, 102.18472f, 39.51627f, 122.0f, 38.2f),
                    PathNode.Close,
                    PathNode.MoveTo(217.8f, 122.0f),
                    PathNode.LineTo(174.22f, 122.0f),
                    PathNode.CurveTo(175.47523f, 102.45069f, 183.12889f, 83.85772f, 196.0f, 69.09f),
                    PathNode.CurveTo(208.85158f, 83.871605f, 216.50848f, 102.455414f, 217.8f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(134.0f, 38.2f),
                    PathNode.CurveTo(153.81528f, 39.51627f, 172.63284f, 47.373924f, 187.5f, 60.54f),
                    PathNode.CurveTo(172.37935f, 77.59056f, 163.45766f, 99.24645f, 162.18f, 122.0f),
                    PathNode.LineTo(134.0f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(134.0f, 217.8f),
                    PathNode.LineTo(134.0f, 134.0f),
                    PathNode.LineTo(162.18f, 134.0f),
                    PathNode.CurveTo(163.45766f, 156.75354f, 172.37935f, 178.40944f, 187.5f, 195.46f),
                    PathNode.CurveTo(172.63284f, 208.62608f, 153.81528f, 216.48373f, 134.0f, 217.8f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 186.91f),
                    PathNode.CurveTo(183.12889f, 172.14227f, 175.47523f, 153.5493f, 174.22f, 134.0f),
                    PathNode.LineTo(217.8f, 134.0f),
                    PathNode.CurveTo(216.50848f, 153.54459f, 208.85158f, 172.12839f, 196.0f, 186.91f),
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
        return _basketball!!
    }

private var _basketball: ImageVector? = null
