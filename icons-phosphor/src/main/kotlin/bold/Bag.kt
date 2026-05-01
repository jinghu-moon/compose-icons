package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bag: ImageVector
    get() {
        if (_bag != null) return _bag!!
        _bag = phosphorBoldIcon(
            name = "Bag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 60.0f),
                    PathNode.LineTo(179.83f, 60.0f),
                    PathNode.CurveTo(177.6413f, 32.99884f, 155.08972f, 12.201322f, 128.0f, 12.201322f),
                    PathNode.CurveTo(100.91028f, 12.201322f, 78.3587f, 32.99884f, 76.17f, 60.0f),
                    PathNode.LineTo(40.0f, 60.0f),
                    PathNode.CurveTo(28.954306f, 60.0f, 20.0f, 68.95431f, 20.0f, 80.0f),
                    PathNode.LineTo(20.0f, 200.0f),
                    PathNode.CurveTo(20.0f, 211.0457f, 28.954306f, 220.0f, 40.0f, 220.0f),
                    PathNode.LineTo(216.0f, 220.0f),
                    PathNode.CurveTo(227.0457f, 220.0f, 236.0f, 211.0457f, 236.0f, 200.0f),
                    PathNode.LineTo(236.0f, 80.0f),
                    PathNode.CurveTo(236.0f, 68.95431f, 227.0457f, 60.0f, 216.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 36.0f),
                    PathNode.CurveTo(141.91772f, 36.0014f, 153.72176f, 46.22503f, 155.71f, 60.0f),
                    PathNode.LineTo(100.29f, 60.0f),
                    PathNode.CurveTo(102.27825f, 46.22503f, 114.08228f, 36.0014f, 128.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 196.0f),
                    PathNode.LineTo(44.0f, 196.0f),
                    PathNode.LineTo(44.0f, 84.0f),
                    PathNode.LineTo(76.0f, 84.0f),
                    PathNode.LineTo(76.0f, 96.0f),
                    PathNode.CurveTo(76.0f, 102.62742f, 81.37258f, 108.0f, 88.0f, 108.0f),
                    PathNode.CurveTo(94.62742f, 108.0f, 100.0f, 102.62742f, 100.0f, 96.0f),
                    PathNode.LineTo(100.0f, 84.0f),
                    PathNode.LineTo(156.0f, 84.0f),
                    PathNode.LineTo(156.0f, 96.0f),
                    PathNode.CurveTo(156.0f, 102.62742f, 161.37259f, 108.0f, 168.0f, 108.0f),
                    PathNode.CurveTo(174.62741f, 108.0f, 180.0f, 102.62742f, 180.0f, 96.0f),
                    PathNode.LineTo(180.0f, 84.0f),
                    PathNode.LineTo(212.0f, 84.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bag!!
    }

private var _bag: ImageVector? = null
