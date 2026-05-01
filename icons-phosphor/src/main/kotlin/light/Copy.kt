package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Copy: ImageVector
    get() {
        if (_copy != null) return _copy!!
        _copy = phosphorLightIcon(
            name = "Copy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 34.0f),
                    PathNode.LineTo(88.0f, 34.0f),
                    PathNode.CurveTo(84.686295f, 34.0f, 82.0f, 36.68629f, 82.0f, 40.0f),
                    PathNode.LineTo(82.0f, 82.0f),
                    PathNode.LineTo(40.0f, 82.0f),
                    PathNode.CurveTo(36.68629f, 82.0f, 34.0f, 84.686295f, 34.0f, 88.0f),
                    PathNode.LineTo(34.0f, 216.0f),
                    PathNode.CurveTo(34.0f, 219.3137f, 36.68629f, 222.0f, 40.0f, 222.0f),
                    PathNode.LineTo(168.0f, 222.0f),
                    PathNode.CurveTo(171.3137f, 222.0f, 174.0f, 219.3137f, 174.0f, 216.0f),
                    PathNode.LineTo(174.0f, 174.0f),
                    PathNode.LineTo(216.0f, 174.0f),
                    PathNode.CurveTo(219.3137f, 174.0f, 222.0f, 171.3137f, 222.0f, 168.0f),
                    PathNode.LineTo(222.0f, 40.0f),
                    PathNode.CurveTo(222.0f, 36.68629f, 219.3137f, 34.0f, 216.0f, 34.0f),
                    PathNode.Close,
                    PathNode.MoveTo(162.0f, 210.0f),
                    PathNode.LineTo(46.0f, 210.0f),
                    PathNode.LineTo(46.0f, 94.0f),
                    PathNode.LineTo(162.0f, 94.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 162.0f),
                    PathNode.LineTo(174.0f, 162.0f),
                    PathNode.LineTo(174.0f, 88.0f),
                    PathNode.CurveTo(174.0f, 84.686295f, 171.3137f, 82.0f, 168.0f, 82.0f),
                    PathNode.LineTo(94.0f, 82.0f),
                    PathNode.LineTo(94.0f, 46.0f),
                    PathNode.LineTo(210.0f, 46.0f),
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
        return _copy!!
    }

private var _copy: ImageVector? = null
