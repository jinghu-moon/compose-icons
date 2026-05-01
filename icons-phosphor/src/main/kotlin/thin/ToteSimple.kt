package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ToteSimple: ImageVector
    get() {
        if (_toteSimple != null) return _toteSimple!!
        _toteSimple = phosphorThinIcon(
            name = "ToteSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(233.0f, 72.06f),
                    PathNode.CurveTo(230.69441f, 69.46881f, 227.38843f, 67.990585f, 223.92f, 68.0f),
                    PathNode.LineTo(172.0f, 68.0f),
                    PathNode.LineTo(172.0f, 64.0f),
                    PathNode.CurveTo(172.0f, 39.69947f, 152.30052f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(103.69947f, 20.0f, 84.0f, 39.69947f, 84.0f, 64.0f),
                    PathNode.LineTo(84.0f, 68.0f),
                    PathNode.LineTo(32.08f, 68.0f),
                    PathNode.CurveTo(28.611578f, 67.990585f, 25.305595f, 69.46881f, 23.0f, 72.06f),
                    PathNode.CurveTo(20.73384f, 74.616135f, 19.664497f, 78.01694f, 20.06f, 81.41f),
                    PathNode.LineTo(34.32f, 201.41f),
                    PathNode.CurveTo(35.038227f, 207.48149f, 40.206318f, 212.04231f, 46.32f, 212.0f),
                    PathNode.LineTo(209.67f, 212.0f),
                    PathNode.CurveTo(215.78368f, 212.04231f, 220.95177f, 207.48149f, 221.67f, 201.41f),
                    PathNode.LineTo(235.93f, 81.41f),
                    PathNode.CurveTo(236.3282f, 78.0184f, 235.26256f, 74.61779f, 233.0f, 72.06f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 64.0f),
                    PathNode.CurveTo(92.0f, 44.11775f, 108.11775f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(147.88223f, 28.0f, 164.0f, 44.11775f, 164.0f, 64.0f),
                    PathNode.LineTo(164.0f, 68.0f),
                    PathNode.LineTo(92.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 80.46f),
                    PathNode.LineTo(213.75f, 200.46f),
                    PathNode.CurveTo(213.5134f, 202.50706f, 211.76031f, 204.03938f, 209.7f, 204.0f),
                    PathNode.LineTo(46.33f, 204.0f),
                    PathNode.CurveTo(44.288704f, 204.01353f, 42.56471f, 202.48781f, 42.33f, 200.46f),
                    PathNode.LineTo(28.0f, 80.46f),
                    PathNode.CurveTo(27.868204f, 79.333595f, 28.233248f, 78.20562f, 29.0f, 77.37f),
                    PathNode.CurveTo(29.781202f, 76.49073f, 30.903856f, 75.99137f, 32.08f, 76.0f),
                    PathNode.LineTo(223.92f, 76.0f),
                    PathNode.CurveTo(225.09615f, 75.99137f, 226.2188f, 76.49073f, 227.0f, 77.37f),
                    PathNode.CurveTo(227.76675f, 78.20562f, 228.13179f, 79.333595f, 228.0f, 80.46f),
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
        return _toteSimple!!
    }

private var _toteSimple: ImageVector? = null
