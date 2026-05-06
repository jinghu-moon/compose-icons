package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bandaids: ImageVector
    get() {
        if (_bandaids != null) return _bandaids!!
        _bandaids = phosphorBoldIcon(
            name = "Bandaids",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M190.23 128l24.88-24.89C226.47 92.046 230.997 75.724 226.96 60.389 222.923 45.054 210.946 33.077 195.611 29.04c-15.335-4.037-31.657 .49-42.721 11.85L128 65.77 103.11 40.89C92.046 29.53 75.724 25.003 60.389 29.04 45.054 33.077 33.077 45.054 29.04 60.389c-4.037 15.335 .49 31.657 11.85 42.721L65.77 128 40.89 152.89C29.53 163.954 25.003 180.276 29.04 195.611c4.037 15.335 16.014 27.312 31.349 31.349 15.335 4.037 31.657-.49 42.721-11.85L128 190.23l24.89 24.88c11.064 11.36 27.386 15.887 42.721 11.85 15.335-4.037 27.312-16.014 31.349-31.349 4.037-15.335-.49-31.657-11.85-42.721ZM169.86 57.86h0c5.021-5.199 12.458-7.284 19.45-5.454 6.993 1.83 12.453 7.291 14.284 14.284 1.83 6.993-.255 14.429-5.454 19.45L173.25 111 145 82.75ZM156.28 128 128 156.28 99.72 128 128 99.72ZM57.86 86.14C52.661 81.119 50.576 73.682 52.406 66.69 54.236 59.697 59.697 54.236 66.69 52.406c6.993-1.83 14.429 .255 19.45 5.454L111 82.75 82.75 111ZM86.14 198.14c-5.021 5.199-12.458 7.284-19.45 5.454C59.697 201.764 54.236 196.303 52.406 189.31c-1.83-6.993 .255-14.429 5.454-19.45L82.75 145 111 173.25ZM198.14 198.14c-7.81 7.808-20.47 7.808-28.28 0L145 173.25 173.25 145l24.89 24.89c7.808 7.81 7.808 20.47 0 28.28Z"),
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
        return _bandaids!!
    }

private var _bandaids: ImageVector? = null
