package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Diamond: ImageVector
    get() {
        if (_diamond != null) return _diamond!!
        _diamond = phosphorDuotoneIcon(
            name = "Diamond",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(229.67f, 133.62f),
                    PathNode.LineTo(133.67f, 229.62f),
                    PathNode.CurveTo(132.18051f, 231.11246f, 130.15855f, 231.95116f, 128.05f, 231.95116f),
                    PathNode.CurveTo(125.94146f, 231.95116f, 123.91949f, 231.11246f, 122.43f, 229.62f),
                    PathNode.LineTo(26.43f, 133.62f),
                    PathNode.CurveTo(24.93755f, 132.13051f, 24.09885f, 130.10855f, 24.09885f, 128.0f),
                    PathNode.CurveTo(24.09885f, 125.89145f, 24.93755f, 123.86949f, 26.43f, 122.38f),
                    PathNode.LineTo(122.48f, 26.38f),
                    PathNode.CurveTo(123.96949f, 24.88755f, 125.99145f, 24.048853f, 128.1f, 24.048853f),
                    PathNode.CurveTo(130.20856f, 24.048853f, 132.23051f, 24.88755f, 133.72f, 26.38f),
                    PathNode.LineTo(229.72f, 122.43f),
                    PathNode.CurveTo(232.78116f, 125.539986f, 232.75882f, 130.53749f, 229.67f, 133.62f),
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
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _diamond!!
    }

private var _diamond: ImageVector? = null
