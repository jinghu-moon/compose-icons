package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Dresser: ImageVector
    get() {
        if (_dresser != null) return _dresser!!
        _dresser = phosphorThinIcon(
            name = "Dresser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(140.0f, 192.0f),
                    PathNode.CurveTo(140.0f, 194.20914f, 138.20914f, 196.0f, 136.0f, 196.0f),
                    PathNode.LineTo(120.0f, 196.0f),
                    PathNode.CurveTo(117.79086f, 196.0f, 116.0f, 194.20914f, 116.0f, 192.0f),
                    PathNode.CurveTo(116.0f, 189.79086f, 117.79086f, 188.0f, 120.0f, 188.0f),
                    PathNode.LineTo(136.0f, 188.0f),
                    PathNode.CurveTo(138.20914f, 188.0f, 140.0f, 189.79086f, 140.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 68.0f),
                    PathNode.LineTo(136.0f, 68.0f),
                    PathNode.CurveTo(138.20914f, 68.0f, 140.0f, 66.20914f, 140.0f, 64.0f),
                    PathNode.CurveTo(140.0f, 61.79086f, 138.20914f, 60.0f, 136.0f, 60.0f),
                    PathNode.LineTo(120.0f, 60.0f),
                    PathNode.CurveTo(117.79086f, 60.0f, 116.0f, 61.79086f, 116.0f, 64.0f),
                    PathNode.CurveTo(116.0f, 66.20914f, 117.79086f, 68.0f, 120.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 124.0f),
                    PathNode.LineTo(120.0f, 124.0f),
                    PathNode.CurveTo(117.79086f, 124.0f, 116.0f, 125.79086f, 116.0f, 128.0f),
                    PathNode.CurveTo(116.0f, 130.20914f, 117.79086f, 132.0f, 120.0f, 132.0f),
                    PathNode.LineTo(136.0f, 132.0f),
                    PathNode.CurveTo(138.20914f, 132.0f, 140.0f, 130.20914f, 140.0f, 128.0f),
                    PathNode.CurveTo(140.0f, 125.79086f, 138.20914f, 124.0f, 136.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 40.0f),
                    PathNode.LineTo(212.0f, 216.0f),
                    PathNode.CurveTo(212.0f, 222.62741f, 206.62741f, 228.0f, 200.0f, 228.0f),
                    PathNode.LineTo(56.0f, 228.0f),
                    PathNode.CurveTo(49.37258f, 228.0f, 44.0f, 222.62741f, 44.0f, 216.0f),
                    PathNode.LineTo(44.0f, 40.0f),
                    PathNode.CurveTo(44.0f, 33.37258f, 49.37258f, 28.0f, 56.0f, 28.0f),
                    PathNode.LineTo(200.0f, 28.0f),
                    PathNode.CurveTo(206.62741f, 28.0f, 212.0f, 33.37258f, 212.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 156.0f),
                    PathNode.LineTo(204.0f, 156.0f),
                    PathNode.LineTo(204.0f, 100.0f),
                    PathNode.LineTo(52.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 40.0f),
                    PathNode.LineTo(52.0f, 92.0f),
                    PathNode.LineTo(204.0f, 92.0f),
                    PathNode.LineTo(204.0f, 40.0f),
                    PathNode.CurveTo(204.0f, 37.79086f, 202.20914f, 36.0f, 200.0f, 36.0f),
                    PathNode.LineTo(56.0f, 36.0f),
                    PathNode.CurveTo(53.79086f, 36.0f, 52.0f, 37.79086f, 52.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 216.0f),
                    PathNode.LineTo(204.0f, 164.0f),
                    PathNode.LineTo(52.0f, 164.0f),
                    PathNode.LineTo(52.0f, 216.0f),
                    PathNode.CurveTo(52.0f, 218.20914f, 53.79086f, 220.0f, 56.0f, 220.0f),
                    PathNode.LineTo(200.0f, 220.0f),
                    PathNode.CurveTo(202.20914f, 220.0f, 204.0f, 218.20914f, 204.0f, 216.0f),
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
        return _dresser!!
    }

private var _dresser: ImageVector? = null
