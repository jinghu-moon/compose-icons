package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Vault: ImageVector
    get() {
        if (_vault != null) return _vault!!
        _vault = phosphorBoldIcon(
            name = "Vault",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 36h-176C28.954 36 20 44.954 20 56v136c0 11.046 8.954 20 20 20h12v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-12h104v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-12h12c11.046 0 20-8.954 20-20v-136C236 44.954 227.046 36 216 36ZM44 188v-128h168v52h-21.68C184.331 90.873 163.681 77.396 141.93 80.419 120.18 83.442 103.988 102.04 103.988 124c0 21.96 16.192 40.558 37.942 43.581 21.751 3.023 42.401-10.454 48.39-31.581h21.68v52ZM168 124c0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20Z"),
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
        return _vault!!
    }

private var _vault: ImageVector? = null
