package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WaveSquare: ImageVector
    get() {
        if (_waveSquare != null) return _waveSquare!!
        _waveSquare = phosphorThinIcon(
            name = "WaveSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 128.0f),
                    PathNode.LineTo(236.0f, 184.0f),
                    PathNode.CurveTo(236.0f, 186.20914f, 234.20914f, 188.0f, 232.0f, 188.0f),
                    PathNode.LineTo(128.0f, 188.0f),
                    PathNode.CurveTo(125.79086f, 188.0f, 124.0f, 186.20914f, 124.0f, 184.0f),
                    PathNode.LineTo(124.0f, 76.0f),
                    PathNode.LineTo(28.0f, 76.0f),
                    PathNode.LineTo(28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 130.20914f, 26.209139f, 132.0f, 24.0f, 132.0f),
                    PathNode.CurveTo(21.790861f, 132.0f, 20.0f, 130.20914f, 20.0f, 128.0f),
                    PathNode.LineTo(20.0f, 72.0f),
                    PathNode.CurveTo(20.0f, 69.79086f, 21.790861f, 68.0f, 24.0f, 68.0f),
                    PathNode.LineTo(128.0f, 68.0f),
                    PathNode.CurveTo(130.20914f, 68.0f, 132.0f, 69.79086f, 132.0f, 72.0f),
                    PathNode.LineTo(132.0f, 180.0f),
                    PathNode.LineTo(228.0f, 180.0f),
                    PathNode.LineTo(228.0f, 128.0f),
                    PathNode.CurveTo(228.0f, 125.79086f, 229.79086f, 124.0f, 232.0f, 124.0f),
                    PathNode.CurveTo(234.20914f, 124.0f, 236.0f, 125.79086f, 236.0f, 128.0f),
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
        return _waveSquare!!
    }

private var _waveSquare: ImageVector? = null
