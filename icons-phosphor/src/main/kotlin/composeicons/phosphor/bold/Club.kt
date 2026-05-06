package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Club: ImageVector
    get() {
        if (_club != null) return _club!!
        _club = phosphorBoldIcon(
            name = "Club",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M186.79 84.06C191.653 60.213 181.629 35.79 161.414 22.236 141.2 8.683 114.8 8.683 94.586 22.236 74.371 35.79 64.347 60.213 69.21 84.06 46.198 85.174 25.856 99.367 16.867 120.581c-8.989 21.213-5.037 45.7 10.169 63.009 15.206 17.309 38.979 24.382 61.174 18.201l-4 19.86c-.705 3.529 .211 7.188 2.496 9.968 2.284 2.78 5.696 4.389 9.294 4.382h64c3.595 .001 7.001-1.61 9.281-4.39 2.28-2.78 3.193-6.435 2.489-9.96l-4-19.86c22.194 6.181 45.968-.892 61.174-18.201 15.206-17.309 19.158-41.795 10.169-63.009C230.124 99.367 209.782 85.174 186.77 84.06ZM184 180c-9.223 .014-18.097-3.524-24.78-9.88-3.797-3.576-9.47-4.29-14.034-1.766-4.565 2.524-6.976 7.708-5.966 12.826L145.36 212h-34.72l6.16-30.82c1.01-5.117-1.401-10.301-5.966-12.826-4.565-2.524-10.237-1.811-14.034 1.766-12.855 12.204-32.68 13.236-46.732 2.431C36.017 161.746 31.922 142.321 40.415 126.763c8.493-15.558 27.048-22.619 43.735-16.643 4.882 1.749 10.335 .164 13.519-3.93 3.184-4.093 3.378-9.769 .481-14.07C94.124 86.184 91.981 79.172 92 72c0-15.434 9.839-29.151 24.459-34.099 14.62-4.948 30.767-.027 40.141 12.235 9.374 12.261 9.889 29.134 1.281 41.944-2.897 4.301-2.702 9.977 .481 14.07 3.184 4.093 8.637 5.679 13.519 3.93 13.502-4.8 28.566-1.135 38.354 9.331 9.788 10.467 12.436 25.742 6.742 38.893C211.282 171.455 198.33 179.976 184 180Z"),
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
