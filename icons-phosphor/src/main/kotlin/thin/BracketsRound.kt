package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BracketsRound: ImageVector
    get() {
        if (_bracketsRound != null) return _bracketsRound!!
        _bracketsRound = phosphorThinIcon(
            name = "BracketsRound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(55.0f, 62.67f),
                    PathNode.CurveTo(46.34f, 74.93f, 36.0f, 96.22f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 159.78f, 46.34f, 181.07f, 55.0f, 193.33f),
                    PathNode.CurveTo(64.41f, 206.63f, 74.0f, 212.52f, 74.06f, 212.57f),
                    PathNode.CurveTo(75.60206f, 213.49521f, 76.33712f, 215.33575f, 75.85666f, 217.06871f),
                    PathNode.CurveTo(75.37619f, 218.80165f, 73.79832f, 220.00093f, 72.0f, 220.0f),
                    PathNode.CurveTo(71.29474f, 219.98965f, 70.60475f, 219.79301f, 70.0f, 219.43f),
                    PathNode.CurveTo(68.23f, 218.4f, 28.0f, 193.51f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 62.49f, 68.23f, 37.6f, 69.94f, 36.57f),
                    PathNode.CurveTo(71.834335f, 35.42953f, 74.29453f, 36.040665f, 75.435f, 37.935f),
                    PathNode.CurveTo(76.57547f, 39.82934f, 75.96434f, 42.28953f, 74.07f, 43.43f),
                    PathNode.CurveTo(74.0f, 43.48f, 64.42f, 49.37f, 55.0f, 62.67f),
                    PathNode.Close,
                    PathNode.MoveTo(186.05f, 36.57f),
                    PathNode.CurveTo(184.15567f, 35.42953f, 181.69547f, 36.040665f, 180.555f, 37.935f),
                    PathNode.CurveTo(179.41454f, 39.82934f, 180.02567f, 42.28953f, 181.92f, 43.43f),
                    PathNode.CurveTo(182.02f, 43.43f, 191.57f, 49.37f, 200.98f, 62.67f),
                    PathNode.CurveTo(209.65f, 74.93f, 219.98f, 96.22f, 219.98f, 128.0f),
                    PathNode.CurveTo(219.98f, 159.78f, 209.64f, 181.07f, 200.98f, 193.33f),
                    PathNode.CurveTo(191.57f, 206.63f, 181.98f, 212.52f, 181.93f, 212.57f),
                    PathNode.CurveTo(180.03566f, 213.7077f, 179.42229f, 216.16566f, 180.56f, 218.06f),
                    PathNode.CurveTo(181.69771f, 219.95433f, 184.15567f, 220.5677f, 186.05f, 219.43f),
                    PathNode.CurveTo(187.76f, 218.43f, 227.99f, 193.51f, 227.99f, 128.0f),
                    PathNode.CurveTo(227.99f, 62.49f, 187.77f, 37.6f, 186.06f, 36.57f),
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
        return _bracketsRound!!
    }

private var _bracketsRound: ImageVector? = null
