package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Layers: ImageVector
    get() {
        if (_layers != null) return _layers!!
        _layers = lucideOutlineIcon(
            name = "Layers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.830 2.180 C 12.303 1.940 11.697 1.940 11.170 2.180 L 2.600 6.080 C 2.237 6.240 2.003 6.599 2.003 6.995 C 2.003 7.391 2.237 7.750 2.600 7.910 L 11.180 11.820 C 11.707 12.060 12.313 12.060 12.840 11.820 L 21.420 7.920 C 21.783 7.760 22.017 7.401 22.017 7.005 C 22.017 6.609 21.783 6.250 21.420 6.090 Z"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 2.000 12.000 C 1.999 12.391 2.226 12.746 2.580 12.910 L 11.180 16.820 C 11.704 17.057 12.306 17.057 12.830 16.820 L 21.410 12.920 C 21.772 12.757 22.003 12.397 22.000 12.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 2.000 17.000 C 1.999 17.391 2.226 17.746 2.580 17.910 L 11.180 21.820 C 11.704 22.057 12.306 22.057 12.830 21.820 L 21.410 17.920 C 21.772 17.757 22.003 17.397 22.000 17.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _layers!!
    }

private var _layers: ImageVector? = null
