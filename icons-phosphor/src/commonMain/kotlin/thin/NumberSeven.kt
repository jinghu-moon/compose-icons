package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberSeven: ImageVector
    get() {
        if (_numberSeven != null) return _numberSeven!!
        _numberSeven = phosphorThinIcon(
            name = "NumberSeven",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(171.83f, 49.15f),
                    PathNode.LineTo(123.83f, 209.15f),
                    PathNode.CurveTo(123.322334f, 210.84123f, 121.765785f, 211.9995f, 120.0f, 212.0f),
                    PathNode.CurveTo(119.61024f, 212.00233f, 119.22242f, 211.945f, 118.85f, 211.83f),
                    PathNode.CurveTo(117.8298f, 211.52498f, 116.97333f, 210.82579f, 116.47029f, 209.88728f),
                    PathNode.CurveTo(115.967255f, 208.94879f, 115.85918f, 207.84843f, 116.17f, 206.83f),
                    PathNode.LineTo(162.62f, 52.0f),
                    PathNode.LineTo(88.0f, 52.0f),
                    PathNode.CurveTo(85.79086f, 52.0f, 84.0f, 50.20914f, 84.0f, 48.0f),
                    PathNode.CurveTo(84.0f, 45.79086f, 85.79086f, 44.0f, 88.0f, 44.0f),
                    PathNode.LineTo(168.0f, 44.0f),
                    PathNode.CurveTo(169.26434f, 44.000355f, 170.45407f, 44.59845f, 171.20857f, 45.612984f),
                    PathNode.CurveTo(171.96307f, 46.627518f, 172.1935f, 47.93904f, 171.83f, 49.15f),
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
        return _numberSeven!!
    }

private var _numberSeven: ImageVector? = null
