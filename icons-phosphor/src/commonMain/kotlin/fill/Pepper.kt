package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Pepper: ImageVector
    get() {
        if (_pepper != null) return _pepper!!
        _pepper = phosphorFillIcon(
            name = "Pepper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(167.27f, 40.42f),
                    PathNode.CurveTo(163.61627f, 21.613407f, 147.1582f, 8.026176f, 128.0f, 8.0f),
                    PathNode.CurveTo(123.58172f, 8.0f, 120.0f, 11.581722f, 120.0f, 16.0f),
                    PathNode.CurveTo(120.0f, 20.418278f, 123.58172f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(138.42702f, 24.000017f, 147.66107f, 30.732595f, 150.85f, 40.66f),
                    PathNode.CurveTo(119.38371f, 45.240105f, 96.03562f, 72.20215f, 96.0f, 104.0f),
                    PathNode.CurveTo(96.0f, 150.75f, 70.25f, 182.0f, 19.47f, 197.0f),
                    PathNode.CurveTo(12.317371f, 199.0849f, 7.55034f, 205.83072f, 7.973269f, 213.269f),
                    PathNode.CurveTo(8.396197f, 220.70729f, 13.897145f, 226.86928f, 21.24f, 228.13f),
                    PathNode.CurveTo(36.270226f, 230.72833f, 51.496853f, 232.02315f, 66.75f, 232.0f),
                    PathNode.CurveTo(107.53f, 232.0f, 152.91f, 222.85f, 184.28f, 196.54f),
                    PathNode.CurveTo(210.64f, 174.44f, 224.0f, 143.3f, 224.0f, 104.0f),
                    PathNode.LineTo(224.0f, 104.0f),
                    PathNode.CurveTo(223.9654f, 71.48091f, 199.57501f, 44.145443f, 167.27f, 40.42f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 95.0f),
                    PathNode.LineTo(163.58f, 80.83f),
                    PathNode.CurveTo(161.32652f, 79.70236f, 158.67348f, 79.70236f, 156.42f, 80.83f),
                    PathNode.LineTo(128.0f, 95.0f),
                    PathNode.LineTo(114.63f, 88.32f),
                    PathNode.CurveTo(121.31272f, 68.971794f, 139.53023f, 55.99045f, 160.0f, 55.99045f),
                    PathNode.CurveTo(180.46977f, 55.99045f, 198.68727f, 68.971794f, 205.37f, 88.32f),
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
        return _pepper!!
    }

private var _pepper: ImageVector? = null
