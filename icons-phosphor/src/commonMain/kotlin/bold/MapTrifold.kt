package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MapTrifold: ImageVector
    get() {
        if (_mapTrifold != null) return _mapTrifold!!
        _mapTrifold = phosphorBoldIcon(
            name = "MapTrifold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(231.38f, 46.54f),
                    PathNode.CurveTo(228.46815f, 44.26871f, 224.67271f, 43.464622f, 221.09f, 44.36f),
                    PathNode.LineTo(161.4f, 59.28f),
                    PathNode.LineTo(101.4f, 29.28f),
                    PathNode.CurveTo(98.8372f, 27.997734f, 95.90012f, 27.67494f, 93.12f, 28.37f),
                    PathNode.LineTo(29.12f, 44.37f),
                    PathNode.CurveTo(23.770147f, 45.692616f, 20.008854f, 50.489086f, 20.0f, 56.0f),
                    PathNode.LineTo(20.0f, 200.0f),
                    PathNode.CurveTo(20.000559f, 203.69484f, 21.703182f, 207.1834f, 24.615595f, 209.45708f),
                    PathNode.CurveTo(27.52801f, 211.73074f, 31.325459f, 212.536f, 34.91f, 211.64f),
                    PathNode.LineTo(94.6f, 196.72f),
                    PathNode.LineTo(154.6f, 226.72f),
                    PathNode.CurveTo(157.16281f, 228.00226f, 160.09988f, 228.32506f, 162.88f, 227.63f),
                    PathNode.LineTo(226.88f, 211.63f),
                    PathNode.CurveTo(232.22986f, 210.30739f, 235.99115f, 205.51091f, 236.0f, 200.0f),
                    PathNode.LineTo(236.0f, 56.0f),
                    PathNode.CurveTo(235.99928f, 52.30339f, 234.29488f, 48.813416f, 231.38f, 46.54f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 59.42f),
                    PathNode.LineTo(148.0f, 79.42f),
                    PathNode.LineTo(148.0f, 196.58f),
                    PathNode.LineTo(108.0f, 176.58f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 65.42f),
                    PathNode.LineTo(84.0f, 55.42f),
                    PathNode.LineTo(84.0f, 174.63f),
                    PathNode.LineTo(44.0f, 184.63f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 190.63f),
                    PathNode.LineTo(172.0f, 200.63f),
                    PathNode.LineTo(172.0f, 81.37f),
                    PathNode.LineTo(212.0f, 71.37f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _mapTrifold!!
    }

private var _mapTrifold: ImageVector? = null
