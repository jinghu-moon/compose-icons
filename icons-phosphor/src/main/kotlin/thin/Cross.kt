package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Cross: ImageVector
    get() {
        if (_cross != null) return _cross!!
        _cross = phosphorThinIcon(
            name = "Cross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 76.0f),
                    PathNode.LineTo(156.0f, 76.0f),
                    PathNode.LineTo(156.0f, 32.0f),
                    PathNode.CurveTo(156.0f, 25.372583f, 150.62741f, 20.0f, 144.0f, 20.0f),
                    PathNode.LineTo(112.0f, 20.0f),
                    PathNode.CurveTo(105.37258f, 20.0f, 100.0f, 25.372583f, 100.0f, 32.0f),
                    PathNode.LineTo(100.0f, 76.0f),
                    PathNode.LineTo(56.0f, 76.0f),
                    PathNode.CurveTo(49.37258f, 76.0f, 44.0f, 81.37258f, 44.0f, 88.0f),
                    PathNode.LineTo(44.0f, 120.0f),
                    PathNode.CurveTo(44.0f, 126.62742f, 49.37258f, 132.0f, 56.0f, 132.0f),
                    PathNode.LineTo(100.0f, 132.0f),
                    PathNode.LineTo(100.0f, 224.0f),
                    PathNode.CurveTo(100.0f, 230.62741f, 105.37258f, 236.0f, 112.0f, 236.0f),
                    PathNode.LineTo(144.0f, 236.0f),
                    PathNode.CurveTo(150.62741f, 236.0f, 156.0f, 230.62741f, 156.0f, 224.0f),
                    PathNode.LineTo(156.0f, 132.0f),
                    PathNode.LineTo(200.0f, 132.0f),
                    PathNode.CurveTo(206.62741f, 132.0f, 212.0f, 126.62742f, 212.0f, 120.0f),
                    PathNode.LineTo(212.0f, 88.0f),
                    PathNode.CurveTo(212.0f, 81.37258f, 206.62741f, 76.0f, 200.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 120.0f),
                    PathNode.CurveTo(204.0f, 122.20914f, 202.20914f, 124.0f, 200.0f, 124.0f),
                    PathNode.LineTo(152.0f, 124.0f),
                    PathNode.CurveTo(149.79086f, 124.0f, 148.0f, 125.79086f, 148.0f, 128.0f),
                    PathNode.LineTo(148.0f, 224.0f),
                    PathNode.CurveTo(148.0f, 226.20914f, 146.20914f, 228.0f, 144.0f, 228.0f),
                    PathNode.LineTo(112.0f, 228.0f),
                    PathNode.CurveTo(109.79086f, 228.0f, 108.0f, 226.20914f, 108.0f, 224.0f),
                    PathNode.LineTo(108.0f, 128.0f),
                    PathNode.CurveTo(108.0f, 125.79086f, 106.20914f, 124.0f, 104.0f, 124.0f),
                    PathNode.LineTo(56.0f, 124.0f),
                    PathNode.CurveTo(53.79086f, 124.0f, 52.0f, 122.20914f, 52.0f, 120.0f),
                    PathNode.LineTo(52.0f, 88.0f),
                    PathNode.CurveTo(52.0f, 85.79086f, 53.79086f, 84.0f, 56.0f, 84.0f),
                    PathNode.LineTo(104.0f, 84.0f),
                    PathNode.CurveTo(106.20914f, 84.0f, 108.0f, 82.20914f, 108.0f, 80.0f),
                    PathNode.LineTo(108.0f, 32.0f),
                    PathNode.CurveTo(108.0f, 29.790861f, 109.79086f, 28.0f, 112.0f, 28.0f),
                    PathNode.LineTo(144.0f, 28.0f),
                    PathNode.CurveTo(146.20914f, 28.0f, 148.0f, 29.790861f, 148.0f, 32.0f),
                    PathNode.LineTo(148.0f, 80.0f),
                    PathNode.CurveTo(148.0f, 82.20914f, 149.79086f, 84.0f, 152.0f, 84.0f),
                    PathNode.LineTo(200.0f, 84.0f),
                    PathNode.CurveTo(202.20914f, 84.0f, 204.0f, 85.79086f, 204.0f, 88.0f),
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
        return _cross!!
    }

private var _cross: ImageVector? = null
