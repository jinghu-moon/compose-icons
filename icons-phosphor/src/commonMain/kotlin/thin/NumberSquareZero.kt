package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberSquareZero: ImageVector
    get() {
        if (_numberSquareZero != null) return _numberSquareZero!!
        _numberSquareZero = phosphorThinIcon(
            name = "NumberSquareZero",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 76.0f),
                    PathNode.CurveTo(115.18f, 76.0f, 104.59f, 81.81f, 97.38f, 92.81f),
                    PathNode.CurveTo(91.33f, 102.0f, 88.0f, 114.52f, 88.0f, 128.0f),
                    PathNode.CurveTo(88.0f, 141.48f, 91.33f, 154.0f, 97.38f, 163.2f),
                    PathNode.CurveTo(104.59f, 174.2f, 115.18f, 180.0f, 128.0f, 180.0f),
                    PathNode.CurveTo(140.82f, 180.0f, 151.41f, 174.19f, 158.62f, 163.2f),
                    PathNode.CurveTo(164.62f, 153.98f, 168.0f, 141.48f, 168.0f, 128.0f),
                    PathNode.CurveTo(168.0f, 114.52f, 164.67f, 102.0f, 158.62f, 92.81f),
                    PathNode.CurveTo(151.41f, 81.81f, 140.82f, 76.0f, 128.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 172.0f),
                    PathNode.CurveTo(105.89f, 172.0f, 96.0f, 149.9f, 96.0f, 128.0f),
                    PathNode.CurveTo(96.0f, 106.1f, 105.89f, 84.0f, 128.0f, 84.0f),
                    PathNode.CurveTo(150.11f, 84.0f, 160.0f, 106.1f, 160.0f, 128.0f),
                    PathNode.CurveTo(160.0f, 149.9f, 150.11f, 172.0f, 128.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 36.0f),
                    PathNode.LineTo(48.0f, 36.0f),
                    PathNode.CurveTo(41.37258f, 36.0f, 36.0f, 41.37258f, 36.0f, 48.0f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 214.62741f, 41.37258f, 220.0f, 48.0f, 220.0f),
                    PathNode.LineTo(208.0f, 220.0f),
                    PathNode.CurveTo(214.62741f, 220.0f, 220.0f, 214.62741f, 220.0f, 208.0f),
                    PathNode.LineTo(220.0f, 48.0f),
                    PathNode.CurveTo(220.0f, 41.37258f, 214.62741f, 36.0f, 208.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 208.0f),
                    PathNode.CurveTo(212.0f, 210.20914f, 210.20914f, 212.0f, 208.0f, 212.0f),
                    PathNode.LineTo(48.0f, 212.0f),
                    PathNode.CurveTo(45.79086f, 212.0f, 44.0f, 210.20914f, 44.0f, 208.0f),
                    PathNode.LineTo(44.0f, 48.0f),
                    PathNode.CurveTo(44.0f, 45.79086f, 45.79086f, 44.0f, 48.0f, 44.0f),
                    PathNode.LineTo(208.0f, 44.0f),
                    PathNode.CurveTo(210.20914f, 44.0f, 212.0f, 45.79086f, 212.0f, 48.0f),
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
        return _numberSquareZero!!
    }

private var _numberSquareZero: ImageVector? = null
