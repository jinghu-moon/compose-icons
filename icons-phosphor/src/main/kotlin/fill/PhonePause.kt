package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PhonePause: ImageVector
    get() {
        if (_phonePause != null) return _phonePause!!
        _phonePause = phosphorFillIcon(
            name = "PhonePause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(223.88f, 183.08f),
                    PathNode.CurveTo(220.19142f, 211.1111f, 196.2727f, 232.05067f, 168.0f, 232.0f),
                    PathNode.CurveTo(88.6f, 232.0f, 24.0f, 167.4f, 24.0f, 88.0f),
                    PathNode.CurveTo(23.949318f, 59.7273f, 44.8889f, 35.80858f, 72.92f, 32.12f),
                    PathNode.CurveTo(79.95731f, 31.26072f, 86.720985f, 35.134975f, 89.54f, 41.64f),
                    PathNode.LineTo(110.66f, 88.79f),
                    PathNode.LineTo(110.66f, 88.91f),
                    PathNode.CurveTo(112.79448f, 93.834625f, 112.31756f, 99.5014f, 109.39f, 104.0f),
                    PathNode.CurveTo(109.21f, 104.27f, 109.02f, 104.52f, 108.82f, 104.77f),
                    PathNode.LineTo(88.0f, 129.45f),
                    PathNode.CurveTo(95.49f, 144.67f, 111.41f, 160.45f, 126.83f, 167.96f),
                    PathNode.LineTo(151.17f, 147.25f),
                    PathNode.CurveTo(151.40903f, 147.04907f, 151.65944f, 146.86209f, 151.92f, 146.69f),
                    PathNode.CurveTo(156.41823f, 143.6879f, 162.12857f, 143.16124f, 167.1f, 145.29f),
                    PathNode.LineTo(167.22f, 145.35f),
                    PathNode.LineTo(214.32f, 166.46f),
                    PathNode.CurveTo(220.84076f, 169.26581f, 224.73311f, 176.03265f, 223.88f, 183.08f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 112.0f),
                    PathNode.CurveTo(204.41827f, 112.0f, 208.0f, 108.41828f, 208.0f, 104.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.CurveTo(208.0f, 43.581722f, 204.41827f, 40.0f, 200.0f, 40.0f),
                    PathNode.CurveTo(195.58173f, 40.0f, 192.0f, 43.581722f, 192.0f, 48.0f),
                    PathNode.LineTo(192.0f, 104.0f),
                    PathNode.CurveTo(192.0f, 108.41828f, 195.58173f, 112.0f, 200.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 112.0f),
                    PathNode.CurveTo(164.41827f, 112.0f, 168.0f, 108.41828f, 168.0f, 104.0f),
                    PathNode.LineTo(168.0f, 48.0f),
                    PathNode.CurveTo(168.0f, 43.581722f, 164.41827f, 40.0f, 160.0f, 40.0f),
                    PathNode.CurveTo(155.58173f, 40.0f, 152.0f, 43.581722f, 152.0f, 48.0f),
                    PathNode.LineTo(152.0f, 104.0f),
                    PathNode.CurveTo(152.0f, 108.41828f, 155.58173f, 112.0f, 160.0f, 112.0f),
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
        return _phonePause!!
    }

private var _phonePause: ImageVector? = null
