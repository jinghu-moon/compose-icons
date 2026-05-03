package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Barricade: ImageVector
    get() {
        if (_barricade != null) return _barricade!!
        _barricade = phosphorRegularIcon(
            name = "Barricade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 64.0f),
                    PathNode.LineTo(32.0f, 64.0f),
                    PathNode.CurveTo(23.163445f, 64.0f, 16.0f, 71.163445f, 16.0f, 80.0f),
                    PathNode.LineTo(16.0f, 152.0f),
                    PathNode.CurveTo(16.0f, 160.83656f, 23.163445f, 168.0f, 32.0f, 168.0f),
                    PathNode.LineTo(56.0f, 168.0f),
                    PathNode.LineTo(56.0f, 200.0f),
                    PathNode.CurveTo(56.0f, 204.41827f, 59.581722f, 208.0f, 64.0f, 208.0f),
                    PathNode.CurveTo(68.41828f, 208.0f, 72.0f, 204.41827f, 72.0f, 200.0f),
                    PathNode.LineTo(72.0f, 168.0f),
                    PathNode.LineTo(184.0f, 168.0f),
                    PathNode.LineTo(184.0f, 200.0f),
                    PathNode.CurveTo(184.0f, 204.41827f, 187.58173f, 208.0f, 192.0f, 208.0f),
                    PathNode.CurveTo(196.41827f, 208.0f, 200.0f, 204.41827f, 200.0f, 200.0f),
                    PathNode.LineTo(200.0f, 168.0f),
                    PathNode.LineTo(224.0f, 168.0f),
                    PathNode.CurveTo(232.83656f, 168.0f, 240.0f, 160.83656f, 240.0f, 152.0f),
                    PathNode.LineTo(240.0f, 80.0f),
                    PathNode.CurveTo(240.0f, 71.163445f, 232.83656f, 64.0f, 224.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 128.69f),
                    PathNode.LineTo(175.31f, 80.0f),
                    PathNode.LineTo(224.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.69f, 80.0f),
                    PathNode.LineTo(152.69f, 152.0f),
                    PathNode.LineTo(103.31f, 152.0f),
                    PathNode.LineTo(32.0f, 80.69f),
                    PathNode.LineTo(32.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 103.31f),
                    PathNode.LineTo(80.69f, 152.0f),
                    PathNode.LineTo(32.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 152.0f),
                    PathNode.LineTo(175.31f, 152.0f),
                    PathNode.LineTo(103.31f, 80.0f),
                    PathNode.LineTo(152.69f, 80.0f),
                    PathNode.LineTo(224.0f, 151.32f),
                    PathNode.LineTo(224.0f, 152.0f),
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
        return _barricade!!
    }

private var _barricade: ImageVector? = null
