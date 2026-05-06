package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AlignRight: ImageVector
    get() {
        if (_alignRight != null) return _alignRight!!
        _alignRight = phosphorBoldIcon(
            name = "AlignRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 40v176c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-176c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM188 64v36c0 11.046-8.954 20-20 20h-88C68.954 120 60 111.046 60 100v-36C60 52.954 68.954 44 80 44h88c11.046 0 20 8.954 20 20ZM164 68h-80v28h80ZM188 156v36c0 11.046-8.954 20-20 20h-128C28.954 212 20 203.046 20 192v-36c0-11.046 8.954-20 20-20h128c11.046 0 20 8.954 20 20ZM164 160h-120v28h120Z"),
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
        return _alignRight!!
    }

private var _alignRight: ImageVector? = null
