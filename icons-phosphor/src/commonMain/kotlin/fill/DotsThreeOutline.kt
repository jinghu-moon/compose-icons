package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DotsThreeOutline: ImageVector
    get() {
        if (_dotsThreeOutline != null) return _dotsThreeOutline!!
        _dotsThreeOutline = phosphorFillIcon(
            name = "DotsThreeOutline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(156.0f, 128.0f),
                    PathNode.CurveTo(156.0f, 143.46397f, 143.46397f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(112.536026f, 156.0f, 100.0f, 143.46397f, 100.0f, 128.0f),
                    PathNode.CurveTo(100.0f, 112.536026f, 112.536026f, 100.0f, 128.0f, 100.0f),
                    PathNode.CurveTo(143.46397f, 100.0f, 156.0f, 112.536026f, 156.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 100.0f),
                    PathNode.CurveTo(32.536026f, 100.0f, 20.0f, 112.536026f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 143.46397f, 32.536026f, 156.0f, 48.0f, 156.0f),
                    PathNode.CurveTo(63.46397f, 156.0f, 76.0f, 143.46397f, 76.0f, 128.0f),
                    PathNode.CurveTo(76.0f, 112.536026f, 63.46397f, 100.0f, 48.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 100.0f),
                    PathNode.CurveTo(192.53603f, 100.0f, 180.0f, 112.536026f, 180.0f, 128.0f),
                    PathNode.CurveTo(180.0f, 143.46397f, 192.53603f, 156.0f, 208.0f, 156.0f),
                    PathNode.CurveTo(223.46397f, 156.0f, 236.0f, 143.46397f, 236.0f, 128.0f),
                    PathNode.CurveTo(236.0f, 112.536026f, 223.46397f, 100.0f, 208.0f, 100.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _dotsThreeOutline!!
    }

private var _dotsThreeOutline: ImageVector? = null
