package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Polygon: ImageVector
    get() {
        if (_polygon != null) return _polygon!!
        _polygon = phosphorThinIcon(
            name = "Polygon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.81 52.19c-5.251-5.252-12.373-8.202-19.8-8.202-7.427 0-14.549 2.95-19.8 8.202h0c-2.489 2.486-4.484 5.421-5.88 8.65L147.77 51.42C149.225 39.564 142.998 28.091 132.265 22.849c-10.733-5.241-23.61-3.097-32.065 5.341h0C90.766 37.647 89.31 52.445 96.72 63.56L57.91 98.49C46.786 89.221 30.43 89.963 20.19 100.2h0c-10.935 10.935-10.935 28.665 0 39.6 10.935 10.935 28.665 10.935 39.6 0l.18-.19 75.32 55.24c-5.328 10.012-4.09 22.25 3.136 30.992 7.225 8.742 19.011 12.262 29.847 8.914 10.836-3.348 18.583-12.902 19.618-24.196C188.927 199.266 183.047 188.462 173 183.2L202.56 99.45c1.792 .357 3.613 .541 5.44 .55 11.321-.003 21.526-6.824 25.86-17.283 4.333-10.459 1.942-22.498-6.06-30.507ZM105.86 33.85c7.811-7.808 20.473-7.806 28.282 .004 7.809 7.81 7.809 20.472 0 28.282-7.809 7.81-20.471 7.812-28.282 .004C102.108 58.389 99.999 53.301 99.999 47.995c0-5.306 2.108-10.394 5.861-14.145ZM25.86 134.14c-5.721-5.719-7.433-14.322-4.338-21.797C24.617 104.869 31.91 99.996 40 99.996c8.09 0 15.383 4.873 18.478 12.348 3.095 7.474 1.383 16.077-4.338 21.797-3.751 3.752-8.839 5.861-14.145 5.861-5.306 0-10.394-2.108-14.145-5.861ZM174.16 222.14c-5.719 5.721-14.322 7.433-21.797 4.338C144.889 223.383 140.016 216.09 140.016 208c0-8.09 4.873-15.383 12.348-18.478 7.474-3.095 16.077-1.383 21.797 4.338 3.751 3.752 5.858 8.841 5.856 14.147-.002 5.306-2.112 10.393-5.866 14.143ZM165.46 180.54c-9.168-1.821-18.639 1.052-25.25 7.66h0l-.18 .19L64.71 133.16c4.823-9.117 4.271-20.141-1.44-28.73L102.08 69.5c6.775 5.643 15.813 7.764 24.391 5.726 8.578-2.038 15.696-7.998 19.209-16.086l34.56 9.43c-1.051 8.559 1.9 17.125 8 23.22 1.997 2.005 4.291 3.691 6.8 5ZM222.16 86.13c-7.811 7.808-20.473 7.806-28.282-.004-7.809-7.81-7.809-20.472 0-28.282 7.809-7.81 20.471-7.812 28.282-.004 3.754 3.753 5.863 8.844 5.861 14.152-.002 5.308-2.114 10.398-5.871 14.148Z"),
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
        return _polygon!!
    }

private var _polygon: ImageVector? = null
