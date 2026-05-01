package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.WarningOctagon: ImageVector
    get() {
        if (_warningOctagon != null) return _warningOctagon!!
        _warningOctagon = phosphorFillIcon(
            name = "WarningOctagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(227.31f, 80.23f),
                    PathNode.LineTo(175.77f, 28.69f),
                    PathNode.CurveTo(172.76047f, 25.698532f, 168.69334f, 24.013481f, 164.45f, 24.0f),
                    PathNode.LineTo(91.55f, 24.0f),
                    PathNode.CurveTo(87.306656f, 24.013481f, 83.23953f, 25.698532f, 80.23f, 28.69f),
                    PathNode.LineTo(28.69f, 80.23f),
                    PathNode.CurveTo(25.698532f, 83.23953f, 24.013481f, 87.306656f, 24.0f, 91.55f),
                    PathNode.LineTo(24.0f, 164.45f),
                    PathNode.CurveTo(24.013481f, 168.69334f, 25.698532f, 172.76047f, 28.69f, 175.77f),
                    PathNode.LineTo(80.23f, 227.31f),
                    PathNode.CurveTo(83.23953f, 230.30147f, 87.306656f, 231.98653f, 91.55f, 232.0f),
                    PathNode.LineTo(164.45f, 232.0f),
                    PathNode.CurveTo(168.69334f, 231.98653f, 172.76047f, 230.30147f, 175.77f, 227.31f),
                    PathNode.LineTo(227.31f, 175.77f),
                    PathNode.CurveTo(230.30147f, 172.76047f, 231.98653f, 168.69334f, 232.0f, 164.45f),
                    PathNode.LineTo(232.0f, 91.55f),
                    PathNode.CurveTo(231.98653f, 87.306656f, 230.30147f, 83.23953f, 227.31f, 80.23f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 80.0f),
                    PathNode.CurveTo(120.0f, 75.58172f, 123.58172f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(132.41827f, 72.0f, 136.0f, 75.58172f, 136.0f, 80.0f),
                    PathNode.LineTo(136.0f, 136.0f),
                    PathNode.CurveTo(136.0f, 140.41827f, 132.41827f, 144.0f, 128.0f, 144.0f),
                    PathNode.CurveTo(123.58172f, 144.0f, 120.0f, 140.41827f, 120.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 184.0f),
                    PathNode.CurveTo(121.37258f, 184.0f, 116.0f, 178.62741f, 116.0f, 172.0f),
                    PathNode.CurveTo(116.0f, 165.37259f, 121.37258f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(134.62741f, 160.0f, 140.0f, 165.37259f, 140.0f, 172.0f),
                    PathNode.CurveTo(140.0f, 178.62741f, 134.62741f, 184.0f, 128.0f, 184.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _warningOctagon!!
    }

private var _warningOctagon: ImageVector? = null
