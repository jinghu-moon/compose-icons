package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BugBeetle: ImageVector
    get() {
        if (_bugBeetle != null) return _bugBeetle!!
        _bugBeetle = phosphorLightIcon(
            name = "BugBeetle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M206 150h18c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-18v-20h18c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-18.25C204.334 87.565 196.4 70.237 183.37 57.12L204.24 36.24c1.605-1.496 2.266-3.748 1.723-5.874-.543-2.126-2.203-3.786-4.329-4.329-2.126-.543-4.379 .118-5.874 1.723L174.27 49.25c-27.492-20.335-65.038-20.335-92.53 0L60.24 27.76c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333L72.64 57.12C59.602 70.233 51.664 87.563 50.25 106h-18.25c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h18v20h-18c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h18v10c.007 3.344 .228 6.684 .66 10h-18.66c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h21.18c9.775 33.178 40.232 55.955 74.82 55.955 34.588 0 65.045-22.778 74.82-55.955h21.18c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-18.66c.432-3.316 .653-6.656 .66-10ZM128 46c34.107 .042 62.577 26.037 65.71 60h-131.42C65.423 72.037 93.893 46.042 128 46ZM134 225.71v-81.71c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v81.71C88.037 222.577 62.042 194.107 62 160v-42h132v42c-.042 34.107-26.037 62.577-60 65.71Z"),
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
        return _bugBeetle!!
    }

private var _bugBeetle: ImageVector? = null
