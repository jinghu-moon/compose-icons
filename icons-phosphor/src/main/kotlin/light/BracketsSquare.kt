package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BracketsSquare: ImageVector
    get() {
        if (_bracketsSquare != null) return _bracketsSquare!!
        _bracketsSquare = phosphorLightIcon(
            name = "BracketsSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(46.0f, 46.0f),
                    PathNode.LineTo(46.0f, 210.0f),
                    PathNode.LineTo(80.0f, 210.0f),
                    PathNode.CurveTo(83.313705f, 210.0f, 86.0f, 212.6863f, 86.0f, 216.0f),
                    PathNode.CurveTo(86.0f, 219.3137f, 83.313705f, 222.0f, 80.0f, 222.0f),
                    PathNode.LineTo(40.0f, 222.0f),
                    PathNode.CurveTo(36.68629f, 222.0f, 34.0f, 219.3137f, 34.0f, 216.0f),
                    PathNode.LineTo(34.0f, 40.0f),
                    PathNode.CurveTo(34.0f, 36.68629f, 36.68629f, 34.0f, 40.0f, 34.0f),
                    PathNode.LineTo(80.0f, 34.0f),
                    PathNode.CurveTo(83.313705f, 34.0f, 86.0f, 36.68629f, 86.0f, 40.0f),
                    PathNode.CurveTo(86.0f, 43.31371f, 83.313705f, 46.0f, 80.0f, 46.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 34.0f),
                    PathNode.LineTo(176.0f, 34.0f),
                    PathNode.CurveTo(172.6863f, 34.0f, 170.0f, 36.68629f, 170.0f, 40.0f),
                    PathNode.CurveTo(170.0f, 43.31371f, 172.6863f, 46.0f, 176.0f, 46.0f),
                    PathNode.LineTo(210.0f, 46.0f),
                    PathNode.LineTo(210.0f, 210.0f),
                    PathNode.LineTo(176.0f, 210.0f),
                    PathNode.CurveTo(172.6863f, 210.0f, 170.0f, 212.6863f, 170.0f, 216.0f),
                    PathNode.CurveTo(170.0f, 219.3137f, 172.6863f, 222.0f, 176.0f, 222.0f),
                    PathNode.LineTo(216.0f, 222.0f),
                    PathNode.CurveTo(219.3137f, 222.0f, 222.0f, 219.3137f, 222.0f, 216.0f),
                    PathNode.LineTo(222.0f, 40.0f),
                    PathNode.CurveTo(222.0f, 36.68629f, 219.3137f, 34.0f, 216.0f, 34.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bracketsSquare!!
    }

private var _bracketsSquare: ImageVector? = null
