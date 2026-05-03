package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ListBullets: ImageVector
    get() {
        if (_listBullets != null) return _listBullets!!
        _listBullets = phosphorThinIcon(
            name = "ListBullets",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(84.0f, 64.0f),
                    PathNode.CurveTo(84.0f, 61.79086f, 85.79086f, 60.0f, 88.0f, 60.0f),
                    PathNode.LineTo(216.0f, 60.0f),
                    PathNode.CurveTo(218.20914f, 60.0f, 220.0f, 61.79086f, 220.0f, 64.0f),
                    PathNode.CurveTo(220.0f, 66.20914f, 218.20914f, 68.0f, 216.0f, 68.0f),
                    PathNode.LineTo(88.0f, 68.0f),
                    PathNode.CurveTo(85.79086f, 68.0f, 84.0f, 66.20914f, 84.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 124.0f),
                    PathNode.LineTo(88.0f, 124.0f),
                    PathNode.CurveTo(85.79086f, 124.0f, 84.0f, 125.79086f, 84.0f, 128.0f),
                    PathNode.CurveTo(84.0f, 130.20914f, 85.79086f, 132.0f, 88.0f, 132.0f),
                    PathNode.LineTo(216.0f, 132.0f),
                    PathNode.CurveTo(218.20914f, 132.0f, 220.0f, 130.20914f, 220.0f, 128.0f),
                    PathNode.CurveTo(220.0f, 125.79086f, 218.20914f, 124.0f, 216.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 188.0f),
                    PathNode.LineTo(88.0f, 188.0f),
                    PathNode.CurveTo(85.79086f, 188.0f, 84.0f, 189.79086f, 84.0f, 192.0f),
                    PathNode.CurveTo(84.0f, 194.20914f, 85.79086f, 196.0f, 88.0f, 196.0f),
                    PathNode.LineTo(216.0f, 196.0f),
                    PathNode.CurveTo(218.20914f, 196.0f, 220.0f, 194.20914f, 220.0f, 192.0f),
                    PathNode.CurveTo(220.0f, 189.79086f, 218.20914f, 188.0f, 216.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 120.0f),
                    PathNode.CurveTo(39.581722f, 120.0f, 36.0f, 123.58172f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 132.41827f, 39.581722f, 136.0f, 44.0f, 136.0f),
                    PathNode.CurveTo(48.418278f, 136.0f, 52.0f, 132.41827f, 52.0f, 128.0f),
                    PathNode.CurveTo(52.0f, 123.58172f, 48.418278f, 120.0f, 44.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 56.0f),
                    PathNode.CurveTo(39.581722f, 56.0f, 36.0f, 59.581722f, 36.0f, 64.0f),
                    PathNode.CurveTo(36.0f, 68.41828f, 39.581722f, 72.0f, 44.0f, 72.0f),
                    PathNode.CurveTo(48.418278f, 72.0f, 52.0f, 68.41828f, 52.0f, 64.0f),
                    PathNode.CurveTo(52.0f, 59.581722f, 48.418278f, 56.0f, 44.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 184.0f),
                    PathNode.CurveTo(39.581722f, 184.0f, 36.0f, 187.58173f, 36.0f, 192.0f),
                    PathNode.CurveTo(36.0f, 196.41827f, 39.581722f, 200.0f, 44.0f, 200.0f),
                    PathNode.CurveTo(48.418278f, 200.0f, 52.0f, 196.41827f, 52.0f, 192.0f),
                    PathNode.CurveTo(52.0f, 187.58173f, 48.418278f, 184.0f, 44.0f, 184.0f),
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
        return _listBullets!!
    }

private var _listBullets: ImageVector? = null
