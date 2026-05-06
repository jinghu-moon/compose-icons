package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FlipVertical: ImageVector
    get() {
        if (_flipVertical != null) return _flipVertical!!
        _flipVertical = phosphorBoldIcon(
            name = "FlipVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M56 120h160c9.513-.001 17.709-6.702 19.6-16.026 1.89-9.324-3.048-18.688-11.81-22.394l-.46-.19L63.51 21.47C57.346 18.973 50.343 19.703 44.827 23.419 39.31 27.134 36.002 33.349 36 40v60c0 11.046 8.954 20 20 20ZM60 45.79 193.91 96h-133.91ZM216 136h-160c-11.046 0-20 8.954-20 20v60c-.001 6.653 3.306 12.871 8.823 16.589 5.517 3.718 12.521 4.449 18.687 1.951L223.32 174.62l.46-.19c8.773-3.698 13.724-13.067 11.835-22.398C233.726 142.7 225.521 135.994 216 136ZM60 210.22v-50.22h133.91Z"),
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
        return _flipVertical!!
    }

private var _flipVertical: ImageVector? = null
