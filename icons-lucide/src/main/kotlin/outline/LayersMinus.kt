package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LayersMinus: ImageVector
    get() {
        if (_layersMinus != null) return _layersMinus!!
        _layersMinus = lucideOutlineIcon(
            name = "LayersMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.830 2.180 C 12.303 1.940 11.697 1.940 11.170 2.180 L 2.600 6.080 C 2.237 6.240 2.003 6.599 2.003 6.995 C 2.003 7.391 2.237 7.750 2.600 7.910 L 11.180 11.820 C 11.441 11.939 11.724 12.000 12.010 12.000 C 12.296 12.000 12.579 11.939 12.840 11.820 L 21.420 7.920 C 21.784 7.761 22.019 7.401 22.019 7.004 C 22.019 6.607 21.784 6.247 21.420 6.088 Z"),
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
                pathData = parseSvgPathData("M 16.000 17.000 L 22.000 17.000"),
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
                pathData = parseSvgPathData("M 2.003 11.995 C 2.003 12.391 2.237 12.750 2.600 12.910 L 11.180 16.820 C 11.441 16.939 11.724 17.000 12.010 17.000"),
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
                pathData = parseSvgPathData("M 2.003 16.995 C 2.003 17.391 2.237 17.750 2.600 17.910 L 11.180 21.820 C 11.441 21.939 11.724 22.000 12.010 22.000 C 12.296 22.000 12.579 21.939 12.840 21.820 L 14.950 20.860"),
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
                pathData = parseSvgPathData("M 22.018 12.004 C 22.018 12.401 21.783 12.760 21.420 12.920 L 21.243 13.000"),
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
        return _layersMinus!!
    }

private var _layersMinus: ImageVector? = null
