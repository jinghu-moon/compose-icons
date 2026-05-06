package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MaskHappy: ImageVector
    get() {
        if (_maskHappy != null) return _maskHappy!!
        _maskHappy = phosphorThinIcon(
            name = "MaskHappy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M187 125.33c1.472 1.657 1.322 4.193-.335 5.665-1.657 1.472-4.193 1.322-5.665-.335C177.6 126.86 170.28 124 164 124c-6.28 0-13.62 2.86-17 6.66-.762 .856-1.854 1.344-3 1.34-1.582 .009-3.021-.916-3.67-2.359-.649-1.443-.387-3.133 .67-4.311 4.92-5.5 14.37-9.33 23-9.33 8.63 0 18.06 3.83 23 9.33ZM109 130.66c1.472 1.657 4.008 1.807 5.665 .335 1.657-1.472 1.807-4.008 .335-5.665C110.08 119.83 100.63 116 92 116c-8.63 0-18.06 3.83-23 9.33-1.056 1.178-1.319 2.868-.67 4.311 .649 1.443 2.087 2.368 3.67 2.359 1.146 .004 2.238-.484 3-1.34C78.4 126.86 85.72 124 92 124c6.28 0 13.62 2.86 17 6.66ZM159.3 165.4c-7.769 9.257-19.235 14.602-31.32 14.602-12.085 0-23.551-5.346-31.32-14.602-1.436-1.682-3.963-1.881-5.645-.445-1.682 1.436-1.881 3.963-.445 5.645 9.295 11.031 22.985 17.398 37.41 17.398 14.425 0 28.115-6.366 37.41-17.398 1.436-1.682 1.237-4.209-.445-5.645-1.682-1.436-4.209-1.237-5.645 .445ZM220 48v55.78c0 35-9.4 68-26.48 92.92C176.13 222.05 152.86 236 128 236 103.14 236 79.87 222.05 62.48 196.71 45.4 171.83 36 138.83 36 103.79v-55.79c-.004-3.962 1.948-7.67 5.216-9.91 3.268-2.24 7.431-2.723 11.124-1.29C66.66 42.38 95.53 51.7 128 51.7c32.47 0 61.34-9.32 75.66-14.88 3.69-1.432 7.849-.951 11.116 1.284 3.267 2.235 5.221 5.938 5.224 9.896ZM212 48c.003-1.32-.646-2.556-1.734-3.304-1.088-.748-2.475-.911-3.706-.436C191.72 50 161.77 59.7 128 59.7 94.23 59.7 64.28 50 49.44 44.27 48.98 44.095 48.492 44.004 48 44c-.798-.002-1.577 .242-2.23 .7C44.67 45.439 44.007 46.675 44 48v55.77C44 172.28 81.68 228 128 228c46.32 0 84-55.72 84-124.21Z"),
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
        return _maskHappy!!
    }

private var _maskHappy: ImageVector? = null
