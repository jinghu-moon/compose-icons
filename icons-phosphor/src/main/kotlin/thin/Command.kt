package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Command: ImageVector
    get() {
        if (_command != null) return _command!!
        _command = phosphorThinIcon(
            name = "Command",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.0f, 148.0f),
                    PathNode.LineTo(156.0f, 148.0f),
                    PathNode.LineTo(156.0f, 108.0f),
                    PathNode.LineTo(180.0f, 108.0f),
                    PathNode.CurveTo(197.67311f, 108.0f, 212.0f, 93.67311f, 212.0f, 76.0f),
                    PathNode.CurveTo(212.0f, 58.32689f, 197.67311f, 44.0f, 180.0f, 44.0f),
                    PathNode.CurveTo(162.32689f, 44.0f, 148.0f, 58.32689f, 148.0f, 76.0f),
                    PathNode.LineTo(148.0f, 100.0f),
                    PathNode.LineTo(108.0f, 100.0f),
                    PathNode.LineTo(108.0f, 76.0f),
                    PathNode.CurveTo(108.0f, 58.32689f, 93.67311f, 44.0f, 76.0f, 44.0f),
                    PathNode.CurveTo(58.32689f, 44.0f, 44.0f, 58.32689f, 44.0f, 76.0f),
                    PathNode.CurveTo(44.0f, 93.67311f, 58.32689f, 108.0f, 76.0f, 108.0f),
                    PathNode.LineTo(100.0f, 108.0f),
                    PathNode.LineTo(100.0f, 148.0f),
                    PathNode.LineTo(76.0f, 148.0f),
                    PathNode.CurveTo(58.32689f, 148.0f, 44.0f, 162.32689f, 44.0f, 180.0f),
                    PathNode.CurveTo(44.0f, 197.67311f, 58.32689f, 212.0f, 76.0f, 212.0f),
                    PathNode.CurveTo(93.67311f, 212.0f, 108.0f, 197.67311f, 108.0f, 180.0f),
                    PathNode.LineTo(108.0f, 156.0f),
                    PathNode.LineTo(148.0f, 156.0f),
                    PathNode.LineTo(148.0f, 180.0f),
                    PathNode.CurveTo(148.0f, 197.67311f, 162.32689f, 212.0f, 180.0f, 212.0f),
                    PathNode.CurveTo(197.67311f, 212.0f, 212.0f, 197.67311f, 212.0f, 180.0f),
                    PathNode.CurveTo(212.0f, 162.32689f, 197.67311f, 148.0f, 180.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 76.0f),
                    PathNode.CurveTo(156.0f, 62.745167f, 166.74516f, 52.0f, 180.0f, 52.0f),
                    PathNode.CurveTo(193.25484f, 52.0f, 204.0f, 62.745167f, 204.0f, 76.0f),
                    PathNode.CurveTo(204.0f, 89.25484f, 193.25484f, 100.0f, 180.0f, 100.0f),
                    PathNode.LineTo(156.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 76.0f),
                    PathNode.CurveTo(52.0f, 62.745167f, 62.745167f, 52.0f, 76.0f, 52.0f),
                    PathNode.CurveTo(89.25484f, 52.0f, 100.0f, 62.745167f, 100.0f, 76.0f),
                    PathNode.LineTo(100.0f, 100.0f),
                    PathNode.LineTo(76.0f, 100.0f),
                    PathNode.CurveTo(62.745167f, 100.0f, 52.0f, 89.25484f, 52.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 180.0f),
                    PathNode.CurveTo(100.0f, 193.25484f, 89.25484f, 204.0f, 76.0f, 204.0f),
                    PathNode.CurveTo(62.745167f, 204.0f, 52.0f, 193.25484f, 52.0f, 180.0f),
                    PathNode.CurveTo(52.0f, 166.74516f, 62.745167f, 156.0f, 76.0f, 156.0f),
                    PathNode.LineTo(100.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 108.0f),
                    PathNode.LineTo(148.0f, 108.0f),
                    PathNode.LineTo(148.0f, 148.0f),
                    PathNode.LineTo(108.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 204.0f),
                    PathNode.CurveTo(166.74516f, 204.0f, 156.0f, 193.25484f, 156.0f, 180.0f),
                    PathNode.LineTo(156.0f, 156.0f),
                    PathNode.LineTo(180.0f, 156.0f),
                    PathNode.CurveTo(193.25484f, 156.0f, 204.0f, 166.74516f, 204.0f, 180.0f),
                    PathNode.CurveTo(204.0f, 193.25484f, 193.25484f, 204.0f, 180.0f, 204.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _command!!
    }

private var _command: ImageVector? = null
