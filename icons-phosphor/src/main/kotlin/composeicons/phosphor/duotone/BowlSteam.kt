package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BowlSteam: ImageVector
    get() {
        if (_bowlSteam != null) return _bowlSteam!!
        _bowlSteam = phosphorDuotoneIcon(
            name = "BowlSteam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 120c.012 37.547-21.867 71.655-56 87.3v8.7c0 4.418-3.582 8-8 8h-64c-4.418 0-8-3.582-8-8v-8.7C53.867 191.655 31.988 157.547 32 120Z"),
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
                pathData = parseSvgPathData("M81.77 55c5.35-6.66 6.67-11.16 6.12-13.14-.42-1.49-2.41-2.26-2.43-2.26C81.719 38.371 79.429 34.601 80.062 30.714 80.695 26.827 84.062 23.979 88 24c.807 .001 1.609 .122 2.38 .36 1 .31 9.91 3.33 12.79 12.76 2.46 8.07-.55 17.45-8.94 27.89-5.35 6.66-6.67 11.16-6.12 13.14 .42 1.49 2.37 2.24 2.39 2.25 3.734 1.227 6.023 4.985 5.401 8.866C95.279 93.147 91.93 96.001 88 96c-.807-.001-1.609-.122-2.38-.36-1-.31-9.91-3.33-12.79-12.76C70.37 74.81 73.38 65.43 81.77 55ZM112.83 82.89c2.88 9.43 11.79 12.45 12.79 12.76 .772 .234 1.574 .352 2.38 .35 3.93 .001 7.279-2.853 7.901-6.734 .622-3.881-1.667-7.639-5.401-8.866 0 0-2-.76-2.39-2.25-.55-2 .77-6.48 6.12-13.14 8.39-10.44 11.4-19.82 8.94-27.89C140.29 27.69 131.39 24.67 130.38 24.36c-.771-.238-1.573-.359-2.38-.36-3.926-.006-7.276 2.838-7.908 6.714-.631 3.875 1.643 7.636 5.368 8.876 0 0 2 .77 2.43 2.26 .55 2-.77 6.48-6.12 13.14-8.39 10.44-11.4 19.82-8.94 27.89ZM152.83 82.89c2.88 9.43 11.79 12.45 12.79 12.76 .772 .234 1.574 .352 2.38 .35 3.93 .001 7.279-2.853 7.901-6.734 .622-3.881-1.667-7.639-5.401-8.866 0 0-2-.76-2.39-2.25-.55-2 .77-6.48 6.12-13.14 8.39-10.44 11.4-19.82 8.94-27.89C180.29 27.69 171.39 24.67 170.38 24.36c-.771-.238-1.573-.359-2.38-.36-3.926-.006-7.276 2.838-7.908 6.714-.631 3.875 1.643 7.636 5.368 8.876 0 0 2 .77 2.43 2.26 .55 2-.77 6.48-6.12 13.14-8.39 10.44-11.4 19.82-8.94 27.89ZM232 120c-.072 38.775-21.638 74.314-56 92.28v3.72c0 8.837-7.163 16-16 16h-64c-8.837 0-16-7.163-16-16v-3.72C45.638 194.314 24.072 158.775 24 120c0-4.418 3.582-8 8-8h192c4.418 0 8 3.582 8 8ZM215.63 128h-175.26c2.929 31.383 22.367 58.824 51 72 2.835 1.317 4.643 4.164 4.63 7.29v8.71h64v-8.71c-0-3.126 1.82-5.965 4.66-7.27C193.287 186.832 212.713 159.384 215.63 128Z"),
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
        return _bowlSteam!!
    }

private var _bowlSteam: ImageVector? = null
