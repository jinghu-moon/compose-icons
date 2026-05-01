package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Barricade: ImageVector
    get() {
        if (_barricade != null) return _barricade!!
        _barricade = phosphorThinIcon(
            name = "Barricade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 68.0f),
                    PathNode.LineTo(32.0f, 68.0f),
                    PathNode.CurveTo(25.372583f, 68.0f, 20.0f, 73.37258f, 20.0f, 80.0f),
                    PathNode.LineTo(20.0f, 152.0f),
                    PathNode.CurveTo(20.0f, 158.62741f, 25.372583f, 164.0f, 32.0f, 164.0f),
                    PathNode.LineTo(60.0f, 164.0f),
                    PathNode.LineTo(60.0f, 200.0f),
                    PathNode.CurveTo(60.0f, 202.20914f, 61.79086f, 204.0f, 64.0f, 204.0f),
                    PathNode.CurveTo(66.20914f, 204.0f, 68.0f, 202.20914f, 68.0f, 200.0f),
                    PathNode.LineTo(68.0f, 164.0f),
                    PathNode.LineTo(188.0f, 164.0f),
                    PathNode.LineTo(188.0f, 200.0f),
                    PathNode.CurveTo(188.0f, 202.20914f, 189.79086f, 204.0f, 192.0f, 204.0f),
                    PathNode.CurveTo(194.20914f, 204.0f, 196.0f, 202.20914f, 196.0f, 200.0f),
                    PathNode.LineTo(196.0f, 164.0f),
                    PathNode.LineTo(224.0f, 164.0f),
                    PathNode.CurveTo(230.62741f, 164.0f, 236.0f, 158.62741f, 236.0f, 152.0f),
                    PathNode.LineTo(236.0f, 80.0f),
                    PathNode.CurveTo(236.0f, 73.37258f, 230.62741f, 68.0f, 224.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 80.0f),
                    PathNode.LineTo(228.0f, 138.34f),
                    PathNode.LineTo(165.66f, 76.0f),
                    PathNode.LineTo(224.0f, 76.0f),
                    PathNode.CurveTo(226.20914f, 76.0f, 228.0f, 77.79086f, 228.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 76.0f),
                    PathNode.LineTo(82.34f, 76.0f),
                    PathNode.LineTo(162.34f, 156.0f),
                    PathNode.LineTo(101.66f, 156.0f),
                    PathNode.LineTo(28.0f, 82.34f),
                    PathNode.LineTo(28.0f, 80.0f),
                    PathNode.CurveTo(28.0f, 77.79086f, 29.790861f, 76.0f, 32.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(28.0f, 152.0f),
                    PathNode.LineTo(28.0f, 93.66f),
                    PathNode.LineTo(90.34f, 156.0f),
                    PathNode.LineTo(32.0f, 156.0f),
                    PathNode.CurveTo(29.790861f, 156.0f, 28.0f, 154.20914f, 28.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 156.0f),
                    PathNode.LineTo(173.66f, 156.0f),
                    PathNode.LineTo(93.66f, 76.0f),
                    PathNode.LineTo(154.34f, 76.0f),
                    PathNode.LineTo(228.0f, 149.66f),
                    PathNode.LineTo(228.0f, 152.0f),
                    PathNode.CurveTo(228.0f, 154.20914f, 226.20914f, 156.0f, 224.0f, 156.0f),
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
        return _barricade!!
    }

private var _barricade: ImageVector? = null
