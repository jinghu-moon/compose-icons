package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bridge: ImageVector
    get() {
        if (_bridge != null) return _bridge!!
        _bridge = phosphorLightIcon(
            name = "Bridge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 162h-34v-66.72c7.795 11.515 18.85 20.439 31.75 25.63 1.999 .87 4.313 .586 6.044-.74 1.73-1.327 2.605-3.488 2.284-5.644-.321-2.157-1.786-3.97-3.828-4.735C212.297 100.969 197.936 79.659 198 56c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6 0 32.033-25.967 58-58 58C95.967 114 70 88.033 70 56c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6 .064 23.659-14.297 44.969-36.25 53.79-2.042 .766-3.507 2.579-3.828 4.735-.321 2.157 .554 4.318 2.284 5.644 1.73 1.327 4.044 1.61 6.044 .74C39.15 115.719 50.205 106.795 58 95.28v66.72h-34c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h34v26c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-26h116v26c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-26h34c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM146 123.65v38.35h-36v-38.35c11.795 3.133 24.205 3.133 36 0ZM70 95.15c7.026 10.376 16.691 18.692 28 24.09v42.76h-28ZM158 162v-42.76c11.309-5.398 20.974-13.714 28-24.09v66.85Z"),
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
        return _bridge!!
    }

private var _bridge: ImageVector? = null
