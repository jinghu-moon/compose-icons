package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberZero: ImageVector
    get() {
        if (_numberZero != null) return _numberZero!!
        _numberZero = phosphorThinIcon(
            name = "NumberZero",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(179.87f, 65.35f),
                    PathNode.CurveTo(167.65f, 46.15f, 149.71f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(106.29f, 36.0f, 88.35f, 46.15f, 76.13f, 65.35f),
                    PathNode.CurveTo(65.73f, 81.69f, 60.0f, 103.94f, 60.0f, 128.0f),
                    PathNode.CurveTo(60.0f, 152.06f, 65.73f, 174.31f, 76.13f, 190.65f),
                    PathNode.CurveTo(88.35f, 209.85f, 106.29f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(149.71f, 220.0f, 167.65f, 209.85f, 179.87f, 190.65f),
                    PathNode.CurveTo(190.27f, 174.31f, 196.0f, 152.06f, 196.0f, 128.0f),
                    PathNode.CurveTo(196.0f, 103.94f, 190.27f, 81.69f, 179.87f, 65.35f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(86.55f, 212.0f, 68.0f, 169.81f, 68.0f, 128.0f),
                    PathNode.CurveTo(68.0f, 86.19f, 86.55f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(169.45f, 44.0f, 188.0f, 86.19f, 188.0f, 128.0f),
                    PathNode.CurveTo(188.0f, 169.81f, 169.45f, 212.0f, 128.0f, 212.0f),
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
        return _numberZero!!
    }

private var _numberZero: ImageVector? = null
