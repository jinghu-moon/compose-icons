package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowBigDown: ImageVector
    get() {
        if (_arrowBigDown != null) return _arrowBigDown!!
        _arrowBigDown = lucideOutlineIcon(
            name = "ArrowBigDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.000 5.000 C 9.000 4.448 9.448 4.000 10.000 4.000 L 14.000 4.000 C 14.552 4.000 15.000 4.448 15.000 5.000 L 15.000 11.000 C 15.000 11.552 15.448 12.000 16.000 12.000 L 19.293 12.000 C 19.579 12.000 19.837 12.172 19.946 12.436 C 20.056 12.701 19.995 13.005 19.793 13.207 L 12.707 20.293 C 12.316 20.683 11.684 20.683 11.293 20.293 L 4.207 13.207 C 4.005 13.005 3.944 12.701 4.054 12.436 C 4.163 12.172 4.421 12.000 4.707 12.000 L 8.000 12.000 C 8.552 12.000 9.000 11.552 9.000 11.000 Z"),
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
        return _arrowBigDown!!
    }

private var _arrowBigDown: ImageVector? = null
