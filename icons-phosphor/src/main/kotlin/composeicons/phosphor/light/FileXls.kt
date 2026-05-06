package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileXls: ImageVector
    get() {
        if (_fileXls != null) return _fileXls!!
        _fileXls = phosphorLightIcon(
            name = "FileXls",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M154 208c0 3.314-2.686 6-6 6h-28c-3.314 0-6-2.686-6-6v-56c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v50h22c3.314 0 6 2.686 6 6ZM91.48 147.11c-2.693-1.92-6.433-1.299-8.36 1.39L68 169.67 52.88 148.5c-1.933-2.695-5.685-3.313-8.38-1.38-2.695 1.933-3.313 5.685-1.38 8.38L60.63 180 43.12 204.5c-1.933 2.695-1.315 6.447 1.38 8.38 2.695 1.933 6.447 1.315 8.38-1.38L68 190.31l15.12 21.16c1.122 1.583 2.94 2.525 4.88 2.53 1.249 .004 2.468-.388 3.48-1.12 1.296-.924 2.171-2.325 2.434-3.895 .263-1.57-.109-3.179-1.034-4.475L75.37 180 92.88 155.49c.928-1.296 1.301-2.908 1.039-4.48-.263-1.572-1.14-2.975-2.439-3.9ZM191 173.22c-10.85-3.13-13.41-4.69-13-7.91 .116-2.049 1.181-3.928 2.88-5.08 5.6-3.79 17.65-1.83 21.44-.84 3.189 .809 6.434-1.1 7.276-4.281 .842-3.18-1.034-6.445-4.206-7.319-2-.54-20.1-5-31.21 2.48-4.564 3.096-7.522 8.054-8.08 13.54-1.8 14.19 12.26 18.25 21.57 20.94 12.12 3.5 14.77 5.33 14.2 9.76-.104 2.153-1.216 4.131-3 5.34-5.61 3.73-17.48 1.64-21.19 .62-3.083-.622-6.123 1.242-6.967 4.272-.844 3.03 .796 6.197 3.757 7.258 4.791 1.277 9.722 1.948 14.68 2 5.49 0 11.54-.95 16.36-4.14 4.693-3.131 7.741-8.197 8.31-13.81C215.83 180.39 200.91 176.08 191 173.22ZM42 112v-72C42 32.268 48.268 26 56 26h96c1.591 .001 3.116 .634 4.24 1.76l56 56c1.126 1.124 1.759 2.649 1.76 4.24v24c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-18h-50c-3.314 0-6-2.686-6-6v-50h-90c-1.105 0-2 .895-2 2v72c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6ZM158 82h35.5L158 46.48Z"),
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
        return _fileXls!!
    }

private var _fileXls: ImageVector? = null
