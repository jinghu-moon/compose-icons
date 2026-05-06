package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FastForwardCircle: ImageVector
    get() {
        if (_fastForwardCircle != null) return _fastForwardCircle!!
        _fastForwardCircle = phosphorThinIcon(
            name = "FastForwardCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM128 220C77.19 220 36 178.81 36 128 36 77.19 77.19 36 128 36c50.81 0 92 41.19 92 92-.055 50.787-41.213 91.945-92 92ZM190.4 124.8l-48-36c-1.212-.909-2.834-1.055-4.189-.378C136.856 89.1 136 90.485 136 92v72c-.001 1.516 .855 2.902 2.21 3.58 .557 .275 1.169 .419 1.79 .42 .865 0 1.708-.281 2.4-.8l48-36c1.007-.755 1.6-1.941 1.6-3.2 0-1.259-.593-2.445-1.6-3.2ZM144 156v-56l37.33 28ZM134.4 124.8l-48-36c-1.212-.909-2.834-1.055-4.189-.378C80.856 89.1 80 90.485 80 92v72c-.001 1.516 .855 2.902 2.21 3.58 .557 .275 1.169 .419 1.79 .42 .865 0 1.708-.281 2.4-.8l48-36c1.007-.755 1.6-1.941 1.6-3.2 0-1.259-.593-2.445-1.6-3.2ZM88 156v-56l37.33 28Z"),
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
        return _fastForwardCircle!!
    }

private var _fastForwardCircle: ImageVector? = null
