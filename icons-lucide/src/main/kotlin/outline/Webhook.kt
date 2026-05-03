package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Webhook: ImageVector
    get() {
        if (_webhook != null) return _webhook!!
        _webhook = lucideOutlineIcon(
            name = "Webhook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 16.980 L 12.010 16.980 C 10.910 16.980 10.060 17.920 9.530 18.880 C 8.667 20.500 6.812 21.324 5.031 20.880 C 3.250 20.435 2.001 18.835 2.000 17.000 C 2.010 16.300 2.200 15.600 2.570 15.000"),
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
                pathData = parseSvgPathData("M 6.000 17.000 L 9.130 11.220 C 9.660 10.250 9.230 9.040 8.630 8.120 C 7.859 6.887 7.818 5.333 8.523 4.061 C 9.227 2.789 10.567 2.000 12.021 1.999 C 13.475 1.999 14.815 2.788 15.520 4.060"),
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
                pathData = parseSvgPathData("M 12.000 6.000 L 15.130 11.730 C 15.660 12.700 16.900 13.000 18.000 13.000 C 20.209 13.000 22.000 14.791 22.000 17.000 C 22.000 19.209 20.209 21.000 18.000 21.000"),
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
        return _webhook!!
    }

private var _webhook: ImageVector? = null
