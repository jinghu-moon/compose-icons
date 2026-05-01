package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SlidersHorizontal: ImageVector
    get() {
        if (_slidersHorizontal != null) return _slidersHorizontal!!
        _slidersHorizontal = phosphorThinIcon(
            name = "SlidersHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(40.0f, 84.0f),
                    PathNode.LineTo(76.29f, 84.0f),
                    PathNode.CurveTo(78.286995f, 97.76725f, 90.08867f, 107.98056f, 104.0f, 107.98056f),
                    PathNode.CurveTo(117.91133f, 107.98056f, 129.71301f, 97.76725f, 131.71f, 84.0f),
                    PathNode.LineTo(216.0f, 84.0f),
                    PathNode.CurveTo(218.20914f, 84.0f, 220.0f, 82.20914f, 220.0f, 80.0f),
                    PathNode.CurveTo(220.0f, 77.79086f, 218.20914f, 76.0f, 216.0f, 76.0f),
                    PathNode.LineTo(131.71f, 76.0f),
                    PathNode.CurveTo(129.71301f, 62.232746f, 117.91133f, 52.01944f, 104.0f, 52.01944f),
                    PathNode.CurveTo(90.08867f, 52.01944f, 78.286995f, 62.232746f, 76.29f, 76.0f),
                    PathNode.LineTo(40.0f, 76.0f),
                    PathNode.CurveTo(37.79086f, 76.0f, 36.0f, 77.79086f, 36.0f, 80.0f),
                    PathNode.CurveTo(36.0f, 82.20914f, 37.79086f, 84.0f, 40.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 60.0f),
                    PathNode.CurveTo(115.04569f, 60.0f, 124.0f, 68.95431f, 124.0f, 80.0f),
                    PathNode.CurveTo(124.0f, 91.04569f, 115.04569f, 100.0f, 104.0f, 100.0f),
                    PathNode.CurveTo(92.95431f, 100.0f, 84.0f, 91.04569f, 84.0f, 80.0f),
                    PathNode.CurveTo(84.0f, 68.95431f, 92.95431f, 60.0f, 104.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 172.0f),
                    PathNode.LineTo(195.71f, 172.0f),
                    PathNode.CurveTo(193.71301f, 158.23276f, 181.91133f, 148.01944f, 168.0f, 148.01944f),
                    PathNode.CurveTo(154.08867f, 148.01944f, 142.28699f, 158.23276f, 140.29f, 172.0f),
                    PathNode.LineTo(40.0f, 172.0f),
                    PathNode.CurveTo(37.79086f, 172.0f, 36.0f, 173.79086f, 36.0f, 176.0f),
                    PathNode.CurveTo(36.0f, 178.20914f, 37.79086f, 180.0f, 40.0f, 180.0f),
                    PathNode.LineTo(140.29f, 180.0f),
                    PathNode.CurveTo(142.28699f, 193.76724f, 154.08867f, 203.98056f, 168.0f, 203.98056f),
                    PathNode.CurveTo(181.91133f, 203.98056f, 193.71301f, 193.76724f, 195.71f, 180.0f),
                    PathNode.LineTo(216.0f, 180.0f),
                    PathNode.CurveTo(218.20914f, 180.0f, 220.0f, 178.20914f, 220.0f, 176.0f),
                    PathNode.CurveTo(220.0f, 173.79086f, 218.20914f, 172.0f, 216.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 196.0f),
                    PathNode.CurveTo(156.9543f, 196.0f, 148.0f, 187.0457f, 148.0f, 176.0f),
                    PathNode.CurveTo(148.0f, 164.9543f, 156.9543f, 156.0f, 168.0f, 156.0f),
                    PathNode.CurveTo(179.0457f, 156.0f, 188.0f, 164.9543f, 188.0f, 176.0f),
                    PathNode.CurveTo(188.0f, 187.0457f, 179.0457f, 196.0f, 168.0f, 196.0f),
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
        return _slidersHorizontal!!
    }

private var _slidersHorizontal: ImageVector? = null
