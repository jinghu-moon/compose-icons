package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Angle: ImageVector
    get() {
        if (_angle != null) return _angle!!
        _angle = phosphorRegularIcon(
            name = "Angle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(96.0f, 72.0f),
                    PathNode.CurveTo(96.0f, 67.58172f, 99.58172f, 64.0f, 104.0f, 64.0f),
                    PathNode.CurveTo(161.41248f, 64.06063f, 207.93938f, 110.58752f, 208.0f, 168.0f),
                    PathNode.CurveTo(208.0f, 172.41827f, 204.41827f, 176.0f, 200.0f, 176.0f),
                    PathNode.CurveTo(195.58173f, 176.0f, 192.0f, 172.41827f, 192.0f, 168.0f),
                    PathNode.CurveTo(191.94489f, 119.42178f, 152.57822f, 80.05511f, 104.0f, 80.0f),
                    PathNode.CurveTo(99.58172f, 80.0f, 96.0f, 76.41828f, 96.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 192.0f),
                    PathNode.LineTo(80.0f, 192.0f),
                    PathNode.LineTo(80.0f, 32.0f),
                    PathNode.CurveTo(80.0f, 27.581722f, 76.41828f, 24.0f, 72.0f, 24.0f),
                    PathNode.CurveTo(67.58172f, 24.0f, 64.0f, 27.581722f, 64.0f, 32.0f),
                    PathNode.LineTo(64.0f, 64.0f),
                    PathNode.LineTo(32.0f, 64.0f),
                    PathNode.CurveTo(27.581722f, 64.0f, 24.0f, 67.58172f, 24.0f, 72.0f),
                    PathNode.CurveTo(24.0f, 76.41828f, 27.581722f, 80.0f, 32.0f, 80.0f),
                    PathNode.LineTo(64.0f, 80.0f),
                    PathNode.LineTo(64.0f, 200.0f),
                    PathNode.CurveTo(64.0f, 204.41827f, 67.58172f, 208.0f, 72.0f, 208.0f),
                    PathNode.LineTo(240.0f, 208.0f),
                    PathNode.CurveTo(244.41827f, 208.0f, 248.0f, 204.41827f, 248.0f, 200.0f),
                    PathNode.CurveTo(248.0f, 195.58173f, 244.41827f, 192.0f, 240.0f, 192.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _angle!!
    }

private var _angle: ImageVector? = null
