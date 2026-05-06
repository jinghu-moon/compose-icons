package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LineSegments: ImageVector
    get() {
        if (_lineSegments != null) return _lineSegments!!
        _lineSegments = phosphorThinIcon(
            name = "LineSegments",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.81 36.19c-5.251-5.252-12.373-8.202-19.8-8.202-7.427 0-14.549 2.95-19.8 8.202h0c-5.252 5.251-8.202 12.373-8.202 19.8 0 7.427 2.95 14.549 8.202 19.8 .975 .984 2.024 1.89 3.14 2.71l-29.73 55.21c-8.884-3.233-18.799-1.779-26.38 3.87L118.42 112.76c8.795-11.761 7.009-28.318-4.092-37.933C103.228 65.213 86.586 65.807 76.2 76.19h0c-5.763 5.761-8.731 13.748-8.128 21.875 .603 8.127 4.717 15.588 11.268 20.435L49.6 173.72c-10.231-3.742-21.704-1.21-29.41 6.49h0c-10.934 10.935-10.933 28.663 .001 39.597 10.935 10.934 28.663 10.934 39.597 0 10.935-10.934 10.935-28.662 .001-39.597-.98-.978-2.029-1.884-3.14-2.71L86.38 122.29c8.883 3.248 18.805 1.793 26.38-3.87l24.82 24.82c-6.787 9.08-7.429 21.357-1.626 31.096 5.803 9.739 16.905 15.017 28.121 13.37 11.216-1.647 20.332-9.894 23.091-20.89 2.758-10.996-1.386-22.57-10.496-29.316L206.4 82.28c12.334 4.501 26.14-.173 33.203-11.242 7.063-11.069 5.486-25.558-3.793-34.848ZM54.13 214.19c-5.719 5.721-14.322 7.433-21.797 4.338C24.859 215.433 19.986 208.14 19.986 200.05c0-8.09 4.873-15.383 12.348-18.478 7.474-3.095 16.077-1.383 21.797 4.338 7.781 7.805 7.781 20.435 0 28.24ZM81.85 110.19c-7.808-7.811-7.806-20.473 .004-28.282 7.81-7.809 20.472-7.809 28.282 0 7.81 7.809 7.812 20.471 .004 28.282h0c-3.758 3.746-8.85 5.845-14.155 5.836-5.306-.009-10.39-2.127-14.135-5.886ZM174.15 174.19c-7.811 7.808-20.473 7.806-28.282-.004-7.809-7.81-7.809-20.472 0-28.282 7.809-7.81 20.471-7.812 28.282-.004 7.788 7.807 7.788 20.443 0 28.25ZM230.15 70.19c-7.811 7.808-20.473 7.806-28.282-.004-7.809-7.81-7.809-20.472 0-28.282 7.809-7.81 20.471-7.812 28.282-.004 7.781 7.805 7.781 20.435 0 28.24Z"),
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
        return _lineSegments!!
    }

private var _lineSegments: ImageVector? = null
