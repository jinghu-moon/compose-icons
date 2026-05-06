package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ApproximateEquals: ImageVector
    get() {
        if (_approximateEquals != null) return _approximateEquals!!
        _approximateEquals = phosphorRegularIcon(
            name = "ApproximateEquals",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222.16 153.26c2.823 3.385 2.376 8.416-1 11.25C203.8 178.89 188.3 184 174.16 184c-18.58 0-34.82-8.81-49.93-17C98.88 153.25 76.99 141.37 45.16 167.74c-2.184 1.936-5.25 2.529-7.999 1.547-2.749-.982-4.744-3.384-5.207-6.266-.462-2.882 .682-5.788 2.986-7.58 40.17-33.27 70.32-16.92 96.93-2.48 25.35 13.75 47.24 25.62 79.07-.75 3.394-2.79 8.403-2.322 11.22 1.05ZM45.16 103.8c31.83-26.37 53.72-14.5 79.07-.75 15.11 8.2 31.35 17 49.93 17 14.14 0 29.64-5.11 47-19.49 2.304-1.793 3.448-4.698 2.986-7.58-.462-2.882-2.458-5.284-5.207-6.266-2.749-.982-5.815-.39-7.999 1.547-31.83 26.37-53.72 14.49-79.07 .74C105.26 74.57 75.11 58.21 34.94 91.48c-3.119 2.88-3.445 7.696-.742 10.97 2.703 3.274 7.493 3.867 10.912 1.35Z"),
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
        return _approximateEquals!!
    }

private var _approximateEquals: ImageVector? = null
