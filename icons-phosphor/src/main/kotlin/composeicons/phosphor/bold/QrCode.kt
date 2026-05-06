package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.QrCode: ImageVector
    get() {
        if (_qrCode != null) return _qrCode!!
        _qrCode = phosphorBoldIcon(
            name = "QrCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M100 36h-44C44.954 36 36 44.954 36 56v44c0 11.046 8.954 20 20 20h44c11.046 0 20-8.954 20-20v-44C120 44.954 111.046 36 100 36ZM96 96h-36v-36h36ZM100 136h-44c-11.046 0-20 8.954-20 20v44c0 11.046 8.954 20 20 20h44c11.046 0 20-8.954 20-20v-44c0-11.046-8.954-20-20-20ZM96 196h-36v-36h36ZM200 36h-44c-11.046 0-20 8.954-20 20v44c0 11.046 8.954 20 20 20h44c11.046 0 20-8.954 20-20v-44C220 44.954 211.046 36 200 36ZM196 96h-36v-36h36ZM136 172v-24c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v24c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM220 164c0 6.627-5.373 12-12 12h-12v32c0 6.627-5.373 12-12 12h-36c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h24v-48c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v4h12c6.627 0 12 5.373 12 12Z"),
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
        return _qrCode!!
    }

private var _qrCode: ImageVector? = null
