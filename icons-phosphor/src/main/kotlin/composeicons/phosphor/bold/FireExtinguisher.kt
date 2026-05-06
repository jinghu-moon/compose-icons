package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FireExtinguisher: ImageVector
    get() {
        if (_fireExtinguisher != null) return _fireExtinguisher!!
        _fireExtinguisher = phosphorBoldIcon(
            name = "FireExtinguisher",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M219.45 44.51 170.07 29.7 185 22.93c6.034-2.761 8.686-9.891 5.925-15.925C188.164 .971 181.034-1.681 175 1.08L133.22 20.08C87.969 21.625 52.065 58.722 52 104v104c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-28h16v52c0 11.046 8.954 20 20 20h48c11.046 0 20-8.954 20-20v-128C179.968 84.335 166.913 67.069 148 61.68v-13.55l64.55 19.37c1.119 .336 2.282 .505 3.45 .5 5.95-.006 10.997-4.37 11.861-10.256 .865-5.887-2.715-11.518-8.411-13.234ZM76 156v-52C76.038 75.501 96.085 50.948 124 45.21v16.47C105.083 67.063 92.026 84.332 92 104v52ZM116 228v-48h40v48ZM156 104v52h-40v-52c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20Z"),
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
        return _fireExtinguisher!!
    }

private var _fireExtinguisher: ImageVector? = null
