package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.EyeSlash: ImageVector
    get() {
        if (_eyeSlash != null) return _eyeSlash!!
        _eyeSlash = phosphorFillIcon(
            name = "EyeSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M96.68 57.87c-.961-1.053-1.289-2.539-.861-3.899 .429-1.36 1.549-2.389 2.941-2.701C108.352 49.078 118.161 47.981 128 48c34.88 0 66.57 13.26 91.66 38.35 18.83 18.83 27.3 37.62 27.65 38.41 .92 2.069 .92 4.431 0 6.5-.35 .79-8.82 19.57-27.65 38.4q-4.28 4.26-8.79 8.07c-1.644 1.396-4.1 1.237-5.55-.36ZM213.92 210.62c1.963 2.109 2.641 5.11 1.774 7.858-.867 2.748-3.144 4.817-5.961 5.418-2.818 .601-5.741-.36-7.653-2.515L180 197.13c-16.375 7.243-34.095 10.947-52 10.87C93.12 208 61.43 194.74 36.34 169.66 17.51 150.83 9 132.05 8.69 131.26c-.92-2.069-.92-4.431 0-6.5C9 124 17.51 105.18 36.34 86.35c7.523-7.558 15.915-14.197 25-19.78L42.08 45.38C40.117 43.271 39.439 40.27 40.306 37.522c.867-2.748 3.144-4.817 5.961-5.418 2.818-.601 5.741 .36 7.653 2.515ZM148.43 162.37 95.74 104.37c-11.192 15.335-10.063 36.425 2.703 50.478 12.766 14.052 33.651 17.195 49.987 7.522Z"),
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
