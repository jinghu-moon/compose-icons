package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.TransparencyGrid: ImageVector
    get() {
        if (_transparencyGrid != null) return _transparencyGrid!!
        _transparencyGrid = radixIcon(
            name = "TransparencyGrid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    group(
        groupAlpha = 0.25f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 3.000 15.000 L 0.000 15.000 L 0.000 12.000 L 3.000 12.000 L 3.000 15.000 ZM 9.000 15.000 L 6.000 15.000 L 6.000 12.000 L 9.000 12.000 L 9.000 15.000 ZM 15.000 15.000 L 12.000 15.000 L 12.000 12.000 L 15.000 12.000 L 15.000 15.000 ZM 6.000 12.000 L 3.000 12.000 L 3.000 9.000 L 6.000 9.000 L 6.000 12.000 ZM 12.000 12.000 L 9.000 12.000 L 9.000 9.000 L 12.000 9.000 L 12.000 12.000 ZM 3.000 9.000 L 0.000 9.000 L 0.000 6.000 L 3.000 6.000 L 3.000 9.000 ZM 9.000 9.000 L 6.000 9.000 L 6.000 6.000 L 9.000 6.000 L 9.000 9.000 ZM 15.000 9.000 L 12.000 9.000 L 12.000 6.000 L 15.000 6.000 L 15.000 9.000 ZM 6.000 6.000 L 3.000 6.000 L 3.000 3.000 L 6.000 3.000 L 6.000 6.000 ZM 12.000 6.000 L 9.000 6.000 L 9.000 3.000 L 12.000 3.000 L 12.000 6.000 ZM 3.000 3.000 L 0.000 3.000 L 0.000 0.000 L 3.000 0.000 L 3.000 3.000 ZM 9.000 3.000 L 6.000 3.000 L 6.000 0.000 L 9.000 0.000 L 9.000 3.000 ZM 15.000 3.000 L 12.000 3.000 L 12.000 0.000 L 15.000 0.000 L 15.000 3.000 Z"),
            pathFillType = PathFillType.NonZero,
            fill = SolidColor(Color(0xFF000000)),
            fillAlpha = 1.0f,
            stroke = null,
            strokeAlpha = 1.0f,
            strokeLineWidth = 0.0f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
        )
    }
        }
        return _transparencyGrid!!
    }

private var _transparencyGrid: ImageVector? = null
