package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SquareHalf: ImageVector
    get() {
        if (_squareHalf != null) return _squareHalf!!
        _squareHalf = phosphorThinIcon(
            name = "SquareHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 44.0f),
                    PathNode.LineTo(56.0f, 44.0f),
                    PathNode.CurveTo(49.37258f, 44.0f, 44.0f, 49.37258f, 44.0f, 56.0f),
                    PathNode.LineTo(44.0f, 200.0f),
                    PathNode.CurveTo(44.0f, 206.62741f, 49.37258f, 212.0f, 56.0f, 212.0f),
                    PathNode.LineTo(200.0f, 212.0f),
                    PathNode.CurveTo(206.62741f, 212.0f, 212.0f, 206.62741f, 212.0f, 200.0f),
                    PathNode.LineTo(212.0f, 56.0f),
                    PathNode.CurveTo(212.0f, 49.37258f, 206.62741f, 44.0f, 200.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 116.0f),
                    PathNode.LineTo(204.0f, 116.0f),
                    PathNode.LineTo(204.0f, 140.0f),
                    PathNode.LineTo(132.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 108.0f),
                    PathNode.LineTo(132.0f, 84.0f),
                    PathNode.LineTo(204.0f, 84.0f),
                    PathNode.LineTo(204.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 148.0f),
                    PathNode.LineTo(204.0f, 148.0f),
                    PathNode.LineTo(204.0f, 172.0f),
                    PathNode.LineTo(132.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 56.0f),
                    PathNode.LineTo(204.0f, 76.0f),
                    PathNode.LineTo(132.0f, 76.0f),
                    PathNode.LineTo(132.0f, 52.0f),
                    PathNode.LineTo(200.0f, 52.0f),
                    PathNode.CurveTo(202.20914f, 52.0f, 204.0f, 53.79086f, 204.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 200.0f),
                    PathNode.LineTo(52.0f, 56.0f),
                    PathNode.CurveTo(52.0f, 53.79086f, 53.79086f, 52.0f, 56.0f, 52.0f),
                    PathNode.LineTo(124.0f, 52.0f),
                    PathNode.LineTo(124.0f, 204.0f),
                    PathNode.LineTo(56.0f, 204.0f),
                    PathNode.CurveTo(53.79086f, 204.0f, 52.0f, 202.20914f, 52.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 204.0f),
                    PathNode.LineTo(132.0f, 204.0f),
                    PathNode.LineTo(132.0f, 180.0f),
                    PathNode.LineTo(204.0f, 180.0f),
                    PathNode.LineTo(204.0f, 200.0f),
                    PathNode.CurveTo(204.0f, 202.20914f, 202.20914f, 204.0f, 200.0f, 204.0f),
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
        return _squareHalf!!
    }

private var _squareHalf: ImageVector? = null
