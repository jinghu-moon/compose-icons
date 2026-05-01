package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.RectangleDashed: ImageVector
    get() {
        if (_rectangleDashed != null) return _rectangleDashed!!
        _rectangleDashed = phosphorThinIcon(
            name = "RectangleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(76.0f, 48.0f),
                    PathNode.CurveTo(76.0f, 50.20914f, 74.20914f, 52.0f, 72.0f, 52.0f),
                    PathNode.LineTo(40.0f, 52.0f),
                    PathNode.CurveTo(37.79086f, 52.0f, 36.0f, 53.79086f, 36.0f, 56.0f),
                    PathNode.LineTo(36.0f, 72.0f),
                    PathNode.CurveTo(36.0f, 74.20914f, 34.20914f, 76.0f, 32.0f, 76.0f),
                    PathNode.CurveTo(29.790861f, 76.0f, 28.0f, 74.20914f, 28.0f, 72.0f),
                    PathNode.LineTo(28.0f, 56.0f),
                    PathNode.CurveTo(28.0f, 49.37258f, 33.37258f, 44.0f, 40.0f, 44.0f),
                    PathNode.LineTo(72.0f, 44.0f),
                    PathNode.CurveTo(74.20914f, 44.0f, 76.0f, 45.79086f, 76.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 148.0f),
                    PathNode.CurveTo(34.20914f, 148.0f, 36.0f, 146.20914f, 36.0f, 144.0f),
                    PathNode.LineTo(36.0f, 112.0f),
                    PathNode.CurveTo(36.0f, 109.79086f, 34.20914f, 108.0f, 32.0f, 108.0f),
                    PathNode.CurveTo(29.790861f, 108.0f, 28.0f, 109.79086f, 28.0f, 112.0f),
                    PathNode.LineTo(28.0f, 144.0f),
                    PathNode.CurveTo(28.0f, 146.20914f, 29.790861f, 148.0f, 32.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 204.0f),
                    PathNode.LineTo(40.0f, 204.0f),
                    PathNode.CurveTo(37.79086f, 204.0f, 36.0f, 202.20914f, 36.0f, 200.0f),
                    PathNode.LineTo(36.0f, 184.0f),
                    PathNode.CurveTo(36.0f, 181.79086f, 34.20914f, 180.0f, 32.0f, 180.0f),
                    PathNode.CurveTo(29.790861f, 180.0f, 28.0f, 181.79086f, 28.0f, 184.0f),
                    PathNode.LineTo(28.0f, 200.0f),
                    PathNode.CurveTo(28.0f, 206.62741f, 33.37258f, 212.0f, 40.0f, 212.0f),
                    PathNode.LineTo(72.0f, 212.0f),
                    PathNode.CurveTo(74.20914f, 212.0f, 76.0f, 210.20914f, 76.0f, 208.0f),
                    PathNode.CurveTo(76.0f, 205.79086f, 74.20914f, 204.0f, 72.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 204.0f),
                    PathNode.LineTo(112.0f, 204.0f),
                    PathNode.CurveTo(109.79086f, 204.0f, 108.0f, 205.79086f, 108.0f, 208.0f),
                    PathNode.CurveTo(108.0f, 210.20914f, 109.79086f, 212.0f, 112.0f, 212.0f),
                    PathNode.LineTo(144.0f, 212.0f),
                    PathNode.CurveTo(146.20914f, 212.0f, 148.0f, 210.20914f, 148.0f, 208.0f),
                    PathNode.CurveTo(148.0f, 205.79086f, 146.20914f, 204.0f, 144.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 180.0f),
                    PathNode.CurveTo(221.79086f, 180.0f, 220.0f, 181.79086f, 220.0f, 184.0f),
                    PathNode.LineTo(220.0f, 200.0f),
                    PathNode.CurveTo(220.0f, 202.20914f, 218.20914f, 204.0f, 216.0f, 204.0f),
                    PathNode.LineTo(184.0f, 204.0f),
                    PathNode.CurveTo(181.79086f, 204.0f, 180.0f, 205.79086f, 180.0f, 208.0f),
                    PathNode.CurveTo(180.0f, 210.20914f, 181.79086f, 212.0f, 184.0f, 212.0f),
                    PathNode.LineTo(216.0f, 212.0f),
                    PathNode.CurveTo(222.62741f, 212.0f, 228.0f, 206.62741f, 228.0f, 200.0f),
                    PathNode.LineTo(228.0f, 184.0f),
                    PathNode.CurveTo(228.0f, 181.79086f, 226.20914f, 180.0f, 224.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 108.0f),
                    PathNode.CurveTo(221.79086f, 108.0f, 220.0f, 109.79086f, 220.0f, 112.0f),
                    PathNode.LineTo(220.0f, 144.0f),
                    PathNode.CurveTo(220.0f, 146.20914f, 221.79086f, 148.0f, 224.0f, 148.0f),
                    PathNode.CurveTo(226.20914f, 148.0f, 228.0f, 146.20914f, 228.0f, 144.0f),
                    PathNode.LineTo(228.0f, 112.0f),
                    PathNode.CurveTo(228.0f, 109.79086f, 226.20914f, 108.0f, 224.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 44.0f),
                    PathNode.LineTo(184.0f, 44.0f),
                    PathNode.CurveTo(181.79086f, 44.0f, 180.0f, 45.79086f, 180.0f, 48.0f),
                    PathNode.CurveTo(180.0f, 50.20914f, 181.79086f, 52.0f, 184.0f, 52.0f),
                    PathNode.LineTo(216.0f, 52.0f),
                    PathNode.CurveTo(218.20914f, 52.0f, 220.0f, 53.79086f, 220.0f, 56.0f),
                    PathNode.LineTo(220.0f, 72.0f),
                    PathNode.CurveTo(220.0f, 74.20914f, 221.79086f, 76.0f, 224.0f, 76.0f),
                    PathNode.CurveTo(226.20914f, 76.0f, 228.0f, 74.20914f, 228.0f, 72.0f),
                    PathNode.LineTo(228.0f, 56.0f),
                    PathNode.CurveTo(228.0f, 49.37258f, 222.62741f, 44.0f, 216.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 44.0f),
                    PathNode.LineTo(112.0f, 44.0f),
                    PathNode.CurveTo(109.79086f, 44.0f, 108.0f, 45.79086f, 108.0f, 48.0f),
                    PathNode.CurveTo(108.0f, 50.20914f, 109.79086f, 52.0f, 112.0f, 52.0f),
                    PathNode.LineTo(144.0f, 52.0f),
                    PathNode.CurveTo(146.20914f, 52.0f, 148.0f, 50.20914f, 148.0f, 48.0f),
                    PathNode.CurveTo(148.0f, 45.79086f, 146.20914f, 44.0f, 144.0f, 44.0f),
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
        return _rectangleDashed!!
    }

private var _rectangleDashed: ImageVector? = null
