package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BaseballCap: ImageVector
    get() {
        if (_baseballCap != null) return _baseballCap!!
        _baseballCap = phosphorThinIcon(
            name = "BaseballCap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.799 28.066 28.066 72.799 28 128v56c-0 7.54 4.239 14.439 10.966 17.845 6.727 3.406 14.797 2.739 20.874-1.725C72.46 191 94.53 180 128 180c33.47 0 55.54 10.94 68.16 20.12 6.116 4.497 14.25 5.144 21 1.67C223.841 198.381 228.034 191.501 228 184v-56C227.934 72.799 183.201 28.066 128 28ZM220 128v16.23C205.134 134.094 188.687 126.501 171.33 121.76 168.388 90.631 156.531 61.011 137.18 36.45 184.176 41.219 219.949 80.763 220 128ZM163.1 119.74c-23.134-4.987-47.066-4.987-70.2 0C97.64 76.93 120 47.31 128 38c8 9.32 30.36 38.93 35.1 81.75ZM118.82 36.46C99.469 61.021 87.612 90.641 84.67 121.77 67.313 126.511 50.866 134.104 36 144.24v-16.24C36.056 80.767 71.828 41.228 118.82 36.46ZM213.48 194.67c-4.046 2.118-8.948 1.729-12.61-1C187.29 183.78 163.62 172 128 172c-35.62 0-59.29 11.77-72.87 21.65-3.662 2.729-8.564 3.118-12.61 1C38.484 192.644 35.951 188.507 36 184v-30c54.805-40.021 129.195-40.021 184 0v30c.057 4.514-2.477 8.661-6.52 10.67Z"),
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
        return _baseballCap!!
    }

private var _baseballCap: ImageVector? = null
