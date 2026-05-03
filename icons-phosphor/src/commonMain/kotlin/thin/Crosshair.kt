package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Crosshair: ImageVector
    get() {
        if (_crosshair != null) return _crosshair!!
        _crosshair = phosphorThinIcon(
            name = "Crosshair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 124.0f),
                    PathNode.LineTo(219.91f, 124.0f),
                    PathNode.CurveTo(217.77362f, 76.36161f, 179.63838f, 38.226383f, 132.0f, 36.09f),
                    PathNode.LineTo(132.0f, 24.0f),
                    PathNode.CurveTo(132.0f, 21.790861f, 130.20914f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(125.79086f, 20.0f, 124.0f, 21.790861f, 124.0f, 24.0f),
                    PathNode.LineTo(124.0f, 36.09f),
                    PathNode.CurveTo(76.36161f, 38.226383f, 38.226383f, 76.36161f, 36.09f, 124.0f),
                    PathNode.LineTo(24.0f, 124.0f),
                    PathNode.CurveTo(21.790861f, 124.0f, 20.0f, 125.79086f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 130.20914f, 21.790861f, 132.0f, 24.0f, 132.0f),
                    PathNode.LineTo(36.09f, 132.0f),
                    PathNode.CurveTo(38.226383f, 179.63838f, 76.36161f, 217.77362f, 124.0f, 219.91f),
                    PathNode.LineTo(124.0f, 232.0f),
                    PathNode.CurveTo(124.0f, 234.20914f, 125.79086f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(130.20914f, 236.0f, 132.0f, 234.20914f, 132.0f, 232.0f),
                    PathNode.LineTo(132.0f, 219.91f),
                    PathNode.CurveTo(179.63838f, 217.77362f, 217.77362f, 179.63838f, 219.91f, 132.0f),
                    PathNode.LineTo(232.0f, 132.0f),
                    PathNode.CurveTo(234.20914f, 132.0f, 236.0f, 130.20914f, 236.0f, 128.0f),
                    PathNode.CurveTo(236.0f, 125.79086f, 234.20914f, 124.0f, 232.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 211.9f),
                    PathNode.LineTo(132.0f, 200.0f),
                    PathNode.CurveTo(132.0f, 197.79086f, 130.20914f, 196.0f, 128.0f, 196.0f),
                    PathNode.CurveTo(125.79086f, 196.0f, 124.0f, 197.79086f, 124.0f, 200.0f),
                    PathNode.LineTo(124.0f, 211.9f),
                    PathNode.CurveTo(80.77849f, 209.7857f, 46.214294f, 175.2215f, 44.1f, 132.0f),
                    PathNode.LineTo(56.0f, 132.0f),
                    PathNode.CurveTo(58.20914f, 132.0f, 60.0f, 130.20914f, 60.0f, 128.0f),
                    PathNode.CurveTo(60.0f, 125.79086f, 58.20914f, 124.0f, 56.0f, 124.0f),
                    PathNode.LineTo(44.1f, 124.0f),
                    PathNode.CurveTo(46.214294f, 80.77849f, 80.77849f, 46.214294f, 124.0f, 44.1f),
                    PathNode.LineTo(124.0f, 56.0f),
                    PathNode.CurveTo(124.0f, 58.20914f, 125.79086f, 60.0f, 128.0f, 60.0f),
                    PathNode.CurveTo(130.20914f, 60.0f, 132.0f, 58.20914f, 132.0f, 56.0f),
                    PathNode.LineTo(132.0f, 44.1f),
                    PathNode.CurveTo(175.2215f, 46.214294f, 209.7857f, 80.77849f, 211.9f, 124.0f),
                    PathNode.LineTo(200.0f, 124.0f),
                    PathNode.CurveTo(197.79086f, 124.0f, 196.0f, 125.79086f, 196.0f, 128.0f),
                    PathNode.CurveTo(196.0f, 130.20914f, 197.79086f, 132.0f, 200.0f, 132.0f),
                    PathNode.LineTo(211.9f, 132.0f),
                    PathNode.CurveTo(209.7857f, 175.2215f, 175.2215f, 209.7857f, 132.0f, 211.9f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 92.0f),
                    PathNode.CurveTo(108.11775f, 92.0f, 92.0f, 108.11775f, 92.0f, 128.0f),
                    PathNode.CurveTo(92.0f, 147.88223f, 108.11775f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(147.88223f, 164.0f, 164.0f, 147.88223f, 164.0f, 128.0f),
                    PathNode.CurveTo(164.0f, 108.11775f, 147.88223f, 92.0f, 128.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 156.0f),
                    PathNode.CurveTo(112.536026f, 156.0f, 100.0f, 143.46397f, 100.0f, 128.0f),
                    PathNode.CurveTo(100.0f, 112.536026f, 112.536026f, 100.0f, 128.0f, 100.0f),
                    PathNode.CurveTo(143.46397f, 100.0f, 156.0f, 112.536026f, 156.0f, 128.0f),
                    PathNode.CurveTo(156.0f, 143.46397f, 143.46397f, 156.0f, 128.0f, 156.0f),
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
        return _crosshair!!
    }

private var _crosshair: ImageVector? = null
