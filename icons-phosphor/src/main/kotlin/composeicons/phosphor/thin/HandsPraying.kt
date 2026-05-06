package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HandsPraying: ImageVector
    get() {
        if (_handsPraying != null) return _handsPraying!!
        _handsPraying = phosphorThinIcon(
            name = "HandsPraying",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232.49 182.83l-37-37L158.79 24.62C156.884 18.332 151.663 13.608 145.216 12.339 138.768 11.07 132.147 13.463 128 18.56c-4.147-5.097-10.768-7.49-17.216-6.221-6.447 1.269-11.668 5.992-13.574 12.281L60.46 145.88l-36.95 37c-2.259 2.252-3.529 5.31-3.529 8.5 0 3.19 1.27 6.248 3.529 8.5l32.69 32.61c2.252 2.259 5.31 3.529 8.5 3.529 3.19 0 6.248-1.27 8.5-3.529l48.28-48.29c2.632-2.624 4.841-5.64 6.55-8.94 1.709 3.3 3.918 6.316 6.55 8.94l48.28 48.29c2.252 2.259 5.31 3.529 8.5 3.529 3.19 0 6.248-1.27 8.5-3.529l32.69-32.69c4.669-4.703 4.643-12.3-.06-16.97ZM67.49 226.83c-.75 .751-1.768 1.173-2.83 1.173-1.062 0-2.08-.422-2.83-1.173L29.17 194.15c-.751-.75-1.173-1.768-1.173-2.83 0-1.062 .422-2.08 1.173-2.83L44.68 173 83 211.32ZM115.78 178.55 88.68 205.66 50.34 167.32 66.82 150.83c.468-.464 .812-1.038 1-1.67l37-122.22c1.352-4.713 5.984-7.697 10.834-6.979 4.85 .718 8.419 4.916 8.346 9.819v129c.014 7.42-2.939 14.538-8.2 19.77ZM131.98 158.75v-129c-.002-4.849 3.548-8.967 8.345-9.679 4.796-.712 9.39 2.198 10.795 6.839l37 122.22c.188 .632 .532 1.206 1 1.67l17.38 17.38-39.18 37.51L140.2 178.55c-5.269-5.24-8.222-12.37-8.2-19.8ZM226.81 194.15l-32.68 32.68c-.75 .751-1.768 1.173-2.83 1.173-1.062 0-2.08-.422-2.83-1.173L173 211.38l39.18-37.51 14.61 14.62c.756 .745 1.186 1.76 1.193 2.822 .008 1.062-.407 2.083-1.153 2.838Z"),
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
        return _handsPraying!!
    }

private var _handsPraying: ImageVector? = null
