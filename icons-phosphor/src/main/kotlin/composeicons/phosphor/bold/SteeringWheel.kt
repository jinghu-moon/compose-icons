package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SteeringWheel: ImageVector
    get() {
        if (_steeringWheel != null) return _steeringWheel!!
        _steeringWheel = phosphorBoldIcon(
            name = "SteeringWheel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 144c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM236 128c0 59.647-48.353 108-108 108C68.353 236 20 187.647 20 128 20 68.353 68.353 20 128 20c59.619 .066 107.934 48.381 108 108ZM165.55 156h41.63c.79-2.21 1.49-4.47 2.09-6.76-45.123-44.304-117.417-44.304-162.54 0q.9 3.44 2.09 6.76h41.63c8.338 .022 15.793 5.197 18.73 13l16.06 42.93c.92 0 1.83 .07 2.76 .07 .93 0 1.82 0 2.72-.07l16.1-43c2.965-7.772 10.412-12.913 18.73-12.93ZM44.41 119.73c49.594-36.974 117.586-36.974 167.18 0C207.329 76.759 171.182 44.019 128 44.019c-43.182 0-79.329 32.74-83.59 75.711ZM97.49 206.24 87.68 180h-25.58c9.268 11.724 21.48 20.778 35.39 26.24ZM193.9 180h-25.58l-9.84 26.25c13.925-5.455 26.149-14.515 35.42-26.25Z"),
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
        return _steeringWheel!!
    }

private var _steeringWheel: ImageVector? = null
