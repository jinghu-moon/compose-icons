package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DotsThreeCircle: ImageVector
    get() {
        if (_dotsThreeCircle != null) return _dotsThreeCircle!!
        _dotsThreeCircle = phosphorThinIcon(
            name = "DotsThreeCircle",
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
                    PathNode.MoveTo(136.0f, 128.0f),
                    PathNode.CurveTo(136.0f, 132.41827f, 132.41827f, 136.0f, 128.0f, 136.0f),
                    PathNode.CurveTo(123.58172f, 136.0f, 120.0f, 132.41827f, 120.0f, 128.0f),
                    PathNode.CurveTo(120.0f, 123.58172f, 123.58172f, 120.0f, 128.0f, 120.0f),
                    PathNode.CurveTo(132.41827f, 120.0f, 136.0f, 123.58172f, 136.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 128.0f),
                    PathNode.CurveTo(92.0f, 132.41827f, 88.41828f, 136.0f, 84.0f, 136.0f),
                    PathNode.CurveTo(79.58172f, 136.0f, 76.0f, 132.41827f, 76.0f, 128.0f),
                    PathNode.CurveTo(76.0f, 123.58172f, 79.58172f, 120.0f, 84.0f, 120.0f),
                    PathNode.CurveTo(88.41828f, 120.0f, 92.0f, 123.58172f, 92.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 128.0f),
                    PathNode.CurveTo(180.0f, 132.41827f, 176.41827f, 136.0f, 172.0f, 136.0f),
                    PathNode.CurveTo(167.58173f, 136.0f, 164.0f, 132.41827f, 164.0f, 128.0f),
                    PathNode.CurveTo(164.0f, 123.58172f, 167.58173f, 120.0f, 172.0f, 120.0f),
                    PathNode.CurveTo(176.41827f, 120.0f, 180.0f, 123.58172f, 180.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _dotsThreeCircle!!
    }

private var _dotsThreeCircle: ImageVector? = null
