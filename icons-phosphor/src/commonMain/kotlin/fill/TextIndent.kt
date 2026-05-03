package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextIndent: ImageVector
    get() {
        if (_textIndent != null) return _textIndent!!
        _textIndent = phosphorFillIcon(
            name = "TextIndent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 132.41827f, 220.41827f, 136.0f, 216.0f, 136.0f),
                    PathNode.LineTo(112.0f, 136.0f),
                    PathNode.CurveTo(107.58172f, 136.0f, 104.0f, 132.41827f, 104.0f, 128.0f),
                    PathNode.CurveTo(104.0f, 123.58172f, 107.58172f, 120.0f, 112.0f, 120.0f),
                    PathNode.LineTo(216.0f, 120.0f),
                    PathNode.CurveTo(220.41827f, 120.0f, 224.0f, 123.58172f, 224.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 72.0f),
                    PathNode.LineTo(216.0f, 72.0f),
                    PathNode.CurveTo(220.41827f, 72.0f, 224.0f, 68.41828f, 224.0f, 64.0f),
                    PathNode.CurveTo(224.0f, 59.581722f, 220.41827f, 56.0f, 216.0f, 56.0f),
                    PathNode.LineTo(112.0f, 56.0f),
                    PathNode.CurveTo(107.58172f, 56.0f, 104.0f, 59.581722f, 104.0f, 64.0f),
                    PathNode.CurveTo(104.0f, 68.41828f, 107.58172f, 72.0f, 112.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 184.0f),
                    PathNode.LineTo(40.0f, 184.0f),
                    PathNode.CurveTo(35.581722f, 184.0f, 32.0f, 187.58173f, 32.0f, 192.0f),
                    PathNode.CurveTo(32.0f, 196.41827f, 35.581722f, 200.0f, 40.0f, 200.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.CurveTo(220.41827f, 200.0f, 224.0f, 196.41827f, 224.0f, 192.0f),
                    PathNode.CurveTo(224.0f, 187.58173f, 220.41827f, 184.0f, 216.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.94f, 143.39f),
                    PathNode.CurveTo(39.929035f, 144.63007f, 43.37076f, 143.94725f, 45.66f, 141.66f),
                    PathNode.LineTo(85.66f, 101.66f),
                    PathNode.CurveTo(87.16222f, 100.159454f, 88.006294f, 98.123276f, 88.006294f, 96.0f),
                    PathNode.CurveTo(88.006294f, 93.876724f, 87.16222f, 91.840546f, 85.66f, 90.34f),
                    PathNode.LineTo(45.66f, 50.34f),
                    PathNode.CurveTo(43.371906f, 48.04936f, 39.928738f, 47.363674f, 36.93768f, 48.60302f),
                    PathNode.CurveTo(33.94662f, 49.84236f, 31.997452f, 52.76235f, 32.0f, 56.0f),
                    PathNode.LineTo(32.0f, 136.0f),
                    PathNode.CurveTo(32.000664f, 139.23566f, 33.95038f, 142.15236f, 36.94f, 143.39f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _textIndent!!
    }

private var _textIndent: ImageVector? = null
