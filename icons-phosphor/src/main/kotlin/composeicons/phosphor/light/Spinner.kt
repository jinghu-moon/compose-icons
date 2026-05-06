package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Spinner: ImageVector
    get() {
        if (_spinner != null) return _spinner!!
        _spinner = phosphorLightIcon(
            name = "Spinner",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M134 32v32c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-32c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM173.25 88.75c1.593 .004 3.122-.626 4.25-1.75L200.12 64.37c2.203-2.364 2.138-6.048-.147-8.333-2.285-2.285-5.969-2.35-8.333-.147L169 78.5c-1.721 1.715-2.238 4.298-1.309 6.543 .929 2.245 3.12 3.708 5.549 3.707ZM224 122h-32c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h32c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM177.5 169c-2.347-2.347-6.153-2.347-8.5 0-2.347 2.347-2.347 6.153 0 8.5l22.63 22.62c2.364 2.203 6.048 2.138 8.333-.147 2.285-2.285 2.35-5.969 .147-8.333ZM128 186c-3.314 0-6 2.686-6 6v32c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-32c0-3.314-2.686-6-6-6ZM78.5 169 55.88 191.64c-1.605 1.496-2.266 3.748-1.723 5.874 .543 2.126 2.203 3.786 4.329 4.329 2.126 .543 4.379-.118 5.874-1.723L87 177.5c2.347-2.347 2.347-6.153 0-8.5-2.347-2.347-6.153-2.347-8.5 0ZM70 128c0-3.314-2.686-6-6-6h-32c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h32c3.314 0 6-2.686 6-6ZM64.36 55.88c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333L78.5 87c2.347 2.347 6.153 2.347 8.5 0 2.347-2.347 2.347-6.153 0-8.5Z"),
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
        return _spinner!!
    }

private var _spinner: ImageVector? = null
