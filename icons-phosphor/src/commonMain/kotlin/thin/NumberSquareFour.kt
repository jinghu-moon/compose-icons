package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberSquareFour: ImageVector
    get() {
        if (_numberSquareFour != null) return _numberSquareFour!!
        _numberSquareFour = phosphorThinIcon(
            name = "NumberSquareFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
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
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 148.0f),
                    PathNode.LineTo(148.0f, 148.0f),
                    PathNode.LineTo(148.0f, 80.0f),
                    PathNode.CurveTo(148.00325f, 78.28902f, 146.91788f, 76.76543f, 145.29973f, 76.209465f),
                    PathNode.CurveTo(143.6816f, 75.65351f, 141.88902f, 76.18832f, 140.84f, 77.54f),
                    PathNode.LineTo(84.84f, 149.54f),
                    PathNode.CurveTo(83.89919f, 150.74626f, 83.72876f, 152.38347f, 84.400955f, 153.75764f),
                    PathNode.CurveTo(85.07315f, 155.1318f, 86.47024f, 156.00226f, 88.0f, 156.0f),
                    PathNode.LineTo(140.0f, 156.0f),
                    PathNode.LineTo(140.0f, 176.0f),
                    PathNode.CurveTo(140.0f, 178.20914f, 141.79086f, 180.0f, 144.0f, 180.0f),
                    PathNode.CurveTo(146.20914f, 180.0f, 148.0f, 178.20914f, 148.0f, 176.0f),
                    PathNode.LineTo(148.0f, 156.0f),
                    PathNode.LineTo(160.0f, 156.0f),
                    PathNode.CurveTo(162.20914f, 156.0f, 164.0f, 154.20914f, 164.0f, 152.0f),
                    PathNode.CurveTo(164.0f, 149.79086f, 162.20914f, 148.0f, 160.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 148.0f),
                    PathNode.LineTo(96.18f, 148.0f),
                    PathNode.LineTo(140.0f, 91.66f),
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
        return _numberSquareFour!!
    }

private var _numberSquareFour: ImageVector? = null
