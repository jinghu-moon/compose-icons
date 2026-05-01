package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PhosphorLogo: ImageVector
    get() {
        if (_phosphorLogo != null) return _phosphorLogo!!
        _phosphorLogo = phosphorFillIcon(
            name = "PhosphorLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 32.0f),
                    PathNode.LineTo(72.0f, 32.0f),
                    PathNode.CurveTo(67.58172f, 32.0f, 64.0f, 35.581722f, 64.0f, 40.0f),
                    PathNode.LineTo(64.0f, 168.0f),
                    PathNode.CurveTo(64.0496f, 212.16223f, 99.83778f, 247.9504f, 144.0f, 248.0f),
                    PathNode.CurveTo(148.41827f, 248.0f, 152.0f, 244.41827f, 152.0f, 240.0f),
                    PathNode.LineTo(152.0f, 176.0f),
                    PathNode.CurveTo(191.7645f, 176.0f, 224.0f, 143.7645f, 224.0f, 104.0f),
                    PathNode.CurveTo(224.0f, 64.2355f, 191.7645f, 32.0f, 152.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 231.5f),
                    PathNode.CurveTo(107.02265f, 227.79544f, 84.209335f, 204.97803f, 80.51f, 176.0f),
                    PathNode.LineTo(136.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 137.5f),
                    PathNode.LineTo(85.68f, 48.0f),
                    PathNode.LineTo(136.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 160.0f),
                    PathNode.LineTo(152.0f, 48.0f),
                    PathNode.CurveTo(182.92795f, 48.0f, 208.0f, 73.07206f, 208.0f, 104.0f),
                    PathNode.CurveTo(208.0f, 134.92795f, 182.92795f, 160.0f, 152.0f, 160.0f),
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
        return _phosphorLogo!!
    }

private var _phosphorLogo: ImageVector? = null
