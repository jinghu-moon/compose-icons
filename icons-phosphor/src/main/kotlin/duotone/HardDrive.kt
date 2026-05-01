package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HardDrive: ImageVector
    get() {
        if (_hardDrive != null) return _hardDrive!!
        _hardDrive = phosphorDuotoneIcon(
            name = "HardDrive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 80.0f),
                    PathNode.LineTo(232.0f, 176.0f),
                    PathNode.CurveTo(232.0f, 180.41827f, 228.41827f, 184.0f, 224.0f, 184.0f),
                    PathNode.LineTo(32.0f, 184.0f),
                    PathNode.CurveTo(27.581722f, 184.0f, 24.0f, 180.41827f, 24.0f, 176.0f),
                    PathNode.LineTo(24.0f, 80.0f),
                    PathNode.CurveTo(24.0f, 75.58172f, 27.581722f, 72.0f, 32.0f, 72.0f),
                    PathNode.LineTo(224.0f, 72.0f),
                    PathNode.CurveTo(228.41827f, 72.0f, 232.0f, 75.58172f, 232.0f, 80.0f),
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
                    PathNode.MoveTo(224.0f, 64.0f),
                    PathNode.LineTo(32.0f, 64.0f),
                    PathNode.CurveTo(23.163445f, 64.0f, 16.0f, 71.163445f, 16.0f, 80.0f),
                    PathNode.LineTo(16.0f, 176.0f),
                    PathNode.CurveTo(16.0f, 184.83656f, 23.163445f, 192.0f, 32.0f, 192.0f),
                    PathNode.LineTo(224.0f, 192.0f),
                    PathNode.CurveTo(232.83656f, 192.0f, 240.0f, 184.83656f, 240.0f, 176.0f),
                    PathNode.LineTo(240.0f, 80.0f),
                    PathNode.CurveTo(240.0f, 71.163445f, 232.83656f, 64.0f, 224.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 176.0f),
                    PathNode.LineTo(32.0f, 176.0f),
                    PathNode.LineTo(32.0f, 80.0f),
                    PathNode.LineTo(224.0f, 80.0f),
                    PathNode.LineTo(224.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 128.0f),
                    PathNode.CurveTo(200.0f, 134.62741f, 194.62741f, 140.0f, 188.0f, 140.0f),
                    PathNode.CurveTo(181.37259f, 140.0f, 176.0f, 134.62741f, 176.0f, 128.0f),
                    PathNode.CurveTo(176.0f, 121.37258f, 181.37259f, 116.0f, 188.0f, 116.0f),
                    PathNode.CurveTo(194.62741f, 116.0f, 200.0f, 121.37258f, 200.0f, 128.0f),
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
        return _hardDrive!!
    }

private var _hardDrive: ImageVector? = null
