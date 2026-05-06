package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PersonSimpleSwim: ImageVector
    get() {
        if (_personSimpleSwim != null) return _personSimpleSwim!!
        _personSimpleSwim = phosphorBoldIcon(
            name = "PersonSimpleSwim",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M90.44 108.6l6.24-6.24C84.294 95.54 70.38 91.975 56.24 92h-16.24C33.373 92 28 86.627 28 80 28 73.373 33.373 68 40 68h16.24c28.658-.076 56.154 11.318 76.36 31.64l40.25 40.25c10.74 .27 22.11-3.64 35.49-14.73 3.29-2.822 7.846-3.65 11.919-2.167 4.073 1.483 7.029 5.047 7.734 9.324 .705 4.277-.951 8.601-4.333 11.313C205.49 158.7 189.06 164 174.15 164c-19.76 0-36.86-9.29-51.88-17.45C97.21 132.94 77.41 122.19 47.66 146.86c-5.103 4.23-12.669 3.523-16.9-1.58-4.231-5.103-3.523-12.669 1.58-16.9C54.07 110.36 73.3 106.32 90.44 108.6ZM140 72c0-19.882 16.118-36 36-36 19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36C156.118 108 140 91.882 140 72ZM164 72c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12ZM208.34 181.16c-29.75 24.67-49.55 13.92-74.61 .3C107.38 167.16 74.59 149.35 32.34 184.39c-3.381 2.712-5.037 7.036-4.333 11.313 .705 4.277 3.661 7.841 7.734 9.324 4.073 1.483 8.629 .655 11.919-2.167 29.75-24.66 49.55-13.92 74.61-.3 15 8.15 32.12 17.44 51.88 17.44 14.91 0 31.34-5.29 49.51-20.36 5.103-4.23 5.811-11.797 1.58-16.9-4.23-5.103-11.797-5.811-16.9-1.58Z"),
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
        return _personSimpleSwim!!
    }

private var _personSimpleSwim: ImageVector? = null
