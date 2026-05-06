package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.EyeSlash: ImageVector
    get() {
        if (_eyeSlash != null) return _eyeSlash!!
        _eyeSlash = phosphorThinIcon(
            name = "EyeSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M51 37.31C49.514 35.653 46.967 35.514 45.31 37c-1.657 1.486-1.796 4.033-.31 5.69L67.59 67.5C29.34 89 13 124.81 12.34 126.38c-.45 1.037-.45 2.213 0 3.25 .34 .77 8.52 18.89 26.83 37.2 17 17 46.14 37.17 88.83 37.17 18.338 .121 36.47-3.874 53.06-11.69l24 26.38c.956 1.078 2.417 1.558 3.826 1.258 1.409-.3 2.547-1.335 2.981-2.709 .433-1.374 .095-2.874-.887-3.929ZM149.1 157.16c-14.854 10.671-35.349 8.508-47.649-5.029C89.152 138.594 88.958 117.986 101 104.22ZM128 196C96 196 68.11 184.35 45 161.38 35.154 151.575 26.871 140.318 20.44 128 24.09 120.77 40.53 91.19 73.12 73.57L95.57 98.27c-15.444 16.771-15.52 42.56-.175 59.422 15.345 16.861 41.028 19.209 59.175 5.408l20.89 23C160.524 192.737 144.344 196.112 128 196ZM134.78 92.64c-2.166-.416-3.587-2.506-3.176-4.673 .411-2.167 2.498-3.593 4.667-3.187 19.196 3.722 33.657 19.628 35.54 39.09 .203 2.198-1.413 4.144-3.61 4.35h-.38c-2.072 .009-3.808-1.567-4-3.63C162.277 108.687 150.464 95.69 134.78 92.64ZM243.66 129.64c-.41 .91-10.2 22.58-32.38 42.45-.737 .65-1.687 1.006-2.67 1-1.668 .01-3.167-1.016-3.762-2.574-.594-1.559-.159-3.322 1.092-4.426C217.994 155.25 228.023 142.352 235.56 128 229.126 115.685 220.843 104.427 211 94.62 187.89 71.65 160 60 128 60c-6.7-.007-13.389 .538-20 1.63-2.168 .342-4.206-1.127-4.569-3.291-.362-2.165 1.087-4.217 3.249-4.599C113.726 52.572 120.857 51.99 128 52c42.7 0 71.87 20.22 88.83 37.18 18.31 18.31 26.49 36.44 26.83 37.2 .45 1.037 .45 2.213 0 3.25Z"),
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
        return _eyeSlash!!
    }

private var _eyeSlash: ImageVector? = null
