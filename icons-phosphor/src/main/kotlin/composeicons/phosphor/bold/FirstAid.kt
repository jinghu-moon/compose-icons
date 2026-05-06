package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FirstAid: ImageVector
    get() {
        if (_firstAid != null) return _firstAid!!
        _firstAid = phosphorBoldIcon(
            name = "FirstAid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 84h-44v-44C172 28.954 163.046 20 152 20h-48C92.954 20 84 28.954 84 40v44h-44C28.954 84 20 92.954 20 104v48c0 11.046 8.954 20 20 20h44v44c0 11.046 8.954 20 20 20h48c11.046 0 20-8.954 20-20v-44h44c11.046 0 20-8.954 20-20v-48C236 92.954 227.046 84 216 84ZM212 148h-52c-6.627 0-12 5.373-12 12v52h-40v-52c0-6.627-5.373-12-12-12h-52v-40h52c6.627 0 12-5.373 12-12v-52h40v52c0 6.627 5.373 12 12 12h52Z"),
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
        return _firstAid!!
    }

private var _firstAid: ImageVector? = null
