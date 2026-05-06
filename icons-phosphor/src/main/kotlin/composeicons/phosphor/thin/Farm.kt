package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Farm: ImageVector
    get() {
        if (_farm != null) return _farm!!
        _farm = phosphorThinIcon(
            name = "Farm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 156c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4-22.504-.014-44.887 3.302-66.42 9.84-8.887-5.79-18.125-11.024-27.66-15.67C167.816 130.106 199.762 123.937 232 124c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4q-10.06 0-20 .76v-36.76c0-1.259-.593-2.445-1.6-3.2l-64-48c-1.422-1.067-3.378-1.067-4.8 0L77.6 76.8C76.593 77.555 76 78.741 76 80v41.2C58.884 117.736 41.463 115.994 24 116c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4 76.557-.15 148.996 34.646 196.73 94.5 1.403 1.643 3.857 1.875 5.543 .524 1.686-1.351 1.995-3.797 .697-5.524-6.661-8.307-13.821-16.202-21.44-23.64 8.769-1.236 17.614-1.857 26.47-1.86 2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4-11.343 .003-22.664 .98-33.84 2.92-7.615-6.882-15.629-13.31-24-19.25C193.015 158.562 212.465 155.983 232 156ZM164 125c-12.27 3.332-24.279 7.56-35.93 12.65-1.36-.58-2.71-1.18-4.07-1.74v-35.91h40ZM84 82 144 37l60 45v35.49c-10.77 1.145-21.458 2.965-32 5.45v-26.94c0-2.209-1.791-4-4-4h-48c-2.209 0-4 1.791-4 4v36.71C105.554 128.786 94.865 125.543 84 123ZM133.5 218.21c-.587 .885-1.502 1.501-2.543 1.711-1.041 .21-2.123-.002-3.007-.591C97.159 198.841 60.985 187.938 24 188c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4 38.561-.059 76.275 11.31 108.38 32.67 1.837 1.222 2.339 3.701 1.12 5.54ZM183.57 213.14c1.58 1.546 1.606 4.08 .06 5.66-1.546 1.58-4.08 1.606-5.66 .06C136.923 178.454 81.597 155.867 24 156c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4 59.691-.14 117.03 23.266 159.57 65.14Z"),
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
        return _farm!!
    }

private var _farm: ImageVector? = null
