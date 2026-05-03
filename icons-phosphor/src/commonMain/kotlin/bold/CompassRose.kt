package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CompassRose: ImageVector
    get() {
        if (_compassRose != null) return _compassRose!!
        _compassRose = phosphorBoldIcon(
            name = "CompassRose",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(247.0f, 116.39f),
                    PathNode.LineTo(226.53f, 111.05f),
                    PathNode.CurveTo(219.28911f, 69.37212f, 186.67076f, 36.721767f, 145.0f, 29.44f),
                    PathNode.LineTo(139.61f, 9.0f),
                    PathNode.CurveTo(138.22964f, 3.718679f, 133.45872f, 0.034452f, 128.0f, 0.034452f),
                    PathNode.CurveTo(122.54127f, 0.034452f, 117.770355f, 3.718679f, 116.39f, 9.0f),
                    PathNode.LineTo(111.05f, 29.47f),
                    PathNode.CurveTo(69.34819f, 36.721306f, 36.691303f, 69.37819f, 29.44f, 111.08f),
                    PathNode.LineTo(9.0f, 116.39f),
                    PathNode.CurveTo(3.718679f, 117.770355f, 0.034452f, 122.54127f, 0.034452f, 128.0f),
                    PathNode.CurveTo(0.034452f, 133.45872f, 3.718679f, 138.22964f, 9.0f, 139.61f),
                    PathNode.LineTo(29.44f, 145.0f),
                    PathNode.CurveTo(36.691303f, 186.70181f, 69.34819f, 219.35869f, 111.05f, 226.61f),
                    PathNode.LineTo(116.39f, 247.0f),
                    PathNode.CurveTo(117.770355f, 252.28133f, 122.54127f, 255.96555f, 128.0f, 255.96555f),
                    PathNode.CurveTo(133.45872f, 255.96555f, 138.22964f, 252.28133f, 139.61f, 247.0f),
                    PathNode.LineTo(145.0f, 226.56f),
                    PathNode.CurveTo(186.66745f, 219.29616f, 219.29616f, 186.66745f, 226.56f, 145.0f),
                    PathNode.LineTo(247.0f, 139.61f),
                    PathNode.CurveTo(252.28133f, 138.22964f, 255.96555f, 133.45872f, 255.96555f, 128.0f),
                    PathNode.CurveTo(255.96555f, 122.54127f, 252.28133f, 117.770355f, 247.0f, 116.39f),
                    PathNode.Close,
                    PathNode.MoveTo(200.12f, 104.16f),
                    PathNode.LineTo(161.81f, 94.16f),
                    PathNode.LineTo(151.81f, 55.85f),
                    PathNode.CurveTo(174.63588f, 63.436043f, 192.54979f, 81.338844f, 200.15f, 104.16f),
                    PathNode.Close,
                    PathNode.MoveTo(117.32f, 100.38f),
                    PathNode.LineTo(128.0f, 59.54f),
                    PathNode.LineTo(138.65f, 100.38f),
                    PathNode.LineTo(128.0f, 111.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 145.0f),
                    PathNode.LineTo(138.65f, 155.65f),
                    PathNode.LineTo(128.0f, 196.46f),
                    PathNode.LineTo(117.35f, 155.62f),
                    PathNode.Close,
                    PathNode.MoveTo(100.38f, 117.38f),
                    PathNode.LineTo(111.0f, 128.0f),
                    PathNode.LineTo(100.35f, 138.65f),
                    PathNode.LineTo(59.54f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(155.62f, 138.68f),
                    PathNode.LineTo(145.0f, 128.0f),
                    PathNode.LineTo(155.65f, 117.35f),
                    PathNode.LineTo(196.46f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.16f, 55.88f),
                    PathNode.LineTo(94.16f, 94.19f),
                    PathNode.LineTo(55.85f, 104.19f),
                    PathNode.CurveTo(63.436043f, 81.364136f, 81.338844f, 63.45021f, 104.16f, 55.85f),
                    PathNode.Close,
                    PathNode.MoveTo(55.85f, 151.88f),
                    PathNode.LineTo(94.16f, 161.88f),
                    PathNode.LineTo(104.16f, 200.19f),
                    PathNode.CurveTo(81.3366f, 192.58774f, 63.433376f, 174.66968f, 55.85f, 151.84f),
                    PathNode.Close,
                    PathNode.MoveTo(151.85f, 200.19f),
                    PathNode.LineTo(161.85f, 161.88f),
                    PathNode.LineTo(200.16f, 151.88f),
                    PathNode.CurveTo(192.55325f, 174.68137f, 174.64923f, 192.56686f, 151.84f, 200.15f),
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
        return _compassRose!!
    }

private var _compassRose: ImageVector? = null
