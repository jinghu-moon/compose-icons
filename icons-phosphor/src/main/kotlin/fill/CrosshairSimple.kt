package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CrosshairSimple: ImageVector
    get() {
        if (_crosshairSimple != null) return _crosshairSimple!!
        _crosshairSimple = phosphorFillIcon(
            name = "CrosshairSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 136.0f),
                    PathNode.LineTo(199.54f, 136.0f),
                    PathNode.CurveTo(195.75847f, 169.40082f, 169.40082f, 195.75847f, 136.0f, 199.54f),
                    PathNode.LineTo(136.0f, 176.0f),
                    PathNode.CurveTo(136.0f, 171.58173f, 132.41827f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(123.58172f, 168.0f, 120.0f, 171.58173f, 120.0f, 176.0f),
                    PathNode.LineTo(120.0f, 199.54f),
                    PathNode.CurveTo(86.59919f, 195.75847f, 60.241535f, 169.40082f, 56.46f, 136.0f),
                    PathNode.LineTo(80.0f, 136.0f),
                    PathNode.CurveTo(84.41828f, 136.0f, 88.0f, 132.41827f, 88.0f, 128.0f),
                    PathNode.CurveTo(88.0f, 123.58172f, 84.41828f, 120.0f, 80.0f, 120.0f),
                    PathNode.LineTo(56.46f, 120.0f),
                    PathNode.CurveTo(60.241535f, 86.59919f, 86.59919f, 60.241535f, 120.0f, 56.46f),
                    PathNode.LineTo(120.0f, 80.0f),
                    PathNode.CurveTo(120.0f, 84.41828f, 123.58172f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(132.41827f, 88.0f, 136.0f, 84.41828f, 136.0f, 80.0f),
                    PathNode.LineTo(136.0f, 56.46f),
                    PathNode.CurveTo(169.40082f, 60.241535f, 195.75847f, 86.59919f, 199.54f, 120.0f),
                    PathNode.LineTo(176.0f, 120.0f),
                    PathNode.CurveTo(171.58173f, 120.0f, 168.0f, 123.58172f, 168.0f, 128.0f),
                    PathNode.CurveTo(168.0f, 132.41827f, 171.58173f, 136.0f, 176.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 185.4376f, 185.4376f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(70.562386f, 232.0f, 24.0f, 185.4376f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 70.562386f, 70.562386f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(185.41248f, 24.060629f, 231.93938f, 70.58752f, 232.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 128.0f),
                    PathNode.CurveTo(216.0f, 79.39894f, 176.60106f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(79.39894f, 40.0f, 40.0f, 79.39894f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 176.60106f, 79.39894f, 216.0f, 128.0f, 216.0f),
                    PathNode.CurveTo(176.57822f, 215.94489f, 215.94489f, 176.57822f, 216.0f, 128.0f),
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
        return _crosshairSimple!!
    }

private var _crosshairSimple: ImageVector? = null
