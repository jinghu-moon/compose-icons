package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowFatLeft: ImageVector
    get() {
        if (_arrowFatLeft != null) return _arrowFatLeft!!
        _arrowFatLeft = phosphorThinIcon(
            name = "ArrowFatLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 76h-84v-44c.001-1.619-.973-3.079-2.469-3.698-1.496-.62-3.217-.277-4.361 .868L21.17 125.17c-.751 .75-1.173 1.768-1.173 2.83 0 1.062 .422 2.08 1.173 2.83l96 96c1.144 1.145 2.866 1.488 4.361 .868 1.496-.62 2.47-2.08 2.469-3.698v-44h84c6.627 0 12-5.373 12-12v-80c0-6.627-5.373-12-12-12ZM212 168c0 2.209-1.791 4-4 4h-88c-2.209 0-4 1.791-4 4v38.34L29.66 128 116 41.66v38.34c0 2.209 1.791 4 4 4h88c2.209 0 4 1.791 4 4Z"),
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
        return _arrowFatLeft!!
    }

private var _arrowFatLeft: ImageVector? = null
