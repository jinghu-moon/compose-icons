package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Pizza: ImageVector
    get() {
        if (_pizza != null) return _pizza!!
        _pizza = phosphorThinIcon(
            name = "Pizza",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.66 63.94c-.747-3.104-2.706-5.78-5.44-7.43C167.374 18.498 88.626 18.498 25.78 56.51c-5.645 3.449-7.434 10.816-4 16.47l96 157.27c2.173 3.596 6.069 5.793 10.27 5.793 4.201 0 8.097-2.197 10.27-5.793L234.25 73c1.661-2.71 2.169-5.973 1.41-9.06ZM58.59 118c7.843-9.347 20.836-12.54 32.117-7.891 11.281 4.649 18.254 16.067 17.235 28.226-1.019 12.159-9.794 22.258-21.692 24.965ZM152.59 191.41c-12.488-8.342-16.17-25.051-8.346-37.87 7.824-12.819 24.368-17.183 37.496-9.89ZM185.92 136.8C180.475 133.647 174.292 131.991 168 132c-15.953 .002-30.002 10.502-34.521 25.802-4.519 15.299 1.57 31.749 14.961 40.418l-17 27.86c-.721 1.214-2.028 1.959-3.44 1.959-1.412 0-2.719-.744-3.44-1.959l-34-55.67c14.378-4.403 24.505-17.278 25.396-32.289 .891-15.011-7.641-28.994-21.397-35.067C80.803 96.981 64.722 100.098 54.23 110.87L43.33 93C94.865 59.697 161.135 59.697 212.67 93ZM227.4 68.8 216.85 86.14C162.744 51.286 93.256 51.286 39.15 86.14L28.58 68.81c-.552-.897-.718-1.979-.46-3 .252-1.036 .907-1.929 1.82-2.48 60.288-36.466 135.832-36.466 196.12 0 .913 .551 1.568 1.444 1.82 2.48 .258 1.021 .092 2.103-.46 3Z"),
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
        return _pizza!!
    }

private var _pizza: ImageVector? = null
