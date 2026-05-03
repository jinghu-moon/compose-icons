package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LampCeiling: ImageVector
    get() {
        if (_lampCeiling != null) return _lampCeiling!!
        _lampCeiling = lucideOutlineIcon(
            name = "LampCeiling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 L 12.000 7.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 14.829 15.998 C 15.268 17.241 14.844 18.625 13.784 19.409 C 12.724 20.192 11.276 20.192 10.216 19.409 C 9.156 18.625 8.732 17.241 9.171 15.998"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 20.920 14.606 C 21.053 14.915 21.021 15.270 20.836 15.551 C 20.650 15.832 20.336 16.000 20.000 16.000 L 4.000 16.000 C 3.664 16.000 3.350 15.832 3.164 15.551 C 2.979 15.270 2.947 14.915 3.080 14.606 L 6.080 7.606 C 6.238 7.238 6.600 7.000 7.000 7.000 L 17.000 7.000 C 17.400 7.000 17.762 7.238 17.920 7.606 Z"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _lampCeiling!!
    }

private var _lampCeiling: ImageVector? = null
