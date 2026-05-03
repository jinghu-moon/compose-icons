package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Factory: ImageVector
    get() {
        if (_factory != null) return _factory!!
        _factory = phosphorFillIcon(
            name = "Factory",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 208.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 136.0f),
                    PathNode.CurveTo(224.0f, 135.95f, 224.0f, 135.91f, 224.0f, 135.86f),
                    PathNode.CurveTo(224.0f, 135.81f, 224.0f, 135.57f, 224.0f, 135.43f),
                    PathNode.CurveTo(224.0f, 135.29f, 224.0f, 135.15f, 224.0f, 135.02f),
                    PathNode.CurveTo(224.00494f, 134.97012f, 224.00494f, 134.91988f, 224.0f, 134.87f),
                    PathNode.LineTo(209.0f, 29.74f),
                    PathNode.CurveTo(207.83748f, 21.836275f, 201.04875f, 15.984515f, 193.06f, 16.0f),
                    PathNode.LineTo(174.94f, 16.0f),
                    PathNode.CurveTo(166.98921f, 16.034042f, 160.25696f, 21.873764f, 159.1f, 29.74f),
                    PathNode.LineTo(147.54f, 110.65f),
                    PathNode.LineTo(108.8f, 81.6f),
                    PathNode.CurveTo(106.37586f, 79.78189f, 103.13256f, 79.48945f, 100.422295f, 80.84458f),
                    PathNode.CurveTo(97.71202f, 82.19972f, 96.0f, 84.969826f, 96.0f, 88.0f),
                    PathNode.LineTo(96.0f, 120.0f),
                    PathNode.LineTo(44.8f, 81.6f),
                    PathNode.CurveTo(42.37586f, 79.78189f, 39.132565f, 79.48945f, 36.42229f, 80.84458f),
                    PathNode.CurveTo(33.71202f, 82.19972f, 32.0f, 84.969826f, 32.0f, 88.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.LineTo(24.0f, 208.0f),
                    PathNode.CurveTo(19.581722f, 208.0f, 16.0f, 211.58173f, 16.0f, 216.0f),
                    PathNode.CurveTo(16.0f, 220.41827f, 19.581722f, 224.0f, 24.0f, 224.0f),
                    PathNode.LineTo(232.0f, 224.0f),
                    PathNode.CurveTo(236.41827f, 224.0f, 240.0f, 220.41827f, 240.0f, 216.0f),
                    PathNode.CurveTo(240.0f, 211.58173f, 236.41827f, 208.0f, 232.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 184.0f),
                    PathNode.LineTo(80.0f, 184.0f),
                    PathNode.CurveTo(75.58172f, 184.0f, 72.0f, 180.41827f, 72.0f, 176.0f),
                    PathNode.CurveTo(72.0f, 171.58173f, 75.58172f, 168.0f, 80.0f, 168.0f),
                    PathNode.LineTo(108.0f, 168.0f),
                    PathNode.CurveTo(112.41828f, 168.0f, 116.0f, 171.58173f, 116.0f, 176.0f),
                    PathNode.CurveTo(116.0f, 180.41827f, 112.41828f, 184.0f, 108.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 184.0f),
                    PathNode.LineTo(148.0f, 184.0f),
                    PathNode.CurveTo(143.58173f, 184.0f, 140.0f, 180.41827f, 140.0f, 176.0f),
                    PathNode.CurveTo(140.0f, 171.58173f, 143.58173f, 168.0f, 148.0f, 168.0f),
                    PathNode.LineTo(176.0f, 168.0f),
                    PathNode.CurveTo(180.41827f, 168.0f, 184.0f, 171.58173f, 184.0f, 176.0f),
                    PathNode.CurveTo(184.0f, 180.41827f, 180.41827f, 184.0f, 176.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(170.67f, 128.0f),
                    PathNode.LineTo(162.14f, 121.6f),
                    PathNode.LineTo(174.94f, 32.0f),
                    PathNode.LineTo(193.06f, 32.0f),
                    PathNode.LineTo(206.78f, 128.0f),
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
        return _factory!!
    }

private var _factory: ImageVector? = null
