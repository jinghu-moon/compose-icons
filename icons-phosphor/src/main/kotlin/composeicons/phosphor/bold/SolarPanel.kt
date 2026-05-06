package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SolarPanel: ImageVector
    get() {
        if (_solarPanel != null) return _solarPanel!!
        _solarPanel = phosphorBoldIcon(
            name = "SolarPanel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M32 100C32 93.373 37.373 88 44 88h8c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-8c-6.627 0-12-5.373-12-12ZM128 36c6.627 0 12-5.373 12-12v-8C140 9.373 134.627 4 128 4c-6.627 0-12 5.373-12 12v8c0 6.627 5.373 12 12 12ZM65.77 54.74c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17L77.11 32.09c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17ZM181.77 58.26c3.185-0 6.239-1.266 8.49-3.52l5.65-5.65c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0l-5.66 5.65c-3.436 3.432-4.464 8.597-2.605 13.083 1.859 4.487 6.239 7.41 11.095 7.407ZM192 100c0 6.627 5.373 12 12 12h8c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-8c-6.627 0-12 5.373-12 12ZM88 112c6.627 0 12-5.373 12-12 0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12C180 71.281 156.719 48 128 48 99.281 48 76 71.281 76 100c0 6.627 5.373 12 12 12ZM242.36 222.05c-2.15 3.684-6.095 5.949-10.36 5.95h-208c-4.267 0-8.213-2.265-10.364-5.95-2.151-3.685-2.184-8.235-.086-11.95l43-76C58.678 130.331 62.671 128 67 128h122c4.329-0 8.322 2.331 10.45 6.1l43 76c2.097 3.716 2.062 8.266-.09 11.95ZM182 152h-42v12h48.82ZM74 152l-6.78 12h48.78v-12ZM44.57 204h71.43v-16h-62.39ZM211.43 204l-9-16h-62.43v16Z"),
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
        return _solarPanel!!
    }

private var _solarPanel: ImageVector? = null
