package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Crop: ImageVector
    get() {
        if (_crop != null) return _crop!!
        _crop = phosphorRegularIcon(
            name = "Crop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 192.0f),
                    PathNode.CurveTo(240.0f, 196.41827f, 236.41827f, 200.0f, 232.0f, 200.0f),
                    PathNode.LineTo(200.0f, 200.0f),
                    PathNode.LineTo(200.0f, 232.0f),
                    PathNode.CurveTo(200.0f, 236.41827f, 196.41827f, 240.0f, 192.0f, 240.0f),
                    PathNode.CurveTo(187.58173f, 240.0f, 184.0f, 236.41827f, 184.0f, 232.0f),
                    PathNode.LineTo(184.0f, 200.0f),
                    PathNode.LineTo(64.0f, 200.0f),
                    PathNode.CurveTo(59.581722f, 200.0f, 56.0f, 196.41827f, 56.0f, 192.0f),
                    PathNode.LineTo(56.0f, 72.0f),
                    PathNode.LineTo(24.0f, 72.0f),
                    PathNode.CurveTo(19.581722f, 72.0f, 16.0f, 68.41828f, 16.0f, 64.0f),
                    PathNode.CurveTo(16.0f, 59.581722f, 19.581722f, 56.0f, 24.0f, 56.0f),
                    PathNode.LineTo(56.0f, 56.0f),
                    PathNode.LineTo(56.0f, 24.0f),
                    PathNode.CurveTo(56.0f, 19.581722f, 59.581722f, 16.0f, 64.0f, 16.0f),
                    PathNode.CurveTo(68.41828f, 16.0f, 72.0f, 19.581722f, 72.0f, 24.0f),
                    PathNode.LineTo(72.0f, 184.0f),
                    PathNode.LineTo(232.0f, 184.0f),
                    PathNode.CurveTo(236.41827f, 184.0f, 240.0f, 187.58173f, 240.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 72.0f),
                    PathNode.LineTo(184.0f, 72.0f),
                    PathNode.LineTo(184.0f, 160.0f),
                    PathNode.CurveTo(184.0f, 164.41827f, 187.58173f, 168.0f, 192.0f, 168.0f),
                    PathNode.CurveTo(196.41827f, 168.0f, 200.0f, 164.41827f, 200.0f, 160.0f),
                    PathNode.LineTo(200.0f, 64.0f),
                    PathNode.CurveTo(200.0f, 59.581722f, 196.41827f, 56.0f, 192.0f, 56.0f),
                    PathNode.LineTo(96.0f, 56.0f),
                    PathNode.CurveTo(91.58172f, 56.0f, 88.0f, 59.581722f, 88.0f, 64.0f),
                    PathNode.CurveTo(88.0f, 68.41828f, 91.58172f, 72.0f, 96.0f, 72.0f),
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
        return _crop!!
    }

private var _crop: ImageVector? = null
