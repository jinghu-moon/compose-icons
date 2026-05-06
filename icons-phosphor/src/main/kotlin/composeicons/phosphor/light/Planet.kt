package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Planet: ImageVector
    get() {
        if (_planet != null) return _planet!!
        _planet = phosphorLightIcon(
            name = "Planet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243.39 61.68c-7.24-12.48-27-15-57.24-7.49C157.885 31.886 119.358 27.704 86.966 43.423 54.574 59.142 34.019 91.995 34.05 128c.001 4.349 .301 8.693 .9 13C13.09 163.38 5.39 181.78 12.66 194.32c4.5 7.76 14 11.69 27.86 11.69 8.423-.145 16.806-1.205 25-3.16 1.45-.32 2.92-.68 4.41-1 30.14 23.757 71.699 26.794 104.972 7.671 33.273-19.122 51.571-56.56 46.218-94.561 12.65-13 21.11-25.32 23.86-35.6 1.78-6.83 1.26-12.77-1.59-17.68ZM128 46c38.691 .053 72.096 27.106 80.19 64.94-16 15.3-38.14 31.67-63.3 46.12C117.49 172.82 92.79 183 72.85 188.6 47.841 165.803 39.405 129.984 51.612 98.422 63.818 66.86 94.16 46.038 128 46ZM23 188.3c-3.52-6.07 2.31-18.56 15-33 4.154 13.647 11.359 26.17 21.07 36.62C39.42 195.74 26.39 194.08 23 188.3ZM128 210c-15.334 .015-30.361-4.3-43.35-12.45 20.68-6.71 43.56-17.06 66.22-30.08C173.7 154.35 194 139.8 209.92 125.56c0 .81 .06 1.62 .06 2.44-.044 45.261-36.719 81.945-81.98 82ZM233.35 76.21c-1.88 7-7.28 15.49-15.36 24.61C213.841 87.14 206.625 74.588 196.89 64.12c15.82-3.05 32-3.49 36.12 3.58 1.19 2.05 1.3 4.92 .34 8.51Z"),
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
        return _planet!!
    }

private var _planet: ImageVector? = null
