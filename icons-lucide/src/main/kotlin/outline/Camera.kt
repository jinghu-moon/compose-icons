package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Camera: ImageVector
    get() {
        if (_camera != null) return _camera!!
        _camera = lucideOutlineIcon(
            name = "Camera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.997 4.000 C 14.732 4.000 15.408 4.403 15.757 5.050 L 16.243 5.950 C 16.592 6.597 17.268 7.000 18.003 7.000 L 20.000 7.000 C 21.105 7.000 22.000 7.895 22.000 9.000 L 22.000 18.000 C 22.000 19.105 21.105 20.000 20.000 20.000 L 4.000 20.000 C 2.895 20.000 2.000 19.105 2.000 18.000 L 2.000 9.000 C 2.000 7.895 2.895 7.000 4.000 7.000 L 5.997 7.000 C 6.731 7.000 7.406 6.598 7.756 5.952 L 8.245 5.048 C 8.595 4.402 9.270 4.000 10.004 4.000 Z"),
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
                pathData = parseSvgPathData("M 15.000 13.000 C 15.000 14.657 13.657 16.000 12.000 16.000 C 10.343 16.000 9.000 14.657 9.000 13.000 C 9.000 11.343 10.343 10.000 12.000 10.000 C 13.657 10.000 15.000 11.343 15.000 13.000 Z"),
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
        return _camera!!
    }

private var _camera: ImageVector? = null
