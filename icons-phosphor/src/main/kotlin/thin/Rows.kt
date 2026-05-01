package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Rows: ImageVector
    get() {
        if (_rows != null) return _rows!!
        _rows = phosphorThinIcon(
            name = "Rows",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 140.0f),
                    PathNode.LineTo(48.0f, 140.0f),
                    PathNode.CurveTo(41.37258f, 140.0f, 36.0f, 145.37259f, 36.0f, 152.0f),
                    PathNode.LineTo(36.0f, 192.0f),
                    PathNode.CurveTo(36.0f, 198.62741f, 41.37258f, 204.0f, 48.0f, 204.0f),
                    PathNode.LineTo(208.0f, 204.0f),
                    PathNode.CurveTo(214.62741f, 204.0f, 220.0f, 198.62741f, 220.0f, 192.0f),
                    PathNode.LineTo(220.0f, 152.0f),
                    PathNode.CurveTo(220.0f, 145.37259f, 214.62741f, 140.0f, 208.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 192.0f),
                    PathNode.CurveTo(212.0f, 194.20914f, 210.20914f, 196.0f, 208.0f, 196.0f),
                    PathNode.LineTo(48.0f, 196.0f),
                    PathNode.CurveTo(45.79086f, 196.0f, 44.0f, 194.20914f, 44.0f, 192.0f),
                    PathNode.LineTo(44.0f, 152.0f),
                    PathNode.CurveTo(44.0f, 149.79086f, 45.79086f, 148.0f, 48.0f, 148.0f),
                    PathNode.LineTo(208.0f, 148.0f),
                    PathNode.CurveTo(210.20914f, 148.0f, 212.0f, 149.79086f, 212.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 52.0f),
                    PathNode.LineTo(48.0f, 52.0f),
                    PathNode.CurveTo(41.37258f, 52.0f, 36.0f, 57.37258f, 36.0f, 64.0f),
                    PathNode.LineTo(36.0f, 104.0f),
                    PathNode.CurveTo(36.0f, 110.62742f, 41.37258f, 116.0f, 48.0f, 116.0f),
                    PathNode.LineTo(208.0f, 116.0f),
                    PathNode.CurveTo(214.62741f, 116.0f, 220.0f, 110.62742f, 220.0f, 104.0f),
                    PathNode.LineTo(220.0f, 64.0f),
                    PathNode.CurveTo(220.0f, 57.37258f, 214.62741f, 52.0f, 208.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 104.0f),
                    PathNode.CurveTo(212.0f, 106.20914f, 210.20914f, 108.0f, 208.0f, 108.0f),
                    PathNode.LineTo(48.0f, 108.0f),
                    PathNode.CurveTo(45.79086f, 108.0f, 44.0f, 106.20914f, 44.0f, 104.0f),
                    PathNode.LineTo(44.0f, 64.0f),
                    PathNode.CurveTo(44.0f, 61.79086f, 45.79086f, 60.0f, 48.0f, 60.0f),
                    PathNode.LineTo(208.0f, 60.0f),
                    PathNode.CurveTo(210.20914f, 60.0f, 212.0f, 61.79086f, 212.0f, 64.0f),
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
        return _rows!!
    }

private var _rows: ImageVector? = null
