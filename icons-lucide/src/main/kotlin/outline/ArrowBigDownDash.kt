package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowBigDownDash: ImageVector
    get() {
        if (_arrowBigDownDash != null) return _arrowBigDownDash!!
        _arrowBigDownDash = lucideOutlineIcon(
            name = "ArrowBigDownDash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 8.000 C 14.552 8.000 15.000 8.448 15.000 9.000 L 15.000 11.000 C 15.000 11.552 15.448 12.000 16.000 12.000 L 19.293 12.000 C 19.579 12.000 19.837 12.172 19.946 12.436 C 20.056 12.701 19.995 13.005 19.793 13.207 L 12.854 20.146 C 12.628 20.373 12.320 20.500 12.000 20.500 C 11.680 20.500 11.372 20.373 11.146 20.146 L 4.206 13.206 C 4.004 13.004 3.944 12.700 4.054 12.436 C 4.163 12.172 4.420 12.000 4.706 12.000 L 8.000 12.000 C 8.552 12.000 9.000 11.552 9.000 11.000 L 9.000 9.000 C 9.000 8.448 9.448 8.000 10.000 8.000 Z"),
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
        pathData = parseSvgPathData("M 9.000 4.000 L 15.000 4.000"),
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
        return _arrowBigDownDash!!
    }

private var _arrowBigDownDash: ImageVector? = null
