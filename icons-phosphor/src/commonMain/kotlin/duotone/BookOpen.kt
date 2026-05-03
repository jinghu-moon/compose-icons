package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BookOpen: ImageVector
    get() {
        if (_bookOpen != null) return _bookOpen!!
        _bookOpen = phosphorDuotoneIcon(
            name = "BookOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 56.0f),
                    PathNode.LineTo(232.0f, 200.0f),
                    PathNode.LineTo(160.0f, 200.0f),
                    PathNode.CurveTo(142.32689f, 200.0f, 128.0f, 214.32689f, 128.0f, 232.0f),
                    PathNode.CurveTo(128.0f, 214.32689f, 113.67311f, 200.0f, 96.0f, 200.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.LineTo(24.0f, 56.0f),
                    PathNode.LineTo(96.0f, 56.0f),
                    PathNode.CurveTo(113.67311f, 56.0f, 128.0f, 70.32689f, 128.0f, 88.0f),
                    PathNode.CurveTo(128.0f, 70.32689f, 142.32689f, 56.0f, 160.0f, 56.0f),
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
                    PathNode.MoveTo(232.0f, 48.0f),
                    PathNode.LineTo(160.0f, 48.0f),
                    PathNode.CurveTo(147.40971f, 48.0f, 135.55417f, 53.927765f, 128.0f, 64.0f),
                    PathNode.CurveTo(120.44582f, 53.927765f, 108.590294f, 48.0f, 96.0f, 48.0f),
                    PathNode.LineTo(24.0f, 48.0f),
                    PathNode.CurveTo(19.581722f, 48.0f, 16.0f, 51.581722f, 16.0f, 56.0f),
                    PathNode.LineTo(16.0f, 200.0f),
                    PathNode.CurveTo(16.0f, 204.41827f, 19.581722f, 208.0f, 24.0f, 208.0f),
                    PathNode.LineTo(96.0f, 208.0f),
                    PathNode.CurveTo(109.25484f, 208.0f, 120.0f, 218.74516f, 120.0f, 232.0f),
                    PathNode.CurveTo(120.0f, 236.41827f, 123.58172f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(132.41827f, 240.0f, 136.0f, 236.41827f, 136.0f, 232.0f),
                    PathNode.CurveTo(136.0f, 218.74516f, 146.74516f, 208.0f, 160.0f, 208.0f),
                    PathNode.LineTo(232.0f, 208.0f),
                    PathNode.CurveTo(236.41827f, 208.0f, 240.0f, 204.41827f, 240.0f, 200.0f),
                    PathNode.LineTo(240.0f, 56.0f),
                    PathNode.CurveTo(240.0f, 51.581722f, 236.41827f, 48.0f, 232.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 192.0f),
                    PathNode.LineTo(32.0f, 192.0f),
                    PathNode.LineTo(32.0f, 64.0f),
                    PathNode.LineTo(96.0f, 64.0f),
                    PathNode.CurveTo(109.25484f, 64.0f, 120.0f, 74.74516f, 120.0f, 88.0f),
                    PathNode.LineTo(120.0f, 200.0f),
                    PathNode.CurveTo(113.082634f, 194.79475f, 104.65703f, 191.98622f, 96.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 192.0f),
                    PathNode.LineTo(160.0f, 192.0f),
                    PathNode.CurveTo(151.34296f, 191.98622f, 142.91736f, 194.79475f, 136.0f, 200.0f),
                    PathNode.LineTo(136.0f, 88.0f),
                    PathNode.CurveTo(136.0f, 74.74516f, 146.74516f, 64.0f, 160.0f, 64.0f),
                    PathNode.LineTo(224.0f, 64.0f),
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
        return _bookOpen!!
    }

private var _bookOpen: ImageVector? = null
