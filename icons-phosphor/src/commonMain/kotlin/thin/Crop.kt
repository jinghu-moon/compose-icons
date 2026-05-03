package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Crop: ImageVector
    get() {
        if (_crop != null) return _crop!!
        _crop = phosphorThinIcon(
            name = "Crop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 192.0f),
                    PathNode.CurveTo(236.0f, 194.20914f, 234.20914f, 196.0f, 232.0f, 196.0f),
                    PathNode.LineTo(196.0f, 196.0f),
                    PathNode.LineTo(196.0f, 232.0f),
                    PathNode.CurveTo(196.0f, 234.20914f, 194.20914f, 236.0f, 192.0f, 236.0f),
                    PathNode.CurveTo(189.79086f, 236.0f, 188.0f, 234.20914f, 188.0f, 232.0f),
                    PathNode.LineTo(188.0f, 196.0f),
                    PathNode.LineTo(64.0f, 196.0f),
                    PathNode.CurveTo(61.79086f, 196.0f, 60.0f, 194.20914f, 60.0f, 192.0f),
                    PathNode.LineTo(60.0f, 68.0f),
                    PathNode.LineTo(24.0f, 68.0f),
                    PathNode.CurveTo(21.790861f, 68.0f, 20.0f, 66.20914f, 20.0f, 64.0f),
                    PathNode.CurveTo(20.0f, 61.79086f, 21.790861f, 60.0f, 24.0f, 60.0f),
                    PathNode.LineTo(60.0f, 60.0f),
                    PathNode.LineTo(60.0f, 24.0f),
                    PathNode.CurveTo(60.0f, 21.790861f, 61.79086f, 20.0f, 64.0f, 20.0f),
                    PathNode.CurveTo(66.20914f, 20.0f, 68.0f, 21.790861f, 68.0f, 24.0f),
                    PathNode.LineTo(68.0f, 188.0f),
                    PathNode.LineTo(232.0f, 188.0f),
                    PathNode.CurveTo(234.20914f, 188.0f, 236.0f, 189.79086f, 236.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 68.0f),
                    PathNode.LineTo(188.0f, 68.0f),
                    PathNode.LineTo(188.0f, 160.0f),
                    PathNode.CurveTo(188.0f, 162.20914f, 189.79086f, 164.0f, 192.0f, 164.0f),
                    PathNode.CurveTo(194.20914f, 164.0f, 196.0f, 162.20914f, 196.0f, 160.0f),
                    PathNode.LineTo(196.0f, 64.0f),
                    PathNode.CurveTo(196.0f, 61.79086f, 194.20914f, 60.0f, 192.0f, 60.0f),
                    PathNode.LineTo(96.0f, 60.0f),
                    PathNode.CurveTo(93.79086f, 60.0f, 92.0f, 61.79086f, 92.0f, 64.0f),
                    PathNode.CurveTo(92.0f, 66.20914f, 93.79086f, 68.0f, 96.0f, 68.0f),
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
        return _crop!!
    }

private var _crop: ImageVector? = null
