package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Jeep: ImageVector
    get() {
        if (_jeep != null) return _jeep!!
        _jeep = phosphorBoldIcon(
            name = "Jeep",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 84h-6.3L225.09 43.81C223.076 34.61 214.948 28.04 205.53 28h-155.06c-9.418 .04-17.546 6.61-19.56 15.81L22.3 84h-6.3C9.373 84 4 89.373 4 96c0 6.627 5.373 12 12 12h4v92c0 11.046 8.954 20 20 20h28c11.046 0 20-8.954 20-20v-20h80v20c0 11.046 8.954 20 20 20h28c11.046 0 20-8.954 20-20v-92h4c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM53.7 52h148.6l6.86 32h-162.32ZM64 196h-20v-16h20ZM192 196v-16h20v16ZM212 156h-32v-24c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v24h-16v-24c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v24h-16v-24c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v24h-32v-48h168Z"),
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
        return _jeep!!
    }

private var _jeep: ImageVector? = null
