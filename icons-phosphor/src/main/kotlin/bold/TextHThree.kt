package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextHThree: ImageVector
    get() {
        if (_textHThree != null) return _textHThree!!
        _textHThree = phosphorBoldIcon(
            name = "TextHThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(252.0f, 180.0f),
                    PathNode.CurveTo(252.00177f, 196.25323f, 242.16862f, 210.89162f, 227.12155f, 217.03596f),
                    PathNode.CurveTo(212.07446f, 223.18031f, 194.80548f, 219.60887f, 183.43f, 208.0f),
                    PathNode.CurveTo(180.31096f, 204.96175f, 179.08244f, 200.47232f, 180.21992f, 196.26929f),
                    PathNode.CurveTo(181.3574f, 192.06625f, 184.68239f, 188.80916f, 188.908f, 187.75862f),
                    PathNode.CurveTo(193.1336f, 186.70808f, 197.59674f, 188.02895f, 200.57f, 191.21f),
                    PathNode.CurveTo(205.65521f, 196.38887f, 213.58942f, 197.49602f, 219.89812f, 193.90704f),
                    PathNode.CurveTo(226.20679f, 190.31807f, 229.30936f, 182.93216f, 227.45612f, 175.91464f),
                    PathNode.CurveTo(225.60286f, 168.89711f, 219.2581f, 164.00613f, 212.0f, 164.0f),
                    PathNode.CurveTo(207.52617f, 163.9993f, 203.4242f, 161.50993f, 201.35812f, 157.54173f),
                    PathNode.CurveTo(199.29207f, 153.57355f, 199.605f, 148.7855f, 202.17f, 145.12f),
                    PathNode.LineTo(217.0f, 124.0f),
                    PathNode.LineTo(192.0f, 124.0f),
                    PathNode.CurveTo(185.37259f, 124.0f, 180.0f, 118.62742f, 180.0f, 112.0f),
                    PathNode.CurveTo(180.0f, 105.37258f, 185.37259f, 100.0f, 192.0f, 100.0f),
                    PathNode.LineTo(240.0f, 100.0f),
                    PathNode.CurveTo(244.47383f, 100.000694f, 248.5758f, 102.490074f, 250.64188f, 106.45827f),
                    PathNode.CurveTo(252.70793f, 110.42645f, 252.395f, 115.21449f, 249.83f, 118.88f),
                    PathNode.LineTo(231.49f, 145.08f),
                    PathNode.CurveTo(244.14932f, 152.14346f, 251.9962f, 165.50342f, 252.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 44.0f),
                    PathNode.CurveTo(137.37259f, 44.0f, 132.0f, 49.37258f, 132.0f, 56.0f),
                    PathNode.LineTo(132.0f, 104.0f),
                    PathNode.LineTo(52.0f, 104.0f),
                    PathNode.LineTo(52.0f, 56.0f),
                    PathNode.CurveTo(52.0f, 49.37258f, 46.62742f, 44.0f, 40.0f, 44.0f),
                    PathNode.CurveTo(33.37258f, 44.0f, 28.0f, 49.37258f, 28.0f, 56.0f),
                    PathNode.LineTo(28.0f, 176.0f),
                    PathNode.CurveTo(28.0f, 182.62741f, 33.37258f, 188.0f, 40.0f, 188.0f),
                    PathNode.CurveTo(46.62742f, 188.0f, 52.0f, 182.62741f, 52.0f, 176.0f),
                    PathNode.LineTo(52.0f, 128.0f),
                    PathNode.LineTo(132.0f, 128.0f),
                    PathNode.LineTo(132.0f, 176.0f),
                    PathNode.CurveTo(132.0f, 182.62741f, 137.37259f, 188.0f, 144.0f, 188.0f),
                    PathNode.CurveTo(150.62741f, 188.0f, 156.0f, 182.62741f, 156.0f, 176.0f),
                    PathNode.LineTo(156.0f, 56.0f),
                    PathNode.CurveTo(156.0f, 49.37258f, 150.62741f, 44.0f, 144.0f, 44.0f),
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
        return _textHThree!!
    }

private var _textHThree: ImageVector? = null
