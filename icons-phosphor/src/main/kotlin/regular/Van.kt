package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Van: ImageVector
    get() {
        if (_van != null) return _van!!
        _van = phosphorRegularIcon(
            name = "Van",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(254.07f, 106.79f),
                    PathNode.LineTo(208.53f, 53.73f),
                    PathNode.CurveTo(205.48975f, 50.097996f, 200.99652f, 47.999687f, 196.26f, 48.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(23.163445f, 48.0f, 16.0f, 55.163445f, 16.0f, 64.0f),
                    PathNode.LineTo(16.0f, 176.0f),
                    PathNode.CurveTo(16.0f, 184.83656f, 23.163445f, 192.0f, 32.0f, 192.0f),
                    PathNode.LineTo(49.0f, 192.0f),
                    PathNode.CurveTo(52.62536f, 206.15932f, 65.38393f, 216.06276f, 80.0f, 216.06276f),
                    PathNode.CurveTo(94.61607f, 216.06276f, 107.37464f, 206.15932f, 111.0f, 192.0f),
                    PathNode.LineTo(161.0f, 192.0f),
                    PathNode.CurveTo(164.62535f, 206.15932f, 177.38393f, 216.06276f, 192.0f, 216.06276f),
                    PathNode.CurveTo(206.61607f, 216.06276f, 219.37465f, 206.15932f, 223.0f, 192.0f),
                    PathNode.LineTo(240.0f, 192.0f),
                    PathNode.CurveTo(248.83656f, 192.0f, 256.0f, 184.83656f, 256.0f, 176.0f),
                    PathNode.LineTo(256.0f, 112.0f),
                    PathNode.CurveTo(255.99974f, 110.08853f, 255.3151f, 108.240326f, 254.07f, 106.79f),
                    PathNode.Close,
                    PathNode.MoveTo(230.59f, 104.0f),
                    PathNode.LineTo(176.0f, 104.0f),
                    PathNode.LineTo(176.0f, 64.0f),
                    PathNode.LineTo(196.26f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 104.0f),
                    PathNode.LineTo(104.0f, 64.0f),
                    PathNode.LineTo(160.0f, 64.0f),
                    PathNode.LineTo(160.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 64.0f),
                    PathNode.LineTo(88.0f, 104.0f),
                    PathNode.LineTo(32.0f, 104.0f),
                    PathNode.LineTo(32.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 200.0f),
                    PathNode.CurveTo(71.163445f, 200.0f, 64.0f, 192.83656f, 64.0f, 184.0f),
                    PathNode.CurveTo(64.0f, 175.16344f, 71.163445f, 168.0f, 80.0f, 168.0f),
                    PathNode.CurveTo(88.836555f, 168.0f, 96.0f, 175.16344f, 96.0f, 184.0f),
                    PathNode.CurveTo(96.0f, 192.83656f, 88.836555f, 200.0f, 80.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 200.0f),
                    PathNode.CurveTo(183.16344f, 200.0f, 176.0f, 192.83656f, 176.0f, 184.0f),
                    PathNode.CurveTo(176.0f, 175.16344f, 183.16344f, 168.0f, 192.0f, 168.0f),
                    PathNode.CurveTo(200.83656f, 168.0f, 208.0f, 175.16344f, 208.0f, 184.0f),
                    PathNode.CurveTo(208.0f, 192.83656f, 200.83656f, 200.0f, 192.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(223.0f, 176.0f),
                    PathNode.CurveTo(219.37465f, 161.84068f, 206.61607f, 151.93724f, 192.0f, 151.93724f),
                    PathNode.CurveTo(177.38393f, 151.93724f, 164.62535f, 161.84068f, 161.0f, 176.0f),
                    PathNode.LineTo(111.0f, 176.0f),
                    PathNode.CurveTo(107.37464f, 161.84068f, 94.61607f, 151.93724f, 80.0f, 151.93724f),
                    PathNode.CurveTo(65.38393f, 151.93724f, 52.62536f, 161.84068f, 49.0f, 176.0f),
                    PathNode.LineTo(32.0f, 176.0f),
                    PathNode.LineTo(32.0f, 120.0f),
                    PathNode.LineTo(240.0f, 120.0f),
                    PathNode.LineTo(240.0f, 176.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _van!!
    }

private var _van: ImageVector? = null
