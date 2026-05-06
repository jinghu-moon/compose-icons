package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GreaterThan: ImageVector
    get() {
        if (_greaterThan != null) return _greaterThan!!
        _greaterThan = phosphorFillIcon(
            name = "GreaterThan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM187.35 135.26l-104 48c-3.976 1.678-8.566-.101-10.374-4.019-1.808-3.918-.183-8.565 3.674-10.501L164.91 128 76.65 87.26C73.959 86.124 72.1 83.612 71.802 80.706c-.298-2.906 1.011-5.743 3.416-7.402 2.405-1.659 5.522-1.875 8.133-.564l104 48c2.829 1.309 4.64 4.143 4.64 7.26 0 3.117-1.811 5.951-4.64 7.26Z"),
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
        return _greaterThan!!
    }

private var _greaterThan: ImageVector? = null
