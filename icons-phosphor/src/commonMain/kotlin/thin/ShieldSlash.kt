package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShieldSlash: ImageVector
    get() {
        if (_shieldSlash != null) return _shieldSlash!!
        _shieldSlash = phosphorThinIcon(
            name = "ShieldSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(51.0f, 37.31f),
                    PathNode.CurveTo(49.514355f, 35.653145f, 46.966854f, 35.514355f, 45.31f, 37.0f),
                    PathNode.CurveTo(43.653145f, 38.485645f, 43.514355f, 41.033146f, 45.0f, 42.69f),
                    PathNode.LineTo(46.31f, 44.13f),
                    PathNode.CurveTo(40.398945f, 44.97085f, 36.005177f, 50.02944f, 36.0f, 56.0f),
                    PathNode.LineTo(36.0f, 112.0f),
                    PathNode.CurveTo(36.0f, 163.16f, 60.73f, 194.12f, 81.47f, 211.1f),
                    PathNode.CurveTo(103.87f, 229.42f, 126.02f, 235.6f, 126.95f, 235.86f),
                    PathNode.CurveTo(127.637505f, 236.04703f, 128.36249f, 236.04703f, 129.05f, 235.86f),
                    PathNode.CurveTo(130.42f, 235.49f, 161.61f, 226.72f, 187.28f, 199.15f),
                    PathNode.LineTo(205.0f, 218.69f),
                    PathNode.CurveTo(205.95595f, 219.76758f, 207.41747f, 220.24792f, 208.8263f, 219.94757f),
                    PathNode.CurveTo(210.23512f, 219.64722f, 211.37364f, 218.61255f, 211.80698f, 217.23878f),
                    PathNode.CurveTo(212.24031f, 215.865f, 211.9015f, 214.36435f, 210.92f, 213.31f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 227.82f),
                    PathNode.CurveTo(112.8111f, 222.70792f, 98.678f, 214.87729f, 86.29f, 204.71f),
                    PathNode.CurveTo(58.23f, 181.63f, 44.0f, 150.44f, 44.0f, 112.0f),
                    PathNode.LineTo(44.0f, 56.0f),
                    PathNode.CurveTo(44.0f, 53.79086f, 45.79086f, 52.0f, 48.0f, 52.0f),
                    PathNode.LineTo(53.5f, 52.0f),
                    PathNode.LineTo(181.88f, 193.21f),
                    PathNode.CurveTo(160.23f, 216.7f, 133.58f, 226.06f, 128.0f, 227.82f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 56.0f),
                    PathNode.LineTo(220.0f, 112.0f),
                    PathNode.CurveTo(220.0f, 132.0f, 216.23f, 150.49f, 208.8f, 166.94f),
                    PathNode.CurveTo(208.15416f, 168.37674f, 206.72522f, 169.30066f, 205.15f, 169.3f),
                    PathNode.CurveTo(204.58084f, 169.29698f, 204.01869f, 169.17433f, 203.5f, 168.94f),
                    PathNode.CurveTo(201.48735f, 168.03108f, 200.59209f, 165.6631f, 201.5f, 163.65f),
                    PathNode.CurveTo(208.5f, 148.24f, 211.99f, 130.86f, 211.99f, 112.0f),
                    PathNode.LineTo(211.99f, 56.0f),
                    PathNode.CurveTo(211.99f, 53.79086f, 210.19914f, 52.0f, 207.99f, 52.0f),
                    PathNode.LineTo(98.52f, 52.0f),
                    PathNode.CurveTo(96.31086f, 52.0f, 94.52f, 50.20914f, 94.52f, 48.0f),
                    PathNode.CurveTo(94.52f, 45.79086f, 96.31086f, 44.0f, 98.52f, 44.0f),
                    PathNode.LineTo(208.0f, 44.0f),
                    PathNode.CurveTo(214.62741f, 44.0f, 220.0f, 49.37258f, 220.0f, 56.0f),
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
        return _shieldSlash!!
    }

private var _shieldSlash: ImageVector? = null
