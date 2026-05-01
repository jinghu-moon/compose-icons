package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NotEquals: ImageVector
    get() {
        if (_notEquals != null) return _notEquals!!
        _notEquals = phosphorDuotoneIcon(
            name = "NotEquals",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 56.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.CurveTo(216.0f, 208.83656f, 208.83656f, 216.0f, 200.0f, 216.0f),
                    PathNode.LineTo(56.0f, 216.0f),
                    PathNode.CurveTo(47.163445f, 216.0f, 40.0f, 208.83656f, 40.0f, 200.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.CurveTo(40.0f, 47.163445f, 47.163445f, 40.0f, 56.0f, 40.0f),
                    PathNode.LineTo(200.0f, 40.0f),
                    PathNode.CurveTo(208.83656f, 40.0f, 216.0f, 47.163445f, 216.0f, 56.0f),
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
                    PathNode.MoveTo(224.0f, 160.0f),
                    PathNode.CurveTo(224.0f, 164.41827f, 220.41827f, 168.0f, 216.0f, 168.0f),
                    PathNode.LineTo(102.45f, 168.0f),
                    PathNode.LineTo(53.92f, 221.38f),
                    PathNode.CurveTo(50.934998f, 224.58652f, 45.926197f, 224.79579f, 42.68412f, 221.84944f),
                    PathNode.CurveTo(39.442047f, 218.90309f, 39.172737f, 213.89717f, 42.08f, 210.62f),
                    PathNode.LineTo(80.82f, 168.0f),
                    PathNode.LineTo(40.0f, 168.0f),
                    PathNode.CurveTo(35.581722f, 168.0f, 32.0f, 164.41827f, 32.0f, 160.0f),
                    PathNode.CurveTo(32.0f, 155.58173f, 35.581722f, 152.0f, 40.0f, 152.0f),
                    PathNode.LineTo(95.37f, 152.0f),
                    PathNode.LineTo(139.0f, 104.0f),
                    PathNode.LineTo(40.0f, 104.0f),
                    PathNode.CurveTo(35.581722f, 104.0f, 32.0f, 100.41828f, 32.0f, 96.0f),
                    PathNode.CurveTo(32.0f, 91.58172f, 35.581722f, 88.0f, 40.0f, 88.0f),
                    PathNode.LineTo(153.55f, 88.0f),
                    PathNode.LineTo(202.08f, 34.62f),
                    PathNode.CurveTo(205.065f, 31.413485f, 210.0738f, 31.204214f, 213.31587f, 34.15056f),
                    PathNode.CurveTo(216.55795f, 37.0969f, 216.82726f, 42.102833f, 213.92f, 45.38f),
                    PathNode.LineTo(175.18f, 88.0f),
                    PathNode.LineTo(216.0f, 88.0f),
                    PathNode.CurveTo(220.41827f, 88.0f, 224.0f, 91.58172f, 224.0f, 96.0f),
                    PathNode.CurveTo(224.0f, 100.41828f, 220.41827f, 104.0f, 216.0f, 104.0f),
                    PathNode.LineTo(160.63f, 104.0f),
                    PathNode.LineTo(117.0f, 152.0f),
                    PathNode.LineTo(216.0f, 152.0f),
                    PathNode.CurveTo(220.41827f, 152.0f, 224.0f, 155.58173f, 224.0f, 160.0f),
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
        return _notEquals!!
    }

private var _notEquals: ImageVector? = null
