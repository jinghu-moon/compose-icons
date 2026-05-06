package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.IntersectThree: ImageVector
    get() {
        if (_intersectThree != null) return _intersectThree!!
        _intersectThree = phosphorDuotoneIcon(
            name = "IntersectThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M104.64 147.28c-19.31-8.164-32.959-25.816-36-46.56C88.314 92.422 110.914 95.194 128 108c-12.668 9.495-21.066 23.615-23.36 39.28ZM104.64 147.28c-3.197 21.759 5.767 43.523 23.36 56.72 17.593-13.197 26.557-34.961 23.36-56.72-14.938 6.293-31.782 6.293-46.72 0ZM187.36 100.72C167.686 92.422 145.086 95.194 128 108c12.668 9.495 21.066 23.615 23.36 39.28 19.31-8.164 32.959-25.816 36-46.56Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M195.88 96c.07-1.31 .12-2.63 .12-4C196 54.445 165.555 24 128 24 90.445 24 60 54.445 60 92c0 1.33 0 2.65 .12 4C37.766 107.439 23.536 130.267 23.108 155.374c-.428 25.107 13.015 48.407 34.965 60.602 21.951 12.195 48.835 11.301 69.927-2.326 21.092 13.627 47.976 14.521 69.927 2.326 21.951-12.195 35.394-35.495 34.965-60.602C232.464 130.267 218.234 107.439 195.88 96ZM128 193.47c-9.711-9.278-15.446-21.96-16-35.38 10.481 2.547 21.419 2.547 31.9 0-.527 13.405-6.226 26.085-15.9 35.38ZM128 144c-4.761-.002-9.498-.658-14.08-1.95 2.508-8.957 7.37-17.079 14.08-23.52 6.71 6.441 11.572 14.563 14.08 23.52-4.582 1.292-9.319 1.948-14.08 1.95ZM99.23 135.29C88.858 128.384 81.299 117.994 77.92 106c12.25-3.457 25.344-2.29 36.79 3.28-7.044 7.4-12.334 16.29-15.48 26.01ZM141.29 109.23c11.452-5.553 24.546-6.702 36.79-3.23-3.368 12.013-10.928 22.421-21.31 29.34-3.132-9.756-8.423-18.681-15.48-26.11ZM128 40c27.91 .008 50.847 22.024 52 49.91-17.762-4.32-36.516-1.276-52 8.44C112.53 88.647 93.796 85.604 76.05 89.91 77.202 62.044 100.11 40.035 128 40ZM40 156c.009-17.409 8.728-33.658 23.23-43.29 5.455 16.866 17.247 30.953 32.89 39.29-.07 1.31-.12 2.63-.12 4-.007 17.415 6.693 34.165 18.71 46.77-16.114 7.823-35.12 6.802-50.302-2.703C49.225 190.562 40.003 173.912 40 156ZM164 208c-7.87 .01-15.637-1.779-22.71-5.23C153.307 190.165 160.007 173.415 160 156c0-1.33-.05-2.65-.12-4 15.651-8.347 27.444-22.45 32.89-39.33 19.115 12.683 27.661 36.393 21.033 58.354C207.175 192.985 186.94 208.009 164 208Z"),
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
        return _intersectThree!!
    }

private var _intersectThree: ImageVector? = null
