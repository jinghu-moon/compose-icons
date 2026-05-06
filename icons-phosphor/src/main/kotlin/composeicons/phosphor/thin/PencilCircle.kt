package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PencilCircle: ImageVector
    get() {
        if (_pencilCircle != null) return _pencilCircle!!
        _pencilCircle = phosphorThinIcon(
            name = "PencilCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M198.71 57.29C173.485 31.843 136.573 21.837 101.949 31.06 67.326 40.283 40.283 67.326 31.06 101.949c-9.223 34.623 .783 71.535 26.23 96.761 25.225 25.447 62.137 35.453 96.761 26.23 34.623-9.223 61.666-36.266 70.889-70.889 9.223-34.623-.783-71.535-26.23-96.761ZM104.71 132h46.58l17.28 37.45c-6.348-4.66-14.364-6.431-22.084-4.88-7.72 1.551-14.43 6.281-18.486 13.03-4.056-6.75-10.766-11.48-18.486-13.03-7.72-1.551-15.736 .221-22.084 4.88ZM108.41 124 128 81.55 147.59 124ZM132 192c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20v16.83c-12.307 6.711-25.994 10.499-40 11.07ZM84 192c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20v27.9c-14.006-.571-27.693-4.359-40-11.07ZM193.05 193.05c-4.008 4.009-8.376 7.641-13.05 10.85v-27.9c-.002-.58-.128-1.153-.37-1.68l-48-104c-.655-1.414-2.071-2.32-3.63-2.32-1.559 0-2.975 .905-3.63 2.32l-48 104c-.242 .527-.368 1.1-.37 1.68v27.9c-4.656-3.211-9.008-6.843-13-10.85C36.686 166.739 28.813 127.167 43.052 92.788 57.291 58.409 90.838 35.992 128.05 35.992c37.212 0 70.759 22.416 84.998 56.796 14.239 34.379 6.366 73.951-19.948 100.262Z"),
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
        return _pencilCircle!!
    }

private var _pencilCircle: ImageVector? = null
