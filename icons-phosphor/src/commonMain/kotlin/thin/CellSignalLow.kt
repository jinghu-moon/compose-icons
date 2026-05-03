package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CellSignalLow: ImageVector
    get() {
        if (_cellSignalLow != null) return _cellSignalLow!!
        _cellSignalLow = phosphorThinIcon(
            name = "CellSignalLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(84.0f, 152.0f),
                    PathNode.LineTo(84.0f, 200.0f),
                    PathNode.CurveTo(84.0f, 202.20914f, 82.20914f, 204.0f, 80.0f, 204.0f),
                    PathNode.CurveTo(77.79086f, 204.0f, 76.0f, 202.20914f, 76.0f, 200.0f),
                    PathNode.LineTo(76.0f, 152.0f),
                    PathNode.CurveTo(76.0f, 149.79086f, 77.79086f, 148.0f, 80.0f, 148.0f),
                    PathNode.CurveTo(82.20914f, 148.0f, 84.0f, 149.79086f, 84.0f, 152.0f),
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
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _cellSignalLow!!
    }

private var _cellSignalLow: ImageVector? = null
