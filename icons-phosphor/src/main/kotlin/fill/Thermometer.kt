package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Thermometer: ImageVector
    get() {
        if (_thermometer != null) return _thermometer!!
        _thermometer = phosphorFillIcon(
            name = "Thermometer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 56.0f),
                    PathNode.CurveTo(196.53603f, 56.0f, 184.0f, 68.536026f, 184.0f, 84.0f),
                    PathNode.CurveTo(184.0f, 99.463974f, 196.53603f, 112.0f, 212.0f, 112.0f),
                    PathNode.CurveTo(227.46397f, 112.0f, 240.0f, 99.463974f, 240.0f, 84.0f),
                    PathNode.CurveTo(240.0f, 68.536026f, 227.46397f, 56.0f, 212.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 96.0f),
                    PathNode.CurveTo(205.37259f, 96.0f, 200.0f, 90.62742f, 200.0f, 84.0f),
                    PathNode.CurveTo(200.0f, 77.37258f, 205.37259f, 72.0f, 212.0f, 72.0f),
                    PathNode.CurveTo(218.62741f, 72.0f, 224.0f, 77.37258f, 224.0f, 84.0f),
                    PathNode.CurveTo(224.0f, 90.62742f, 218.62741f, 96.0f, 212.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 146.08f),
                    PathNode.LineTo(152.0f, 40.0f),
                    PathNode.CurveTo(152.0f, 22.326887f, 137.67311f, 8.0f, 120.0f, 8.0f),
                    PathNode.CurveTo(102.32689f, 8.0f, 88.0f, 22.326887f, 88.0f, 40.0f),
                    PathNode.LineTo(88.0f, 146.08f),
                    PathNode.CurveTo(67.92032f, 160.06169f, 59.242752f, 185.46092f, 66.56984f, 208.80606f),
                    PathNode.CurveTo(73.89693f, 232.15118f, 95.53203f, 248.0365f, 120.0f, 248.0365f),
                    PathNode.CurveTo(144.46797f, 248.0365f, 166.10307f, 232.15118f, 173.43016f, 208.80606f),
                    PathNode.CurveTo(180.75725f, 185.46092f, 172.07968f, 160.06169f, 152.0f, 146.08f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 104.0f),
                    PathNode.LineTo(104.0f, 104.0f),
                    PathNode.LineTo(104.0f, 40.0f),
                    PathNode.CurveTo(104.0f, 31.163445f, 111.163445f, 24.0f, 120.0f, 24.0f),
                    PathNode.CurveTo(128.83656f, 24.0f, 136.0f, 31.163445f, 136.0f, 40.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _thermometer!!
    }

private var _thermometer: ImageVector? = null
