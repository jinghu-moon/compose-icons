package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HandTap: ImageVector
    get() {
        if (_handTap != null) return _handTap!!
        _handTap = phosphorLightIcon(
            name = "HandTap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M58 76C58 43.967 83.967 18 116 18c32.033 0 58 25.967 58 58 0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6C162 50.595 141.405 30 116 30 90.595 30 70 50.595 70 76c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6ZM196 122c-5.204-.005-10.289 1.56-14.59 4.49-1.806-8.316-7.567-15.221-15.424-18.489-7.857-3.268-16.816-2.484-23.986 2.099v-34.1C142 61.641 130.359 50 116 50 101.641 50 90 61.641 90 76v87L82.47 150.9C75.254 138.474 59.331 134.249 46.905 141.465c-12.426 7.216-16.651 23.139-9.435 35.565l29.32 50c1.709 2.766 5.31 3.668 8.121 2.034 2.811-1.634 3.808-5.21 2.249-8.064L47.87 171c-3.866-6.696-1.571-15.259 5.125-19.125 6.696-3.866 15.259-1.571 19.125 5.125 .028 .06 .061 .117 .1 .17l18.68 30c1.413 2.28 4.168 3.345 6.748 2.609 2.579-.737 4.357-3.096 4.352-5.779v-108c0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14v68c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-12c0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14v20c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-4c0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14v36c0 22.13-7.3 37.18-7.37 37.32-1.447 2.953-.248 6.521 2.69 8 .826 .438 1.745 .672 2.68 .68 2.278 .004 4.362-1.282 5.38-3.32 .35-.7 8.63-17.55 8.63-42.68v-36c0-6.897-2.741-13.512-7.619-18.388C209.513 124.735 202.897 121.997 196 122Z"),
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
        return _handTap!!
    }

private var _handTap: ImageVector? = null
