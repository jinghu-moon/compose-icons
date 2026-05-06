package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PersonSimpleRun: ImageVector
    get() {
        if (_personSimpleRun != null) return _personSimpleRun!!
        _personSimpleRun = phosphorBoldIcon(
            name = "PersonSimpleRun",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 92c19.882 0 36-16.118 36-36C188 36.118 171.882 20 152 20c-19.882 0-36 16.118-36 36 0 19.882 16.118 36 36 36ZM152 44c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12ZM228 137.4c.001 4.693-2.734 8.955-7 10.91-6.898 2.441-14.153 3.719-21.47 3.78-14 0-34.25-3.82-59.77-19-2.957 7.219-6.388 14.234-10.27 21C153.12 162.83 188 183.8 188 232c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-18.69-6.95-33.06-21.26-43.94-9.16-7-19.55-11-27.43-13.34-.81 1-1.64 2-2.5 2.95-20 22.87-44.82 34.76-72.25 34.76-3.256-0-6.51-.164-9.75-.49-4.291-.396-8.04-3.063-9.822-6.986-1.782-3.923-1.324-8.501 1.2-11.993 2.524-3.492 6.727-5.363 11.011-4.901 52.3 5.22 77.48-45.92 85.79-67.75C84.8 102.46 63.74 118.78 63.51 119c-5.182 3.893-12.519 2.967-16.572-2.091-4.053-5.058-3.357-12.42 1.572-16.629C50.08 99 88 69.44 142.75 106.62c43.1 29.31 68.1 19.92 68.5 19.76 3.705-1.597 7.965-1.225 11.337 .989 3.372 2.215 5.406 5.976 5.413 10.011Z"),
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
        return _personSimpleRun!!
    }

private var _personSimpleRun: ImageVector? = null
