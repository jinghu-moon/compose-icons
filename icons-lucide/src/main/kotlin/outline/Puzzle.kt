package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Puzzle: ImageVector
    get() {
        if (_puzzle != null) return _puzzle!!
        _puzzle = lucideOutlineIcon(
            name = "Puzzle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.390 4.390 C 15.646 4.646 16.020 4.744 16.369 4.646 C 16.718 4.547 16.986 4.268 17.070 3.916 C 17.357 2.720 18.471 1.911 19.697 2.008 C 20.923 2.104 21.897 3.078 21.993 4.304 C 22.089 5.530 21.280 6.644 20.084 6.931 C 19.732 7.015 19.453 7.283 19.354 7.632 C 19.256 7.981 19.354 8.355 19.610 8.611 L 21.293 10.293 C 21.746 10.746 22.000 11.360 22.000 12.000 C 22.000 12.640 21.746 13.254 21.293 13.707 L 19.610 15.390 C 19.354 15.646 18.980 15.744 18.631 15.646 C 18.282 15.547 18.014 15.268 17.930 14.916 C 17.643 13.720 16.529 12.911 15.303 13.008 C 14.077 13.104 13.103 14.078 13.007 15.304 C 12.911 16.530 13.720 17.644 14.916 17.931 C 15.268 18.015 15.547 18.283 15.646 18.632 C 15.744 18.981 15.646 19.355 15.390 19.611 L 13.707 21.293 C 13.254 21.746 12.640 22.000 12.000 22.000 C 11.360 22.000 10.746 21.746 10.293 21.293 L 8.610 19.610 C 8.354 19.354 7.980 19.256 7.631 19.354 C 7.282 19.453 7.014 19.732 6.930 20.084 C 6.643 21.280 5.529 22.089 4.303 21.992 C 3.077 21.896 2.103 20.922 2.007 19.696 C 1.911 18.470 2.720 17.356 3.916 17.069 C 4.268 16.985 4.547 16.717 4.646 16.368 C 4.744 16.019 4.646 15.645 4.390 15.389 L 2.707 13.707 C 2.254 13.254 2.000 12.640 2.000 12.000 C 2.000 11.360 2.254 10.746 2.707 10.293 L 4.390 8.610 C 4.646 8.354 5.020 8.256 5.369 8.354 C 5.718 8.453 5.986 8.732 6.070 9.084 C 6.357 10.280 7.471 11.089 8.697 10.992 C 9.923 10.896 10.897 9.922 10.993 8.696 C 11.089 7.470 10.280 6.356 9.084 6.069 C 8.732 5.985 8.453 5.717 8.354 5.368 C 8.256 5.019 8.354 4.645 8.610 4.389 L 10.293 2.707 C 10.746 2.254 11.360 2.000 12.000 2.000 C 12.640 2.000 13.254 2.254 13.707 2.707 Z"),
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
        return _puzzle!!
    }

private var _puzzle: ImageVector? = null
