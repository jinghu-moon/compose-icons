package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PhoneSlash: ImageVector
    get() {
        if (_phoneSlash != null) return _phoneSlash!!
        _phoneSlash = phosphorThinIcon(
            name = "PhoneSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M51 37.31C49.514 35.653 46.967 35.514 45.31 37c-1.657 1.486-1.796 4.033-.31 5.69L76.52 77.32C58.001 84.22 41.183 95.024 27.21 109 8.69 127.53 6.9 154.83 22.85 175.4c3.271 4.175 8.893 5.707 13.83 3.77l49-17.39 .15-.05c3.765-1.506 6.515-4.813 7.31-8.79l5.9-29.51c.242-1.376 1.199-2.519 2.51-3 3.72-1.281 7.531-2.284 11.4-3l92.07 101.26c.956 1.078 2.417 1.558 3.826 1.258 1.409-.3 2.547-1.335 2.981-2.709 .433-1.374 .095-2.874-.887-3.929ZM99 112.91c-3.979 1.43-6.912 4.849-7.72 9l-5.9 29.51c-.261 1.3-1.148 2.386-2.37 2.9L34.01 171.7l-.15 .06c-1.635 .656-3.508 .165-4.61-1.21C15.83 153.26 17.35 130.3 32.94 114.71 46.846 100.775 63.733 90.179 82.33 83.72l24.44 26.88q-3.97 .98-7.83 2.31ZM233.15 175.4c-3.271 4.175-8.893 5.707-13.83 3.77l-9.31-3.3c-2.082-.74-3.17-3.028-2.43-5.11 .74-2.082 3.028-3.17 5.11-2.43l9.37 3.32 .15 .06c1.635 .656 3.508 .165 4.61-1.21 13.42-17.29 11.9-40.25-3.69-55.84C196.66 88.2 159.34 74.18 120.72 76.19c-2.209 .113-4.092-1.586-4.205-3.795-.113-2.209 1.586-4.092 3.795-4.205 40.86-2.12 80.41 12.74 108.48 40.8 18.52 18.54 20.31 45.84 4.36 66.41Z"),
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
        return _phoneSlash!!
    }

private var _phoneSlash: ImageVector? = null
