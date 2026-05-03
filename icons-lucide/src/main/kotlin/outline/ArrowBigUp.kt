package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowBigUp: ImageVector
    get() {
        if (_arrowBigUp != null) return _arrowBigUp!!
        _arrowBigUp = lucideOutlineIcon(
            name = "ArrowBigUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.000 19.000 C 9.000 19.552 9.448 20.000 10.000 20.000 L 14.000 20.000 C 14.552 20.000 15.000 19.552 15.000 19.000 L 15.000 13.000 C 15.000 12.448 15.448 12.000 16.000 12.000 L 19.293 12.000 C 19.579 12.000 19.837 11.828 19.946 11.564 C 20.056 11.299 19.995 10.995 19.793 10.793 L 12.707 3.707 C 12.316 3.317 11.684 3.317 11.293 3.707 L 4.207 10.793 C 4.005 10.995 3.944 11.299 4.054 11.564 C 4.163 11.828 4.421 12.000 4.707 12.000 L 8.000 12.000 C 8.552 12.000 9.000 12.448 9.000 13.000 Z"),
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
        return _arrowBigUp!!
    }

private var _arrowBigUp: ImageVector? = null
