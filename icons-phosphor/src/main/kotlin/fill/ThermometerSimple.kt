package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ThermometerSimple: ImageVector
    get() {
        if (_thermometerSimple != null) return _thermometerSimple!!
        _thermometerSimple = phosphorFillIcon(
            name = "ThermometerSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 146.08f),
                    PathNode.LineTo(160.0f, 40.0f),
                    PathNode.CurveTo(160.0f, 22.326887f, 145.67311f, 8.0f, 128.0f, 8.0f),
                    PathNode.CurveTo(110.32689f, 8.0f, 96.0f, 22.326887f, 96.0f, 40.0f),
                    PathNode.LineTo(96.0f, 146.08f),
                    PathNode.CurveTo(75.92032f, 160.06169f, 67.24275f, 185.46092f, 74.56984f, 208.80606f),
                    PathNode.CurveTo(81.89693f, 232.15118f, 103.53203f, 248.0365f, 128.0f, 248.0365f),
                    PathNode.CurveTo(152.46797f, 248.0365f, 174.10307f, 232.15118f, 181.43016f, 208.80606f),
                    PathNode.CurveTo(188.75725f, 185.46092f, 180.07968f, 160.06169f, 160.0f, 146.08f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(136.83656f, 24.0f, 144.0f, 31.163445f, 144.0f, 40.0f),
                    PathNode.LineTo(144.0f, 104.0f),
                    PathNode.LineTo(112.0f, 104.0f),
                    PathNode.LineTo(112.0f, 40.0f),
                    PathNode.CurveTo(112.0f, 31.163445f, 119.163445f, 24.0f, 128.0f, 24.0f),
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
        return _thermometerSimple!!
    }

private var _thermometerSimple: ImageVector? = null
