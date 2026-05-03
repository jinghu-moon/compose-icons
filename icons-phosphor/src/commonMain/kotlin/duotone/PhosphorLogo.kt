package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PhosphorLogo: ImageVector
    get() {
        if (_phosphorLogo != null) return _phosphorLogo!!
        _phosphorLogo = phosphorDuotoneIcon(
            name = "PhosphorLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 104.0f),
                    PathNode.CurveTo(216.0f, 139.34622f, 187.34622f, 168.0f, 152.0f, 168.0f),
                    PathNode.LineTo(144.0f, 168.0f),
                    PathNode.LineTo(144.0f, 40.0f),
                    PathNode.LineTo(152.0f, 40.0f),
                    PathNode.CurveTo(187.34622f, 40.0f, 216.0f, 68.65378f, 216.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 168.0f),
                    PathNode.LineTo(144.0f, 168.0f),
                    PathNode.LineTo(72.0f, 40.0f),
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
                    PathNode.MoveTo(80.0f, 70.54f),
                    PathNode.LineTo(130.32f, 160.0f),
                    PathNode.LineTo(80.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 231.54f),
                    PathNode.CurveTo(107.009735f, 227.8314f, 84.19249f, 204.99359f, 80.51f, 176.0f),
                    PathNode.LineTo(136.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 137.54f),
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
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _phosphorLogo!!
    }

private var _phosphorLogo: ImageVector? = null
