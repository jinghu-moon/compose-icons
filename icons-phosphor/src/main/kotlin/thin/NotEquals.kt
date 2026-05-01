package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NotEquals: ImageVector
    get() {
        if (_notEquals != null) return _notEquals!!
        _notEquals = phosphorThinIcon(
            name = "NotEquals",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 160.0f),
                    PathNode.CurveTo(220.0f, 162.20914f, 218.20914f, 164.0f, 216.0f, 164.0f),
                    PathNode.LineTo(100.68f, 164.0f),
                    PathNode.LineTo(51.0f, 218.69f),
                    PathNode.CurveTo(49.514355f, 220.34685f, 46.966854f, 220.48564f, 45.31f, 219.0f),
                    PathNode.CurveTo(43.653145f, 217.51436f, 43.514355f, 214.96686f, 45.0f, 213.31f),
                    PathNode.LineTo(89.87f, 164.0f),
                    PathNode.LineTo(40.0f, 164.0f),
                    PathNode.CurveTo(37.79086f, 164.0f, 36.0f, 162.20914f, 36.0f, 160.0f),
                    PathNode.CurveTo(36.0f, 157.79086f, 37.79086f, 156.0f, 40.0f, 156.0f),
                    PathNode.LineTo(97.14f, 156.0f),
                    PathNode.LineTo(148.05f, 100.0f),
                    PathNode.LineTo(40.0f, 100.0f),
                    PathNode.CurveTo(37.79086f, 100.0f, 36.0f, 98.20914f, 36.0f, 96.0f),
                    PathNode.CurveTo(36.0f, 93.79086f, 37.79086f, 92.0f, 40.0f, 92.0f),
                    PathNode.LineTo(155.32f, 92.0f),
                    PathNode.LineTo(205.0f, 37.31f),
                    PathNode.CurveTo(206.48564f, 35.653145f, 209.03314f, 35.514355f, 210.69f, 37.0f),
                    PathNode.CurveTo(212.34685f, 38.485645f, 212.48564f, 41.033146f, 211.0f, 42.69f),
                    PathNode.LineTo(166.13f, 92.0f),
                    PathNode.LineTo(216.0f, 92.0f),
                    PathNode.CurveTo(218.20914f, 92.0f, 220.0f, 93.79086f, 220.0f, 96.0f),
                    PathNode.CurveTo(220.0f, 98.20914f, 218.20914f, 100.0f, 216.0f, 100.0f),
                    PathNode.LineTo(158.86f, 100.0f),
                    PathNode.LineTo(108.0f, 156.0f),
                    PathNode.LineTo(216.0f, 156.0f),
                    PathNode.CurveTo(218.20914f, 156.0f, 220.0f, 157.79086f, 220.0f, 160.0f),
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
        return _notEquals!!
    }

private var _notEquals: ImageVector? = null
