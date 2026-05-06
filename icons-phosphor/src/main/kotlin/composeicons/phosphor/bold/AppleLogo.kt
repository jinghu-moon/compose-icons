package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AppleLogo: ImageVector
    get() {
        if (_appleLogo != null) return _appleLogo!!
        _appleLogo = phosphorBoldIcon(
            name = "AppleLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227 168c-.9-2.057-2.358-3.821-4.21-5.09C207.25 152.22 204 133.68 204 120c0-16.17 12.68-30.6 20.25-37.76 2.394-2.266 3.751-5.418 3.751-8.715 0-3.297-1.356-6.449-3.751-8.715C210.89 52.17 188.81 44 168 44c-14.129 .013-27.977 3.949-40 11.37C98.058 36.768 59.233 41.332 34.42 66.37 19.515 81.593 11.425 102.213 12 123.51c.842 35.14 15.771 68.467 41.43 92.49 8.148 7.717 18.948 12.012 30.17 12h87.69c12.139 .017 23.743-4.998 32.05-13.85 7.154-7.675 13.334-16.203 18.4-25.39 1.57-2.88 3-5.71 4.14-8.41 1.59-3.68 3.24-7.48 1.12-12.35ZM185.77 197.82c-3.764 3.975-9.006 6.212-14.48 6.18h-87.69c-5.093 .018-9.998-1.923-13.7-5.42C48.899 178.919 36.683 151.64 36 122.88 35.59 108.126 41.183 93.836 51.5 83.28 61.105 73.469 74.27 67.958 88 68h.72c11.566 .125 22.754 4.141 31.76 11.4 4.384 3.51 10.616 3.51 15 0C144.686 71.972 156.171 67.946 168 68c10.398 .123 20.626 2.656 29.88 7.4C186.26 89.66 180 105.13 180 120c0 23.33 7.47 42.89 21.25 56.19-4.21 7.844-9.417 15.111-15.49 21.62ZM128.75 13c3.647-4.701 8.213-8.611 13.42-11.49 5.799-3.214 13.106-1.119 16.32 4.68 3.214 5.799 1.119 13.106-4.68 16.32-2.373 1.311-4.453 3.094-6.11 5.24-4.073 5.233-11.617 6.173-16.85 2.1C125.617 25.777 124.677 18.233 128.75 13Z"),
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
        return _appleLogo!!
    }

private var _appleLogo: ImageVector? = null
