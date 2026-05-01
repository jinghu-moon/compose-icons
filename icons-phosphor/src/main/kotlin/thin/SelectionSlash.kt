package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SelectionSlash: ImageVector
    get() {
        if (_selectionSlash != null) return _selectionSlash!!
        _selectionSlash = phosphorThinIcon(
            name = "SelectionSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(108.0f, 40.0f),
                    PathNode.CurveTo(108.0f, 37.79086f, 109.79086f, 36.0f, 112.0f, 36.0f),
                    PathNode.LineTo(144.0f, 36.0f),
                    PathNode.CurveTo(146.20914f, 36.0f, 148.0f, 37.79086f, 148.0f, 40.0f),
                    PathNode.CurveTo(148.0f, 42.20914f, 146.20914f, 44.0f, 144.0f, 44.0f),
                    PathNode.LineTo(112.0f, 44.0f),
                    PathNode.CurveTo(109.79086f, 44.0f, 108.0f, 42.20914f, 108.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 212.0f),
                    PathNode.LineTo(112.0f, 212.0f),
                    PathNode.CurveTo(109.79086f, 212.0f, 108.0f, 213.79086f, 108.0f, 216.0f),
                    PathNode.CurveTo(108.0f, 218.20914f, 109.79086f, 220.0f, 112.0f, 220.0f),
                    PathNode.LineTo(144.0f, 220.0f),
                    PathNode.CurveTo(146.20914f, 220.0f, 148.0f, 218.20914f, 148.0f, 216.0f),
                    PathNode.CurveTo(148.0f, 213.79086f, 146.20914f, 212.0f, 144.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 36.0f),
                    PathNode.LineTo(184.0f, 36.0f),
                    PathNode.CurveTo(181.79086f, 36.0f, 180.0f, 37.79086f, 180.0f, 40.0f),
                    PathNode.CurveTo(180.0f, 42.20914f, 181.79086f, 44.0f, 184.0f, 44.0f),
                    PathNode.LineTo(208.0f, 44.0f),
                    PathNode.CurveTo(210.20914f, 44.0f, 212.0f, 45.79086f, 212.0f, 48.0f),
                    PathNode.LineTo(212.0f, 72.0f),
                    PathNode.CurveTo(212.0f, 74.20914f, 213.79086f, 76.0f, 216.0f, 76.0f),
                    PathNode.CurveTo(218.20914f, 76.0f, 220.0f, 74.20914f, 220.0f, 72.0f),
                    PathNode.LineTo(220.0f, 48.0f),
                    PathNode.CurveTo(220.0f, 41.37258f, 214.62741f, 36.0f, 208.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 108.0f),
                    PathNode.CurveTo(213.79086f, 108.0f, 212.0f, 109.79086f, 212.0f, 112.0f),
                    PathNode.LineTo(212.0f, 144.0f),
                    PathNode.CurveTo(212.0f, 146.20914f, 213.79086f, 148.0f, 216.0f, 148.0f),
                    PathNode.CurveTo(218.20914f, 148.0f, 220.0f, 146.20914f, 220.0f, 144.0f),
                    PathNode.LineTo(220.0f, 112.0f),
                    PathNode.CurveTo(220.0f, 109.79086f, 218.20914f, 108.0f, 216.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 148.0f),
                    PathNode.CurveTo(42.20914f, 148.0f, 44.0f, 146.20914f, 44.0f, 144.0f),
                    PathNode.LineTo(44.0f, 112.0f),
                    PathNode.CurveTo(44.0f, 109.79086f, 42.20914f, 108.0f, 40.0f, 108.0f),
                    PathNode.CurveTo(37.79086f, 108.0f, 36.0f, 109.79086f, 36.0f, 112.0f),
                    PathNode.LineTo(36.0f, 144.0f),
                    PathNode.CurveTo(36.0f, 146.20914f, 37.79086f, 148.0f, 40.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 212.0f),
                    PathNode.LineTo(48.0f, 212.0f),
                    PathNode.CurveTo(45.79086f, 212.0f, 44.0f, 210.20914f, 44.0f, 208.0f),
                    PathNode.LineTo(44.0f, 184.0f),
                    PathNode.CurveTo(44.0f, 181.79086f, 42.20914f, 180.0f, 40.0f, 180.0f),
                    PathNode.CurveTo(37.79086f, 180.0f, 36.0f, 181.79086f, 36.0f, 184.0f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 214.62741f, 41.37258f, 220.0f, 48.0f, 220.0f),
                    PathNode.LineTo(72.0f, 220.0f),
                    PathNode.CurveTo(74.20914f, 220.0f, 76.0f, 218.20914f, 76.0f, 216.0f),
                    PathNode.CurveTo(76.0f, 213.79086f, 74.20914f, 212.0f, 72.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(51.0f, 37.31f),
                    PathNode.CurveTo(49.514355f, 35.653145f, 46.966854f, 35.514355f, 45.31f, 37.0f),
                    PathNode.CurveTo(43.653145f, 38.485645f, 43.514355f, 41.033146f, 45.0f, 42.69f),
                    PathNode.LineTo(205.0f, 218.69f),
                    PathNode.CurveTo(205.95595f, 219.76758f, 207.41747f, 220.24792f, 208.8263f, 219.94757f),
                    PathNode.CurveTo(210.23512f, 219.64722f, 211.37364f, 218.61255f, 211.80698f, 217.23878f),
                    PathNode.CurveTo(212.24031f, 215.865f, 211.9015f, 214.36435f, 210.92f, 213.31f),
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
        return _selectionSlash!!
    }

private var _selectionSlash: ImageVector? = null
