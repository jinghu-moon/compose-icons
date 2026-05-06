package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PianoKeys: ImageVector
    get() {
        if (_pianoKeys != null) return _pianoKeys!!
        _pianoKeys = phosphorThinIcon(
            name = "PianoKeys",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 36h-160C41.373 36 36 41.373 36 48v160c0 6.627 5.373 12 12 12h160c6.627 0 12-5.373 12-12v-160c0-6.627-5.373-12-12-12ZM76 44h32v96h-32ZM112 148c2.209 0 4-1.791 4-4v-100h24v100c0 2.209 1.791 4 4 4h12v64h-56v-64ZM148 140v-96h32v96ZM44 208v-160c0-2.209 1.791-4 4-4h20v100c0 2.209 1.791 4 4 4h20v64h-44c-2.209 0-4-1.791-4-4ZM212 208c0 2.209-1.791 4-4 4h-44v-64h20c2.209 0 4-1.791 4-4v-100h20c2.209 0 4 1.791 4 4Z"),
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
        return _pianoKeys!!
    }

private var _pianoKeys: ImageVector? = null
