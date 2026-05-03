package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Ghost: ImageVector
    get() {
        if (_ghost != null) return _ghost!!
        _ghost = phosphorFillIcon(
            name = "Ghost",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(75.00579f, 24.060617f, 32.06062f, 67.00579f, 32.0f, 120.0f),
                    PathNode.LineTo(32.0f, 216.0f),
                    PathNode.CurveTo(31.999344f, 219.09238f, 33.781f, 221.9082f, 36.575783f, 223.23183f),
                    PathNode.CurveTo(39.37057f, 224.55545f, 42.677925f, 224.1498f, 45.07f, 222.19f),
                    PathNode.LineTo(69.33f, 202.34f),
                    PathNode.LineTo(93.6f, 222.19f),
                    PathNode.CurveTo(96.5466f, 224.60014f, 100.7834f, 224.60014f, 103.73f, 222.19f),
                    PathNode.LineTo(128.0f, 202.34f),
                    PathNode.LineTo(152.27f, 222.19f),
                    PathNode.CurveTo(155.2166f, 224.60014f, 159.45338f, 224.60014f, 162.4f, 222.19f),
                    PathNode.LineTo(186.67f, 202.34f),
                    PathNode.LineTo(210.93f, 222.19f),
                    PathNode.CurveTo(213.32207f, 224.1498f, 216.62943f, 224.55545f, 219.42421f, 223.23183f),
                    PathNode.CurveTo(222.21901f, 221.9082f, 224.00066f, 219.09238f, 224.0f, 216.0f),
                    PathNode.LineTo(224.0f, 120.0f),
                    PathNode.CurveTo(223.93938f, 67.00579f, 180.9942f, 24.060617f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 128.0f),
                    PathNode.CurveTo(93.37258f, 128.0f, 88.0f, 122.62742f, 88.0f, 116.0f),
                    PathNode.CurveTo(88.0f, 109.37258f, 93.37258f, 104.0f, 100.0f, 104.0f),
                    PathNode.CurveTo(106.62742f, 104.0f, 112.0f, 109.37258f, 112.0f, 116.0f),
                    PathNode.CurveTo(112.0f, 122.62742f, 106.62742f, 128.0f, 100.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 128.0f),
                    PathNode.CurveTo(149.37259f, 128.0f, 144.0f, 122.62742f, 144.0f, 116.0f),
                    PathNode.CurveTo(144.0f, 109.37258f, 149.37259f, 104.0f, 156.0f, 104.0f),
                    PathNode.CurveTo(162.62741f, 104.0f, 168.0f, 109.37258f, 168.0f, 116.0f),
                    PathNode.CurveTo(168.0f, 122.62742f, 162.62741f, 128.0f, 156.0f, 128.0f),
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
        return _ghost!!
    }

private var _ghost: ImageVector? = null
