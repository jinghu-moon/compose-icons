package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SchoolBell: ImageVector
    get() {
        if (_schoolBell != null) return _schoolBell!!
        _schoolBell = tablerOutlineIcon(
            name = "SchoolBell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 17.000 C 4.000 18.657 5.343 20.000 7.000 20.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 14.805 6.370 L 17.588 3.586 C 18.369 2.805 19.635 2.805 20.417 3.586 C 21.198 4.366 21.198 5.633 20.417 6.414 L 17.633 9.200"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 16.505 7.495 C 18.429 9.419 18.506 12.513 16.681 14.530 L 16.505 14.714 L 14.638 16.581 C 14.040 17.178 13.680 17.972 13.625 18.815 L 13.617 19.045 L 13.617 19.979 C 13.617 20.306 13.487 20.619 13.257 20.850 C 13.083 21.025 12.808 21.051 12.605 20.910 L 12.535 20.850 L 3.150 11.466 C 3.054 11.370 3.000 11.240 3.000 11.105 C 3.000 10.970 3.054 10.840 3.150 10.744 C 3.348 10.546 3.606 10.422 3.882 10.391 L 4.021 10.383 L 4.954 10.383 C 5.802 10.383 6.617 10.074 7.251 9.519 L 7.419 9.362 L 9.286 7.495 L 9.446 7.342 C 11.461 5.495 14.572 5.563 16.505 7.495"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _schoolBell!!
    }

private var _schoolBell: ImageVector? = null
