package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Tent: ImageVector
    get() {
        if (_tent != null) return _tent!!
        _tent = phosphorBoldIcon(
            name = "Tent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M255 187.13 191 43.13C189.07 38.784 184.756 35.987 180 36h-104c-4.648 .005-8.875 2.693-10.85 6.9-.044 .074-.084 .151-.12 .23L65 43.3h0L1 187.13c-1.651 3.717-1.306 8.017 .915 11.424C4.137 201.961 7.933 204.011 12 204h232c4.067 .011 7.863-2.039 10.085-5.446 2.221-3.407 2.566-7.707 .915-11.424ZM64 104.55v75.45h-33.54ZM88 180v-75.45L121.54 180ZM147.8 180 94.47 60h77.73l53.34 120Z"),
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
        return _tent!!
    }

private var _tent: ImageVector? = null
