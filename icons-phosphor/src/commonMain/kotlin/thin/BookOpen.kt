package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BookOpen: ImageVector
    get() {
        if (_bookOpen != null) return _bookOpen!!
        _bookOpen = phosphorThinIcon(
            name = "BookOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 52.0f),
                    PathNode.LineTo(160.0f, 52.0f),
                    PathNode.CurveTo(146.51562f, 52.006252f, 134.16536f, 59.54763f, 128.0f, 71.54f),
                    PathNode.CurveTo(121.83464f, 59.54763f, 109.48438f, 52.006252f, 96.0f, 52.0f),
                    PathNode.LineTo(24.0f, 52.0f),
                    PathNode.CurveTo(21.790861f, 52.0f, 20.0f, 53.79086f, 20.0f, 56.0f),
                    PathNode.LineTo(20.0f, 200.0f),
                    PathNode.CurveTo(20.0f, 202.20914f, 21.790861f, 204.0f, 24.0f, 204.0f),
                    PathNode.LineTo(96.0f, 204.0f),
                    PathNode.CurveTo(111.463974f, 204.0f, 124.0f, 216.53603f, 124.0f, 232.0f),
                    PathNode.CurveTo(124.0f, 234.20914f, 125.79086f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(130.20914f, 236.0f, 132.0f, 234.20914f, 132.0f, 232.0f),
                    PathNode.CurveTo(132.0f, 216.53603f, 144.53603f, 204.0f, 160.0f, 204.0f),
                    PathNode.LineTo(232.0f, 204.0f),
                    PathNode.CurveTo(234.20914f, 204.0f, 236.0f, 202.20914f, 236.0f, 200.0f),
                    PathNode.LineTo(236.0f, 56.0f),
                    PathNode.CurveTo(236.0f, 53.79086f, 234.20914f, 52.0f, 232.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 196.0f),
                    PathNode.LineTo(28.0f, 196.0f),
                    PathNode.LineTo(28.0f, 60.0f),
                    PathNode.LineTo(96.0f, 60.0f),
                    PathNode.CurveTo(111.463974f, 60.0f, 124.0f, 72.536026f, 124.0f, 88.0f),
                    PathNode.LineTo(124.0f, 209.4f),
                    PathNode.CurveTo(117.17713f, 200.92406f, 106.88085f, 195.99657f, 96.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 196.0f),
                    PathNode.LineTo(160.0f, 196.0f),
                    PathNode.CurveTo(149.1178f, 196.00044f, 138.82182f, 200.93149f, 132.0f, 209.41f),
                    PathNode.LineTo(132.0f, 88.0f),
                    PathNode.CurveTo(132.0f, 72.536026f, 144.53603f, 60.0f, 160.0f, 60.0f),
                    PathNode.LineTo(228.0f, 60.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bookOpen!!
    }

private var _bookOpen: ImageVector? = null
