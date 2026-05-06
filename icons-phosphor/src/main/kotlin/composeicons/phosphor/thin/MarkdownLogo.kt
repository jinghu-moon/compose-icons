package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MarkdownLogo: ImageVector
    get() {
        if (_markdownLogo != null) return _markdownLogo!!
        _markdownLogo = phosphorThinIcon(
            name = "MarkdownLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 52h-208C17.373 52 12 57.373 12 64v128c0 6.627 5.373 12 12 12h208c6.627 0 12-5.373 12-12v-128c0-6.627-5.373-12-12-12ZM236 192c0 2.209-1.791 4-4 4h-208c-2.209 0-4-1.791-4-4v-128c0-2.209 1.791-4 4-4h208c2.209 0 4 1.791 4 4ZM124 104v48c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-38.34L90.83 138.83c-.75 .751-1.768 1.173-2.83 1.173-1.062 0-2.08-.422-2.83-1.173L60 113.66v38.34c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-48c-.001-1.619 .973-3.079 2.469-3.698 1.496-.62 3.217-.277 4.361 .868L88 130.34l29.17-29.17c1.144-1.145 2.866-1.488 4.361-.868 1.496 .62 2.47 2.08 2.469 3.698ZM202.83 125.17c.751 .75 1.173 1.768 1.173 2.83 0 1.062-.422 2.08-1.173 2.83l-24 24c-.75 .751-1.768 1.173-2.83 1.173-1.062 0-2.08-.422-2.83-1.173l-24-24c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0L172 142.34v-38.34c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v38.34l17.17-17.17c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173Z"),
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
        return _markdownLogo!!
    }

private var _markdownLogo: ImageVector? = null
