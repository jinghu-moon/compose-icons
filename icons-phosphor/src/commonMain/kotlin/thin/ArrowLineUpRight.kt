package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowLineUpRight: ImageVector
    get() {
        if (_arrowLineUpRight != null) return _arrowLineUpRight!!
        _arrowLineUpRight = phosphorThinIcon(
            name = "ArrowLineUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 216.0f),
                    PathNode.CurveTo(220.0f, 218.20914f, 218.20914f, 220.0f, 216.0f, 220.0f),
                    PathNode.LineTo(40.0f, 220.0f),
                    PathNode.CurveTo(37.79086f, 220.0f, 36.0f, 218.20914f, 36.0f, 216.0f),
                    PathNode.CurveTo(36.0f, 213.79086f, 37.79086f, 212.0f, 40.0f, 212.0f),
                    PathNode.LineTo(216.0f, 212.0f),
                    PathNode.CurveTo(218.20914f, 212.0f, 220.0f, 213.79086f, 220.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 172.0f),
                    PathNode.CurveTo(81.06119f, 172.00084f, 82.07921f, 171.57996f, 82.83f, 170.83f),
                    PathNode.LineTo(188.0f, 65.66f),
                    PathNode.LineTo(188.0f, 152.0f),
                    PathNode.CurveTo(188.0f, 154.20914f, 189.79086f, 156.0f, 192.0f, 156.0f),
                    PathNode.CurveTo(194.20914f, 156.0f, 196.0f, 154.20914f, 196.0f, 152.0f),
                    PathNode.LineTo(196.0f, 56.0f),
                    PathNode.CurveTo(196.0f, 53.79086f, 194.20914f, 52.0f, 192.0f, 52.0f),
                    PathNode.LineTo(96.0f, 52.0f),
                    PathNode.CurveTo(93.79086f, 52.0f, 92.0f, 53.79086f, 92.0f, 56.0f),
                    PathNode.CurveTo(92.0f, 58.20914f, 93.79086f, 60.0f, 96.0f, 60.0f),
                    PathNode.LineTo(182.34f, 60.0f),
                    PathNode.LineTo(77.17f, 165.17f),
                    PathNode.CurveTo(76.02468f, 166.31404f, 75.68184f, 168.03563f, 76.30151f, 169.53116f),
                    PathNode.CurveTo(76.92118f, 171.02669f, 78.38118f, 172.00127f, 80.0f, 172.0f),
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
        return _arrowLineUpRight!!
    }

private var _arrowLineUpRight: ImageVector? = null
