package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PaintingAiFill: ImageVector
    get() {
        if (_paintingAiFill != null) return _paintingAiFill!!
        _paintingAiFill = remixIcon(
            name = "PaintingAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.525 3.525 C 4.892 2.159 7.107 2.159 8.474 3.525 L 8.646 3.696 C 8.841 3.891 9.158 3.891 9.353 3.696 L 9.525 3.525 C 10.578 2.473 12.134 2.232 13.418 2.801 C 13.149 3.482 13.001 4.224 13.001 5.001 C 13.001 5.893 13.196 6.739 13.546 7.500 L 9.500 7.500 C 8.396 7.500 7.500 8.396 7.500 9.500 L 7.500 14.500 C 7.500 15.604 8.395 16.500 9.500 16.500 L 14.500 16.500 C 15.604 16.500 16.500 15.604 16.500 14.500 L 16.500 10.454 C 17.261 10.804 18.108 11.001 19.001 11.001 C 19.777 11.001 20.518 10.851 21.199 10.582 C 21.768 11.866 21.527 13.422 20.474 14.475 L 20.303 14.646 C 20.108 14.842 20.109 15.158 20.303 15.354 L 20.474 15.525 C 21.841 16.892 21.841 19.108 20.474 20.475 C 19.108 21.841 16.892 21.841 15.525 20.475 L 15.353 20.304 C 15.158 20.109 14.841 20.109 14.646 20.304 L 14.474 20.475 C 13.108 21.841 10.892 21.841 9.525 20.475 L 9.353 20.304 C 9.158 20.109 8.841 20.109 8.646 20.304 L 8.474 20.475 C 7.108 21.841 4.892 21.841 3.525 20.475 C 2.159 19.108 2.158 16.892 3.525 15.525 L 3.696 15.354 C 3.891 15.158 3.891 14.842 3.696 14.646 L 3.525 14.475 C 2.159 13.108 2.158 10.892 3.525 9.525 L 3.696 9.354 C 3.891 9.158 3.891 8.842 3.696 8.646 L 3.525 8.475 C 2.159 7.108 2.158 4.892 3.525 3.525 ZM 14.500 14.500 L 9.500 14.500 L 9.500 9.500 L 14.500 9.500 L 14.500 14.500 ZM 18.529 1.319 C 18.705 0.894 19.294 0.894 19.470 1.319 L 19.723 1.931 C 20.155 2.973 20.961 3.806 21.974 4.257 L 22.692 4.576 C 23.103 4.759 23.103 5.356 22.692 5.539 L 21.932 5.877 C 20.945 6.316 20.153 7.119 19.714 8.128 L 19.466 8.693 C 19.286 9.108 18.713 9.108 18.533 8.693 L 18.287 8.128 C 17.847 7.119 17.056 6.316 16.068 5.877 L 15.308 5.539 C 14.898 5.356 14.898 4.759 15.308 4.576 L 16.025 4.257 C 17.038 3.806 17.844 2.974 18.276 1.931 L 18.529 1.319 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _paintingAiFill!!
    }

private var _paintingAiFill: ImageVector? = null
