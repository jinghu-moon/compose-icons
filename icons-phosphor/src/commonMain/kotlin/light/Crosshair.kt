package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Crosshair: ImageVector
    get() {
        if (_crosshair != null) return _crosshair!!
        _crosshair = phosphorLightIcon(
            name = "Crosshair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 122.0f),
                    PathNode.LineTo(221.8f, 122.0f),
                    PathNode.CurveTo(218.72238f, 74.84296f, 181.15704f, 37.277615f, 134.0f, 34.2f),
                    PathNode.LineTo(134.0f, 24.0f),
                    PathNode.CurveTo(134.0f, 20.68629f, 131.3137f, 18.0f, 128.0f, 18.0f),
                    PathNode.CurveTo(124.686295f, 18.0f, 122.0f, 20.68629f, 122.0f, 24.0f),
                    PathNode.LineTo(122.0f, 34.2f),
                    PathNode.CurveTo(74.84296f, 37.277615f, 37.277615f, 74.84296f, 34.2f, 122.0f),
                    PathNode.LineTo(24.0f, 122.0f),
                    PathNode.CurveTo(20.68629f, 122.0f, 18.0f, 124.686295f, 18.0f, 128.0f),
                    PathNode.CurveTo(18.0f, 131.3137f, 20.68629f, 134.0f, 24.0f, 134.0f),
                    PathNode.LineTo(34.2f, 134.0f),
                    PathNode.CurveTo(37.277615f, 181.15704f, 74.84296f, 218.72238f, 122.0f, 221.8f),
                    PathNode.LineTo(122.0f, 232.0f),
                    PathNode.CurveTo(122.0f, 235.3137f, 124.686295f, 238.0f, 128.0f, 238.0f),
                    PathNode.CurveTo(131.3137f, 238.0f, 134.0f, 235.3137f, 134.0f, 232.0f),
                    PathNode.LineTo(134.0f, 221.8f),
                    PathNode.CurveTo(181.15704f, 218.72238f, 218.72238f, 181.15704f, 221.8f, 134.0f),
                    PathNode.LineTo(232.0f, 134.0f),
                    PathNode.CurveTo(235.3137f, 134.0f, 238.0f, 131.3137f, 238.0f, 128.0f),
                    PathNode.CurveTo(238.0f, 124.686295f, 235.3137f, 122.0f, 232.0f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(134.0f, 209.76f),
                    PathNode.LineTo(134.0f, 200.0f),
                    PathNode.CurveTo(134.0f, 196.6863f, 131.3137f, 194.0f, 128.0f, 194.0f),
                    PathNode.CurveTo(124.686295f, 194.0f, 122.0f, 196.6863f, 122.0f, 200.0f),
                    PathNode.LineTo(122.0f, 209.76f),
                    PathNode.CurveTo(81.476135f, 206.73895f, 49.261036f, 174.52386f, 46.24f, 134.0f),
                    PathNode.LineTo(56.0f, 134.0f),
                    PathNode.CurveTo(59.31371f, 134.0f, 62.0f, 131.3137f, 62.0f, 128.0f),
                    PathNode.CurveTo(62.0f, 124.686295f, 59.31371f, 122.0f, 56.0f, 122.0f),
                    PathNode.LineTo(46.24f, 122.0f),
                    PathNode.CurveTo(49.261036f, 81.476135f, 81.476135f, 49.261036f, 122.0f, 46.24f),
                    PathNode.LineTo(122.0f, 56.0f),
                    PathNode.CurveTo(122.0f, 59.31371f, 124.686295f, 62.0f, 128.0f, 62.0f),
                    PathNode.CurveTo(131.3137f, 62.0f, 134.0f, 59.31371f, 134.0f, 56.0f),
                    PathNode.LineTo(134.0f, 46.24f),
                    PathNode.CurveTo(174.52386f, 49.261036f, 206.73895f, 81.476135f, 209.76f, 122.0f),
                    PathNode.LineTo(200.0f, 122.0f),
                    PathNode.CurveTo(196.6863f, 122.0f, 194.0f, 124.686295f, 194.0f, 128.0f),
                    PathNode.CurveTo(194.0f, 131.3137f, 196.6863f, 134.0f, 200.0f, 134.0f),
                    PathNode.LineTo(209.76f, 134.0f),
                    PathNode.CurveTo(206.73895f, 174.52386f, 174.52386f, 206.73895f, 134.0f, 209.76f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 90.0f),
                    PathNode.CurveTo(107.013176f, 90.0f, 90.0f, 107.013176f, 90.0f, 128.0f),
                    PathNode.CurveTo(90.0f, 148.98682f, 107.013176f, 166.0f, 128.0f, 166.0f),
                    PathNode.CurveTo(148.98682f, 166.0f, 166.0f, 148.98682f, 166.0f, 128.0f),
                    PathNode.CurveTo(166.0f, 107.013176f, 148.98682f, 90.0f, 128.0f, 90.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 154.0f),
                    PathNode.CurveTo(113.640594f, 154.0f, 102.0f, 142.3594f, 102.0f, 128.0f),
                    PathNode.CurveTo(102.0f, 113.640594f, 113.640594f, 102.0f, 128.0f, 102.0f),
                    PathNode.CurveTo(142.3594f, 102.0f, 154.0f, 113.640594f, 154.0f, 128.0f),
                    PathNode.CurveTo(154.0f, 142.3594f, 142.3594f, 154.0f, 128.0f, 154.0f),
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
        return _crosshair!!
    }

private var _crosshair: ImageVector? = null
