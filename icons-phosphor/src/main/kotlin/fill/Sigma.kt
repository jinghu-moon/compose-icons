package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Sigma: ImageVector
    get() {
        if (_sigma != null) return _sigma!!
        _sigma = phosphorFillIcon(
            name = "Sigma",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 24.0f),
                    PathNode.LineTo(56.0f, 24.0f),
                    PathNode.CurveTo(47.163445f, 24.0f, 40.0f, 31.163445f, 40.0f, 40.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(40.0f, 224.83656f, 47.163445f, 232.0f, 56.0f, 232.0f),
                    PathNode.LineTo(200.0f, 232.0f),
                    PathNode.CurveTo(208.83656f, 232.0f, 216.0f, 224.83656f, 216.0f, 216.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(216.0f, 31.163445f, 208.83656f, 24.0f, 200.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 88.0f),
                    PathNode.CurveTo(184.0f, 92.41828f, 180.41827f, 96.0f, 176.0f, 96.0f),
                    PathNode.CurveTo(171.58173f, 96.0f, 168.0f, 92.41828f, 168.0f, 88.0f),
                    PathNode.LineTo(168.0f, 72.0f),
                    PathNode.LineTo(96.0f, 72.0f),
                    PathNode.LineTo(134.4f, 123.2f),
                    PathNode.CurveTo(136.53334f, 126.04444f, 136.53334f, 129.95555f, 134.4f, 132.8f),
                    PathNode.LineTo(96.0f, 184.0f),
                    PathNode.LineTo(168.0f, 184.0f),
                    PathNode.LineTo(168.0f, 168.0f),
                    PathNode.CurveTo(168.0f, 163.58173f, 171.58173f, 160.0f, 176.0f, 160.0f),
                    PathNode.CurveTo(180.41827f, 160.0f, 184.0f, 163.58173f, 184.0f, 168.0f),
                    PathNode.LineTo(184.0f, 192.0f),
                    PathNode.CurveTo(184.0f, 196.41827f, 180.41827f, 200.0f, 176.0f, 200.0f),
                    PathNode.LineTo(80.0f, 200.0f),
                    PathNode.CurveTo(76.969826f, 200.0f, 74.19972f, 198.28798f, 72.84458f, 195.57771f),
                    PathNode.CurveTo(71.48945f, 192.86742f, 71.78189f, 189.62415f, 73.6f, 187.2f),
                    PathNode.LineTo(118.0f, 128.0f),
                    PathNode.LineTo(73.6f, 68.8f),
                    PathNode.CurveTo(71.78189f, 66.37586f, 71.48945f, 63.132565f, 72.84458f, 60.42229f),
                    PathNode.CurveTo(74.19972f, 57.71202f, 76.969826f, 56.0f, 80.0f, 56.0f),
                    PathNode.LineTo(176.0f, 56.0f),
                    PathNode.CurveTo(180.41827f, 56.0f, 184.0f, 59.581722f, 184.0f, 64.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _sigma!!
    }

private var _sigma: ImageVector? = null
