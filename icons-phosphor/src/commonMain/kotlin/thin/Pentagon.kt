package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Pentagon: ImageVector
    get() {
        if (_pentagon != null) return _pentagon!!
        _pentagon = phosphorThinIcon(
            name = "Pentagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(223.14f, 90.74f),
                    PathNode.LineTo(135.19f, 22.4f),
                    PathNode.LineTo(135.1f, 22.33f),
                    PathNode.CurveTo(130.87668f, 19.233814f, 125.13332f, 19.233814f, 120.91f, 22.33f),
                    PathNode.LineTo(120.82f, 22.4f),
                    PathNode.LineTo(32.87f, 90.74f),
                    PathNode.CurveTo(28.753176f, 93.78901f, 27.025957f, 99.115265f, 28.57f, 104.0f),
                    PathNode.LineTo(60.57f, 211.7f),
                    PathNode.CurveTo(62.17558f, 216.6536f, 66.7927f, 220.00636f, 72.0f, 220.0f),
                    PathNode.LineTo(184.0f, 220.0f),
                    PathNode.CurveTo(189.24063f, 219.99545f, 193.87218f, 216.59062f, 195.44f, 211.59f),
                    PathNode.LineTo(227.44f, 104.06f),
                    PathNode.CurveTo(229.01266f, 99.157295f, 227.28247f, 93.79773f, 223.14f, 90.74f),
                    PathNode.Close,
                    PathNode.MoveTo(219.78f, 101.74f),
                    PathNode.LineTo(187.78f, 209.28f),
                    PathNode.CurveTo(187.23207f, 210.90228f, 185.71231f, 211.99586f, 184.0f, 212.0f),
                    PathNode.LineTo(72.0f, 212.0f),
                    PathNode.CurveTo(70.2919f, 212.00452f, 68.7694f, 210.9239f, 68.21f, 209.31f),
                    PathNode.LineTo(36.21f, 101.61f),
                    PathNode.CurveTo(35.682407f, 99.971344f, 36.26243f, 98.17892f, 37.65f, 97.16f),
                    PathNode.LineTo(37.74f, 97.09f),
                    PathNode.LineTo(125.68f, 28.76f),
                    PathNode.CurveTo(127.07081f, 27.766533f, 128.9392f, 27.766533f, 130.33f, 28.76f),
                    PathNode.LineTo(218.27f, 97.09f),
                    PathNode.LineTo(218.36f, 97.16f),
                    PathNode.CurveTo(219.77509f, 98.195526f, 220.35075f, 100.03198f, 219.78f, 101.69f),
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
        return _pentagon!!
    }

private var _pentagon: ImageVector? = null
