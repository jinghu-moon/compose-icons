package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Elevator: ImageVector
    get() {
        if (_elevator != null) return _elevator!!
        _elevator = phosphorRegularIcon(
            name = "Elevator",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 112.0f),
                    PathNode.LineTo(176.0f, 208.0f),
                    PathNode.LineTo(136.0f, 208.0f),
                    PathNode.LineTo(136.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 208.0f),
                    PathNode.LineTo(80.0f, 208.0f),
                    PathNode.LineTo(80.0f, 112.0f),
                    PathNode.LineTo(120.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.LineTo(192.0f, 208.0f),
                    PathNode.LineTo(192.0f, 104.0f),
                    PathNode.CurveTo(192.0f, 99.58172f, 188.41827f, 96.0f, 184.0f, 96.0f),
                    PathNode.LineTo(72.0f, 96.0f),
                    PathNode.CurveTo(67.58172f, 96.0f, 64.0f, 99.58172f, 64.0f, 104.0f),
                    PathNode.LineTo(64.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 72.0f),
                    PathNode.CurveTo(152.0f, 76.41828f, 148.41827f, 80.0f, 144.0f, 80.0f),
                    PathNode.LineTo(112.0f, 80.0f),
                    PathNode.CurveTo(107.58172f, 80.0f, 104.0f, 76.41828f, 104.0f, 72.0f),
                    PathNode.CurveTo(104.0f, 67.58172f, 107.58172f, 64.0f, 112.0f, 64.0f),
                    PathNode.LineTo(144.0f, 64.0f),
                    PathNode.CurveTo(148.41827f, 64.0f, 152.0f, 67.58172f, 152.0f, 72.0f),
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
        return _elevator!!
    }

private var _elevator: ImageVector? = null
