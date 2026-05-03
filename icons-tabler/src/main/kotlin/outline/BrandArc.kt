package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandArc: ImageVector
    get() {
        if (_brandArc != null) return _brandArc!!
        _brandArc = tablerOutlineIcon(
            name = "BrandArc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.687 14.694 L 3.700 16.797 C 3.198 17.867 3.575 19.184 4.608 19.742 C 5.704 20.332 7.052 19.872 7.580 18.747 L 8.480 16.827"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 18.317 14.576 C 20.135 12.976 21.477 10.796 21.957 8.359 C 22.192 7.165 21.432 6.008 20.262 5.773 C 19.699 5.659 19.113 5.776 18.637 6.099 C 18.159 6.422 17.827 6.925 17.715 7.497 C 17.507 8.551 17.020 9.534 16.349 10.369"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 12.680 12.759 C 12.260 12.863 11.829 12.915 11.397 12.916 C 11.061 12.916 10.714 12.876 10.367 12.801 C 8.927 12.491 7.477 11.586 6.658 10.486 C 6.458 10.225 6.295 9.938 6.171 9.633 C 5.961 9.096 5.545 8.666 5.015 8.438 C 4.486 8.210 3.887 8.204 3.353 8.420 C 2.246 8.875 1.712 10.156 2.157 11.280 C 2.665 12.558 3.561 13.730 4.687 14.695 C 5.799 15.647 7.087 16.372 8.478 16.828 C 9.431 17.138 10.420 17.311 11.394 17.311 C 12.470 17.307 13.539 17.125 14.556 16.774"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 10.370 12.801 L 11.313 10.788 C 11.403 10.598 11.670 10.598 11.759 10.788 L 12.682 12.758 L 12.688 12.758 L 12.682 12.758 L 14.562 16.773 L 15.485 18.744 C 15.838 19.507 16.601 19.997 17.442 19.998 Q 17.732 19.998 18.018 19.917 C 19.321 19.552 19.938 18.030 19.357 16.788 L 18.317 14.570 L 16.349 10.366 L 16.346 10.369 L 16.349 10.366 L 13.487 4.254 C 13.135 3.492 12.373 3.003 11.533 3.000 C 10.700 3.000 9.940 3.488 9.580 4.254 L 6.660 10.486"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _brandArc!!
    }

private var _brandArc: ImageVector? = null
