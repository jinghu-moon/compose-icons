package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Chair: ImageVector
    get() {
        if (_chair != null) return _chair!!
        _chair = phosphorDuotoneIcon(
            name = "Chair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(56.0f, 88.0f),
                    PathNode.LineTo(56.0f, 40.0f),
                    PathNode.CurveTo(56.0f, 35.581722f, 59.581722f, 32.0f, 64.0f, 32.0f),
                    PathNode.LineTo(192.0f, 32.0f),
                    PathNode.CurveTo(196.41827f, 32.0f, 200.0f, 35.581722f, 200.0f, 40.0f),
                    PathNode.LineTo(200.0f, 88.0f),
                    PathNode.CurveTo(200.0f, 92.41828f, 196.41827f, 96.0f, 192.0f, 96.0f),
                    PathNode.LineTo(64.0f, 96.0f),
                    PathNode.CurveTo(59.581722f, 96.0f, 56.0f, 92.41828f, 56.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 144.0f),
                    PathNode.LineTo(48.0f, 144.0f),
                    PathNode.CurveTo(43.581722f, 144.0f, 40.0f, 147.58173f, 40.0f, 152.0f),
                    PathNode.LineTo(40.0f, 168.0f),
                    PathNode.CurveTo(40.0f, 172.41827f, 43.581722f, 176.0f, 48.0f, 176.0f),
                    PathNode.LineTo(208.0f, 176.0f),
                    PathNode.CurveTo(212.41827f, 176.0f, 216.0f, 172.41827f, 216.0f, 168.0f),
                    PathNode.LineTo(216.0f, 152.0f),
                    PathNode.CurveTo(216.0f, 147.58173f, 212.41827f, 144.0f, 208.0f, 144.0f),
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
                    PathNode.MoveTo(208.0f, 136.0f),
                    PathNode.LineTo(176.0f, 136.0f),
                    PathNode.LineTo(176.0f, 104.0f),
                    PathNode.LineTo(192.0f, 104.0f),
                    PathNode.CurveTo(200.83656f, 104.0f, 208.0f, 96.836555f, 208.0f, 88.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(208.0f, 31.163445f, 200.83656f, 24.0f, 192.0f, 24.0f),
                    PathNode.LineTo(64.0f, 24.0f),
                    PathNode.CurveTo(55.163445f, 24.0f, 48.0f, 31.163445f, 48.0f, 40.0f),
                    PathNode.LineTo(48.0f, 88.0f),
                    PathNode.CurveTo(48.0f, 96.836555f, 55.163445f, 104.0f, 64.0f, 104.0f),
                    PathNode.LineTo(80.0f, 104.0f),
                    PathNode.LineTo(80.0f, 136.0f),
                    PathNode.LineTo(48.0f, 136.0f),
                    PathNode.CurveTo(39.163445f, 136.0f, 32.0f, 143.16344f, 32.0f, 152.0f),
                    PathNode.LineTo(32.0f, 168.0f),
                    PathNode.CurveTo(32.0f, 176.83656f, 39.163445f, 184.0f, 48.0f, 184.0f),
                    PathNode.LineTo(56.0f, 184.0f),
                    PathNode.LineTo(56.0f, 224.0f),
                    PathNode.CurveTo(56.0f, 228.41827f, 59.581722f, 232.0f, 64.0f, 232.0f),
                    PathNode.CurveTo(68.41828f, 232.0f, 72.0f, 228.41827f, 72.0f, 224.0f),
                    PathNode.LineTo(72.0f, 184.0f),
                    PathNode.LineTo(184.0f, 184.0f),
                    PathNode.LineTo(184.0f, 224.0f),
                    PathNode.CurveTo(184.0f, 228.41827f, 187.58173f, 232.0f, 192.0f, 232.0f),
                    PathNode.CurveTo(196.41827f, 232.0f, 200.0f, 228.41827f, 200.0f, 224.0f),
                    PathNode.LineTo(200.0f, 184.0f),
                    PathNode.LineTo(208.0f, 184.0f),
                    PathNode.CurveTo(216.83656f, 184.0f, 224.0f, 176.83656f, 224.0f, 168.0f),
                    PathNode.LineTo(224.0f, 152.0f),
                    PathNode.CurveTo(224.0f, 143.16344f, 216.83656f, 136.0f, 208.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 40.0f),
                    PathNode.LineTo(192.0f, 40.0f),
                    PathNode.LineTo(192.0f, 88.0f),
                    PathNode.LineTo(64.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 104.0f),
                    PathNode.LineTo(160.0f, 104.0f),
                    PathNode.LineTo(160.0f, 136.0f),
                    PathNode.LineTo(96.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 168.0f),
                    PathNode.LineTo(48.0f, 168.0f),
                    PathNode.LineTo(48.0f, 152.0f),
                    PathNode.LineTo(208.0f, 152.0f),
                    PathNode.LineTo(208.0f, 168.0f),
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
        return _chair!!
    }

private var _chair: ImageVector? = null
