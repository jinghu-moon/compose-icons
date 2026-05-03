package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Sticker: ImageVector
    get() {
        if (_sticker != null) return _sticker!!
        _sticker = phosphorFillIcon(
            name = "Sticker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 32.0f),
                    PathNode.LineTo(88.0f, 32.0f),
                    PathNode.CurveTo(57.085766f, 32.03307f, 32.03307f, 57.085766f, 32.0f, 88.0f),
                    PathNode.LineTo(32.0f, 168.0f),
                    PathNode.CurveTo(32.03307f, 198.91423f, 57.085766f, 223.96693f, 88.0f, 224.0f),
                    PathNode.LineTo(136.0f, 224.0f),
                    PathNode.CurveTo(136.85979f, 223.99898f, 137.7139f, 223.86057f, 138.53f, 223.59f),
                    PathNode.CurveTo(164.76f, 214.84f, 214.84f, 164.76f, 223.59f, 138.53f),
                    PathNode.CurveTo(223.86057f, 137.7139f, 223.99898f, 136.85979f, 224.0f, 136.0f),
                    PathNode.LineTo(224.0f, 88.0f),
                    PathNode.CurveTo(223.96693f, 57.085766f, 198.91423f, 32.03307f, 168.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 207.42f),
                    PathNode.LineTo(136.0f, 176.0f),
                    PathNode.CurveTo(136.0f, 153.90862f, 153.90862f, 136.0f, 176.0f, 136.0f),
                    PathNode.LineTo(207.42f, 136.0f),
                    PathNode.CurveTo(198.16f, 157.55f, 157.55f, 198.16f, 136.0f, 207.42f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _sticker!!
    }

private var _sticker: ImageVector? = null
