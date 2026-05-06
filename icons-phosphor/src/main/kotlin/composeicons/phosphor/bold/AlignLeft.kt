package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AlignLeft: ImageVector
    get() {
        if (_alignLeft != null) return _alignLeft!!
        _alignLeft = phosphorBoldIcon(
            name = "AlignLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M52 40v176c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-176C28 33.373 33.373 28 40 28c6.627 0 12 5.373 12 12ZM68 100v-36C68 52.954 76.954 44 88 44h88c11.046 0 20 8.954 20 20v36c0 11.046-8.954 20-20 20h-88C76.954 120 68 111.046 68 100ZM92 96h80v-28h-80ZM236 156v36c0 11.046-8.954 20-20 20h-128C76.954 212 68 203.046 68 192v-36c0-11.046 8.954-20 20-20h128c11.046 0 20 8.954 20 20ZM212 160h-120v28h120Z"),
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
        return _alignLeft!!
    }

private var _alignLeft: ImageVector? = null
