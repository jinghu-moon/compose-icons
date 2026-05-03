package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowURightUp: ImageVector
    get() {
        if (_arrowURightUp != null) return _arrowURightUp!!
        _arrowURightUp = phosphorFillIcon(
            name = "ArrowURightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(223.39f, 83.06f),
                    PathNode.CurveTo(222.15236f, 86.04962f, 219.23566f, 87.99934f, 216.0f, 88.0f),
                    PathNode.LineTo(176.0f, 88.0f),
                    PathNode.LineTo(176.0f, 168.0f),
                    PathNode.CurveTo(176.0f, 203.34622f, 147.34622f, 232.0f, 112.0f, 232.0f),
                    PathNode.CurveTo(76.65378f, 232.0f, 48.0f, 203.34622f, 48.0f, 168.0f),
                    PathNode.LineTo(48.0f, 80.0f),
                    PathNode.CurveTo(48.0f, 75.58172f, 51.581722f, 72.0f, 56.0f, 72.0f),
                    PathNode.CurveTo(60.418278f, 72.0f, 64.0f, 75.58172f, 64.0f, 80.0f),
                    PathNode.LineTo(64.0f, 168.0f),
                    PathNode.CurveTo(64.0f, 194.50967f, 85.49033f, 216.0f, 112.0f, 216.0f),
                    PathNode.CurveTo(138.50967f, 216.0f, 160.0f, 194.50967f, 160.0f, 168.0f),
                    PathNode.LineTo(160.0f, 88.0f),
                    PathNode.LineTo(120.0f, 88.0f),
                    PathNode.CurveTo(116.762344f, 88.00255f, 113.84236f, 86.05338f, 112.60302f, 83.062325f),
                    PathNode.CurveTo(111.36368f, 80.07126f, 112.04936f, 76.62809f, 114.34f, 74.34f),
                    PathNode.LineTo(162.34f, 26.34f),
                    PathNode.CurveTo(163.84055f, 24.837784f, 165.87672f, 23.993708f, 168.0f, 23.993708f),
                    PathNode.CurveTo(170.12328f, 23.993708f, 172.15945f, 24.837784f, 173.66f, 26.34f),
                    PathNode.LineTo(221.66f, 74.34f),
                    PathNode.CurveTo(223.94725f, 76.62924f, 224.63007f, 80.07096f, 223.39f, 83.06f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _arrowURightUp!!
    }

private var _arrowURightUp: ImageVector? = null
