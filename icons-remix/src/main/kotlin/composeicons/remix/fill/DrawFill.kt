package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DrawFill: ImageVector
    get() {
        if (_drawFill != null) return _drawFill!!
        _drawFill = remixIcon(
            name = "DrawFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.656 2.101c.39-.391 1.024-.391 1.415 0l2.828 2.828c.39 .39 .39 1.024 0 1.414l-3.672 3.671c.861 1.12 1.543 2.236 1.999 3.272 .381 .866 .627 1.726 .66 2.512 .033 .786-.149 1.606-.755 2.213-.813 .813-1.991 .865-3.041 .649-1.085-.222-2.303-.775-3.527-1.55l1.07-1.69c1.105 .699 2.092 1.124 2.858 1.281 .802 .164 1.123-.002 1.226-.104 .077-.077 .19-.266 .171-.715-.019-.451-.171-1.056-.493-1.789-.357-.811-.896-1.717-1.595-2.652l-1.973 1.974c-.188 .188-.442 .293-.707 .293h-2.828c-.552 0-1-.448-1-1v-2.828c0-.265 .106-.519 .293-.707L12.442 7.313C11.484 6.749 10.512 6.371 9.596 6.188 7.887 5.846 6.497 6.188 5.636 7.05c-.862 .862-1.204 2.252-.862 3.961 .34 1.7 1.346 3.594 2.983 5.232 1.758 1.758 3.808 2.786 5.596 3.048l-.289 1.979C10.785 20.935 8.355 19.669 6.343 17.657 4.465 15.78 3.24 13.541 2.812 11.402 2.387 9.272 2.74 7.117 4.222 5.636 5.703 4.154 7.858 3.801 9.988 4.227c1.3 .26 2.637 .817 3.907 1.634L17.656 2.101Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _drawFill!!
    }

private var _drawFill: ImageVector? = null
