package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Pointer: ImageVector
    get() {
        if (_pointer != null) return _pointer!!
        _pointer = tablerFilledIcon(
            name = "Pointer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.039 4.277 6.943 17.84c.185 .837 .92 1.516 1.831 1.642l.17 .016c.794 .048 1.552-.337 1.982-1.006l.045-.078 1.4-2.072 4.05 4.05c.388 .388 .914 .606 1.462 .606 .548 0 1.074-.218 1.462-.606l1.047-1.047c.388-.388 .606-.913 .606-1.461l-.008-.182c-.043-.484-.255-.937-.598-1.28L16.345 12.374l2.103-1.412c.726-.385 1.18-1.278 1.053-2.189C19.375 7.863 18.697 7.128 17.8 6.928L4.276 3.038c-.35-.1-.727-.003-.984 .255-.257 .258-.354 .635-.252 .985Z"),
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
        return _pointer!!
    }

private var _pointer: ImageVector? = null
