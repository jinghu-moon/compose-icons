package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ClockAfternoon: ImageVector
    get() {
        if (_clockAfternoon != null) return _clockAfternoon!!
        _clockAfternoon = phosphorFillIcon(
            name = "ClockAfternoon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 136.0f),
                    PathNode.LineTo(147.31f, 136.0f),
                    PathNode.LineTo(173.66f, 162.34f),
                    PathNode.CurveTo(176.78593f, 165.46593f, 176.78593f, 170.53407f, 173.66f, 173.66f),
                    PathNode.CurveTo(170.53407f, 176.78593f, 165.46593f, 176.78593f, 162.34f, 173.66f),
                    PathNode.LineTo(122.34f, 133.66f),
                    PathNode.CurveTo(120.04936f, 131.3719f, 119.36368f, 127.92874f, 120.60302f, 124.937675f),
                    PathNode.CurveTo(121.84236f, 121.94662f, 124.762344f, 119.99745f, 128.0f, 120.0f),
                    PathNode.LineTo(184.0f, 120.0f),
                    PathNode.CurveTo(188.41827f, 120.0f, 192.0f, 123.58172f, 192.0f, 128.0f),
                    PathNode.CurveTo(192.0f, 132.41827f, 188.41827f, 136.0f, 184.0f, 136.0f),
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
        return _clockAfternoon!!
    }

private var _clockAfternoon: ImageVector? = null
