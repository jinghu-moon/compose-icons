package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Tag: ImageVector
    get() {
        if (_tag != null) return _tag!!
        _tag = phosphorFillIcon(
            name = "Tag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(243.31f, 136.0f),
                    PathNode.LineTo(144.0f, 36.69f),
                    PathNode.CurveTo(141.00975f, 33.67581f, 136.93579f, 31.986435f, 132.69f, 32.0f),
                    PathNode.LineTo(40.0f, 32.0f),
                    PathNode.CurveTo(35.581722f, 32.0f, 32.0f, 35.581722f, 32.0f, 40.0f),
                    PathNode.LineTo(32.0f, 132.69f),
                    PathNode.CurveTo(31.986435f, 136.93579f, 33.67581f, 141.00975f, 36.69f, 144.0f),
                    PathNode.LineTo(136.0f, 243.31f),
                    PathNode.CurveTo(139.00069f, 246.31137f, 143.0709f, 247.99759f, 147.315f, 247.99759f),
                    PathNode.CurveTo(151.5591f, 247.99759f, 155.62932f, 246.31137f, 158.63f, 243.31f),
                    PathNode.LineTo(243.31f, 158.63f),
                    PathNode.CurveTo(246.31137f, 155.62932f, 247.99759f, 151.5591f, 247.99759f, 147.315f),
                    PathNode.CurveTo(247.99759f, 143.0709f, 246.31137f, 139.00069f, 243.31f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 96.0f),
                    PathNode.CurveTo(77.37258f, 96.0f, 72.0f, 90.62742f, 72.0f, 84.0f),
                    PathNode.CurveTo(72.0f, 77.37258f, 77.37258f, 72.0f, 84.0f, 72.0f),
                    PathNode.CurveTo(90.62742f, 72.0f, 96.0f, 77.37258f, 96.0f, 84.0f),
                    PathNode.CurveTo(96.0f, 90.62742f, 90.62742f, 96.0f, 84.0f, 96.0f),
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
        return _tag!!
    }

private var _tag: ImageVector? = null
