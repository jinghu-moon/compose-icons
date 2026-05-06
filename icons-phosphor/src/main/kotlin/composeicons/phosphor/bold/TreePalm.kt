package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TreePalm: ImageVector
    get() {
        if (_treePalm != null) return _treePalm!!
        _treePalm = phosphorBoldIcon(
            name = "TreePalm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240.69 50.47C227.289 36.135 208.544 27.999 188.92 27.999c-19.624 0-38.369 8.137-51.77 22.471-3.423 3.601-6.487 7.526-9.15 11.72-2.663-4.194-5.727-8.119-9.15-11.72C105.449 36.135 86.704 27.999 67.08 27.999c-19.624 0-38.369 8.137-51.77 22.471-2.703 2.837-3.85 6.815-3.073 10.656 .777 3.841 3.38 7.06 6.973 8.624L66 90.12C31.355 104.806 12.828 142.774 22.57 179.12c1.045 3.854 3.938 6.937 7.719 8.222 3.781 1.286 7.953 .606 11.131-1.812L116 128.75v95.25c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-95.25l74.54 56.79c3.178 2.419 7.35 3.098 11.131 1.812 3.781-1.286 6.674-4.368 7.719-8.222 9.742-36.346-8.785-74.314-43.43-89L236.79 69.76c3.593-1.564 6.196-4.783 6.973-8.624 .777-3.841-.37-7.819-3.073-10.656ZM67.08 52c13.041 .031 25.487 5.462 34.38 15 4.688 4.935 8.37 10.737 10.84 17.08L48 56.1C53.996 53.393 60.501 51.995 67.08 52ZM44.39 153.15c2.702-20.874 17.784-38.028 38.14-43.38 4.424-1.175 8.982-1.77 13.56-1.77 2.341-.006 4.68 .151 7 .47ZM205 133.81c3.468 5.939 5.703 12.517 6.57 19.34L153 108.46c6.856-.927 13.828-.481 20.51 1.31 13.277 3.505 24.609 12.157 31.49 24.04ZM143.7 84.08C146.17 77.737 149.852 71.935 154.54 67c8.893-9.538 21.339-14.969 34.38-15 6.579-.005 13.084 1.393 19.08 4.1Z"),
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
        return _treePalm!!
    }

private var _treePalm: ImageVector? = null
