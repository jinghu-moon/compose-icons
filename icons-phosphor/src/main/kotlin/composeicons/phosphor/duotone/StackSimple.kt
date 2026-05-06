package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.StackSimple: ImageVector
    get() {
        if (_stackSimple != null) return _stackSimple!!
        _stackSimple = phosphorDuotoneIcon(
            name = "StackSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 104 128 168 16 104 128 40Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M12 111l112 64c2.46 1.406 5.48 1.406 7.94 0l112-64c2.497-1.423 4.038-4.076 4.038-6.95 0-2.874-1.541-5.527-4.038-6.95l-112-64c-2.46-1.406-5.48-1.406-7.94 0l-112 64c-2.497 1.423-4.038 4.076-4.038 6.95 0 2.874 1.541 5.527 4.038 6.95ZM128 49.21 223.87 104 128 158.79 32.13 104ZM247 140c1.078 1.853 1.367 4.06 .803 6.128-.564 2.068-1.934 3.823-3.803 4.872L132 215c-2.46 1.406-5.48 1.406-7.94 0L12 151C8.148 148.791 6.816 143.877 9.025 140.025c2.209-3.852 7.123-5.184 10.975-2.975l108 61.74L236 137.05c1.847-1.082 4.05-1.379 6.117-.825 2.067 .554 3.826 1.914 4.883 3.775Z"),
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
        return _stackSimple!!
    }

private var _stackSimple: ImageVector? = null
