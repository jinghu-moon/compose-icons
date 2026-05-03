package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.QuillPenAiFill: ImageVector
    get() {
        if (_quillPenAiFill != null) return _quillPenAiFill!!
        _quillPenAiFill = remixIcon(
            name = "QuillPenAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.713 7.128 L 4.467 7.694 C 4.286 8.108 3.714 8.108 3.533 7.694 L 3.287 7.128 C 2.847 6.119 2.055 5.316 1.068 4.877 L 0.308 4.539 C -0.103 4.357 -0.103 3.759 0.308 3.576 L 1.025 3.257 C 2.038 2.807 2.844 1.974 3.276 0.931 L 3.529 0.320 C 3.706 -0.107 4.294 -0.107 4.471 0.320 L 4.724 0.931 C 5.156 1.974 5.962 2.807 6.975 3.257 L 7.692 3.576 C 8.103 3.759 8.103 4.357 7.692 4.539 L 6.932 4.877 C 5.945 5.316 5.153 6.119 4.713 7.128 ZM 3.064 21.613 C 4.089 15.422 6.311 1.997 21.000 1.997 C 19.504 4.997 18.500 6.497 17.500 7.497 L 16.500 8.497 L 18.000 9.497 C 17.000 12.497 14.000 15.997 10.000 16.497 C 7.331 16.830 5.664 18.663 4.998 21.997 L 3.000 21.997 C 3.021 21.872 3.042 21.744 3.064 21.613 Z"),
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
        return _quillPenAiFill!!
    }

private var _quillPenAiFill: ImageVector? = null
