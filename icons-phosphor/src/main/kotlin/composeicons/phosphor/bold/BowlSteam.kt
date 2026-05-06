package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BowlSteam: ImageVector
    get() {
        if (_bowlSteam != null) return _bowlSteam!!
        _bowlSteam = phosphorBoldIcon(
            name = "BowlSteam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 108h-192c-6.627 0-12 5.373-12 12 .073 39.392 21.514 75.642 56 94.68v1.32c0 11.046 8.954 20 20 20h64c11.046 0 20-8.954 20-20v-1.32C214.486 195.642 235.927 159.392 236 120c0-6.627-5.373-12-12-12ZM163 196.39c-4.262 1.954-6.997 6.211-7 10.9v4.71h-56v-4.71c-.003-4.689-2.738-8.946-7-10.9C67.099 184.448 48.991 160.222 44.87 132h166.26c-4.121 28.222-22.229 52.448-48.13 64.39ZM74.93 50.15c1.936-2.065 3.527-4.429 4.71-7C73.693 40.797 70.636 34.193 72.69 28.137c2.055-6.057 8.498-9.438 14.65-7.687 5.67 1.64 13.2 6.63 15.77 15.3 2.71 9.14-.67 19.26-10 30.08-1.936 2.065-3.527 4.429-4.71 7 5.371 2.108 8.48 7.74 7.404 13.409C94.728 91.907 89.77 96.007 84 96c-1.127 .003-2.248-.155-3.33-.47C75 93.89 67.46 88.9 64.89 80.23 62.18 71.09 65.56 61 74.93 50.15ZM118.93 50.15c1.936-2.065 3.527-4.429 4.71-7-5.947-2.353-9.004-8.957-6.95-15.013 2.055-6.057 8.498-9.438 14.65-7.687 5.67 1.64 13.2 6.63 15.77 15.3 2.71 9.14-.67 19.26-10 30.08-1.936 2.065-3.527 4.429-4.71 7 5.371 2.108 8.48 7.74 7.404 13.409C138.728 91.907 133.77 96.007 128 96c-1.127 .003-2.248-.155-3.33-.47C119 93.89 111.46 88.9 108.89 80.23 106.18 71.09 109.56 61 118.93 50.15ZM162.93 50.15c1.936-2.065 3.527-4.429 4.71-7-5.947-2.353-9.004-8.957-6.95-15.013 2.055-6.057 8.498-9.438 14.65-7.687 5.67 1.64 13.2 6.63 15.77 15.3 2.71 9.14-.67 19.26-10 30.08-1.936 2.065-3.527 4.429-4.71 7 5.371 2.108 8.48 7.74 7.404 13.409C182.728 91.907 177.77 96.007 172 96c-1.127 .003-2.248-.155-3.33-.47C163 93.89 155.46 88.9 152.89 80.23 150.18 71.09 153.56 61 162.93 50.15Z"),
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
        return _bowlSteam!!
    }

private var _bowlSteam: ImageVector? = null
