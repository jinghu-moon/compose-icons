package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CellSignalMedium: ImageVector
    get() {
        if (_cellSignalMedium != null) return _cellSignalMedium!!
        _cellSignalMedium = phosphorThinIcon(
            name = "CellSignalMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(124.0f, 112.0f),
                    PathNode.LineTo(124.0f, 200.0f),
                    PathNode.CurveTo(124.0f, 202.20914f, 122.20914f, 204.0f, 120.0f, 204.0f),
                    PathNode.CurveTo(117.79086f, 204.0f, 116.0f, 202.20914f, 116.0f, 200.0f),
                    PathNode.LineTo(116.0f, 112.0f),
                    PathNode.CurveTo(116.0f, 109.79086f, 117.79086f, 108.0f, 120.0f, 108.0f),
                    PathNode.CurveTo(122.20914f, 108.0f, 124.0f, 109.79086f, 124.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 148.0f),
                    PathNode.CurveTo(77.79086f, 148.0f, 76.0f, 149.79086f, 76.0f, 152.0f),
                    PathNode.LineTo(76.0f, 200.0f),
                    PathNode.CurveTo(76.0f, 202.20914f, 77.79086f, 204.0f, 80.0f, 204.0f),
                    PathNode.CurveTo(82.20914f, 204.0f, 84.0f, 202.20914f, 84.0f, 200.0f),
                    PathNode.LineTo(84.0f, 152.0f),
                    PathNode.CurveTo(84.0f, 149.79086f, 82.20914f, 148.0f, 80.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 188.0f),
                    PathNode.CurveTo(37.79086f, 188.0f, 36.0f, 189.79086f, 36.0f, 192.0f),
                    PathNode.LineTo(36.0f, 200.0f),
                    PathNode.CurveTo(36.0f, 202.20914f, 37.79086f, 204.0f, 40.0f, 204.0f),
                    PathNode.CurveTo(42.20914f, 204.0f, 44.0f, 202.20914f, 44.0f, 200.0f),
                    PathNode.LineTo(44.0f, 192.0f),
                    PathNode.CurveTo(44.0f, 189.79086f, 42.20914f, 188.0f, 40.0f, 188.0f),
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
        return _cellSignalMedium!!
    }

private var _cellSignalMedium: ImageVector? = null
