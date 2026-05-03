package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GreaterThanOrEqual: ImageVector
    get() {
        if (_greaterThanOrEqual != null) return _greaterThanOrEqual!!
        _greaterThanOrEqual = phosphorBoldIcon(
            name = "GreaterThanOrEqual",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(51.85f, 148.74f),
                    PathNode.LineTo(173.29f, 104.0f),
                    PathNode.LineTo(51.85f, 59.26f),
                    PathNode.CurveTo(45.631275f, 56.968018f, 42.448017f, 50.068726f, 44.74f, 43.85f),
                    PathNode.CurveTo(47.031982f, 37.631275f, 53.931274f, 34.448017f, 60.15f, 36.74f),
                    PathNode.LineTo(212.15f, 92.74f),
                    PathNode.CurveTo(216.86739f, 94.478134f, 220.00122f, 98.972595f, 220.00122f, 104.0f),
                    PathNode.CurveTo(220.00122f, 109.027405f, 216.86739f, 113.521866f, 212.15f, 115.26f),
                    PathNode.LineTo(60.15f, 171.26f),
                    PathNode.CurveTo(53.931274f, 173.55199f, 47.031982f, 170.36873f, 44.74f, 164.15f),
                    PathNode.CurveTo(42.448017f, 157.93127f, 45.631275f, 151.03198f, 51.85f, 148.74f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 188.0f),
                    PathNode.LineTo(56.0f, 188.0f),
                    PathNode.CurveTo(49.37258f, 188.0f, 44.0f, 193.37259f, 44.0f, 200.0f),
                    PathNode.CurveTo(44.0f, 206.62741f, 49.37258f, 212.0f, 56.0f, 212.0f),
                    PathNode.LineTo(208.0f, 212.0f),
                    PathNode.CurveTo(214.62741f, 212.0f, 220.0f, 206.62741f, 220.0f, 200.0f),
                    PathNode.CurveTo(220.0f, 193.37259f, 214.62741f, 188.0f, 208.0f, 188.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _greaterThanOrEqual!!
    }

private var _greaterThanOrEqual: ImageVector? = null
