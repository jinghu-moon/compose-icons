package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bed: ImageVector
    get() {
        if (_bed != null) return _bed!!
        _bed = phosphorLightIcon(
            name = "Bed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 74.0f),
                    PathNode.LineTo(30.0f, 74.0f),
                    PathNode.LineTo(30.0f, 48.0f),
                    PathNode.CurveTo(30.0f, 44.68629f, 27.31371f, 42.0f, 24.0f, 42.0f),
                    PathNode.CurveTo(20.68629f, 42.0f, 18.0f, 44.68629f, 18.0f, 48.0f),
                    PathNode.LineTo(18.0f, 208.0f),
                    PathNode.CurveTo(18.0f, 211.3137f, 20.68629f, 214.0f, 24.0f, 214.0f),
                    PathNode.CurveTo(27.31371f, 214.0f, 30.0f, 211.3137f, 30.0f, 208.0f),
                    PathNode.LineTo(30.0f, 174.0f),
                    PathNode.LineTo(242.0f, 174.0f),
                    PathNode.LineTo(242.0f, 208.0f),
                    PathNode.CurveTo(242.0f, 211.3137f, 244.6863f, 214.0f, 248.0f, 214.0f),
                    PathNode.CurveTo(251.3137f, 214.0f, 254.0f, 211.3137f, 254.0f, 208.0f),
                    PathNode.LineTo(254.0f, 112.0f),
                    PathNode.CurveTo(254.0f, 91.013176f, 236.98682f, 74.0f, 216.0f, 74.0f),
                    PathNode.Close,
                    PathNode.MoveTo(30.0f, 86.0f),
                    PathNode.LineTo(106.0f, 86.0f),
                    PathNode.LineTo(106.0f, 162.0f),
                    PathNode.LineTo(30.0f, 162.0f),
                    PathNode.Close,
                    PathNode.MoveTo(118.0f, 162.0f),
                    PathNode.LineTo(118.0f, 86.0f),
                    PathNode.LineTo(216.0f, 86.0f),
                    PathNode.CurveTo(230.3594f, 86.0f, 242.0f, 97.640594f, 242.0f, 112.0f),
                    PathNode.LineTo(242.0f, 162.0f),
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
        return _bed!!
    }

private var _bed: ImageVector? = null
