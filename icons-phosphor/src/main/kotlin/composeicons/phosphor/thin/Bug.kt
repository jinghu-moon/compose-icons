package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bug: ImageVector
    get() {
        if (_bug != null) return _bug!!
        _bug = phosphorThinIcon(
            name = "Bug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M148 92c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM100 84c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM244 128c0 2.209-1.791 4-4 4h-28v12c.005 8.548-1.3 17.047-3.87 25.2l25.47 11.13c1.741 .755 2.712 2.629 2.325 4.487-.388 1.858-2.027 3.187-3.925 3.183-.55-.001-1.094-.114-1.6-.33l-25-10.95c-13.149 31.076-43.617 51.267-77.36 51.267-33.743 0-64.211-20.191-77.36-51.267l-25 10.95c-.53 .227-1.103 .34-1.68 .33-1.898 .004-3.537-1.325-3.925-3.183-.388-1.858 .584-3.732 2.325-4.487L47.87 169.2C45.3 161.047 43.995 152.548 44 144v-12h-28c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h28v-12c-.005-8.548 1.3-17.047 3.87-25.2L22.4 75.67c-2.027-.884-2.954-3.243-2.07-5.27 .884-2.027 3.243-2.954 5.27-2.07l25 11C63.749 48.254 94.217 28.063 127.96 28.063c33.743 0 64.211 20.191 77.36 51.267l25-11c2.027-.884 4.386 .043 5.27 2.07 .884 2.027-.043 4.386-2.07 5.27L208.13 86.8c2.57 8.153 3.875 16.652 3.87 25.2v12h28c2.209 0 4 1.791 4 4ZM52 124h152v-12C204 70.026 169.974 36 128 36 86.026 36 52 70.026 52 112ZM124 219.89v-87.89h-72v12c.048 40.399 31.659 73.718 72 75.89ZM204 132h-72v87.89c40.341-2.172 71.952-35.491 72-75.89Z"),
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
        return _bug!!
    }

private var _bug: ImageVector? = null
