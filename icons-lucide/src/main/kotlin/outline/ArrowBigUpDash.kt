package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowBigUpDash: ImageVector
    get() {
        if (_arrowBigUpDash != null) return _arrowBigUpDash!!
        _arrowBigUpDash = lucideOutlineIcon(
            name = "ArrowBigUpDash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 16.000 C 14.552 16.000 15.000 15.552 15.000 15.000 L 15.000 13.000 C 15.000 12.448 15.448 12.000 16.000 12.000 L 19.293 12.000 C 19.579 12.000 19.837 11.828 19.946 11.564 C 20.056 11.299 19.995 10.995 19.793 10.793 L 12.854 3.854 C 12.628 3.627 12.320 3.500 12.000 3.500 C 11.680 3.500 11.372 3.627 11.146 3.854 L 4.206 10.794 C 4.004 10.996 3.944 11.300 4.054 11.564 C 4.163 11.828 4.420 12.000 4.706 12.000 L 8.000 12.000 C 8.552 12.000 9.000 12.448 9.000 13.000 L 9.000 15.000 C 9.000 15.552 9.448 16.000 10.000 16.000 Z"),
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
                pathData = parseSvgPathData("M 9.000 20.000 L 15.000 20.000"),
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
        return _arrowBigUpDash!!
    }

private var _arrowBigUpDash: ImageVector? = null
