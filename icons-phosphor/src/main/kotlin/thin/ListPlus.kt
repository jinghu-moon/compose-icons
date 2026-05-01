package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ListPlus: ImageVector
    get() {
        if (_listPlus != null) return _listPlus!!
        _listPlus = phosphorThinIcon(
            name = "ListPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(36.0f, 64.0f),
                    PathNode.CurveTo(36.0f, 61.79086f, 37.79086f, 60.0f, 40.0f, 60.0f),
                    PathNode.LineTo(216.0f, 60.0f),
                    PathNode.CurveTo(218.20914f, 60.0f, 220.0f, 61.79086f, 220.0f, 64.0f),
                    PathNode.CurveTo(220.0f, 66.20914f, 218.20914f, 68.0f, 216.0f, 68.0f),
                    PathNode.LineTo(40.0f, 68.0f),
                    PathNode.CurveTo(37.79086f, 68.0f, 36.0f, 66.20914f, 36.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 132.0f),
                    PathNode.LineTo(216.0f, 132.0f),
                    PathNode.CurveTo(218.20914f, 132.0f, 220.0f, 130.20914f, 220.0f, 128.0f),
                    PathNode.CurveTo(220.0f, 125.79086f, 218.20914f, 124.0f, 216.0f, 124.0f),
                    PathNode.LineTo(40.0f, 124.0f),
                    PathNode.CurveTo(37.79086f, 124.0f, 36.0f, 125.79086f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 130.20914f, 37.79086f, 132.0f, 40.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 188.0f),
                    PathNode.LineTo(40.0f, 188.0f),
                    PathNode.CurveTo(37.79086f, 188.0f, 36.0f, 189.79086f, 36.0f, 192.0f),
                    PathNode.CurveTo(36.0f, 194.20914f, 37.79086f, 196.0f, 40.0f, 196.0f),
                    PathNode.LineTo(144.0f, 196.0f),
                    PathNode.CurveTo(146.20914f, 196.0f, 148.0f, 194.20914f, 148.0f, 192.0f),
                    PathNode.CurveTo(148.0f, 189.79086f, 146.20914f, 188.0f, 144.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 188.0f),
                    PathNode.LineTo(212.0f, 188.0f),
                    PathNode.LineTo(212.0f, 168.0f),
                    PathNode.CurveTo(212.0f, 165.79086f, 210.20914f, 164.0f, 208.0f, 164.0f),
                    PathNode.CurveTo(205.79086f, 164.0f, 204.0f, 165.79086f, 204.0f, 168.0f),
                    PathNode.LineTo(204.0f, 188.0f),
                    PathNode.LineTo(184.0f, 188.0f),
                    PathNode.CurveTo(181.79086f, 188.0f, 180.0f, 189.79086f, 180.0f, 192.0f),
                    PathNode.CurveTo(180.0f, 194.20914f, 181.79086f, 196.0f, 184.0f, 196.0f),
                    PathNode.LineTo(204.0f, 196.0f),
                    PathNode.LineTo(204.0f, 216.0f),
                    PathNode.CurveTo(204.0f, 218.20914f, 205.79086f, 220.0f, 208.0f, 220.0f),
                    PathNode.CurveTo(210.20914f, 220.0f, 212.0f, 218.20914f, 212.0f, 216.0f),
                    PathNode.LineTo(212.0f, 196.0f),
                    PathNode.LineTo(232.0f, 196.0f),
                    PathNode.CurveTo(234.20914f, 196.0f, 236.0f, 194.20914f, 236.0f, 192.0f),
                    PathNode.CurveTo(236.0f, 189.79086f, 234.20914f, 188.0f, 232.0f, 188.0f),
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
        return _listPlus!!
    }

private var _listPlus: ImageVector? = null
