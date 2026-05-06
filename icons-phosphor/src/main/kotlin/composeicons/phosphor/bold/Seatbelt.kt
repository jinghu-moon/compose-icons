package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Seatbelt: ImageVector
    get() {
        if (_seatbelt != null) return _seatbelt!!
        _seatbelt = phosphorBoldIcon(
            name = "Seatbelt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 212h-110.55L199.63 121.26c3.386-2.702 5.053-7.019 4.361-11.296-.692-4.277-3.635-7.848-7.7-9.345-4.065-1.497-8.622-.686-11.921 2.121l-17.78 14.64c-5.41-2.798-11.111-4.994-17-6.55 19.842-10.016 30.213-32.345 25.065-53.968C169.507 35.24 150.187 19.98 127.96 19.98c-22.227 0-41.547 15.26-46.695 36.883-5.148 21.623 5.222 43.951 25.065 53.968-27.266 7.256-49.059 27.73-58 54.49-2.104 6.285 1.285 13.086 7.57 15.19 6.285 2.104 13.086-1.285 15.19-7.57 10.359-30.86 43.419-47.847 74.54-38.3L48.37 214.74c-3.907 3.221-5.373 8.547-3.662 13.314 1.71 4.766 6.229 7.945 11.292 7.946h144c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM128 44c13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24C114.745 92 104 81.255 104 68c0-13.255 10.745-24 24-24ZM204.61 157.51c3.597 7.978 5.919 16.472 6.88 25.17 .729 6.589-4.021 12.521-10.61 13.25-6.589 .729-12.521-4.021-13.25-10.61-.676-6.204-2.33-12.263-4.9-17.95-2.652-6.028 .05-13.067 6.054-15.773 6.004-2.706 13.067-.067 15.826 5.913Z"),
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
        return _seatbelt!!
    }

private var _seatbelt: ImageVector? = null
