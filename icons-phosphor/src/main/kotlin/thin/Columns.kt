package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Columns: ImageVector
    get() {
        if (_columns != null) return _columns!!
        _columns = phosphorThinIcon(
            name = "Columns",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(104.0f, 36.0f),
                    PathNode.LineTo(64.0f, 36.0f),
                    PathNode.CurveTo(57.37258f, 36.0f, 52.0f, 41.37258f, 52.0f, 48.0f),
                    PathNode.LineTo(52.0f, 208.0f),
                    PathNode.CurveTo(52.0f, 214.62741f, 57.37258f, 220.0f, 64.0f, 220.0f),
                    PathNode.LineTo(104.0f, 220.0f),
                    PathNode.CurveTo(110.62742f, 220.0f, 116.0f, 214.62741f, 116.0f, 208.0f),
                    PathNode.LineTo(116.0f, 48.0f),
                    PathNode.CurveTo(116.0f, 41.37258f, 110.62742f, 36.0f, 104.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 208.0f),
                    PathNode.CurveTo(108.0f, 210.20914f, 106.20914f, 212.0f, 104.0f, 212.0f),
                    PathNode.LineTo(64.0f, 212.0f),
                    PathNode.CurveTo(61.79086f, 212.0f, 60.0f, 210.20914f, 60.0f, 208.0f),
                    PathNode.LineTo(60.0f, 48.0f),
                    PathNode.CurveTo(60.0f, 45.79086f, 61.79086f, 44.0f, 64.0f, 44.0f),
                    PathNode.LineTo(104.0f, 44.0f),
                    PathNode.CurveTo(106.20914f, 44.0f, 108.0f, 45.79086f, 108.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 36.0f),
                    PathNode.LineTo(152.0f, 36.0f),
                    PathNode.CurveTo(145.37259f, 36.0f, 140.0f, 41.37258f, 140.0f, 48.0f),
                    PathNode.LineTo(140.0f, 208.0f),
                    PathNode.CurveTo(140.0f, 214.62741f, 145.37259f, 220.0f, 152.0f, 220.0f),
                    PathNode.LineTo(192.0f, 220.0f),
                    PathNode.CurveTo(198.62741f, 220.0f, 204.0f, 214.62741f, 204.0f, 208.0f),
                    PathNode.LineTo(204.0f, 48.0f),
                    PathNode.CurveTo(204.0f, 41.37258f, 198.62741f, 36.0f, 192.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 208.0f),
                    PathNode.CurveTo(196.0f, 210.20914f, 194.20914f, 212.0f, 192.0f, 212.0f),
                    PathNode.LineTo(152.0f, 212.0f),
                    PathNode.CurveTo(149.79086f, 212.0f, 148.0f, 210.20914f, 148.0f, 208.0f),
                    PathNode.LineTo(148.0f, 48.0f),
                    PathNode.CurveTo(148.0f, 45.79086f, 149.79086f, 44.0f, 152.0f, 44.0f),
                    PathNode.LineTo(192.0f, 44.0f),
                    PathNode.CurveTo(194.20914f, 44.0f, 196.0f, 45.79086f, 196.0f, 48.0f),
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
        return _columns!!
    }

private var _columns: ImageVector? = null
