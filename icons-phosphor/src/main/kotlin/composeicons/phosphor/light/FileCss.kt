package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileCss: ImageVector
    get() {
        if (_fileCss != null) return _fileCss!!
        _fileCss = phosphorLightIcon(
            name = "FileCss",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M46 180c0 12.13 8.07 22 18 22 4.446-.086 8.662-1.995 11.66-5.28 2.292-2.394 6.091-2.477 8.485-.185 2.394 2.292 2.477 6.091 .185 8.485C79.076 210.681 71.723 213.929 64 214 47.46 214 34 198.75 34 180c0-18.75 13.46-34 30-34 7.726 .076 15.079 3.332 20.33 9 2.292 2.394 2.209 6.193-.185 8.485-2.394 2.292-6.193 2.209-8.485-.185C72.666 160.008 68.449 158.091 64 158c-9.93 0-18 9.86-18 22ZM127 173.23c-10.85-3.13-13.4-4.69-13-7.91 .112-2.051 1.178-3.931 2.88-5.08 5.59-3.79 17.66-1.82 21.44-.84 2.091 .604 4.345 .027 5.89-1.506 1.545-1.533 2.138-3.783 1.551-5.879-.588-2.096-2.264-3.709-4.381-4.215-2-.53-20.09-5-31.2 2.48-4.569 3.092-7.533 8.051-8.09 13.54-1.79 14.19 12.27 18.25 21.57 20.94 12.12 3.5 14.78 5.33 14.21 9.76-.11 2.151-1.22 4.127-3 5.34-5.6 3.73-17.48 1.64-21.18 .62-2.122-.785-4.505-.311-6.163 1.228-1.659 1.539-2.311 3.879-1.687 6.054 .624 2.175 2.418 3.813 4.64 4.238 4.787 1.277 9.716 1.949 14.67 2 5.49 0 11.55-.95 16.36-4.14 4.693-3.131 7.741-8.197 8.31-13.81C151.83 180.39 136.92 176.08 127 173.22ZM191 173.23c-10.85-3.13-13.41-4.69-13-7.91 .116-2.049 1.181-3.928 2.88-5.08 5.6-3.79 17.65-1.83 21.44-.84 3.189 .809 6.434-1.1 7.276-4.281 .842-3.18-1.034-6.445-4.206-7.319-2-.54-20.1-5-31.21 2.48-4.564 3.096-7.522 8.054-8.08 13.54-1.8 14.19 12.26 18.25 21.57 20.94 12.12 3.5 14.77 5.33 14.2 9.76-.104 2.153-1.216 4.131-3 5.34-5.61 3.73-17.48 1.64-21.19 .62-3.066-.586-6.069 1.276-6.907 4.283-.838 3.007 .77 6.154 3.697 7.237 4.791 1.277 9.722 1.948 14.68 2 5.49 0 11.54-.95 16.36-4.14 4.693-3.131 7.741-8.197 8.31-13.81C215.83 180.39 200.91 176.08 191 173.22ZM202 94h-50c-3.314 0-6-2.686-6-6v-50h-90c-1.105 0-2 .895-2 2v72c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-72C42 32.268 48.268 26 56 26h96c1.591 .001 3.116 .634 4.24 1.76l56 56c1.126 1.124 1.759 2.649 1.76 4.24v24c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6ZM193.5 82 158 46.48v35.52Z"),
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
        return _fileCss!!
    }

private var _fileCss: ImageVector? = null
