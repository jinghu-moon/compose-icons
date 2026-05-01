package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Copy: ImageVector
    get() {
        if (_copy != null) return _copy!!
        _copy = phosphorDuotoneIcon(
            name = "Copy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(216.0f, 168.0f),
                    PathNode.LineTo(168.0f, 168.0f),
                    PathNode.LineTo(168.0f, 88.0f),
                    PathNode.LineTo(88.0f, 88.0f),
                    PathNode.LineTo(88.0f, 40.0f),
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
                    PathNode.MoveTo(216.0f, 32.0f),
                    PathNode.LineTo(88.0f, 32.0f),
                    PathNode.CurveTo(83.58172f, 32.0f, 80.0f, 35.581722f, 80.0f, 40.0f),
                    PathNode.LineTo(80.0f, 80.0f),
                    PathNode.LineTo(40.0f, 80.0f),
                    PathNode.CurveTo(35.581722f, 80.0f, 32.0f, 83.58172f, 32.0f, 88.0f),
                    PathNode.LineTo(32.0f, 216.0f),
                    PathNode.CurveTo(32.0f, 220.41827f, 35.581722f, 224.0f, 40.0f, 224.0f),
                    PathNode.LineTo(168.0f, 224.0f),
                    PathNode.CurveTo(172.41827f, 224.0f, 176.0f, 220.41827f, 176.0f, 216.0f),
                    PathNode.LineTo(176.0f, 176.0f),
                    PathNode.LineTo(216.0f, 176.0f),
                    PathNode.CurveTo(220.41827f, 176.0f, 224.0f, 172.41827f, 224.0f, 168.0f),
                    PathNode.LineTo(224.0f, 40.0f),
                    PathNode.CurveTo(224.0f, 35.581722f, 220.41827f, 32.0f, 216.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 96.0f),
                    PathNode.LineTo(160.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 160.0f),
                    PathNode.LineTo(176.0f, 160.0f),
                    PathNode.LineTo(176.0f, 88.0f),
                    PathNode.CurveTo(176.0f, 83.58172f, 172.41827f, 80.0f, 168.0f, 80.0f),
                    PathNode.LineTo(96.0f, 80.0f),
                    PathNode.LineTo(96.0f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
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
        return _copy!!
    }

private var _copy: ImageVector? = null
