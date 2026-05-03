package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Diamond: ImageVector
    get() {
        if (_diamond != null) return _diamond!!
        _diamond = phosphorRegularIcon(
            name = "Diamond",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.33f, 116.72f),
                    PathNode.LineTo(139.28f, 20.66f),
                    PathNode.CurveTo(133.0394f, 14.456423f, 122.9606f, 14.456423f, 116.72f, 20.66f),
                    PathNode.LineTo(20.72f, 116.72f),
                    PathNode.CurveTo(14.516422f, 122.9606f, 14.516422f, 133.0394f, 20.72f, 139.28f),
                    PathNode.LineTo(116.77f, 235.34f),
                    PathNode.LineTo(116.77f, 235.34f),
                    PathNode.CurveTo(123.0106f, 241.54358f, 133.0894f, 241.54358f, 139.33f, 235.34f),
                    PathNode.LineTo(235.38f, 139.28f),
                    PathNode.CurveTo(241.58357f, 133.0394f, 241.58357f, 122.9606f, 235.38f, 116.72f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 224.0f),
                    PathNode.LineTo(128.0f, 224.0f),
                    PathNode.LineTo(32.0f, 128.0f),
                    PathNode.LineTo(128.0f, 32.0f),
                    PathNode.LineTo(224.0f, 128.0f),
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
        return _diamond!!
    }

private var _diamond: ImageVector? = null
