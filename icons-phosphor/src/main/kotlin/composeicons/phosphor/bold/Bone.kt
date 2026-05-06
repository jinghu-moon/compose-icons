package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bone: ImageVector
    get() {
        if (_bone != null) return _bone!!
        _bone = phosphorBoldIcon(
            name = "Bone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M234.74 58.31C228.792 51.161 220.532 46.315 211.39 44.61 208.412 29.252 196.753 17.039 181.549 13.352 166.345 9.665 150.388 15.179 140.704 27.467c-9.683 12.288-11.314 29.093-4.174 43.013l-66 66.05c-13.92-7.14-30.725-5.509-43.013 4.174C15.229 150.388 9.715 166.345 13.402 181.549c3.687 15.204 15.9 26.862 31.258 29.841 2.973 15.362 14.63 27.581 29.836 31.272 15.206 3.691 31.167-1.823 40.853-14.112 9.685-12.29 11.315-29.098 4.172-43.02l66.05-66.06c16.927 8.9 37.787 4.573 49.777-10.326 11.99-14.899 11.757-36.201-.557-50.834ZM216.1 94.51c-5.181 5.908-13.886 7.18-20.54 3-7.906-5.004-18.225-3.857-24.84 2.76l-70.4 70.4c-6.614 6.618-7.756 16.936-2.75 24.84 3.737 6.024 3.065 13.788-1.652 19.08-4.716 5.292-12.352 6.85-18.765 3.828-6.412-3.022-10.072-9.902-8.994-16.908 .528-3.458-.48-6.974-2.759-9.628-2.279-2.654-5.603-4.181-9.101-4.182-.619-.003-1.238 .044-1.85 .14-7.009 1.085-13.895-2.574-16.919-8.988-3.024-6.415-1.465-14.055 3.831-18.772 5.296-4.717 13.065-5.384 19.089-1.64 7.904 4.998 18.217 3.852 24.83-2.76L155.68 85.28c6.617-6.615 7.764-16.934 2.76-24.84-3.744-6.023-3.077-13.792 1.64-19.088 4.717-5.296 12.357-6.855 18.772-3.831 6.415 3.024 10.073 9.911 8.988 16.919-.592 3.787 .66 7.629 3.371 10.339 2.71 2.71 6.552 3.963 10.339 3.371 6.662-1.067 13.278 2.159 16.539 8.067 3.261 5.907 2.465 13.225-1.989 18.293Z"),
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
        return _bone!!
    }

private var _bone: ImageVector? = null
