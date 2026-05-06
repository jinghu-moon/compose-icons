package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CursorClick: ImageVector
    get() {
        if (_cursorClick != null) return _cursorClick!!
        _cursorClick = phosphorThinIcon(
            name = "CursorClick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M92 24v-8c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v8c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4ZM16 100h8c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-8c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4ZM126.21 35.58c.949 .475 2.049 .554 3.056 .218 1.007-.336 1.84-1.058 2.314-2.008l8-16c.989-1.977 .187-4.381-1.79-5.37-1.977-.989-4.381-.187-5.37 1.79l-8 16c-.475 .949-.554 2.049-.218 3.056 .336 1.007 1.058 1.84 2.008 2.314ZM30.21 124.42l-16 8c-1.977 .989-2.779 3.393-1.79 5.37 .989 1.977 3.393 2.779 5.37 1.79l16-8c1.977-.989 2.779-3.393 1.79-5.37-.989-1.977-3.393-2.779-5.37-1.79ZM216.49 186.83c2.259 2.252 3.529 5.31 3.529 8.5 0 3.19-1.27 6.248-3.529 8.5l-12.69 12.66c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529L135.49 165.18c-.929-.952-2.276-1.37-3.58-1.11-1.274 .243-2.352 1.089-2.89 2.27l-17.78 46.31c-.017 .056-.041 .109-.07 .16-1.867 4.366-6.161 7.196-10.91 7.19h-.59c-4.968-.213-9.277-3.497-10.8-8.23L36.6 51.68c-1.365-4.277-.228-8.959 2.947-12.133 3.175-3.175 7.856-4.312 12.133-2.947L211.76 88.87c4.683 1.58 7.918 5.87 8.15 10.806 .232 4.937-2.586 9.511-7.1 11.524l-.16 .07-46.31 17.78c-1.194 .544-2.045 1.638-2.279 2.929-.233 1.291 .181 2.614 1.109 3.541ZM210.83 192.49 159.52 141.17c-2.808-2.808-4.045-6.822-3.304-10.723 .741-3.901 3.363-7.183 7.004-8.767l.16-.06 46.31-17.79c1.482-.676 2.396-2.193 2.303-3.819-.093-1.626-1.174-3.028-2.723-3.531L49.2 44.21c-1.416-.436-2.958-.053-4.006 .994-1.048 1.048-1.431 2.589-.994 4.006L96.48 209.27c.539 1.516 1.934 2.561 3.541 2.652 1.606 .092 3.111-.788 3.819-2.232l17.78-46.31c.019-.055 .042-.109 .07-.16 1.583-3.638 4.862-6.258 8.76-7 .739-.139 1.488-.209 2.24-.21 3.185 0 6.239 1.266 8.49 3.52l51.31 51.31c1.561 1.558 4.089 1.558 5.65 0l12.69-12.69c.751-.75 1.173-1.768 1.173-2.83 0-1.062-.422-2.08-1.173-2.83Z"),
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
        return _cursorClick!!
    }

private var _cursorClick: ImageVector? = null
