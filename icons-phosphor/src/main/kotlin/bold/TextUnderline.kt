package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextUnderline: ImageVector
    get() {
        if (_textUnderline != null) return _textUnderline!!
        _textUnderline = phosphorBoldIcon(
            name = "TextUnderline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.0f, 224.0f),
                    PathNode.CurveTo(204.0f, 230.62741f, 198.62741f, 236.0f, 192.0f, 236.0f),
                    PathNode.LineTo(64.0f, 236.0f),
                    PathNode.CurveTo(57.37258f, 236.0f, 52.0f, 230.62741f, 52.0f, 224.0f),
                    PathNode.CurveTo(52.0f, 217.37259f, 57.37258f, 212.0f, 64.0f, 212.0f),
                    PathNode.LineTo(192.0f, 212.0f),
                    PathNode.CurveTo(198.62741f, 212.0f, 204.0f, 217.37259f, 204.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 196.0f),
                    PathNode.CurveTo(165.53935f, 195.96141f, 195.96141f, 165.53935f, 196.0f, 128.0f),
                    PathNode.LineTo(196.0f, 56.0f),
                    PathNode.CurveTo(196.0f, 49.37258f, 190.62741f, 44.0f, 184.0f, 44.0f),
                    PathNode.CurveTo(177.37259f, 44.0f, 172.0f, 49.37258f, 172.0f, 56.0f),
                    PathNode.LineTo(172.0f, 128.0f),
                    PathNode.CurveTo(172.0f, 152.30052f, 152.30052f, 172.0f, 128.0f, 172.0f),
                    PathNode.CurveTo(103.69947f, 172.0f, 84.0f, 152.30052f, 84.0f, 128.0f),
                    PathNode.LineTo(84.0f, 56.0f),
                    PathNode.CurveTo(84.0f, 49.37258f, 78.62742f, 44.0f, 72.0f, 44.0f),
                    PathNode.CurveTo(65.37258f, 44.0f, 60.0f, 49.37258f, 60.0f, 56.0f),
                    PathNode.LineTo(60.0f, 128.0f),
                    PathNode.CurveTo(60.038586f, 165.53935f, 90.46063f, 195.96141f, 128.0f, 196.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _textUnderline!!
    }

private var _textUnderline: ImageVector? = null
