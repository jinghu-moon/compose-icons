package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TreeView: ImageVector
    get() {
        if (_treeView != null) return _treeView!!
        _treeView = phosphorDuotoneIcon(
            name = "TreeView",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(104.0f, 32.0f),
                    PathNode.LineTo(104.0f, 64.0f),
                    PathNode.CurveTo(104.0f, 68.41828f, 100.41828f, 72.0f, 96.0f, 72.0f),
                    PathNode.LineTo(64.0f, 72.0f),
                    PathNode.CurveTo(59.581722f, 72.0f, 56.0f, 68.41828f, 56.0f, 64.0f),
                    PathNode.LineTo(56.0f, 32.0f),
                    PathNode.CurveTo(56.0f, 27.581722f, 59.581722f, 24.0f, 64.0f, 24.0f),
                    PathNode.LineTo(96.0f, 24.0f),
                    PathNode.CurveTo(100.41828f, 24.0f, 104.0f, 27.581722f, 104.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 96.0f),
                    PathNode.LineTo(176.0f, 96.0f),
                    PathNode.CurveTo(171.58173f, 96.0f, 168.0f, 99.58172f, 168.0f, 104.0f),
                    PathNode.LineTo(168.0f, 136.0f),
                    PathNode.CurveTo(168.0f, 140.41827f, 171.58173f, 144.0f, 176.0f, 144.0f),
                    PathNode.LineTo(208.0f, 144.0f),
                    PathNode.CurveTo(212.41827f, 144.0f, 216.0f, 140.41827f, 216.0f, 136.0f),
                    PathNode.LineTo(216.0f, 104.0f),
                    PathNode.CurveTo(216.0f, 99.58172f, 212.41827f, 96.0f, 208.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 184.0f),
                    PathNode.LineTo(176.0f, 184.0f),
                    PathNode.CurveTo(171.58173f, 184.0f, 168.0f, 187.58173f, 168.0f, 192.0f),
                    PathNode.LineTo(168.0f, 224.0f),
                    PathNode.CurveTo(168.0f, 228.41827f, 171.58173f, 232.0f, 176.0f, 232.0f),
                    PathNode.LineTo(208.0f, 232.0f),
                    PathNode.CurveTo(212.41827f, 232.0f, 216.0f, 228.41827f, 216.0f, 224.0f),
                    PathNode.LineTo(216.0f, 192.0f),
                    PathNode.CurveTo(216.0f, 187.58173f, 212.41827f, 184.0f, 208.0f, 184.0f),
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
                    PathNode.MoveTo(176.0f, 152.0f),
                    PathNode.LineTo(208.0f, 152.0f),
                    PathNode.CurveTo(216.83656f, 152.0f, 224.0f, 144.83656f, 224.0f, 136.0f),
                    PathNode.LineTo(224.0f, 104.0f),
                    PathNode.CurveTo(224.0f, 95.163445f, 216.83656f, 88.0f, 208.0f, 88.0f),
                    PathNode.LineTo(176.0f, 88.0f),
                    PathNode.CurveTo(167.16344f, 88.0f, 160.0f, 95.163445f, 160.0f, 104.0f),
                    PathNode.LineTo(160.0f, 112.0f),
                    PathNode.LineTo(88.0f, 112.0f),
                    PathNode.LineTo(88.0f, 80.0f),
                    PathNode.LineTo(96.0f, 80.0f),
                    PathNode.CurveTo(104.836555f, 80.0f, 112.0f, 72.836555f, 112.0f, 64.0f),
                    PathNode.LineTo(112.0f, 32.0f),
                    PathNode.CurveTo(112.0f, 23.163445f, 104.836555f, 16.0f, 96.0f, 16.0f),
                    PathNode.LineTo(64.0f, 16.0f),
                    PathNode.CurveTo(55.163445f, 16.0f, 48.0f, 23.163445f, 48.0f, 32.0f),
                    PathNode.LineTo(48.0f, 64.0f),
                    PathNode.CurveTo(48.0f, 72.836555f, 55.163445f, 80.0f, 64.0f, 80.0f),
                    PathNode.LineTo(72.0f, 80.0f),
                    PathNode.LineTo(72.0f, 192.0f),
                    PathNode.CurveTo(72.0f, 205.25484f, 82.74516f, 216.0f, 96.0f, 216.0f),
                    PathNode.LineTo(160.0f, 216.0f),
                    PathNode.LineTo(160.0f, 224.0f),
                    PathNode.CurveTo(160.0f, 232.83656f, 167.16344f, 240.0f, 176.0f, 240.0f),
                    PathNode.LineTo(208.0f, 240.0f),
                    PathNode.CurveTo(216.83656f, 240.0f, 224.0f, 232.83656f, 224.0f, 224.0f),
                    PathNode.LineTo(224.0f, 192.0f),
                    PathNode.CurveTo(224.0f, 183.16344f, 216.83656f, 176.0f, 208.0f, 176.0f),
                    PathNode.LineTo(176.0f, 176.0f),
                    PathNode.CurveTo(167.16344f, 176.0f, 160.0f, 183.16344f, 160.0f, 192.0f),
                    PathNode.LineTo(160.0f, 200.0f),
                    PathNode.LineTo(96.0f, 200.0f),
                    PathNode.CurveTo(91.58172f, 200.0f, 88.0f, 196.41827f, 88.0f, 192.0f),
                    PathNode.LineTo(88.0f, 128.0f),
                    PathNode.LineTo(160.0f, 128.0f),
                    PathNode.LineTo(160.0f, 136.0f),
                    PathNode.CurveTo(160.0f, 144.83656f, 167.16344f, 152.0f, 176.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 32.0f),
                    PathNode.LineTo(96.0f, 32.0f),
                    PathNode.LineTo(96.0f, 64.0f),
                    PathNode.LineTo(64.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 192.0f),
                    PathNode.LineTo(208.0f, 192.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.LineTo(176.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 104.0f),
                    PathNode.LineTo(208.0f, 104.0f),
                    PathNode.LineTo(208.0f, 136.0f),
                    PathNode.LineTo(176.0f, 136.0f),
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
        return _treeView!!
    }

private var _treeView: ImageVector? = null
