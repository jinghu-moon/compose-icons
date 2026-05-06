package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Club: ImageVector
    get() {
        if (_club != null) return _club!!
        _club = phosphorThinIcon(
            name = "Club",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 92c-2.766 0-5.528 .218-8.26 .65 9.406-21.784 2.872-47.172-15.88-61.71-18.752-14.538-44.968-14.538-63.72 0C77.388 45.478 70.854 70.866 80.26 92.65 77.528 92.218 74.766 92 72 92c-22.647 .009-42.683 14.674-49.539 36.258-6.856 21.584 1.046 45.123 19.537 58.199 18.491 13.076 43.318 12.68 61.383-.977L92.17 222.85c-.363 1.211-.133 2.522 .621 3.537 .754 1.015 1.944 1.613 3.209 1.613h64c1.264-0 2.454-.598 3.209-1.613 .755-1.015 .985-2.326 .621-3.537L152.62 185.48c18.065 13.657 42.892 14.053 61.383 .977 18.491-13.076 26.392-36.615 19.537-58.199C226.684 106.674 206.647 92.009 184 92ZM184 188c-14.791 .015-28.597-7.416-36.73-19.77-1.092-1.662-3.239-2.269-5.04-1.425-1.801 .844-2.708 2.883-2.13 4.785L154.62 220h-53.24l14.52-48.41c.578-1.903-.329-3.942-2.13-4.785-1.801-.844-3.948-.237-5.04 1.425C96.095 187.373 70.874 193.598 50.783 182.534 30.691 171.469 22.469 146.827 31.893 125.915 41.316 105.004 65.222 94.839 86.82 102.56c1.626 .578 3.44 .048 4.499-1.315 1.059-1.363 1.124-3.252 .161-4.685C79.128 78.211 82.317 53.544 98.931 38.941c16.613-14.603 41.485-14.603 58.099 0 16.613 14.603 19.803 39.27 7.451 57.619-.963 1.433-.898 3.321 .161 4.685 1.059 1.363 2.873 1.894 4.499 1.315 16.502-5.889 34.926-1.426 46.904 11.362 11.978 12.789 15.226 31.465 8.269 47.546C217.357 177.55 201.522 187.972 184 188Z"),
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
