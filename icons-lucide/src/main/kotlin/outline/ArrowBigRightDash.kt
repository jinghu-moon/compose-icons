package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowBigRightDash: ImageVector
    get() {
        if (_arrowBigRightDash != null) return _arrowBigRightDash!!
        _arrowBigRightDash = lucideOutlineIcon(
            name = "ArrowBigRightDash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 9.000 C 11.552 9.000 12.000 8.552 12.000 8.000 L 12.000 4.707 C 12.000 4.421 12.172 4.163 12.436 4.054 C 12.701 3.944 13.005 4.005 13.207 4.207 L 20.147 11.147 C 20.373 11.373 20.501 11.680 20.501 12.000 C 20.501 12.321 20.373 12.628 20.147 12.854 L 13.207 19.794 C 13.005 19.996 12.701 20.057 12.436 19.947 C 12.172 19.838 12.000 19.580 12.000 19.294 L 12.000 16.000 C 12.000 15.448 11.552 15.000 11.000 15.000 L 9.000 15.000 C 8.448 15.000 8.000 14.552 8.000 14.000 L 8.000 10.000 C 8.000 9.448 8.448 9.000 9.000 9.000 Z"),
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
        pathData = parseSvgPathData("M 4.000 9.000 L 4.000 15.000"),
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
        return _arrowBigRightDash!!
    }

private var _arrowBigRightDash: ImageVector? = null
