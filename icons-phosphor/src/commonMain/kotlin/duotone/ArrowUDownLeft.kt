package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowUDownLeft: ImageVector
    get() {
        if (_arrowUDownLeft != null) return _arrowUDownLeft!!
        _arrowUDownLeft = phosphorDuotoneIcon(
            name = "ArrowUDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(80.0f, 120.0f),
                    PathNode.LineTo(80.0f, 216.0f),
                    PathNode.LineTo(32.0f, 168.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 48.0f),
                    PathNode.LineTo(80.0f, 48.0f),
                    PathNode.CurveTo(75.58172f, 48.0f, 72.0f, 51.581722f, 72.0f, 56.0f),
                    PathNode.CurveTo(72.0f, 60.418278f, 75.58172f, 64.0f, 80.0f, 64.0f),
                    PathNode.LineTo(168.0f, 64.0f),
                    PathNode.CurveTo(194.50967f, 64.0f, 216.0f, 85.49033f, 216.0f, 112.0f),
                    PathNode.CurveTo(216.0f, 138.50967f, 194.50967f, 160.0f, 168.0f, 160.0f),
                    PathNode.LineTo(88.0f, 160.0f),
                    PathNode.LineTo(88.0f, 120.0f),
                    PathNode.CurveTo(88.00255f, 116.762344f, 86.05338f, 113.84236f, 83.062325f, 112.60302f),
                    PathNode.CurveTo(80.07126f, 111.36368f, 76.62809f, 112.04936f, 74.34f, 114.34f),
                    PathNode.LineTo(26.34f, 162.34f),
                    PathNode.CurveTo(24.837784f, 163.84055f, 23.993708f, 165.87672f, 23.993708f, 168.0f),
                    PathNode.CurveTo(23.993708f, 170.12328f, 24.837784f, 172.15945f, 26.34f, 173.66f),
                    PathNode.LineTo(74.34f, 221.66f),
                    PathNode.CurveTo(76.62809f, 223.95064f, 80.07126f, 224.63632f, 83.062325f, 223.39697f),
                    PathNode.CurveTo(86.05338f, 222.15764f, 88.00255f, 219.23764f, 88.0f, 216.0f),
                    PathNode.LineTo(88.0f, 176.0f),
                    PathNode.LineTo(168.0f, 176.0f),
                    PathNode.CurveTo(203.34622f, 176.0f, 232.0f, 147.34622f, 232.0f, 112.0f),
                    PathNode.CurveTo(232.0f, 76.65378f, 203.34622f, 48.0f, 168.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 196.69f),
                    PathNode.LineTo(43.31f, 168.0f),
                    PathNode.LineTo(72.0f, 139.31f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowUDownLeft!!
    }

private var _arrowUDownLeft: ImageVector? = null
