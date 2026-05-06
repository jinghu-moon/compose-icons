package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Cherries: ImageVector
    get() {
        if (_cherries != null) return _cherries!!
        _cherries = phosphorDuotoneIcon(
            name = "Cherries",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 144c.002 23.664-13.054 45.399-33.947 56.511-20.893 11.112-46.213 9.789-65.833-3.441v-.07c-20.32 28.702-59.991 35.632-88.838 15.52C22.534 192.407 15.319 152.786 35.224 123.795 55.129 94.804 94.696 87.304 123.83 107 139.955 84.308 168.898 74.642 195.423 83.09 221.947 91.538 239.969 116.163 240 144Z"),
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
                pathData = parseSvgPathData("M176 72c-2.593 .003-5.183 .146-7.76 .43C162.617 62.818 155.291 54.309 146.62 47.32 108.78 16.79 57.05 23.77 54.87 24.08c-3.286 .466-5.943 2.913-6.678 6.15-.735 3.237 .605 6.591 3.368 8.43C69.06 50.32 77.07 69.66 80.41 88.4 48.342 91.746 22.408 116.002 16.929 147.775c-5.479 31.773 10.832 63.315 39.927 77.208 29.095 13.894 63.879 6.751 85.145-17.484 26.435 14.128 58.856 10.401 81.396-9.355 22.54-19.757 30.483-51.411 19.94-79.469C232.795 90.618 205.973 72.026 176 72ZM76 39.37c16.67 .72 41.24 4.78 60.64 20.48 5.784 4.694 10.839 10.221 15 16.4-11.463 4.132-21.694 11.099-29.74 20.25-7.838-4.214-16.395-6.928-25.23-8C93.54 68.59 86.56 52 76 39.37ZM88 216C58.204 215.985 33.637 192.64 32.103 162.884 30.569 133.127 52.604 107.38 82.24 104.3c.582 10.369 .247 20.77-1 31.08-7.58-1.43-11.35-4.85-11.55-5-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32C59.4 142.71 69.2 152 87.92 152h.25c18.66-.05 28.43-9.28 29.49-10.33 3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0-2.604 2.135-5.656 3.653-8.93 4.44 1.088-9.89 1.399-19.851 .93-29.79 28.326 5.425 47.9 31.477 45.225 60.194C140.89 193.911 116.841 215.9 88 216ZM145 116.11c-2.92-3.79-6.21-7.28-9.82-10.42 6.631-7.057 14.974-12.28 24.22-15.16 3.779 9.071 6.335 18.605 7.6 28.35-6.09-1.6-9.16-4.37-9.33-4.54-1.775-1.783-4.285-2.628-6.777-2.28-2.492 .348-4.675 1.848-5.893 4.05ZM176 200c-8.561 .011-17.009-1.95-24.69-5.73 10.634-19.605 11.558-43.038 2.5-63.42 6.77 3.44 14.266 5.207 21.86 5.15h.33c18.77 0 28.6-9.28 29.66-10.34 3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0-.19 .19-3.84 3.49-11.15 5C181.986 108.626 179.47 98.101 175.7 88h.3c30.928 0 56 25.072 56 56 0 30.928-25.072 56-56 56Z"),
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
        return _cherries!!
    }

private var _cherries: ImageVector? = null
