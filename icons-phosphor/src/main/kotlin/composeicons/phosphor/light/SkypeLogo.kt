package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SkypeLogo: ImageVector
    get() {
        if (_skypeLogo != null) return _skypeLogo!!
        _skypeLogo = phosphorLightIcon(
            name = "SkypeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M166 152c0 16.54-17.05 30-38 30C107.05 182 90 168.54 90 152c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6 0 9.76 11.91 18 26 18 14.09 0 26-8.24 26-18 0-11.21-10.7-15.1-28.33-20.18C109.78 127.24 91.78 122.05 91.78 104 91.78 86.9 107.35 74 128 74c15 0 27.74 6.88 33.34 18 1.497 2.957 .312 6.568-2.645 8.065-2.957 1.497-6.568 .312-8.065-2.645C147.08 90.36 138.41 86 128 86c-13.81 0-24.22 7.74-24.22 18 0 8.41 9.52 11.76 25.21 16.29C145.48 125 166 131 166 152ZM230 176c-.033 29.81-24.19 53.967-54 54-10.982 .036-21.709-3.312-30.72-9.59-30.483 5.676-61.805-4.035-83.73-25.96C39.625 172.525 29.914 141.203 35.59 110.72 29.312 101.709 25.964 90.982 26 80 26.033 50.19 50.19 26.033 80 26c10.982-.036 21.709 3.312 30.72 9.59 30.483-5.676 61.805 4.035 83.73 25.96 21.925 21.925 31.636 53.247 25.96 83.73 6.278 9.011 9.626 19.738 9.59 30.72ZM218 176c.033-9.286-3.043-18.316-8.74-25.65-1.078-1.4-1.484-3.203-1.11-4.93 5.889-27.264-2.47-55.653-22.193-75.377C166.233 50.32 137.844 41.961 110.58 47.85c-1.727 .374-3.53-.032-4.93-1.11C98.316 41.043 89.286 37.967 80 38 56.804 38 38 56.804 38 80c-.033 9.286 3.043 18.316 8.74 25.65 1.078 1.4 1.484 3.203 1.11 4.93-5.889 27.264 2.47 55.653 22.193 75.377 19.723 19.723 48.112 28.082 75.377 22.193 1.727-.381 3.533 .026 4.93 1.11 7.334 5.697 16.364 8.773 25.65 8.74 23.196 0 42-18.804 42-42Z"),
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
        return _skypeLogo!!
    }

private var _skypeLogo: ImageVector? = null
