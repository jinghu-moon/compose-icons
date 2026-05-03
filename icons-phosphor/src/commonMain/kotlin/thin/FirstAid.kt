package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FirstAid: ImageVector
    get() {
        if (_firstAid != null) return _firstAid!!
        _firstAid = phosphorThinIcon(
            name = "FirstAid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 92.0f),
                    PathNode.LineTo(164.0f, 92.0f),
                    PathNode.LineTo(164.0f, 40.0f),
                    PathNode.CurveTo(164.0f, 33.37258f, 158.62741f, 28.0f, 152.0f, 28.0f),
                    PathNode.LineTo(104.0f, 28.0f),
                    PathNode.CurveTo(97.37258f, 28.0f, 92.0f, 33.37258f, 92.0f, 40.0f),
                    PathNode.LineTo(92.0f, 92.0f),
                    PathNode.LineTo(40.0f, 92.0f),
                    PathNode.CurveTo(33.37258f, 92.0f, 28.0f, 97.37258f, 28.0f, 104.0f),
                    PathNode.LineTo(28.0f, 152.0f),
                    PathNode.CurveTo(28.0f, 158.62741f, 33.37258f, 164.0f, 40.0f, 164.0f),
                    PathNode.LineTo(92.0f, 164.0f),
                    PathNode.LineTo(92.0f, 216.0f),
                    PathNode.CurveTo(92.0f, 222.62741f, 97.37258f, 228.0f, 104.0f, 228.0f),
                    PathNode.LineTo(152.0f, 228.0f),
                    PathNode.CurveTo(158.62741f, 228.0f, 164.0f, 222.62741f, 164.0f, 216.0f),
                    PathNode.LineTo(164.0f, 164.0f),
                    PathNode.LineTo(216.0f, 164.0f),
                    PathNode.CurveTo(222.62741f, 164.0f, 228.0f, 158.62741f, 228.0f, 152.0f),
                    PathNode.LineTo(228.0f, 104.0f),
                    PathNode.CurveTo(228.0f, 97.37258f, 222.62741f, 92.0f, 216.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 152.0f),
                    PathNode.CurveTo(220.0f, 154.20914f, 218.20914f, 156.0f, 216.0f, 156.0f),
                    PathNode.LineTo(160.0f, 156.0f),
                    PathNode.CurveTo(157.79086f, 156.0f, 156.0f, 157.79086f, 156.0f, 160.0f),
                    PathNode.LineTo(156.0f, 216.0f),
                    PathNode.CurveTo(156.0f, 218.20914f, 154.20914f, 220.0f, 152.0f, 220.0f),
                    PathNode.LineTo(104.0f, 220.0f),
                    PathNode.CurveTo(101.79086f, 220.0f, 100.0f, 218.20914f, 100.0f, 216.0f),
                    PathNode.LineTo(100.0f, 160.0f),
                    PathNode.CurveTo(100.0f, 157.79086f, 98.20914f, 156.0f, 96.0f, 156.0f),
                    PathNode.LineTo(40.0f, 156.0f),
                    PathNode.CurveTo(37.79086f, 156.0f, 36.0f, 154.20914f, 36.0f, 152.0f),
                    PathNode.LineTo(36.0f, 104.0f),
                    PathNode.CurveTo(36.0f, 101.79086f, 37.79086f, 100.0f, 40.0f, 100.0f),
                    PathNode.LineTo(96.0f, 100.0f),
                    PathNode.CurveTo(98.20914f, 100.0f, 100.0f, 98.20914f, 100.0f, 96.0f),
                    PathNode.LineTo(100.0f, 40.0f),
                    PathNode.CurveTo(100.0f, 37.79086f, 101.79086f, 36.0f, 104.0f, 36.0f),
                    PathNode.LineTo(152.0f, 36.0f),
                    PathNode.CurveTo(154.20914f, 36.0f, 156.0f, 37.79086f, 156.0f, 40.0f),
                    PathNode.LineTo(156.0f, 96.0f),
                    PathNode.CurveTo(156.0f, 98.20914f, 157.79086f, 100.0f, 160.0f, 100.0f),
                    PathNode.LineTo(216.0f, 100.0f),
                    PathNode.CurveTo(218.20914f, 100.0f, 220.0f, 101.79086f, 220.0f, 104.0f),
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
        return _firstAid!!
    }

private var _firstAid: ImageVector? = null
