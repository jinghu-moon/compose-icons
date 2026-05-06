package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ToothFill: ImageVector
    get() {
        if (_toothFill != null) return _toothFill!!
        _toothFill = remixIcon(
            name = "ToothFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 3.232c1.582 .824 2.782 2.28 3.266 4.034 .147 .532 .698 .845 1.23 .698 .532-.147 .845-.698 .698-1.23C16.735 5.068 15.781 3.607 14.5 2.519c.165-.013 .332-.019 .5-.019 2.007 0 3.679 .728 4.831 2.11 1.131 1.358 1.669 3.236 1.669 5.39 0 3.097-.514 5.865-1.395 7.898-.84 1.939-2.208 3.602-4.105 3.602-1.1 0-1.787-.652-2.195-1.36-.362-.629-.578-1.423-.752-2.062-.207-.76-.366-1.327-.591-1.72C12.275 16.035 12.15 16 12 16c-.15 0-.275 .035-.462 .358-.226 .392-.384 .96-.591 1.72h0c-.174 .639-.39 1.433-.752 2.062C9.787 20.848 9.1 21.5 8 21.5c-1.897 0-3.265-1.664-4.105-3.602C3.014 15.865 2.5 13.097 2.5 10c0-2.154 .538-4.033 1.669-5.39C5.321 3.228 6.993 2.5 9 2.5c.009 0 .019 0 .028 0 1.07 .005 2.081 .269 2.972 .732 0-0 0-0 0-0Z"),
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
        return _toothFill!!
    }

private var _toothFill: ImageVector? = null
