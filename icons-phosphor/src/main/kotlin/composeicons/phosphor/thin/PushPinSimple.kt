package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PushPinSimple: ImageVector
    get() {
        if (_pushPinSimple != null) return _pushPinSimple!!
        _pushPinSimple = phosphorThinIcon(
            name = "PushPinSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 172h-12.64L180.77 44h11.23c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-128c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h11.23L52.64 172h-12.64c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h84v60c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-60h84c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM83.36 44h89.28l22.59 128h-134.46Z"),
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
        return _pushPinSimple!!
    }

private var _pushPinSimple: ImageVector? = null
