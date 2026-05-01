package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ToiletPaper: ImageVector
    get() {
        if (_toiletPaper != null) return _toiletPaper!!
        _toiletPaper = phosphorThinIcon(
            name = "ToiletPaper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(72.0f, 120.0f),
                    PathNode.CurveTo(72.0f, 124.41828f, 68.41828f, 128.0f, 64.0f, 128.0f),
                    PathNode.CurveTo(59.581722f, 128.0f, 56.0f, 124.41828f, 56.0f, 120.0f),
                    PathNode.CurveTo(56.0f, 115.58172f, 59.581722f, 112.0f, 64.0f, 112.0f),
                    PathNode.CurveTo(68.41828f, 112.0f, 72.0f, 115.58172f, 72.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 120.0f),
                    PathNode.LineTo(236.0f, 208.0f),
                    PathNode.CurveTo(236.0f, 214.62741f, 230.62741f, 220.0f, 224.0f, 220.0f),
                    PathNode.LineTo(112.0f, 220.0f),
                    PathNode.CurveTo(105.37258f, 220.0f, 100.0f, 214.62741f, 100.0f, 208.0f),
                    PathNode.LineTo(100.0f, 168.86f),
                    PathNode.CurveTo(92.1f, 190.26f, 79.0f, 204.0f, 64.0f, 204.0f),
                    PathNode.CurveTo(39.33f, 204.0f, 20.0f, 167.1f, 20.0f, 120.0f),
                    PathNode.CurveTo(20.0f, 72.9f, 39.33f, 36.0f, 64.0f, 36.0f),
                    PathNode.LineTo(192.0f, 36.0f),
                    PathNode.CurveTo(216.67f, 36.0f, 236.0f, 72.9f, 236.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 120.0f),
                    PathNode.CurveTo(100.0f, 78.8f, 83.51f, 44.0f, 64.0f, 44.0f),
                    PathNode.CurveTo(44.49f, 44.0f, 28.0f, 78.8f, 28.0f, 120.0f),
                    PathNode.CurveTo(28.0f, 161.2f, 44.49f, 196.0f, 64.0f, 196.0f),
                    PathNode.CurveTo(83.51f, 196.0f, 100.0f, 161.2f, 100.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 208.0f),
                    PathNode.LineTo(228.0f, 124.0f),
                    PathNode.LineTo(208.0f, 124.0f),
                    PathNode.CurveTo(205.79086f, 124.0f, 204.0f, 122.20914f, 204.0f, 120.0f),
                    PathNode.CurveTo(204.0f, 117.79086f, 205.79086f, 116.0f, 208.0f, 116.0f),
                    PathNode.LineTo(228.0f, 116.0f),
                    PathNode.CurveTo(227.0f, 76.58f, 210.93f, 44.0f, 192.05f, 44.0f),
                    PathNode.LineTo(83.05f, 44.0f),
                    PathNode.CurveTo(97.34f, 56.8f, 107.19f, 83.76f, 107.95f, 116.0f),
                    PathNode.LineTo(127.95f, 116.0f),
                    PathNode.CurveTo(130.15913f, 116.0f, 131.95f, 117.79086f, 131.95f, 120.0f),
                    PathNode.CurveTo(131.95f, 122.20914f, 130.15913f, 124.0f, 127.95f, 124.0f),
                    PathNode.LineTo(108.0f, 124.0f),
                    PathNode.LineTo(108.0f, 208.0f),
                    PathNode.CurveTo(108.0f, 210.20914f, 109.79086f, 212.0f, 112.0f, 212.0f),
                    PathNode.LineTo(224.0f, 212.0f),
                    PathNode.CurveTo(226.20914f, 212.0f, 228.0f, 210.20914f, 228.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 116.0f),
                    PathNode.LineTo(160.0f, 116.0f),
                    PathNode.CurveTo(157.79086f, 116.0f, 156.0f, 117.79086f, 156.0f, 120.0f),
                    PathNode.CurveTo(156.0f, 122.20914f, 157.79086f, 124.0f, 160.0f, 124.0f),
                    PathNode.LineTo(176.0f, 124.0f),
                    PathNode.CurveTo(178.20914f, 124.0f, 180.0f, 122.20914f, 180.0f, 120.0f),
                    PathNode.CurveTo(180.0f, 117.79086f, 178.20914f, 116.0f, 176.0f, 116.0f),
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
        return _toiletPaper!!
    }

private var _toiletPaper: ImageVector? = null
