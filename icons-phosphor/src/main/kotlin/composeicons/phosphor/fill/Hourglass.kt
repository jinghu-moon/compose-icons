package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Hourglass: ImageVector
    get() {
        if (_hourglass != null) return _hourglass!!
        _hourglass = phosphorFillIcon(
            name = "Hourglass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 75.64v-35.64c0-8.837-7.163-16-16-16h-112C63.163 24 56 31.163 56 40v36c.015 5.035 2.387 9.772 6.41 12.8L114.67 128 62.4 167.2C58.38 170.229 56.011 174.966 56 180v36c0 8.837 7.163 16 16 16h112c8.837 0 16-7.163 16-16v-35.64c0-5.019-2.355-9.746-6.36-12.77L141.26 128 193.64 88.41c3.999-3.029 6.352-7.753 6.36-12.77Z"),
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
        return _hourglass!!
    }

private var _hourglass: ImageVector? = null
