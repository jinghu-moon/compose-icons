package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowFatLineRight: ImageVector
    get() {
        if (_arrowFatLineRight != null) return _arrowFatLineRight!!
        _arrowFatLineRight = phosphorThinIcon(
            name = "ArrowFatLineRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M234.83 125.17l-96-96c-1.144-1.145-2.866-1.488-4.361-.868-1.496 .62-2.47 2.08-2.469 3.698v44h-60c-2.209 0-4 1.791-4 4v96c0 2.209 1.791 4 4 4h60v44c-.002 1.62 .974 3.08 2.47 3.7 1.495 .619 3.217 .275 4.36-.87l96-96c.751-.75 1.173-1.768 1.173-2.83 0-1.062-.422-2.08-1.173-2.83ZM140 214.34v-38.34c0-2.209-1.791-4-4-4h-60v-88h60c2.209 0 4-1.791 4-4v-38.34L226.34 128ZM44 80v96c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-96c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4Z"),
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
        return _arrowFatLineRight!!
    }

private var _arrowFatLineRight: ImageVector? = null
