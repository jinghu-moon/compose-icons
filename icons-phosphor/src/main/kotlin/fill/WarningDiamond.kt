package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.WarningDiamond: ImageVector
    get() {
        if (_warningDiamond != null) return _warningDiamond!!
        _warningDiamond = phosphorFillIcon(
            name = "WarningDiamond",
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
                    PathNode.MoveTo(120.0f, 80.0f),
                    PathNode.CurveTo(120.0f, 75.58172f, 123.58172f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(132.41827f, 72.0f, 136.0f, 75.58172f, 136.0f, 80.0f),
                    PathNode.LineTo(136.0f, 136.0f),
                    PathNode.CurveTo(136.0f, 140.41827f, 132.41827f, 144.0f, 128.0f, 144.0f),
                    PathNode.CurveTo(123.58172f, 144.0f, 120.0f, 140.41827f, 120.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 184.0f),
                    PathNode.CurveTo(121.37258f, 184.0f, 116.0f, 178.62741f, 116.0f, 172.0f),
                    PathNode.CurveTo(116.0f, 165.37259f, 121.37258f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(134.62741f, 160.0f, 140.0f, 165.37259f, 140.0f, 172.0f),
                    PathNode.CurveTo(140.0f, 178.62741f, 134.62741f, 184.0f, 128.0f, 184.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _warningDiamond!!
    }

private var _warningDiamond: ImageVector? = null
