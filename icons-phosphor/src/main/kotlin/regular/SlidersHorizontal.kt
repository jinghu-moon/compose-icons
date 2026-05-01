package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SlidersHorizontal: ImageVector
    get() {
        if (_slidersHorizontal != null) return _slidersHorizontal!!
        _slidersHorizontal = phosphorRegularIcon(
            name = "SlidersHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(40.0f, 88.0f),
                    PathNode.LineTo(73.0f, 88.0f),
                    PathNode.CurveTo(76.62536f, 102.15932f, 89.38393f, 112.062744f, 104.0f, 112.062744f),
                    PathNode.CurveTo(118.61607f, 112.062744f, 131.37465f, 102.15932f, 135.0f, 88.0f),
                    PathNode.LineTo(216.0f, 88.0f),
                    PathNode.CurveTo(220.41827f, 88.0f, 224.0f, 84.41828f, 224.0f, 80.0f),
                    PathNode.CurveTo(224.0f, 75.58172f, 220.41827f, 72.0f, 216.0f, 72.0f),
                    PathNode.LineTo(135.0f, 72.0f),
                    PathNode.CurveTo(131.37465f, 57.840683f, 118.61607f, 47.937252f, 104.0f, 47.937252f),
                    PathNode.CurveTo(89.38393f, 47.937252f, 76.62536f, 57.840683f, 73.0f, 72.0f),
                    PathNode.LineTo(40.0f, 72.0f),
                    PathNode.CurveTo(35.581722f, 72.0f, 32.0f, 75.58172f, 32.0f, 80.0f),
                    PathNode.CurveTo(32.0f, 84.41828f, 35.581722f, 88.0f, 40.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 64.0f),
                    PathNode.CurveTo(112.836555f, 64.0f, 120.0f, 71.163445f, 120.0f, 80.0f),
                    PathNode.CurveTo(120.0f, 88.836555f, 112.836555f, 96.0f, 104.0f, 96.0f),
                    PathNode.CurveTo(95.163445f, 96.0f, 88.0f, 88.836555f, 88.0f, 80.0f),
                    PathNode.CurveTo(88.0f, 71.163445f, 95.163445f, 64.0f, 104.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 168.0f),
                    PathNode.LineTo(199.0f, 168.0f),
                    PathNode.CurveTo(195.37465f, 153.84068f, 182.61607f, 143.93724f, 168.0f, 143.93724f),
                    PathNode.CurveTo(153.38393f, 143.93724f, 140.62535f, 153.84068f, 137.0f, 168.0f),
                    PathNode.LineTo(40.0f, 168.0f),
                    PathNode.CurveTo(35.581722f, 168.0f, 32.0f, 171.58173f, 32.0f, 176.0f),
                    PathNode.CurveTo(32.0f, 180.41827f, 35.581722f, 184.0f, 40.0f, 184.0f),
                    PathNode.LineTo(137.0f, 184.0f),
                    PathNode.CurveTo(140.62535f, 198.15932f, 153.38393f, 208.06276f, 168.0f, 208.06276f),
                    PathNode.CurveTo(182.61607f, 208.06276f, 195.37465f, 198.15932f, 199.0f, 184.0f),
                    PathNode.LineTo(216.0f, 184.0f),
                    PathNode.CurveTo(220.41827f, 184.0f, 224.0f, 180.41827f, 224.0f, 176.0f),
                    PathNode.CurveTo(224.0f, 171.58173f, 220.41827f, 168.0f, 216.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 192.0f),
                    PathNode.CurveTo(159.16344f, 192.0f, 152.0f, 184.83656f, 152.0f, 176.0f),
                    PathNode.CurveTo(152.0f, 167.16344f, 159.16344f, 160.0f, 168.0f, 160.0f),
                    PathNode.CurveTo(176.83656f, 160.0f, 184.0f, 167.16344f, 184.0f, 176.0f),
                    PathNode.CurveTo(184.0f, 184.83656f, 176.83656f, 192.0f, 168.0f, 192.0f),
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
        return _slidersHorizontal!!
    }

private var _slidersHorizontal: ImageVector? = null
