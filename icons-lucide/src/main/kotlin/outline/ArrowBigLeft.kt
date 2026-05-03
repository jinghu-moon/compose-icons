package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowBigLeft: ImageVector
    get() {
        if (_arrowBigLeft != null) return _arrowBigLeft!!
        _arrowBigLeft = lucideOutlineIcon(
            name = "ArrowBigLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.793 19.793 C 10.995 19.995 11.299 20.056 11.564 19.946 C 11.828 19.837 12.000 19.579 12.000 19.293 L 12.000 16.000 C 12.000 15.448 12.448 15.000 13.000 15.000 L 19.000 15.000 C 19.552 15.000 20.000 14.552 20.000 14.000 L 20.000 10.000 C 20.000 9.448 19.552 9.000 19.000 9.000 L 13.000 9.000 C 12.448 9.000 12.000 8.552 12.000 8.000 L 12.000 4.707 C 12.000 4.421 11.828 4.163 11.564 4.054 C 11.299 3.944 10.995 4.005 10.793 4.207 L 3.853 11.147 C 3.627 11.373 3.499 11.680 3.499 12.000 C 3.499 12.321 3.627 12.628 3.853 12.854 Z"),
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
        return _arrowBigLeft!!
    }

private var _arrowBigLeft: ImageVector? = null
