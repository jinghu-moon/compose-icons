package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Sticker: ImageVector
    get() {
        if (_sticker != null) return _sticker!!
        _sticker = phosphorBoldIcon(
            name = "Sticker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 28.0f),
                    PathNode.LineTo(88.0f, 28.0f),
                    PathNode.CurveTo(54.878906f, 28.038574f, 28.038574f, 54.878906f, 28.0f, 88.0f),
                    PathNode.LineTo(28.0f, 168.0f),
                    PathNode.CurveTo(28.038574f, 201.1211f, 54.878906f, 227.96143f, 88.0f, 228.0f),
                    PathNode.LineTo(136.0f, 228.0f),
                    PathNode.CurveTo(137.28857f, 227.9999f, 138.56857f, 227.7905f, 139.79f, 227.38f),
                    PathNode.CurveTo(167.42f, 218.17f, 218.17f, 167.38f, 227.38f, 139.79f),
                    PathNode.CurveTo(227.7905f, 138.56857f, 227.9999f, 137.28857f, 228.0f, 136.0f),
                    PathNode.LineTo(228.0f, 88.0f),
                    PathNode.CurveTo(227.96143f, 54.878906f, 201.1211f, 28.038574f, 168.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 168.0f),
                    PathNode.LineTo(52.0f, 88.0f),
                    PathNode.CurveTo(52.0f, 68.11775f, 68.11775f, 52.0f, 88.0f, 52.0f),
                    PathNode.LineTo(168.0f, 52.0f),
                    PathNode.CurveTo(187.88223f, 52.0f, 204.0f, 68.11775f, 204.0f, 88.0f),
                    PathNode.LineTo(204.0f, 124.0f),
                    PathNode.LineTo(184.0f, 124.0f),
                    PathNode.CurveTo(150.8789f, 124.038574f, 124.038574f, 150.8789f, 124.0f, 184.0f),
                    PathNode.LineTo(124.0f, 204.0f),
                    PathNode.LineTo(88.0f, 204.0f),
                    PathNode.CurveTo(68.11775f, 204.0f, 52.0f, 187.88223f, 52.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 195.63f),
                    PathNode.LineTo(148.0f, 184.0f),
                    PathNode.CurveTo(148.0f, 164.11777f, 164.11777f, 148.0f, 184.0f, 148.0f),
                    PathNode.LineTo(195.63f, 148.0f),
                    PathNode.CurveTo(184.0f, 164.11f, 164.11f, 184.0f, 148.0f, 195.63f),
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
        return _sticker!!
    }

private var _sticker: ImageVector? = null
