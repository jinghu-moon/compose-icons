package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SmileySad: ImageVector
    get() {
        if (_smileySad != null) return _smileySad!!
        _smileySad = phosphorThinIcon(
            name = "SmileySad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(72.77152f, 28.0f, 28.0f, 72.77152f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 183.22847f, 72.77152f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(183.22847f, 228.0f, 228.0f, 183.22847f, 228.0f, 128.0f),
                    PathNode.CurveTo(227.93938f, 72.79665f, 183.20334f, 28.060623f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(77.18981f, 220.0f, 36.0f, 178.8102f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 77.18981f, 77.18981f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(178.8102f, 36.0f, 220.0f, 77.18981f, 220.0f, 128.0f),
                    PathNode.CurveTo(219.94489f, 178.78735f, 178.78735f, 219.94489f, 128.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 108.0f),
                    PathNode.CurveTo(84.0f, 103.58172f, 87.58172f, 100.0f, 92.0f, 100.0f),
                    PathNode.CurveTo(96.41828f, 100.0f, 100.0f, 103.58172f, 100.0f, 108.0f),
                    PathNode.CurveTo(100.0f, 112.41828f, 96.41828f, 116.0f, 92.0f, 116.0f),
                    PathNode.CurveTo(87.58172f, 116.0f, 84.0f, 112.41828f, 84.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 108.0f),
                    PathNode.CurveTo(172.0f, 112.41828f, 168.41827f, 116.0f, 164.0f, 116.0f),
                    PathNode.CurveTo(159.58173f, 116.0f, 156.0f, 112.41828f, 156.0f, 108.0f),
                    PathNode.CurveTo(156.0f, 103.58172f, 159.58173f, 100.0f, 164.0f, 100.0f),
                    PathNode.CurveTo(168.41827f, 100.0f, 172.0f, 103.58172f, 172.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(171.46f, 174.0f),
                    PathNode.CurveTo(172.56247f, 175.91118f, 171.90923f, 178.35414f, 170.0f, 179.46f),
                    PathNode.CurveTo(169.39363f, 179.81563f, 168.70296f, 180.0021f, 168.0f, 180.0f),
                    PathNode.CurveTo(166.5724f, 179.99854f, 165.2538f, 179.23634f, 164.54f, 178.0f),
                    PathNode.CurveTo(156.33f, 163.81f, 143.35f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(112.65f, 156.0f, 99.67f, 163.81f, 91.46f, 178.0f),
                    PathNode.CurveTo(90.31001f, 179.809f, 87.938416f, 180.38992f, 86.08256f, 179.31717f),
                    PathNode.CurveTo(84.22671f, 178.24443f, 83.546394f, 175.8994f, 84.54f, 174.0f),
                    PathNode.CurveTo(94.09f, 157.48f, 109.94f, 148.0f, 128.0f, 148.0f),
                    PathNode.CurveTo(146.06f, 148.0f, 161.91f, 157.48f, 171.46f, 174.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _smileySad!!
    }

private var _smileySad: ImageVector? = null
