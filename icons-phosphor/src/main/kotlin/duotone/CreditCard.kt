package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CreditCard: ImageVector
    get() {
        if (_creditCard != null) return _creditCard!!
        _creditCard = phosphorDuotoneIcon(
            name = "CreditCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 96.0f),
                    PathNode.LineTo(232.0f, 192.0f),
                    PathNode.CurveTo(232.0f, 196.41827f, 228.41827f, 200.0f, 224.0f, 200.0f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.CurveTo(27.581722f, 200.0f, 24.0f, 196.41827f, 24.0f, 192.0f),
                    PathNode.LineTo(24.0f, 96.0f),
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
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(23.163445f, 48.0f, 16.0f, 55.163445f, 16.0f, 64.0f),
                    PathNode.LineTo(16.0f, 192.0f),
                    PathNode.CurveTo(16.0f, 200.83656f, 23.163445f, 208.0f, 32.0f, 208.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(232.83656f, 208.0f, 240.0f, 200.83656f, 240.0f, 192.0f),
                    PathNode.LineTo(240.0f, 64.0f),
                    PathNode.CurveTo(240.0f, 55.163445f, 232.83656f, 48.0f, 224.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 64.0f),
                    PathNode.LineTo(224.0f, 88.0f),
                    PathNode.LineTo(32.0f, 88.0f),
                    PathNode.LineTo(32.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 192.0f),
                    PathNode.LineTo(32.0f, 192.0f),
                    PathNode.LineTo(32.0f, 104.0f),
                    PathNode.LineTo(224.0f, 104.0f),
                    PathNode.LineTo(224.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 168.0f),
                    PathNode.CurveTo(208.0f, 172.41827f, 204.41827f, 176.0f, 200.0f, 176.0f),
                    PathNode.LineTo(168.0f, 176.0f),
                    PathNode.CurveTo(163.58173f, 176.0f, 160.0f, 172.41827f, 160.0f, 168.0f),
                    PathNode.CurveTo(160.0f, 163.58173f, 163.58173f, 160.0f, 168.0f, 160.0f),
                    PathNode.LineTo(200.0f, 160.0f),
                    PathNode.CurveTo(204.41827f, 160.0f, 208.0f, 163.58173f, 208.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 168.0f),
                    PathNode.CurveTo(144.0f, 172.41827f, 140.41827f, 176.0f, 136.0f, 176.0f),
                    PathNode.LineTo(120.0f, 176.0f),
                    PathNode.CurveTo(115.58172f, 176.0f, 112.0f, 172.41827f, 112.0f, 168.0f),
                    PathNode.CurveTo(112.0f, 163.58173f, 115.58172f, 160.0f, 120.0f, 160.0f),
                    PathNode.LineTo(136.0f, 160.0f),
                    PathNode.CurveTo(140.41827f, 160.0f, 144.0f, 163.58173f, 144.0f, 168.0f),
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
        return _creditCard!!
    }

private var _creditCard: ImageVector? = null
