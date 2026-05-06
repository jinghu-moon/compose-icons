package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AlignCenterHorizontal: ImageVector
    get() {
        if (_alignCenterHorizontal != null) return _alignCenterHorizontal!!
        _alignCenterHorizontal = phosphorBoldIcon(
            name = "AlignCenterHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 136h-68v-16h44c11.046 0 20-8.954 20-20v-40C204 48.954 195.046 40 184 40h-44v-8c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v8h-44C60.954 40 52 48.954 52 60v40c0 11.046 8.954 20 20 20h44v16h-68c-11.046 0-20 8.954-20 20v40c0 11.046 8.954 20 20 20h68v8c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-8h68c11.046 0 20-8.954 20-20v-40c0-11.046-8.954-20-20-20ZM76 64h104v32h-104ZM204 192h-152v-32h152Z"),
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
        return _alignCenterHorizontal!!
    }

private var _alignCenterHorizontal: ImageVector? = null
