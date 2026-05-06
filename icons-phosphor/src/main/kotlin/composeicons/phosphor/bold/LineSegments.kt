package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LineSegments: ImageVector
    get() {
        if (_lineSegments != null) return _lineSegments!!
        _lineSegments = phosphorBoldIcon(
            name = "LineSegments",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M241.47 30.53C234.718 23.776 225.56 19.982 216.01 19.982c-9.55 0-18.708 3.794-25.46 10.548h0c-13.556 13.595-14.083 35.426-1.2 49.66l-23.83 44.26c-7.149-1.105-14.466-.036-21 3.07l-16-16c7.59-15.825 2.663-34.817-11.664-44.956C102.528 56.426 82.979 58.097 70.58 70.52h0C56.994 84.102 56.466 105.958 69.38 120.18L45.5 164.45c-11.353-1.774-22.871 1.979-31 10.1h0C.604 188.45 .426 210.926 14.099 225.046c13.673 14.119 36.143 14.663 50.482 1.22 14.339-13.442 15.247-35.901 2.039-50.456L90.45 131.55c1.835 .296 3.691 .447 5.55 .45 5.366 .002 10.665-1.194 15.51-3.5l16 16c-7.796 16.321-2.272 35.892 12.907 45.728 15.179 9.836 35.299 6.883 47.011-6.9 11.712-13.783 11.379-34.116-.778-47.508L210.5 91.55c1.819 .289 3.658 .44 5.5 .45 14.559-.001 27.684-8.77 33.257-22.22 5.573-13.45 2.496-28.933-7.797-39.23ZM87.47 87.53c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17h0c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17ZM48.47 208.53c-4.691 4.674-12.281 4.666-16.961-.02-4.68-4.685-4.68-12.276 0-16.961 4.68-4.685 12.27-4.694 16.961-.02 4.686 4.686 4.686 12.284 0 16.97ZM168.47 168.53c-4.691 4.674-12.281 4.666-16.961-.02-4.68-4.685-4.68-12.276 0-16.961 4.68-4.685 12.27-4.694 16.961-.02 4.685 4.68 4.694 12.269 .02 16.96ZM224.47 64.53c-4.691 4.674-12.281 4.666-16.961-.02-4.68-4.685-4.68-12.276 0-16.961 4.68-4.685 12.27-4.694 16.961-.02 4.681 4.676 4.694 12.258 .03 16.95Z"),
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
        return _lineSegments!!
    }

private var _lineSegments: ImageVector? = null
