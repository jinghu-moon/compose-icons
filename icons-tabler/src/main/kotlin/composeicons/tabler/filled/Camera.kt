package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Camera: ImageVector
    get() {
        if (_camera != null) return _camera!!
        _camera = tablerFilledIcon(
            name = "Camera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 3c1.047-0 1.917 .806 1.995 1.85L17 5c0 .507 .38 .934 .883 .993L18 6h1c1.589-0 2.902 1.238 2.995 2.824L22 9v9c0 1.589-1.238 2.902-2.824 2.995L19 21h-14C3.411 21 2.098 19.762 2.005 18.176L2 18v-9C2 7.411 3.238 6.098 4.824 6.005L5 6h1C6.552 6 7 5.552 7 5 7 3.953 7.806 3.083 8.85 3.005L9 3h6ZM12 10C10.46 10 9.17 11.166 9.015 12.698l-.011 .152L9 13l.004 .15c.082 1.635 1.46 2.903 3.096 2.848 1.636-.055 2.927-1.411 2.899-3.049C14.972 11.313 13.637 10 12 10Z"),
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
        return _camera!!
    }

private var _camera: ImageVector? = null
