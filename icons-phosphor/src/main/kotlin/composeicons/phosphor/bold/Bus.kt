package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bus: ImageVector
    get() {
        if (_bus != null) return _bus!!
        _bus = phosphorBoldIcon(
            name = "Bus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 28h-112C52.118 28 36 44.118 36 64v144c0 11.046 8.954 20 20 20h28c11.046 0 20-8.954 20-20v-16h48v16c0 11.046 8.954 20 20 20h28c11.046 0 20-8.954 20-20v-144C220 44.118 203.882 28 184 28ZM60 168v-56h136v56ZM72 52h112c6.627 0 12 5.373 12 12v24h-136v-24C60 57.373 65.373 52 72 52ZM80 204h-20v-12h20ZM176 204v-12h20v12ZM108 140c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM180 140c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM256 80v24c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-24c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM24 80v24c0 6.627-5.373 12-12 12C5.373 116 0 110.627 0 104v-24C0 73.373 5.373 68 12 68c6.627 0 12 5.373 12 12Z"),
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
        return _bus!!
    }

private var _bus: ImageVector? = null
