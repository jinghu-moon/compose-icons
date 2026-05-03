package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BowlingBall: ImageVector
    get() {
        if (_bowlingBall != null) return _bowlingBall!!
        _bowlingBall = phosphorThinIcon(
            name = "BowlingBall",
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
                    PathNode.MoveTo(140.0f, 116.0f),
                    PathNode.CurveTo(140.0f, 120.41828f, 136.41827f, 124.0f, 132.0f, 124.0f),
                    PathNode.CurveTo(127.58172f, 124.0f, 124.0f, 120.41828f, 124.0f, 116.0f),
                    PathNode.CurveTo(124.0f, 111.58172f, 127.58172f, 108.0f, 132.0f, 108.0f),
                    PathNode.CurveTo(136.41827f, 108.0f, 140.0f, 111.58172f, 140.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 100.0f),
                    PathNode.CurveTo(159.58173f, 100.0f, 156.0f, 96.41828f, 156.0f, 92.0f),
                    PathNode.CurveTo(156.0f, 87.58172f, 159.58173f, 84.0f, 164.0f, 84.0f),
                    PathNode.CurveTo(168.41827f, 84.0f, 172.0f, 87.58172f, 172.0f, 92.0f),
                    PathNode.CurveTo(172.0f, 96.41828f, 168.41827f, 100.0f, 164.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 132.0f),
                    PathNode.CurveTo(180.0f, 136.41827f, 176.41827f, 140.0f, 172.0f, 140.0f),
                    PathNode.CurveTo(167.58173f, 140.0f, 164.0f, 136.41827f, 164.0f, 132.0f),
                    PathNode.CurveTo(164.0f, 127.58172f, 167.58173f, 124.0f, 172.0f, 124.0f),
                    PathNode.CurveTo(176.41827f, 124.0f, 180.0f, 127.58172f, 180.0f, 132.0f),
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
        return _bowlingBall!!
    }

private var _bowlingBall: ImageVector? = null
