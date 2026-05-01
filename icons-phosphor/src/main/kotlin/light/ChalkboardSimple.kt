package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChalkboardSimple: ImageVector
    get() {
        if (_chalkboardSimple != null) return _chalkboardSimple!!
        _chalkboardSimple = phosphorLightIcon(
            name = "ChalkboardSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 194.0f),
                    PathNode.LineTo(230.0f, 194.0f),
                    PathNode.LineTo(230.0f, 168.0f),
                    PathNode.CurveTo(230.0f, 164.6863f, 227.3137f, 162.0f, 224.0f, 162.0f),
                    PathNode.LineTo(160.0f, 162.0f),
                    PathNode.CurveTo(156.6863f, 162.0f, 154.0f, 164.6863f, 154.0f, 168.0f),
                    PathNode.LineTo(154.0f, 194.0f),
                    PathNode.LineTo(38.0f, 194.0f),
                    PathNode.LineTo(38.0f, 56.0f),
                    PathNode.CurveTo(38.0f, 54.89543f, 38.89543f, 54.0f, 40.0f, 54.0f),
                    PathNode.LineTo(216.0f, 54.0f),
                    PathNode.CurveTo(217.10457f, 54.0f, 218.0f, 54.89543f, 218.0f, 56.0f),
                    PathNode.LineTo(218.0f, 136.0f),
                    PathNode.CurveTo(218.0f, 139.3137f, 220.6863f, 142.0f, 224.0f, 142.0f),
                    PathNode.CurveTo(227.3137f, 142.0f, 230.0f, 139.3137f, 230.0f, 136.0f),
                    PathNode.LineTo(230.0f, 56.0f),
                    PathNode.CurveTo(230.0f, 48.268013f, 223.73198f, 42.0f, 216.0f, 42.0f),
                    PathNode.LineTo(40.0f, 42.0f),
                    PathNode.CurveTo(32.268013f, 42.0f, 26.0f, 48.268013f, 26.0f, 56.0f),
                    PathNode.LineTo(26.0f, 194.0f),
                    PathNode.LineTo(16.0f, 194.0f),
                    PathNode.CurveTo(12.686292f, 194.0f, 10.0f, 196.6863f, 10.0f, 200.0f),
                    PathNode.CurveTo(10.0f, 203.3137f, 12.686292f, 206.0f, 16.0f, 206.0f),
                    PathNode.LineTo(240.0f, 206.0f),
                    PathNode.CurveTo(243.3137f, 206.0f, 246.0f, 203.3137f, 246.0f, 200.0f),
                    PathNode.CurveTo(246.0f, 196.6863f, 243.3137f, 194.0f, 240.0f, 194.0f),
                    PathNode.Close,
                    PathNode.MoveTo(166.0f, 174.0f),
                    PathNode.LineTo(218.0f, 174.0f),
                    PathNode.LineTo(218.0f, 194.0f),
                    PathNode.LineTo(166.0f, 194.0f),
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
        return _chalkboardSimple!!
    }

private var _chalkboardSimple: ImageVector? = null
