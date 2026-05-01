package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Union: ImageVector
    get() {
        if (_union != null) return _union!!
        _union = phosphorDuotoneIcon(
            name = "Union",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 64.0f),
                    PathNode.LineTo(200.0f, 144.0f),
                    PathNode.CurveTo(200.0f, 183.7645f, 167.7645f, 216.0f, 128.0f, 216.0f),
                    PathNode.CurveTo(88.2355f, 216.0f, 56.0f, 183.7645f, 56.0f, 144.0f),
                    PathNode.LineTo(56.0f, 64.0f),
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
                    PathNode.MoveTo(208.0f, 64.0f),
                    PathNode.LineTo(208.0f, 144.0f),
                    PathNode.CurveTo(208.0f, 188.18279f, 172.18279f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(83.81722f, 224.0f, 48.0f, 188.18279f, 48.0f, 144.0f),
                    PathNode.LineTo(48.0f, 64.0f),
                    PathNode.CurveTo(48.0f, 59.581722f, 51.581722f, 56.0f, 56.0f, 56.0f),
                    PathNode.CurveTo(60.418278f, 56.0f, 64.0f, 59.581722f, 64.0f, 64.0f),
                    PathNode.LineTo(64.0f, 144.0f),
                    PathNode.CurveTo(64.0f, 179.34622f, 92.65378f, 208.0f, 128.0f, 208.0f),
                    PathNode.CurveTo(163.34622f, 208.0f, 192.0f, 179.34622f, 192.0f, 144.0f),
                    PathNode.LineTo(192.0f, 64.0f),
                    PathNode.CurveTo(192.0f, 59.581722f, 195.58173f, 56.0f, 200.0f, 56.0f),
                    PathNode.CurveTo(204.41827f, 56.0f, 208.0f, 59.581722f, 208.0f, 64.0f),
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
        return _union!!
    }

private var _union: ImageVector? = null
