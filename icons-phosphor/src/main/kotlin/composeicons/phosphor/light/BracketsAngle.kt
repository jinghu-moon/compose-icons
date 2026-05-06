package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BracketsAngle: ImageVector
    get() {
        if (_bracketsAngle != null) return _bracketsAngle!!
        _bracketsAngle = phosphorLightIcon(
            name = "BracketsAngle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M85.06 43.22 31.11 128l54 84.78c1.777 2.795 .953 6.501-1.84 8.28-2.795 1.777-6.501 .953-8.28-1.84l-56-88c-1.25-1.965-1.25-4.475 0-6.44l56-88c1.82-2.691 5.451-3.445 8.191-1.701 2.741 1.744 3.596 5.353 1.929 8.141ZM237.06 124.78l-56-88c-1.12-1.874-3.171-2.992-5.353-2.918-2.182 .074-4.152 1.327-5.143 3.273-.991 1.946-.847 4.276 .376 6.085L224.89 128l-53.95 84.78c-1.777 2.795-.953 6.501 1.84 8.28 2.795 1.777 6.501 .953 8.28-1.84l56-88c1.25-1.965 1.25-4.475 0-6.44Z"),
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
        return _bracketsAngle!!
    }

private var _bracketsAngle: ImageVector? = null
