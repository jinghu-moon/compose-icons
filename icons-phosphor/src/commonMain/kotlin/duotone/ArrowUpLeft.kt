package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowUpLeft: ImageVector
    get() {
        if (_arrowUpLeft != null) return _arrowUpLeft!!
        _arrowUpLeft = phosphorDuotoneIcon(
            name = "ArrowUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 64.0f),
                    PathNode.LineTo(64.0f, 168.0f),
                    PathNode.LineTo(64.0f, 64.0f),
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
                    PathNode.MoveTo(197.66f, 186.34f),
                    PathNode.LineTo(127.31f, 116.0f),
                    PathNode.LineTo(173.66f, 69.66f),
                    PathNode.CurveTo(175.95064f, 67.37191f, 176.63632f, 63.928738f, 175.39697f, 60.93768f),
                    PathNode.CurveTo(174.15764f, 57.94662f, 171.23764f, 55.99745f, 168.0f, 56.0f),
                    PathNode.LineTo(64.0f, 56.0f),
                    PathNode.CurveTo(59.581722f, 56.0f, 56.0f, 59.581722f, 56.0f, 64.0f),
                    PathNode.LineTo(56.0f, 168.0f),
                    PathNode.CurveTo(55.99745f, 171.23764f, 57.94662f, 174.15764f, 60.93768f, 175.39697f),
                    PathNode.CurveTo(63.928738f, 176.63632f, 67.37191f, 175.95064f, 69.66f, 173.66f),
                    PathNode.LineTo(116.0f, 127.31f),
                    PathNode.LineTo(186.34f, 197.66f),
                    PathNode.CurveTo(189.46593f, 200.78593f, 194.53407f, 200.78593f, 197.66f, 197.66f),
                    PathNode.CurveTo(200.78593f, 194.53407f, 200.78593f, 189.46593f, 197.66f, 186.34f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 72.0f),
                    PathNode.LineTo(148.69f, 72.0f),
                    PathNode.LineTo(110.35f, 110.34f),
                    PathNode.LineTo(110.35f, 110.34f),
                    PathNode.LineTo(72.0f, 148.69f),
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
        return _arrowUpLeft!!
    }

private var _arrowUpLeft: ImageVector? = null
