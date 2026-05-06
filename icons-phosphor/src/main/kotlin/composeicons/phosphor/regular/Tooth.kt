package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Tooth: ImageVector
    get() {
        if (_tooth != null) return _tooth!!
        _tooth = phosphorRegularIcon(
            name = "Tooth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M171 71.42 149.54 80 171 88.57c4.101 1.657 6.082 6.324 4.425 10.425-1.657 4.101-6.324 6.082-10.425 4.425L128 88.61 91 103.42c-4.101 1.657-8.768-.324-10.425-4.425C78.918 94.894 80.899 90.227 85 88.57L106.46 80 85 71.42C80.899 69.763 78.918 65.096 80.575 60.995 82.232 56.894 86.899 54.913 91 56.57l37 14.81L165 56.57c4.101-1.657 8.768 .324 10.425 4.425 1.657 4.101-.324 8.768-4.425 10.425ZM224 79.75c0 42.72-8 75.4-14.69 95.28-8.73 25.8-20.63 45.49-32.65 54-4.659 3.352-10.776 3.892-15.95 1.41-5.244-2.474-8.751-7.578-9.18-13.36C150.68 205.58 146.48 168 128 168c-18.48 0-22.68 37.59-23.53 49.11-.622 8.384-7.593 14.876-16 14.9-3.277-.005-6.47-1.036-9.13-2.95-12-8.53-23.92-28.22-32.65-54C40 155.15 32 122.47 32 79.75 32.138 48.92 57.169 24 88 24h80c30.831-0 55.862 24.92 56 55.75ZM208 79.75C207.863 57.756 189.994 40 168 40h-80C66.002 40 48.132 57.762 48 79.76c0 40.55 7.51 71.4 13.85 90.14 11.05 32.66 23 43.37 26.61 46C91.57 174.67 105.59 152 128 152c22.41 0 36.45 22.71 39.49 63.94h0c3.6-2.59 15.57-13.26 26.66-46C200.49 151.16 208 120.31 208 79.76Z"),
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
        return _tooth!!
    }

private var _tooth: ImageVector? = null
