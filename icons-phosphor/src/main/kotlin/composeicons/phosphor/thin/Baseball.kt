package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Baseball: ImageVector
    get() {
        if (_baseball != null) return _baseball!!
        _baseball = phosphorThinIcon(
            name = "Baseball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM195.31 190.64c-1.55-1.66-3.05-3.38-4.46-5.14-1.403-1.643-3.857-1.875-5.543-.524-1.686 1.351-1.995 3.797-.697 5.524 1.58 2 3.26 3.9 5 5.76-34.976 31.651-88.244 31.651-123.22 0 1.74-1.86 3.42-3.78 5-5.76 1.298-1.727 .989-4.173-.697-5.524-1.686-1.351-4.14-1.119-5.543 .524-1.41 1.76-2.91 3.48-4.46 5.14C27.772 155.367 27.772 100.633 60.69 65.36c1.55 1.66 3.05 3.38 4.46 5.14 1.403 1.643 3.857 1.875 5.543 .524 1.686-1.351 1.995-3.797 .697-5.524-1.58-2-3.26-3.9-5-5.76 34.976-31.651 88.244-31.651 123.22 0-1.74 1.86-3.42 3.78-5 5.76-.947 1.109-1.216 2.647-.7 4.011 .516 1.365 1.733 2.34 3.178 2.546 1.444 .206 2.886-.391 3.762-1.557 1.41-1.76 2.91-3.48 4.46-5.14 32.918 35.273 32.918 90.007 0 125.28ZM91.94 144.64c-.944 5.671-2.383 11.249-4.3 16.67-.558 1.61-2.076 2.69-3.78 2.69-.453 .002-.904-.076-1.33-.23-2.081-.736-3.173-3.018-2.44-5.1 1.771-4.986 3.11-10.115 4-15.33 .458-2.081 2.466-3.438 4.567-3.086 2.101 .352 3.558 2.289 3.313 4.406ZM91.94 111.32c.362 2.175-1.106 4.233-3.28 4.6-.217 .046-.438 .073-.66 .08-1.952-.003-3.618-1.414-3.94-3.34-.89-5.215-2.229-10.344-4-15.33-.735-2.085 .36-4.37 2.445-5.105 2.085-.735 4.37 .36 5.105 2.445 1.927 5.42 3.376 10.998 4.33 16.67ZM175.94 158.65c.733 2.082-.359 4.364-2.44 5.1-.426 .154-.877 .232-1.33 .23-1.699 .003-3.215-1.067-3.78-2.67-1.917-5.421-3.356-10.999-4.3-16.67-.245-2.116 1.211-4.054 3.313-4.406 2.101-.352 4.11 1.005 4.567 3.086 .87 5.22 2.188 10.356 3.94 15.35ZM175.94 97.31c-1.771 4.986-3.11 10.115-4 15.33-.313 1.934-1.981 3.356-3.94 3.36-.221-0-.442-.02-.66-.06-2.174-.367-3.642-2.425-3.28-4.6 .944-5.671 2.383-11.249 4.3-16.67 .735-2.085 3.02-3.18 5.105-2.445 2.085 .735 3.18 3.02 2.445 5.105Z"),
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
        return _baseball!!
    }

private var _baseball: ImageVector? = null
