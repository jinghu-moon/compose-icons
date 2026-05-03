package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CornersIn: ImageVector
    get() {
        if (_cornersIn != null) return _cornersIn!!
        _cornersIn = phosphorRegularIcon(
            name = "CornersIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 96.0f),
                    PathNode.LineTo(152.0f, 48.0f),
                    PathNode.CurveTo(152.0f, 43.581722f, 155.58173f, 40.0f, 160.0f, 40.0f),
                    PathNode.CurveTo(164.41827f, 40.0f, 168.0f, 43.581722f, 168.0f, 48.0f),
                    PathNode.LineTo(168.0f, 88.0f),
                    PathNode.LineTo(208.0f, 88.0f),
                    PathNode.CurveTo(212.41827f, 88.0f, 216.0f, 91.58172f, 216.0f, 96.0f),
                    PathNode.CurveTo(216.0f, 100.41828f, 212.41827f, 104.0f, 208.0f, 104.0f),
                    PathNode.LineTo(160.0f, 104.0f),
                    PathNode.CurveTo(155.58173f, 104.0f, 152.0f, 100.41828f, 152.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 152.0f),
                    PathNode.LineTo(48.0f, 152.0f),
                    PathNode.CurveTo(43.581722f, 152.0f, 40.0f, 155.58173f, 40.0f, 160.0f),
                    PathNode.CurveTo(40.0f, 164.41827f, 43.581722f, 168.0f, 48.0f, 168.0f),
                    PathNode.LineTo(88.0f, 168.0f),
                    PathNode.LineTo(88.0f, 208.0f),
                    PathNode.CurveTo(88.0f, 212.41827f, 91.58172f, 216.0f, 96.0f, 216.0f),
                    PathNode.CurveTo(100.41828f, 216.0f, 104.0f, 212.41827f, 104.0f, 208.0f),
                    PathNode.LineTo(104.0f, 160.0f),
                    PathNode.CurveTo(104.0f, 155.58173f, 100.41828f, 152.0f, 96.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 152.0f),
                    PathNode.LineTo(160.0f, 152.0f),
                    PathNode.CurveTo(155.58173f, 152.0f, 152.0f, 155.58173f, 152.0f, 160.0f),
                    PathNode.LineTo(152.0f, 208.0f),
                    PathNode.CurveTo(152.0f, 212.41827f, 155.58173f, 216.0f, 160.0f, 216.0f),
                    PathNode.CurveTo(164.41827f, 216.0f, 168.0f, 212.41827f, 168.0f, 208.0f),
                    PathNode.LineTo(168.0f, 168.0f),
                    PathNode.LineTo(208.0f, 168.0f),
                    PathNode.CurveTo(212.41827f, 168.0f, 216.0f, 164.41827f, 216.0f, 160.0f),
                    PathNode.CurveTo(216.0f, 155.58173f, 212.41827f, 152.0f, 208.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 40.0f),
                    PathNode.CurveTo(91.58172f, 40.0f, 88.0f, 43.581722f, 88.0f, 48.0f),
                    PathNode.LineTo(88.0f, 88.0f),
                    PathNode.LineTo(48.0f, 88.0f),
                    PathNode.CurveTo(43.581722f, 88.0f, 40.0f, 91.58172f, 40.0f, 96.0f),
                    PathNode.CurveTo(40.0f, 100.41828f, 43.581722f, 104.0f, 48.0f, 104.0f),
                    PathNode.LineTo(96.0f, 104.0f),
                    PathNode.CurveTo(100.41828f, 104.0f, 104.0f, 100.41828f, 104.0f, 96.0f),
                    PathNode.LineTo(104.0f, 48.0f),
                    PathNode.CurveTo(104.0f, 43.581722f, 100.41828f, 40.0f, 96.0f, 40.0f),
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
        return _cornersIn!!
    }

private var _cornersIn: ImageVector? = null
