package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AppWindow: ImageVector
    get() {
        if (_appWindow != null) return _appWindow!!
        _appWindow = phosphorThinIcon(
            name = "AppWindow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 44.0f),
                    PathNode.LineTo(40.0f, 44.0f),
                    PathNode.CurveTo(33.37258f, 44.0f, 28.0f, 49.37258f, 28.0f, 56.0f),
                    PathNode.LineTo(28.0f, 200.0f),
                    PathNode.CurveTo(28.0f, 206.62741f, 33.37258f, 212.0f, 40.0f, 212.0f),
                    PathNode.LineTo(216.0f, 212.0f),
                    PathNode.CurveTo(222.62741f, 212.0f, 228.0f, 206.62741f, 228.0f, 200.0f),
                    PathNode.LineTo(228.0f, 56.0f),
                    PathNode.CurveTo(228.0f, 49.37258f, 222.62741f, 44.0f, 216.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 200.0f),
                    PathNode.CurveTo(220.0f, 202.20914f, 218.20914f, 204.0f, 216.0f, 204.0f),
                    PathNode.LineTo(40.0f, 204.0f),
                    PathNode.CurveTo(37.79086f, 204.0f, 36.0f, 202.20914f, 36.0f, 200.0f),
                    PathNode.LineTo(36.0f, 56.0f),
                    PathNode.CurveTo(36.0f, 53.79086f, 37.79086f, 52.0f, 40.0f, 52.0f),
                    PathNode.LineTo(216.0f, 52.0f),
                    PathNode.CurveTo(218.20914f, 52.0f, 220.0f, 53.79086f, 220.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 84.0f),
                    PathNode.CurveTo(76.0f, 88.41828f, 72.41828f, 92.0f, 68.0f, 92.0f),
                    PathNode.CurveTo(63.581722f, 92.0f, 60.0f, 88.41828f, 60.0f, 84.0f),
                    PathNode.CurveTo(60.0f, 79.58172f, 63.581722f, 76.0f, 68.0f, 76.0f),
                    PathNode.CurveTo(72.41828f, 76.0f, 76.0f, 79.58172f, 76.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 84.0f),
                    PathNode.CurveTo(116.0f, 88.41828f, 112.41828f, 92.0f, 108.0f, 92.0f),
                    PathNode.CurveTo(103.58172f, 92.0f, 100.0f, 88.41828f, 100.0f, 84.0f),
                    PathNode.CurveTo(100.0f, 79.58172f, 103.58172f, 76.0f, 108.0f, 76.0f),
                    PathNode.CurveTo(112.41828f, 76.0f, 116.0f, 79.58172f, 116.0f, 84.0f),
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
        return _appWindow!!
    }

private var _appWindow: ImageVector? = null
