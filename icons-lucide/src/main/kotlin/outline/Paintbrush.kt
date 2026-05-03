package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Paintbrush: ImageVector
    get() {
        if (_paintbrush != null) return _paintbrush!!
        _paintbrush = lucideOutlineIcon(
            name = "Paintbrush",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.622 17.897 L 3.942 14.984"),
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
                pathData = parseSvgPathData("M 18.376 2.622 C 19.205 1.793 20.549 1.793 21.378 2.622 C 22.207 3.451 22.207 4.795 21.378 5.624 L 17.360 9.643 C 17.165 9.838 17.165 10.155 17.360 10.350 L 18.304 11.294 C 19.245 12.235 19.245 13.761 18.304 14.702 L 17.360 15.646 C 17.165 15.841 16.848 15.841 16.653 15.646 L 8.354 7.348 C 8.159 7.153 8.159 6.836 8.354 6.641 L 9.298 5.697 C 10.239 4.756 11.765 4.756 12.706 5.697 L 13.650 6.641 C 13.845 6.836 14.162 6.836 14.357 6.641 Z"),
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
                pathData = parseSvgPathData("M 9.000 8.000 C 7.196 10.710 5.030 11.460 2.417 11.948 C 2.241 11.980 2.094 12.103 2.032 12.271 C 1.970 12.440 2.002 12.628 2.115 12.767 L 9.435 21.650 C 9.740 21.974 10.224 22.058 10.620 21.854 C 12.735 20.405 16.000 16.792 16.000 15.000"),
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
        return _paintbrush!!
    }

private var _paintbrush: ImageVector? = null
