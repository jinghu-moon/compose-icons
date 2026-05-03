package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PixLogo: ImageVector
    get() {
        if (_pixLogo != null) return _pixLogo!!
        _pixLogo = phosphorDuotoneIcon(
            name = "PixLogo",
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
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.34f, 116.72f),
                    PathNode.LineTo(139.28f, 20.66f),
                    PathNode.CurveTo(133.0394f, 14.456423f, 122.9606f, 14.456423f, 116.72f, 20.66f),
                    PathNode.LineTo(20.66f, 116.72f),
                    PathNode.CurveTo(14.456423f, 122.9606f, 14.456423f, 133.0394f, 20.66f, 139.28f),
                    PathNode.LineTo(116.72f, 235.34f),
                    PathNode.CurveTo(122.9606f, 241.54358f, 133.0394f, 241.54358f, 139.28f, 235.34f),
                    PathNode.LineTo(235.34f, 139.28f),
                    PathNode.CurveTo(241.54358f, 133.0394f, 241.54358f, 122.9606f, 235.34f, 116.72f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 32.0f),
                    PathNode.LineTo(184.0f, 88.0f),
                    PathNode.LineTo(160.0f, 88.0f),
                    PathNode.CurveTo(157.87762f, 87.99833f, 155.84158f, 88.84009f, 154.34f, 90.34f),
                    PathNode.LineTo(128.0f, 116.68f),
                    PathNode.LineTo(101.66f, 90.34f),
                    PathNode.CurveTo(100.158424f, 88.84009f, 98.12237f, 87.99833f, 96.0f, 88.0f),
                    PathNode.LineTo(72.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 104.0f),
                    PathNode.LineTo(92.68f, 104.0f),
                    PathNode.LineTo(116.68f, 128.0f),
                    PathNode.LineTo(92.68f, 152.0f),
                    PathNode.LineTo(56.0f, 152.0f),
                    PathNode.LineTo(32.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 224.0f),
                    PathNode.LineTo(72.0f, 168.0f),
                    PathNode.LineTo(96.0f, 168.0f),
                    PathNode.CurveTo(98.12237f, 168.00166f, 100.158424f, 167.15993f, 101.66f, 165.66f),
                    PathNode.LineTo(128.0f, 139.31f),
                    PathNode.LineTo(154.34f, 165.66f),
                    PathNode.CurveTo(155.84158f, 167.15993f, 157.87762f, 168.00166f, 160.0f, 168.0f),
                    PathNode.LineTo(184.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 152.0f),
                    PathNode.LineTo(163.32f, 152.0f),
                    PathNode.LineTo(139.32f, 128.0f),
                    PathNode.LineTo(163.32f, 104.0f),
                    PathNode.LineTo(200.0f, 104.0f),
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
        return _pixLogo!!
    }

private var _pixLogo: ImageVector? = null
