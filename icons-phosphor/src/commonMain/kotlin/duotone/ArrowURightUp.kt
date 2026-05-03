package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowURightUp: ImageVector
    get() {
        if (_arrowURightUp != null) return _arrowURightUp!!
        _arrowURightUp = phosphorDuotoneIcon(
            name = "ArrowURightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 80.0f),
                    PathNode.LineTo(120.0f, 80.0f),
                    PathNode.LineTo(168.0f, 32.0f),
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
                    PathNode.MoveTo(221.66f, 74.34f),
                    PathNode.LineTo(173.66f, 26.34f),
                    PathNode.CurveTo(172.15945f, 24.837784f, 170.12328f, 23.993708f, 168.0f, 23.993708f),
                    PathNode.CurveTo(165.87672f, 23.993708f, 163.84055f, 24.837784f, 162.34f, 26.34f),
                    PathNode.LineTo(114.34f, 74.34f),
                    PathNode.CurveTo(112.04936f, 76.62809f, 111.36368f, 80.07126f, 112.60302f, 83.062325f),
                    PathNode.CurveTo(113.84236f, 86.05338f, 116.762344f, 88.00255f, 120.0f, 88.0f),
                    PathNode.LineTo(160.0f, 88.0f),
                    PathNode.LineTo(160.0f, 168.0f),
                    PathNode.CurveTo(160.0f, 194.50967f, 138.50967f, 216.0f, 112.0f, 216.0f),
                    PathNode.CurveTo(85.49033f, 216.0f, 64.0f, 194.50967f, 64.0f, 168.0f),
                    PathNode.LineTo(64.0f, 80.0f),
                    PathNode.CurveTo(64.0f, 75.58172f, 60.418278f, 72.0f, 56.0f, 72.0f),
                    PathNode.CurveTo(51.581722f, 72.0f, 48.0f, 75.58172f, 48.0f, 80.0f),
                    PathNode.LineTo(48.0f, 168.0f),
                    PathNode.CurveTo(48.0f, 203.34622f, 76.65378f, 232.0f, 112.0f, 232.0f),
                    PathNode.CurveTo(147.34622f, 232.0f, 176.0f, 203.34622f, 176.0f, 168.0f),
                    PathNode.LineTo(176.0f, 88.0f),
                    PathNode.LineTo(216.0f, 88.0f),
                    PathNode.CurveTo(219.23764f, 88.00255f, 222.15764f, 86.05338f, 223.39697f, 83.062325f),
                    PathNode.CurveTo(224.63632f, 80.07126f, 223.95064f, 76.62809f, 221.66f, 74.34f),
                    PathNode.Close,
                    PathNode.MoveTo(139.31f, 72.0f),
                    PathNode.LineTo(168.0f, 43.31f),
                    PathNode.LineTo(196.69f, 72.0f),
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
        return _arrowURightUp!!
    }

private var _arrowURightUp: ImageVector? = null
