package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Store2Fill: ImageVector
    get() {
        if (_store2Fill != null) return _store2Fill!!
        _store2Fill = remixIcon(
            name = "Store2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 20v2h-20v-2h1v-6.758C1.794 12.435 1 11.06 1 9.5 1 8.673 1.224 7.876 1.633 7.197L4.345 2.5C4.524 2.191 4.854 2 5.211 2h13.577c.357 0 .687 .191 .866 .5l2.703 4.682c.418 .694 .642 1.491 .642 2.318 0 1.56-.794 2.935-2 3.742v6.758h1ZM5.789 4 3.356 8.213C3.124 8.598 3 9.039 3 9.5 3 10.881 4.119 12 5.5 12c1.031 0 1.945-.63 2.322-1.571 .336-.837 1.521-.837 1.856 0C10.055 11.37 10.969 12 12 12c1.031 0 1.945-.63 2.322-1.571 .336-.837 1.521-.837 1.856 0 .377 .941 1.291 1.571 2.322 1.571C19.881 12 21 10.881 21 9.5c0-.461-.124-.902-.365-1.303L18.211 4h-12.423Z"),
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
        return _store2Fill!!
    }

private var _store2Fill: ImageVector? = null
