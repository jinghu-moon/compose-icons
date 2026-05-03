package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ListDashes: ImageVector
    get() {
        if (_listDashes != null) return _listDashes!!
        _listDashes = phosphorThinIcon(
            name = "ListDashes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(92.0f, 64.0f),
                    PathNode.CurveTo(92.0f, 61.79086f, 93.79086f, 60.0f, 96.0f, 60.0f),
                    PathNode.LineTo(216.0f, 60.0f),
                    PathNode.CurveTo(218.20914f, 60.0f, 220.0f, 61.79086f, 220.0f, 64.0f),
                    PathNode.CurveTo(220.0f, 66.20914f, 218.20914f, 68.0f, 216.0f, 68.0f),
                    PathNode.LineTo(96.0f, 68.0f),
                    PathNode.CurveTo(93.79086f, 68.0f, 92.0f, 66.20914f, 92.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 124.0f),
                    PathNode.LineTo(96.0f, 124.0f),
                    PathNode.CurveTo(93.79086f, 124.0f, 92.0f, 125.79086f, 92.0f, 128.0f),
                    PathNode.CurveTo(92.0f, 130.20914f, 93.79086f, 132.0f, 96.0f, 132.0f),
                    PathNode.LineTo(216.0f, 132.0f),
                    PathNode.CurveTo(218.20914f, 132.0f, 220.0f, 130.20914f, 220.0f, 128.0f),
                    PathNode.CurveTo(220.0f, 125.79086f, 218.20914f, 124.0f, 216.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 188.0f),
                    PathNode.LineTo(96.0f, 188.0f),
                    PathNode.CurveTo(93.79086f, 188.0f, 92.0f, 189.79086f, 92.0f, 192.0f),
                    PathNode.CurveTo(92.0f, 194.20914f, 93.79086f, 196.0f, 96.0f, 196.0f),
                    PathNode.LineTo(216.0f, 196.0f),
                    PathNode.CurveTo(218.20914f, 196.0f, 220.0f, 194.20914f, 220.0f, 192.0f),
                    PathNode.CurveTo(220.0f, 189.79086f, 218.20914f, 188.0f, 216.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 60.0f),
                    PathNode.LineTo(40.0f, 60.0f),
                    PathNode.CurveTo(37.79086f, 60.0f, 36.0f, 61.79086f, 36.0f, 64.0f),
                    PathNode.CurveTo(36.0f, 66.20914f, 37.79086f, 68.0f, 40.0f, 68.0f),
                    PathNode.LineTo(56.0f, 68.0f),
                    PathNode.CurveTo(58.20914f, 68.0f, 60.0f, 66.20914f, 60.0f, 64.0f),
                    PathNode.CurveTo(60.0f, 61.79086f, 58.20914f, 60.0f, 56.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 124.0f),
                    PathNode.LineTo(40.0f, 124.0f),
                    PathNode.CurveTo(37.79086f, 124.0f, 36.0f, 125.79086f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 130.20914f, 37.79086f, 132.0f, 40.0f, 132.0f),
                    PathNode.LineTo(56.0f, 132.0f),
                    PathNode.CurveTo(58.20914f, 132.0f, 60.0f, 130.20914f, 60.0f, 128.0f),
                    PathNode.CurveTo(60.0f, 125.79086f, 58.20914f, 124.0f, 56.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 188.0f),
                    PathNode.LineTo(40.0f, 188.0f),
                    PathNode.CurveTo(37.79086f, 188.0f, 36.0f, 189.79086f, 36.0f, 192.0f),
                    PathNode.CurveTo(36.0f, 194.20914f, 37.79086f, 196.0f, 40.0f, 196.0f),
                    PathNode.LineTo(56.0f, 196.0f),
                    PathNode.CurveTo(58.20914f, 196.0f, 60.0f, 194.20914f, 60.0f, 192.0f),
                    PathNode.CurveTo(60.0f, 189.79086f, 58.20914f, 188.0f, 56.0f, 188.0f),
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
        return _listDashes!!
    }

private var _listDashes: ImageVector? = null
