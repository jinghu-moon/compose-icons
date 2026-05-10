package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GearSix: ImageVector
    get() {
        if (_gearSix != null) return _gearSix!!
        _gearSix = phosphorFillIcon(
            name = "GearSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M237.94 107.21c-.451-2.28-1.871-4.25-3.89-5.4l-29.83-17-.12-33.62c-.007-2.343-1.042-4.566-2.83-6.08C190.449 35.957 177.988 28.943 164.55 24.44c-2.14-.724-4.487-.51-6.46 .59L128 41.85 97.88 25c-1.975-1.106-4.326-1.324-6.47-.6C77.98 28.932 65.532 35.973 54.73 45.15c-1.786 1.512-2.82 3.73-2.83 6.07l-.15 33.65-29.83 17c-2.019 1.15-3.439 3.12-3.89 5.4-2.73 13.719-2.73 27.841 0 41.56 .451 2.28 1.871 4.25 3.89 5.4l29.83 17 .12 33.63c.007 2.343 1.042 4.566 2.83 6.08 10.821 9.153 23.282 16.167 36.72 20.67 2.14 .724 4.487 .51 6.46-.59L128 214.15 158.12 231c1.192 .664 2.536 1.009 3.9 1 .874-0 1.742-.142 2.57-.42 13.427-4.53 25.873-11.564 36.68-20.73 1.786-1.512 2.82-3.73 2.83-6.07l.15-33.65 29.83-17c2.019-1.15 3.439-3.12 3.89-5.4 2.715-13.708 2.705-27.816-.03-41.52ZM128 168C105.909 168 88 150.091 88 128c0-22.091 17.909-40 40-40 22.091 0 40 17.909 40 40 0 22.091-17.909 40-40 40Z"),
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
        return _gearSix!!
    }

private var _gearSix: ImageVector? = null
