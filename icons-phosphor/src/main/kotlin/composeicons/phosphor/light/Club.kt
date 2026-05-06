package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Club: ImageVector
    get() {
        if (_club != null) return _club!!
        _club = phosphorLightIcon(
            name = "Club",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 90q-2.59 0-5.16 .24c8.011-22.395 .426-47.394-18.679-61.562-19.104-14.168-45.229-14.168-64.333 0C76.724 42.846 69.139 67.845 77.15 90.24 75.45 90.08 73.73 90 72 90c-22.815 .011-43.162 14.36-50.831 35.847-7.67 21.487-1.007 45.476 16.644 59.932 17.652 14.455 42.483 16.257 62.037 4.501l-9.6 32c-.544 1.817-.196 3.783 .936 5.304 1.133 1.521 2.918 2.417 4.814 2.416h64c1.896 .001 3.681-.895 4.814-2.416 1.133-1.521 1.48-3.487 .936-5.304l-9.6-32c19.553 11.756 44.385 9.954 62.037-4.501 17.652-14.455 24.314-38.444 16.644-59.932C227.162 104.36 206.815 90.011 184 90ZM184 186c-14.119 .015-27.297-7.077-35.06-18.87-1.639-2.473-4.839-3.378-7.53-2.127-2.691 1.25-4.064 4.28-3.23 7.127L151.94 218h-47.88l13.76-45.84c.834-2.848-.539-5.877-3.23-7.127-2.691-1.25-5.891-.346-7.53 2.127C94.997 185.43 70.923 191.37 51.746 180.806 32.57 170.243 24.724 146.721 33.72 126.761 42.715 106.801 65.535 97.099 86.15 104.47c2.441 .874 5.167 .082 6.759-1.965 1.592-2.047 1.689-4.884 .241-7.035C81.378 77.953 84.434 54.421 100.29 40.491c15.855-13.929 39.585-13.929 55.441 0 15.855 13.929 18.911 37.462 7.14 54.979-1.448 2.151-1.351 4.988 .241 7.035 1.592 2.047 4.318 2.839 6.759 1.965 15.765-5.659 33.386-1.41 44.839 10.813 11.453 12.223 14.548 30.082 7.876 45.447C215.913 176.093 200.75 186.024 184 186Z"),
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
        return _club!!
    }

private var _club: ImageVector? = null
