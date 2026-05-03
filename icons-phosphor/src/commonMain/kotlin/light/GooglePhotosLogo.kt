package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GooglePhotosLogo: ImageVector
    get() {
        if (_googlePhotosLogo != null) return _googlePhotosLogo!!
        _googlePhotosLogo = phosphorLightIcon(
            name = "GooglePhotosLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 122.0f),
                    PathNode.LineTo(189.18f, 122.0f),
                    PathNode.CurveTo(201.22665f, 100.3202f, 200.90189f, 73.884384f, 188.32626f, 52.50707f),
                    PathNode.CurveTo(175.75066f, 31.129753f, 152.80193f, 18.002918f, 128.0f, 18.0f),
                    PathNode.CurveTo(124.686295f, 18.0f, 122.0f, 20.68629f, 122.0f, 24.0f),
                    PathNode.LineTo(122.0f, 66.82f),
                    PathNode.CurveTo(100.3202f, 54.773342f, 73.884384f, 55.098118f, 52.50707f, 67.67374f),
                    PathNode.CurveTo(31.129753f, 80.24935f, 18.002918f, 103.19807f, 18.0f, 128.0f),
                    PathNode.CurveTo(18.0f, 131.3137f, 20.68629f, 134.0f, 24.0f, 134.0f),
                    PathNode.LineTo(66.82f, 134.0f),
                    PathNode.CurveTo(54.773342f, 155.67981f, 55.098118f, 182.11562f, 67.67374f, 203.49294f),
                    PathNode.CurveTo(80.24935f, 224.87024f, 103.19807f, 237.99709f, 128.0f, 238.0f),
                    PathNode.CurveTo(131.3137f, 238.0f, 134.0f, 235.3137f, 134.0f, 232.0f),
                    PathNode.LineTo(134.0f, 189.18f),
                    PathNode.CurveTo(155.67981f, 201.22665f, 182.11562f, 200.90189f, 203.49294f, 188.32626f),
                    PathNode.CurveTo(224.87024f, 175.75066f, 237.99709f, 152.80193f, 238.0f, 128.0f),
                    PathNode.CurveTo(238.0f, 124.686295f, 235.3137f, 122.0f, 232.0f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(186.0f, 88.0f),
                    PathNode.CurveTo(186.05145f, 100.21616f, 182.1973f, 112.12902f, 175.0f, 122.0f),
                    PathNode.LineTo(134.0f, 122.0f),
                    PathNode.LineTo(134.0f, 30.31f),
                    PathNode.CurveTo(163.53273f, 33.418636f, 185.96376f, 58.30414f, 186.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 70.0f),
                    PathNode.CurveTo(100.21616f, 69.94855f, 112.12902f, 73.80271f, 122.0f, 81.0f),
                    PathNode.LineTo(122.0f, 122.0f),
                    PathNode.LineTo(30.31f, 122.0f),
                    PathNode.CurveTo(33.418636f, 92.46728f, 58.30414f, 70.03625f, 88.0f, 70.0f),
                    PathNode.Close,
                    PathNode.MoveTo(70.0f, 168.0f),
                    PathNode.CurveTo(69.94855f, 155.78384f, 73.80271f, 143.87097f, 81.0f, 134.0f),
                    PathNode.LineTo(122.0f, 134.0f),
                    PathNode.LineTo(122.0f, 225.69f),
                    PathNode.CurveTo(92.46728f, 222.58136f, 70.03625f, 197.69586f, 70.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 186.0f),
                    PathNode.CurveTo(155.78384f, 186.05145f, 143.87097f, 182.1973f, 134.0f, 175.0f),
                    PathNode.LineTo(134.0f, 134.0f),
                    PathNode.LineTo(225.69f, 134.0f),
                    PathNode.CurveTo(222.58136f, 163.53273f, 197.69586f, 185.96376f, 168.0f, 186.0f),
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
        return _googlePhotosLogo!!
    }

private var _googlePhotosLogo: ImageVector? = null
