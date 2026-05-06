package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Cursor: ImageVector
    get() {
        if (_cursor != null) return _cursor!!
        _cursor = phosphorThinIcon(
            name = "Cursor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M165.17 135.51c-.924-.927-1.335-2.248-1.102-3.535 .233-1.288 1.082-2.38 2.272-2.924l46.31-17.79 .16-.06c4.514-2.013 7.332-6.587 7.1-11.524-.232-4.937-3.467-9.226-8.15-10.806L51.67 36.6c-4.274-1.358-8.948-.219-12.119 2.951-3.171 3.171-4.309 7.845-2.951 12.119L88.87 211.76c1.515 4.741 5.828 8.031 10.8 8.24h.58c4.781 .039 9.118-2.795 11-7.19l.06-.16 17.79-46.31c.544-1.194 1.638-2.045 2.929-2.279 1.291-.233 2.614 .181 3.541 1.109l51.31 51.32c2.252 2.259 5.31 3.529 8.5 3.529 3.19 0 6.248-1.27 8.5-3.529l12.69-12.69c2.259-2.252 3.529-5.31 3.529-8.5 0-3.19-1.27-6.248-3.529-8.5ZM210.83 198.14l-12.69 12.69c-.75 .751-1.768 1.173-2.83 1.173-1.062 0-2.08-.422-2.83-1.173L141.17 159.52c-2.248-2.251-5.298-3.517-8.48-3.52-.752 0-1.501 .071-2.24 .21-3.901 .739-7.185 3.359-8.77 7l-.06 .16-17.79 46.31c-.708 1.445-2.213 2.324-3.819 2.232-1.606-.092-3.001-1.137-3.541-2.652L44.2 49.19c-.436-1.416-.053-2.958 .994-4.006 1.048-1.048 2.589-1.431 4.006-.994L209.27 96.47c1.516 .539 2.561 1.934 2.652 3.541 .092 1.606-.788 3.111-2.232 3.819l-46.31 17.78-.16 .07c-3.643 1.581-6.267 4.862-7.01 8.764-.743 3.901 .493 7.917 3.3 10.726l51.32 51.31c.751 .75 1.173 1.768 1.173 2.83 0 1.062-.422 2.08-1.173 2.83Z"),
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
        return _cursor!!
    }

private var _cursor: ImageVector? = null
