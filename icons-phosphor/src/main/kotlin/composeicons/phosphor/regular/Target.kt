package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Target: ImageVector
    get() {
        if (_target != null) return _target!!
        _target = phosphorRegularIcon(
            name = "Target",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M221.87 83.16c22.993 48.089 5.946 105.778-39.493 133.645C136.939 244.672 77.791 233.714 45.351 191.419 12.911 149.123 17.662 89.157 56.356 52.496 95.05 15.835 155.186 14.326 195.67 49L218.34 26.32c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32l-96 96c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L150.06 94.6C134.594 84.371 114.126 86.113 100.61 98.807c-13.516 12.694-16.535 33.013-7.295 49.089 9.24 16.076 28.318 23.694 46.09 18.405 17.772-5.289 29.579-22.099 28.525-40.612-.249-4.418 3.132-8.201 7.55-8.45 4.418-.249 8.201 3.132 8.45 7.55 1.502 26.22-15.418 49.962-40.693 57.097-25.275 7.136-52.113-4.252-64.544-27.387C66.261 131.366 71.577 102.7 91.477 85.561c19.9-17.139 49.037-18.145 70.073-2.421L184.3 60.39C149.775 31.726 99.2 33.676 66.986 64.915 34.771 96.153 31.266 146.644 58.856 182.034c27.589 35.39 77.41 44.31 115.564 20.691 38.154-23.619 52.385-72.19 33.011-112.665-1.905-3.987-.217-8.765 3.77-10.67 3.988-1.905 8.765-.217 10.67 3.77Z"),
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
        return _target!!
    }

private var _target: ImageVector? = null
