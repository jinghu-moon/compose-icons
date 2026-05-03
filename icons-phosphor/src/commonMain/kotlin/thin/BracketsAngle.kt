package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BracketsAngle: ImageVector
    get() {
        if (_bracketsAngle != null) return _bracketsAngle!!
        _bracketsAngle = phosphorThinIcon(
            name = "BracketsAngle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(83.37f, 42.15f),
                    PathNode.LineTo(28.74f, 128.0f),
                    PathNode.LineTo(83.37f, 213.85f),
                    PathNode.CurveTo(84.5559f, 215.71147f, 84.00994f, 218.1817f, 82.15f, 219.37f),
                    PathNode.CurveTo(81.50797f, 219.78052f, 80.76205f, 219.99908f, 80.0f, 220.0f),
                    PathNode.CurveTo(78.63454f, 219.99896f, 77.36394f, 219.30145f, 76.63f, 218.15f),
                    PathNode.LineTo(20.63f, 130.15f),
                    PathNode.CurveTo(19.794073f, 128.83855f, 19.794073f, 127.16145f, 20.63f, 125.85f),
                    PathNode.LineTo(76.63f, 37.85f),
                    PathNode.CurveTo(77.37226f, 36.58892f, 78.743904f, 35.833805f, 80.20644f, 35.88109f),
                    PathNode.CurveTo(81.66899f, 35.92837f, 82.98899f, 36.770508f, 83.64825f, 38.076897f),
                    PathNode.CurveTo(84.30751f, 39.38329f, 84.20079f, 40.9454f, 83.37f, 42.15f),
                    PathNode.Close,
                    PathNode.MoveTo(235.37f, 125.85f),
                    PathNode.LineTo(179.37f, 37.85f),
                    PathNode.CurveTo(178.62773f, 36.58892f, 177.2561f, 35.833805f, 175.79355f, 35.88109f),
                    PathNode.CurveTo(174.33101f, 35.92837f, 173.011f, 36.770508f, 172.35175f, 38.076897f),
                    PathNode.CurveTo(171.69249f, 39.38329f, 171.79921f, 40.9454f, 172.63f, 42.15f),
                    PathNode.LineTo(227.26f, 128.0f),
                    PathNode.LineTo(172.63f, 213.85f),
                    PathNode.CurveTo(171.4441f, 215.71147f, 171.99007f, 218.1817f, 173.85f, 219.37f),
                    PathNode.CurveTo(174.49202f, 219.78052f, 175.23796f, 219.99908f, 176.0f, 220.0f),
                    PathNode.CurveTo(177.36546f, 219.99896f, 178.63606f, 219.30145f, 179.37f, 218.15f),
                    PathNode.LineTo(235.37f, 130.15f),
                    PathNode.CurveTo(236.20593f, 128.83855f, 236.20593f, 127.16145f, 235.37f, 125.85f),
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
        return _bracketsAngle!!
    }

private var _bracketsAngle: ImageVector? = null
