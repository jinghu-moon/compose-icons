package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DeviceMobileSlash: ImageVector
    get() {
        if (_deviceMobileSlash != null) return _deviceMobileSlash!!
        _deviceMobileSlash = phosphorThinIcon(
            name = "DeviceMobileSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(211.0f, 213.31f),
                    PathNode.LineTo(51.0f, 37.31f),
                    PathNode.CurveTo(49.514355f, 35.653145f, 46.966854f, 35.514355f, 45.31f, 37.0f),
                    PathNode.CurveTo(43.653145f, 38.485645f, 43.514355f, 41.033146f, 45.0f, 42.69f),
                    PathNode.LineTo(60.0f, 59.15f),
                    PathNode.LineTo(60.0f, 216.0f),
                    PathNode.CurveTo(60.0f, 227.0457f, 68.95431f, 236.0f, 80.0f, 236.0f),
                    PathNode.LineTo(176.0f, 236.0f),
                    PathNode.CurveTo(187.0457f, 236.0f, 196.0f, 227.0457f, 196.0f, 216.0f),
                    PathNode.LineTo(196.0f, 208.75f),
                    PathNode.LineTo(205.0f, 218.69f),
                    PathNode.CurveTo(205.95595f, 219.76758f, 207.41747f, 220.24792f, 208.8263f, 219.94757f),
                    PathNode.CurveTo(210.23512f, 219.64722f, 211.37364f, 218.61255f, 211.80698f, 217.23878f),
                    PathNode.CurveTo(212.24031f, 215.865f, 211.9015f, 214.36435f, 210.92f, 213.31f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 216.0f),
                    PathNode.CurveTo(188.0f, 222.62741f, 182.62741f, 228.0f, 176.0f, 228.0f),
                    PathNode.LineTo(80.0f, 228.0f),
                    PathNode.CurveTo(73.37258f, 228.0f, 68.0f, 222.62741f, 68.0f, 216.0f),
                    PathNode.LineTo(68.0f, 68.0f),
                    PathNode.LineTo(188.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.7f, 24.0f),
                    PathNode.CurveTo(72.7f, 21.790861f, 74.49085f, 20.0f, 76.7f, 20.0f),
                    PathNode.LineTo(176.0f, 20.0f),
                    PathNode.CurveTo(187.0457f, 20.0f, 196.0f, 28.954306f, 196.0f, 40.0f),
                    PathNode.LineTo(196.0f, 150.83f),
                    PathNode.CurveTo(196.0f, 153.03914f, 194.20914f, 154.83f, 192.0f, 154.83f),
                    PathNode.CurveTo(189.79086f, 154.83f, 188.0f, 153.03914f, 188.0f, 150.83f),
                    PathNode.LineTo(188.0f, 40.0f),
                    PathNode.CurveTo(188.0f, 33.37258f, 182.62741f, 28.0f, 176.0f, 28.0f),
                    PathNode.LineTo(76.7f, 28.0f),
                    PathNode.CurveTo(74.49085f, 28.0f, 72.7f, 26.209139f, 72.7f, 24.0f),
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
        return _deviceMobileSlash!!
    }

private var _deviceMobileSlash: ImageVector? = null
