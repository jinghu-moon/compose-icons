package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FlagPennant: ImageVector
    get() {
        if (_flagPennant != null) return _flagPennant!!
        _flagPennant = phosphorThinIcon(
            name = "FlagPennant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(241.31f, 100.22f),
                    PathNode.LineTo(57.31f, 36.22f),
                    PathNode.CurveTo(56.087097f, 35.796124f, 54.73468f, 35.99015f, 53.680275f, 36.74074f),
                    PathNode.CurveTo(52.62587f, 37.491337f, 51.99981f, 38.70572f, 52.0f, 40.0f),
                    PathNode.LineTo(52.0f, 216.0f),
                    PathNode.CurveTo(52.0f, 218.20914f, 53.79086f, 220.0f, 56.0f, 220.0f),
                    PathNode.CurveTo(58.20914f, 220.0f, 60.0f, 218.20914f, 60.0f, 216.0f),
                    PathNode.LineTo(60.0f, 170.84f),
                    PathNode.LineTo(241.31f, 107.78f),
                    PathNode.CurveTo(242.92113f, 107.22238f, 244.00172f, 105.70488f, 244.00172f, 104.0f),
                    PathNode.CurveTo(244.00172f, 102.29512f, 242.92113f, 100.77762f, 241.31f, 100.22f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 162.37f),
                    PathNode.LineTo(60.0f, 45.63f),
                    PathNode.LineTo(227.82f, 104.0f),
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
        return _flagPennant!!
    }

private var _flagPennant: ImageVector? = null
