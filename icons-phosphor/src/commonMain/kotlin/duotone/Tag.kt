package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Tag: ImageVector
    get() {
        if (_tag != null) return _tag!!
        _tag = phosphorDuotoneIcon(
            name = "Tag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.66f, 153.0f),
                    PathNode.LineTo(153.0f, 237.66f),
                    PathNode.CurveTo(149.87624f, 240.78172f, 144.81377f, 240.78172f, 141.69f, 237.66f),
                    PathNode.LineTo(42.34f, 138.34f),
                    PathNode.CurveTo(40.84254f, 136.84088f, 40.00098f, 134.8089f, 40.0f, 132.69f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.LineTo(132.69f, 40.0f),
                    PathNode.CurveTo(134.8089f, 40.00098f, 136.84088f, 40.84254f, 138.34f, 42.34f),
                    PathNode.LineTo(237.66f, 141.66f),
                    PathNode.CurveTo(239.16835f, 143.16135f, 240.01633f, 145.20181f, 240.01633f, 147.33f),
                    PathNode.CurveTo(240.01633f, 149.45818f, 239.16835f, 151.49866f, 237.66f, 153.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
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
                    PathNode.MoveTo(147.31f, 232.0f),
                    PathNode.LineTo(48.0f, 132.69f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.LineTo(132.69f, 48.0f),
                    PathNode.LineTo(232.0f, 147.31f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 84.0f),
                    PathNode.CurveTo(96.0f, 90.62742f, 90.62742f, 96.0f, 84.0f, 96.0f),
                    PathNode.CurveTo(77.37258f, 96.0f, 72.0f, 90.62742f, 72.0f, 84.0f),
                    PathNode.CurveTo(72.0f, 77.37258f, 77.37258f, 72.0f, 84.0f, 72.0f),
                    PathNode.CurveTo(90.62742f, 72.0f, 96.0f, 77.37258f, 96.0f, 84.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _tag!!
    }

private var _tag: ImageVector? = null
