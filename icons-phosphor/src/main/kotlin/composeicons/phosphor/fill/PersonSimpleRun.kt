package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PersonSimpleRun: ImageVector
    get() {
        if (_personSimpleRun != null) return _personSimpleRun!!
        _personSimpleRun = phosphorFillIcon(
            name = "PersonSimpleRun",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M120 56c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32C134.327 88 120 73.673 120 56ZM223.28 130.08c-.873-1.938-2.481-3.449-4.47-4.2-1.989-.75-4.194-.679-6.13 .2-.25 .12-26.71 10.72-72.18-20.19C88.21 70.35 52.5 98.12 50.99 99.32c-2.333 1.752-3.526 4.636-3.115 7.525 .412 2.889 2.363 5.324 5.092 6.355 2.729 1.031 5.804 .495 8.023-1.4 .26-.21 25.12-19.5 64.07 3.27-4.25 13.35-12.76 31.82-25.25 47-18.56 22.48-41.11 32.56-67 30-4.399-.445-8.325 2.761-8.77 7.16-.445 4.399 2.761 8.325 7.16 8.77 3.103 .314 6.221 .471 9.34 .47 27.38 0 52-12.38 71.63-36.18 .57-.69 1.14-1.4 1.69-2.1C133.31 175.29 168 190.3 168 232c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-24.65-10.08-45.35-29.15-59.86-9.469-7-20.056-12.345-31.31-15.81C129.823 146.131 135.005 135.293 139 124c26.14 16.09 46.84 20 60.69 20 12.18 0 19.06-3 19.67-3.28 1.934-.887 3.435-2.509 4.171-4.506 .736-1.997 .645-4.204-.251-6.134Z"),
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
