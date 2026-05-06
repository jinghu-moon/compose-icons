package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Butterfly: ImageVector
    get() {
        if (_butterfly != null) return _butterfly!!
        _butterfly = phosphorDuotoneIcon(
            name = "Butterfly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M225.12 119.71c-7.86 30.94-29.31 32.71-37.36 32.23h-1c12.958 10.574 16.927 28.679 9.581 43.704-7.346 15.025-24.072 23.012-40.375 19.28C139.664 211.192 128.078 196.724 128 180c-.063 16.735-11.65 31.22-27.962 34.956C83.725 218.692 66.989 210.695 59.648 195.656c-7.341-15.039-3.349-33.154 9.632-43.715h-1c-8 .48-29.5-1.29-37.36-32.23C22.79 87.84 15.78 48 47.07 48 78.36 48 128 95.8 128 127.67 128 95.8 177.64 48 208.93 48c31.29 0 24.28 39.84 16.19 71.71Z"),
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
                pathData = parseSvgPathData("M232.7 50.48C229 45.7 221.84 40 209 40c-16.85 0-38.46 11.28-57.81 30.16C145.658 75.522 140.577 81.332 136 87.53v-31.53c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v31.53C115.436 81.334 110.369 75.524 104.85 70.16 85.49 51.28 63.88 40 47 40 34.16 40 27 45.7 23.3 50.48c-6.82 8.77-12.18 24.08-.21 71.2 6.05 23.83 19.51 33 30.63 36.42-12.619 20.49-6.436 47.316 13.878 60.216 20.314 12.9 47.223 7.088 60.402-13.046 13.179 20.134 40.088 25.946 60.402 13.046 20.314-12.9 26.497-39.726 13.878-60.216 11.12-3.4 24.57-12.59 30.63-36.42 6.72-26.44 11.94-55.58-.21-71.2ZM92 208C77.274 207.742 65.242 196.164 64.417 181.459 63.593 166.753 74.255 153.903 88.86 152c2.882-.264 5.397-2.064 6.577-4.707 1.179-2.643 .839-5.717-.89-8.038-1.729-2.321-4.577-3.528-7.447-3.155-7.479 .802-14.623 3.523-20.74 7.9-8.43 .09-22-3.57-27.76-26.26C35.72 106.39 27 71.86 35.94 60.3 37.37 58.46 40.09 56 47 56c27.27 0 73 44.88 73 71.67v52.33c0 15.464-12.536 28-28 28ZM217.4 117.74c-5.77 22.69-19.33 26.34-27.77 26.26-6.111-4.396-13.256-7.135-20.74-7.95-2.87-.373-5.718 .833-7.447 3.155-1.729 2.321-2.069 5.395-.89 8.038 1.179 2.643 3.694 4.443 6.577 4.707 15.031 1.624 26.086 14.847 25.02 29.929-1.066 15.081-13.87 26.618-28.98 26.113C148.059 207.486 136.055 195.119 136 180v-52.33C136 100.88 181.69 56 209 56c6.95 0 9.66 2.46 11.1 4.3 8.95 11.56 .18 46.09-2.7 57.44Z"),
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
        return _butterfly!!
    }

private var _butterfly: ImageVector? = null
