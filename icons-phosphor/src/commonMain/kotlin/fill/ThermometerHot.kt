package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ThermometerHot: ImageVector
    get() {
        if (_thermometerHot != null) return _thermometerHot!!
        _thermometerHot = phosphorFillIcon(
            name = "ThermometerHot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
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
                    PathNode.MoveTo(136.0f, 56.0f),
                    PathNode.LineTo(104.0f, 56.0f),
                    PathNode.LineTo(104.0f, 40.0f),
                    PathNode.CurveTo(104.0f, 31.163445f, 111.163445f, 24.0f, 120.0f, 24.0f),
                    PathNode.CurveTo(128.83656f, 24.0f, 136.0f, 31.163445f, 136.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(177.3f, 80.77f),
                    PathNode.CurveTo(174.887f, 77.0696f, 175.9301f, 72.11376f, 179.63f, 69.7f),
                    PathNode.CurveTo(194.63f, 59.91f, 206.5f, 64.95f, 215.14f, 68.64f),
                    PathNode.CurveTo(223.0f, 72.0f, 227.76f, 74.0f, 235.63f, 68.89f),
                    PathNode.CurveTo(239.33307f, 66.47652f, 244.29152f, 67.521935f, 246.705f, 71.225f),
                    PathNode.CurveTo(249.11848f, 74.92807f, 248.07307f, 79.88651f, 244.37f, 82.3f),
                    PathNode.CurveTo(237.88f, 86.53f, 232.0f, 88.0f, 226.69f, 88.0f),
                    PathNode.CurveTo(219.69f, 88.0f, 213.77f, 85.46f, 208.86f, 83.37f),
                    PathNode.CurveTo(201.0f, 80.0f, 196.24f, 78.0f, 188.37f, 83.11f),
                    PathNode.CurveTo(186.59177f, 84.26784f, 184.42639f, 84.671776f, 182.35031f, 84.23293f),
                    PathNode.CurveTo(180.27423f, 83.79408f, 178.45755f, 82.548416f, 177.3f, 80.77f),
                    PathNode.Close,
                    PathNode.MoveTo(246.7f, 103.23f),
                    PathNode.CurveTo(249.113f, 106.9304f, 248.0699f, 111.88624f, 244.37f, 114.3f),
                    PathNode.CurveTo(237.88f, 118.53f, 232.0f, 120.0f, 226.69f, 120.0f),
                    PathNode.CurveTo(219.69f, 120.0f, 213.77f, 117.46f, 208.86f, 115.37f),
                    PathNode.CurveTo(200.99f, 112.01f, 196.24f, 109.99f, 188.37f, 115.12f),
                    PathNode.CurveTo(184.66693f, 117.533485f, 179.70848f, 116.48807f, 177.295f, 112.785f),
                    PathNode.CurveTo(174.88152f, 109.08194f, 175.92693f, 104.12348f, 179.63f, 101.71f),
                    PathNode.CurveTo(194.63f, 91.92f, 206.5f, 96.96f, 215.14f, 100.65f),
                    PathNode.CurveTo(223.01f, 104.01f, 227.76f, 106.04f, 235.63f, 100.9f),
                    PathNode.CurveTo(239.3304f, 98.487f, 244.28624f, 99.5301f, 246.7f, 103.23f),
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
        return _thermometerHot!!
    }

private var _thermometerHot: ImageVector? = null
