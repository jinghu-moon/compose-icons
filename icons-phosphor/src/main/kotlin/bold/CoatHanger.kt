package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CoatHanger: ImageVector
    get() {
        if (_coatHanger != null) return _coatHanger!!
        _coatHanger = phosphorBoldIcon(
            name = "CoatHanger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 168.0f),
                    PathNode.LineTo(148.0f, 96.0f),
                    PathNode.LineTo(167.2f, 81.6f),
                    PathNode.CurveTo(170.22166f, 79.33374f, 172.0f, 75.777084f, 172.0f, 72.0f),
                    PathNode.CurveTo(172.01094f, 48.757477f, 153.94254f, 29.515186f, 130.74527f, 28.065027f),
                    PathNode.CurveTo(107.548035f, 26.614868f, 87.223816f, 43.457073f, 84.34f, 66.52f),
                    PathNode.CurveTo(83.51157f, 73.09771f, 88.17229f, 79.10157f, 94.75f, 79.93f),
                    PathNode.CurveTo(101.32771f, 80.75843f, 107.33157f, 76.09771f, 108.16f, 69.52f),
                    PathNode.CurveTo(109.35432f, 60.08479f, 117.02776f, 52.79559f, 126.51183f, 52.087135f),
                    PathNode.CurveTo(135.99591f, 51.37868f, 144.66718f, 57.44694f, 147.25f, 66.6f),
                    PathNode.LineTo(121.0f, 86.24f),
                    PathNode.CurveTo(120.85f, 86.34f, 120.71f, 86.45f, 120.57f, 86.56f),
                    PathNode.LineTo(12.0f, 168.0f),
                    PathNode.CurveTo(5.113114f, 173.16516f, 2.304053f, 182.15771f, 5.026334f, 190.32455f),
                    PathNode.CurveTo(7.748615f, 198.4914f, 15.391392f, 204.0f, 24.0f, 204.0f),
                    PathNode.LineTo(232.0f, 204.0f),
                    PathNode.CurveTo(240.60861f, 204.0f, 248.25139f, 198.4914f, 250.97366f, 190.32455f),
                    PathNode.CurveTo(253.69595f, 182.15771f, 250.88689f, 173.16516f, 244.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 180.0f),
                    PathNode.LineTo(128.0f, 111.0f),
                    PathNode.LineTo(220.0f, 180.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _coatHanger!!
    }

private var _coatHanger: ImageVector? = null
